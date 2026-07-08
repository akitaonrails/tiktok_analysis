package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724150Sar extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC725510Sd3 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ ReusedAssem LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724150Sar(AbstractC725510Sd3 abstractC725510Sd3, String str, long j, boolean z, ReusedAssem reusedAssem) {
        super(0);
        this.LL = abstractC725510Sd3;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = reusedAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        Long lRemove = C725430Scv.LIZ.remove(new C725490Sd1(this.LL, this.LLILLJJLI));
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            if (C725480Sd0.LIZ(this.LL)) {
                long j = this.LLILLL - jLongValue;
                C724170Sat c724170Sat = new C724170Sat(this.LLILZIL);
                boolean z = this.LLILZ;
                c724170Sat.LIZ = j;
                c724170Sat.LIZIZ = z;
                C725480Sd0.LIZIZ(this.LL, c724170Sat);
            }
        }
        return Unit.LIZ;
    }
}
