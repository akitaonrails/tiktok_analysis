package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.performance.asyncprefetch.communicattion.AsyncViewHolderViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0PSt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645290PSt {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(InterfaceC645430PTh interfaceC645430PTh) {
        Fragment fragment;
        HashMap<InterfaceC645430PTh, ArrayList<Runnable>> map;
        C19EG c19egLJ = C651290Pgd.LJ();
        if ((c19egLJ instanceof C19EG) && c19egLJ != null) {
            LifecycleOwner lifecycleOwnerLIZLLL = C651290Pgd.LIZLLL();
            if (lifecycleOwnerLIZLLL instanceof Fragment) {
                fragment = (Fragment) lifecycleOwnerLIZLLL;
            } else {
                fragment = null;
            }
            AsyncViewHolderViewModel asyncViewHolderViewModel = (AsyncViewHolderViewModel) C679340Qkm.LIZIZ(fragment, c19egLJ).get(AsyncViewHolderViewModel.class);
            if (asyncViewHolderViewModel != null && (map = asyncViewHolderViewModel.LL) != null) {
                return map.remove(interfaceC645430PTh);
            }
        }
        return null;
    }
}
