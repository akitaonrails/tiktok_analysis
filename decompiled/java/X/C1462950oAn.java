package X;

import Y.AObserverS225S0100000_22;
import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0oAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462950oAn extends C1462940oAm {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final C01GW LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1462950oAn.class, "isolateClipEditApi", "getIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJI = 8;
    }

    private final C0FVP H2() {
        return (C0FVP) this.LLIZLLLIL.getValue();
    }

    public final InterfaceC1450920nrO G2() {
        return (InterfaceC1450920nrO) this.LLIZ.getValue(this, LLJ[0]);
    }

    private final void T2() {
        MutableLiveData<Boolean> mutableLiveDataPN2;
        C0FVP c0fvpH2 = H2();
        if (c0fvpH2 == null || (mutableLiveDataPN2 = c0fvpH2.pN2()) == null) {
            return;
        }
        mutableLiveDataPN2.observe(this, new AObserverS225S0100000_22(this, 23));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        T2();
    }

    @Override // X.C1462940oAm, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZLL;
    }

    public C1462950oAn(C1DRG c1drg) {
        super(c1drg);
        this.LLILZLL = c1drg;
        this.LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1450920nrO.class, null);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 147));
    }

    @Override // X.C1462940oAm, X.InterfaceC1452920nuc
    public AbstractC19484711Kz<Unit> fb(int i) {
        InterfaceC1450920nrO interfaceC1450920nrOG2 = G2();
        if (interfaceC1450920nrOG2 != null) {
            return interfaceC1450920nrOG2.fb(i);
        }
        return null;
    }
}
