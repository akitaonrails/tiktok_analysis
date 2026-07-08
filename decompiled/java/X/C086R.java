package X;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.086R, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C086R {
    public static void LIZ() {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT < 37) {
            try {
                MessageQueue messageQueue = (MessageQueue) C1958707lp.LIZIZ(Looper.getMainLooper(), "mQueue");
                synchronized (messageQueue) {
                    try {
                        Message message = (Message) C1958707lp.LIZIZ(messageQueue, "mMessages");
                        if (message == null || message.getTarget() != C083F.LIZLLL() || !C083F.LJI(message) || (((i2 = message.what) != 100 && i2 != 159) || C086P.LIZ(message) == null)) {
                            Field fieldLIZ = C1958707lp.LIZ(Message.class, "next");
                            fieldLIZ.setAccessible(true);
                            if (message != null) {
                                while (true) {
                                    if (!fieldLIZ.isAccessible()) {
                                        fieldLIZ.setAccessible(true);
                                    }
                                    message = (Message) fieldLIZ.get(message);
                                    if (message == null) {
                                        break;
                                    }
                                    if (message.getTarget() == C083F.LIZLLL() && C083F.LJI(message) && ((i = message.what) == 100 || i == 159)) {
                                        if (C086P.LIZ(message) != null) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th) {
            }
        }
        ActivityLifeObserver.getInstance().register(new InterfaceC792700V7s() { // from class: X.086S
            @Override // X.InterfaceC792700V7s
            public final void LJ() {
            }

            @Override // X.InterfaceC792700V7s
            public final void LJII(Activity activity) {
            }

            @Override // X.InterfaceC792700V7s
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC792700V7s
            public final void LIZLLL(Activity activity) throws Throwable {
                C2204961BRm.LJJIJIIJIL(activity.getComponentName(), new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+99O7+gyiBjk4K2mMdduXS6sMwhozhNbU", null));
            }

            @Override // X.InterfaceC792700V7s
            public final void LJIIJ(Activity activity) throws Throwable {
                C2204961BRm.LJJIJIIJIL(activity.getComponentName(), new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+99O7+gyiBjk4K2mMdduXS6sMwhozhNbU", null));
            }

            @Override // X.InterfaceC792700V7s
            public final void onActivityStarted(Activity activity) {
                System.currentTimeMillis();
            }

            @Override // X.InterfaceC792700V7s
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                System.currentTimeMillis();
            }
        });
    }
}
