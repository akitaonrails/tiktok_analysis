package X;

import Y.AObjectS245S0100000_22;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.editeffect.search.middleware.trending.EditEffectSearchTrendingItem;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import ge.i;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nDM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426100nDM extends i<InterfaceC1426220nDY, C1427170nF5, C1426120nDO, C1426160nDS> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final Function0<C1426120nDO> LLJJIJI;
    public final Function0<C1426160nDS> LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1426100nDM.class, "searchCoreApi", "getSearchCoreApi()Lcom/ss/android/ugc/aweme/editeffect/search/middleware/IEditEffectSearchCoreApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1426100nDM.class, "searchMiddlePageApi", "getSearchMiddlePageApi()Lcom/ss/android/ugc/aweme/editeffect/search/middleware/IEditEffectSearchApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1426100nDM.class, "searchRootApi", "getSearchRootApi()Lcom/ss/android/ugc/aweme/editeffect/search/EditEffectSearchPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1426100nDM.class, "searchHistoryApi", "getSearchHistoryApi()Lcom/ss/android/ugc/aweme/editeffect/search/middleware/history/EditEffectSearchHistoryApi;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public final void T4() {
        C1424450nAh c1424450nAhAD1;
        InterfaceC1426440nDu interfaceC1426440nDuH4 = H4();
        if (interfaceC1426440nDuH4 == null || (c1424450nAhAD1 = interfaceC1426440nDuH4.AD1()) == null) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1412300mr6(c1424450nAhAD1, System.currentTimeMillis(), this, null), 2);
    }

    private final InterfaceC1426440nDu H4() {
        return (InterfaceC1426440nDu) this.LLJILLL.getValue(this, LLJJIJIL[0]);
    }

    private final InterfaceC1426200nDW K4() {
        return (InterfaceC1426200nDW) this.LLJJIII.getValue(this, LLJJIJIL[3]);
    }

    private final InterfaceC1426170nDT O4() {
        return (InterfaceC1426170nDT) this.LLJJ.getValue(this, LLJJIJIL[1]);
    }

    public final InterfaceC1426280nDe P4() {
        return (InterfaceC1426280nDe) this.LLJJI.getValue(this, LLJJIJIL[2]);
    }

    private final void Xi() {
        P4().ir().LIZ.LIZ(this, new AObjectS245S0100000_22(this, 12));
        P4().LLL().LIZ(this, new AObjectS245S0100000_22(this, 13));
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        if (!T2().LIZIZ.isEmpty()) {
            super.show();
        } else {
            C1426110nDN c1426110nDNIr = P4().ir();
            c1426110nDNIr.LIZLLL(c1426110nDNIr.LIZ() & (-3));
        }
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1426120nDO> o2() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1426160nDS> w2() {
        return this.LLJJIJIIJIL;
    }

    public final void F4(EditEffectSearchTrendingItem editEffectSearchTrendingItem) {
        O4().jZ(editEffectSearchTrendingItem.title, EnumC1426270nDd.SEARCH_TRENDING);
    }

    public final void Z4(List<EditEffectSearchTrendingItem> list) {
        i3(new AwS601S0100000_22(list, (List<CreateAnchorInfo>) 83));
        P4().ir().LIZJ(2, new AwS601S0100000_22(list, (List<CreateAnchorInfo>) 84));
    }

    public C1426100nDM(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1426440nDu.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1426170nDT.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1426280nDe.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1426200nDW.class, null);
        this.LLJJIJI = new AwS566S0100000_22(this, 93);
        this.LLJJIJIIJIL = new AwS566S0100000_22(this, 94);
    }
}
