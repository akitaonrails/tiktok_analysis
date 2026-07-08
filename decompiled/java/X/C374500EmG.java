package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.adjustfilter.ui.HorizontalCenterLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EmG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374500EmG extends AbstractC1664490tPr<C374200Elm, C374470EmD> {
    public RecyclerView LLJJJIL;
    public TuxTextView LLJJJJ;
    public final C01GW LLJJJJJIL;
    public InterfaceC374530EmJ LLJJJJLIIL;
    public final C01GW LLJJL;

    public C374500EmG() {
        setTheme(R.style.y0);
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 584));
        this.LLJJL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(163));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        C1654320t9S.LIZIZ(this, AFwS234S0000000_5.get$arr$(256));
        C1664590tQ1.LIZLLL(this, "CutoutToolBarNewScene", false, AFwS234S0000000_5.get$arr$(257), 2);
        C1664600tQ2.LIZ(this, "CutoutToolBarNewScene", new AwS584S0100000_5(this, 494));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg != null) {
            InterfaceC374530EmJ interfaceC374530EmJ = (InterfaceC374530EmJ) c1drg.LJIIL(null, InterfaceC374530EmJ.class);
            this.LLJJJJLIIL = interfaceC374530EmJ;
            if (interfaceC374530EmJ != null) {
                interfaceC374530EmJ.setTitle("");
                if (((Boolean) this.LLJJL.getValue()).booleanValue()) {
                    i = 20;
                } else {
                    i = 24;
                }
                interfaceC374530EmJ.s00(new C377060EqO(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), Integer.valueOf(R.raw.icon_tick), Integer.valueOf(R.raw.icon_arrow_counter_clockwise)));
            }
            this.LLJJJJ = (TuxTextView) findViewById(R.id.xyz);
            String string = getString(2131834062);
            TuxTextView tuxTextView = this.LLJJJJ;
            if (tuxTextView != null) {
                tuxTextView.setText(string);
            }
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.y6m);
            this.LLJJJIL = recyclerView;
            if (recyclerView != null) {
                recyclerView.setAdapter((AbstractC21673619ry) this.LLJJJJJIL.getValue());
            }
            RecyclerView recyclerView2 = this.LLJJJIL;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new HorizontalCenterLayoutManager(requireSceneContext()));
            }
            RecyclerView recyclerView3 = this.LLJJJIL;
            if (recyclerView3 != null) {
                recyclerView3.setItemAnimator(null);
            }
            ((C374090Elb) this.LLJJJJJIL.getValue()).LLILLL = new InterfaceC374610EmR() { // from class: X.0EmE
                @Override // X.InterfaceC374610EmR
                public final void LIZ(C373800El8 c373800El8, int i2) {
                    this.LIZ.LLLLIL().LIZ.invoke(c373800El8, Integer.valueOf(i2));
                }
            };
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Els
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C374200Elm) obj).LIZIZ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 502));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Elx
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C374200Elm) obj).LIZ);
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 503));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EmH
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C374200Elm) obj).LIZJ);
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 504));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EmI
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C374200Elm) obj).LJ);
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 505));
            InterfaceC374530EmJ interfaceC374530EmJ2 = this.LLJJJJLIIL;
            if (interfaceC374530EmJ2 != null) {
                interfaceC374530EmJ2.u11(new InterfaceC374650EmV() { // from class: X.0EmF
                    @Override // X.InterfaceC374650EmV
                    public final void LIZ() {
                        this.LIZ.LLLLIL().LIZIZ.invoke();
                    }

                    @Override // X.InterfaceC374650EmV
                    public final void onCancel() {
                        this.LIZ.LLLLIL().LIZJ.invoke();
                    }
                });
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c0u, viewGroup, false);
    }
}
