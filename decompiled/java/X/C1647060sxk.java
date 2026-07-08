package X;

import Y.AObjectS246S0100000_25;
import androidx.lifecycle.LifecycleOwner;
import lnn.q;

/* JADX INFO: renamed from: X.0sxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647060sxk extends AbstractC2255721DQs<InterfaceC1646890sxT> implements InterfaceC379610EuV, InterfaceC1646890sxT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final int LLILZIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1655300tB2.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1647060sxk.class, "recordStickerLogicComponent", "getRecordStickerLogicComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1647060sxk.class, "shootComponent", "getShootComponent()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/component/ShootApiComponent;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLILZIL = 8;
    }

    public InterfaceC1646890sxT W1() {
        return this;
    }

    private final q X1() {
        return (q) this.LLILLJJLI.getValue(this, LLILZ[0]);
    }

    public final InterfaceC1655300tB2 Z1() {
        return (InterfaceC1655300tB2) this.LLILLL.getValue(this, LLILZ[1]);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1647060sxk(C1DRG c1drg) {
        this.LL = c1drg;
        X1().gO2().LIZ((LifecycleOwner) X1(), new AObjectS246S0100000_25(this, 249));
        X1().SO().LIZ((LifecycleOwner) X1(), new AObjectS246S0100000_25(this, 250));
    }
}
