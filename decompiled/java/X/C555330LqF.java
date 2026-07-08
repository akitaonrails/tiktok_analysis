package X;

import com.bytedance.als.LiveEvent;
import ge.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555330LqF extends i<InterfaceC548540LfI, C555380LqK, C555360LqI, C555340LqG> implements InterfaceC548540LfI, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C549820LhM LLJJ;
    public final C560530Lyd<Unit> LLJJI;
    public final C560530Lyd<Unit> LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C555330LqF.class, "mobApi", "getMobApi()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/creation/mob/AICreationMobApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InterfaceC548540LfI F4() {
        return this;
    }

    public final InterfaceC549370Lgd K4() {
        return (InterfaceC549370Lgd) this.LLJJIJI.getValue(this, LLJJIJIIJIL[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C555360LqI> o2() {
        return new AwS552S0100000_8(this, 80);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C555340LqG> w2() {
        return new AwS552S0100000_8(this, 81);
    }

    public C560530Lyd<Unit> H4() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC548540LfI
    public /* bridge */ /* synthetic */ LiveEvent LLLLIILLL() {
        return this.LLJJIII;
    }

    public C560530Lyd<Unit> O4() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        F4();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC548540LfI
    public /* bridge */ /* synthetic */ LiveEvent v2() {
        return this.LLJJI;
    }

    public C555330LqF(C19A3 c19a3, C1DRG c1drg, C549820LhM c549820LhM) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = c549820LhM;
        this.LLJJI = new C560530Lyd<>();
        this.LLJJIII = new C560530Lyd<>();
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC549370Lgd.class, null);
    }
}
