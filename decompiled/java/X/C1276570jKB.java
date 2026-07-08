package X;

import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jKB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276570jKB extends AbstractC1276470jK1 {
    public static final String LLIZLLLIL;
    public final String LL;
    public double LLILZ;
    public boolean LLILZIL;
    public C1276160jJW LLIZ;
    public boolean LLILLJJLI = true;
    public final boolean LLILLL = true;
    public int LLILZLL = 1;

    @Override // X.InterfaceC1276590jKD
    public final boolean updateMixAudioVolumeIndication(C1276600jKE c1276600jKE) {
        return false;
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Mixer]");
        sbLIZ.append("DualDeviceRtc");
        LLIZLLLIL = C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1276570jKB(String str) {
        this.LL = str;
    }

    @Override // X.InterfaceC1276590jKD
    public final String mixStream(int i, int i2, List<? extends C1276580jKC> list) throws JSONException {
        boolean z;
        if (list != null && !list.isEmpty()) {
            for (C1276580jKC c1276580jKC : list) {
                boolean zEquals = TextUtils.equals(c1276580jKC.LIZIZ, this.LL);
                if (this.LLILLL && this.LLILZIL) {
                    double d = this.LLILZ;
                    if (d > 0.0d) {
                        if (zEquals) {
                            c1276580jKC.LJIIIIZZ = 0;
                            c1276580jKC.LIZ = 1;
                            c1276580jKC.LJIILJJIL = this.LLILZLL;
                            c1276580jKC.LJ = 0.0d;
                            c1276580jKC.LJFF = 0.0d;
                            c1276580jKC.LJI = 1.0d;
                            c1276580jKC.LJII = d;
                            String str = LLIZLLLIL;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("sink region = ");
                            sbLIZ.append(c1276580jKC);
                            C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                        } else {
                            boolean z2 = !this.LLILLJJLI;
                            c1276580jKC.LJIIIIZZ = 0;
                            c1276580jKC.LIZ = 1;
                            c1276580jKC.LJIIL = z2;
                            c1276580jKC.LJIIJJI = true;
                            c1276580jKC.LJ = 0.0d;
                            c1276580jKC.LJFF = d;
                            c1276580jKC.LJI = 1.0d;
                            c1276580jKC.LJII = 1.0d - d;
                            String str2 = LLIZLLLIL;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("source2 region = ");
                            sbLIZ2.append(c1276580jKC);
                            C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                }
                if (zEquals) {
                    c1276580jKC.LJIIIIZZ = 0;
                    c1276580jKC.LIZ = 1;
                    c1276580jKC.LJIILIIL = 0;
                    c1276580jKC.LJ = 0.0d;
                    c1276580jKC.LJFF = 0.0d;
                    c1276580jKC.LJI = 1.0d;
                    c1276580jKC.LJII = 1.0d;
                    String str3 = LLIZLLLIL;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("sink region = ");
                    sbLIZ3.append(c1276580jKC);
                    C20441214yg.LJIIIZ(str3, C2188811AlT.LIZIZ(sbLIZ3));
                } else {
                    boolean z3 = !this.LLILLJJLI;
                    C0TDU c0tdu = (C0TDU) C0TDF.LIZIZ().LJLZ();
                    JSONObject jSONObject = null;
                    if (c0tdu != null) {
                        if (i > i2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        RectF rectPortNew = c0tdu.getRectPortNew(false, z, i / i2);
                        if (rectPortNew != null) {
                            String str4 = LLIZLLLIL;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("fillRegions left = ");
                            sbLIZ4.append(rectPortNew.left);
                            sbLIZ4.append(",top = ");
                            sbLIZ4.append(rectPortNew.top);
                            sbLIZ4.append(",right = ");
                            sbLIZ4.append(rectPortNew.right);
                            sbLIZ4.append(",bottom = ");
                            sbLIZ4.append(rectPortNew.bottom);
                            C20441214yg.LJIIIZ(str4, C2188811AlT.LIZIZ(sbLIZ4));
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("cornerRadius = ");
                            sbLIZ5.append(0.096d);
                            C20441214yg.LJIIIZ(str4, C2188811AlT.LIZIZ(sbLIZ5));
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("isCameraOff = ");
                            sbLIZ6.append(z3);
                            C20441214yg.LJIIIZ(str4, C2188811AlT.LIZIZ(sbLIZ6));
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append("width = ");
                            sbLIZ7.append(i);
                            sbLIZ7.append(",height = ");
                            sbLIZ7.append(i2);
                            C20441214yg.LJIIIZ(str4, C2188811AlT.LIZIZ(sbLIZ7));
                            if (this.LLIZ == null) {
                                if (!TextUtils.isEmpty("#000000")) {
                                    jSONObject = new JSONObject();
                                    jSONObject.put("effectType", 1);
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("color", "#000000");
                                    jSONObject2.put("thickness", 4);
                                    jSONObject.put("effectParam", jSONObject2);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (jSONObject != null) {
                                    arrayList.add(jSONObject);
                                    this.LLIZ = new C1276160jJW(arrayList);
                                }
                            }
                            c1276580jKC.LJIIIIZZ = 0;
                            c1276580jKC.LIZ = 1;
                            c1276580jKC.LJIIL = z3;
                            c1276580jKC.LJIIJJI = true;
                            float f = rectPortNew.left;
                            float f2 = rectPortNew.top;
                            c1276580jKC.LJ = f;
                            c1276580jKC.LJFF = f2;
                            double d2 = rectPortNew.right - f;
                            double d3 = rectPortNew.bottom - f2;
                            c1276580jKC.LJI = d2;
                            c1276580jKC.LJII = d3;
                            c1276580jKC.LJIILIIL = 1;
                            c1276580jKC.LJIILL = 0.096d;
                            c1276580jKC.LJIJI = this.LLIZ;
                        }
                    }
                    String str5 = LLIZLLLIL;
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("source region = ");
                    sbLIZ8.append(c1276580jKC);
                    C20441214yg.LJIIIZ(str5, C2188811AlT.LIZIZ(sbLIZ8));
                }
            }
        }
        return String.valueOf(new JSONObject());
    }
}
