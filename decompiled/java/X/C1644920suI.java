package X;

import Y.AObjectS88S0110000_25;
import Y.ARunnableS44S0110000_25;
import androidx.appcompat.widget.ViewStubCompat;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS111S0110000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0suI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1644920suI extends AbstractC2255721DQs<InterfaceC1644780su4> implements InterfaceC379610EuV, InterfaceC1644780su4 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1644770su3.class, null);
    public final List<Function1<C1644940suK, Boolean>> LLIZ = new ArrayList();
    public final C01GW LLIZLLLIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25(this, 77));
    public C557050Lt1 LLJ = new C557050Lt1(false);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1644920suI.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InterfaceC1644780su4 o2() {
        return this;
    }

    private final InterfaceC1644770su3 getFilterApiComponent() {
        return (InterfaceC1644770su3) this.LLILZLL.getValue(this, LLJI[0]);
    }

    private final C1644930suJ w2() {
        return (C1644930suJ) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC1644780su4
    public void Ny1() {
        G2(!this.LLILZ);
    }

    public final C1644930suJ W1() {
        return new C1644930suJ();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        HandlerHook.viewPostDelay(this.LL.mView, new ARunnableS44S0110000_25(this, !this.LLILZ, 0), 100L);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        o2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final void G2(boolean z) {
        LiveEvent<C1644940suK> liveEventKa0;
        if (!this.LLJ.LIZ(false, true)) {
            return;
        }
        if (this.LLILZIL) {
            if (getDiContainer().LIZJ(InterfaceC1644770su3.class)) {
                whenReadyOrThrowInternal(getDiContainer(), InterfaceC1644770su3.class, new AwS111S0110000_25(this, z, 0));
            }
        } else {
            InterfaceC1644770su3 filterApiComponent = getFilterApiComponent();
            if (filterApiComponent == null || (liveEventKa0 = filterApiComponent.ka0()) == null) {
                return;
            }
            liveEventKa0.LIZ(this, new AObjectS88S0110000_25(this, z, 1));
        }
    }

    @Override // X.InterfaceC1644780su4
    public void h41(Function1<? super C1644940suK, Boolean> function1) {
        this.LLIZ.remove(function1);
    }

    @Override // X.InterfaceC1644780su4
    public void sX(C1644940suK c1644940suK) {
        X1(c1644940suK, true);
    }

    @Override // X.InterfaceC1644780su4
    public void ws(Function1<? super C1644940suK, Boolean> function1) {
        this.LLIZ.add(function1);
    }

    public final void X1(C1644940suK c1644940suK, boolean z) {
        FilterBean first;
        String name;
        String name2;
        List<Function1<C1644940suK, Boolean>> list = this.LLIZ;
        boolean z2 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<Function1<C1644940suK, Boolean>> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (!(!it2.next().invoke(c1644940suK).booleanValue())) {
                    if (z) {
                        return;
                    }
                }
            }
        }
        if (this.LL.findSceneByTag("FilterSwipeIndicatorScene") == null) {
            this.LL.add(this.LLILLL, w2(), "FilterSwipeIndicatorScene");
        }
        C1644930suJ c1644930suJW2 = w2();
        Pair<FilterBean, C1643870ssb> pair = c1644940suK.LIZ;
        FilterBean first2 = null;
        if (pair != null) {
            first = pair.getFirst();
        } else {
            first = null;
        }
        String strLIZ = C1643890ssd.LIZ(c1644940suK.LIZ);
        Pair<FilterBean, C1643870ssb> pair2 = c1644940suK.LIZIZ;
        if (pair2 != null) {
            first2 = pair2.getFirst();
        }
        String strLIZ2 = C1643890ssd.LIZ(c1644940suK.LIZIZ);
        if (c1644940suK.LIZJ == EnumC1153670g7x.RIGHT_TO_LEFT) {
            z2 = true;
        }
        if (c1644930suJW2.LLJI == null) {
            c1644930suJW2.LLJI = (C1644480sta) ((ViewStubCompat) c1644930suJW2.requireView().findViewById(R.id.hxt)).LIZ();
        }
        C1644480sta c1644480sta = c1644930suJW2.LLJI;
        if (c1644480sta != null) {
            String str = "";
            if (first == null || (name = first.getName()) == null) {
                name = "";
            }
            C1644470stZ c1644470stZ = new C1644470stZ(name, strLIZ);
            if (first2 != null && (name2 = first2.getName()) != null) {
                str = name2;
            }
            c1644480sta.LIZ(c1644470stZ, new C1644470stZ(str, strLIZ2), z2);
        }
    }

    public C1644920suI(C19A3 c19a3, C1DRG c1drg, int i, boolean z, boolean z2) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }
}
