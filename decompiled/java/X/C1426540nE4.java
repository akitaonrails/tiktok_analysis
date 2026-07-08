package X;

import Y.AObjectS245S0100000_22;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS105S0201000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS72S1000000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nE4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426540nE4 extends i<InterfaceC1426170nDT, C1426670nEH, C1426570nE7, C1426630nED> implements InterfaceC379610EuV, InterfaceC1426170nDT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final C1DRG LLJILJILJ;
    public final VideoPublishEditModel LLJILLL;
    public final InterfaceC1426170nDT LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final Function0<C1426570nE7> LLJJIJIL;
    public final Function0<C1426630nED> LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1426540nE4.class, "searchBoxApi", "getSearchBoxApi()Lcom/ss/android/ugc/aweme/editeffect/search/middleware/searchbox/IEditEffectSearchBoxApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1426540nE4.class, "searchCoreApi", "getSearchCoreApi()Lcom/ss/android/ugc/aweme/editeffect/search/middleware/IEditEffectSearchCoreApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1426540nE4.class, "searchResultApi", "getSearchResultApi()Lcom/ss/android/ugc/aweme/editeffect/search/middleware/result/EffectSearchResultApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1426540nE4.class, "searchRootApi", "getSearchRootApi()Lcom/ss/android/ugc/aweme/editeffect/search/EditEffectSearchPanelApi;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    private final InterfaceC1426660nEG O4() {
        return (InterfaceC1426660nEG) this.LLJJI.getValue(this, LLJJJIL[0]);
    }

    private final InterfaceC1426440nDu P4() {
        return (InterfaceC1426440nDu) this.LLJJIII.getValue(this, LLJJJIL[1]);
    }

    private final InterfaceC1426620nEC T4() {
        return (InterfaceC1426620nEC) this.LLJJIJI.getValue(this, LLJJJIL[2]);
    }

    private final InterfaceC1426280nDe Z4() {
        return (InterfaceC1426280nDe) this.LLJJIJIIJIL.getValue(this, LLJJJIL[3]);
    }

    private final void Xi() {
        Z4().ir().LIZ.LIZ(this, new AObjectS245S0100000_22(this, 7));
        Z4().bn().LIZ.LIZ(this, new AObjectS245S0100000_22(this, 8));
    }

    public final void F4() {
        if (Z4().ir().LIZIZ(8)) {
            t5(Z4().bn().LIZ.LIZJ().getFirst());
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    public InterfaceC1426170nDT K4() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1426570nE7> o2() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1426630nED> w2() {
        return this.LLJJJ;
    }

    private final void t5(String str) {
        int i;
        C1426110nDN c1426110nDNIr = Z4().ir();
        if (a0.LJJJIL(str)) {
            i = 3;
        } else {
            i = 4;
        }
        c1426110nDNIr.LIZLLL(i);
    }

    public final void H4(boolean z) {
        O4().jj0(z);
    }

    public final void n5(int i) {
        if (i != 4 && i != 8) {
            return;
        }
        m3(new AwS105S0201000_22(Z4().bb(), i, this, 0));
    }

    private final void d5(String str, int i) {
        if (Intrinsics.LJFF(str, Z4().bn().LIZ.LIZJ().getFirst())) {
            return;
        }
        t5(str);
        Z4().bn().LIZ(str, i);
    }

    @Override // X.InterfaceC1426170nDT
    public void jZ(String str, EnumC1426270nDd enumC1426270nDd) {
        if (a0.LJJJIL(str)) {
            i3(AFwS261S0000000_22.get$arr$(44));
            return;
        }
        Z4().Jt1(enumC1426270nDd);
        P4().hj2().LIZ(str);
        Z4().bn().LIZ(str, 1);
        i3(new AwS72S1000000_22(str, 0));
        Z4().ir().LIZLLL(8);
        T4().SG0(str, enumC1426270nDd.name());
    }

    public C1426540nE4(C19A3 c19a3, C1DRG c1drg, VideoPublishEditModel videoPublishEditModel) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = videoPublishEditModel;
        this.LLJJ = this;
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1426660nEG.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1426440nDu.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1426620nEC.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1426280nDe.class, null);
        this.LLJJIJIL = new AwS566S0100000_22(this, 78);
        this.LLJJJ = new AwS566S0100000_22(this, 79);
    }
}
