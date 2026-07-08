package X;

import Y.AObjectS305S0200000_22;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.template.search.TemplateSearchHistoryItem;
import ge.i;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS231S0300000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nCF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425410nCF extends i<InterfaceC1425480nCM, C1425840nCw, C1425460nCK, C1425900nD2> implements InterfaceC1425480nCM, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C1DRG LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final C01GW LLJJI;
    public final Function0<C1425460nCK> LLJJIII;
    public final Function0<C1425900nD2> LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1425410nCF.class, "templateTabSearchApi", "getTemplateTabSearchApi()Lcom/ss/android/ugc/aweme/template/search/TemplateTabSearchApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIL = 8;
    }

    private final InterfaceC1423900n9o O4() {
        return (InterfaceC1423900n9o) this.LLJJ.getValue(this, LLJJIJIIJIL[0]);
    }

    private final InterfaceC1425430nCH<TemplateSearchHistoryItem> p10() {
        return (InterfaceC1425430nCH) this.LLJJI.getValue();
    }

    private final void Xi() {
        C1422900n8C c1422900n8CIr;
        InterfaceC1423900n9o interfaceC1423900n9oO4 = O4();
        if (interfaceC1423900n9oO4 == null || (c1422900n8CIr = interfaceC1423900n9oO4.ir()) == null) {
            return;
        }
        c1422900n8CIr.LIZ.LIZ(this, new AObjectS305S0200000_22(c1422900n8CIr, this, 10));
    }

    public final void K4() {
        InterfaceC1425430nCH<TemplateSearchHistoryItem> interfaceC1425430nCHP10 = p10();
        if (interfaceC1425430nCHP10 != null) {
            interfaceC1425430nCHP10.clearAll();
        }
        P4(C13BV.INSTANCE);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        InterfaceC1425430nCH<TemplateSearchHistoryItem> interfaceC1425430nCHP10 = p10();
        P4(interfaceC1425430nCHP10 != null ? interfaceC1425430nCHP10.getAll() : null);
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
        InterfaceC1425430nCH<TemplateSearchHistoryItem> interfaceC1425430nCHP10 = p10();
        P4(interfaceC1425430nCHP10 != null ? interfaceC1425430nCHP10.getAll() : null);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1425460nCK> o2() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1425900nD2> w2() {
        return this.LLJJIJI;
    }

    private final void P4(List<TemplateSearchHistoryItem> list) {
        List<TemplateSearchHistoryItem> list2;
        C1422900n8C c1422900n8CIr;
        if (list == null) {
            list2 = C13BV.INSTANCE;
        } else {
            list2 = list;
        }
        m3(new AwS231S0300000_22((List) list, (List<TemplateSearchHistoryItem>) this, (C1425410nCF) list2, (List<TemplateSearchHistoryItem>) 15));
        InterfaceC1423900n9o interfaceC1423900n9oO4 = O4();
        if (interfaceC1423900n9oO4 != null && (c1422900n8CIr = interfaceC1423900n9oO4.ir()) != null) {
            c1422900n8CIr.LIZJ(1, new AwS601S0100000_22(list2, (List<CreateAnchorInfo>) 283));
        }
    }

    public final void F4(TemplateSearchHistoryItem templateSearchHistoryItem, int i) {
        List<TemplateSearchHistoryItem> listLIZJ;
        String str = templateSearchHistoryItem.keyword;
        if (str == null) {
            return;
        }
        InterfaceC1425430nCH<TemplateSearchHistoryItem> interfaceC1425430nCHP10 = p10();
        if (interfaceC1425430nCHP10 == null || (listLIZJ = interfaceC1425430nCHP10.LIZJ(templateSearchHistoryItem)) == null) {
            listLIZJ = C13BV.INSTANCE;
        }
        P4(listLIZJ);
        InterfaceC1423900n9o interfaceC1423900n9oO4 = O4();
        if (interfaceC1423900n9oO4 != null) {
            interfaceC1423900n9oO4.Qo1(str, "search_history", null);
        }
    }

    public final void H4(TemplateSearchHistoryItem templateSearchHistoryItem, int i) {
        List<TemplateSearchHistoryItem> listLIZ;
        InterfaceC1425430nCH<TemplateSearchHistoryItem> interfaceC1425430nCHP10 = p10();
        if (interfaceC1425430nCHP10 == null || (listLIZ = interfaceC1425430nCHP10.LIZ(templateSearchHistoryItem)) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        P4(listLIZ);
    }

    public C1425410nCF(C19A3 c19a3, C1DRG c1drg, C1DRG c1drg2) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c1drg2;
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1423900n9o.class, null);
        this.LLJJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 417));
        this.LLJJIII = new AwS566S0100000_22(this, 416);
        this.LLJJIJI = new AwS566S0100000_22(this, 418);
    }
}
