package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0tzh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686710tzh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ C1686700tzg LLILLJJLI;
    public final /* synthetic */ C1680470tpd LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1686710tzh(C238400w2 c238400w2, C1686700tzg c1686700tzg, C1680470tpd c1680470tpd, long j, long j2) {
        super(0);
        this.LL = c238400w2;
        this.LLILLJJLI = c1686700tzg;
        this.LLILLL = c1680470tpd;
        this.LLILZ = j;
        this.LLILZIL = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.element = this.LLILLJJLI.getPositionProvider().LIZ(this.LLILLL, this.LLILZ, this.LLILLJJLI.getParentLayoutDirection(), this.LLILZIL);
        return Unit.LIZ;
    }
}
