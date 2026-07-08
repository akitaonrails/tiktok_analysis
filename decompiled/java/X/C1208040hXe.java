package X;

import android.os.SystemClock;
import com.bytedance.bpea.basics.Cert;

/* JADX INFO: renamed from: X.0hXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208040hXe implements InterfaceC1207170hWF {
    public final InterfaceC1207170hWF LIZ;
    public final Cert LIZIZ;
    public final EnumC2192761Arq LIZJ;
    public final long LIZLLL;
    public long LJ;
    public long LJFF;

    @Override // X.InterfaceC1207170hWF
    public final void LIZ(C1208240hXy c1208240hXy) {
        long jLJI;
        String str;
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RequestPermissionsNewCallback.onRequest: ");
        sbLIZ.append(c1208240hXy);
        C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ));
        EnumC1207420hWe enumC1207420hWe = c1208240hXy.LIZ;
        long j = c1208240hXy.LIZIZ;
        C1208130hXn c1208130hXn = C1208130hXn.LIZJ;
        EnumC2192761Arq enumC2192761Arq = this.LIZJ;
        Cert cert = this.LIZIZ;
        c1208130hXn.getClass();
        C1208420hYG c1208420hYGLJJJIL = C1208130hXn.LJJJIL();
        if (c1208420hYGLJJJIL != null) {
            jLJI = c1208420hYGLJJJIL.LJI(this.LIZJ);
        } else {
            jLJI = 0;
        }
        c1208130hXn.getClass();
        C1208240hXy c1208240hXy2 = new C1208240hXy(enumC1207420hWe, j, C1208130hXn.LJJIJIIJI(enumC2192761Arq, cert, jLJI, 0L));
        this.LJ = j;
        EnumC1207420hWe enumC1207420hWe2 = c1208240hXy.LIZ;
        EnumC1207420hWe enumC1207420hWe3 = EnumC1207420hWe.EarlyOpenSettings;
        if (enumC1207420hWe2 != enumC1207420hWe3) {
            this.LJFF = SystemClock.uptimeMillis();
            EnumC1207420hWe enumC1207420hWe4 = c1208240hXy.LIZ;
            if (enumC1207420hWe4 != EnumC1207420hWe.OpenSettings && enumC1207420hWe4 != enumC1207420hWe3) {
                str = "system";
            } else {
                str = "open_settings";
            }
            String strCertToken = this.LIZIZ.certToken();
            if (strCertToken == null) {
                strCertToken = "unknown";
            }
            C1208130hXn.LJJJJLL(C1208130hXn.LJJJ(this.LIZJ), strCertToken, str);
        }
        this.LIZ.LIZ(c1208240hXy2);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    @Override // X.InterfaceC1207170hWF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1208000hXa r23) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1208040hXe.LIZIZ(X.0hXa):void");
    }

    public C1208040hXe(C1207560hWs c1207560hWs, Cert cert, EnumC2192761Arq enumC2192761Arq, long j) {
        this.LIZ = c1207560hWs;
        this.LIZIZ = cert;
        this.LIZJ = enumC2192761Arq;
        this.LIZLLL = j;
    }
}
