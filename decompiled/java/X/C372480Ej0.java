package X;

import Y.ARunnableS105S0100000_5;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import ayh.i5;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.als.h0;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sharepanel.api.util.IDMSendToFriendMenuActionHelper;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.oh;
import com.ss.android.ugc.editorpro.components.api.text.editpanel.IEPTextEditPanelService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ej0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C372480Ej0 extends AbstractC1664490tPr<C372140EiS, C372350Ein> implements InterfaceC358800E4w, InterfaceC524950KiL, InterfaceC372510Ej3 {
    public static final int LLLLLILLIL = C366700EZg.LIZ(44.0d);
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public boolean LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public Boolean LLJL;
    public final C01GW LLJLIL;
    public final C0EGJ LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public InterfaceC359950E9h LLJZ;
    public C0EY2 LLJZIJLIL;
    public C0E5S LLL;
    public InterfaceC372680EjK LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public long LLLIILIL;
    public final h0<Boolean> LLLIL;
    public C0EGE LLLILZ;
    public final ArrayList<C0ETV> LLLILZJ;
    public final LinkedList<InterfaceC362610EJn> LLLILZLLLI;
    public final C01GW LLLIZZ;
    public C0ETT LLLJ;
    public Long LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final C01GW LLLLIILL;
    public final C01GW LLLLIILLL;
    public final C01GW LLLLIL;
    public final C01GW LLLLILI;
    public int LLLLJ;
    public C372830EjZ LLLLJI;
    public final C01GW LLLLL;
    public final C372640EjG LLLLLIL;

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
    }

    @Override // X.InterfaceC372510Ej3
    public final void sr() {
        this.LLJJJJJIL = false;
        onHide();
    }

    @Override // X.InterfaceC372510Ej3
    public final C0E48 LIZIZ() {
        return (C0E48) this.LLLFFI.getValue();
    }

    @Override // X.InterfaceC372510Ej3
    /* JADX INFO: renamed from: LLLLLJLJLL, reason: merged with bridge method [inline-methods] */
    public final C360770ECl Wq() {
        return (C360770ECl) this.LLLL.getValue();
    }

    public final C1407020mia LLLLLL() {
        return (C1407020mia) this.LLLI.getValue();
    }

    public final C372520Ej4 LLLLLLIL() {
        return (C372520Ej4) this.LLLLILI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLLLLL() {
        TextView textView;
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        final C372490Ej1 c372490Ej1 = (C372490Ej1) this.LLLLIL.getValue();
        int i = 0;
        Integer num = 0;
        boolean z2 = (c372490Ej1.LJIIIIZZ == null || c372490Ej1.LJIIIZ == null) ? false : true;
        View viewLJ = c372490Ej1.LJ(R.id.aiq);
        TuxIconView tuxIconView = (TuxIconView) c372490Ej1.LJ(R.id.air);
        View viewLJ2 = c372490Ej1.LJ(R.id.aiu);
        View viewLJ3 = c372490Ej1.LJ(R.id.ais);
        TuxIconView tuxIconView2 = (TuxIconView) c372490Ej1.LJ(R.id.ait);
        c372490Ej1.LJIIIIZZ = tuxIconView;
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        if (C288180BRg.LIZ() || c372490Ej1.LIZ().LIZ) {
            c372490Ej1.LJIIIIZZ = tuxIconView;
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            C786410Ut5.LJLLLLLL(8, viewLJ);
        } else {
            c372490Ej1.LJIIIIZZ = viewLJ;
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            C786410Ut5.LJLLLLLL(0, viewLJ);
        }
        boolean z3 = C288180BRg.LIZ() && !c372490Ej1.LIZ().LJIJI;
        boolean z4 = c372490Ej1.LIZ().LIZ || c372490Ej1.LIZ().LIZJ || c372490Ej1.LIZ().LJIJI;
        if (z3) {
            c372490Ej1.LJIIIZ = tuxIconView2;
            C786410Ut5.LJLLLLLL(8, viewLJ2);
            C786410Ut5.LJLLLLLL(8, viewLJ3);
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
        } else if (z4) {
            c372490Ej1.LJIIIZ = viewLJ3;
            C786410Ut5.LJLLLLLL(8, viewLJ2);
            C786410Ut5.LJLLLLLL(0, viewLJ3);
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        } else {
            c372490Ej1.LJIIIZ = viewLJ2;
            C786410Ut5.LJLLLLLL(0, viewLJ2);
            C786410Ut5.LJLLLLLL(8, viewLJ3);
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        }
        if (c372490Ej1.LIZ().LJII) {
            C786410Ut5.LJLLLLLL(8, viewLJ);
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            C786410Ut5.LJLLLLLL(8, viewLJ2);
            C786410Ut5.LJLLLLLL(8, viewLJ3);
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        }
        if (!z2 || C288180BRg.LIZ()) {
            Integer numLIZ = C1308910kAL.LIZ(R.attr.a04, viewLJ3.getContext());
            viewLJ3.setBackgroundColor(numLIZ != null ? numLIZ.intValue() : 0);
            C1447470nlp.LIZIZ(viewLJ3, C418440Gaw.LIZIZ(16));
            if (C288180BRg.LIZ()) {
                if (C293810BfP.LIZ()) {
                    ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
                    C786410Ut5.W5(tuxIconView, layoutParams);
                    C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num))), null, null, null, false, 30);
                    tuxIconView = tuxIconView;
                    num = num;
                    C426750GoL.LJIIL(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 16);
                } else {
                    tuxIconView = tuxIconView;
                    ViewGroup.LayoutParams layoutParams2 = tuxIconView.getLayoutParams();
                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        marginLayoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                        marginLayoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                        C786410Ut5.M6(tuxIconView, marginLayoutParams2);
                    }
                }
                tuxIconView = tuxIconView;
            }
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, c372490Ej1.LIZIZ(true));
            stateListDrawable.addState(new int[0], c372490Ej1.LIZIZ(false));
            tuxIconView.setImageDrawable(stateListDrawable);
            if (z3) {
                if (C293810BfP.LIZ()) {
                    ViewGroup.LayoutParams layoutParams3 = tuxIconView2.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                    layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
                    C786410Ut5.W5(tuxIconView2, layoutParams3);
                    C426750GoL.LJIIIZ(tuxIconView2, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num))), null, false, 27);
                    C426750GoL.LJIIL(tuxIconView2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 16);
                } else {
                    ViewGroup.LayoutParams layoutParams4 = tuxIconView2.getLayoutParams();
                    if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                        marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                        marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                        C786410Ut5.M6(tuxIconView2, marginLayoutParams);
                    }
                }
                StateListDrawable stateListDrawable2 = new StateListDrawable();
                stateListDrawable2.addState(new int[]{android.R.attr.state_pressed}, c372490Ej1.LIZLLL(true));
                stateListDrawable2.addState(new int[0], c372490Ej1.LIZLLL(false));
                tuxIconView2.setImageDrawable(stateListDrawable2);
            } else if (z4) {
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.ob, viewLJ3.getContext());
                viewLJ3.setBackgroundColor(numLIZ2 != null ? numLIZ2.intValue() : 0);
                C1447470nlp.LIZIZ(viewLJ3, C418440Gaw.LIZIZ(16));
                if (c372490Ej1.LIZ().LJIJI && (viewLJ3 instanceof TuxTextView) && (textView = (TextView) viewLJ3) != null) {
                    textView.setText(c372490Ej1.LIZ.getContext().getString(2131826858));
                    ViewGroup.LayoutParams layoutParams5 = textView.getLayoutParams();
                    if (layoutParams5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams5.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                    C786410Ut5.W5(textView, layoutParams5);
                    C426750GoL.LJIIIZ(textView, null, num, null, Integer.valueOf(C293810BfP.LIZ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) : 0), false, 21);
                    C1447470nlp.LIZIZ(textView, C418440Gaw.LIZIZ(200));
                }
            }
            if (c372490Ej1.LIZ().LJIIIIZZ && C1388580mEq.LIZIZ(c372490Ej1.LIZIZ.invoke())) {
                C786410Ut5.hc(tuxIconView2, -1.0f);
            } else {
                C786410Ut5.hc(tuxIconView2, 1.0f);
            }
            C0ETT c0ettLIZ = c372490Ej1.LIZ();
            if (C295260Bhk.LIZ()) {
                z = !(c0ettLIZ.LJIIIIZZ || c0ettLIZ.LJIL || c0ettLIZ.LJIJJLI || c0ettLIZ.LJIJI || c0ettLIZ.LIZJ);
            } else {
                z = false;
            }
            if (z && z3) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c372490Ej1.LJ(R.id.gct);
                TuxIconView tuxIconView3 = (TuxIconView) constraintLayout.findViewById(R.id.gtn);
                if (tuxIconView3 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                    c372490Ej1.LJIIJ = tuxIconView3;
                } else {
                    TuxIconView tuxIconView4 = new TuxIconView(c372490Ej1.LIZIZ.invoke(), null, i, 6, null == true ? 1 : 0);
                    tuxIconView4.setId(R.id.gtn);
                    C19ME c19me = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
                    c19me.endToEnd = 0;
                    c19me.topToTop = 0;
                    C786410Ut5.M6(tuxIconView4, c19me);
                    C426750GoL.LJIIIZ(tuxIconView4, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, false, 25);
                    StateListDrawable stateListDrawable3 = new StateListDrawable();
                    stateListDrawable3.addState(new int[0], c372490Ej1.LIZJ(false));
                    stateListDrawable3.addState(new int[]{android.R.attr.state_pressed}, c372490Ej1.LIZJ(true));
                    tuxIconView4.setImageDrawable(stateListDrawable3);
                    C19MB c19mb = new C19MB();
                    c19mb.LJII(constraintLayout);
                    c19mb.LJI(R.id.air, 4);
                    c19mb.LJI(R.id.ait, 4);
                    c19mb.LIZIZ(constraintLayout);
                    constraintLayout.addView(tuxIconView4);
                    ViewGroup.LayoutParams layoutParams6 = constraintLayout.getLayoutParams();
                    layoutParams6.height += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                    C786410Ut5.m6(constraintLayout, layoutParams6);
                    c372490Ej1.LJIIJ = tuxIconView4;
                    C377000EqI.LIZ(tuxIconView4);
                    final int i2 = 0;
                    C786410Ut5.a9(tuxIconView4, new AbstractViewOnClickListenerC372950Ejl(c372490Ej1, i2) { // from class: X.0FWp
                        public final int $t;
                        public Object l0;

                        @Override // X.AbstractViewOnClickListenerC372950Ejl
                        public final void LIZ(View view) {
                            switch (this.$t) {
                                case 0:
                                    LIZ$0(this, view);
                                    break;
                                case 1:
                                    LIZ$1(this, view);
                                    break;
                                default:
                                    super.LIZ(view);
                                    break;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(500L);
                            this.$t = i2;
                            this.l0 = c372490Ej1;
                        }

                        public static final void LIZ$0(C391490FWp c391490FWp, View view) {
                            ((C372490Ej1) c391490FWp.l0).LJFF.invoke();
                        }

                        public static final void LIZ$1(C391490FWp c391490FWp, View view) {
                            ((C372490Ej1) c391490FWp.l0).LJ.invoke();
                        }
                    });
                }
            } else {
                TuxIconView tuxIconView5 = (TuxIconView) c372490Ej1.LJ(R.id.gct).findViewById(R.id.gtn);
                if (tuxIconView5 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView5, 4);
                }
            }
            C377000EqI.LIZ(viewLJ);
            C377000EqI.LIZ(tuxIconView);
            C377000EqI.LIZ(viewLJ2);
            C377000EqI.LIZ(viewLJ3);
            C377000EqI.LIZ(tuxIconView2);
            final int i3 = 1;
            AbstractViewOnClickListenerC372950Ejl abstractViewOnClickListenerC372950Ejl = new AbstractViewOnClickListenerC372950Ejl(c372490Ej1, i3) { // from class: X.0FWp
                public final int $t;
                public Object l0;

                @Override // X.AbstractViewOnClickListenerC372950Ejl
                public final void LIZ(View view) {
                    switch (this.$t) {
                        case 0:
                            LIZ$0(this, view);
                            break;
                        case 1:
                            LIZ$1(this, view);
                            break;
                        default:
                            super.LIZ(view);
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(500L);
                    this.$t = i3;
                    this.l0 = c372490Ej1;
                }

                public static final void LIZ$0(C391490FWp c391490FWp, View view) {
                    ((C372490Ej1) c391490FWp.l0).LJFF.invoke();
                }

                public static final void LIZ$1(C391490FWp c391490FWp, View view) {
                    ((C372490Ej1) c391490FWp.l0).LJ.invoke();
                }
            };
            C372740EjQ c372740EjQ = new C372740EjQ(c372490Ej1, viewLJ3, viewLJ2, tuxIconView2);
            C786410Ut5.I7(abstractViewOnClickListenerC372950Ejl, viewLJ);
            C786410Ut5.a9(tuxIconView, abstractViewOnClickListenerC372950Ejl);
            C786410Ut5.I7(c372740EjQ, viewLJ2);
            C786410Ut5.I7(c372740EjQ, viewLJ3);
            C786410Ut5.a9(tuxIconView2, c372740EjQ);
        }
    }

    @Override // X.InterfaceC372510Ej3
    public final InterfaceC362470EIz Xq() {
        return (InterfaceC362470EIz) this.LLLFZ.getValue();
    }

    @Override // X.InterfaceC372510Ej3
    public final InterfaceC1453760nvy br() {
        return (InterfaceC1453760nvy) this.LLLJL.getValue();
    }

    @Override // X.InterfaceC372510Ej3
    public final C0EGY cr() {
        return (C0EGY) this.LLLIIIL.getValue();
    }

    @Override // X.InterfaceC372510Ej3
    public final C0EB6 er() {
        return (C0EB6) this.LLLIIIIL.getValue();
    }

    @Override // X.InterfaceC372510Ej3
    public final C19GS getAppCompatActivity() {
        Activity activity = this.mActivity;
        if (activity instanceof C19GS) {
            return (C19GS) activity;
        }
        return null;
    }

    @Override // X.InterfaceC372510Ej3
    public final VideoPublishEditModel getEditModel() {
        LiveData<C0EHI> liveDataZu2;
        C0EHI value;
        C0EHJ c0ehj;
        C0EY2 c0ey2 = this.LLJZIJLIL;
        if (c0ey2 == null || (liveDataZu2 = c0ey2.zu2()) == null || (value = liveDataZu2.getValue()) == null || (c0ehj = value.LIZ) == null) {
            return null;
        }
        return c0ehj.LIZ;
    }

    @Override // X.InterfaceC372510Ej3
    public final void gr() {
        C19A3 c19a3;
        Scene scene = this.mParentScene;
        if (!(scene instanceof C19A3) || (c19a3 = (C19A3) scene) == null) {
            return;
        }
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        C201955140j.LJIILJJIL(c563650M8t, "EditorProScene finish EditorProScene begin");
        c19a3.hide(this);
        C201955140j.LJIILJJIL(c563650M8t, "EditorProScene finish EditorProScene end");
    }

    @Override // X.InterfaceC372510Ej3
    public final View jr() {
        C372490Ej1 c372490Ej1 = (C372490Ej1) this.LLLLIL.getValue();
        c372490Ej1.getClass();
        return (View) new C443120HZe(c372490Ej1.LJIIIIZZ, c372490Ej1.LJIIIZ, c372490Ej1.LJIIJ).getFirst();
    }

    @Override // X.InterfaceC372510Ej3
    public final InterfaceC372610EjD lr() {
        return (InterfaceC372610EjD) this.LLLII.getValue();
    }

    @Override // X.InterfaceC372510Ej3
    public final InterfaceC377490Er5 mr() {
        return (InterfaceC377490Er5) this.LLLFF.getValue();
    }

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        C0E48 c0e48;
        InterfaceC372810EjX config;
        MutableLiveData mutableLiveDataLIZ;
        InterfaceC524950KiL interfaceC524950KiL;
        ArrayList<C0E9K> arrayList;
        C363500EMy.LIZ.getClass();
        C363500EMy.LJIIJ = false;
        C363500EMy.LJIIJJI = false;
        C0E48 c0e48LIZIZ = LIZIZ();
        if (c0e48LIZIZ != null) {
            c0e48LIZIZ.onVisibilityChanged(false);
        }
        C0E5X c0e5x = C0E5X.LIZ;
        String str = this.LLJJL;
        if (str != null) {
            ConcurrentHashMap<String, ArrayList<C0E9K>> concurrentHashMap = C0E5X.LIZIZ;
            if (concurrentHashMap.containsKey(str) && (arrayList = concurrentHashMap.get(str)) != null) {
                Iterator<C0E9K> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onHide();
                }
            }
        }
        C128Y c128yLIZ = C372650EjH.LIZ(this);
        if ((c128yLIZ instanceof InterfaceC524950KiL) && (interfaceC524950KiL = (InterfaceC524950KiL) c128yLIZ) != null) {
            interfaceC524950KiL.T4((InterfaceC484050IyZ) this.LLLLL.getValue());
            C1447800nmM.LIZIZ(this).LLLLLLLZIL((InterfaceC1737690vJv) this.LLLIZZ.getValue());
        }
        this.LLJJLIIIJLLLLLLLZ = false;
        C1407020mia c1407020miaLLLLLL = LLLLLL();
        c1407020miaLLLLLL.getClass();
        if (!C306610C0d.LIZ()) {
            c1407020miaLLLLLL.LJI();
        }
        C1407020mia c1407020miaLLLLLL2 = LLLLLL();
        c1407020miaLLLLLL2.getClass();
        if (C0A1M.LIZ()) {
            c1407020miaLLLLLL2.LJIIIZ = false;
            C0E48 c0e482 = c1407020miaLLLLLL2.LIZ;
            if (c0e482 != null && (mutableLiveDataLIZ = c0e482.S7().LIZ("_is_editor_pro_context_init_finish")) != null) {
                mutableLiveDataLIZ.removeObserver((Observer) c1407020miaLLLLLL2.LJII.getValue());
            }
            if (C0A1M.LIZ() && c1407020miaLLLLLL2.LJIIIIZZ >= 0 && (c0e48 = c1407020miaLLLLLL2.LIZ) != null && (config = c0e48.getConfig()) != null) {
                config.setPageMode(c1407020miaLLLLLL2.LJIIIIZZ);
            }
            if (C306610C0d.LIZ()) {
                oh.LJ("tool_editor_pro_scene");
            }
            c1407020miaLLLLLL2.LJI();
        }
        VideoPublishEditModel editModel = getEditModel();
        if (editModel != null) {
            C361680EFy.LJJJLZIJ(editModel);
        }
        if (C306610C0d.LIZ()) {
            return;
        }
        C0CHQ.LIZ().LJIIL().updateCurrentScene("tool_editor_pro_scene", false);
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        C0E48 c0e48;
        MutableLiveData mutableLiveDataLIZ;
        InterfaceC524950KiL interfaceC524950KiL;
        Boolean bool = this.LLJL;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            this.LLJL = Boolean.FALSE;
        }
        if (this.LLJL == null) {
            this.LLJL = bool2;
        }
        C359780E8q.LIZ("updateSaveAndCancelBtn", new AwS549S0100000_5(this, 858));
        View view = this.mView;
        if (view != null) {
            C0T6I.LIZ(view, new AwS549S0100000_5(this, 859));
        }
        C0ETT c0ett = this.LLLJ;
        if (c0ett.LJIIIIZZ && !c0ett.LJIL) {
            LLLLLLJ(new AwS549S0100000_5(this, 829));
        }
        if (this.LLLJ.LIZLLL) {
            LLLLLLIL().LIZJ();
        }
        C128Y c128yLIZIZ = C372650EjH.LIZIZ(this);
        if ((c128yLIZIZ instanceof InterfaceC524950KiL) && (interfaceC524950KiL = (InterfaceC524950KiL) c128yLIZIZ) != null) {
            interfaceC524950KiL.Qh((InterfaceC484050IyZ) this.LLLLL.getValue());
            C1447800nmM.LIZIZ(this).LLLIILIL(this, (InterfaceC1737690vJv) this.LLLIZZ.getValue());
        }
        C372830EjZ c372830EjZ = this.LLLLJI;
        if (c372830EjZ != null) {
            C786410Ut5.ed(c372830EjZ.getControlLayout(), 0.0f);
            FrameLayout grabberView = c372830EjZ.getGrabberView();
            if (grabberView != null) {
                C786410Ut5.fd(grabberView, 0.0f);
            }
            C372820EjY.LIZJ(c372830EjZ, 1.0f);
            C373000Ejq.LIZ(c372830EjZ, true);
        }
        C372500Ej2 c372500Ej2 = (C372500Ej2) this.LLJLLIL.getValue();
        C786410Ut5.R4(1.0f, c372500Ej2.LIZ);
        C786410Ut5.bd(0.0f, c372500Ej2.LIZ);
        C786410Ut5.T4(c372500Ej2.LIZLLL, 1.0f);
        C786410Ut5.ed(c372500Ej2.LIZLLL, 0.0f);
        C786410Ut5.T4(c372500Ej2.LIZIZ, 1.0f);
        C786410Ut5.ed(c372500Ej2.LIZIZ, 0.0f);
        C786410Ut5.T4(c372500Ej2.LIZJ, 1.0f);
        C786410Ut5.ed(c372500Ej2.LIZJ, 0.0f);
        View view2 = c372500Ej2.LJ;
        if (view2 != null) {
            C786410Ut5.T4(view2, 1.0f);
            C786410Ut5.ed(view2, 0.0f);
        }
        this.LLJJLIIIJLLLLLLLZ = true;
        C1407020mia c1407020miaLLLLLL = LLLLLL();
        c1407020miaLLLLLL.getClass();
        if (!C306610C0d.LIZ()) {
            c1407020miaLLLLLL.LIZ();
        }
        C1407020mia c1407020miaLLLLLL2 = LLLLLL();
        c1407020miaLLLLLL2.getClass();
        if (C0A1M.LIZ() && (c0e48 = c1407020miaLLLLLL2.LIZ) != null) {
            c1407020miaLLLLLL2.LJIIIZ = true;
            if (c0e48.Ls()) {
                c1407020miaLLLLLL2.LJIIIIZZ();
            } else {
                C0E48 c0e482 = c1407020miaLLLLLL2.LIZ;
                if (c0e482 != null && (mutableLiveDataLIZ = c0e482.S7().LIZ("_is_editor_pro_context_init_finish")) != null) {
                    mutableLiveDataLIZ.observe(this, (Observer) c1407020miaLLLLLL2.LJII.getValue());
                }
            }
        }
        if (C306610C0d.LIZ()) {
            return;
        }
        C0CHQ.LIZ().LJIIL().updateCurrentScene("tool_editor_pro_scene", true);
    }

    @Override // X.InterfaceC372510Ej3
    public final InterfaceC365030ESv vr() {
        return (InterfaceC365030ESv) this.LLLIIII.getValue();
    }

    @Override // X.InterfaceC372510Ej3
    public final View xr() {
        return (View) this.LLJJJIL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v62, types: [X.0EjG] */
    public C372480Ej0() {
        C0FGC.LIZ(2);
        C0CHQ.LIZ().isDebugConfigOpen();
        this.LLJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 842));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 845));
        this.LLJLIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(733));
        this.LLJLILLLLZIIL = new C0EGJ();
        this.LLJLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 839));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 834));
        this.LLJLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 838));
        this.LLLFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 837));
        this.LLLFFI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 847));
        this.LLLFZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 849));
        this.LLLI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 848));
        this.LLLII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 854));
        this.LLLIIII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 852));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 853));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 836));
        this.LLLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 835));
        this.LLLIILIL = System.currentTimeMillis();
        this.LLLIL = new h0<>(Boolean.FALSE);
        this.LLLILZJ = new ArrayList<>();
        this.LLLILZLLLI = new LinkedList<>();
        this.LLLIZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 856));
        this.LLLJ = new C0ETT(0);
        this.LLLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 846));
        this.LLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 844));
        this.LLLLII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 850));
        this.LLLLIIIILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 843));
        this.LLLLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 841));
        this.LLLLIILL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 833));
        this.LLLLIILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 831));
        this.LLLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 840));
        this.LLLLILI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 851));
        this.LLLLJ = -1;
        this.LLLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 855));
        this.LLLLLIL = new C18ZN() { // from class: X.0EjG
            @Override // X.C18ZN
            public final void onAppForeground() {
            }

            @Override // X.C18ZN
            public final void onAppBackground() {
                C0E55 player;
                C0E48 c0e48LIZIZ = this.LL.LIZIZ();
                if (c0e48LIZIZ == null || (player = c0e48LIZIZ.getPlayer()) == null) {
                    return;
                }
                player.pause(false);
            }
        };
    }

    @Override // X.InterfaceC372510Ej3
    public final boolean Bg() {
        return LLLLILI().LIZ.LIZJ;
    }

    @Override // X.InterfaceC372510Ej3
    public final void hr() {
        RecyclerView recyclerViewLLII;
        C0EGY c0egyCr = cr();
        InterfaceC359940E9g interfaceC359940E9gAZ0 = c0egyCr != null ? c0egyCr.AZ0() : null;
        C0ECG c0ecg = C361700EGa.LIZ;
        if (c0ecg != null) {
            if (interfaceC359940E9gAZ0 != null && (recyclerViewLLII = interfaceC359940E9gAZ0.LLII()) != null) {
                recyclerViewLLII.removeOnScrollListener(c0ecg);
            }
            C361700EGa.LIZ = null;
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        ArrayList<C0E9K> arrayList;
        RecyclerView recyclerViewLLII;
        super.onDestroyView();
        ((ArrayList) C350440DoY.LIZ).clear();
        C350440DoY.LIZIZ = null;
        C0EGY c0egyCr = cr();
        InterfaceC359940E9g interfaceC359940E9gAZ0 = c0egyCr != null ? c0egyCr.AZ0() : null;
        C0ECG c0ecg = C361700EGa.LIZ;
        if (c0ecg != null) {
            if (interfaceC359940E9gAZ0 != null && (recyclerViewLLII = interfaceC359940E9gAZ0.LLII()) != null) {
                recyclerViewLLII.removeOnScrollListener(c0ecg);
            }
            C361700EGa.LIZ = null;
        }
        C372670EjJ.LIZIZ = C560010Lxn.LIZ;
        LLLLLL().LJI();
        C0E5X c0e5x = C0E5X.LIZ;
        String str = this.LLJJL;
        synchronized (c0e5x) {
            if (str != null) {
                ConcurrentHashMap<String, ArrayList<C0E9K>> concurrentHashMap = C0E5X.LIZIZ;
                if (concurrentHashMap.containsKey(str) && (arrayList = concurrentHashMap.get(str)) != null) {
                    Iterator<C0E9K> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().onDestroy();
                    }
                    arrayList.clear();
                }
                ConcurrentHashMap<String, C0E5Y> concurrentHashMap2 = C0E5X.LIZJ;
                if (concurrentHashMap2.containsKey(str)) {
                    concurrentHashMap2.remove(str);
                }
                Stack<String> stack = C0E5X.LIZLLL;
                stack.remove(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CKLifecycleManager#notifyOnDestroy, token = ");
                sbLIZ.append(str);
                sbLIZ.append(", tokenStack = ");
                sbLIZ.append(stack);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap3 = C364210EPr.LIZ;
        C364210EPr.LIZ(this.LLJJJJLIIL);
        C363500EMy.LIZ.getClass();
        C1459930o5v c1459930o5v = C363500EMy.LJIIIIZZ;
        if (c1459930o5v != null) {
            ((C11NJ) c1459930o5v.LJII.getValue()).LJ();
        }
        C363500EMy.LJIIIIZZ = null;
        C569620MVs.LIZ();
        C524780Ki4.LIZ.leave(requireActivity(), "tool_editor_pro");
        ActivityStack.removeAppBackGroundListener(this.LLLLLIL);
        C0CRH.LL.getClass();
        AnonymousClass0956 anonymousClass0956 = C0CRH.LLILZ;
        if (anonymousClass0956 != null) {
            if (!anonymousClass0956.isCompleted()) {
                anonymousClass0956.LIZIZ(null);
            }
            C0CRH.LLILLL.removeCallbacksAndMessages(null);
        }
        C363500EMy.LIZLLL = null;
        C363500EMy.LJFF = null;
        C363500EMy.LJ = null;
        C363500EMy.LIZJ = null;
        ((ConcurrentHashMap) C365460EUm.LIZIZ).clear();
        ((ConcurrentHashMap) C365460EUm.LIZJ).clear();
        ((ConcurrentHashMap) C365460EUm.LIZ).clear();
        C354090DuR.LIZ.clear();
        C354090DuR.LIZIZ = null;
        CopyOnWriteArraySet<String> copyOnWriteArraySet = C354090DuR.LJI;
        copyOnWriteArraySet.clear();
        ((LinkedHashMap) C354090DuR.LJIIIZ).clear();
        copyOnWriteArraySet.clear();
        C354090DuR.LJIIJJI.clear();
        ((LinkedHashMap) C354090DuR.LJIIL).clear();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        VideoPublishEditModel editModel = getEditModel();
        C0E48 c0e48LIZIZ = LIZIZ();
        if (c0e48LIZIZ != null && editModel != null) {
            C524780Ki4.LIZ.pause(requireActivity(), "tool_performance_memory_usage_editorpro", "tool_editor_pro", editModel.mShootWay, editModel.getCreationId(), C350140Do4.LIZ(c0e48LIZIZ.getPlayer().qq(), C350870DpF.LJI(c0e48LIZIZ)));
        }
        oh.LJ("tool_editor_pro_enter");
        IDMSendToFriendMenuActionHelper.LIZ.getClass();
        IDMSendToFriendMenuActionHelper iDMSendToFriendMenuActionHelperLIZ = C380260EvY.LIZ();
        if (iDMSendToFriendMenuActionHelperLIZ != null) {
            iDMSendToFriendMenuActionHelperLIZ.LIZJ(false);
        }
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        C1741940vQm.LIZ(requireActivity());
        if (this.LLJJJJJIL) {
            this.LLJJJJJIL = false;
            onShow();
        }
        if (this.LLLJ.LIZLLL && this.LLLJIL == null) {
            View view = this.mView;
            C0T6I.LIZ(view, new C5179020b(0L, view, new AwS549S0100000_5(this, 857), 2));
        }
        IDMSendToFriendMenuActionHelper.LIZ.getClass();
        IDMSendToFriendMenuActionHelper iDMSendToFriendMenuActionHelperLIZ = C380260EvY.LIZ();
        if (iDMSendToFriendMenuActionHelperLIZ != null) {
            iDMSendToFriendMenuActionHelperLIZ.LIZJ(true);
            iDMSendToFriendMenuActionHelperLIZ.LIZLLL();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        Integer numLIZJ;
        Window window;
        super.onStart();
        LLLLLLIL().LJFF = false;
        this.LLLIILIL = System.currentTimeMillis();
        if (LLLLLLIL().LJI) {
            LLLLIL().LJIIJJI.invoke();
            LLLLIL().LJIIIIZZ.invoke();
            LLLLLLIL().LJI = false;
            View view = this.mView;
            if (view != null) {
                C0T6I.LIZ(view, new AwS549S0100000_5(this, 830));
            }
            LLLLLLJ(new AwS549S0100000_5(this, 832));
        }
        if (C301730BsB.LIZ()) {
            C0EHK.LJFF((C19EG) requireActivity());
        }
        Context contextLIZIZ = C545820Lau.LIZIZ(this);
        if (contextLIZIZ == null || (numLIZJ = C1308910kAL.LIZJ(C0EGL.LIZ(), contextLIZIZ)) == null) {
            return;
        }
        int iIntValue = numLIZJ.intValue();
        Activity activity = this.mActivity;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setNavigationBarColor(iIntValue);
    }

    @Override // X.InterfaceC372510Ej3
    public final C1DRG tr() {
        return C1664600tQ2.LJIIIZ(this);
    }

    @Override // X.InterfaceC372510Ej3
    public final AbstractC214814194y wr() {
        return C372650EjH.LIZIZ(this);
    }

    @Override // X.InterfaceC372510Ej3
    public final h0<Boolean> Zq() {
        return this.LLLIL;
    }

    @Override // X.InterfaceC372510Ej3
    public final C0EY2 ar() {
        return this.LLJZIJLIL;
    }

    @Override // X.InterfaceC372510Ej3
    public final String dr() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC372510Ej3
    public final C0E5S fr() {
        return this.LLL;
    }

    @Override // X.InterfaceC372510Ej3
    public final C0ETT kr() {
        return this.LLLJ;
    }

    @Override // X.InterfaceC372510Ej3
    public final Boolean nr() {
        return this.LLJL;
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
    }

    @Override // X.InterfaceC372510Ej3
    public final InterfaceC372680EjK or() {
        return this.LLLF;
    }

    @Override // X.InterfaceC372510Ej3
    public final InterfaceC359950E9h qr() {
        return this.LLJZ;
    }

    @Override // X.InterfaceC372510Ej3
    public final LinkedList<InterfaceC362610EJn> ur() {
        return this.LLLILZLLLI;
    }

    @Override // X.InterfaceC372510Ej3
    public final C372830EjZ xj() {
        return this.LLLLJI;
    }

    @Override // X.InterfaceC358800E4w
    public final void LJLJL(C0ETV c0etv) {
        if (this.LLLILZJ.contains(c0etv)) {
            this.LLLILZJ.remove(c0etv);
        }
    }

    @Override // X.InterfaceC358800E4w
    public final void LLILLIZIL(C0ETV c0etv) {
        if (!this.LLLILZJ.contains(c0etv)) {
            this.LLLILZJ.add(c0etv);
        }
    }

    public final void LLLLLLJ(Function0<Unit> function0) {
        View view = this.mView;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS105S0100000_5(function0, (Function0<Unit>) 69));
        }
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLLILZLLLI.remove(interfaceC362610EJn);
    }

    @Override // X.InterfaceC372510Ej3
    public final void ir(boolean z) {
        C1DRG c1drgLJIIIZ;
        InterfaceC1455860nzM interfaceC1455860nzM;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        C363500EMy.LIZ.getClass();
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED) && (c1drgLJIIIZ = C1664600tQ2.LJIIIZ(this)) != null && (interfaceC1455860nzM = (InterfaceC1455860nzM) c1drgLJIIIZ.LJIIL(null, InterfaceC1455860nzM.class)) != null && (liveDataG = interfaceC1455860nzM.g()) != null && (value = liveDataG.getValue()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null) {
            NLEEditor nLEEditor = c348100DkmLIZIZ.LIZ;
            INLEPlayer playerApi = c348100DkmLIZIZ.LIZIZ.getPlayerApi();
            C348100Dkm c348100Dkm = C363500EMy.LIZJ;
            if (c348100Dkm != null && (iNLEMediaSession = c348100Dkm.LIZIZ) != null) {
                iNLEMediaSession.updateNLEEditor(nLEEditor);
            }
            if (z) {
                playerApi.seekTime(0L, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek);
            }
        }
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        if (!this.LLLILZLLLI.contains(interfaceC362610EJn)) {
            this.LLLILZLLLI.addFirst(interfaceC362610EJn);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        String string;
        super.onActivityCreated(bundle);
        final C19EG c19eg = (C19EG) requireActivity();
        C372670EjJ.LIZIZ = new InterfaceC372760EjS(c19eg) { // from class: X.0Ej8
            public final Activity LIZ;
            public C1390360mHi LIZIZ;

            {
                this.LIZ = c19eg;
            }

            @Override // X.InterfaceC372760EjS
            public final void LIZ(Context context, String str) {
                if (this.LIZ.isFinishing()) {
                    return;
                }
                C1390360mHi c1390360mHi = this.LIZIZ;
                if (c1390360mHi != null) {
                    c1390360mHi.dismiss();
                    this.LIZIZ = null;
                }
                C1390390mHl c1390390mHl = C1390390mHl.LIZ;
                Activity activity = this.LIZ;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(str);
                creativeToastBuilder.acrossActivities(true);
                creativeToastBuilder.isTuxToast(true);
                C1390360mHi c1390360mHi2 = (C1390360mHi) c1390390mHl.createToast(activity, 1074, creativeToastBuilder);
                this.LIZIZ = c1390360mHi2;
                c1390360mHi2.show();
            }
        };
        C0EHK.LJII((C19EG) requireActivity());
        C19A3 c19a3Invoke = LLLLIL().LJIIL.invoke();
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        this.LLJJJJLIIL = C364210EPr.LJ(new C364220EPs(c19a3Invoke));
        C0E5X c0e5x = C0E5X.LIZ;
        C0E5Y c0e5y = new C0E5Y(this) { // from class: X.0E5Z
            public final Scene LIZ;

            @Override // X.C0E5Y
            public final Scene getLifecycleOwner() {
                return this.LIZ;
            }

            {
                this.LIZ = this;
            }
        };
        synchronized (c0e5x) {
            string = UUID.randomUUID().toString();
            C0E5X.LIZJ.put(string, c0e5y);
            C0E5X.LIZIZ.put(string, new ArrayList<>());
            C0E5X.LIZLLL.push(string);
        }
        this.LLJJL = string;
        C0ETT c0ett = this.LLLJ;
        h0<Boolean> h0Var = this.LLLIL;
        C372830EjZ c372830EjZ = this.LLLLJI;
        this.LLJLL.getValue().getClass();
        int iLIZ = C0ES3.LIZ();
        int iLIZ2 = ((C0ES4) this.LLJLL.getValue()).LIZ();
        InterfaceC362350EIn interfaceC362350EIn = (InterfaceC362350EIn) this.LLJLLL.getValue();
        IEPTextEditPanelService iEPTextEditPanelService = (IEPTextEditPanelService) this.LLJLIL.getValue();
        C0ET7 c0et7 = new C0ET7(this);
        AwS584S0100000_5 awS584S0100000_5 = new AwS584S0100000_5(this, 741);
        C372350Ein c372350EinLLLLIL = LLLLIL();
        C372500Ej2 c372500Ej2 = (C372500Ej2) this.LLJLLIL.getValue();
        C1654320t9S.LIZIZ(this, AFwS234S0000000_5.get$arr$(356));
        C1664590tQ1.LIZLLL(this, "EditorProScene", false, AFwS234S0000000_5.get$arr$(359), 2);
        C1664600tQ2.LIZ(this, "EditorProSceneV2", new C364950ESn(iLIZ, iLIZ2, h0Var, c372830EjZ, iEPTextEditPanelService, c372500Ej2, this, c372350EinLLLLIL, interfaceC362350EIn, c0ett, awS584S0100000_5, c0et7));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg != null) {
            InterfaceC359950E9h interfaceC359950E9h = (InterfaceC359950E9h) c1drg.LJIIL(null, InterfaceC359950E9h.class);
            C0EY2 c0ey2 = (C0EY2) c1drg.LJIIL(null, C0EY2.class);
            C0E5S c0e5s = (C0E5S) c1drg.LJIIL(null, C0E5S.class);
            InterfaceC372680EjK interfaceC372680EjK = (InterfaceC372680EjK) c1drg.LJIIL(null, InterfaceC372680EjK.class);
            this.LLJZ = interfaceC359950E9h;
            this.LLJZIJLIL = c0ey2;
            this.LLL = c0e5s;
            this.LLLF = interfaceC372680EjK;
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EjO
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C372140EiS) obj).LIZ;
                }
            }, new AwS584S0100000_5(this, 733));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EjN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C372140EiS) obj).LIZIZ);
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 735));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EiY
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C372140EiS) obj).LJ;
                }
            }, new AwS584S0100000_5(this, 736));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EiZ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C372140EiS) obj).LJI;
                }
            }, new AwS584S0100000_5(this, 738));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Eia
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C372140EiS) obj).LJFF;
                }
            }, new AwS584S0100000_5(this, 744));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Eib
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C372140EiS) obj).LJII;
                }
            }, new AwS584S0100000_5(this, 745));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Eic
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C372140EiS) obj).LJIIIIZZ;
                }
            }, new AwS584S0100000_5(this, 746));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Eid
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C372140EiS) obj).LJIIIZ;
                }
            }, new AwS584S0100000_5(this, 748));
            LLLLIL().LJII.invoke(new C372700EjM(this));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Eie
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C372140EiS) obj).LJIIJJI;
                }
            }, new AwS584S0100000_5(this, 750));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Eif
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C372140EiS) obj).LJIIL;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 753));
            ActivityStack.addAppBackGroundListener(this.LLLLLIL);
            ((LinkedHashMap) C0EU6.LJIIJ).clear();
            C361680EFy.LJLJJI("step2_perf_editor_pro_on_create_view");
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC372510Ej3
    public final void pr(VideoPublishEditModel videoPublishEditModel) {
        C0E48 c0e48LIZIZ;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLEModel nLEModelLLZ;
        C0E48 c0e48LIZIZ2;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2;
        NLEModel nLEModelLLZ2;
        if (C295830Bif.LIZ() && (c0e48LIZIZ = LIZIZ()) != null && (interfaceC351350Dq1LLFII = c0e48LIZIZ.LLFII()) != null && (nLEModelLLZ = interfaceC351350Dq1LLFII.LLZ()) != null && (c0e48LIZIZ2 = LIZIZ()) != null && (interfaceC351350Dq1LLFII2 = c0e48LIZIZ2.LLFII()) != null && (nLEModelLLZ2 = interfaceC351350Dq1LLFII2.LLZ()) != null) {
            int duration = (int) nLEModelLLZ2.getDuration();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C565910MHl());
            C1452150ntN.LJI(arrayList, videoPublishEditModel, nLEModelLLZ, null, duration);
        }
    }

    public final void LLLLLJIL(boolean z, boolean z2) {
        LLLLLLIL().LIZ(z, z2);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC372730EjP enumC372730EjP;
        Integer numLIZJ;
        int iLIZIZ;
        super.onViewCreated(view, bundle);
        C372580EjA c372580EjA = new C372580EjA(requireSceneContext());
        this.LLJLL.getValue().getClass();
        List<C372880Eje> listLJIILJJIL = C1697810uHb.LJIILJJIL(new C372880Eje(C0ES3.LIZ(), 2));
        if (((Boolean) C0B9A.LIZ.getValue()).booleanValue()) {
            enumC372730EjP = EnumC372730EjP.NO_VARIABLE;
        } else {
            enumC372730EjP = EnumC372730EjP.VARIABLE;
        }
        c372580EjA.LIZJ = enumC372730EjP;
        listLJIILJJIL.add(new C372880Eje(((C0ES4) this.LLJLL.getValue()).LIZ(), 2));
        int iLIZ = C363750ENx.LIZ();
        c372580EjA.LJIIIIZZ = C293810BfP.LIZ();
        if (iLIZ != -1) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIILJJIL, 10));
            Iterator<C372880Eje> it2 = listLJIILJJIL.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(it2.next().LIZ));
            }
            if (!arrayList.contains(Integer.valueOf(iLIZ))) {
                this.LLJLL.getValue().getClass();
                iLIZ = C0ES3.LIZ();
                C363750ENx.LJFF(iLIZ);
            }
        }
        Iterator<C372880Eje> it3 = listLJIILJJIL.iterator();
        int i = 0;
        while (true) {
            if (it3.hasNext()) {
                if (it3.next().LIZ == iLIZ) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        C1463700oC0.LIZJ(i, 0, listLJIILJJIL);
        this.LLLLJ = ((C372880Eje) C13LP.LJJJJZI(listLJIILJJIL)).LIZ;
        c372580EjA.LJII = true;
        c372580EjA.LIZLLL = listLJIILJJIL;
        System.currentTimeMillis();
        if (C288180BRg.LIZ()) {
            if (this.LLLJ.LJIIJJI) {
                c372580EjA.LIZIZ = EnumC372850Ejb.NAV_BAR_STYLE_V2;
            } else {
                c372580EjA.LIZIZ = EnumC372850Ejb.NAV_BAR_OVERLAY_AT_TOP;
            }
        }
        c372580EjA.LJ = C21146717pB.LIZIZ(c372580EjA.LIZ, R.layout.c1j, (ViewGroup) this.LLJJJJ.getValue(), false);
        View viewLIZIZ = C21146717pB.LIZIZ(c372580EjA.LIZ, R.layout.c0g, (ViewGroup) this.LLJJJJ.getValue(), false);
        System.currentTimeMillis();
        c372580EjA.LJI = viewLIZIZ;
        c372580EjA.LJFF = C786410Ut5.Td(C786410Ut5.ne(requireSceneContext()), R.layout.c1u, (ViewGroup) this.LLJJJJ.getValue(), false);
        C372830EjZ c372830EjZ = new C372830EjZ(c372580EjA);
        c372830EjZ.setId(R.id.f7k);
        this.LLLLJI = c372830EjZ;
        C19ME c19me = new C19ME(-1, -1);
        if (C297330Bl5.LIZ() == 0 || C297330Bl5.LIZ() == 1 || !C357540E0a.LJIILLIIL(requireSceneContext())) {
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = ScreenUtils.getStatusBarHeight(requireSceneContext());
        }
        ((ConstraintLayout) this.LLJJJJ.getValue()).addView(this.LLLLJI, 1, c19me);
        C372830EjZ c372830EjZ2 = this.LLLLJI;
        if (c372830EjZ2 != null) {
            c372830EjZ2.setMotionEventSplittingEnabled(false);
        }
        LLLLLLL();
        TuxTextView tuxTextView = (TuxTextView) this.LLLLIILLL.getValue();
        C372490Ej1 c372490Ej1 = (C372490Ej1) this.LLLLIL.getValue();
        c372490Ej1.getClass();
        View view2 = (View) new C443120HZe(c372490Ej1.LJIIIIZZ, c372490Ej1.LJIIIZ, c372490Ej1.LJIIJ).getSecond();
        View viewJr = jr();
        C372490Ej1 c372490Ej12 = (C372490Ej1) this.LLLLIL.getValue();
        c372490Ej12.getClass();
        this.LLLILZ = new C0EGE(tuxTextView, view2, viewJr, (View) new C443120HZe(c372490Ej12.LJIIIIZZ, c372490Ej12.LJIIIZ, c372490Ej12.LJIIJ).getThird(), (View) this.LLLLIILL.getValue(), (TuxTextView) this.LLLLIIIILLL.getValue(), (C1322110kVd) this.LLLLIIL.getValue(), (View) this.LLLLII.getValue(), xr(), (C361730EGd) this.LLJJJJ.getValue(), this.LLLLJI);
        C21690419ug c21690419ug = (C21690419ug) requireViewById(R.id.gcv);
        if (c21690419ug != null) {
            c21690419ug.getLayoutParams().height = C0ES4.LIZJ;
            c21690419ug.setHasFixSize(true);
        }
        View viewRequireViewById = requireViewById(R.id.ygy);
        ViewGroup.LayoutParams layoutParams = viewRequireViewById.getLayoutParams();
        if (layoutParams != null) {
            if (C357780E0y.LIZ()) {
                iLIZIZ = C0ES4.LIZLLL;
            } else {
                int i2 = this.LLLLJ;
                if (i2 != -1 && i2 != C0ES3.LIZ()) {
                    iLIZIZ = (this.LLLLJ - LLLLLILLIL) - C0ES4.LIZJ;
                } else {
                    iLIZIZ = C0ES3.LIZIZ();
                }
            }
            layoutParams.height = iLIZIZ;
        }
        C786410Ut5.W5(viewRequireViewById, viewRequireViewById.getLayoutParams());
        Context contextLIZIZ = C545820Lau.LIZIZ(this);
        if (contextLIZIZ != null && (numLIZJ = C1308910kAL.LIZJ(C0EGL.LIZ(), contextLIZIZ)) != null) {
            xr().setBackgroundColor(numLIZJ.intValue());
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Resources.Theme theme;
        C361680EFy.LJLJJI("step1_perf_editor_pro_click_to_on_create_view");
        C524780Ki4.LIZ.enter(requireActivity(), "tool_editor_pro");
        oh.LIZJ("tool_editor_pro_enter", i5.LIZIZ(), i5.LIZ(), null, null);
        setTheme(0);
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            Context sceneContext2 = getSceneContext();
            if (sceneContext2 != null) {
                theme = sceneContext2.getTheme();
            } else {
                theme = null;
            }
            C1388190mED.LJFF(sceneContext, theme);
        }
        return (ViewGroup) C20673215v0.LIZJ(R.layout.byu, requireActivity());
    }
}
