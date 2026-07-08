package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.Unit;

/* JADX INFO: renamed from: X.115u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194452115u extends AbstractC1664490tPr<Unit, C194454115w> {
    public C194453115v LLJJJIL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C194453115v c194453115v = this.LLJJJIL;
        if (c194453115v != null) {
            C786410Ut5.I7(new AkS95S0100000_29(this, 0), c194453115v.LLILLJJLI);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.nt, viewGroup, false);
        C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.cph, viewTd);
        if (c197039127h != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewTd;
            this.LLJJJIL = new C194453115v(constraintLayout, c197039127h);
            return constraintLayout;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(R.id.cph)));
    }
}
