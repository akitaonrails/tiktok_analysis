package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Xzh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C866950Xzh {
    public static final boolean LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public static final boolean LIZIZ(Collection<? extends Object> collection) {
        boolean z;
        if (collection != null && !collection.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public static C914120Zta LIZJ(Function1 function1) {
        return new C914120Zta(null, function1, 12);
    }

    public static final long LIZLLL(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        long j = -1;
        if (z) {
            return -1L;
        }
        if (str != null) {
            try {
                j = CastLongProtector.parseLong(str);
                return j;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C882400YjW.LIZ.getClass();
                C882400YjW.LIZLLL().getClass();
            }
        }
        return j;
    }

    public static final List<Long> LJFF(List<String> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(LIZLLL(it2.next())));
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static final <T> long LJ(String str, InterfaceC863600XuI<T> interfaceC863600XuI) {
        long jLIZLLL = LIZLLL(str);
        if (jLIZLLL <= 0) {
            C0YMX c0ymxNewBuilder = C0YMW.newBuilder();
            c0ymxNewBuilder.LIZ.status = -100000;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("uid invalid: ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C0YMW c0ymw = c0ymxNewBuilder.LIZ;
            c0ymw.statusMsg = strLIZIZ;
            interfaceC863600XuI.LIZIZ(c0ymw);
        }
        return jLIZLLL;
    }
}
