package X;

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.12rx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19889912rx implements InterfaceC19890012ry {
    public static final C19889912rx LIZ = new C19889912rx();

    @Override // X.InterfaceC19890012ry
    public final void LIZ(Closeable closeable, Throwable th, Throwable th2) {
        Logger logger = C19374010qw.LIZ;
        Level level = Level.WARNING;
        String strValueOf = String.valueOf(closeable);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 42);
        sb.append("Suppressing exception thrown when closing ");
        sb.append(strValueOf);
        logger.log(level, sb.toString(), th2);
    }
}
