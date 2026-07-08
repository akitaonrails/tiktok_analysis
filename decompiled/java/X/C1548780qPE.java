package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qPE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1548780qPE extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1548780qPE(long j, long j2, int i) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZJ("duration", Long.valueOf(this.LL - this.LLILLJJLI));
        c957403oi2.LIZJ("brick_name", Integer.valueOf(this.LLILLL));
        return Unit.LIZ;
    }
}
