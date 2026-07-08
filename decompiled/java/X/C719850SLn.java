package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719850SLn extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C719840SLm LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C719850SLn(C719840SLm c719840SLm, boolean z, long j, Function0<Unit> function0) {
        super(0);
        this.LL = c719840SLm;
        this.LLILLJJLI = z;
        this.LLILLL = j;
        this.LLILZ = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZLLL(this.LLILLL, this.LLILLJJLI);
        this.LLILZ.invoke();
        return Unit.LIZ;
    }
}
