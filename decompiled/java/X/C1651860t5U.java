package X;

import Y.AObjectS246S0100000_25;
import java.util.List;

/* JADX INFO: renamed from: X.0t5U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651860t5U extends AbstractC1651830t5R<InterfaceC1652030t5l> implements InterfaceC1652030t5l {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public static final int LLJLIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1652030t5l LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1651860t5U.class, "recordPermissionApi", "getRecordPermissionApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1651860t5U.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJLIL = 8;
    }

    private final InterfaceC1638550sk1 gq() {
        return (InterfaceC1638550sk1) this.LLJJL.getValue(this, LLJL[1]);
    }

    private final InterfaceC1652190t61 v3() {
        return (InterfaceC1652190t61) this.LLJJJJLIIL.getValue(this, LLJL[0]);
    }

    @Override // X.AbstractC1651830t5R
    public void registerObservers() {
        C385670FAf<C375830EoP<Boolean>> c385670FAfBx1;
        super.registerObservers();
        getPlanCUIApiComponent().RS().LIZ(this, new AObjectS246S0100000_25(this, 279));
        gq().hb1().LIZ(this, new AObjectS246S0100000_25(this, 280));
        InterfaceC1652190t61 interfaceC1652190t61V3 = v3();
        if (interfaceC1652190t61V3 == null || (c385670FAfBx1 = interfaceC1652190t61V3.bx1()) == null) {
            return;
        }
        c385670FAfBx1.LIZ(this, new AObjectS246S0100000_25(this, 281));
    }

    @Override // X.AbstractC1651830t5R
    public EnumC1651870t5V W2() {
        return EnumC1651870t5V.DM_GROUP_SHOT;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public InterfaceC1652030t5l q3() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public C1651860t5U(C19A3 c19a3, C1DRG c1drg, int i, InterfaceC1651800t5O interfaceC1651800t5O, List<C1650980t44> list) {
        super(c19a3, c1drg, i, interfaceC1651800t5O, list, false);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652190t61.class, null);
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
        this.LLJJLIIIJLLLLLLLZ = this;
    }
}
