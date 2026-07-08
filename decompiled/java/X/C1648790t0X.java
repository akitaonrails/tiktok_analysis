package X;

import Y.ARunnableS125S0100000_25;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS265S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0t0X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1648790t0X extends AbstractC1648750t0T<InterfaceC1648810t0Z> implements InterfaceC1648810t0Z {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final EnumC1653870t8j LLILZ;
    public final C1DRG LLILZIL;
    public final Function2<InterfaceC1653800t8c, InterfaceC1653990t8v, Unit> LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1648790t0X.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1648790t0X.class, "fakeDualCameraApi", "getFakeDualCameraApi()Lcom/ss/android/ugc/aweme/social/creation/record/biz/reveal/camera/RevealFakeDualCameraShootApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1648790t0X.class, "dockBarApi", "getDockBarApi()Lcom/ss/android/ugc/gamora/recorder/control/DockBarApiComponent;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJILJIL = 8;
    }

    public InterfaceC1648810t0Z Z1() {
        return this;
    }

    private final InterfaceC1648800t0Y G2() {
        return (InterfaceC1648800t0Y) this.LLJI.getValue();
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLIZ.getValue(this, LLJIJIL[0]);
    }

    private final InterfaceC1648820t0a w2() {
        return (InterfaceC1648820t0a) this.LLIZLLLIL.getValue(this, LLJIJIL[1]);
    }

    public final InterfaceC1648870t0f o2() {
        return (InterfaceC1648870t0f) this.LLJ.getValue(this, LLJIJIL[2]);
    }

    @Override // X.InterfaceC1653990t8v
    public EnumC1653870t8j LJIIJJI() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1648750t0T
    public Function2<InterfaceC1653800t8c, InterfaceC1653990t8v, Unit> W1() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1653990t8v
    public void LJIILIIL(C1648770t0V c1648770t0V) {
        getShortVideoContext().shootMode = 30;
        if (getDiContainer().LIZJ(InterfaceC1646220swO.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1646220swO.class, new AwS604S0100000_25(c1648770t0V, 258));
        }
        InterfaceC1648760t0U interfaceC1648760t0U = (InterfaceC1648760t0U) findReadyComponent(this, InterfaceC1648760t0U.class);
        if (interfaceC1648760t0U != null) {
            interfaceC1648760t0U.mD(new C1658370tFz(false, 15));
        }
        InterfaceC1648820t0a interfaceC1648820t0aW2 = w2();
        if (interfaceC1648820t0aW2 != null) {
            interfaceC1648820t0aW2.IR0(true);
        }
        if (getDiContainer().LIZJ(InterfaceC1647420syK.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1647420syK.class, new AwS265S0000000_25(10));
        }
        LifecycleOwnerExtensionsKt.LIZIZ(this, 1L, new ARunnableS125S0100000_25(this, 50));
        InterfaceC1648800t0Y interfaceC1648800t0YG2 = G2();
        if (interfaceC1648800t0YG2 != null) {
            interfaceC1648800t0YG2.se0();
        }
    }

    @Override // X.InterfaceC1653990t8v
    public void LLLLLILLIL(C1648770t0V c1648770t0V) {
        InterfaceC1648820t0a interfaceC1648820t0aW2 = w2();
        if (interfaceC1648820t0aW2 != null) {
            interfaceC1648820t0aW2.IR0(false);
        }
        o2().setEffectContainerVisibility(0);
        o2().setUploadVisibility(0);
        InterfaceC1648800t0Y interfaceC1648800t0YG2 = G2();
        if (interfaceC1648800t0YG2 != null) {
            interfaceC1648800t0YG2.q90();
        }
        InterfaceC1650150t2j interfaceC1650150t2j = (InterfaceC1650150t2j) findReadyComponent(this, InterfaceC1650150t2j.class);
        if (interfaceC1650150t2j != null) {
            interfaceC1650150t2j.hr2(true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1648790t0X(EnumC1653870t8j enumC1653870t8j, C1DRG c1drg, Function2<? super InterfaceC1653800t8c, ? super InterfaceC1653990t8v, Unit> function2) {
        super(function2);
        this.LLILZ = enumC1653870t8j;
        this.LLILZIL = c1drg;
        this.LLILZLL = function2;
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648820t0a.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648870t0f.class, null);
        this.LLJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 378));
    }
}
