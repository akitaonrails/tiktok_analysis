package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145560fus extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145560fus(long j, long j2, long j3, long j4, String str) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = j3;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer num2 = num;
        long j = this.LL;
        long j2 = this.LLILLJJLI;
        long j3 = this.LLILLL;
        EnumC1145540fuq enumC1145540fuq = EnumC1145540fuq.IMAGE;
        String str = this.LLILZ;
        try {
            C1145500fum c1145500fumLJI = C1145410fud.LJI(j, j2);
            if (c1145500fumLJI != null) {
                c1145500fumLJI.LJIILLIIL(j3, enumC1145540fuq, str, num2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Unit.LIZ;
    }
}
