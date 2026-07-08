package X;

import android.app.ActivityManager;
import android.app.ApplicationStartInfo;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.086Q, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C086Q extends C09AY implements Function0<Intent> {
    public C086Q() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Intent invoke() {
        MessageQueue messageQueue;
        Intent intentLIZ;
        if (Build.VERSION.SDK_INT < 37) {
            try {
                messageQueue = (MessageQueue) C1958707lp.LIZIZ(Looper.getMainLooper(), "mQueue");
            } catch (Throwable th) {
            }
            synchronized (messageQueue) {
                try {
                    Message message = (Message) C1958707lp.LIZIZ(messageQueue, "mMessages");
                    if (message == null || message.getTarget() != C083F.LIZLLL() || !C083F.LJI(message) || (intentLIZ = C086P.LIZ(message)) == null) {
                        Field fieldLIZ = C1958707lp.LIZ(Message.class, "next");
                        fieldLIZ.setAccessible(true);
                        while (message != null) {
                            if (!fieldLIZ.isAccessible()) {
                                fieldLIZ.setAccessible(true);
                            }
                            message = (Message) fieldLIZ.get(message);
                            if (message != null && message.getTarget() == C083F.LIZLLL() && C083F.LJI(message) && (intentLIZ = C086P.LIZ(message)) != null) {
                                break;
                            }
                        }
                        intentLIZ = null;
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } else {
            intentLIZ = null;
        }
        if (intentLIZ == null && Build.VERSION.SDK_INT >= 35) {
            try {
                Object objG2 = C786410Ut5.G2(C1BWL.LIZ(), "activity");
                ActivityManager activityManager = objG2 instanceof ActivityManager ? (ActivityManager) objG2 : null;
                if (activityManager != null) {
                    Iterator it2 = activityManager.getHistoricalProcessStartReasons(1).iterator();
                    if (it2.hasNext()) {
                        intentLIZ = ((ApplicationStartInfo) it2.next()).getIntent();
                        return intentLIZ;
                    }
                }
            } catch (Throwable th2) {
            }
        }
        return intentLIZ;
    }
}
