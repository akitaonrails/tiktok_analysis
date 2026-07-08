package X;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: renamed from: X.197U, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C197U {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(InterfaceC214897198d interfaceC214897198d) {
        Activity activity;
        if ((interfaceC214897198d instanceof Activity) && (activity = (Activity) interfaceC214897198d) != null) {
            C0R1H.LIZLLL(activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FragmentManager LIZIZ(InterfaceC214897198d interfaceC214897198d) {
        C19EG c19eg;
        if (!(interfaceC214897198d instanceof C19EG) || (c19eg = (C19EG) interfaceC214897198d) == null) {
            return null;
        }
        return c19eg.getSupportFragmentManager();
    }
}
