package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreInterceptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hcw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1211320hcw extends C0WWW {
    public static final ArrayList<String> LLILLL = new ArrayList<>();
    public final WeakReference<Context> LL;
    public SparkActivity LLILLJJLI;

    public C1211320hcw(WeakReference weakReference) {
        this.LL = weakReference;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        if (Intrinsics.LJFF(activity, this.LLILLJJLI) && activity.isFinishing()) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
            this.LLILLJJLI = null;
            C19719612Di.LJJIIJ(StoreInterceptor.LLILZIL, new AwS598S0100000_19(this, 141), true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        if (this.LLILLJJLI == null && (activity instanceof SparkActivity)) {
            ArrayList<String> arrayList = LLILLL;
            if (arrayList.contains(activity.toString())) {
                return;
            }
            arrayList.add(activity.toString());
            this.LLILLJJLI = (SparkActivity) activity;
        }
    }
}
