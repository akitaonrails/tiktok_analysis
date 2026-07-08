package X;

import Y.AObjectS246S0100000_25;
import Y.ARunnableS125S0100000_25;
import android.view.View;
import com.bytedance.als.h0;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS131S0101000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import mn3.e0;

/* JADX INFO: renamed from: X.0t8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654030t8z extends AbstractC1664470tPp<InterfaceC1653820t8e, C1654150t9B, C1654140t9A> implements InterfaceC379610EuV, InterfaceC1653820t8e {
    public static final C1654260t9M LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final C19A3 LLILLL;
    public final int LLILZ;
    public final C1DRG LLILZIL;
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C1653860t8i.class, null);
    public EnumC1653890t8l LLIZ = ((C1654080t94) O3().LIZLLL.getValue()).LIZIZ;
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1653800t8c.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 383));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 381));
    public final C11SU<Pair<InterfaceC1654200t9G, Boolean>> LLJILJILJ = C11SU.LJLLLLLL();
    public final C1654050t91 LLJILLL;
    public final C01GW LLJJ;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0t9M] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1654030t8z.class, "tabRepository", "getTabRepository()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/tabs/TabRepository;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1654030t8z.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1654030t8z.class, "shootModeApi", "getShootModeApi()Lcom/ss/android/ugc/aweme/social/creation/record/bottom/ShootModeSwitchApiComponent;", 0), new C2217381BqS(C1654030t8z.class, "planCUiApiComponent", "getPlanCUiApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0)};
        LLJJI = new Object() { // from class: X.0t9M
        };
        LLJJIJI = 8;
    }

    private final List<InterfaceC1654200t9G> H3() {
        return (List) this.LLJIJIL.getValue();
    }

    private final C1653860t8i O3() {
        return (C1653860t8i) this.LLILZLL.getValue(this, LLJJIII[0]);
    }

    private final void Xi() {
        if (getDiContainer().LIZJ(InterfaceC1621970sJH.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1621970sJH.class, new AwS604S0100000_25(this, 261));
        }
        if (getDiContainer().LIZJ(e0.class)) {
            whenReadyOrThrowInternal(getDiContainer(), e0.class, new AwS604S0100000_25(this, 262));
        }
    }

    public final a B3() {
        return (a) this.LLJI.getValue(this, LLJJIII[3]);
    }

    public final InterfaceC1653800t8c E3() {
        return (InterfaceC1653800t8c) this.LLJ.getValue(this, LLJJIII[2]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLIZLLLIL.getValue(this, LLJJIII[1]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1654150t9B> o2() {
        return AFwS214S0000000_25.get$arr$(202);
    }

    public final TuxTextView q3() {
        return (TuxTextView) this.LLJILJIL.getValue();
    }

    public final InterfaceC1649550t1l v3() {
        return (InterfaceC1649550t1l) this.LLJJ.getValue();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1654140t9A> w2() {
        return new AwS569S0100000_25(this, 382);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // X.InterfaceC1653820t8e
    public EnumC1653890t8l LLLLLJIL() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1653820t8e
    public void C6(boolean z) {
        C1654050t91 c1654050t91 = this.LLJILLL;
        TabHost tabHost = c1654050t91.LLJJJJLIIL;
        if (tabHost != null) {
            tabHost.setScrollEnabled(z);
        }
        TabHost tabHost2 = c1654050t91.LLJJJJLIIL;
        if (tabHost2 != null) {
            tabHost2.setUISwitchEnabled(z);
        }
    }

    @Override // X.InterfaceC1653820t8e
    public void b40(EnumC1653890t8l enumC1653890t8l) {
        this.LLIZ = enumC1653890t8l;
    }

    public final void e4(h0<Boolean> h0Var) {
        h0Var.LIZ(this, new AObjectS246S0100000_25(this, 231));
    }

    @Override // X.InterfaceC1653820t8e
    public boolean um1(EnumC1653890t8l enumC1653890t8l) {
        List<InterfaceC1654200t9G> listH3 = H3();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listH3, 10));
        Iterator<InterfaceC1654200t9G> it2 = listH3.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LJIIJJI());
        }
        return arrayList.contains(enumC1653890t8l);
    }

    public final void Q3(InterfaceC1654200t9G interfaceC1654200t9G, int i) {
        Object value;
        Object value2;
        E3().WF(interfaceC1654200t9G.LJIILIIL().LJIIJJI(), i);
        this.LLIZ = interfaceC1654200t9G.LJIIJJI();
        C1653860t8i c1653860t8iO3 = O3();
        EnumC1653890t8l enumC1653890t8lLJIIJJI = interfaceC1654200t9G.LJIIJJI();
        Iterator<C1654080t94> it2 = c1653860t8iO3.LIZ.LIZ.LIZ.LIZ.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().LIZIZ == enumC1653890t8lLJIIJJI) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        C2252321DDq c2252321DDq = c1653860t8iO3.LIZIZ;
        do {
            value = c2252321DDq.getValue();
            ((Number) value).intValue();
        } while (!c2252321DDq.compareAndSet(value, Integer.valueOf(i2)));
        C2252321DDq c2252321DDq2 = c1653860t8iO3.LJ;
        do {
            value2 = c2252321DDq2.getValue();
            ((Number) value2).intValue();
        } while (!c2252321DDq2.compareAndSet(value2, Integer.valueOf(((C1654080t94) ListProtector.get(c1653860t8iO3.LIZ.LIZ.LIZ.LIZ, i2)).LIZ)));
    }

    @Override // X.InterfaceC1653820t8e
    public void aV1(boolean z, boolean z2) {
        Object c098200Yq;
        Object c098200Yq2;
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShootBottomTabComponent toggleVisibility: ");
        sbLIZ.append(z);
        sbLIZ.append(" animate: ");
        sbLIZ.append(z2);
        C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
        Object obj = null;
        if (z) {
            if (!this.LLILLL.isAdded(this.LLJILLL)) {
                this.LLILLL.add(this.LLILZ, this.LLJILLL, "ShootBottomTabComponent");
            } else {
                this.LLILLL.show(this.LLJILLL);
            }
            if (z2) {
                try {
                    c098200Yq2 = this.LLJILLL.requireView();
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                    obj = c098200Yq2;
                }
                View view = (View) obj;
                if (view != null) {
                    view.animate().cancel();
                    C786410Ut5.T4(view, 0.0f);
                    view.animate().alpha(1.0f).setDuration(250L).start();
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLILLL.isAdded(this.LLJILLL)) {
            if (z2) {
                try {
                    c098200Yq = this.LLJILLL.requireView();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                View view2 = (View) obj;
                if (view2 == null) {
                    this.LLILLL.hide(this.LLJILLL);
                    return;
                } else {
                    view2.animate().cancel();
                    view2.animate().alpha(0.0f).setDuration(250L).withEndAction(new ARunnableS125S0100000_25(this, 51)).start();
                    return;
                }
            }
            this.LLILLL.hide(this.LLJILLL);
        }
    }

    @Override // X.InterfaceC1653820t8e
    public void nS0(InterfaceC1654200t9G interfaceC1654200t9G, boolean z) {
        this.LLJILJILJ.onNext(new Pair<>(interfaceC1654200t9G, Boolean.valueOf(z)));
    }

    @Override // X.InterfaceC1653820t8e
    public void pX0(EnumC1653890t8l enumC1653890t8l, int i) {
        i3(new AwS131S0101000_25(enumC1653890t8l, i, 5));
        this.LLIZ = enumC1653890t8l;
    }

    @Override // X.InterfaceC1653820t8e
    public void setBottomSelectedTextColor(int i, int i2) {
        i3(new C1654130t99(i, i2));
    }

    public C1654030t8z(C19A3 c19a3, int i, C1DRG c1drg) {
        this.LLILLL = c19a3;
        this.LLILZ = i;
        this.LLILZIL = c1drg;
        C1654050t91 c1654050t91 = new C1654050t91(H3(), B3().va());
        W1(c1654050t91);
        this.LLJILLL = c1654050t91;
        this.LLJJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(203));
    }
}
