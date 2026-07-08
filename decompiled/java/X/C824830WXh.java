package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0WXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824830WXh extends ContextWrapper implements LifecycleOwner {
    public WeakReference<Fragment> LL;
    public final C01GW LLILLJJLI;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Fragment fragment;
        Lifecycle lifecycle;
        WeakReference<Fragment> weakReference = this.LL;
        return (weakReference == null || (fragment = weakReference.get()) == null || (lifecycle = fragment.getLifecycle()) == null) ? ((C824840WXi) this.LLILLJJLI.getValue()).getLifecycle() : lifecycle;
    }

    public C824830WXh(Context context) {
        super(context);
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(0));
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
}
