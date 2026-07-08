package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.00o3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C188900o3 {
    public static final <T> String LIZ(List<? extends T> list) {
        boolean z;
        boolean z2;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String strValueOf = String.valueOf(list.get(i));
                if (strValueOf.length() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    sb.append(strValueOf);
                    if (i != list.size() - 1) {
                        sb.append(",");
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return sb.toString();
    }
}
