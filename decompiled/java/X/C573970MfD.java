package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import g3a.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0MfD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573970MfD extends a implements InterfaceC1408530ml1, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C1DRG LLIZLLLIL;
    public final Function1<C540340LHc, Unit> LLJ;
    public final C1664750tQH LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C573970MfD.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    public final VideoPublishEditModel LJIIJJI() {
        return (VideoPublishEditModel) this.LLJI.getValue(this, LLJIJIL[0]);
    }

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        C0CHQ.LIZ().LJIIJ().LJIILIIL(LJIIJJI(), LJIIJJI().getCreationId(), 1, new AwS552S0100000_8(this, 622), new AwS587S0100000_8(this, 414));
        if (C297610BlX.LIZ() && C1428470nHB.LJLILLLLZI(LJIIJJI())) {
            C0CHQ.LIZ().LJIIJ().LJI(1, LJIIJJI(), LJIIJJI().getCreationId());
        }
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P1;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C573970MfD(C1DRG c1drg, Function1<? super C540340LHc, Unit> function1) {
        this.LLIZLLLIL = c1drg;
        this.LLJ = function1;
        this.LLJI = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        LJ(AFwS239S0000000_8.get$arr$(197));
    }
}
