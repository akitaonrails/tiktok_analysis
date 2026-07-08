package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sNF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624430sNF implements InterfaceC1621660sIm, InterfaceC379610EuV {
    public final C1DRG LL;
    public final C565610MGh LLILLJJLI;
    public final Function0<C1624440sNG> LLILLL;

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1621660sIm
    public final InterfaceC1621080sHq LIZ(l0 l0Var) {
        return new C1624410sND(this.LLILLL, (C19GS) this.LL.LJII(C19GS.class, null), l0Var, (ShortVideoContext) this.LL.LJII(ShortVideoContext.class, null), this.LLILLJJLI, this.LL);
    }

    public C1624430sNF(C1DRG c1drg, C565610MGh c565610MGh, Function0<C1624440sNG> function0) {
        this.LL = c1drg;
        this.LLILLJJLI = c565610MGh;
        this.LLILLL = function0;
    }
}
