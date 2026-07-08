package X;

import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0tER, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657410tER extends AbstractC2255721DQs<InterfaceC1657420tES> implements InterfaceC1657420tES, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), C1657360tEM.class, null);
    public final InterfaceC332260D0u<Set<Pair<Integer, Integer>>> LLILLL;
    public final InterfaceC346201Wa<AbstractC1665600tRe> LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1657410tER.class, "tabConfigs", "getTabConfigs()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/tabs/TabConfigurationSource;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = 8;
    }

    public InterfaceC1657420tES W1() {
        return this;
    }

    private final C1657360tEM X1() {
        return (C1657360tEM) this.LLILLJJLI.getValue(this, LLILZIL[0]);
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

    @Override // X.InterfaceC1657420tES
    public InterfaceC346201Wa<AbstractC1665600tRe> getState() {
        return this.LLILZ;
    }

    public C1657410tER(C1DRG c1drg) {
        this.LL = c1drg;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C08CX.INSTANCE);
        this.LLILLL = c2252321DDqLIZ;
        this.LLILZ = new C414301jJ(X1().LLILZ, c2252321DDqLIZ, new C1657400tEQ(this, null));
    }

    public final void Z1(Pair<Integer, Integer> pair) {
        InterfaceC332260D0u<Set<Pair<Integer, Integer>>> interfaceC332260D0u = this.LLILLL;
        interfaceC332260D0u.setValue(C15442062u.LJIIIIZZ(pair, interfaceC332260D0u.getValue()));
    }
}
