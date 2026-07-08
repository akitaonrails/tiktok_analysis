package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0ucm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710940ucm {
    public static final /* synthetic */ int LJ = 0;
    public final Context LIZ;
    public final Fragment LIZIZ;
    public final Activity LIZJ;
    public final View LIZLLL;

    public C1710940ucm(Context context, Object obj) {
        Fragment fragment;
        Activity activity;
        this.LIZ = context;
        if (obj instanceof Fragment) {
            fragment = (Fragment) obj;
        } else {
            fragment = null;
        }
        this.LIZIZ = fragment;
        if (obj instanceof Activity) {
            activity = (Activity) obj;
        } else {
            activity = null;
        }
        this.LIZJ = activity;
        this.LIZLLL = obj instanceof View ? (View) obj : null;
    }
}
