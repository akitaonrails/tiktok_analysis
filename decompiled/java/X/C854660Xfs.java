package X;

import android.R;
import android.app.Activity;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Xfs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854660Xfs implements MessageQueue.IdleHandler {
    public final int $t;
    public Object l0;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        switch (this.$t) {
            case 0:
                return queueIdle$0(this);
            case 1:
                return queueIdle$1(this);
            default:
                return false;
        }
    }

    public static final boolean queueIdle$0(C854660Xfs c854660Xfs) {
        Activity activity = (Activity) ((C791990V4z) c854660Xfs.l0).get();
        if (activity != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (activity.getWindow() != null && activity.getWindow().peekDecorView() != null) {
                try {
                    if (activity.isDestroyed()) {
                        if (activity.getWindow().getContext() == activity) {
                            View rootView = activity.getWindow().peekDecorView().getRootView();
                            ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
                            if (viewGroup.getChildCount() > 0 && viewGroup.getChildAt(0).getContext() == activity) {
                                C420920Gew.LIZ(activity, rootView);
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (C792400V6o.LJIIIIZZ()) {
                        th.getMessage();
                    }
                }
            } else if (C792400V6o.LJIIIIZZ()) {
            }
            if (C792400V6o.LJIIIIZZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unbindDrawables done, cost: ");
                sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                sbLIZ.append(" ms.");
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return false;
    }

    public static final boolean queueIdle$1(C854660Xfs c854660Xfs) {
        ((C0VZF) c854660Xfs.l0).LIZLLL();
        return true;
    }

    public C854660Xfs(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
