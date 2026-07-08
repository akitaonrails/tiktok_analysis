package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.scope.MainActivityScope;

/* JADX INFO: renamed from: X.0S4U, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S4U {
    public static final MainActivityScope LIZ(View view) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
        if (c19egLIZIZ != null) {
            return LIZJ(c19egLIZIZ);
        }
        return null;
    }

    public static final MainActivityScope LIZIZ(Fragment fragment) {
        C19EG activity = fragment.getActivity();
        if (activity != null) {
            return LIZJ(activity);
        }
        return null;
    }

    public static final MainActivityScope LIZJ(C19EG c19eg) {
        if (!(c19eg instanceof InterfaceC1603190roz)) {
            return null;
        }
        MainActivityScope mainActivityScope = (MainActivityScope) new ViewModelProvider(c19eg).get(MainActivityScope.class);
        mainActivityScope.LL = C1558360qeg.LJI(c19eg, null);
        return mainActivityScope;
    }

    public static final MainActivityScope LIZLLL(AbstractC738140SxQ abstractC738140SxQ) {
        C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
        if (c19egLIZ != null) {
            return LIZJ(c19egLIZ);
        }
        return null;
    }
}
