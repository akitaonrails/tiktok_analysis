package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;

/* JADX INFO: renamed from: X.0WhO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class RunnableC830120WhO implements Runnable {
    public final int LL = 5000;
    public IOException LLILLJJLI;
    public boolean LLILLL;
    public final /* synthetic */ AbstractC830080WhK LLILZ;

    public final void LIZ() {
        InetSocketAddress inetSocketAddress;
        try {
            ServerSocket serverSocket = this.LLILZ.LIZJ;
            if (this.LLILZ.LIZ != null) {
                AbstractC830080WhK abstractC830080WhK = this.LLILZ;
                inetSocketAddress = new InetSocketAddress(abstractC830080WhK.LIZ, abstractC830080WhK.LIZIZ);
            } else {
                inetSocketAddress = new InetSocketAddress(this.LLILZ.LIZIZ);
            }
            serverSocket.bind(inetSocketAddress);
            this.LLILLL = true;
            do {
                try {
                    Socket socketAccept = this.LLILZ.LIZJ.accept();
                    int i = this.LL;
                    if (i > 0) {
                        socketAccept.setSoTimeout(i);
                    }
                    InputStream inputStream = socketAccept.getInputStream();
                    AbstractC830080WhK abstractC830080WhK2 = this.LLILZ;
                    abstractC830080WhK2.LJFF.LIZIZ(new RunnableC830100WhM(abstractC830080WhK2, inputStream, socketAccept));
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    AbstractC830080WhK.LJIIJ.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                }
            } while (!this.LLILZ.LIZJ.isClosed());
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LLILLJJLI = e2;
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

    public RunnableC830120WhO(AbstractC830080WhK abstractC830080WhK) {
        this.LLILZ = abstractC830080WhK;
    }
}
