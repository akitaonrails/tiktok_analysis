package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.07g5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1923107g5 extends AbstractC1878107Xf {
    @Override // X.AbstractC1878107Xf
    public final List<EnumC1980607pM> LIZJ() {
        return C1697810uHb.LJIIJJI(EnumC1980607pM.EQUAL, EnumC1980607pM.NOT_EQUAL, EnumC1980607pM.GREATER_THAN, EnumC1980607pM.GREATER_THAN_OR_EQUAL, EnumC1980607pM.LESS_THAN, EnumC1980607pM.LESS_THAN_OR_EQUAL);
    }

    public abstract long LIZLLL();

    @Override // X.AbstractC1878107Xf
    public final boolean LIZIZ(EnumC1980607pM enumC1980607pM, String str) {
        try {
            long j = CastLongProtector.parseLong(str);
            switch (C1923207g6.LIZ[enumC1980607pM.ordinal()]) {
                case 1:
                    if (LIZLLL() == j) {
                        return true;
                    }
                    break;
                case 2:
                    if (LIZLLL() != j) {
                        return true;
                    }
                    break;
                case 3:
                    if (LIZLLL() > j) {
                        return true;
                    }
                    break;
                case 4:
                    if (LIZLLL() >= j) {
                        return true;
                    }
                    break;
                case 5:
                    if (LIZLLL() < j) {
                        return true;
                    }
                    break;
                case 6:
                    if (LIZLLL() <= j) {
                        return true;
                    }
                    break;
                default:
                    return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }
}
