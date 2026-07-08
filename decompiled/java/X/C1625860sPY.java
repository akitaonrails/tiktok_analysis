package X;

import Y.AfS188S0100000_19;
import Y.AfS194S0100000_25;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0sPY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625860sPY extends AbstractC2255721DQs<InterfaceC1625870sPZ> implements InterfaceC1625870sPZ, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final InterfaceC1625870sPZ LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC577400Mkk.class, null);
    public final C11NJ LLILZIL = new C11NJ();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1625860sPY.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1625860sPY.class, "slideSlipEffectApiComponent", "getSlideSlipEffectApiComponent()Lcom/ss/android/ugc/slideslip/SlideSlipEffectApiComponent;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLIZ = 8;
    }

    private final InterfaceC577400Mkk Z1() {
        return (InterfaceC577400Mkk) this.LLILZ.getValue(this, LLILZLL[1]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLILLL.getValue(this, LLILZLL[0]);
    }

    private final InterfaceC23050091k X1() {
        return getStickerApiComponent().C0().LJJJJIZL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G2() {
        InterfaceC23050091k interfaceC23050091kX1 = X1();
        int iLIZ = interfaceC23050091kX1 != null ? interfaceC23050091kX1.LIZ() : 0;
        Integer num = (Integer) getStickerApiComponent().C0().getStickerRepository().LJFF().LJJ().getValue();
        if (num == null || num.intValue() != iLIZ) {
            if (Z1() == null) {
                getStickerApiComponent().C0().getStickerRepository().LJIIIZ(new C1633080sbC(null, false, false, 1023));
                return;
            }
            InterfaceC577400Mkk interfaceC577400MkkZ1 = Z1();
            if (interfaceC577400MkkZ1 != null) {
                interfaceC577400MkkZ1.MT0();
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C19475711Hn c19475711HnLIZJ;
        super.onCreate();
        InterfaceC23050091k interfaceC23050091kX1 = X1();
        if (interfaceC23050091kX1 != null && (c19475711HnLIZJ = interfaceC23050091kX1.LIZJ()) != null) {
            this.LLILZIL.LIZ(c19475711HnLIZJ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIFFI().LJJLJLI(new AfS188S0100000_19(this, 39)));
        }
        this.LLILZIL.LIZ(getStickerApiComponent().U6().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIL(new InterfaceC19483011Ki() { // from class: X.0sPW
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return obj instanceof C1557340qd2;
            }
        }).LJJLJLI(new AfS194S0100000_25(this, 63)));
        this.LLILZIL.LIZ(getStickerApiComponent().dj().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIL(new InterfaceC19483011Ki() { // from class: X.0sPX
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (obj == EnumC1159860gHw.PRE_SHOW) {
                    return true;
                }
                return false;
            }
        }).LJJLJLI(new AfS194S0100000_25(this, 64)));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLILZIL.dispose();
    }

    public InterfaceC1625870sPZ W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1625860sPY(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void w2(String str) {
        int iLIZ;
        InterfaceC23050091k interfaceC23050091kX1 = X1();
        if (interfaceC23050091kX1 != null) {
            iLIZ = interfaceC23050091kX1.LIZ();
        } else {
            iLIZ = 0;
        }
        Integer value = getStickerApiComponent().C0().getStickerRepository().LJFF().LJIL(str).getValue();
        if (value == null || value.intValue() != iLIZ) {
            getStickerApiComponent().C0().getStickerRepository().LIZIZ(new C1631810sZ9(str, 0, 0, 0, false, iLIZ, null, 766));
        }
    }

    public final void o2(int i, int i2) {
        Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        if (Intrinsics.LJFF(pair, new Pair(0, 1))) {
            if (!C576730Mjf.LJI()) {
                InterfaceC577400Mkk interfaceC577400MkkZ1 = Z1();
                if (interfaceC577400MkkZ1 != null) {
                    interfaceC577400MkkZ1.fP1(true);
                }
                getStickerApiComponent().nS1(false);
                return;
            }
            G2();
            return;
        }
        if (Intrinsics.LJFF(pair, new Pair(1, 0))) {
            if (C576730Mjf.LJI()) {
                return;
            }
            InterfaceC577400Mkk interfaceC577400MkkZ12 = Z1();
            if (interfaceC577400MkkZ12 != null) {
                interfaceC577400MkkZ12.fP1(false);
            }
            getStickerApiComponent().nS1(true);
            return;
        }
        if (!Intrinsics.LJFF(pair, new Pair(2, 4)) && !Intrinsics.LJFF(pair, new Pair(4, 2))) {
            return;
        }
        getStickerApiComponent().C0().getStickerRepository().LJIIIZ(new C1633080sbC(null, false, false, 1023));
    }
}
