package X;

import Y.ACListenerS140S0100000_5;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Elk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374180Elk extends AbstractC1664490tPr<C373910ElJ, C374170Elj> {
    public C367060EaG LLJJJIL;
    public LinearLayout LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public View LLJJJJLIIL;
    public LinearLayout LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public LinearLayout LLJL;
    public View LLJLIL;
    public LinearLayout LLJLILLLLZIIL;
    public View LLJLL;
    public InterfaceC374530EmJ LLJLLIL;
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 543));

    public final Drawable LLLLLJLJLL(boolean z) {
        int i;
        C384050F3z c384050F3z = new C384050F3z();
        if (z) {
            i = R.attr.zi;
        } else {
            i = R.attr.zg;
        }
        c384050F3z.LIZIZ = Integer.valueOf(i);
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        return c384050F3z.LIZ((Context) this.LLJLLL.getValue());
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.mView.setClickable(true);
        C1654320t9S.LIZIZ(this, AFwS234S0000000_5.get$arr$(228));
        C1664590tQ1.LIZLLL(this, "CutoutPanelScene", false, AFwS234S0000000_5.get$arr$(227), 2);
        C1664600tQ2.LIZ(this, "CutoutPanelScene", new AwS584S0100000_5(this, 451));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg != null) {
            InterfaceC374530EmJ interfaceC374530EmJ = (InterfaceC374530EmJ) c1drg.LJIIL(null, InterfaceC374530EmJ.class);
            this.LLJLLIL = interfaceC374530EmJ;
            if (interfaceC374530EmJ != null) {
                interfaceC374530EmJ.setTitle(C20642515q3.LJI(2131830444));
            }
            InterfaceC374530EmJ interfaceC374530EmJ2 = this.LLJLLIL;
            if (interfaceC374530EmJ2 != null) {
                interfaceC374530EmJ2.u11(new InterfaceC374650EmV() { // from class: X.0Eln
                    @Override // X.InterfaceC374650EmV
                    public final void LIZ() {
                        this.LIZ.LLLLIL().LJ.invoke();
                    }

                    @Override // X.InterfaceC374650EmV
                    public final void onCancel() {
                        this.LIZ.LLLLIL().LJFF.invoke();
                    }
                });
            }
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Elt
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C373910ElJ) obj).LIZIZ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 457));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ely
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C373910ElJ) obj).LIZJ);
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 458));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EmL
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C373910ElJ) obj).LIZ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 459));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Elz
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C373910ElJ) obj).LJ);
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 460));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EmQ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C373910ElJ) obj).LIZLLL;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 456));
            C367060EaG c367060EaG = this.LLJJJIL;
            if (c367060EaG != null) {
                C786410Ut5.zb(c367060EaG, new C391570FWx(this, 4));
            }
            View view = this.LLJJJJLIIL;
            if (view != null) {
                C786410Ut5.I7(new ACListenerS140S0100000_5(this, 52), view);
            }
            View view2 = this.LLJJLIIIJLLLLLLLZ;
            if (view2 != null) {
                C786410Ut5.I7(new ACListenerS140S0100000_5(this, 53), view2);
            }
            View view3 = this.LLJLIL;
            if (view3 != null) {
                C786410Ut5.I7(new ACListenerS140S0100000_5(this, 54), view3);
            }
            View view4 = this.LLJLL;
            if (view4 != null) {
                C786410Ut5.I7(new ACListenerS140S0100000_5(this, 55), view4);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void LLLLLJIL(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setEnabled(z);
        }
        if (z) {
            C786410Ut5.R4(1.0f, viewGroup);
        } else {
            C786410Ut5.R4(0.5f, viewGroup);
        }
    }

    public final Drawable LLLLLL(int i, boolean z) {
        int i2;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        if (z) {
            i2 = R.attr.z_;
        } else {
            i2 = R.attr.ee;
        }
        c419910GdJ.LJ = Integer.valueOf(i2);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        return C426750GoL.LJIILIIL(c419910GdJ.LIZ((Context) this.LLJLLL.getValue()), LLLLLJLJLL(z));
    }

    public final void LLLLLLIL(int i, View view) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, LLLLLL(i, true));
        stateListDrawable.addState(new int[0], LLLLLL(i, false));
        if (view != null) {
            view.setBackground(stateListDrawable);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iIntValue;
        Integer numLIZJ;
        Integer numLIZJ2;
        setTheme(R.style.y0);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c0l, viewGroup, false);
        this.LLJJJJ = (LinearLayout) viewTd.findViewById(R.id.ck9);
        this.LLJJJJJIL = (TuxTextView) viewTd.findViewById(R.id.cka);
        this.LLJJJIL = (C367060EaG) viewTd.findViewById(R.id.ck_);
        this.LLJJJJLIIL = viewTd.findViewById(R.id.bds);
        this.LLJJL = (LinearLayout) viewTd.findViewById(R.id.slq);
        this.LLJJLIIIJLLLLLLLZ = viewTd.findViewById(R.id.slr);
        this.LLJL = (LinearLayout) viewTd.findViewById(R.id.ck6);
        this.LLJLIL = viewTd.findViewById(R.id.ck7);
        this.LLJLILLLLZIIL = (LinearLayout) viewTd.findViewById(R.id.har);
        this.LLJLL = viewTd.findViewById(R.id.has);
        C367060EaG c367060EaG = this.LLJJJIL;
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
            c367060EaG.setProgress(LLLLILI().LIZ.LIZ.getFirst().intValue());
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_green_screen_fill;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ((Context) this.LLJLLL.getValue());
        tuxIconDrawableLIZ.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, LLLLLJLJLL(true));
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_color_green_screen_fill;
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        LayerDrawable layerDrawableLJIILIIL2 = C426750GoL.LJIILIIL(c419910GdJ2.LIZ((Context) this.LLJLLL.getValue()), LLLLLJLJLL(false));
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, layerDrawableLJIILIIL);
        stateListDrawable.addState(new int[0], layerDrawableLJIILIIL2);
        View view = this.LLJJJJLIIL;
        if (view != null) {
            view.setBackground(stateListDrawable);
        }
        LLLLLLIL(R.raw.icon_quick_brush, this.LLJJLIIIJLLLLLLLZ);
        LLLLLLIL(R.raw.icon_brush, this.LLJLIL);
        LLLLLLIL(R.raw.icon_eraser_fill, this.LLJLL);
        return (ViewGroup) viewTd;
    }
}
