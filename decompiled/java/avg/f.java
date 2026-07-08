package avg;

import X.C1846580y9Y;
import X.C1846620y9c;
import X.C1847660yBI;
import X.C1847740yBQ;
import X.C1847960yBm;
import X.C1848530yCh;
import X.InterfaceC1846560y9W;
import X.InterfaceC1846570y9X;
import android.app.Application;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;

/* JADX INFO: loaded from: classes28.dex */
public final class f implements View.OnClickListener {
    public final View.OnClickListener LL;

    public f(View.OnClickListener onClickListener) {
        this.LL = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(final View view) {
        String resourceEntryName;
        RecyclerView recyclerView;
        Pair pair;
        String str;
        Application application;
        Resources resources;
        String str2;
        View.OnClickListener onClickListener = this.LL;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        InterfaceC1846570y9X interfaceC1846570y9X = new InterfaceC1846570y9X() { // from class: X.0y9V
            @Override // X.InterfaceC1846570y9X
            public final void LIZ() {
                C1847860yBc.LJ(view);
                C1847860yBc.LIZLLL(view);
            }
        };
        if (view == null) {
            interfaceC1846570y9X.LIZ();
            return;
        }
        InterfaceC1846560y9W interfaceC1846560y9WLIZ = C1847660yBI.LIZ();
        boolean z = true;
        if (interfaceC1846560y9WLIZ != null && interfaceC1846560y9WLIZ.LIZ()) {
            C1847740yBQ c1847740yBQLIZIZ = C1846620y9c.LIZIZ(view);
            if (c1847740yBQLIZIZ != null && (str2 = c1847740yBQLIZIZ.LIZIZ) != null && str2.length() > 0) {
                interfaceC1846570y9X.LIZ();
                return;
            }
            if (view.getId() == -1) {
                interfaceC1846570y9X.LIZ();
                return;
            }
            try {
                application = C1847960yBm.LJI;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (application != null && (resources = application.getResources()) != null) {
                resourceEntryName = resources.getResourceEntryName(view.getId());
                if (resourceEntryName == null) {
                    resourceEntryName = "";
                }
            } else {
                resourceEntryName = "";
            }
            if (resourceEntryName.length() == 0) {
                interfaceC1846570y9X.LIZ();
                return;
            }
            View view2 = view;
            while (true) {
                if (view2.getParent() instanceof RecyclerView) {
                    ViewParent parent = view2.getParent();
                    if (!(parent instanceof RecyclerView) || (recyclerView = (RecyclerView) parent) == null) {
                        break;
                    } else {
                        pair = new Pair(Boolean.TRUE, Integer.valueOf(recyclerView.getChildAdapterPosition(view2)));
                    }
                } else {
                    Object parent2 = view2.getParent();
                    if (!(parent2 instanceof View) || (view2 = (View) parent2) == null) {
                        break;
                    }
                }
            }
            pair = null;
            if (pair == null || !((Boolean) pair.getFirst()).booleanValue()) {
                z = false;
            }
            if (z) {
                str = view.getClass().getSimpleName() + "_id_" + resourceEntryName + '_' + ((Number) pair.getSecond()).intValue();
            } else {
                str = view.getClass().getSimpleName() + "_id_" + resourceEntryName;
            }
            C1848530yCh.LIZ(view, str, null);
            C1846580y9Y.LIZIZ = interfaceC1846570y9X;
            return;
        }
        interfaceC1846570y9X.LIZ();
    }
}
