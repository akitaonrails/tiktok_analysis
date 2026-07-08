package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0fup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145530fup extends C09AY implements InterfaceC1685420txc<String, Boolean, Long, Boolean, Integer, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145530fup(long j, long j2, long j3) {
        super(5);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = j3;
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(String str, Boolean bool, Long l, Boolean bool2, Integer num) {
        String str2 = str;
        boolean zBooleanValue = bool.booleanValue();
        l.longValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        int iIntValue = num.intValue();
        if (zBooleanValue2) {
            long j = this.LL;
            long j2 = this.LLILLJJLI;
            long j3 = this.LLILLL;
            EnumC1145540fuq enumC1145540fuq = EnumC1145540fuq.FONT;
            try {
                C1145500fum c1145500fumLJI = C1145410fud.LJI(j, j2);
                if (c1145500fumLJI != null) {
                    c1145500fumLJI.LJIILIIL(j3, enumC1145540fuq, str2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } else if (zBooleanValue) {
            long j4 = this.LL;
            long j5 = this.LLILLJJLI;
            long j6 = this.LLILLL;
            EnumC1145540fuq enumC1145540fuq2 = EnumC1145540fuq.FONT;
            try {
                C1145500fum c1145500fumLJI2 = C1145410fud.LJI(j4, j5);
                if (c1145500fumLJI2 != null) {
                    c1145500fumLJI2.LJIILLIIL(j6, enumC1145540fuq2, str2, null);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        } else {
            long j7 = this.LL;
            long j8 = this.LLILLJJLI;
            long j9 = this.LLILLL;
            EnumC1145540fuq enumC1145540fuq3 = EnumC1145540fuq.FONT;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("font_fetch_fail:");
            sbLIZ.append(str2);
            sbLIZ.append(':');
            sbLIZ.append(iIntValue);
            C1145410fud.LIZLLL(j7, j8, j9, enumC1145540fuq3, iIntValue, C2188811AlT.LIZIZ(sbLIZ), str2);
        }
        return Unit.LIZ;
    }
}
