package X;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextPaint;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixBasicInfoModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixCardModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixDslModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixTabInfoModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixTabModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z7B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883550z7B implements InterfaceC1883040z6M, InterfaceC1882750z5t {
    public final Context LL;
    public InterfaceC1883040z6M LLILLJJLI;
    public final MixTabInfoModel LLILLL;
    public final InterfaceC1883090z6R LLILZ;
    public final int LLILZIL;
    public View LLILZLL;
    public C1883540z7A LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public C1883570z7D LLJILJILJ;
    public C21594519fD LLJILLL;
    public C422240Gh4 LLJJ;
    public C1883450z71 LLJJI;
    public C1883630z7J LLJJIII;
    public ViewOnScrollChangeListenerC1883150z6X LLJJIJI;
    public C1883560z7C LLJJIJIIJIL;
    public ViewOnTouchListenerC1883620z7I LLJJIJIL;
    public final C01GW LLJJJ = C452501pT.LIZIZ(new C1881860z4S(this));
    public final List<C1883100z6S> LLJJJIL = new ArrayList();

    @Override // X.InterfaceC1883040z6M
    public final void LJIJI(InterfaceC1883040z6M interfaceC1883040z6M) {
        throw null;
    }

    @Override // X.InterfaceC1883040z6M
    public final View getView() {
        throw null;
    }

    public final int LJIIL() {
        int currentItem;
        C21594519fD c21594519fD = this.LLJILLL;
        if (c21594519fD == null || (currentItem = c21594519fD.getCurrentItem()) < 0) {
            return 0;
        }
        return currentItem;
    }

    public final void LJIILIIL() {
        ViewGroup viewGroup;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TextView textView;
        C1883540z7A c1883540z7A = this.LLIZ;
        if (c1883540z7A == null) {
            return;
        }
        List list = (List) this.LLJJJ.getValue();
        if (list.size() <= 1) {
            C500260Jjc.LJIILIIL(c1883540z7A.LIZIZ);
        } else {
            C500260Jjc.LLFFF(c1883540z7A.LIZIZ);
        }
        ((ArrayList) c1883540z7A.LIZLLL).clear();
        ((ArrayList) c1883540z7A.LIZLLL).addAll(list);
        c1883540z7A.LJIIIIZZ = 0.0f;
        c1883540z7A.LIZIZ.LJIIL();
        Iterator it2 = ((ArrayList) c1883540z7A.LIZLLL).iterator();
        int i = 0;
        while (true) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                String str = (String) next;
                C1888650zFP c1888650zFPLJIIJ = c1883540z7A.LIZIZ.LJIIJ();
                c1888650zFPLJIIJ.LJFF = false;
                c1888650zFPLJIIJ.LIZIZ(R.layout.h8c);
                View view = c1888650zFPLJIIJ.LJ;
                if (view != null && (textView = (TextView) view.findViewById(R.id.wy8)) != null) {
                    textView.setText(str);
                    TextPaint paint = textView.getPaint();
                    if (paint != null) {
                        float fMeasureText = paint.measureText(str);
                        float f = c1883540z7A.LJIIIIZZ;
                        float f2 = fMeasureText + C1883540z7A.LJIIJ;
                        c1883540z7A.LJIIIIZZ = f + f2;
                        c1883540z7A.LIZJ = Math.max(c1883540z7A.LIZJ, f2);
                    }
                }
                c1888650zFPLJIIJ.LIZ = str;
                if (i == c1883540z7A.LJ) {
                    C422240Gh4 c422240Gh4 = c1883540z7A.LIZIZ;
                    C1883540z7A.LIZ(c1888650zFPLJIIJ, R.attr.ezq);
                    c422240Gh4.LIZJ(c1888650zFPLJIIJ, i, true);
                } else {
                    C422240Gh4 c422240Gh42 = c1883540z7A.LIZIZ;
                    C1883540z7A.LIZ(c1888650zFPLJIIJ, R.attr.ezt);
                    c422240Gh42.LIZJ(c1888650zFPLJIIJ, i, false);
                }
                i = i2;
            } else {
                if (list.size() <= ((Number) c1883540z7A.LJII.getValue()).floatValue()) {
                    c1883540z7A.LIZIZ.setTabMode(1);
                    return;
                }
                c1883540z7A.LIZIZ.setTabMode(0);
                if (c1883540z7A.LJIIIIZZ >= ((Number) c1883540z7A.LJI.getValue()).floatValue()) {
                    ViewGroup.LayoutParams layoutParams = c1883540z7A.LIZIZ.getLayoutParams();
                    if ((layoutParams instanceof FrameLayout.LayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams2.setMarginEnd(0);
                    }
                    C422240Gh4 c422240Gh43 = c1883540z7A.LIZIZ;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c422240Gh43);
                    c422240Gh43.setLayoutParams(marginLayoutParams2);
                    return;
                }
                float fFloatValue = ((Number) c1883540z7A.LJI.getValue()).floatValue() - c1883540z7A.LJIIIIZZ;
                if (((ArrayList) c1883540z7A.LIZLLL).size() <= 0) {
                    return;
                }
                float f3 = fFloatValue / (r0 * 2);
                int tabCount = c1883540z7A.LIZIZ.getTabCount();
                if (tabCount < 0) {
                    return;
                }
                int i3 = 0;
                while (true) {
                    View childAt = c1883540z7A.LIZIZ.LLILLL.getChildAt(i3);
                    if (childAt != null && (viewGroup = (ViewGroup) childAt.findViewById(R.id.ir_)) != null) {
                        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                        int marginStart = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0;
                        ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
                        int marginEnd = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd() : 0;
                        ViewGroup.LayoutParams layoutParams4 = viewGroup.getLayoutParams();
                        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                            marginLayoutParams.setMarginStart((int) (marginStart + f3));
                            marginLayoutParams.setMarginEnd((int) (marginEnd + f3));
                            C786410Ut5.X5(marginLayoutParams, viewGroup);
                        }
                    }
                    if (i3 == tabCount) {
                        return;
                    } else {
                        i3++;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1883040z6M
    public final void destroy() {
        C1884300z8O c1884300z8O;
        C21594519fD c21594519fD;
        C21594519fD c21594519fD2;
        C422240Gh4 c422240Gh4;
        Iterator it2 = ((ArrayList) this.LLJJJIL).iterator();
        while (it2.hasNext()) {
            ((C1883100z6S) it2.next()).destroy();
        }
        C1883630z7J c1883630z7J = this.LLJJIII;
        if (c1883630z7J != null && (c422240Gh4 = this.LLJJ) != null) {
            c422240Gh4.LLJJIJIL.remove(c1883630z7J);
        }
        if (this.LLJJIJI != null && (c21594519fD2 = this.LLJILLL) != null) {
            c21594519fD2.setOnScrollChangeListener(null);
        }
        C1883560z7C c1883560z7C = this.LLJJIJIIJIL;
        if (c1883560z7C != null && (c21594519fD = this.LLJILLL) != null) {
            c21594519fD.removeOnPageChangeListener(c1883560z7C);
        }
        this.LLJJIJIIJIL = null;
        this.LLJJIII = null;
        this.LLJJI = null;
        this.LLJJIJI = null;
        ViewOnTouchListenerC1883620z7I viewOnTouchListenerC1883620z7I = this.LLJJIJIL;
        if (viewOnTouchListenerC1883620z7I != null) {
            this.LLILZ.LJIJJ(viewOnTouchListenerC1883620z7I);
        }
        this.LLJJIJIL = null;
        C1883570z7D c1883570z7D = this.LLJILJILJ;
        if (c1883570z7D != null) {
            for (View view : (ArrayList) c1883570z7D.LLILZ) {
                if (view != null && (c1884300z8O = (C1884300z8O) view.findViewById(R.id.ohy)) != null) {
                    c1884300z8O.onDestroy();
                }
            }
            ((ArrayList) c1883570z7D.LLILZ).clear();
        }
    }

    @Override // X.InterfaceC1882930z6B
    public final void onCreate() {
        SystemClock.elapsedRealtime();
        C1881800z4M c1881800z4MLJIIIZ = this.LLILZ.LJIIJJI().LJIIIZ();
        int i = 0;
        for (MixTabModel mixTabModel : this.LLILLL.tabs) {
            int i2 = i + 1;
            String str = null;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            MixTabModel mixTabModel2 = mixTabModel;
            mixTabModel2.LIZ = i;
            String str2 = mixTabModel2.tabClass;
            if (c1881800z4MLJIIIZ != null) {
                str = c1881800z4MLJIIIZ.LIZIZ;
            }
            C1883100z6S c1883100z6S = new C1883100z6S(this.LL, this, mixTabModel2, Intrinsics.LJFF(str2, str), this.LLILZ, i);
            c1883100z6S.onCreate();
            ((ArrayList) this.LLJJJIL).add(c1883100z6S);
            i = i2;
        }
    }

    @Override // X.InterfaceC1883040z6M
    public final InterfaceC1883040z6M getParent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1882930z6B
    public final View LIZIZ(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.h8e, viewGroup, false);
    }

    public final boolean LJ(int i) {
        C1883100z6S c1883100z6S;
        boolean z = false;
        if (i < 0 || i >= ((ArrayList) this.LLJJJIL).size() || (c1883100z6S = (C1883100z6S) C13LP.LJJJLZIJ(i, this.LLJJJIL)) == null) {
            return false;
        }
        List<InterfaceC1883030z6L> list = c1883100z6S.LLJILJIL;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<InterfaceC1883030z6L> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LJIIJ() == 3) {
                    return false;
                }
            }
        }
        List<InterfaceC1883030z6L> list2 = c1883100z6S.LLJILJIL;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<InterfaceC1883030z6L> it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (it3.next().LJIIJ() == 1) {
                    z = true;
                    break;
                }
            }
        }
        return !z;
    }

    @Override // X.InterfaceC1883040z6M
    public final void LJII(ViewGroup viewGroup) {
        View viewLIZIZ = LIZIZ(viewGroup);
        if (viewLIZIZ != null) {
            LJJ(viewLIZIZ);
        }
    }

    @Override // X.InterfaceC1883040z6M
    public final void LJIIJJI(ViewGroup viewGroup) {
        if (!this.LLIZLLLIL) {
            return;
        }
        View view = this.LLILZLL;
        if (view != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
        }
        this.LLIZLLLIL = false;
        this.LLILZ.getEventCenter().LIZLLL("on_tab_sticky_enter", this);
        this.LLILZ.getEventCenter().LIZLLL("on_tab_sticky_exit", this);
        LJIJ(1);
    }

    @Override // X.InterfaceC1883040z6M
    public final void LJIILJJIL(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams;
        if (this.LLIZLLLIL) {
            return;
        }
        View view = this.LLILZLL;
        if (view != null) {
            Size sizeLJIIJ = this.LLILZ.LJIIJJI().LJIIJ(this);
            if (sizeLJIIJ.getWidth() > 0 && sizeLJIIJ.getHeight() > 0) {
                View view2 = this.LLILZLL;
                if (view2 == null || (layoutParams = view2.getLayoutParams()) == null) {
                    layoutParams = new ViewGroup.LayoutParams(0, 0);
                }
                layoutParams.width = sizeLJIIJ.getWidth();
                layoutParams.height = sizeLJIIJ.getHeight();
            } else {
                View view3 = this.LLILZLL;
                if (view3 == null || (layoutParams = view3.getLayoutParams()) == null) {
                    int i = this.LLILZIL;
                    int childCount = viewGroup.getChildCount();
                    if (i > childCount) {
                        i = childCount;
                    }
                    viewGroup.addView(view, i);
                }
            }
            int i2 = this.LLILZIL;
            int childCount2 = viewGroup.getChildCount();
            if (i2 > childCount2) {
                i2 = childCount2;
            }
            viewGroup.addView(view, i2, layoutParams);
        }
        this.LLIZLLLIL = true;
        this.LLILZ.getEventCenter().LIZJ("on_tab_sticky_enter", this);
        this.LLILZ.getEventCenter().LIZJ("on_tab_sticky_exit", this);
        LJIJJLI(1);
        C1881800z4M c1881800z4MLJIIIZ = this.LLILZ.LJIIJJI().LJIIIZ();
        if (c1881800z4MLJIIIZ != null) {
            this.LLILZ.LIZ().LIZ(c1881800z4MLJIIIZ);
            C21594519fD c21594519fD = this.LLJILLL;
            if (c21594519fD != null) {
                c21594519fD.setCurrentItem(c1881800z4MLJIIIZ.LIZ);
            }
            C1883100z6S c1883100z6S = (C1883100z6S) C13LP.LJJJLZIJ(c1881800z4MLJIIIZ.LIZ, this.LLJJJIL);
            if (c1883100z6S != null) {
                c1883100z6S.LJIIL();
            }
        }
    }

    @Override // X.InterfaceC1883040z6M
    public final void LJIILL(Size size) {
        View view = this.LLILZLL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = size.getWidth();
                layoutParams.height = size.getHeight();
                C786410Ut5.W5(view, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        for (C1883100z6S c1883100z6S : (ArrayList) this.LLJJJIL) {
            c1883100z6S.LJIILL(this.LLILZ.LJIIJJI().LJIIJ(c1883100z6S));
        }
    }

    public final void LJIILLIIL(int i) {
        int i2 = 0;
        for (Object obj : (ArrayList) this.LLJJJIL) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C1883100z6S c1883100z6S = (C1883100z6S) obj;
                if (i2 == i) {
                    c1883100z6S.LJIIIIZZ(1, true);
                } else {
                    c1883100z6S.LJIIIIZZ(1, false);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // X.InterfaceC1882930z6B
    public final void LJIJ(int i) {
        this.LLJ = false;
        C1883100z6S c1883100z6S = (C1883100z6S) C13LP.LJJJLZIJ(LJIIL(), this.LLJJJIL);
        if (c1883100z6S != null) {
            c1883100z6S.LJIIIIZZ(i, false);
        }
    }

    public final void LJIJJLI(int i) {
        this.LLJ = true;
        C1883100z6S c1883100z6S = (C1883100z6S) C13LP.LJJJLZIJ(LJIIL(), this.LLJJJIL);
        if (c1883100z6S != null) {
            c1883100z6S.LJIIIIZZ(i, true);
        }
        final View view = this.LLILZLL;
        if (view != null) {
            Runnable runnable = new Runnable() { // from class: X.0z7G
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MultiTabsTreeNode@4388.checkIsSticky$1$action$1");
                    try {
                        Rect rect = new Rect();
                        View view2 = this.LL.LLILZLL;
                        if (view2 != null) {
                            view2.getGlobalVisibleRect(rect);
                        }
                        this.LL.LLILZ.LJIJJLI().LJIJJLI(rect.bottom - rect.top == view.getMeasuredHeight());
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MultiTabsTreeNode@4388.checkIsSticky$1$action$1");
                }
            };
            if (view.getMeasuredHeight() == 0) {
                HandlerHook.viewPost(view, runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0Ias, X.0z7C] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0z7J, X.0z7N] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0z6X, android.view.View$OnScrollChangeListener] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0z7I] */
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
    public final void LJJ(View view) {
        MixBasicInfoModel mixBasicInfoModel;
        List<MixCardModel> list;
        this.LLILZLL = view;
        C21594519fD c21594519fD = (C21594519fD) view.findViewById(R.id.iq3);
        C422240Gh4 c422240Gh4 = (C422240Gh4) view.findViewById(R.id.iq2);
        MixDslModel mixDslModel = this.LLILZ.LJIJJLI().LLILZIL;
        int i = 0;
        if (mixDslModel == null || (mixBasicInfoModel = mixDslModel.basicInfo) == null || (list = mixBasicInfoModel.cards) == null || !(!list.isEmpty())) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = 0;
                C786410Ut5.W5(view, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        this.LLJJ = c422240Gh4;
        this.LLJILLL = c21594519fD;
        this.LLIZ = new C1883540z7A(this.LLILZ, c422240Gh4, c21594519fD);
        ?? r1 = new InterfaceC469360Ias() { // from class: X.0z7C
            @Override // X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i2) {
                Iterator it2 = this.LL.LLILZ.LJIJJLI().LJIIJJI().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC469360Ias) it2.next()).onPageScrollStateChanged(i2);
                }
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageSelected(int i2) {
                C1883100z6S c1883100z6S = (C1883100z6S) C13LP.LJJJLZIJ(i2, this.LL.LLJJJIL);
                if (c1883100z6S != null) {
                    if (c1883100z6S.LLJJIJI) {
                        C1883570z7D c1883570z7D = this.LL.LLJILJILJ;
                        if (c1883570z7D != null && c1883570z7D.LLIZ && Intrinsics.LJFF(((HashMap) c1883570z7D.LLILZLL.getValue()).get(Integer.valueOf(i2)), Boolean.TRUE)) {
                            c1883570z7D.LLILLJJLI.getEventCenter().LIZIZ(Integer.valueOf(i2), "__mix_base_tab_bottom_sheet_btn_show");
                        }
                    } else {
                        c1883100z6S.LJIIL();
                    }
                }
                this.LL.LJIILLIIL(i2);
                Iterator it2 = this.LL.LLILZ.LJIJJLI().LJIIJJI().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC469360Ias) it2.next()).onPageSelected(i2);
                }
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageScrolled(int i2, float f, int i3) {
                Iterator it2 = this.LL.LLILZ.LJIJJLI().LJIIJJI().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC469360Ias) it2.next()).onPageScrolled(i2, f, i3);
                }
            }
        };
        C21594519fD c21594519fD2 = this.LLJILLL;
        if (c21594519fD2 != 0) {
            c21594519fD2.addOnPageChangeListener(r1);
        }
        this.LLJJIJIIJIL = r1;
        ?? r12 = new InterfaceC1883670z7N() { // from class: X.0z7J
            @Override // X.InterfaceC1883670z7N
            public final void LIZ(C1888650zFP c1888650zFP) {
                Iterator it2 = this.LIZ.LLILZ.LJIJJLI().LJIILL().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1883670z7N) it2.next()).LIZ(c1888650zFP);
                }
            }

            @Override // X.InterfaceC1883670z7N
            public final void LIZJ(C1888650zFP c1888650zFP) {
                Iterator it2 = this.LIZ.LLILZ.LJIJJLI().LJIILL().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1883670z7N) it2.next()).LIZJ(c1888650zFP);
                }
            }

            @Override // X.InterfaceC1883670z7N
            public final void LIZIZ(C1888650zFP c1888650zFP, boolean z, boolean z2) {
                Iterator it2 = this.LIZ.LLILZ.LJIJJLI().LJIILL().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1883670z7N) it2.next()).LIZIZ(c1888650zFP, z, z2);
                }
            }
        };
        C422240Gh4 c422240Gh42 = this.LLJJ;
        if (c422240Gh42 != 0) {
            c422240Gh42.LIZIZ(r12);
        }
        this.LLJJIII = r12;
        ?? r13 = new View.OnScrollChangeListener() { // from class: X.0z6X
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i2, int i3, int i4, int i5) {
                Iterator it2 = this.LIZ.LLILZ.LJIJJLI().LJIILJJIL().iterator();
                while (it2.hasNext()) {
                    ((View.OnScrollChangeListener) it2.next()).onScrollChange(view2, i2, i3, i4, i5);
                }
            }
        };
        C422240Gh4 c422240Gh43 = this.LLJJ;
        if (c422240Gh43 != 0) {
            c422240Gh43.setOnScrollChangeListener(r13);
        }
        this.LLJJIJI = r13;
        ?? r14 = new View.OnTouchListener() { // from class: X.0z7I
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2 && Math.abs(this.LL.LLJIJIL - motionEvent.getRawX()) < Math.abs(this.LL.LLJILJIL - motionEvent.getRawY())) {
                            this.LL.LLJI++;
                        }
                        return false;
                    }
                    final C1883550z7B c1883550z7B = this.LL;
                    if (c1883550z7B.LLJI >= 3 && view2 != null) {
                        C476770Imp.LIZJ(view2, new Runnable() { // from class: X.0z7H
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("MultiTabsTreeNode@4388.prepareListener$7$1");
                                try {
                                    C1883550z7B c1883550z7B2 = c1883550z7B;
                                    c1883550z7B2.LJIILLIIL(c1883550z7B2.LJIIL());
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("MultiTabsTreeNode@4388.prepareListener$7$1");
                            }
                        });
                    }
                    this.LL.LLJI = 0;
                    return false;
                }
                this.LL.LLJIJIL = motionEvent.getRawX();
                this.LL.LLJILJIL = motionEvent.getRawY();
                this.LL.LLJI = 0;
                return false;
            }
        };
        this.LLILZ.LJIIJ(r14);
        this.LLJJIJIL = r14;
        C1883450z71 c1883450z71 = new C1883450z71(this);
        C1883570z7D c1883570z7D = new C1883570z7D(this.LLILZ, c1883450z71);
        this.LLJILJILJ = c1883570z7D;
        c1883570z7D.LJJII(new DataSetObserver() { // from class: X.0z7Q
            @Override // android.database.DataSetObserver
            public final void onChanged() {
                super.onChanged();
                this.LIZ.LJIILIIL();
            }
        });
        this.LLJJI = c1883450z71;
        C1883570z7D c1883570z7D2 = this.LLJILJILJ;
        if (c1883570z7D2 != null) {
            List<C1883100z6S> list2 = this.LLJJJIL;
            ((ArrayList) c1883570z7D2.LLILZ).clear();
            ((ArrayList) c1883570z7D2.LLILZIL).clear();
            ((ArrayList) c1883570z7D2.LLILZIL).addAll(list2);
            for (Object obj : (ArrayList) c1883570z7D2.LLILZIL) {
                int i2 = i + 1;
                if (i >= 0) {
                    C1883100z6S c1883100z6S = (C1883100z6S) obj;
                    c1883100z6S.LJII(null);
                    View view2 = c1883100z6S.LLIZ;
                    if (view2 != null) {
                        C1884300z8O c1884300z8O = (C1884300z8O) view2.findViewById(R.id.ohy);
                        if (c1884300z8O != null) {
                            c1884300z8O.setTabIndex(i);
                            c1884300z8O.setTabEventListener(c1883570z7D2.LLILLL);
                        }
                        ((ArrayList) c1883570z7D2.LLILZ).add(view2);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            c1883570z7D2.notifyDataSetChanged();
        }
        C21594519fD c21594519fD3 = this.LLJILLL;
        if (c21594519fD3 != null) {
            c21594519fD3.setAdapter(this.LLJILJILJ);
        }
        LJIILIIL();
        SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC1883040z6M
    public final void LJIIIIZZ(int i, boolean z) {
        if (this.LLJ != z) {
            if (z) {
                LJIJJLI(i);
            } else {
                LJIJ(i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(final int r8, boolean r9) {
        /*
            r7 = this;
            X.0z7D r6 = r7.LLJILJILJ
            if (r6 == 0) goto L5c
            java.util.List<android.view.View> r0 = r6.LLILZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            int r0 = r8 + 1
            if (r1 < r0) goto L5c
            java.util.List<android.view.View> r0 = r6.LLILZ
            java.lang.Object r1 = X.C13LP.LJJJLZIJ(r8, r0)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L5c
            r0 = 2131365351(0x7f0a0de7, float:1.8350565E38)
            android.view.View r5 = r1.findViewById(r0)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r5 == 0) goto L5c
            r4 = 0
            if (r9 == 0) goto L5d
            java.util.List<X.0z6S> r0 = r6.LLILZIL
            java.lang.Object r3 = X.C13LP.LJJJLZIJ(r8, r0)
            X.0z6S r3 = (X.C1883100z6S) r3
            if (r3 == 0) goto L50
            android.view.View r2 = r3.LLJJI
            if (r2 == 0) goto L40
            int r1 = r5.indexOfChild(r2)
            r0 = -1
            if (r1 != r0) goto L40
            r5.addView(r2)
        L40:
            java.lang.Integer r0 = r3.LLJJIII
            if (r0 == 0) goto L50
            int r1 = r0.intValue()
            X.0z7O r0 = new X.0z7O
            r0.<init>()
            X.C786410Ut5.K7(r5, r0)
        L50:
            r6.LJJIJIL(r8)
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L5d
        L59:
            X.C786410Ut5.LJLLLLLL(r4, r5)
        L5c:
            return
        L5d:
            r4 = 8
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1883550z7B.LJJI(int, boolean):void");
    }

    @Override // X.InterfaceC1882750z5t
    public final void y60(Object obj, String str) {
        if (Intrinsics.LJFF(str, "on_tab_sticky_enter")) {
            C1883540z7A c1883540z7A = this.LLIZ;
            if (c1883540z7A != null) {
                c1883540z7A.LJIIIZ = true;
            }
            int iLJIIL = LJIIL();
            C1883570z7D c1883570z7D = this.LLJILJILJ;
            if (c1883570z7D != null) {
                c1883570z7D.LLIZ = true;
                c1883570z7D.LJJIJIL(iLJIIL);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "on_tab_sticky_exit")) {
            return;
        }
        C1883540z7A c1883540z7A2 = this.LLIZ;
        if (c1883540z7A2 != null) {
            c1883540z7A2.LJIIIZ = false;
        }
        int iLJIIL2 = LJIIL();
        C1883570z7D c1883570z7D2 = this.LLJILJILJ;
        if (c1883570z7D2 != null) {
            c1883570z7D2.LLIZ = false;
            c1883570z7D2.LJJIJIL(iLJIIL2);
        }
        View view = this.LLILZLL;
        if (view == null) {
            return;
        }
        C476770Imp.LIZJ(view, new Runnable() { // from class: X.0z7F
            public final void LIZ() {
                C1883550z7B c1883550z7B = this.LL;
                int iLJIIL3 = c1883550z7B.LJIIL();
                int i = 0;
                for (Object obj2 : (ArrayList) c1883550z7B.LLJJJIL) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    C1883100z6S c1883100z6S = (C1883100z6S) obj2;
                    if (iLJIIL3 != i) {
                        C1884300z8O c1884300z8O = c1883100z6S.LLIZLLLIL;
                        if (c1884300z8O != null) {
                            c1884300z8O.setScrollY(0);
                        }
                        List<InterfaceC1883030z6L> list = c1883100z6S.LLJILJIL;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (ArrayList) list) {
                            if (obj3 instanceof InterfaceC1883720z7S) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1883720z7S) it2.next()).LJ();
                        }
                    }
                    i = i2;
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MultiTabsTreeNode@4388.onEvent$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MultiTabsTreeNode@4388.onEvent$1");
            }
        });
    }

    public C1883550z7B(Context context, C1883080z6Q c1883080z6Q, MixTabInfoModel mixTabInfoModel, InterfaceC1883090z6R interfaceC1883090z6R, int i) {
        this.LL = context;
        this.LLILLJJLI = c1883080z6Q;
        this.LLILLL = mixTabInfoModel;
        this.LLILZ = interfaceC1883090z6R;
        this.LLILZIL = i;
    }
}
