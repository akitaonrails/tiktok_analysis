package X;

import Y.ACListenerS140S0100000_5;
import Y.ARunnableS105S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Evw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380500Evw extends AbstractC1664490tPr<C380490Evv, C380510Evx> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 277));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 279));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 278));
    public C380460Evs LLJJJJLIIL;

    public final View LLLLLJIL() {
        return (View) this.LLJJJIL.getValue();
    }

    public final View LLLLLJLJLL() {
        return (View) this.LLJJJJJIL.getValue();
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        View view = this.mView;
        if (view == null) {
            return;
        }
        LLLLLJLJLL().animate().cancel();
        HandlerHook.viewPost(view, new ARunnableS105S0100000_5(this, 34));
    }

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        LLLLLJLJLL().animate().cancel();
        C786410Ut5.LJLLLLLL(8, LLLLLJIL());
        C786410Ut5.T4(LLLLLJIL(), 0.0f);
        C786410Ut5.LJLLLLLL(4, LLLLLJLJLL());
        C786410Ut5.ed(LLLLLJLJLL(), LLLLLJLJLL().getHeight());
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        List<C379430EuD> listLIZ;
        super.onActivityCreated(bundle);
        C786410Ut5.I7(new ACListenerS140S0100000_5(this, 21), LLLLLJIL());
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ew2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C380490Evv) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 281));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ew1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C380490Evv) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 282));
        this.LLJJJJLIIL = new C380460Evs(new AwS584S0100000_5(this, 283));
        ((RecyclerView) this.LLJJJJ.getValue()).setLayoutManager(new LinearLayoutManager(((View) this.LLJJJJ.getValue()).getContext()));
        ((RecyclerView) this.LLJJJJ.getValue()).setAdapter(this.LLJJJJLIIL);
        if (!LLLLILI().LIZ.LIZIZ.isEmpty()) {
            listLIZ = LLLLILI().LIZ.LIZIZ;
        } else {
            listLIZ = C379350Eu5.LIZ(((View) this.LLJJJJ.getValue()).getContext());
        }
        C380460Evs c380460Evs = this.LLJJJJLIIL;
        if (c380460Evs != null) {
            c380460Evs.LLLFZ(listLIZ, LLLLILI().LIZ.LIZJ);
        }
        C786410Ut5.LJLLLLLL(8, LLLLLJIL());
        C786410Ut5.T4(LLLLLJIL(), 0.0f);
        C786410Ut5.LJLLLLLL(4, LLLLLJLJLL());
        View viewLLLLLJLJLL = LLLLLJLJLL();
        C384050F3z c384050F3z = new C384050F3z();
        float fLIZIZ = C418440Gaw.LIZIZ(16);
        c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zn);
        viewLLLLLJLJLL.setBackground(c384050F3z.LIZ(requireSceneContext()));
        if (LLLLLJLJLL().getParent() != null) {
            HandlerHook.viewPost(LLLLLJLJLL(), new ARunnableS105S0100000_5(this, 33));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c4i, viewGroup, false);
    }
}
