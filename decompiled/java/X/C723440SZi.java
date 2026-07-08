package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SZi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723440SZi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC725510Sd3 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C723440SZi(AbstractC725510Sd3 abstractC725510Sd3, String str, long j, boolean z) {
        super(0);
        this.LL = abstractC725510Sd3;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        Long lRemove = C725430Scv.LIZ.remove(new C725490Sd1(this.LL, this.LLILLJJLI));
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            if (C725480Sd0.LIZ(this.LL)) {
                long j = this.LLILLL - jLongValue;
                C723430SZh c723430SZh = new C723430SZh();
                boolean z = this.LLILZ;
                c723430SZh.LIZ = j;
                c723430SZh.LIZIZ = z;
                C725480Sd0.LIZIZ(this.LL, c723430SZh);
            }
        }
        return Unit.LIZ;
    }
}
