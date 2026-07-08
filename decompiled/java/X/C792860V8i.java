package X;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitLegoInflate;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0V8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792860V8i {
    public final void LIZ(Context context) {
        int iLIZ;
        AtomicBoolean atomicBoolean = InitLegoInflate.LLILLJJLI;
        if (atomicBoolean.get()) {
            return;
        }
        if (!C0CAU.LIZ() && ((Boolean) C282160B4c.LIZ.getValue()).booleanValue()) {
            iLIZ = C786640UtS.LIZ();
        } else {
            iLIZ = LSPassThroughRecordSizeConfig.DEFAULT;
        }
        C1BY8.LIZIZ();
        synchronized (this) {
            try {
                C1BY8.LIZ();
                if (atomicBoolean.get()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 24 && context != null) {
                    new FrameLayout(context);
                }
                atomicBoolean.set(true);
                C786640UtS.LIZIZ(iLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
