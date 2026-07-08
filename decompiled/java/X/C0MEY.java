package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0MEY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MEY extends AbstractC1664490tPr<C0MEW, C565030MEb> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 575));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 577));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 576));

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        C0M31.LIZ((View) this.LLJJJIL.getValue(), new AwS552S0100000_8(this, 578));
        if (C0C09.LIZ() && (numLIZJ = C1308910kAL.LIZJ(R.attr.agt, requireSceneContext())) != null) {
            ((TextView) this.LLJJJJ.getValue()).setTextColor(numLIZJ.intValue());
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0MEZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0MEW) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 371));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.by0, viewGroup, false);
    }
}
