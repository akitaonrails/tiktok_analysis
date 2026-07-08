package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z67, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1882890z67<M> implements InterfaceC1883030z6L, InterfaceC1882750z5t, InterfaceC1882630z5h {
    public static final ConcurrentHashMap<Class<?>, Type> LLJJIII = new ConcurrentHashMap<>();
    public final Context LL;
    public final C1155600gB4 LLILLJJLI;
    public final InterfaceC1881340z3c LLILLL;
    public M LLILZIL;
    public View LLILZLL;
    public InterfaceC1883040z6M LLIZ;
    public boolean LLIZLLLIL;
    public long LLJI;
    public long LLJIJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1882920z6A(this));
    public final String LLJ = UUID.randomUUID().toString();
    public final Map<String, Object> LLJILJIL = new LinkedHashMap();
    public final C01GW LLJJI = C452501pT.LIZIZ(new C1882900z68(this));

    @Override // X.InterfaceC1883030z6L
    public boolean LIZ() {
        return true;
    }

    public void LJJIII(Object obj, String str) {
    }

    public void LJJIIJ(String str, InterfaceC1881290z3X interfaceC1881290z3X) {
    }

    @Override // X.InterfaceC1883030z6L
    public final List<String> LJIIIZ() {
        List<String> list = this.LLILLJJLI.LLILLL.dataKeyPath;
        return list == null ? C13BV.INSTANCE : list;
    }

    @Override // X.InterfaceC1883030z6L
    public final C1881800z4M LJIJJ() {
        return this.LLILLJJLI.LLILLL.LIZ;
    }

    @Override // X.InterfaceC1883030z6L
    public String LJIL() {
        String str = this.LLILLJJLI.LLILLL.cardClass;
        return str == null ? "" : str;
    }

    public final int LJJII() {
        Float f = this.LLILLJJLI.LLILLL.topMargin;
        return (int) C497740JfY.LIZIZ(f != null ? f.floatValue() : 0.0f);
    }

    public final boolean LJJIIZ() {
        C1881800z4M c1881800z4MLJIIIIZZ = this.LLILLL.LJIIJJI().LJIIIIZZ();
        if (c1881800z4MLJIIIIZZ == null) {
            return false;
        }
        int i = c1881800z4MLJIIIIZZ.LIZ;
        C1881800z4M c1881800z4MLJIJJ = LJIJJ();
        return i == (c1881800z4MLJIJJ != null ? c1881800z4MLJIJJ.LIZ : -1);
    }

    public final void LJJIJIIJIL() {
        int i = this.LLJILJILJ;
        if (i == 3) {
            return;
        }
        if (i == 1) {
            C1882960z6E.LIZIZ(this.LLILLL, this, "fail", C2097608Jq.LJIIIIZZ(new Pair("tab_class", C1883130z6V.LIZ(this)), new Pair("card_class", LJIL())));
        }
        LJJJJL(3);
        int iLIZ = this.LLILLL.LJFF().LIZ(this);
        if (iLIZ == 0) {
            LJJJJI();
        } else if (iLIZ == 1) {
            LJJIIJZLJL(false);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIL());
        sbLIZ.append(" onLoadingFailed");
        C20441214yg.LIZIZ("AbsBaseMixCard", C2188811AlT.LIZIZ(sbLIZ));
        C1882870z65.LIZ(this, LJIL(), "onLoadingFailed");
        LJJI();
        this.LLJIJIL = SystemClock.elapsedRealtime() - this.LLJI;
    }

    public final void LJJIJIL() {
        if (this.LLJILJILJ == 1) {
            return;
        }
        LJJJJL(1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIL());
        sbLIZ.append(" onLoadingStarted");
        C20441214yg.LIZIZ("AbsBaseMixCard", C2188811AlT.LIZIZ(sbLIZ));
        C1882870z65.LIZ(this, LJIL(), "onLoadingStarted");
        this.LLJI = SystemClock.elapsedRealtime();
        LJJ();
        LJJJJIZL();
        InterfaceC1881340z3c interfaceC1881340z3c = this.LLILLL;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("tab_class", C1883130z6V.LIZ(this)), new Pair("card_class", LJIL()));
        Map<String, Object> map = C1338270kvh.LIZ;
        C474500IjA c474500IjALIZ = C1882960z6E.LIZ(interfaceC1881340z3c, "begin", "mix_card", mapLJIIIIZZ);
        C1882410z5L c1882410z5LLIZIZ = C1882380z5I.LIZIZ(this);
        c474500IjALIZ.LJJIIZI(c1882410z5LLIZIZ != null ? C476770Imp.LJFF(C1882380z5I.LIZ(c1882410z5LLIZIZ)) : null);
        c474500IjALIZ.LIZ();
    }

    public final void LJJIJL() {
        String strLJIILLIIL;
        View view;
        int i = this.LLJILJILJ;
        if (i == 2) {
            return;
        }
        if (i == 1) {
            C1882960z6E.LIZIZ(this.LLILLL, this, "success", C2097608Jq.LJIIIIZZ(new Pair("tab_class", C1883130z6V.LIZ(this)), new Pair("card_class", LJIL())));
        }
        this.LLJIJIL = SystemClock.elapsedRealtime() - this.LLJI;
        LJJJJL(2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIL());
        sbLIZ.append(" onLoadingSucceeded");
        C20441214yg.LIZIZ("AbsBaseMixCard", C2188811AlT.LIZIZ(sbLIZ));
        C1882870z65.LIZ(this, LJIL(), "onLoadingSucceeded");
        LJJI();
        LJJ();
        if (!this.LLJJ && (view = this.LLILZLL) != null) {
            C500260Jjc.LLFFF(view);
        }
        C09GF c09gf = C09GF.LIZ;
        long j = this.LLJIJIL;
        Map<String, Object> map = this.LLJILJIL;
        c09gf.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_partnership_mix_card_duration");
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            c474500IjALIZ.LJJII(entry.getValue(), (String) entry.getKey());
        }
        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(C1882380z5I.LIZLLL(LIZJ()))));
        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(C1882380z5I.LIZIZ(this))));
        InterfaceC1881340z3c interfaceC1881340z3cLIZJ = LIZJ();
        if (interfaceC1881340z3cLIZJ == null || (strLJIILLIIL = interfaceC1881340z3cLIZJ.LJIILLIIL()) == null) {
            strLJIILLIIL = "";
        }
        c474500IjALIZ.LJJII(strLJIILLIIL, "mix_page_tag");
        c474500IjALIZ.LJJII(LJIL(), "card_class");
        c474500IjALIZ.LJJII(C1883130z6V.LIZ(this), "tab_class");
        c474500IjALIZ.LJJII(Long.valueOf(j), "fmp");
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1880830z2n(c474500IjALIZ, this, null), 3);
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1883030z6L
    public final String LJLI() {
        return (String) this.LLJJI.getValue();
    }

    @Override // X.InterfaceC1883040z6M
    public final void retry() {
        C20441214yg.LIZIZ("AbsBaseMixCard", "card retry");
        LJJIL();
    }

    public void LJJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIL());
        sbLIZ.append(" cancelRetryView");
        C20441214yg.LIZIZ("AbsBaseMixCard", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void LJJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIL());
        sbLIZ.append(" cancelSkeletonView");
        C20441214yg.LIZIZ("AbsBaseMixCard", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void LJJIIZI() {
        LinearLayout.LayoutParams layoutParams;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIL());
        sbLIZ.append(" onAttach");
        C20441214yg.LIZIZ("AbsBaseMixCard", C2188811AlT.LIZIZ(sbLIZ));
        C1882870z65.LIZ(this, LJIL(), "onAttach");
        int iLJJII = LJJII();
        if (iLJJII > 0) {
            View view = this.LLILZLL;
            ViewGroup.LayoutParams layoutParams2 = view != null ? view.getLayoutParams() : null;
            if (!(layoutParams2 instanceof LinearLayout.LayoutParams) || (layoutParams = (LinearLayout.LayoutParams) layoutParams2) == null) {
                return;
            }
            layoutParams.topMargin = iLJJII;
        }
    }

    public void LJJIJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIL());
        sbLIZ.append(" onDestroy");
        C20441214yg.LIZIZ("AbsBaseMixCard", C2188811AlT.LIZIZ(sbLIZ));
        C1882870z65.LIZ(this, LJIL(), "onDestroy");
        this.LLILLL.getEventCenter().LJ(this);
        C1882650z5j.LIZLLL(this);
    }

    public void LJJIJIIJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIL());
        sbLIZ.append(" onDetach");
        C20441214yg.LIZIZ("AbsBaseMixCard", C2188811AlT.LIZIZ(sbLIZ));
        C1882870z65.LIZ(this, LJIL(), "onDetach");
        LJIJ(1);
        if (this.LLJILJILJ == 1) {
            long jElapsedRealtime = this.LLJI > 0 ? SystemClock.elapsedRealtime() - this.LLJI : 0L;
            C1882960z6E.LIZIZ(this.LLILLL, this, "user_cancel", C2097608Jq.LJIIIIZZ(new Pair("load_duration_ms", Long.valueOf(jElapsedRealtime)), new Pair("load_duration", Long.valueOf(jElapsedRealtime / ((long) LSPassThroughRecordSizeConfig.DEFAULT))), new Pair("tab_class", C1883130z6V.LIZ(this)), new Pair("card_class", LJIL())));
        }
    }

    public void LJJIJLIJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIL());
        sbLIZ.append(" onModelDataUpdated");
        C20441214yg.LIZIZ("AbsBaseMixCard", C2188811AlT.LIZIZ(sbLIZ));
        C1882870z65.LIZ(this, LJIL(), "onModelDataUpdated");
    }

    public void LJJIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIL());
        sbLIZ.append(" onRetry");
        C20441214yg.LIZIZ("AbsBaseMixCard", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void LJJJJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIL());
        sbLIZ.append(" showRetryView");
        C20441214yg.LIZIZ("AbsBaseMixCard", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void LJJJJIZL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIL());
        sbLIZ.append(" showSkeletonView");
        C20441214yg.LIZIZ("AbsBaseMixCard", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1882930z6B
    public final void onCreate() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIL());
        sbLIZ.append(" onCreate");
        C20441214yg.LIZIZ("AbsBaseMixCard", C2188811AlT.LIZIZ(sbLIZ));
        C1882870z65.LIZ(this, LJIL(), "onCreate");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cardClass = ");
        sbLIZ.append(LJIL());
        sbLIZ.append(", cardInTab =");
        sbLIZ.append(C1883130z6V.LIZ(this));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1883030z6L
    public InterfaceC1881340z3c LIZJ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1883030z6L
    public final String LIZLLL() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1883030z6L
    public final boolean LJFF() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1883030z6L
    public final int LJIIJ() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1883040z6M
    public final long LJIIZILJ() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1883040z6M
    public final void destroy() {
        LJJIJ();
    }

    @Override // X.InterfaceC1883040z6M
    public final InterfaceC1883040z6M getParent() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1883040z6M
    public final View getView() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1883030z6L
    public final void LJI(String str) {
        if (Intrinsics.LJFF(this.LLILLJJLI.LLILLJJLI, str)) {
            return;
        }
        this.LLILLJJLI.LLILLJJLI = str;
        LJJIFFI(str);
        if (this.LLILZLL != null) {
            C500260Jjc.LJJLIIIJILLIZJL(new C1882910z69(this));
        }
    }

    @Override // X.InterfaceC1883040z6M
    public void LJII(ViewGroup viewGroup) {
        View viewLIZIZ = LIZIZ(viewGroup);
        if (viewLIZIZ != null) {
            LJJJ(viewLIZIZ);
        }
    }

    @Override // X.InterfaceC1883040z6M
    public final void LJIIJJI(ViewGroup viewGroup) {
        if (this.LLIZLLLIL) {
            this.LLIZLLLIL = false;
            View view = this.LLILZLL;
            if (view != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
            }
            LJJIJIIJI();
        }
    }

    @Override // X.InterfaceC1883040z6M
    public final void LJIILJJIL(ViewGroup viewGroup) {
        if (!this.LLIZLLLIL) {
            this.LLIZLLLIL = true;
            View view = this.LLILZLL;
            if (view != null) {
                if (view.getParent() == null) {
                    int i = this.LLILLJJLI.LLILLL.LIZIZ;
                    int childCount = viewGroup.getChildCount();
                    if (i > childCount) {
                        i = childCount;
                    }
                    viewGroup.addView(view, i);
                } else if (view.getParent() != null && !Intrinsics.LJFF(view.getParent(), viewGroup)) {
                    C786410Ut5.LJJJLZIJ(view, (ViewGroup) view.getParent());
                    int i2 = this.LLILLJJLI.LLILLL.LIZIZ;
                    int childCount2 = viewGroup.getChildCount();
                    if (i2 > childCount2) {
                        i2 = childCount2;
                    }
                    viewGroup.addView(view, i2);
                }
            }
            LJJIIZI();
        }
    }

    @Override // X.InterfaceC1883040z6M
    public final void LJIILL(Size size) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIL());
        sbLIZ.append(" refreshSize: ");
        sbLIZ.append(size);
        C20441214yg.LIZIZ("AbsBaseMixCard", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1882930z6B
    public void LJIJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIL());
        sbLIZ.append(" onViewDisAppeared");
        C20441214yg.LIZIZ("AbsBaseMixCard", C2188811AlT.LIZIZ(sbLIZ));
        C1882870z65.LIZ(this, LJIL(), "onViewDisAppeared");
        this.LLJILLL = false;
    }

    @Override // X.InterfaceC1883040z6M
    public final void LJIJI(InterfaceC1883040z6M interfaceC1883040z6M) {
        this.LLIZ = interfaceC1883040z6M;
    }

    public void LJJIFFI(String str) {
        Object c098200Yq;
        try {
            if (str.length() > 0 && !Intrinsics.LJFF(str, "{}")) {
                this.LLILZIL = (M) C293501Bt.LIZ().LJIIIIZZ(str, (Type) this.LLILZ.getValue());
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("AbsBaseMixCard", "genDataModel error", thM5exceptionOrNullimpl);
        }
    }

    public final void LJJIIJZLJL(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIL());
        sbLIZ.append(" hideCard, isManual=");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("AbsBaseMixCard", C2188811AlT.LIZIZ(sbLIZ));
        View view = this.LLILZLL;
        if (view != null) {
            C500260Jjc.LJIILIIL(view);
        }
    }

    public void LJJIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIL());
        sbLIZ.append(" onViewAppeared");
        C20441214yg.LIZIZ("AbsBaseMixCard", C2188811AlT.LIZIZ(sbLIZ));
        C1882870z65.LIZ(this, LJIL(), "onViewAppeared");
        this.LLJILLL = true;
    }

    public void LJJJ(View view) {
        this.LLILZLL = view;
    }

    public final void LJJJIL(String str) {
        this.LLILLL.getEventCenter().LIZJ(str, this);
    }

    public final void LJJJJJ(String str) {
        this.LLILLL.getEventCenter().LIZLLL(str, this);
    }

    public final void LJJJJJL(int i) {
        ViewGroup.LayoutParams layoutParams;
        View view = this.LLILZLL;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.height = i;
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C786410Ut5.W5(view2, layoutParams);
        }
    }

    public final void LJJJJL(int i) {
        if (this.LLJILJILJ == i) {
            return;
        }
        this.LLJILJILJ = i;
        this.LLILLL.LJIIJJI().LJ(this, i);
    }

    @Override // X.InterfaceC1883040z6M
    public final void LJIIIIZZ(int i, boolean z) {
        if (this.LLJILLL != z && this.LLJILJILJ == 2) {
            if (z) {
                LJJIZ(i);
            } else {
                LJIJ(i);
            }
        }
    }

    @Override // X.InterfaceC1882630z5h
    public final void LJIJJLI(String str, InterfaceC1881290z3X interfaceC1881290z3X) {
        LJJIIJ(str, interfaceC1881290z3X);
    }

    public final void LJJJI(Object obj, String str) {
        this.LLILLL.getEventCenter().LIZIZ(obj, str);
    }

    public final void LJJJJ(int i, String str) {
        Map<String, String> mapLJFF;
        InterfaceC1881340z3c interfaceC1881340z3c = this.LLILLL;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("tab_class", C1883130z6V.LIZ(this)), new Pair("card_class", LJIL()));
        Map<String, Object> map = C1338270kvh.LIZ;
        C474500IjA c474500IjALIZ = C1882960z6E.LIZ(interfaceC1881340z3c, "error", "mix_card", mapLJIIIIZZ);
        C1882410z5L c1882410z5LLIZIZ = C1882380z5I.LIZIZ(this);
        if (c1882410z5LLIZIZ != null) {
            mapLJFF = C476770Imp.LJFF(C1882380z5I.LIZ(c1882410z5LLIZIZ));
        } else {
            mapLJFF = null;
        }
        c474500IjALIZ.LJJIIZI(mapLJFF);
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(str, "error_msg");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1882750z5t
    public final void y60(Object obj, String str) {
        LJJIII(obj, str);
    }

    public AbstractC1882890z67(Context context, C1155600gB4 c1155600gB4, InterfaceC1881340z3c interfaceC1881340z3c) {
        this.LL = context;
        this.LLILLJJLI = c1155600gB4;
        this.LLILLL = interfaceC1881340z3c;
        LJJIFFI(c1155600gB4.LLILLJJLI);
    }
}
