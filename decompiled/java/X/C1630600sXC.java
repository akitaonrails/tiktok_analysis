package X;

import Y.AObjectS246S0100000_25;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0sXC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630600sXC extends AbstractC2255721DQs<InterfaceC1630620sXE> implements InterfaceC1630620sXE, InterfaceC379610EuV {
    public static final C1630610sXD LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1625000sOA.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1630630sXF.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), C1631190sY9.class, "lazyControlProgressConfig");
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 658));
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1625220sOW.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1635700sfQ.class, null);
    public final InterfaceC1630620sXE LLIZLLLIL = this;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0sXD] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1630600sXC.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1630600sXC.class, "lighteningControlProgressComponent", "getLighteningControlProgressComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0), new C2217381BqS(C1630600sXC.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0), new C2217381BqS(C1630600sXC.class, "iStickerMob", "getIStickerMob()Lcom/ss/android/ugc/aweme/sticker/mob/IStickerMob;", 0), new C2217381BqS(C1630600sXC.class, "effectDiscoverApiComponent", "getEffectDiscoverApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/effectdiscover/EffectDiscoverApiComponent;", 0)};
        LLJ = new Object() { // from class: X.0sXD
        };
        LLJIJIL = 8;
    }

    private final InterfaceC1635700sfQ Z1() {
        return (InterfaceC1635700sfQ) this.LLIZ.getValue(this, LLJI[4]);
    }

    private final C1631190sY9 o2() {
        return (C1631190sY9) this.LLILZ.getValue(this, LLJI[2]);
    }

    private final InterfaceC1630630sXF w2() {
        return (InterfaceC1630630sXF) this.LLILLL.getValue(this, LLJI[1]);
    }

    public final InterfaceC576020MiW<Boolean, Boolean> G2() {
        return (InterfaceC576020MiW) this.LLILZIL.getValue();
    }

    public final InterfaceC576020MiW<Boolean, Boolean> W1() {
        return new InterfaceC576020MiW<Boolean, Boolean>() { // from class: X.0sXB
            @Override // X.InterfaceC576020MiW
            public final Boolean LIZ(Boolean bool) {
                InterfaceC1625000sOA interfaceC1625000sOANq;
                InterfaceC1624480sNK interfaceC1624480sNKC0;
                InterfaceC1625000sOA interfaceC1625000sOANq2;
                InterfaceC1623190sLF interfaceC1623190sLFU;
                if (bool.booleanValue() && (interfaceC1625000sOANq = this.LIZ.nq()) != null && (interfaceC1624480sNKC0 = interfaceC1625000sOANq.C0()) != null && C2176908fv.LIZ().contains(C1623660sM0.LIZ(interfaceC1624480sNKC0).getKey()) && (interfaceC1625000sOANq2 = this.LIZ.nq()) != null && (interfaceC1623190sLFU = interfaceC1625000sOANq2.U()) != null && interfaceC1623190sLFU.isShowing() && C1656550tD3.LIZ()) {
                    C201955140j.LJIILL(C20012313Rx.LIZIZ, "MobileEffectComponent", "intercept show record button");
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        };
    }

    public final InterfaceC1625000sOA nq() {
        return (InterfaceC1625000sOA) this.LLILLJJLI.getValue(this, LLJI[0]);
    }

    public final InterfaceC1625220sOW uq() {
        return (InterfaceC1625220sOW) this.LLILZLL.getValue(this, LLJI[3]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<Boolean> c385670FAfFS;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1627350sRx stickerRepository;
        InterfaceC1621240sI6 interfaceC1621240sI6LIZ;
        super.onCreate();
        C201955140j.LJIILL(C20012313Rx.LIZIZ, "MobileEffectComponent", "onCreate");
        InterfaceC1625000sOA interfaceC1625000sOANq = nq();
        if (interfaceC1625000sOANq != null && (interfaceC1624480sNKC0 = interfaceC1625000sOANq.C0()) != null && (stickerRepository = interfaceC1624480sNKC0.getStickerRepository()) != null && (interfaceC1621240sI6LIZ = stickerRepository.LIZ()) != null) {
            C094000Xa c094000XaLIZJ = interfaceC1621240sI6LIZ.LIZJ();
            c094000XaLIZJ.LIZLLL(AFwS266S0000000_25.get$arr$(307));
            c094000XaLIZJ.LIZ(new AbstractC23051091l() { // from class: X.0no9
                @Override // X.AbstractC23051091l
                public final boolean LIZ(Effect effect, String str) {
                    boolean zLIZJ = C318390Cdx.LIZJ(effect);
                    if (zLIZJ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onRemove() return true, ");
                        sbLIZ.append(str);
                        sbLIZ.append(", ");
                        sbLIZ.append(effect);
                        C201955140j.LJIILL(C20012313Rx.LIZIZ, "MobileEffectFromProfileStickerDataFilter", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return zLIZJ;
                }
            });
            c094000XaLIZJ.LIZIZ();
        }
        if (!C1631200sYA.LIZ(o2())) {
            InterfaceC1630630sXF interfaceC1630630sXFW2 = w2();
            if (interfaceC1630630sXFW2 != null) {
                interfaceC1630630sXFW2.a60(G2());
            }
        } else if (getDiContainer().LIZJ(InterfaceC1630630sXF.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1630630sXF.class, new AwS604S0100000_25(this, 396));
        }
        InterfaceC1635700sfQ interfaceC1635700sfQZ1 = Z1();
        if (interfaceC1635700sfQZ1 == null || (c385670FAfFS = interfaceC1635700sfQZ1.FS()) == null) {
            return;
        }
        c385670FAfFS.LIZ(this, new AObjectS246S0100000_25(this, 603));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        if (C1631200sYA.LIZ(o2())) {
            if (getDiContainer().LIZJ(InterfaceC1630630sXF.class)) {
                whenReadyOrThrowInternal(getDiContainer(), InterfaceC1630630sXF.class, new AwS604S0100000_25(this, 397));
            }
        } else {
            InterfaceC1630630sXF interfaceC1630630sXFW2 = w2();
            if (interfaceC1630630sXFW2 != null) {
                interfaceC1630630sXFW2.JP1(G2());
            }
        }
    }

    public InterfaceC1630620sXE X1() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1630600sXC(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
