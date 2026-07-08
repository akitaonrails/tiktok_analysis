package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: X.0Vlc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807260Vlc {
    public static String LIZ(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof UnknownHostException) {
                return "ALOG:UnknownHostException";
            }
        }
        StringWriter stringWriter = new StringWriter() { // from class: X.0Vld
            public int LL;
            public boolean LLILLJJLI;

            @Override // java.io.StringWriter, java.io.Writer
            public final void write(String str, int i, int i2) {
                if (this.LLILLJJLI) {
                    return;
                }
                int i3 = this.LL;
                if (i3 + i2 > 4000) {
                    this.LLILLJJLI = true;
                } else {
                    this.LL = i3 + i2;
                    super.write(str, i, i2);
                }
            }
        };
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        printWriter.flush();
        return stringWriter.toString();
    }
}
