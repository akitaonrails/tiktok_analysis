package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723550SZt extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC725510Sd3 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C0RUS LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C723550SZt(AbstractC725510Sd3 abstractC725510Sd3, String str, long j, boolean z, C0RUS c0rus) {
        super(0);
        this.LL = abstractC725510Sd3;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = c0rus;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        Class<?> clsLIZ;
        Long lRemove = C725430Scv.LIZ.remove(new C725490Sd1(this.LL, this.LLILLJJLI));
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            if (C725480Sd0.LIZ(this.LL)) {
                long j = this.LLILLL - jLongValue;
                C0RUS c0rus = this.LLILZIL;
                AbstractC738140SxQ abstractC738140SxQ = c0rus.LLILZIL;
                if (abstractC738140SxQ != null) {
                    clsLIZ = abstractC738140SxQ.getClass();
                } else {
                    C13IQ<? extends T> c13iq = c0rus.LL;
                    clsLIZ = c13iq != 0 ? C09R7.LIZ(c13iq) : null;
                }
                C723630Sa1 c723630Sa1 = new C723630Sa1(clsLIZ);
                boolean z = this.LLILZ;
                c723630Sa1.LIZ = j;
                c723630Sa1.LIZIZ = z;
                C725480Sd0.LIZIZ(this.LL, c723630Sa1);
            }
        }
        return Unit.LIZ;
    }
}
