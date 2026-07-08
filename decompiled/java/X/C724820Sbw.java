package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sbw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724820Sbw extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC725510Sd3 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ AbstractC738140SxQ LLILZIL;
    public final /* synthetic */ C013C LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724820Sbw(AbstractC725510Sd3 abstractC725510Sd3, String str, long j, boolean z, AbstractC738140SxQ abstractC738140SxQ, C013C c013c) {
        super(0);
        this.LL = abstractC725510Sd3;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = abstractC738140SxQ;
        this.LLILZLL = c013c;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        Long lRemove = C725430Scv.LIZ.remove(new C725490Sd1(this.LL, this.LLILLJJLI));
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            if (C725480Sd0.LIZ(this.LL)) {
                long j = this.LLILLL - jLongValue;
                C724880Sc2 c724880Sc2 = new C724880Sc2(this.LLILZIL, this.LLILZLL.element, EnumC724870Sc1.ASSEM);
                boolean z = this.LLILZ;
                c724880Sc2.LIZ = j;
                c724880Sc2.LIZIZ = z;
                C725480Sd0.LIZIZ(this.LL, c724880Sc2);
            }
        }
        return Unit.LIZ;
    }
}
