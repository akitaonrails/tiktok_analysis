package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261931Dg7 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2261931Dg7(String str, long j) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        C2261941Dg8.LIZ.getClass();
        long j = C2261941Dg8.LIZIZ().getLong(this.LL, 0L);
        String str = this.LL;
        if (Intrinsics.LJFF(str, "prepare_time") || Intrinsics.LJFF(str, "total_time")) {
            C2261941Dg8.LIZIZ().storeLong(this.LL, this.LLILLJJLI);
        } else {
            C2261941Dg8.LIZIZ().storeLong(this.LL, j + this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
