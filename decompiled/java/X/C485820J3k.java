package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.util.Log;
import android.view.LayoutInflater;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: renamed from: X.0J3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485820J3k extends MutableContextWrapper {
    public volatile LayoutInflater LIZ;

    public C485820J3k(Context context) {
        super(context);
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

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        LayoutInflater layoutInflater;
        if ("layout_inflater".equals(str)) {
            LayoutInflater layoutInflater2 = this.LIZ;
            if (layoutInflater2 != null) {
                return layoutInflater2;
            }
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        this.LIZ = C786410Ut5.ne(getBaseContext()).cloneInContext(this);
                    }
                    layoutInflater = this.LIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return layoutInflater;
        }
        return super.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        super.setBaseContext(context);
        this.LIZ = null;
    }
}
