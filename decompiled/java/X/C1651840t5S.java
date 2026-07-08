package X;

import Y.AObjectS246S0100000_25;
import java.util.List;

/* JADX INFO: renamed from: X.0t5S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651840t5S extends AbstractC1651830t5R<InterfaceC1652050t5n> implements InterfaceC1652050t5n {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public static final int LLJL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1652050t5n LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1651840t5S.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJL = 8;
    }

    private final InterfaceC1638550sk1 gq() {
        return (InterfaceC1638550sk1) this.LLJJJJLIIL.getValue(this, LLJJLIIIJLLLLLLLZ[0]);
    }

    @Override // X.AbstractC1651830t5R
    public void registerObservers() {
        super.registerObservers();
        getPlanCUIApiComponent().RS().LIZ(this, new AObjectS246S0100000_25(this, 296));
        gq().hb1().LIZ(this, new AObjectS246S0100000_25(this, 297));
        getRecordAdapterApi().NL1().LIZ(this, new AObjectS246S0100000_25(this, 298));
    }

    @Override // X.AbstractC1651830t5R
    public EnumC1651870t5V W2() {
        return EnumC1651870t5V.STORY;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJL;
    }

    public InterfaceC1652050t5n q3() {
        return this.LLJJL;
    }

    public C1651840t5S(C19A3 c19a3, C1DRG c1drg, int i, InterfaceC1651800t5O interfaceC1651800t5O, List<C1650980t44> list) {
        super(c19a3, c1drg, i, interfaceC1651800t5O, list, false);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
        this.LLJJL = this;
    }
}
