package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;
import android.view.ContextThemeWrapper;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.09o1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2481909o1 extends ContextThemeWrapper {
    public WeakReference<Context> LIZ;

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        Context context;
        Resources resources;
        AssetManager assets;
        WeakReference<Context> weakReference = this.LIZ;
        return (weakReference == null || (context = weakReference.get()) == null || (resources = context.getResources()) == null || (assets = resources.getAssets()) == null) ? super.getAssets() : assets;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Context context;
        Resources resources;
        WeakReference<Context> weakReference = this.LIZ;
        return (weakReference == null || (context = weakReference.get()) == null || (resources = context.getResources()) == null) ? super.getResources() : resources;
    }

    public C2481909o1(Context context) {
        super(context, 0);
        this.LIZ = new WeakReference<>(context);
    }

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

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Context context;
        Context context2;
        WeakReference<Context> weakReference = this.LIZ;
        if (weakReference != null) {
            context = weakReference.get();
        } else {
            context = null;
        }
        if (context instanceof Activity) {
            WeakReference<Context> weakReference2 = this.LIZ;
            if (weakReference2 != null && (context2 = weakReference2.get()) != null) {
                Activity activity = (Activity) context2;
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, activity);
                C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyKb/OQ/kJzzgm2RjxWKXyNRtQzcQFADWY=", null));
                return;
            }
            throw new C2482109o3("null cannot be cast to non-null type android.app.Activity");
        }
        throw new IllegalArgumentException() { // from class: X.09o2
        };
    }

    public C2481909o1(Context context, int i) {
        super(C786410Ut5.N3(context), i);
        this.LIZ = new WeakReference<>(context);
    }
}
