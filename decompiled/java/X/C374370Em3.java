package X;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.adjustfilter.ui.HorizontalCenterLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Em3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374370Em3 extends AbstractC1664490tPr<C374000ElS, C374240Elq> {
    public RecyclerView LLJJJIL;
    public C367060EaG LLJJJJ;
    public LinearLayout LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public InterfaceC374530EmJ LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    public C374370Em3() {
        setTheme(R.style.y0);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 524));
    }

    public final RecyclerView LLLLLJIL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.ckb);
            this.LLJJJIL = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        int iIntValue;
        Integer numLIZJ;
        Integer numLIZJ2;
        super.onActivityCreated(bundle);
        C1654320t9S.LIZIZ(this, AFwS234S0000000_5.get$arr$(214));
        C1664590tQ1.LIZLLL(this, "CutoutBrushScene", false, AFwS234S0000000_5.get$arr$(215), 2);
        C1664600tQ2.LIZ(this, "CutoutBrushScene", new AwS584S0100000_5(this, 437));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg != null) {
            InterfaceC374530EmJ interfaceC374530EmJ = (InterfaceC374530EmJ) c1drg.LJIIL(null, InterfaceC374530EmJ.class);
            this.LLJJL = interfaceC374530EmJ;
            if (interfaceC374530EmJ != null) {
                interfaceC374530EmJ.setTitle("");
                interfaceC374530EmJ.DM0(EnumC377110EqT.RESET, false);
                interfaceC374530EmJ.s00(new C377060EqO(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 2, Integer.valueOf(R.raw.icon_tick)));
            }
            this.LLJJJJJIL = (LinearLayout) findViewById(R.id.ck9);
            this.LLJJJJLIIL = (TuxTextView) findViewById(R.id.cka);
            C367060EaG c367060EaG = (C367060EaG) findViewById(R.id.ck_);
            this.LLJJJJ = c367060EaG;
            if (c367060EaG != null) {
                c367060EaG.setVibrate(false);
                C366990Ea9 c366990Ea9 = new C366990Ea9();
                Context sceneContext = getSceneContext();
                int iIntValue2 = -1;
                if (sceneContext != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, sceneContext)) != null) {
                    iIntValue = numLIZJ2.intValue();
                } else {
                    iIntValue = -1;
                }
                c366990Ea9.LIZ = iIntValue;
                Context sceneContext2 = getSceneContext();
                if (sceneContext2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, sceneContext2)) != null) {
                    iIntValue2 = numLIZJ.intValue();
                }
                c366990Ea9.LIZIZ = iIntValue2;
                c367060EaG.setProgressDrawable(c366990Ea9);
                c367060EaG.setProgress(LLLLILI().LIZ.LIZJ.getFirst().intValue());
            }
            RecyclerView recyclerViewLLLLLJIL = LLLLLJIL();
            if (recyclerViewLLLLLJIL != null) {
                recyclerViewLLLLLJIL.setAdapter((AbstractC21673619ry) this.LLJJLIIIJLLLLLLLZ.getValue());
            }
            RecyclerView recyclerViewLLLLLJIL2 = LLLLLJIL();
            if (recyclerViewLLLLLJIL2 != null) {
                recyclerViewLLLLLJIL2.setLayoutManager(new HorizontalCenterLayoutManager(requireSceneContext()));
            }
            RecyclerView recyclerViewLLLLLJIL3 = LLLLLJIL();
            if (recyclerViewLLLLLJIL3 != null) {
                recyclerViewLLLLLJIL3.setItemAnimator(null);
            }
            ((C374090Elb) this.LLJJLIIIJLLLLLLLZ.getValue()).LLILLL = new InterfaceC374610EmR() { // from class: X.0Elr
                @Override // X.InterfaceC374610EmR
                public final void LIZ(C373800El8 c373800El8, int i) {
                    if (!this.LIZ.LLLLILI().LIZ.LIZLLL) {
                        return;
                    }
                    this.LIZ.LLLLIL().LIZ.invoke(c373800El8, Integer.valueOf(i));
                }
            };
            InterfaceC374530EmJ interfaceC374530EmJ2 = this.LLJJL;
            if (interfaceC374530EmJ2 != null) {
                interfaceC374530EmJ2.u11(new InterfaceC374650EmV() { // from class: X.0Em2
                    @Override // X.InterfaceC374650EmV
                    public final void onCancel() {
                    }

                    @Override // X.InterfaceC374650EmV
                    public final void LIZ() {
                        this.LIZ.LLLLIL().LIZLLL.invoke();
                    }
                });
            }
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Em1
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C374000ElS) obj).LIZ);
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 433));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Em4
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C374000ElS) obj).LIZLLL);
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 434));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Em0
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C374000ElS) obj).LJ);
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 435));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Em5
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C374000ElS) obj).LIZIZ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 436));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EmK
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C374000ElS) obj).LIZJ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 432));
            C367060EaG c367060EaG2 = this.LLJJJJ;
            if (c367060EaG2 != null) {
                C786410Ut5.zb(c367060EaG2, new C391570FWx(this, 1));
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c0k, viewGroup, false);
    }
}
