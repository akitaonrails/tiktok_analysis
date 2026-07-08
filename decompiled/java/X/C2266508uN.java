package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08uN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2266508uN implements InterfaceC2266308uL {
    public final /* synthetic */ C2287508xl LIZ;
    public final /* synthetic */ C2267108uT LIZIZ;
    public final /* synthetic */ C2287408xk LIZJ;

    @Override // X.InterfaceC2266308uL
    public final Object LIZ(InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        C2287508xl c2287508xl = this.LIZ;
        C2267108uT c2267108uT = this.LIZIZ;
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C23250099c.LIZLLL(C2296808zG.LIZ(c23260099m.getContext()), null, null, new C2266108uJ(c2287508xl, this, c23260099m, c2267108uT, null), 3);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public C2266508uN(C2267108uT c2267108uT, C2287508xl c2287508xl, C2287408xk c2287408xk) {
        this.LIZ = c2287508xl;
        this.LIZIZ = c2267108uT;
        this.LIZJ = c2287408xk;
    }

    public final Object LIZIZ(final String str, long j, long j2, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn) {
        int[] iArrInvoke;
        final C2287508xl c2287508xl = this.LIZ;
        final C2287408xk c2287408xk = this.LIZJ;
        final C2267108uT c2267108uT = this.LIZIZ;
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        int i = (int) j;
        int i2 = (int) j2;
        c2287508xl.LIZJ.getClass();
        InterfaceC1631620sYq<Integer, Integer, Integer, int[]> interfaceC1631620sYq = this.LIZ.LIZLLL.LIZ;
        if (interfaceC1631620sYq != null) {
            iArrInvoke = interfaceC1631620sYq.invoke(Integer.valueOf(i), Integer.valueOf(i2), 1);
        } else {
            iArrInvoke = new int[]{i};
        }
        if (iArrInvoke == null) {
            C189200o6.m2constructorimpl(null);
            c23260099m.resumeWith(null);
        } else {
            final List<Integer> listLJJZZIII = C13LQ.LJJZZIII(iArrInvoke);
            final ArrayList arrayList = new ArrayList();
            final C118300cf c118300cf = new C118300cf();
            ArrayList arrayList2 = (ArrayList) listLJJZZIII;
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                LinkedHashMap<String, String> linkedHashMap = c2287408xk.LIZLLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(iIntValue);
                String orDefault = linkedHashMap.getOrDefault(String.valueOf(C2188811AlT.LIZIZ(sbLIZ).hashCode()), null);
                if (orDefault != null) {
                    arrayList.add(orDefault);
                    it2.remove();
                    int i3 = c118300cf.element;
                    c118300cf.element = i3 + 1;
                    C2286608xc.LJ(i3);
                }
            }
            if (arrayList2.isEmpty()) {
                C189200o6.m2constructorimpl(arrayList);
                c23260099m.resumeWith(arrayList);
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC1286300jZs interfaceC1286300jZs = new InterfaceC1286300jZs() { // from class: X.08uO
                @Override // X.InterfaceC1286300jZs
                public final boolean processFrame(ByteBuffer byteBuffer, int i4, int i5, int i6) throws JSONException {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
                    Function1<Bitmap, Bitmap> function1 = c2287508xl.LIZLLL.LIZIZ;
                    if (function1 != null) {
                        bitmapCreateBitmap = function1.invoke(bitmapCreateBitmap);
                    }
                    Bitmap bitmap = bitmapCreateBitmap;
                    boolean z = false;
                    bitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                    String.valueOf(c118300cf.element);
                    c2287508xl.LIZJ.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(i6);
                    arrayList.add(C2267108uT.LIZIZ(bitmap, C2188811AlT.LIZIZ(sbLIZ2), c2267108uT.LIZ(c2287508xl), new C2266808uQ(c2287508xl, c2287408xk, str, i6)).getAbsolutePath());
                    c118300cf.element++;
                    if (((Number) C13LP.LJJLIIIJJI(listLJJZZIII)).intValue() - i6 < 10) {
                        z = true;
                        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                        C0LAB c0lab = new C0LAB();
                        c0lab.LJ("duration", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        C2341909Fp.LIZ("upload_decode_frame_time_cost", c0lab.LIZ);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        C1637890six.LIZJ("upload_decode_frame_time_cost", jSONObject, null);
                        InterfaceC1364105Vn<List<String>> interfaceC1364105Vn2 = c23260099m;
                        List<String> list2 = arrayList;
                        C189200o6.m2constructorimpl(list2);
                        interfaceC1364105Vn2.resumeWith(list2);
                    }
                    return !z;
                }
            };
            if (C2286708xd.LJIILL(str)) {
                Bitmap bitmapLIZ = C2475009mu.LIZ(str, new int[]{c2287508xl.LIZJ.LIZ.getFirst().intValue(), c2287508xl.LIZJ.LIZ.getSecond().intValue()});
                if (bitmapLIZ == null) {
                    C13BV c13bv = C13BV.INSTANCE;
                    C189200o6.m2constructorimpl(c13bv);
                    c23260099m.resumeWith(c13bv);
                } else {
                    List listSingletonList = Collections.singletonList(C2267108uT.LIZIZ(bitmapLIZ, CardStruct.IStatusCode.DEFAULT, c2267108uT.LIZ(c2287508xl), null).getAbsolutePath());
                    C189200o6.m2constructorimpl(listSingletonList);
                    c23260099m.resumeWith(listSingletonList);
                }
            } else {
                int[] iArrLLII = C13LP.LLII(listLJJZZIII);
                int iIntValue2 = c2287508xl.LIZJ.LIZ.getFirst().intValue();
                int iIntValue3 = c2287508xl.LIZJ.LIZ.getSecond().intValue();
                c2287508xl.LIZJ.getClass();
                C2286608xc.LJ(VEUtils.getVideoFrames(str, iArrLLII, iIntValue2, iIntValue3, true, interfaceC1286300jZs));
            }
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
