package X;

import Y.ACListenerS143S0100000_8;
import Y.AObserverS212S0100000_8;
import Y.ARunnableS108S0100000_8;
import Y.AsS35S0100000_8;
import android.content.ComponentCallbacks2;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.ListState$_liveData$1;
import com.ss.android.ugc.aweme.aiuikit.impl.input.mentionpanel.scene.MentionPanelCell;
import com.ss.android.ugc.aweme.aiuikit.impl.input.mentionpanel.scene.MentionReachLimitCell;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Lsq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C556940Lsq extends AbstractC1664490tPr<C555130Lpv, C555100Lps> {
    public ViewGroup LLJJJJ;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 922));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 921));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 923));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 924));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 919));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 920));
    public final ARunnableS108S0100000_8 LLJLIL = new ARunnableS108S0100000_8(this, 110);
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 918));
    public final ViewTreeObserverOnGlobalLayoutListenerC581000MqY LLJLLL = new ViewTreeObserverOnGlobalLayoutListenerC581000MqY(this, 4);

    public final C21636319lx LLLLLJLJLL() {
        return (C21636319lx) this.LLJLILLLLZIIL.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv LLLLLL() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJJJJIL.getValue();
    }

    public final View LLLLLLIL() {
        return (View) this.LLJJJIL.getValue();
    }

    public final FrameLayout LLLLLLJ() {
        return (FrameLayout) this.LLJJL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLLLLJIL() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C556940Lsq.LLLLLJIL():int");
    }

    public final void LLLLLLL() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLL = LLLLLL();
        if (viewOnAttachStateChangeListenerC20604515jvLLLLLL != null) {
            C786410Ut5.LJLLLLLL(8, viewOnAttachStateChangeListenerC20604515jvLLLLLL);
        }
        View view = this.mView;
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this.LLJLIL);
        }
        C436180H8m.LIZIZ(LLLLLLJ());
        C786410Ut5.LJLLLLLL(0, (View) this.LLJJLIIIJLLLLLLLZ.getValue());
        LLLLIL().LIZIZ.invoke();
    }

    public final void LLLLLLLLL() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLL = LLLLLL();
        if (viewOnAttachStateChangeListenerC20604515jvLLLLLL != null) {
            C786410Ut5.LJLLLLLL(0, viewOnAttachStateChangeListenerC20604515jvLLLLLL);
        }
        View view = this.mView;
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this.LLJLIL);
        }
        C436180H8m.LIZIZ(LLLLLLJ());
        C436180H8m.LIZIZ((View) this.LLJJLIIIJLLLLLLLZ.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LLLLLLLLLL() {
        C20600815jK<InterfaceC1891350zJl> state;
        ListState$_liveData$1 listState$_liveData$1;
        C20600915jL value;
        Function1<List<C555070Lpp>, Unit> function1 = LLLLIL().LIZJ;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLL = LLLLLL();
        Object obj = (viewOnAttachStateChangeListenerC20604515jvLLLLLL == null || (state = viewOnAttachStateChangeListenerC20604515jvLLLLLL.getState()) == null || (listState$_liveData$1 = state.LIZIZ) == null || (value = listState$_liveData$1.getValue()) == null) ? null : value.LIZ;
        function1.invoke(obj instanceof List ? obj : null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C20600815jK<InterfaceC1891350zJl> state;
        super.onViewCreated(view, bundle);
        LLLLLLIL().setForeground(LLLLIL().LIZ.invoke());
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLL = LLLLLL();
        if (viewOnAttachStateChangeListenerC20604515jvLLLLLL != null) {
            viewOnAttachStateChangeListenerC20604515jvLLLLLL.setItemAnimator(null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLL2 = LLLLLL();
        if (viewOnAttachStateChangeListenerC20604515jvLLLLLL2 != null) {
            viewOnAttachStateChangeListenerC20604515jvLLLLLL2.LJIILJJIL(MentionPanelCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLL3 = LLLLLL();
        if (viewOnAttachStateChangeListenerC20604515jvLLLLLL3 != null) {
            viewOnAttachStateChangeListenerC20604515jvLLLLLL3.LJIILJJIL(MentionReachLimitCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLL4 = LLLLLL();
        if (viewOnAttachStateChangeListenerC20604515jvLLLLLL4 != null) {
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            final int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            final int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            viewOnAttachStateChangeListenerC20604515jvLLLLLL4.addItemDecoration(new C0DXR(iLIZIZ, iLIZIZ2, iLIZIZ3, iLIZIZ4) { // from class: X.0HFl
                public final int LL;
                public final int LLILLJJLI;
                public final int LLILLL;
                public final int LLILZ;

                {
                    this.LL = iLIZIZ;
                    this.LLILLJJLI = iLIZIZ2;
                    this.LLILLL = iLIZIZ3;
                    this.LLILZ = iLIZIZ4;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
                    C20600815jK<InterfaceC1891350zJl> state2;
                    ListState$_liveData$1 listState$_liveData$1;
                    C20600915jL value;
                    List<T> list;
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                    rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                    rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                    Object objLJJJLL = null;
                    if ((recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView) != null && (state2 = viewOnAttachStateChangeListenerC20604515jv.getState()) != null && (listState$_liveData$1 = state2.LIZIZ) != null && (value = listState$_liveData$1.getValue()) != null && (list = value.LIZ) != 0) {
                        objLJJJLL = C13LP.LJJJLL(list);
                    }
                    if ((objLJJJLL instanceof AnonymousClass0502) && childAdapterPosition == 0) {
                        rect.top = this.LLILLJJLI;
                        rect.bottom = this.LLILZ - (this.LL / 2);
                        return;
                    }
                    if (childAdapterPosition == 0) {
                        AbstractC21673619ry adapter = recyclerView.getAdapter();
                        if (adapter != null && adapter.getItemCount() == 1) {
                            rect.top = this.LLILLJJLI;
                            rect.bottom = this.LLILLL;
                            return;
                        } else {
                            rect.top = this.LLILLJJLI;
                            rect.bottom = this.LL / 2;
                            return;
                        }
                    }
                    if (recyclerView.getAdapter() != null && childAdapterPosition == r0.getItemCount() - 1) {
                        rect.top = this.LL / 2;
                        rect.bottom = this.LLILLL;
                    } else {
                        int i = this.LL / 2;
                        rect.top = i;
                        rect.bottom = i;
                    }
                }
            });
        }
        ComponentCallbacks2 componentCallbacks2 = this.mActivity;
        if (componentCallbacks2 instanceof InterfaceC1563380qmm) {
            ((InterfaceC1563380qmm) componentCallbacks2).LLLIIL(EnumC682280QpW.MAIN, new AwS552S0100000_8(this, 926));
        } else {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLL5 = LLLLLL();
            if (viewOnAttachStateChangeListenerC20604515jvLLLLLL5 != null) {
                viewOnAttachStateChangeListenerC20604515jvLLLLLL5.setLifecycleOwner(this);
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLL6 = LLLLLL();
        if (viewOnAttachStateChangeListenerC20604515jvLLLLLL6 != null && (state = viewOnAttachStateChangeListenerC20604515jvLLLLLL6.getState()) != null) {
            state.LIZLLL = C0Q4Y.BUFFER;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLL7 = LLLLLL();
        if (viewOnAttachStateChangeListenerC20604515jvLLLLLL7 != null) {
            viewOnAttachStateChangeListenerC20604515jvLLLLLL7.LJII(new C20607315kN() { // from class: X.0Lsr
                @Override // X.C20607315kN
                public final void LJIIIIZZ() {
                    C556940Lsq c556940Lsq = this.LL;
                    C436180H8m.LIZIZ((View) c556940Lsq.LLJJLIIIJLLLLLLLZ.getValue());
                    String str = c556940Lsq.LLLLILI().LIZ.LJII;
                    if ((str == null || str.length() == 0) && !c556940Lsq.LLJLLIL) {
                        return;
                    }
                    c556940Lsq.LLJLLIL = false;
                    View view2 = c556940Lsq.mView;
                    if (view2 != null) {
                        HandlerHook.viewPostDelay(view2, c556940Lsq.LLJLIL, 500L);
                    }
                }

                @Override // X.C20607315kN
                public final void LJ(Exception exc) {
                    this.LL.LLLLLLL();
                }

                @Override // X.C20607315kN
                public final void LJII(Exception exc) {
                    this.LL.LLLLLLL();
                }

                @Override // X.C20607315kN
                public final void LJIIIZ(boolean z) {
                    this.LL.LLLLLLLLL();
                    this.LL.LLLLLLLLLL();
                    this.LL.LLLLLJLJLL().LIZ(Integer.valueOf(this.LL.LLLLLJIL()));
                }
            });
        }
        LLLLLL().getState().LIZIZ.observe(this, new AObserverS212S0100000_8(this, 79));
        final ViewTreeObserver viewTreeObserver = this.mView.getViewTreeObserver();
        C786410Ut5.x3(viewTreeObserver, this.LLJLLL);
        final View view2 = this.mView;
        if (!view2.isAttachedToWindow()) {
            ViewTreeObserverOnGlobalLayoutListenerC581000MqY viewTreeObserverOnGlobalLayoutListenerC581000MqY = this.LLJLLL;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC581000MqY);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC581000MqY, ViewTreeObserver.OnGlobalLayoutListener.class);
        } else {
            view2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0Lss
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view3) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view3) {
                    view2.removeOnAttachStateChangeListener(this);
                    C786410Ut5.C3(viewTreeObserver, this.LLJLLL);
                }
            });
        }
        C473001sm c473001sm = new C473001sm(LLLLLL(), new AwS552S0100000_8(this, 927), AFwS239S0000000_8.get$arr$(264), AFwS239S0000000_8.get$arr$(265), AFwS239S0000000_8.get$arr$(266));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = c473001sm.LIZ;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS35S0100000_8(c473001sm, 6));
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new RunnableC514801zW(c473001sm, 158));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Lst
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C555130Lpv) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new C21636419ly(this));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Lq4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C555130Lpv) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 600));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Lpt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C555130Lpv) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 601));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Lpw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C555130Lpv) obj).LJ;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 602));
        C786410Ut5.R7((LinearLayout) this.LLJJLIIIJLLLLLLLZ.getValue(), new ACListenerS143S0100000_8(this, 127));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.LLJJJJ = viewGroup;
        FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, 0);
        marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        C786410Ut5.a6(frameLayout, marginLayoutParams);
        return frameLayout;
    }
}
