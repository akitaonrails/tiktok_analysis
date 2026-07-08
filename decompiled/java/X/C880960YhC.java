package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0YhC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880960YhC {
    public static final C880960YhC LIZ = new C880960YhC();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(222));
    public static AnonymousClass0956 LIZJ;

    public static void LJIIIIZZ() {
        if (C885630Yoj.LIZ(false)) {
            AnonymousClass0956 anonymousClass0956 = LIZJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), null, null, new C878170Ych(null), 3);
        }
    }

    public static InterfaceC865850Xxv LJ() {
        C0YHX c0yhxLIZ;
        C0YH4 c0yh4LJIIL;
        InterfaceC866310Xyf interfaceC866310XyfLIZIZ;
        IIMCoreProxyService.LIZ.getClass();
        IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
        if (iIMCoreProxyServiceLIZ == null || (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) == null || (c0yh4LJIIL = c0yhxLIZ.LJIIL()) == null || (interfaceC866310XyfLIZIZ = c0yh4LJIIL.LIZIZ()) == null) {
            return null;
        }
        return interfaceC866310XyfLIZIZ.LJIIIZ();
    }

    public static int LIZLLL(C0Y8T c0y8t) {
        long jCurrentTimeMillis;
        C869590Y9l lastShowMessage;
        if (c0y8t != null && (lastShowMessage = c0y8t.getLastShowMessage()) != null) {
            jCurrentTimeMillis = System.currentTimeMillis() - lastShowMessage.getCreatedAt();
        } else {
            jCurrentTimeMillis = 0;
        }
        return (int) TimeUnit.MILLISECONDS.toDays(jCurrentTimeMillis);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0165 A[LOOP:0: B:49:0x015f->B:51:0x0165, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023b  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r30) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C880960YhC.LJIIJ(X.05Vn):java.lang.Object");
    }

    public static Object LIZIZ(Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC865850Xxv interfaceC865850XxvLJ = LJ();
        if (interfaceC865850XxvLJ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Map map2 = (Map) entry.getValue();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
                for (Map.Entry entry2 : map2.entrySet()) {
                    linkedHashMap2.put(entry2.getKey(), new C865830Xxt((String) entry2.getValue()));
                }
                linkedHashMap.put(key, linkedHashMap2);
            }
            Object objLIZ = interfaceC865850XxvLJ.LIZ(linkedHashMap, interfaceC1364105Vn);
            if (objLIZ == C099R.LJFF()) {
                return objLIZ;
            }
            return objLIZ;
        }
        return null;
    }

    public static double LIZJ(double d, int i) {
        return d * Math.pow(((double) 1) - C877780Yc4.LIZ().dailyDecayRatio, Math.max(0, i));
    }

    public static void LJIIJJI(int i, String str) {
        C0YNP.LJIIIIZZ(str, EnumC877690Ybv.FOLLOWER_NUM.getKey(), String.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e1  */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x033e -> B:131:0x035a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x0361 -> B:133:0x0363). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<java.lang.String> r20, X.InterfaceC1364105Vn<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C880960YhC.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r7 != false) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:109:0x0306, B:99:0x02d3], limit reached: 149 */
    /* JADX WARN: Path cross not found for [B:111:0x030c, B:112:0x030e], limit reached: 149 */
    /* JADX WARN: Path cross not found for [B:112:0x030e, B:111:0x030c], limit reached: 149 */
    /* JADX WARN: Path cross not found for [B:21:0x005f, B:37:0x00a7], limit reached: 149 */
    /* JADX WARN: Path cross not found for [B:55:0x0117, B:57:0x011d], limit reached: 149 */
    /* JADX WARN: Path cross not found for [B:99:0x02d3, B:109:0x0306], limit reached: 149 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x030c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d3  */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0Xxv] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object[], java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0264 -> B:93:0x0295). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0292 -> B:95:0x02c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.util.List<java.lang.String> r23, X.InterfaceC1364105Vn<? super X.C878120Ycc> r24) {
        /*
            Method dump skipped, instruction units count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C880960YhC.LJFF(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(kotlin.jvm.functions.Function0<kotlin.Unit> r17, X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C880960YhC.LJI(kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0248  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0112 -> B:14:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0118 -> B:14:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x015c -> B:14:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0166 -> B:14:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x019f -> B:12:0x0043). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01b6 -> B:13:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.util.List<java.lang.String> r24, X.InterfaceC1364105Vn<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C880960YhC.LJIIIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ec  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.C878120Ycc r23, long r24, kotlin.jvm.functions.Function0<kotlin.Unit> r26, X.InterfaceC1364105Vn<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C880960YhC.LJII(X.0Ycc, long, kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }
}
