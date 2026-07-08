package X;

import com.bytedance.als.LiveEvent;
import ge.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555320LqE extends i<InterfaceC548550LfJ, C555390LqL, C1263804x2, C1259904wP> implements InterfaceC548550LfJ, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C549840LhO LLJJ;
    public final C560530Lyd<Unit> LLJJI;
    public final InterfaceC1731706qJ LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C555320LqE.class, "mobApi", "getMobApi()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/creation/mob/AICreationMobApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InterfaceC548550LfJ F4() {
        return this;
    }

    public final InterfaceC549370Lgd H4() {
        return (InterfaceC549370Lgd) this.LLJJIII.getValue(this, LLJJIJI[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1263804x2> o2() {
        return new AwS552S0100000_8(this, 77);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1259904wP> w2() {
        return new AwS552S0100000_8(this, 78);
    }

    public C560530Lyd<Unit> K4() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC548550LfJ
    public /* bridge */ /* synthetic */ LiveEvent LLLLIILLL() {
        return this.LLJJI;
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

    public C555320LqE(C19A3 c19a3, C1DRG c1drg, C549840LhO c549840LhO) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = c549840LhO;
        this.LLJJI = new C560530Lyd<>();
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC549370Lgd.class, null);
    }
}
