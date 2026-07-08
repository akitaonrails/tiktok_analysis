package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bjr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C984970bjr extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C984920bjm LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C984970bjr(C984920bjm c984920bjm, boolean z, long j) {
        super(0);
        this.LL = c984920bjm;
        this.LLILLJJLI = z;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C979420bau c979420bau = this.LL.LLJILJIL;
        if (c979420bau != null) {
            c979420bau.setVisibility(false);
        }
        if (this.LLILLJJLI) {
            this.LL.LJIILLIIL(this.LLILLL);
        } else {
            C984920bjm c984920bjm = this.LL;
            c984920bjm.LJIIJJI("showNormalRematchButton");
            C500260Jjc.LLFFF(c984920bjm.LLJI);
            C973690bRf.LIZ.LJIL();
        }
        return Unit.LIZ;
    }
}
