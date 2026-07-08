package X;

import Y.ACListenerS140S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FNC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FNC extends AbstractC1664490tPr<C0FNG, C0FNL> {
    public static final /* synthetic */ int LLJLIL = 0;
    public LinearLayout LLJJJIL;
    public ViewGroup LLJJJJ;
    public C388620FLo LLJJJJJIL;
    public View LLJJJJLIIL;
    public C0FNI LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        TuxIconView tuxIconView;
        super.onActivityCreated(bundle);
        this.LLJJJJ = (ViewGroup) requireViewById(R.id.vjr);
        this.LLJJJIL = (LinearLayout) requireViewById(R.id.kd0);
        this.LLJJJJJIL = (C388620FLo) requireViewById(R.id.kcz);
        this.LLJJJJLIIL = requireViewById(R.id.kcx);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) requireViewById(R.id.vjl);
        LinearLayout linearLayout = this.LLJJJIL;
        if (linearLayout != null) {
            tuxIconView = (TuxIconView) linearLayout.findViewById(R.id.ksz);
        } else {
            tuxIconView = null;
        }
        this.LLJL = tuxIconView;
        C0FNI c0fni = new C0FNI(new AwS584S0100000_5(this, 33));
        this.LLJJL = c0fni;
        C388620FLo c388620FLo = this.LLJJJJJIL;
        if (c388620FLo != null) {
            c388620FLo.setAdapter(c0fni);
        }
        C388620FLo c388620FLo2 = this.LLJJJJJIL;
        if (c388620FLo2 != null) {
            c388620FLo2.setLayoutManager(new LinearLayoutManager(requireSceneContext(), 0, false));
        }
        C388620FLo c388620FLo3 = this.LLJJJJJIL;
        if (c388620FLo3 != null) {
            c388620FLo3.addItemDecoration(new C391460FWm(0));
        }
        C388620FLo c388620FLo4 = this.LLJJJJJIL;
        if (c388620FLo4 != null) {
            if (C426750GoL.LIZLLL(c388620FLo4.getContext())) {
                c388620FLo4.LIZJ(C418440Gaw.LIZIZ(56), 0.0f);
            } else {
                c388620FLo4.LIZJ(0.0f, C418440Gaw.LIZIZ(56));
            }
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FNE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0FNG) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 34));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FNK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0FNG) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 35));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0FNF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0FNG) obj).LIZIZ;
            }
        }, new AwS584S0100000_5(this, 36));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FND
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0FNG) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 32));
        LinearLayout linearLayout2 = this.LLJJJIL;
        if (linearLayout2 != null) {
            C786410Ut5.R7(linearLayout2, new ACListenerS140S0100000_5(this, 3));
        }
        View view = this.LLJJJJLIIL;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS140S0100000_5(this, 4), view);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.eoe, viewGroup, false);
        if ((viewTd instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewTd) != null) {
            return viewGroup2;
        }
        throw new IllegalArgumentException("parentLayout is null");
    }
}
