package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0afe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943920afe extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C943900afc LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C943920afe(C943900afc c943900afc, String str, long j) {
        super(0);
        this.LL = c943900afc;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C16F5 c16f5 = this.LL.LJJIIJZLJL;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJJ(2131843684, this.LLILLJJLI, C963140bAe.LJIIJ(this.LLILLL)));
        }
        return Unit.LIZ;
    }
}
