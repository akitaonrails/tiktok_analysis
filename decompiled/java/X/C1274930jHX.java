package X;

import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jHX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1274930jHX {
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJ;
    public float LJFF;
    public float LJI;
    public EnumC1275320jIA LJII;
    public EnumC1275350jID LJIIIIZZ;
    public Boolean LJIIIZ;
    public int LJIIJ;
    public EnumC1275270jI5 LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public EnumC1275260jI4 LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public long LJIIZILJ;
    public int LJIJ;
    public String LJIJI;
    public String LJIJJLI;
    public String LJIJJ = "";
    public EnumC1276620jKG LJIL = EnumC1276620jKG.APPDATA_SEI_ASYN_MODE;

    public final int LIZ() {
        int i = C1275240jI2.LIZIZ[this.LJIIJJI.ordinal()];
        if (i == 1) {
            return 16000;
        }
        if (i != 2) {
            return i != 3 ? 44100 : 48000;
        }
        return 32000;
    }

    public final String LIZIZ() {
        if (TextUtils.isEmpty(this.LJIJI)) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(e3.d);
        sbLIZ.append(this.LJIIZILJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZJ() {
        int i;
        String strLIZ = this.LJIILL;
        if (!TextUtils.isEmpty(strLIZ)) {
            long j = this.LJIIZILJ;
            if (j != 0) {
                strLIZ = C1277270jLJ.LIZ(strLIZ, "pri", String.valueOf(j));
            }
        }
        if (!TextUtils.isEmpty(strLIZ) && !TextUtils.isEmpty(LIZIZ())) {
            strLIZ = C1277270jLJ.LIZ(strLIZ, "_session_id", LIZIZ());
        }
        if (!TextUtils.isEmpty(strLIZ) && (i = this.LJIJ) != 0) {
            strLIZ = C1277270jLJ.LIZ(strLIZ, "ts_con", String.valueOf(i));
        }
        return (TextUtils.isEmpty(strLIZ) || TextUtils.isEmpty(this.LJIJJLI)) ? strLIZ : C1277270jLJ.LIZ(strLIZ, "push_session_id", this.LJIJJLI);
    }

    public C1274930jHX() {
        LJIIJ(360, 640);
        this.LJFF = 0.5625f;
        this.LIZLLL = 800;
        this.LJ = 15;
        this.LJI = 2.0f;
        this.LJII = EnumC1275320jIA.H264;
        this.LJIIIIZZ = EnumC1275350jID.HIGH;
        this.LJIIIZ = Boolean.FALSE;
        this.LJIIJ = 0;
        this.LJIIJJI = EnumC1275270jI5.SAMPLE_RATE_44K;
        this.LJIIL = 2;
        this.LJIILIIL = 128;
        this.LJIILJJIL = EnumC1275260jI4.LC;
        this.LJIILL = "";
        this.LJIILLIIL = "";
    }

    public final void LIZLLL(int i) {
        int[] iArr = {16000, 32000, 44100, 48000};
        int i2 = 0;
        EnumC1275270jI5[] enumC1275270jI5Arr = {EnumC1275270jI5.SAMPLE_RATE_16K, EnumC1275270jI5.SAMPLE_RATE_32K, EnumC1275270jI5.SAMPLE_RATE_44K, EnumC1275270jI5.SAMPLE_RATE_48K};
        while (i > iArr[i2]) {
            i2++;
            if (i2 >= 4) {
                this.LJIIJJI = EnumC1275270jI5.SAMPLE_RATE_44K;
                return;
            }
        }
        this.LJIIJJI = enumC1275270jI5Arr[i2];
    }

    public final void LJ(boolean z) {
        this.LIZJ = z;
        C1271260jBc c1271260jBc = C1271270jBd.LIZ.LIZ;
        c1271260jBc.LJJII = z;
        c1271260jBc.LJIIIIZZ();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enableMixValidRegion", z);
            AVLog.logApiCall("setMixValidRegion", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public final void LJFF(String str) {
        String strSubstring;
        this.LJIILL = str;
        try {
            String strLIZIZ = C1277270jLJ.LIZIZ(str);
            int iLastIndexOf = strLIZIZ.lastIndexOf(47) + 1;
            int iIndexOf = strLIZIZ.indexOf(63, iLastIndexOf);
            if (iIndexOf < 0) {
                iIndexOf = strLIZIZ.length();
            }
            strSubstring = strLIZIZ.substring(iLastIndexOf, iIndexOf);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strSubstring = "";
        }
        this.LJIILLIIL = strSubstring;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0008 A[PHI: r0
      0x0008: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:3:0x0002, B:5:0x0006] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(int r2) {
        /*
            r1 = this;
            r0 = 100
            if (r2 < r0) goto L8
            r0 = 5000(0x1388, float:7.006E-42)
            if (r2 <= r0) goto L9
        L8:
            r2 = r0
        L9:
            r1.LIZLLL = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274930jHX.LJI(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0007 A[PHI: r0
      0x0007: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:3:0x0001, B:5:0x0005] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(int r2) {
        /*
            r1 = this;
            r0 = 5
            if (r2 < r0) goto L7
            r0 = 50
            if (r2 <= r0) goto L8
        L7:
            r2 = r0
        L8:
            r1.LJ = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274930jHX.LJII(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c A[PHI: r1
      0x000c: PHI (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:3:0x0004, B:5:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(float r3) {
        /*
            r2 = this;
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Lc
            r1 = 1092616192(0x41200000, float:10.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Ld
        Lc:
            r3 = r1
        Ld:
            r2.LJI = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274930jHX.LJIIIIZZ(float):void");
    }

    public final void LJIIIZ(float f) {
        this.LJFF = f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVideoRatio videoRatio=");
        sbLIZ.append(f);
        AVLog.logKibana(4, "MixStreamConfig", C2188811AlT.LIZIZ(sbLIZ), null);
        C1271270jBd.LIZ.LIZ.LJIIIIZZ();
    }

    public final void LJIIJ(int i, int i2) {
        AndroidRuntimeException androidRuntimeException;
        this.LIZ = (((i + 2) - 1) / 2) * 2;
        this.LIZIZ = (((i2 + 2) - 1) / 2) * 2;
        if (C1267520j5a.LIZ()) {
            androidRuntimeException = new AndroidRuntimeException("setVideoSize");
        } else {
            androidRuntimeException = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVideoSize videoWidth=");
        sbLIZ.append(i);
        sbLIZ.append(" videoHeight = ");
        sbLIZ.append(i2);
        sbLIZ.append(" this.w=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" this.h=");
        sbLIZ.append(this.LIZIZ);
        AVLog.logKibana(4, "MixStreamConfig", C2188811AlT.LIZIZ(sbLIZ), androidRuntimeException);
    }
}
