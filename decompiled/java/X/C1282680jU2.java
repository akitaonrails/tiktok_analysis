package X;

import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0jU2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282680jU2 {
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    public final void LIZ(int i, String str, String str2) {
        InterfaceC1269880j9O logKibanaDevice;
        if (this.LIZLLL && i >= this.LIZ && (logKibanaDevice = AVLog.getLogKibanaDevice()) != null) {
            logKibanaDevice.LIZIZ(i, str, "video_quality_log", str2, null);
        }
    }
}
