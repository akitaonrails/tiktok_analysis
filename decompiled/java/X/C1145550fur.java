package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145550fur extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145550fur(long j, long j2, long j3) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        long j = this.LL;
        long j2 = this.LLILLJJLI;
        long j3 = this.LLILLL;
        EnumC1145540fuq enumC1145540fuq = EnumC1145540fuq.FONT;
        try {
            C1145500fum c1145500fumLJI = C1145410fud.LJI(j, j2);
            if (c1145500fumLJI != null) {
                c1145500fumLJI.LJIILL(j3, enumC1145540fuq, str2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Unit.LIZ;
    }
}
