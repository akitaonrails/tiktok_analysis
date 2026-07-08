package X;

import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0oDq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464840oDq extends AbstractC2255721DQs<InterfaceC1464850oDr> implements InterfaceC1464850oDr, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1464840oDq.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InterfaceC1464850oDr W1() {
        return this;
    }

    private final InterfaceC391240FVq X1() {
        return (InterfaceC391240FVq) this.LLILLJJLI.getValue(this, LLILLL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (getDiContainer().LIZJ(InterfaceC391240FVq.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC391240FVq.class, new AwS601S0100000_22(this, 515));
        }
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

    public C1464840oDq(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
