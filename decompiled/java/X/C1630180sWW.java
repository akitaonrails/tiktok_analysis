package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0sWW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630180sWW extends AbstractC1664490tPr<C1627440sS6, C1627460sS8> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 725));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 724));
    public int LLJJJJJIL;

    public static void LLLLLJIL(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (C1627490sSB.LIZIZ()) {
            layoutParams.gravity = 8388693;
            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        } else {
            layoutParams.gravity = 8388691;
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        }
        C786410Ut5.W5(view, layoutParams);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C786410Ut5.LLLLLLZZ((TuxIconView) this.LLJJJIL.getValue(), 0);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0sWO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1627440sS6) obj).LIZ;
            }
        }, new AwS595S0100000_16(this, 170));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0sWM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1627440sS6) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS595S0100000_16(this, 171));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.wk, viewGroup, false);
    }
}
