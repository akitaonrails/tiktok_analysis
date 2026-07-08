package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.util.Log;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0J3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485840J3m extends MutableContextWrapper {
    public final int LIZ;

    public C485840J3m(C1361400lX0 c1361400lX0) {
        super(c1361400lX0);
        this.LIZ = R.style.xm;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        super.attachBaseContext(context);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        super.setBaseContext(new C1361400lX0(context, this.LIZ));
    }
}
