package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchPreloadLayoutOptConfig;

/* JADX INFO: renamed from: X.0PfO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650520PfO {
    public static final C650520PfO LIZ = new C650520PfO();

    public static View LIZ(int i, ViewGroup viewGroup) {
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(viewGroup.getContext());
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(viewGroup, c19egLIZIZ);
        C0PUQ.LIZ.getClass();
        if (((SearchPreloadLayoutOptConfig) C0PUQ.LIZJ.getValue()).enablePreload) {
            return LIZIZ(viewGroup.getContext(), i, viewGroup, false);
        }
        if (lifecycleOwnerLJIJI instanceof InterfaceC530790Krl) {
            return ((InterfaceC530790Krl) lifecycleOwnerLJIJI).getInflater().LIZIZ(i);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false);
    }

    public static View LIZIZ(Context context, int i, ViewGroup viewGroup, boolean z) {
        C653690PkV.LIZ.getClass();
        C653690PkV.LIZIZ = true;
        View viewLIZIZ = C21146717pB.LIZIZ(context, i, viewGroup, z);
        C653690PkV.LIZIZ = false;
        return viewLIZIZ;
    }
}
