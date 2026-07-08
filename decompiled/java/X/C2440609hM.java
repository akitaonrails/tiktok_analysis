package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import com.bytedance.fly_main_color.FlyMainColor;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09hM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2440609hM {
    public static final /* synthetic */ int LIZJ = 0;
    public final C11NJ LIZ;
    public final ConcurrentHashMap<String, int[]> LIZIZ = new ConcurrentHashMap<>();

    public C2440609hM(C11NJ c11nj) {
        this.LIZ = c11nj;
    }

    public final void LIZ(List<? extends User> list, final Function2<? super String, ? super Integer, Unit> function2) {
        Integer numLJJI;
        ArrayList<Pair> arrayList = new ArrayList();
        Iterator<? extends User> it2 = list.iterator();
        while (it2.hasNext()) {
            Pair<String, String> pairLIZ = C695160ROo.LIZ(it2.next());
            if (pairLIZ != null) {
                arrayList.add(pairLIZ);
            }
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload: total=");
        sbLIZ.append(list.size());
        sbLIZ.append(", valid=");
        sbLIZ.append(arrayList.size());
        C2188811AlT.LIZIZ(sbLIZ);
        for (Pair pair : arrayList) {
            final String str = (String) pair.getFirst();
            final String str2 = (String) pair.getSecond();
            if (this.LIZIZ.containsKey(str)) {
                int[] iArr = this.LIZIZ.get(str);
                if (iArr != null && (numLJJI = C13LQ.LJJI(iArr)) != null) {
                    int iIntValue = numLJJI.intValue();
                    if (function2 != null) {
                        function2.invoke(str, Integer.valueOf(iIntValue));
                    }
                }
            } else {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LIZLLL("FollowEmptyCardColorMgr");
                final InterfaceC469401sC interfaceC469401sCLJJIIJZLJL = c1331670kl3LJIIIZ.LJJIIJZLJL(new InterfaceC1331910klR() { // from class: X.09h3
                    @Override // X.InterfaceC1331910klR
                    public final void onProgress(float f) {
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onCanceled() {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("image load canceled, tag=");
                        sbLIZ2.append(str2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) {
                        int iIntValue2;
                        if (bitmap != null && bitmap.getWidth() >= 1 && bitmap.getHeight() >= 1) {
                            int i2 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("image load complete, tag=");
                            sbLIZ2.append(str2);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            this.getClass();
                            double width = bitmap.getWidth();
                            double height = bitmap.getHeight();
                            Integer numLIZIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, new Rect((int) (width * 0.1d), (int) (height * 0.1d), (int) (width * 0.9d), (int) (height * 0.9d)))).LIZIZ();
                            if (numLIZIZ != null) {
                                iIntValue2 = numLIZIZ.intValue();
                            } else {
                                iIntValue2 = -16777216;
                            }
                            float[] fArr = new float[3];
                            Color.colorToHSV(iIntValue2, fArr);
                            if (fArr[1] > 0.1d) {
                                fArr[1] = 1.0f;
                            }
                            fArr[2] = 0.9f;
                            Integer numValueOf = Integer.valueOf(Color.HSVToColor(fArr));
                            if (numValueOf != null) {
                                C2440609hM c2440609hM = this;
                                String str3 = str;
                                Function2<String, Integer, Unit> function22 = function2;
                                int iIntValue3 = numValueOf.intValue();
                                c2440609hM.LIZIZ.put(str3, new int[]{iIntValue3, iIntValue3});
                                if (function22 != null) {
                                    function22.invoke(str3, Integer.valueOf(iIntValue3));
                                }
                            }
                        }
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("image load failed, tag=");
                        sbLIZ2.append(str2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                });
                this.LIZ.LIZ(new InterfaceC420801kM() { // from class: X.09hN
                    public final AtomicBoolean LL = new AtomicBoolean(false);

                    @Override // X.InterfaceC420801kM
                    public final void dispose() {
                        interfaceC469401sCLJJIIJZLJL.cancel();
                        this.LL.set(true);
                    }

                    @Override // X.InterfaceC420801kM
                    public final boolean isDisposed() {
                        return this.LL.get();
                    }
                });
            }
        }
    }
}
