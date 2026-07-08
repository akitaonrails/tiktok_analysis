package X;

import android.database.CursorWindowAllocationException;
import android.os.Build;
import android.os.DeadSystemException;
import android.os.TransactionTooLargeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.Thread;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09Ow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2366009Ow implements Thread.UncaughtExceptionHandler {
    public static volatile boolean LIZIZ;
    public static volatile InterfaceC2366409Pa LIZLLL;
    public static Thread.UncaughtExceptionHandler LJ;
    public static final C2366009Ow LIZ = new C2366009Ow();
    public static volatile EnumC2366109Ox LIZJ = EnumC2366109Ox.NONE;

    public static EnumC2366109Ox LIZ(Throwable th) {
        EnumC2366109Ox enumC2366109Ox;
        int i = 16;
        while (th != null) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            if (th instanceof C1303660k1s) {
                enumC2366109Ox = EnumC2366109Ox.OOM_FRESCO;
            } else if (th instanceof OutOfMemoryError) {
                String message = th.getMessage();
                if (message != null && u.LJJIIJZLJL(message, "Failed to allocate", false)) {
                    enumC2366109Ox = EnumC2366109Ox.OOM_JAVA;
                } else {
                    enumC2366109Ox = EnumC2366109Ox.OOM_OTHERS;
                }
            } else if (th instanceof TransactionTooLargeException) {
                enumC2366109Ox = EnumC2366109Ox.TRANSACTION_TOO_LARGE;
            } else if (Build.VERSION.SDK_INT >= 24 && (th instanceof DeadSystemException)) {
                enumC2366109Ox = EnumC2366109Ox.DEAD_SYSTEM;
            } else if (!(th instanceof CursorWindowAllocationException) && !(th instanceof C09PW)) {
                enumC2366109Ox = EnumC2366109Ox.NONE;
            } else {
                enumC2366109Ox = EnumC2366109Ox.CURSOR_WINDOW_ALLOCATION;
            }
            if (enumC2366109Ox != EnumC2366109Ox.NONE) {
                return enumC2366109Ox;
            }
            th = th.getCause();
            i = i2;
        }
        return EnumC2366109Ox.NONE;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            LIZJ = LIZ(th);
            InterfaceC2366409Pa interfaceC2366409Pa = LIZLLL;
            if (interfaceC2366409Pa != null) {
                try {
                    interfaceC2366409Pa.LIZ();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            uncaughtExceptionHandler = LJ;
            if (uncaughtExceptionHandler == null) {
                return;
            }
        } catch (Throwable th3) {
            try {
                TryCatchGuardChecker.doCheck(th3);
                uncaughtExceptionHandler = LJ;
                if (uncaughtExceptionHandler == null) {
                    return;
                }
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = LJ;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
                throw th4;
            }
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
