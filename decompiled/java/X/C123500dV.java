package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00dV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C123500dV {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str.subSequence(1, str.length() - 1), new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt((String) it2.next())));
            }
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static String LIZIZ(Object obj) {
        String string;
        if (obj == null || (string = obj.toString()) == null) {
            return "";
        }
        return string;
    }
}
