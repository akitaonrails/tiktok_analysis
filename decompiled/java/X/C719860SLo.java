package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719860SLo extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C719840SLm LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C719860SLo(C719840SLm c719840SLm, boolean z, long j) {
        super(0);
        this.LL = c719840SLm;
        this.LLILLJJLI = z;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZLLL(this.LLILLL, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
