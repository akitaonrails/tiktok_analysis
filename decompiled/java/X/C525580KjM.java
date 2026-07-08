package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0KjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525580KjM {
    public static final Set<String> LIZ = Collections.newSetFromMap(new ConcurrentHashMap());

    public static final boolean LIZ(String str, String str2, String str3, String str4, boolean z, Long l, String str5, String str6, String str7, int i, int i2, String str8, String str9) {
        if (a0.LJJJIL(str)) {
            return false;
        }
        Set<String> set = LIZ;
        synchronized (set) {
            try {
                if (!set.add(str)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[skip_dup] dedupeKey=");
                    sbLIZ.append(str);
                    sbLIZ.append(" source=");
                    sbLIZ.append(str7);
                    sbLIZ.append(" creation_id=");
                    sbLIZ.append(str2);
                    C201955140j.LIZIZ("ttcrt_ai_autocut_end", C2188811AlT.LIZIZ(sbLIZ));
                    return false;
                }
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", str2);
                c0lab.LJ("shoot_way", str3);
                c0lab.LJ("enter_from", str4);
                c0lab.LIZ(z ? 1 : 0, "is_success");
                if (l != null && l.longValue() >= 0) {
                    c0lab.LIZIZ(l.longValue(), "duration");
                }
                if (str5 != null && !a0.LJJJIL(str5)) {
                    c0lab.LJ("error_code", str5);
                }
                if (str6 != null && !a0.LJJJIL(str6)) {
                    c0lab.LJ("error_msg", str6);
                }
                c0lab.LIZ(i, "task_count");
                c0lab.LIZ(i2, "success_count");
                c0lab.LJ("pick_id", str8);
                c0lab.LJ("mae_request_id", str9);
                Map<String, String> map = c0lab.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[emit] source=");
                sbLIZ2.append(str7);
                sbLIZ2.append(" dedupeKey=");
                sbLIZ2.append(str);
                sbLIZ2.append(" enter_from=");
                sbLIZ2.append(str4);
                sbLIZ2.append(" creation_id=");
                sbLIZ2.append(str2);
                sbLIZ2.append(" shoot_way=");
                sbLIZ2.append(str3);
                sbLIZ2.append(" is_success=");
                sbLIZ2.append(z ? 1 : 0);
                sbLIZ2.append(" params=");
                sbLIZ2.append(map);
                C201955140j.LIZIZ("ttcrt_ai_autocut_end", C2188811AlT.LIZIZ(sbLIZ2));
                C20684815ws.LJIILLIIL("ttcrt_ai_autocut_end", map);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
