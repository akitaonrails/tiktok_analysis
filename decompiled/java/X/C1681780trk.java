package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0trk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681780trk extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C05P1<Function1<Long, Unit>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681780trk(long j, C05P0 c05p0) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = c05p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LLILLJJLI.getValue().invoke(Long.valueOf(this.LL));
        return Unit.LIZ;
    }
}
