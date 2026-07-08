package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0pqO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527180pqO {
    public static final /* synthetic */ int LIZ = 0;

    public static Integer LIZ(C1527060pqC c1527060pqC) {
        if (c1527060pqC == null) {
            return 0;
        }
        try {
            return Integer.valueOf(c1527060pqC.topics.get(0).flag.getValue());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public static String LIZIZ(C1527060pqC c1527060pqC) {
        if (c1527060pqC == null) {
            return "";
        }
        try {
            EnumC1527170pqN enumC1527170pqN = c1527060pqC.topics.get(0).flag;
            if (enumC1527170pqN != null) {
                int i = C1527300pqa.LIZ[enumC1527170pqN.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                return "fin";
                            }
                        } else {
                            return "report";
                        }
                    } else {
                        return "poll";
                    }
                } else {
                    List<C1527020pq8> list = c1527060pqC.topics;
                    if (list.get(list.size() - 1).flag == EnumC1527170pqN.Poll) {
                        return "syncpoll";
                    }
                    return "sync";
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return "";
    }
}
