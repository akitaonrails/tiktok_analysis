package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0OO1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OO1 {
    public static WeakReference<C0OOI> LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(542));
    public static final Map<Long, String> LIZJ = new LinkedHashMap();
    public static final Map<String, List<String>> LIZLLL = new LinkedHashMap();

    public static String LIZIZ(Integer num, Long l) {
        int iIntValue;
        long jLongValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        sbLIZ.append(iIntValue);
        sbLIZ.append('_');
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        sbLIZ.append(jLongValue);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(String str, List list) {
        if (list != null && (!list.isEmpty())) {
            try {
                ((Keva) LIZIZ.getValue()).storeString(C786410Ut5.j4("post_script_cfgs_%s", Arrays.copyOf(new Object[]{str}, 1)), new Gson().LJIILL(list));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PostScriptManager.updateFromResponse() store size = ");
                sbLIZ.append(list.size());
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("PostScriptManager.updateFromResponse() error: ");
                sbLIZ2.append(e.getMessage());
                C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d1 A[Catch: Exception -> 0x02d4, TRY_LEAVE, TryCatch #1 {Exception -> 0x02d4, blocks: (B:129:0x029b, B:131:0x02b7, B:133:0x02cd, B:135:0x02d1), top: B:224:0x029b }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d1  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZ(final java.lang.String r15, java.util.List r16, X.EnumC617060OIe r17, X.EnumC617480OJu r18, long r19, final boolean r21) {
        /*
            Method dump skipped, instruction units count: 1358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OO1.LIZ(java.lang.String, java.util.List, X.0OIe, X.0OJu, long, boolean):java.util.List");
    }
}
