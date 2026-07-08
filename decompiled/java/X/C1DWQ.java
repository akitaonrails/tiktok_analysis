package X;

import com.ss.android.vesdk.VEWatermarkParam;

/* JADX INFO: renamed from: X.1DWQ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DWQ {
    public final String LIZ;
    public volatile boolean LIZIZ;
    public C1DWS LIZJ;
    public C1463670oBx LIZLLL;

    public C1DWQ(String str) {
        this.LIZ = str;
    }

    public static final void LIZIZ(C1DWS c1dws) {
        String str;
        String str2;
        String[] strArr;
        String[] strArr2;
        VEWatermarkParam vEWatermarkParam = c1dws.LIZJ;
        if (vEWatermarkParam != null && (strArr2 = vEWatermarkParam.images) != null && strArr2.length != 0) {
            for (String str3 : strArr2) {
                C2354709Kn.LJIJJLI(str3);
            }
        }
        VEWatermarkParam vEWatermarkParam2 = c1dws.LIZJ;
        if (vEWatermarkParam2 != null && (strArr = vEWatermarkParam2.secondHalfImages) != null && strArr.length != 0) {
            for (String str4 : strArr) {
                C2354709Kn.LJIJJLI(str4);
            }
        }
        C1DWV c1dwv = c1dws.LJ;
        if (c1dwv != null && (str2 = c1dwv.LIZIZ) != null) {
            C2354709Kn.LJIJJLI(str2);
        }
        C1DWV c1dwv2 = c1dws.LJ;
        if (c1dwv2 != null && (str = c1dwv2.LIZJ) != null) {
            C2354709Kn.LJIJJLI(str);
        }
    }

    public final void LIZ(C1DWS c1dws) {
        this.LIZIZ = false;
        C1463670oBx c1463670oBx = this.LIZLLL;
        if (c1463670oBx != null) {
            c1463670oBx.destroy();
        }
        this.LIZLLL = null;
        LIZIZ(c1dws);
    }
}
