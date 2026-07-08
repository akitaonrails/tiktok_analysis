package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: X.0WhM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class RunnableC830100WhM implements Runnable {
    public final InputStream LL;
    public final Socket LLILLJJLI;
    public final /* synthetic */ AbstractC830080WhK LLILLL;

    public final void LIZ() {
        OutputStream outputStream = null;
        try {
            try {
                outputStream = this.LLILLJJLI.getOutputStream();
                getClass();
                C830070WhJ c830070WhJ = new C830070WhJ(this.LLILLL, new C830110WhN(), this.LL, outputStream, this.LLILLJJLI.getInetAddress());
                while (!this.LLILLJJLI.isClosed()) {
                    c830070WhJ.LIZLLL();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                    AbstractC830080WhK.LJIIJ.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                }
            }
            AbstractC830080WhK.LIZJ(outputStream);
            AbstractC830080WhK.LIZJ(this.LL);
            AbstractC830080WhK.LIZJ(this.LLILLJJLI);
            this.LLILLL.LJFF.LIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AbstractC830080WhK.LIZJ(outputStream);
            AbstractC830080WhK.LIZJ(this.LL);
            AbstractC830080WhK.LIZJ(this.LLILLJJLI);
            this.LLILLL.LJFF.LIZ(this);
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public RunnableC830100WhM(AbstractC830080WhK abstractC830080WhK, InputStream inputStream, Socket socket) {
        this.LLILLL = abstractC830080WhK;
        this.LL = inputStream;
        this.LLILLJJLI = socket;
    }
}
