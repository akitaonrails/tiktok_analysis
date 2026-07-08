package X;

import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0jU1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282670jU1 implements InterfaceC1283430jVF {
    @Override // X.InterfaceC1283430jVF
    public final boolean LIZLLL() {
        return C1267520j5a.LIZ();
    }

    @Override // X.InterfaceC1283430jVF
    public final boolean LJ() {
        return C1274040jG6.LIZ();
    }

    @Override // X.InterfaceC1283430jVF
    public final void LIZ(String str) {
        AVLog.logKibanaEvent(4, "BwProbeServiceImpl", "bw_probe", false, str, null);
    }

    @Override // X.InterfaceC1283430jVF
    public final void LIZIZ(String str) {
        InterfaceC1269880j9O logIODevice;
        C1282680jU2 c1282680jU2 = C0USS.LIZ;
        if (c1282680jU2.LIZJ && 6 >= c1282680jU2.LIZIZ && (logIODevice = AVLog.getLogIODevice()) != null) {
            logIODevice.LIZIZ(6, "VideoQualityStrategy", "video_quality_log", str, null);
        }
    }

    @Override // X.InterfaceC1283430jVF
    public final void LJII(String str) {
        C0USS.LIZ.LIZ(6, "VideoQualityStrategy", str);
    }

    @Override // X.InterfaceC1283430jVF
    public final void LJFF(String str, Throwable th) {
        C1274080jGA.LIZ.LIZ(str, th);
    }

    @Override // X.InterfaceC1283430jVF
    public final void LJI(String str, String str2) {
        InterfaceC1269880j9O logIODevice;
        C1282680jU2 c1282680jU2 = C0USS.LIZ;
        c1282680jU2.LIZ(4, str, str2);
        if (c1282680jU2.LIZJ && 4 >= c1282680jU2.LIZIZ && (logIODevice = AVLog.getLogIODevice()) != null) {
            logIODevice.LIZIZ(4, str, "video_quality_log", str2, null);
        }
    }

    @Override // X.InterfaceC1283430jVF
    public final void LIZJ(int i, String str, String str2, Throwable th) {
        AVLog.logKibana(i, str, str2, th);
    }
}
