package X;

import X.AbstractC1773210wFD;
import Y.ARunnableS45S0110000_26;
import Y.ARunnableS78S0200000_9;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.ECHybridAdapter;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: renamed from: X.0wFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1773460wFc<D extends AbstractC1773210wFD> extends RecyclerView.ViewHolder {
    public final InterfaceC1773310wFN LL;
    public final Context LLILLJJLI;
    public D LLILLL;
    public AwS605S0100000_26 LLILZ;
    public boolean LLILZIL;
    public final C1773560wFm LLILZLL;
    public final C1774280wGw LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final BPEAHandler LLJI;
    public boolean LLJIJIL;
    public final AwS640S0100000_26 LLJILJIL;
    public final AwS640S0100000_26 LLJILJILJ;
    public final C01GW LLJILLL;
    public AbstractC1773460wFc<? extends AbstractC1773210wFD> LLJJ;
    public ViewOnLayoutChangeListenerC1773620wFs LLJJI;
    public View LLJJIII;

    public void L5() {
    }

    public void N5() {
    }

    public abstract void P5(D d);

    public int S5() {
        return 0;
    }

    public boolean W5() {
        return false;
    }

    public void a6() {
    }

    public void e6(boolean z) {
    }

    public final void T5() {
        Set<Function1<Integer, Unit>> scrollListeners;
        Set<Function1<Integer, Unit>> scrollListeners2;
        C1775190wIP c1775190wIP;
        C1775190wIP c1775190wIP2;
        if (this.LLILZ != null) {
            d6(this, 0);
            return;
        }
        this.LLILZ = new AwS605S0100000_26(this, 796);
        List<Function2<Boolean, C1773550wFl, Unit>> list = this.LLILZLL.LIZ.LIZLLL;
        C1773440wFa c1773440wFa = new C1773440wFa(this);
        C19719512Dh.LJ(2, c1773440wFa);
        list.add(c1773440wFa);
        D d = this.LLILLL;
        if (d != null && (c1775190wIP2 = d.LJII) != null) {
            Pair<Integer, Integer> pairLIZ = C1773580wFo.LIZ(c1775190wIP2, 1);
            this.LLILZLL.LIZ(pairLIZ.getFirst().intValue(), pairLIZ.getSecond().intValue()).LIZLLL.add(this.LLJILJIL);
        }
        D d2 = this.LLILLL;
        if (d2 != null && (c1775190wIP = d2.LJII) != null) {
            Pair<Integer, Integer> pairLIZ2 = C1773580wFo.LIZ(c1775190wIP, 2);
            this.LLILZLL.LIZ(pairLIZ2.getFirst().intValue(), pairLIZ2.getSecond().intValue()).LIZLLL.add(this.LLJILJILJ);
        }
        AwS605S0100000_26 awS605S0100000_26 = this.LLILZ;
        if (awS605S0100000_26 != null) {
            C1773640wFu c1773640wFu = (C1773640wFu) this.LLIZLLLIL.getValue();
            if (c1773640wFu != null && (scrollListeners2 = c1773640wFu.getScrollListeners()) != null) {
                scrollListeners2.add(awS605S0100000_26);
            }
            C1773640wFu c1773640wFu2 = (C1773640wFu) this.LLJ.getValue();
            if (c1773640wFu2 != null && (scrollListeners = c1773640wFu2.getScrollListeners()) != null) {
                scrollListeners.add(awS605S0100000_26);
            }
        }
        d6(this, 0);
    }

    public boolean V5() {
        return !this.LLILZIL;
    }

    public final void r6() {
        Set<Function1<Integer, Unit>> scrollListeners;
        Set<Function1<Integer, Unit>> scrollListeners2;
        this.LLILZLL.LIZ.LIZ(false);
        Iterator<C1773550wFl> it2 = this.LLILZLL.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(false);
        }
        D d = this.LLILLL;
        if (d != null) {
            d.LJIIL = false;
        }
        AwS605S0100000_26 awS605S0100000_26 = this.LLILZ;
        if (awS605S0100000_26 != null) {
            C1773640wFu c1773640wFu = (C1773640wFu) this.LLIZLLLIL.getValue();
            if (c1773640wFu != null && (scrollListeners2 = c1773640wFu.getScrollListeners()) != null) {
                scrollListeners2.remove(awS605S0100000_26);
            }
            C1773640wFu c1773640wFu2 = (C1773640wFu) this.LLJ.getValue();
            if (c1773640wFu2 != null && (scrollListeners = c1773640wFu2.getScrollListeners()) != null) {
                scrollListeners.remove(awS605S0100000_26);
            }
        }
        C1773560wFm c1773560wFm = this.LLILZLL;
        c1773560wFm.LIZIZ.clear();
        c1773560wFm.LIZIZ.add(c1773560wFm.LIZ);
        c1773560wFm.LIZ.LIZLLL.clear();
        C1773550wFl c1773550wFl = c1773560wFm.LIZ;
        c1773550wFl.LIZJ = false;
        c1773550wFl.LIZ = 0;
        c1773550wFl.LIZIZ = 0;
        this.LLILZ = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ViewHolder
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append('_');
        sbLIZ.append((String) null);
        sbLIZ.append('_');
        sbLIZ.append(super.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public void b6() {
        T5();
    }

    public void c6() {
        r6();
    }

    public void f6() {
        T5();
    }

    public void h6() {
        r6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0wFs, android.view.View$OnLayoutChangeListener] */
    public final void I5(D d) {
        FrameLayout frameLayout;
        InterfaceC1772610wEF interfaceC1772610wEF;
        final View viewU5;
        C1117360fBO c1117360fBO;
        final AbstractC1773460wFc<? extends AbstractC1773210wFD> abstractC1773460wFc;
        View view = this.itemView;
        if ((view instanceof FrameLayout) && (frameLayout = (FrameLayout) view) != null) {
            AbstractC1773460wFc<? extends AbstractC1773210wFD> abstractC1773460wFc2 = this.LLJJ;
            if (abstractC1773460wFc2 != null) {
                abstractC1773460wFc2.a6();
                C786410Ut5.LJJJZ(abstractC1773460wFc2.itemView, frameLayout);
                View view2 = this.LLJJIII;
                if (view2 != null) {
                    view2.removeOnLayoutChangeListener(this.LLJJI);
                }
            }
            D d2 = (D) d.LJIJJLI;
            if (d2 == null) {
                return;
            }
            N5();
            String str = d.LJIL;
            if (str == null) {
                viewU5 = frameLayout.getChildAt(0);
            } else if ((this instanceof InterfaceC1772610wEF) && (interfaceC1772610wEF = (InterfaceC1772610wEF) this) != null) {
                viewU5 = interfaceC1772610wEF.u5(str);
            } else {
                return;
            }
            if (viewU5 != 0) {
                this.LLJJIII = viewU5;
                Rect rect = new Rect();
                viewU5.getDrawingRect(rect);
                frameLayout.offsetDescendantRectToMyCoords(viewU5, rect);
                int i = rect.left;
                int i2 = rect.top;
                AbstractC21673619ry<? extends RecyclerView.ViewHolder> bindingAdapter = getBindingAdapter();
                if ((bindingAdapter instanceof ECHybridAdapter) && (c1117360fBO = (C1117360fBO) bindingAdapter) != null) {
                    int iLIZLLL = c1117360fBO.LLILLJJLI.LIZLLL(d2.getClass());
                    int iLIZ = -1;
                    if (iLIZLLL != -1) {
                        iLIZ = c1117360fBO.LLILLJJLI.LJ(iLIZLLL).LIZ(d2) + iLIZLLL;
                    }
                    RecyclerView.ViewHolder viewHolderOnCreateViewHolder = c1117360fBO.onCreateViewHolder(frameLayout, iLIZ);
                    if ((viewHolderOnCreateViewHolder instanceof AbstractC1773460wFc) && (abstractC1773460wFc = (AbstractC1773460wFc) viewHolderOnCreateViewHolder) != null) {
                        abstractC1773460wFc.LLILLL = d2;
                        abstractC1773460wFc.P5(d2);
                        View view3 = abstractC1773460wFc.itemView;
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(viewU5.getWidth(), viewU5.getHeight());
                        layoutParams.setMarginStart(i);
                        layoutParams.topMargin = i2;
                        C786410Ut5.W5(view3, layoutParams);
                        frameLayout.addView(abstractC1773460wFc.itemView);
                        this.LLJJ = abstractC1773460wFc;
                        ?? r0 = new View.OnLayoutChangeListener() { // from class: X.0wFs
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view4, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                                int i11 = i5 - i3;
                                if (i6 - i4 == abstractC1773460wFc.itemView.getWidth() && i11 == abstractC1773460wFc.itemView.getHeight()) {
                                    return;
                                }
                                abstractC1773460wFc.itemView.getLayoutParams().height = viewU5.getHeight();
                                abstractC1773460wFc.itemView.getLayoutParams().width = viewU5.getWidth();
                                abstractC1773460wFc.itemView.requestLayout();
                            }
                        };
                        this.LLJJI = r0;
                        viewU5.addOnLayoutChangeListener(r0);
                        L5();
                    }
                }
            }
        }
    }

    public final void R5(D d) {
        Iterator<InterfaceC1774020wGW> it2 = this.LL.LJI().iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(d);
        }
        if (this.LLILZ != null) {
            r6();
            T5();
        }
    }

    public final void U5(D d) {
        C1774380wH6 c1774380wH6;
        ViewGroup viewGroup;
        View childAt;
        C1773020wEu.LIZ.getClass();
        Integer num = C1773020wEu.LIZIZ().enableInsertAnimation;
        if (num != null && num.intValue() == 1 && !d.LJIILLIIL && (c1774380wH6 = d.LJIIZILJ) != null && c1774380wH6.LIZ) {
            View view = this.itemView;
            if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null || viewGroup.getChildCount() != 1 || (childAt = viewGroup.getChildAt(0)) == null) {
                return;
            }
            C786410Ut5.T4(childAt, 0.0f);
            HandlerHook.viewPost(childAt, new ARunnableS78S0200000_9(childAt, this, 106));
        }
    }

    public final void X5(boolean z) {
        C1774280wGw c1774280wGw = this.LLIZ;
        if (z != c1774280wGw.LIZ) {
            c1774280wGw.LIZ = z;
            e6(z);
            InterfaceC1773310wFN interfaceC1773310wFN = this.LL;
            if (z && C1773150wF7.LLJI == -1) {
                C1773150wF7.LLJI = System.currentTimeMillis();
            }
            interfaceC1773310wFN.LIZ().LJ("mix_mall_page_sticky", Integer.valueOf(z ? 1 : 0), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        }
    }

    public void onVisibilityChanged(boolean z) {
        IECommerceHostService iECommerceHostService;
        boolean z2;
        String name;
        String strLJIIIZ = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("item ");
            sbLIZ.append(getBindingAdapterPosition());
            sbLIZ.append(" -");
            D d = this.LLILLL;
            if (d != null) {
                strLJIIIZ = d.LJIIIZ();
            }
            sbLIZ.append(strLJIIIZ);
            sbLIZ.append(" onVisibilityChanged - ");
            sbLIZ.append(z);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("santa", strLIZIZ);
        }
    }

    public AbstractC1773460wFc(View view, InterfaceC1773310wFN interfaceC1773310wFN) {
        super(view);
        this.LL = interfaceC1773310wFN;
        this.LLILLJJLI = view.getContext();
        this.LLILZIL = true;
        this.LLILZLL = new C1773560wFm();
        this.LLIZ = new C1774280wGw();
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, (AbstractC1773460wFc<Object>) 1551));
        this.LLJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, (AbstractC1773460wFc<Object>) 1550));
        this.LLJI = new BPEAHandler(Looper.getMainLooper());
        this.LLJILJIL = new AwS640S0100000_26((AbstractC1773460wFc) this, 163);
        this.LLJILJILJ = new AwS640S0100000_26((AbstractC1773460wFc) this, 162);
        this.LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(view, 1549));
    }

    public static void d6(AbstractC1773460wFc abstractC1773460wFc, int i) {
        C786410Ut5.LJL(abstractC1773460wFc.LLJI, new ARunnableS45S0110000_26(abstractC1773460wFc, i, abstractC1773460wFc.LLJIJIL, 3));
    }

    public void i6(D d, C1772820wEa c1772820wEa) {
        for (InterfaceC1774020wGW interfaceC1774020wGW : this.LL.LJI()) {
            V5();
            interfaceC1774020wGW.LIZJ(d, c1772820wEa);
        }
    }

    public final void q6(int i, boolean z) {
        String str;
        AbstractC1773210wFD abstractC1773210wFD;
        if (z) {
            str = "show";
        } else {
            str = "show_over";
        }
        InterfaceC1773850wGF interfaceC1773850wGF = (InterfaceC1773850wGF) this.LL.LIZJ().getService(InterfaceC1773850wGF.class);
        if (interfaceC1773850wGF != null) {
            interfaceC1773850wGF.LJIIJ(str, this.LLILLL, i, null, null);
        }
        InterfaceC1773850wGF interfaceC1773850wGF2 = (InterfaceC1773850wGF) this.LL.LIZJ().getService(InterfaceC1773850wGF.class);
        if (interfaceC1773850wGF2 != null) {
            D d = this.LLILLL;
            if (d != null) {
                abstractC1773210wFD = d.LJIJJLI;
            } else {
                abstractC1773210wFD = null;
            }
            interfaceC1773850wGF2.LJIIJ(str, abstractC1773210wFD, i, null, null);
        }
    }
}
