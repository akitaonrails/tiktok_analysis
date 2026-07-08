package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0QTz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671090QTz {
    public static C671010QTr LIZ(ViewGroup viewGroup, String str, C0QT7 c0qt7) {
        C19EG c19egLIZIZ;
        View viewTd;
        InterfaceC530790Krl interfaceC530790KrlLIZ;
        C0QTN inflater;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Context context = viewGroup.getContext();
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(viewGroup, c19egLIZIZ);
        if (lifecycleOwnerLJIJI == null || (interfaceC530790KrlLIZ = C0QNG.LIZ(lifecycleOwnerLJIJI)) == null || (inflater = interfaceC530790KrlLIZ.getInflater()) == null || (viewTd = inflater.LIZIZ(R.layout.bra)) == null) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bra, viewGroup, false);
        }
        return new C671010QTr(viewTd, str, c0qt7);
    }
}
