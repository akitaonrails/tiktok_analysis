package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sx1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737890Sx1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC725510Sd3 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C13IQ LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C737890Sx1(AbstractC725510Sd3 abstractC725510Sd3, String str, long j, boolean z, C13IQ c13iq) {
        super(0);
        this.LL = abstractC725510Sd3;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = c13iq;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        Long lRemove = C725430Scv.LIZ.remove(new C725490Sd1(this.LL, this.LLILLJJLI));
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            if (C725480Sd0.LIZ(this.LL)) {
                long j = this.LLILLL - jLongValue;
                C737860Swy c737860Swy = new C737860Swy(C09R7.LIZ(this.LLILZIL), EnumC737850Swx.REUSED_SCOPE_ACTIVITY);
                boolean z = this.LLILZ;
                c737860Swy.LIZ = j;
                c737860Swy.LIZIZ = z;
                C725480Sd0.LIZIZ(this.LL, c737860Swy);
            }
        }
        return Unit.LIZ;
    }
}
