package X;

import Y.AObjectS245S0100000_22;
import com.bytedance.als.h0;
import ge.i;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426320nDi extends i<InterfaceC1426660nEG, C1427290nFH, C1426330nDj, C1426370nDn> implements InterfaceC379610EuV, InterfaceC1426660nEG {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1426660nEG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final Function0<C1426330nDj> LLJJIII;
    public final Function0<C1426370nDn> LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1426320nDi.class, "searchMiddlePageApi", "getSearchMiddlePageApi()Lcom/ss/android/ugc/aweme/editeffect/search/middleware/IEditEffectSearchApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1426320nDi.class, "searchRootApi", "getSearchRootApi()Lcom/ss/android/ugc/aweme/editeffect/search/EditEffectSearchPanelApi;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final void cancel() {
        jj0(false);
        InterfaceC1426280nDe interfaceC1426280nDeO4 = O4();
        if (interfaceC1426280nDeO4 != null) {
            interfaceC1426280nDeO4.hm1();
        }
    }

    public final InterfaceC1426170nDT K4() {
        return (InterfaceC1426170nDT) this.LLJJ.getValue(this, LLJJIJIIJIL[0]);
    }

    public final InterfaceC1426280nDe O4() {
        return (InterfaceC1426280nDe) this.LLJJI.getValue(this, LLJJIJIIJIL[1]);
    }

    private final void Xi() {
        C1426250nDb c1426250nDbBn;
        h0<Pair<String, Integer>> h0Var;
        C1426110nDN c1426110nDNIr;
        h0<Pair<Integer, Integer>> h0Var2;
        InterfaceC1426280nDe interfaceC1426280nDeO4 = O4();
        if (interfaceC1426280nDeO4 != null && (c1426110nDNIr = interfaceC1426280nDeO4.ir()) != null && (h0Var2 = c1426110nDNIr.LIZ) != null) {
            h0Var2.LIZ(this, new AObjectS245S0100000_22(this, 9));
        }
        InterfaceC1426280nDe interfaceC1426280nDeO42 = O4();
        if (interfaceC1426280nDeO42 == null || (c1426250nDbBn = interfaceC1426280nDeO42.bn()) == null || (h0Var = c1426250nDbBn.LIZ) == null) {
            return;
        }
        h0Var.LIZ(this, new AObjectS245S0100000_22(this, 10));
    }

    private final boolean Z4() {
        InterfaceC1426280nDe interfaceC1426280nDeO4 = O4();
        if (interfaceC1426280nDeO4 == null) {
            return false;
        }
        return interfaceC1426280nDeO4.ir().LIZIZ(1) || interfaceC1426280nDeO4.ir().LIZIZ(2);
    }

    public final void F4() {
        C1426110nDN c1426110nDNIr;
        String first;
        C1426250nDb c1426250nDbBn;
        h0<Pair<String, Integer>> h0Var;
        Pair<String, Integer> pairLIZJ;
        InterfaceC1426280nDe interfaceC1426280nDeO4 = O4();
        if (interfaceC1426280nDeO4 == null || (c1426110nDNIr = interfaceC1426280nDeO4.ir()) == null || !c1426110nDNIr.LIZIZ(8)) {
            return;
        }
        InterfaceC1426280nDe interfaceC1426280nDeO42 = O4();
        if (interfaceC1426280nDeO42 == null || (c1426250nDbBn = interfaceC1426280nDeO42.bn()) == null || (h0Var = c1426250nDbBn.LIZ) == null || (pairLIZJ = h0Var.LIZJ()) == null || (first = pairLIZJ.getFirst()) == null) {
            first = "";
        }
        d5(first);
    }

    public final void S() {
        C1426110nDN c1426110nDNIr;
        InterfaceC1426280nDe interfaceC1426280nDeO4 = O4();
        if (interfaceC1426280nDeO4 == null || (c1426110nDNIr = interfaceC1426280nDeO4.ir()) == null) {
            return;
        }
        if (c1426110nDNIr.LIZIZ(8) || c1426110nDNIr.LIZIZ(4)) {
            P4(this, "", 2);
            return;
        }
        InterfaceC1426280nDe interfaceC1426280nDeO42 = O4();
        if (interfaceC1426280nDeO42 != null) {
            interfaceC1426280nDeO42.LIZLLL();
        }
    }

    public final void UR() {
        InterfaceC1426280nDe interfaceC1426280nDeO4 = O4();
        if (interfaceC1426280nDeO4 != null) {
            interfaceC1426280nDeO4.UR();
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        if (Z4()) {
            i3(AFwS261S0000000_22.get$arr$(53));
        }
    }

    public InterfaceC1426660nEG H4() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1426330nDj> o2() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1426370nDn> w2() {
        return this.LLJJIJI;
    }

    private final void d5(String str) {
        C1426110nDN c1426110nDNIr;
        int i;
        InterfaceC1426280nDe interfaceC1426280nDeO4 = O4();
        if (interfaceC1426280nDeO4 != null && (c1426110nDNIr = interfaceC1426280nDeO4.ir()) != null) {
            if (a0.LJJJIL(str)) {
                i = 3;
            } else {
                i = 4;
            }
            c1426110nDNIr.LIZLLL(i);
        }
    }

    @Override // X.InterfaceC1426660nEG
    public void jj0(boolean z) {
        i3(new AwS35S0010000_22(z, 6));
    }

    public C1426320nDi(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = this;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1426170nDT.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1426280nDe.class, null);
        this.LLJJIII = AFwS210S0000000_22.get$arr$(54);
        this.LLJJIJI = new AwS566S0100000_22(this, 88);
    }

    public static final void P4(C1426320nDi c1426320nDi, String str, int i) {
        String first;
        C1426250nDb c1426250nDbBn;
        C1426250nDb c1426250nDbBn2;
        h0<Pair<String, Integer>> h0Var;
        Pair<String, Integer> pairLIZJ;
        InterfaceC1426280nDe interfaceC1426280nDeO4 = c1426320nDi.O4();
        if (interfaceC1426280nDeO4 != null && (c1426250nDbBn2 = interfaceC1426280nDeO4.bn()) != null && (h0Var = c1426250nDbBn2.LIZ) != null && (pairLIZJ = h0Var.LIZJ()) != null) {
            first = pairLIZJ.getFirst();
        } else {
            first = null;
        }
        if (Intrinsics.LJFF(str, first)) {
            return;
        }
        c1426320nDi.d5(str);
        InterfaceC1426280nDe interfaceC1426280nDeO42 = c1426320nDi.O4();
        if (interfaceC1426280nDeO42 != null && (c1426250nDbBn = interfaceC1426280nDeO42.bn()) != null) {
            c1426250nDbBn.LIZ(str, i);
        }
    }
}
