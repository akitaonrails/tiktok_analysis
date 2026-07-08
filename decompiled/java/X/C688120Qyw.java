package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.0Qyw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688120Qyw {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final Bundle LIZJ;

    static {
        new C688080Qys();
    }

    public final C19EG LIZIZ() {
        Fragment fragment;
        C19EG activity;
        C19EG c19eg;
        LifecycleOwner lifecycleOwner = this.LIZIZ;
        return (!(lifecycleOwner instanceof C19EG) || (c19eg = (C19EG) lifecycleOwner) == null) ? (!(lifecycleOwner instanceof Fragment) || (fragment = (Fragment) lifecycleOwner) == null || (activity = fragment.getActivity()) == null) ? LIZ(this.LIZ) : activity : c19eg;
    }

    public static C19EG LIZ(Context context) {
        ContextWrapper contextWrapper;
        Context baseContext;
        if (context instanceof C19EG) {
            return (C19EG) context;
        }
        if (!(context instanceof ContextWrapper) || (contextWrapper = (ContextWrapper) context) == null || (baseContext = contextWrapper.getBaseContext()) == null) {
            return null;
        }
        return LIZ(baseContext);
    }

    public C688120Qyw(Context context, LifecycleOwner lifecycleOwner, Bundle bundle) {
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = bundle;
    }
}
