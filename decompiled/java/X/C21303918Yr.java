package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import irm.AkS98S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.18Yr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21303918Yr extends AbstractC1664490tPr<C1274904yp, C21303818Yq> {
    public C21304018Ys LLJJJIL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C21304018Ys c21304018Ys = this.LLJJJIL;
        if (c21304018Ys != null) {
            C786410Ut5.I7(new AkS98S0100000_32(this, 18), c21304018Ys.LLILLL);
            C786410Ut5.I7(new AkS98S0100000_32(this, 19), c21304018Ys.LLILLJJLI);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.05mx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1274904yp) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 383));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.nw, viewGroup, false);
        int i = R.id.jyj;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.jyj, viewTd);
        if (tuxIconView != null) {
            i = R.id.jyv;
            TuxIconView tuxIconView2 = (TuxIconView) C1616006Uk.LIZ(R.id.jyv, viewTd);
            if (tuxIconView2 != null) {
                LinearLayout linearLayout = (LinearLayout) viewTd;
                this.LLJJJIL = new C21304018Ys(linearLayout, tuxIconView, tuxIconView2, linearLayout);
                linearLayout.setPadding(0, ScreenUtils.getStatusBarHeight(getSceneContext()), 0, 0);
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
