package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;

/* JADX INFO: renamed from: X.0cqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1027370cqF implements InterfaceC1027390cqH {
    public Context LIZ;
    public C1027480cqQ LIZIZ;

    public void LJFF(boolean z, C1027480cqQ c1027480cqQ) {
    }

    public final Context LIZLLL() {
        Context context = this.LIZ;
        if (context != null) {
            return context;
        }
        return null;
    }

    public final C1027480cqQ LJ() {
        C1027480cqQ c1027480cqQ = this.LIZIZ;
        if (c1027480cqQ != null) {
            return c1027480cqQ;
        }
        return null;
    }

    public static void LIZJ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrXXxnHmBFdcx4FamgG16xM2oGtBANSIyX06rCVYFSwWWDN/GvGt/ag==", null));
    }
}
