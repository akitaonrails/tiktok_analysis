package X;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.015U, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C015U extends C09AY implements Function1<WeakReference<Activity>, Boolean> {
    public final /* synthetic */ Activity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C015U(Activity activity) {
        super(1);
        this.LL = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(WeakReference<Activity> weakReference) {
        boolean z;
        Activity activity = weakReference.get();
        if (activity != null && !Intrinsics.LJFF(activity, this.LL)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
