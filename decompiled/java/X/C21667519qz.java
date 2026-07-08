package X;

import Y.ACListenerS167S0100000_33;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.19qz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21667519qz extends AbstractC1664490tPr<C21667819r2, C21667419qy> {
    public TuxIconView LLJJJIL;
    public TuxIconView LLJJJJ;
    public View LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4189));
    public final boolean LLJL = C357780E0y.LIZ();

    public final Drawable LLLLLJIL(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        if (z) {
            i2 = R.attr.ee;
        } else {
            i2 = R.attr.zk;
        }
        c419910GdJ.LJ = Integer.valueOf(i2);
        if (this.LLJL) {
            i3 = 20;
        } else {
            i3 = 24;
        }
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i3));
        if (this.LLJL) {
            i4 = 20;
        } else {
            i4 = 24;
        }
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i4));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ((Context) this.LLJJLIIIJLLLLLLLZ.getValue());
        C384050F3z c384050F3z = new C384050F3z();
        if (this.LLJL) {
            i5 = 20;
        } else {
            i5 = 44;
        }
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i5));
        if (this.LLJL) {
            i6 = 20;
        } else {
            i6 = 44;
        }
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i6));
        return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ((Context) this.LLJJLIIIJLLLLLLLZ.getValue()));
    }

    public final void LLLLLJLJLL(TuxIconView tuxIconView, int i) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, LLLLLJIL(i, true));
        stateListDrawable.addState(new int[0], LLLLLJIL(i, false));
        if (tuxIconView != null) {
            tuxIconView.setImageDrawable(stateListDrawable);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setClickable(true);
        LLLLLJLJLL(this.LLJJJJ, R.raw.icon_tick_fill);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.19qx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21667819r2) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS612S0100000_33(this, 275));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.19r3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21667819r2) obj).LJ;
            }
        }, Lifecycle.State.STARTED, new AwS612S0100000_33(this, 276));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.19r4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21667819r2) obj).LJFF;
            }
        }, Lifecycle.State.STARTED, new AwS612S0100000_33(this, 277));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.19r0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C21667819r2) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS612S0100000_33(this, 278));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.19r1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C21667819r2) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS612S0100000_33(this, 274));
        View view2 = this.LLJJJJJIL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS167S0100000_33(this, 116), view2);
        }
        TuxIconView tuxIconView = this.LLJJJJ;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS167S0100000_33(this, 117));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        if (!C0E47.LIZ()) {
            return new FrameLayout(requireSceneContext());
        }
        if (this.LLJL) {
            i = R.layout.c0f;
        } else {
            i = R.layout.c0e;
        }
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        if (this.LLJL) {
            i2 = R.id.tc5;
        } else {
            i2 = R.id.zjn;
        }
        this.LLJJJJJIL = viewGroup2.findViewById(i2);
        this.LLJJJIL = (TuxIconView) viewGroup2.findViewById(R.id.tc3);
        this.LLJJL = (TuxTextView) viewGroup2.findViewById(R.id.tcb);
        this.LLJJJJ = (TuxIconView) viewGroup2.findViewById(R.id.eoo);
        this.LLJJJJLIIL = (TuxTextView) viewGroup2.findViewById(R.id.tv_title);
        return viewGroup2;
    }
}
