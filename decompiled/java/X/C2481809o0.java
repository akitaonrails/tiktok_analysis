package X;

import android.content.Context;
import android.util.Log;
import android.view.ContextThemeWrapper;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: renamed from: X.09o0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2481809o0 extends ContextThemeWrapper {
    public final int LIZ;

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper
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

    public C2481809o0(Context context, int i) {
        super(context, i);
        this.LIZ = i;
    }
}
