package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Dfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345010Dfn extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345010Dfn(long j, long j2, long j3, long j4, long j5) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = j3;
        this.LLILZ = j4;
        this.LLILZIL = j5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        C344950Dfh.LIZ = false;
        C344950Dfh.LIZJ(EnumC344990Dfl.CLEAN_STORAGE_WITH_LOADING, this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, false, false, false, 768);
        return Unit.LIZ;
    }
}
