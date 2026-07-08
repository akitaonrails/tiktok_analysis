package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import irm.AkS75S0100000_2;
import kotlin.jvm.internal.AFwS228S0000000_1;

/* JADX INFO: renamed from: X.0LqL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555390LqL extends AbstractC1664490tPr<C1263804x2, C1259904wP> {
    public C555410LqN LLJJJIL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C197039127h c197039127h;
        C197039127h c197039127h2;
        C197039127h c197039127h3;
        int i;
        super.onActivityCreated(bundle);
        C1263804x2 c1263804x2 = LLLLILI().LIZ;
        C555410LqN c555410LqN = this.LLJJJIL;
        if (c555410LqN != null && (c197039127h3 = c555410LqN.LLILLJJLI) != null) {
            if (c1263804x2.LIZ) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLLLJ(c197039127h3, i);
        }
        C555410LqN c555410LqN2 = this.LLJJJIL;
        if (c555410LqN2 != null && (c197039127h2 = c555410LqN2.LLILLJJLI) != null) {
            c197039127h2.LJJJJL(AFwS228S0000000_1.get$arr$(34));
        }
        C555410LqN c555410LqN3 = this.LLJJJIL;
        if (c555410LqN3 != null && (c197039127h = c555410LqN3.LLILLJJLI) != null) {
            C786410Ut5.I7(new AkS75S0100000_2(this, 5), c197039127h);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.o5, viewGroup, false);
        C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.g5n, viewTd);
        if (c197039127h != null) {
            FrameLayout frameLayout = (FrameLayout) viewTd;
            this.LLJJJIL = new C555410LqN(frameLayout, c197039127h, frameLayout);
            return frameLayout;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(R.id.g5n)));
    }
}
