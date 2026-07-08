package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bHr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967610bHr extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ String LLILLJJLI = "LinkMicManagerV2 dispose";
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967610bHr(C966020bFI c966020bFI, boolean z) {
        super(0);
        this.LL = c966020bFI;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJ().LJL(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
