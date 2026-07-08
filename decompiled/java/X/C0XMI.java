package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0XMI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XMI extends C1496260p2W {
    public final Logger LJIIJ = Logger.getLogger("okio.Okio");
    public final Socket LJIIJJI;

    @Override // X.C1496260p2W
    public final void LJIILIIL() {
        String message;
        try {
            this.LJIIJJI.close();
        } catch (AssertionError e) {
            TryCatchGuardChecker.doCheck(e);
            if (e.getCause() == null || (message = e.getMessage()) == null || !a0.LJJIIZI(message, "getsockname failed", false)) {
                throw e;
            }
            Logger logger = this.LJIIJ;
            Level level = Level.WARNING;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to close timed out socket ");
            sbLIZ.append(this.LJIIJJI);
            logger.log(level, C2188811AlT.LIZIZ(sbLIZ), (Throwable) e);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            Logger logger2 = this.LJIIJ;
            Level level2 = Level.WARNING;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Failed to close timed out socket ");
            sbLIZ2.append(this.LJIIJJI);
            logger2.log(level2, C2188811AlT.LIZIZ(sbLIZ2), (Throwable) e2);
        }
    }

    public C0XMI(Socket socket) {
        this.LJIIJJI = socket;
    }

    @Override // X.C1496260p2W
    public final IOException LJIIL(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
