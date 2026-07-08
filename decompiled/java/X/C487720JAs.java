package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.util.Log;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: renamed from: X.0JAs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487720JAs extends MutableContextWrapper {
    public final int LIZ;

    @Override // android.content.ContextWrapper
    public final Context getBaseContext() {
        return ((ContextWrapper) super.getBaseContext()).getBaseContext();
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
        C2481809o0 c2481809o0;
        if ((context instanceof C2481809o0) && (c2481809o0 = (C2481809o0) context) != null && c2481809o0.LIZ == this.LIZ) {
            super.setBaseContext(c2481809o0);
        } else {
            super.setBaseContext(new C2481809o0(context, this.LIZ));
        }
    }

    public C487720JAs(Context context, int i) {
        super(context);
        this.LIZ = i;
        setBaseContext(context);
    }
}
