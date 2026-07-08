package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0xvz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838170xvz {
    public static String LIZ(int i, Fragment fragment) {
        Context contextP3;
        Resources resources;
        C19EG activity = fragment.getActivity();
        if (activity != null && (contextP3 = C786410Ut5.P3(activity)) != null && (resources = contextP3.getResources()) != null) {
            return resources.getString(i);
        }
        return null;
    }
}
