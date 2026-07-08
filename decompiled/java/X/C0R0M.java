package X;

import Y.AfS179S0100000_10;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui.ISearchList;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui.SearchList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0R0M, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R0M implements ISearchList {
    public final SearchList LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(236));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(235));
    public final Set<InterfaceC688940R0q> LLILZ = new LinkedHashSet();

    public final List<InterfaceC420801kM> LIZ() {
        return (List) this.LLILLL.getValue();
    }

    public final C0R0K LIZIZ() {
        return (C0R0K) this.LLILLJJLI.getValue();
    }

    public C0R0M(SearchList searchList) {
        this.LL = searchList;
    }

    public final void LIZJ(InterfaceC688940R0q interfaceC688940R0q) {
        this.LLILZ.add(interfaceC688940R0q);
    }

    public final void LIZLLL(C0R0P c0r0p) {
        int i = C0R0Q.LIZ[c0r0p.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C653250Pjn c653250Pjn = new C653250Pjn(this.LL.mContext.LJIILJJIL());
                LIZIZ().LJJII = c653250Pjn;
                LIZIZ().LJII = c653250Pjn;
                return;
            }
            throw new C1954807lC();
        }
        C653260Pjo c653260Pjo = new C653260Pjo();
        LIZIZ().LJJII = c653260Pjo;
        LIZIZ().LJII = c653260Pjo;
    }

    public final <T> void LJ(JavaOnlyMap javaOnlyMap, final Class<T> cls, Function1<? super T, Unit> function1) {
        final int size = LIZ().size();
        LIZ().add(C11NN.LJIIIIZZ(javaOnlyMap).LJIIIZ(new InterfaceC1487280oo2() { // from class: X.0R0O
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C0R0M c0r0m = this.LL;
                Class<T> cls2 = cls;
                c0r0m.getClass();
                try {
                    return C08JS.LIZ(C08JS.LIZLLL(obj), cls2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
        }).LJIIZILJ(C11S5.LIZIZ).LJIIJ(C1701940uOG.LIZIZ()).LJIILJJIL(new AfS179S0100000_10(function1, 5), new C09JN() { // from class: X.0R0R
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("SearchListProxy@4562.transAsync$disposable$3");
                C1C7U.LIZIZ("SearchListProxy@4562.transAsync$disposable$3");
            }
        }, new InterfaceC781210Ukh() { // from class: X.0R0U
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                if (size < this.LIZ().size()) {
                    ListProtector.remove(this.LIZ(), size);
                }
            }
        }, C11NU.INSTANCE));
    }
}
