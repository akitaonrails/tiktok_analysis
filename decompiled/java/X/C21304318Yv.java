package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import irm.AkS98S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.18Yv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21304318Yv extends AbstractC1664490tPr<C1275004yq, C21304218Yu> {
    public C21304418Yw LLJJJIL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C21304418Yw c21304418Yw = this.LLJJJIL;
        if (c21304418Yw != null) {
            C786410Ut5.I7(new AkS98S0100000_32(this, 20), c21304418Yw.LLILLL);
            C786410Ut5.I7(new AkS98S0100000_32(this, 21), c21304418Yw.LLILLJJLI);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.05my
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1275004yq) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 397));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ns, viewGroup, false);
        int i = R.id.cp_;
        C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.cp_, viewTd);
        if (c197039127h != null) {
            i = R.id.cph;
            C197039127h c197039127h2 = (C197039127h) C1616006Uk.LIZ(R.id.cph, viewTd);
            if (c197039127h2 != null) {
                LinearLayout linearLayout = (LinearLayout) viewTd;
                this.LLJJJIL = new C21304418Yw(linearLayout, c197039127h, c197039127h2);
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
