package X;

import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Lh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549640Lh4 extends i<InterfaceC549630Lh3, C560960LzK, C1895807bg, C07UH> implements InterfaceC379610EuV, InterfaceC549630Lh3 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C549560Lgw LLJILJILJ;
    public final C19A3 LLJILLL;
    public final C1DRG LLJJ;
    public final InterfaceC1731706qJ LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C549640Lh4.class, "mobApi", "getMobApi()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/creation/mob/AICreationMobApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final InterfaceC549370Lgd F4() {
        return (InterfaceC549370Lgd) this.LLJJI.getValue(this, LLJJIII[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1895807bg> o2() {
        return new AwS552S0100000_8(this, 66);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C07UH> w2() {
        return new AwS552S0100000_8(this, 67);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJ;
    }

    public C549640Lh4(C549560Lgw c549560Lgw, C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c549560Lgw;
        this.LLJILLL = c19a3;
        this.LLJJ = c1drg;
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC549370Lgd.class, null);
    }
}
