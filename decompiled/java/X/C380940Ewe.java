package X;

import Y.ACListenerS140S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.adjustfilter.ui.HorizontalCenterLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Ewe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380940Ewe extends AbstractC1664490tPr<C380900Ewa, C380980Ewi> {
    public RecyclerView LLJJJIL;
    public View LLJJJJ;
    public C197039127h LLJJJJJIL;
    public View LLJJJJLIIL;
    public C1295960jpS LLJJL;
    public InterfaceC374530EmJ LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;

    public C380940Ewe() {
        setTheme(R.style.y0);
        this.LLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 570));
        this.LLJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 569));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1654320t9S.LIZIZ(this, AFwS234S0000000_5.get$arr$(244));
        C1664590tQ1.LIZLLL(this, "CutoutStrokeScene", false, AFwS234S0000000_5.get$arr$(246), 2);
        C1664600tQ2.LIZ(this, "CutoutStrokeScene", new AwS584S0100000_5(this, 484));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg != null) {
            this.LLJJLIIIJLLLLLLLZ = (InterfaceC374530EmJ) c1drg.LJIIL(null, InterfaceC374530EmJ.class);
            Context context = this.mView.getContext();
            InterfaceC374530EmJ interfaceC374530EmJ = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC374530EmJ != null) {
                interfaceC374530EmJ.setTitle("");
                interfaceC374530EmJ.DM0(EnumC377110EqT.RESET, false);
                interfaceC374530EmJ.s00(new C377060EqO(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 2, Integer.valueOf(R.raw.icon_tick)));
            }
            C1361400lX0 c1361400lX0 = new C1361400lX0(context, R.style.y0);
            this.LLJJJJLIIL = findViewById(R.id.xyz);
            findViewById(R.id.jow);
            this.LLJJJJ = findViewById(R.id.hc6);
            this.LLJJJJJIL = (C197039127h) findViewById(R.id.tec);
            this.LLJJL = (C1295960jpS) findViewById(R.id.nnp);
            C197039127h c197039127h = this.LLJJJJJIL;
            if (c197039127h != null) {
                c197039127h.setButtonVariant(1);
                c197039127h.setButtonSize(0);
                c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_arrow_clockwise));
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.zj, c1361400lX0);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
                c197039127h.setBackground(c384050F3z.LIZ(context));
            }
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.wb1);
            this.LLJJJIL = recyclerView;
            if (recyclerView != null) {
                recyclerView.setAdapter((AbstractC21673619ry) this.LLJLIL.getValue());
            }
            RecyclerView recyclerView2 = this.LLJJJIL;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new HorizontalCenterLayoutManager(requireSceneContext()));
            }
            RecyclerView recyclerView3 = this.LLJJJIL;
            if (recyclerView3 != null) {
                recyclerView3.setItemAnimator(null);
            }
            ((C380760EwM) this.LLJLIL.getValue()).LLILLL = new C380800EwQ(this);
            InterfaceC374530EmJ interfaceC374530EmJ2 = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC374530EmJ2 != null) {
                interfaceC374530EmJ2.u11(new InterfaceC374650EmV() { // from class: X.0Ewf
                    @Override // X.InterfaceC374650EmV
                    public final void onCancel() {
                    }

                    @Override // X.InterfaceC374650EmV
                    public final void LIZ() {
                        this.LIZ.LLLLIL().LIZJ.invoke();
                    }
                });
            }
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ewc
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C380900Ewa) obj).LIZ);
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 490));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ewd
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C380900Ewa) obj).LJ);
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 475));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ewg
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C380900Ewa) obj).LJFF);
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 478));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ewh
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C380900Ewa) obj).LIZLLL;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 483));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ewb
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C380900Ewa) obj).LIZIZ);
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 487));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Ewj
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C380900Ewa) obj).LJI;
                }
            }, new AwS584S0100000_5(this, 489));
            C197039127h c197039127h2 = this.LLJJJJJIL;
            if (c197039127h2 != null) {
                C786410Ut5.U8(c197039127h2, new ACListenerS140S0100000_5(this, 57));
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c0s, viewGroup, false);
    }
}
