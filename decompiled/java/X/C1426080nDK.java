package X;

import Y.AObjectS245S0100000_22;
import Y.AObjectS305S0200000_22;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.editeffect.search.middleware.sug.SearchSugResponse;
import com.ss.android.ugc.aweme.editeffect.search.middleware.sug.SugConfig;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import ge.i;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nDK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426080nDK extends i<InterfaceC1426210nDX, C1426230nDZ, C1426050nDH, C1426140nDQ> implements InterfaceC379610EuV, InterfaceC1426210nDX {
    public static final C1426180nDU LLJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public Long LLJJIII;
    public final Function0<Boolean> LLJJIJI;
    public final Function0<C1426050nDH> LLJJIJIIJIL;
    public final Function0<C1426140nDQ> LLJJIJIL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0nDU] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1426080nDK.class, "searchMiddlePageApi", "getSearchMiddlePageApi()Lcom/ss/android/ugc/aweme/editeffect/search/middleware/IEditEffectSearchApi;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1426080nDK.class, "searchCoreApi", "getSearchCoreApi()Lcom/ss/android/ugc/aweme/editeffect/search/middleware/IEditEffectSearchCoreApi;", 0), new C2217381BqS(C1426080nDK.class, "searchRootApi", "getSearchRootApi()Lcom/ss/android/ugc/aweme/editeffect/search/EditEffectSearchPanelApi;", 0)};
        LLJJJ = new Object() { // from class: X.0nDU
        };
    }

    private final InterfaceC1426440nDu H4() {
        return (InterfaceC1426440nDu) this.LLJJ.getValue(this, LLJJJIL[1]);
    }

    public final InterfaceC1426170nDT K4() {
        return (InterfaceC1426170nDT) this.LLJILLL.getValue(this, LLJJJIL[0]);
    }

    public final InterfaceC1426280nDe O4() {
        return (InterfaceC1426280nDe) this.LLJJI.getValue(this, LLJJJIL[2]);
    }

    private final void Xi() {
        C1426250nDb c1426250nDbBn;
        h0<Pair<String, Integer>> h0Var;
        C1426110nDN c1426110nDNIr;
        InterfaceC1426280nDe interfaceC1426280nDeO4 = O4();
        if (interfaceC1426280nDeO4 != null && (c1426110nDNIr = interfaceC1426280nDeO4.ir()) != null) {
            c1426110nDNIr.LIZ.LIZ(this, new AObjectS305S0200000_22(c1426110nDNIr, this, 2));
        }
        InterfaceC1426280nDe interfaceC1426280nDeO42 = O4();
        if (interfaceC1426280nDeO42 == null || (c1426250nDbBn = interfaceC1426280nDeO42.bn()) == null || (h0Var = c1426250nDbBn.LIZ) == null) {
            return;
        }
        h0Var.LIZ(this, new AObjectS245S0100000_22(this, 11));
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
        InterfaceC1426280nDe interfaceC1426280nDeO4 = O4();
        if (interfaceC1426280nDeO4 != null) {
            interfaceC1426280nDeO4.Vb1(true, 4);
        }
        this.LLJJIII = Long.valueOf(System.currentTimeMillis());
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1426050nDH> o2() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1426140nDQ> w2() {
        return this.LLJJIJIL;
    }

    public final void F4(String str) {
        C1425990nDB c1425990nDBG22;
        InterfaceC1426440nDu interfaceC1426440nDuH4 = H4();
        if (interfaceC1426440nDuH4 != null && (c1425990nDBG22 = interfaceC1426440nDuH4.g22()) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1426020nDE(this, c1425990nDBG22, str, null), 2);
        }
    }

    public final List<SearchSugEntity> P4(SearchSugResponse searchSugResponse) {
        boolean z;
        if (searchSugResponse == null) {
            return C13BV.INSTANCE;
        }
        List<SearchSugEntity> list = searchSugResponse.sugList;
        if (list == null) {
            return C13BV.INSTANCE;
        }
        List<SearchSugEntity> listLL = C13LP.LL(list, 10);
        for (SearchSugEntity searchSugEntity : listLL) {
            searchSugEntity.LIZIZ = -1;
            SugConfig sugConfig = searchSugResponse.sugConfig;
            if (sugConfig != null && sugConfig.isPredictSug) {
                z = true;
            } else {
                z = false;
            }
            searchSugEntity.LJFF = z;
            searchSugEntity.LJI = searchSugResponse.LIZ;
        }
        return listLL;
    }

    public final void XH0(C1426830nEX c1426830nEX) {
        InterfaceC1426280nDe interfaceC1426280nDeO4 = O4();
        if (interfaceC1426280nDeO4 != null) {
            interfaceC1426280nDeO4.XH0(c1426830nEX);
        }
    }

    public C1426080nDK(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1426170nDT.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1426440nDu.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1426280nDe.class, null);
        this.LLJJIJI = new AwS566S0100000_22(this, 91);
        this.LLJJIJIIJIL = new AwS566S0100000_22(this, 90);
        this.LLJJIJIL = new AwS566S0100000_22(this, 92);
    }
}
