package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0LdT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547410LdT {
    public static final C547410LdT LIZ = new C547410LdT();
    public static final ConcurrentHashMap<String, C547430LdV> LIZIZ = new ConcurrentHashMap<>();
    public static volatile InterfaceC547470LdZ LIZJ;

    static {
        InterfaceC547470LdZ.LIZ.getClass();
        LIZJ = C547500Ldc.LIZIZ;
    }

    public static final void LIZIZ(EnumC543480LTe enumC543480LTe, InterfaceC2044707zh interfaceC2044707zh) {
        Iterator<E> it2 = interfaceC2044707zh.iterator();
        while (it2.hasNext()) {
            C0LQB c0lqb = (C0LQB) it2.next();
            ConcurrentHashMap<EnumC543480LTe, CopyOnWriteArraySet<String>> concurrentHashMap = C0LQA.LIZ;
            C0LQA.LIZ(enumC543480LTe, c0lqb);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.ss.android.ugc.aweme.creative.model.CreativeModel r14, X.EnumC543480LTe r15, java.lang.String r16, int r17, int r18, java.lang.String r19, java.util.Map r20, java.util.Map r21) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C547410LdT.LIZJ(com.ss.android.ugc.aweme.creative.model.CreativeModel, X.0LTe, java.lang.String, int, int, java.lang.String, java.util.Map, java.util.Map):void");
    }

    public static void LIZ(String str, EnumC543480LTe enumC543480LTe, String str2, String str3, int i, long j, int i2, String str4, C547430LdV c547430LdV) {
        Pair pair;
        String str5;
        String str6;
        String strLIZIZ;
        synchronized (c547430LdV) {
            try {
                pair = new Pair(C13LP.LLIIII(c547430LdV.LIZLLL), C2097608Jq.LJIIZILJ(c547430LdV.LJ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        List list = (List) pair.getFirst();
        Map map = (Map) pair.getSecond();
        String str7 = c547430LdV.LIZIZ;
        String str8 = c547430LdV.LIZ;
        StringBuilder sb = new StringBuilder("\n┌── draft_pipeline ────────────────────────────────────────\n");
        int i3 = 1;
        if (i == 1) {
            str5 = "✓";
        } else {
            str5 = "✗";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("│ action    : ");
        sbLIZ.append(enumC543480LTe.getValue());
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        sb.append('\n');
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("│ business  : ");
        sbLIZ2.append(str2);
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        sb.append('\n');
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("│ creation  : ");
        sbLIZ3.append(str7);
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        sb.append('\n');
        if (!Intrinsics.LJFF(str8, str7)) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("│ key       : ");
            sbLIZ4.append(str8);
            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
            sb.append('\n');
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("│ total     : ");
        sbLIZ5.append(j);
        sbLIZ5.append("ms");
        sb.append(C2188811AlT.LIZIZ(sbLIZ5));
        sb.append('\n');
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("│ terminal  : ");
        sbLIZ6.append(str3);
        sbLIZ6.append(' ');
        sbLIZ6.append(str5);
        sb.append(C2188811AlT.LIZIZ(sbLIZ6));
        sb.append('\n');
        int i4 = 0;
        if (i != 1 && (i2 != 0 || str4.length() > 0)) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("│ error     : code=");
            sbLIZ7.append(i2);
            sbLIZ7.append(" msg=");
            sbLIZ7.append(str4);
            sb.append(C2188811AlT.LIZIZ(sbLIZ7));
            sb.append('\n');
        }
        if (!map.isEmpty()) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("│ extras    : ");
            sbLIZ8.append(map);
            sb.append(C2188811AlT.LIZIZ(sbLIZ8));
            sb.append('\n');
        }
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("├── flow (");
        sbLIZ9.append(list.size());
        sbLIZ9.append(" steps) ──────────────────────────────");
        sb.append(C2188811AlT.LIZIZ(sbLIZ9));
        sb.append('\n');
        int size = list.size() - 1;
        long j2 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                C547420LdU c547420LdU = (C547420LdU) obj;
                long j3 = c547420LdU.LIZJ;
                long j4 = j3 - j2;
                if (c547420LdU.LIZIZ == i3) {
                    str6 = "✓";
                } else {
                    str6 = "✗";
                }
                String strLJJJJJL = a0.LJJJJJL(' ', 6, String.valueOf(j3));
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append('+');
                sbLIZ10.append(j4);
                sbLIZ10.append("ms");
                String strLJJJJJL2 = a0.LJJJJJL(' ', 8, C2188811AlT.LIZIZ(sbLIZ10));
                if (i4 == size) {
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append(c547420LdU.LIZ);
                    sbLIZ11.append(" ← END");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ11);
                } else {
                    strLIZIZ = c547420LdU.LIZ;
                }
                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                sbLIZ12.append("│ ");
                sbLIZ12.append(strLJJJJJL);
                sbLIZ12.append("ms │ ");
                sbLIZ12.append(strLJJJJJL2);
                sbLIZ12.append(" │ ");
                sbLIZ12.append(str6);
                sbLIZ12.append(' ');
                sbLIZ12.append(strLIZIZ);
                sb.append(C2188811AlT.LIZIZ(sbLIZ12));
                sb.append('\n');
                j2 = c547420LdU.LIZJ;
                i4 = i5;
                i3 = 1;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        sb.append("└──────────────────────────────────────────────────────────");
        LIZJ.LIZ(sb.toString());
        LIZIZ.remove(str);
    }

    public static void LJ(EnumC543480LTe enumC543480LTe, String str, String str2, String str3, int i, int i2, String str4, Map map, Map map2, String str5) {
        Map mapLJIIZILJ;
        CopyOnWriteArraySet<String> copyOnWriteArraySet;
        C547430LdV c547430LdVPutIfAbsent;
        if (((Number) C0AA4.LIZ.getValue()).intValue() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(enumC543480LTe.getValue());
            sbLIZ.append('_');
            sbLIZ.append(str5);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            ConcurrentHashMap<String, C547430LdV> concurrentHashMap = LIZIZ;
            C547430LdV c547430LdV = concurrentHashMap.get(strLIZIZ);
            if (c547430LdV == null && (c547430LdVPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZIZ, (c547430LdV = new C547430LdV(str5, str)))) != null) {
                c547430LdV = c547430LdVPutIfAbsent;
            }
            C547430LdV c547430LdV2 = c547430LdV;
            long jCurrentTimeMillis = System.currentTimeMillis() - c547430LdV2.LIZJ;
            synchronized (c547430LdV2) {
                try {
                    if (!map2.isEmpty()) {
                        c547430LdV2.LJ.putAll(map2);
                    }
                    c547430LdV2.LIZLLL.add(new C547420LdU(str3, i, jCurrentTimeMillis));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            synchronized (c547430LdV2) {
                try {
                    mapLJIIZILJ = C2097608Jq.LJIIZILJ(c547430LdV2.LJ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
            Map mapLJIIL = C2097608Jq.LJIIL(mapLJIIZILJ, map);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("action", enumC543480LTe.getValue());
            c2344009Gk.LJFF("creation_id", str);
            c2344009Gk.LJFF("business", str2);
            c2344009Gk.LJFF("branch", str3);
            c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
            c2344009Gk.LIZJ(i2, "error_code");
            c2344009Gk.LJFF("error_msg", str4);
            for (Map.Entry entry : ((LinkedHashMap) mapLJIIL).entrySet()) {
                c2344009Gk.LJ(entry.getValue(), (String) entry.getKey());
            }
            C20684815ws.LJIILLIIL("creation_draft_track", c2344009Gk.LIZ);
            CopyOnWriteArraySet<String> copyOnWriteArraySet2 = C0LQA.LIZ.get(enumC543480LTe);
            if (copyOnWriteArraySet2 == null || !copyOnWriteArraySet2.contains(str3)) {
                CopyOnWriteArraySet<String> copyOnWriteArraySet3 = C0LQA.LIZIZ.get(enumC543480LTe);
                if (copyOnWriteArraySet3 != null) {
                    Iterator<String> it2 = copyOnWriteArraySet3.iterator();
                    while (it2.hasNext()) {
                        if (u.LJJIIJZLJL(str3, it2.next(), false)) {
                            break;
                        }
                    }
                    copyOnWriteArraySet = C0LQA.LIZJ.get(new Pair(str2, enumC543480LTe));
                    if (copyOnWriteArraySet != null || !copyOnWriteArraySet.contains(str3)) {
                        return;
                    }
                } else {
                    copyOnWriteArraySet = C0LQA.LIZJ.get(new Pair(str2, enumC543480LTe));
                    if (copyOnWriteArraySet != null) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            LIZ(strLIZIZ, enumC543480LTe, str2, str3, i, jCurrentTimeMillis, i2, str4, c547430LdV2);
        }
    }
}
