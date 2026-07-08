package X;

import Y.AObjectS243S0100000_14;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS604S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0ZiK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907140ZiK extends AbstractC2255721DQs<InterfaceC907150ZiL> implements InterfaceC907150ZiL, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(306));
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final C05YC<C1647390syH> LLILZIL = C09IR.LIZIZ(0, 0, null, 7);
    public final InterfaceC907150ZiL LLILZLL = this;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C907140ZiK.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C907140ZiK.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLIZLLLIL = 8;
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLILZ.getValue(this, LLIZ[1]);
    }

    private final ICommerceToolsStickerService X1() {
        return (ICommerceToolsStickerService) this.LLILLJJLI.getValue();
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLL.getValue(this, LLIZ[0]);
    }

    private final void Z1() {
        ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1635700sfQ.class, new AwS593S0100000_14(this, 155));
    }

    private final void o2() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C861440Xqo(this, null), 3);
    }

    private final void w2() {
        ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(q.class, new AwS604S0100000_25(this, 303));
    }

    @Override // X.InterfaceC907150ZiL
    public void IC0() {
        ICommerceToolsStickerService iCommerceToolsStickerServiceX1;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if (shortVideoContext == null || (iCommerceToolsStickerServiceX1 = X1()) == null) {
            return;
        }
        iCommerceToolsStickerServiceX1.LJ(shortVideoContext);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<C1647390syH> bottomTabIndexChangeEvent;
        super.onCreate();
        InterfaceC1648020szI interfaceC1648020szIOp = Op();
        if (interfaceC1648020szIOp != null && (bottomTabIndexChangeEvent = interfaceC1648020szIOp.getBottomTabIndexChangeEvent()) != null) {
            bottomTabIndexChangeEvent.LIZ(this, new AObjectS243S0100000_14(this, 4));
        }
        w2();
        o2();
        Z1();
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        IC0();
    }

    public InterfaceC907150ZiL W1() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C907140ZiK(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
