package X;

import Y.AObjectS245S0100000_22;
import Y.AObjectS305S0200000_22;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import ge.i;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nAS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1424300nAS extends i<InterfaceC2272891Dxn, C1425980nDA, C1424400nAc, C1424370nAZ> implements InterfaceC2272891Dxn, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final C01GW LLJJ;
    public Long LLJJI;
    public final Function0<C1424400nAc> LLJJIII;
    public final Function0<C1424370nAZ> LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1424300nAS.class, "templateTabSearchApi", "getTemplateTabSearchApi()Lcom/ss/android/ugc/aweme/template/search/TemplateTabSearchApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIL = 8;
    }

    public final InterfaceC1424330nAV O4() {
        return (InterfaceC1424330nAV) this.LLJJ.getValue();
    }

    public final InterfaceC1423900n9o P4() {
        return (InterfaceC1423900n9o) this.LLJILLL.getValue(this, LLJJIJIIJIL[0]);
    }

    private final void Xi() {
        C1422860n88 c1422860n88Bn;
        h0<Pair<String, Integer>> h0Var;
        C1422900n8C c1422900n8CIr;
        InterfaceC1423900n9o interfaceC1423900n9oP4 = P4();
        if (interfaceC1423900n9oP4 != null && (c1422900n8CIr = interfaceC1423900n9oP4.ir()) != null) {
            c1422900n8CIr.LIZ.LIZ(this, new AObjectS305S0200000_22(c1422900n8CIr, this, 4));
        }
        InterfaceC1423900n9o interfaceC1423900n9oP42 = P4();
        if (interfaceC1423900n9oP42 == null || (c1422860n88Bn = interfaceC1423900n9oP42.bn()) == null || (h0Var = c1422860n88Bn.LIZ) == null) {
            return;
        }
        h0Var.LIZ(this, new AObjectS245S0100000_22(this, 42));
    }

    public final void H4() {
        C1422860n88 c1422860n88Bn;
        InterfaceC1423900n9o interfaceC1423900n9oP4 = P4();
        if (interfaceC1423900n9oP4 == null || (c1422860n88Bn = interfaceC1423900n9oP4.bn()) == null) {
            return;
        }
        c1422860n88Bn.LIZ();
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
        this.LLJJI = Long.valueOf(System.currentTimeMillis());
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1424400nAc> o2() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1424370nAZ> w2() {
        return this.LLJJIJI;
    }

    public final void F4(String str) {
        C1422860n88 c1422860n88Bn;
        InterfaceC1423900n9o interfaceC1423900n9oP4 = P4();
        if (interfaceC1423900n9oP4 != null && (c1422860n88Bn = interfaceC1423900n9oP4.bn()) != null) {
            c1422860n88Bn.LIZIZ(str, 2);
        }
    }

    public final void K4(String str) {
        if (!a0.LJJJIL(str) && isShowing()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1424310nAT(this, str, null), 2);
        }
    }

    public final void T4(C1424200nAI c1424200nAI) {
        InterfaceC1423900n9o interfaceC1423900n9oP4 = P4();
        if (interfaceC1423900n9oP4 != null) {
            Long l = this.LLJJI;
            boolean z = c1424200nAI.LIZ;
            String str = c1424200nAI.LIZIZ;
            String str2 = c1424200nAI.LIZJ;
            int i = c1424200nAI.LIZLLL;
            String str3 = c1424200nAI.LJ;
            String str4 = c1424200nAI.LJFF;
            String str5 = c1424200nAI.LJI;
            String str6 = c1424200nAI.LJII;
            c1424200nAI.getClass();
            interfaceC1423900n9oP4.dg1(new C1424200nAI(z, str, str2, i, str3, str4, str5, str6, l));
        }
    }

    public final void Z4(SearchSugResponse searchSugResponse) {
        List<SearchSugEntity> listLL = C13LP.LL(searchSugResponse.sugList, 10);
        for (SearchSugEntity searchSugEntity : listLL) {
            searchSugEntity.LIZIZ = -1;
            searchSugEntity.LJFF = searchSugResponse.LJIILIIL();
            searchSugEntity.LJI = searchSugResponse.LLILLL;
        }
        searchSugResponse.sugList = listLL;
        if (listLL.isEmpty() || !isShowing()) {
            return;
        }
        i3(new AwS601S0100000_22(searchSugResponse, 142));
    }

    public C1424300nAS(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1423900n9o.class, null);
        this.LLJJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(107));
        this.LLJJIII = new AwS566S0100000_22(this, 230);
        this.LLJJIJI = new AwS566S0100000_22(this, 231);
    }

    public final void d5(String str, int i) {
        InterfaceC1423900n9o interfaceC1423900n9oP4 = P4();
        if (interfaceC1423900n9oP4 != null) {
            interfaceC1423900n9oP4.Qo1(str, "search_sug", Integer.valueOf(i));
        }
    }
}
