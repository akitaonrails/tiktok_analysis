package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07eC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1911407eC {
    public static final C1911507eD LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str2 = "";
        if (z) {
            if (str == null) {
                str = "";
            }
            return new C1911507eD(str);
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"_"}, 0, 6);
        int size = listLJJLIIIJILLIZJL.size();
        if (size < 3) {
            return new C1911507eD(str);
        }
        int i = size - 1;
        try {
            if (((String) listLJJLIIIJILLIZJL.get(i)).length() == 1) {
                if (size != 3) {
                    str2 = (String) listLJJLIIIJILLIZJL.get(size - 4);
                }
                if (!Intrinsics.LJFF("adapt", str2) && !Intrinsics.LJFF("lower", str2) && !Intrinsics.LJFF("lowest", str2)) {
                    return new C1911507eD(false, (String) listLJJLIIIJILLIZJL.get(size - 2), (String) listLJJLIIIJILLIZJL.get(size - 3), (String) listLJJLIIIJILLIZJL.get(i));
                }
                String str3 = (String) listLJJLIIIJILLIZJL.get(size - 2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append('_');
                sbLIZ.append((String) listLJJLIIIJILLIZJL.get(size - 3));
                return new C1911507eD(false, str3, C2188811AlT.LIZIZ(sbLIZ), (String) listLJJLIIIJILLIZJL.get(i));
            }
            return new C1911507eD(true, (String) listLJJLIIIJILLIZJL.get(size - 4), (String) listLJJLIIIJILLIZJL.get(size - 2), (String) listLJJLIIIJILLIZJL.get(i));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new C1911507eD(str);
        }
    }
}
