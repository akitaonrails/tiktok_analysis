package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCatchBroadcastExceptionSetting;
import java.lang.Thread;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0prq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528080prq {
    public static Thread.UncaughtExceptionHandler LIZ;
    public static boolean LIZIZ;

    public static void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("catchSystemBroadcastException  ");
        sbLIZ.append(LIZ);
        C20441214yg.LIZIZ("anchor_exception_handler", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveCatchBroadcastExceptionSetting.INSTANCE.isEnable() && !LIZIZ) {
            LIZIZ = true;
            if (LIZ == null) {
                LIZ = Thread.getDefaultUncaughtExceptionHandler();
            }
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.0prp
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    boolean z;
                    Throwable cause;
                    String lowerCase;
                    if (C1528080prq.LIZIZ) {
                        String message = th.getMessage();
                        if (message != null && (lowerCase = message.toLowerCase(Locale.ROOT)) != null && a0.LJJIIZI(lowerCase, "can't deliver broadcast", false)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(" Exception = ");
                            sbLIZ2.append(th.getClass().getName());
                            sbLIZ2.append(", msg = ");
                            sbLIZ2.append(th.getMessage());
                            C20441214yg.LJ("anchor_exception_handler", C2188811AlT.LIZIZ(sbLIZ2));
                            return;
                        }
                        if (a0.LJJIIZI(th.getClass().getName(), "RemoteServiceException", false) || ((cause = th.getCause()) != null && a0.LJJIIZI(cause.getClass().getName(), "RemoteServiceException", false))) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(" 22Exception = ");
                            sbLIZ3.append(th.getClass().getName());
                            sbLIZ3.append(", msg = ");
                            sbLIZ3.append(th.getMessage());
                            C20441214yg.LJ("anchor_exception_handler", C2188811AlT.LIZIZ(sbLIZ3));
                            return;
                        }
                    }
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = C1528080prq.LIZ;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                }
            });
        }
    }

    public static void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetAndroidBroadcastException  ");
        sbLIZ.append(LIZ);
        C20441214yg.LIZIZ("anchor_exception_handler", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveCatchBroadcastExceptionSetting.INSTANCE.isEnable()) {
            LIZIZ = false;
        }
    }
}
