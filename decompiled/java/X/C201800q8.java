package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: renamed from: X.00q8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C201800q8 {
    public static final Regex LIZ = new Regex("%(?:\\d+\\$[sdfSDF]|[sdfSDF](?![a-zA-Z]))");

    public static final String LIZ(String str, Pair<String, ? extends Object>... pairArr) {
        boolean z;
        String string;
        if (pairArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        int length = pairArr.length;
        int i = 0;
        while (true) {
            String str2 = "";
            if (i >= length) {
                break;
            }
            Pair<String, ? extends Object> pair = pairArr[i];
            String first = pair.getFirst();
            Object second = pair.getSecond();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('{');
            sbLIZ.append(first);
            sbLIZ.append('}');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (second != null) {
                string = second.toString();
            } else {
                string = null;
            }
            if (string != null) {
                str2 = string;
            }
            str = u.LJJIFFI(str, strLIZIZ, str2, false);
            i++;
        }
        if (LIZ.containsMatchIn(str)) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<String, ? extends Object> pair2 : pairArr) {
                Object second2 = pair2.getSecond();
                if (second2 == null) {
                    second2 = "";
                }
                arrayList.add(second2);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            try {
                Object[] objArrCopyOf = Arrays.copyOf(array, array.length);
                str = C786410Ut5.j4(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                C189200o6.m2constructorimpl(Unit.LIZ);
                return str;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return str;
    }

    public static final String LIZIZ(Context context, int i, Pair<String, ? extends Object>... pairArr) {
        return LIZ(context.getString(i), (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}
