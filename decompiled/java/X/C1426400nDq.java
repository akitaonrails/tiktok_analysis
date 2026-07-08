package X;

import Y.AObjectS305S0200000_22;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import ge.i;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS231S0300000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nDq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426400nDq extends i<InterfaceC1426200nDW, C1427180nF6, C1426470nDx, C1427160nF4> implements InterfaceC379610EuV, InterfaceC1426200nDW {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1426200nDW LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public C1426410nDr LLJJIJI;
    public final Function0<C1426470nDx> LLJJIJIIJIL;
    public final Function0<C1427160nF4> LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1426400nDq.class, "searchCoreApi", "getSearchCoreApi()Lcom/ss/android/ugc/aweme/editeffect/search/middleware/IEditEffectSearchCoreApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1426400nDq.class, "searchRootApi", "getSearchRootApi()Lcom/ss/android/ugc/aweme/editeffect/search/EditEffectSearchPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1426400nDq.class, "searchMiddlePageApi", "getSearchMiddlePageApi()Lcom/ss/android/ugc/aweme/editeffect/search/middleware/IEditEffectSearchApi;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    private final InterfaceC1426440nDu O4() {
        return (InterfaceC1426440nDu) this.LLJJ.getValue(this, LLJJJ[0]);
    }

    private final InterfaceC1426170nDT P4() {
        return (InterfaceC1426170nDT) this.LLJJIII.getValue(this, LLJJJ[2]);
    }

    private final InterfaceC1426280nDe T4() {
        return (InterfaceC1426280nDe) this.LLJJI.getValue(this, LLJJJ[1]);
    }

    private final C1426410nDr hj2() {
        if (this.LLJJIJI == null) {
            this.LLJJIJI = O4().hj2();
        }
        return this.LLJJIJI;
    }

    private final void Xi() {
        C1426110nDN c1426110nDNIr = T4().ir();
        c1426110nDNIr.LIZ.LIZ(this, new AObjectS305S0200000_22(c1426110nDNIr, this, 0));
    }

    public final void H4() {
        C1426410nDr c1426410nDrHj2 = hj2();
        if (c1426410nDrHj2 != null) {
            ((Keva) c1426410nDrHj2.LIZ.getValue()).erase(C1426410nDr.LIZIZ());
        }
        Z4(C13BV.INSTANCE);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        C1426410nDr c1426410nDrHj2 = hj2();
        Z4(c1426410nDrHj2 != null ? c1426410nDrHj2.LIZJ() : null);
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
        C1426410nDr c1426410nDrHj2 = hj2();
        Z4(c1426410nDrHj2 != null ? c1426410nDrHj2.LIZJ() : null);
    }

    public InterfaceC1426200nDW K4() {
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
    public Function0<C1426470nDx> o2() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1427160nF4> w2() {
        return this.LLJJIJIL;
    }

    private final void Z4(List<C1426450nDv> list) {
        List<C1426450nDv> list2;
        if (!T4().LLL().LIZJ().booleanValue()) {
            return;
        }
        if (list == null) {
            list2 = C13BV.INSTANCE;
        } else {
            list2 = list;
        }
        m3(new AwS231S0300000_22((List) list, (List<C1426450nDv>) this, (C1426400nDq) list2, (List<C1426450nDv>) 4));
        T4().ir().LIZJ(1, new AwS601S0100000_22(list2, (List<CreateAnchorInfo>) 62));
    }

    public C1426400nDq(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = this;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1426440nDu.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1426280nDe.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1426170nDT.class, null);
        this.LLJJIJIIJIL = AFwS210S0000000_22.get$arr$(49);
        this.LLJJIJIL = new AwS566S0100000_22(this, 81);
    }

    public final void F4(C1426450nDv c1426450nDv, int i) {
        List<C1426450nDv> listLIZJ;
        String str = c1426450nDv.LIZ;
        C1426410nDr c1426410nDrHj2 = hj2();
        if (c1426410nDrHj2 != null) {
            listLIZJ = c1426410nDrHj2.LIZJ();
            Iterator<C1426450nDv> it2 = listLIZJ.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it2.next().LIZ, c1426450nDv.LIZ)) {
                    if (i2 >= 0) {
                        ListProtector.remove(listLIZJ, i2);
                        ListProtector.add(listLIZJ, 0, new C1426450nDv(c1426450nDv.LIZ, c1426450nDv.LIZIZ, System.currentTimeMillis()));
                        c1426410nDrHj2.LIZLLL(listLIZJ);
                    }
                } else {
                    i2++;
                }
            }
            listLIZJ = c1426410nDrHj2.LIZ(c1426450nDv.LIZ);
        } else {
            listLIZJ = C13BV.INSTANCE;
        }
        Z4(listLIZJ);
        P4().jZ(str, EnumC1426270nDd.SEARCH_HISTORY);
    }
}
