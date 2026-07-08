package X;

import android.view.View;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor;
import com.ss.android.ugc.feed.platform.monitor.infra.FeedVisibilityOptConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0S44, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S44 implements InterfaceC715180S3o {
    public static final C0S44 LIZ = new C0S44();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(289));
    public static boolean LIZJ;

    @Override // X.InterfaceC715180S3o
    public final void LIZJ() {
    }

    @Override // X.InterfaceC715180S3o
    public final void LIZLLL(C0S48 c0s48) {
    }

    @Override // X.InterfaceC715180S3o
    public final void LJFF(C0S48 c0s48) {
    }

    @Override // X.InterfaceC715180S3o
    public final void LJI(C0S48 c0s48) {
    }

    @Override // X.InterfaceC715180S3o
    public final void LJIIIZ(C0S48 c0s48) {
    }

    @Override // X.InterfaceC715180S3o
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC715180S3o
    public final void onAppBackground() {
    }

    public static final AbstractC1604130rqV LJIILJJIL() {
        return (AbstractC1604130rqV) LIZIZ.getValue();
    }

    @Override // X.InterfaceC715180S3o
    public final void LJ(C0S48 c0s48) throws Exception {
        FeedInfraTimingSensor.LL.getClass();
        LJIIL(FeedInfraTimingSensor.LIZIZ(), c0s48, FeedInfraTimingSensor.LLIZ);
    }

    @Override // X.InterfaceC715180S3o
    public final void LJII(C0S48 c0s48) throws Exception {
        FeedInfraTimingSensor.LL.getClass();
        LJIIL(FeedInfraTimingSensor.LIZIZ(), c0s48, FeedInfraTimingSensor.LLIZ);
    }

    @Override // X.InterfaceC715180S3o
    public final void LJIIJJI(C0S48 c0s48) throws Exception {
        FeedInfraTimingSensor.LL.getClass();
        LJIIL(FeedInfraTimingSensor.LIZIZ(), c0s48, FeedInfraTimingSensor.LLIZ);
    }

    public static Map LIZ(Map map, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            Pair pair = new Pair(entry.getValue(), C0S41.LJ(((C0S45) entry.getKey()).getUpLevelSearch(), (View) entry.getValue(), z));
            if (entry.getKey() == C0S45.INFO_TITLE && pair.getSecond() == C0S46.SIZE) {
                pair = new Pair(pair.getFirst(), C0S46.NONE);
            }
            linkedHashMap.put(entry.getKey(), pair);
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC715180S3o
    public final void LJIIIIZZ(C0S48 c0s48, C0SZ8 c0sz8) throws Exception {
        LJIILJJIL().LIZIZ(AFwS198S0000000_11.get$arr$(292));
        FeedInfraTimingSensor.LL.getClass();
        LJIIL(c0sz8, c0s48, FeedInfraTimingSensor.LLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x039b A[Catch: Exception -> 0x054a, TryCatch #0 {Exception -> 0x054a, blocks: (B:11:0x0032, B:13:0x0038, B:15:0x005f, B:17:0x0078, B:19:0x007f, B:23:0x0086, B:25:0x008d, B:27:0x0093, B:29:0x0099, B:30:0x009f, B:34:0x00e2, B:36:0x00ee, B:40:0x0108, B:42:0x014f, B:43:0x015c, B:45:0x0162, B:47:0x017c, B:48:0x0188, B:52:0x0191, B:54:0x0195, B:56:0x019c, B:60:0x01a6, B:61:0x01b0, B:63:0x01b4, B:65:0x01b8, B:70:0x01cf, B:71:0x020b, B:72:0x0243, B:73:0x0250, B:75:0x0256, B:77:0x0270, B:78:0x027c, B:80:0x0285, B:81:0x028c, B:83:0x0290, B:85:0x0297, B:87:0x029b, B:89:0x02a2, B:91:0x02ad, B:93:0x02b3, B:95:0x02b7, B:96:0x02d4, B:97:0x02e1, B:99:0x02e7, B:101:0x0301, B:102:0x030d, B:104:0x0316, B:105:0x0318, B:107:0x031c, B:108:0x0329, B:110:0x032f, B:112:0x0347, B:113:0x0353, B:115:0x035c, B:117:0x0362, B:118:0x0364, B:120:0x0368, B:130:0x038a, B:132:0x039b, B:143:0x03bd, B:145:0x03c1, B:147:0x03c5, B:149:0x03c9, B:151:0x03cf, B:153:0x03dd, B:155:0x03f9, B:156:0x0401, B:158:0x0407, B:162:0x043e, B:163:0x0450, B:165:0x0454, B:183:0x04f1, B:185:0x0519, B:187:0x051d, B:189:0x0521, B:191:0x0525, B:167:0x0458, B:168:0x0465, B:170:0x046b, B:172:0x0485, B:173:0x0491, B:174:0x0499, B:176:0x049f, B:178:0x04da, B:180:0x04de, B:182:0x04e4, B:137:0x03a4, B:141:0x03ab, B:123:0x036e, B:125:0x0375, B:127:0x037b, B:129:0x0386, B:41:0x0122, B:142:0x03b0), top: B:199:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108 A[Catch: Exception -> 0x054a, TryCatch #0 {Exception -> 0x054a, blocks: (B:11:0x0032, B:13:0x0038, B:15:0x005f, B:17:0x0078, B:19:0x007f, B:23:0x0086, B:25:0x008d, B:27:0x0093, B:29:0x0099, B:30:0x009f, B:34:0x00e2, B:36:0x00ee, B:40:0x0108, B:42:0x014f, B:43:0x015c, B:45:0x0162, B:47:0x017c, B:48:0x0188, B:52:0x0191, B:54:0x0195, B:56:0x019c, B:60:0x01a6, B:61:0x01b0, B:63:0x01b4, B:65:0x01b8, B:70:0x01cf, B:71:0x020b, B:72:0x0243, B:73:0x0250, B:75:0x0256, B:77:0x0270, B:78:0x027c, B:80:0x0285, B:81:0x028c, B:83:0x0290, B:85:0x0297, B:87:0x029b, B:89:0x02a2, B:91:0x02ad, B:93:0x02b3, B:95:0x02b7, B:96:0x02d4, B:97:0x02e1, B:99:0x02e7, B:101:0x0301, B:102:0x030d, B:104:0x0316, B:105:0x0318, B:107:0x031c, B:108:0x0329, B:110:0x032f, B:112:0x0347, B:113:0x0353, B:115:0x035c, B:117:0x0362, B:118:0x0364, B:120:0x0368, B:130:0x038a, B:132:0x039b, B:143:0x03bd, B:145:0x03c1, B:147:0x03c5, B:149:0x03c9, B:151:0x03cf, B:153:0x03dd, B:155:0x03f9, B:156:0x0401, B:158:0x0407, B:162:0x043e, B:163:0x0450, B:165:0x0454, B:183:0x04f1, B:185:0x0519, B:187:0x051d, B:189:0x0521, B:191:0x0525, B:167:0x0458, B:168:0x0465, B:170:0x046b, B:172:0x0485, B:173:0x0491, B:174:0x0499, B:176:0x049f, B:178:0x04da, B:180:0x04de, B:182:0x04e4, B:137:0x03a4, B:141:0x03ab, B:123:0x036e, B:125:0x0375, B:127:0x037b, B:129:0x0386, B:41:0x0122, B:142:0x03b0), top: B:199:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0122 A[Catch: Exception -> 0x054a, TryCatch #0 {Exception -> 0x054a, blocks: (B:11:0x0032, B:13:0x0038, B:15:0x005f, B:17:0x0078, B:19:0x007f, B:23:0x0086, B:25:0x008d, B:27:0x0093, B:29:0x0099, B:30:0x009f, B:34:0x00e2, B:36:0x00ee, B:40:0x0108, B:42:0x014f, B:43:0x015c, B:45:0x0162, B:47:0x017c, B:48:0x0188, B:52:0x0191, B:54:0x0195, B:56:0x019c, B:60:0x01a6, B:61:0x01b0, B:63:0x01b4, B:65:0x01b8, B:70:0x01cf, B:71:0x020b, B:72:0x0243, B:73:0x0250, B:75:0x0256, B:77:0x0270, B:78:0x027c, B:80:0x0285, B:81:0x028c, B:83:0x0290, B:85:0x0297, B:87:0x029b, B:89:0x02a2, B:91:0x02ad, B:93:0x02b3, B:95:0x02b7, B:96:0x02d4, B:97:0x02e1, B:99:0x02e7, B:101:0x0301, B:102:0x030d, B:104:0x0316, B:105:0x0318, B:107:0x031c, B:108:0x0329, B:110:0x032f, B:112:0x0347, B:113:0x0353, B:115:0x035c, B:117:0x0362, B:118:0x0364, B:120:0x0368, B:130:0x038a, B:132:0x039b, B:143:0x03bd, B:145:0x03c1, B:147:0x03c5, B:149:0x03c9, B:151:0x03cf, B:153:0x03dd, B:155:0x03f9, B:156:0x0401, B:158:0x0407, B:162:0x043e, B:163:0x0450, B:165:0x0454, B:183:0x04f1, B:185:0x0519, B:187:0x051d, B:189:0x0521, B:191:0x0525, B:167:0x0458, B:168:0x0465, B:170:0x046b, B:172:0x0485, B:173:0x0491, B:174:0x0499, B:176:0x049f, B:178:0x04da, B:180:0x04de, B:182:0x04e4, B:137:0x03a4, B:141:0x03ab, B:123:0x036e, B:125:0x0375, B:127:0x037b, B:129:0x0386, B:41:0x0122, B:142:0x03b0), top: B:199:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0162 A[Catch: Exception -> 0x054a, TryCatch #0 {Exception -> 0x054a, blocks: (B:11:0x0032, B:13:0x0038, B:15:0x005f, B:17:0x0078, B:19:0x007f, B:23:0x0086, B:25:0x008d, B:27:0x0093, B:29:0x0099, B:30:0x009f, B:34:0x00e2, B:36:0x00ee, B:40:0x0108, B:42:0x014f, B:43:0x015c, B:45:0x0162, B:47:0x017c, B:48:0x0188, B:52:0x0191, B:54:0x0195, B:56:0x019c, B:60:0x01a6, B:61:0x01b0, B:63:0x01b4, B:65:0x01b8, B:70:0x01cf, B:71:0x020b, B:72:0x0243, B:73:0x0250, B:75:0x0256, B:77:0x0270, B:78:0x027c, B:80:0x0285, B:81:0x028c, B:83:0x0290, B:85:0x0297, B:87:0x029b, B:89:0x02a2, B:91:0x02ad, B:93:0x02b3, B:95:0x02b7, B:96:0x02d4, B:97:0x02e1, B:99:0x02e7, B:101:0x0301, B:102:0x030d, B:104:0x0316, B:105:0x0318, B:107:0x031c, B:108:0x0329, B:110:0x032f, B:112:0x0347, B:113:0x0353, B:115:0x035c, B:117:0x0362, B:118:0x0364, B:120:0x0368, B:130:0x038a, B:132:0x039b, B:143:0x03bd, B:145:0x03c1, B:147:0x03c5, B:149:0x03c9, B:151:0x03cf, B:153:0x03dd, B:155:0x03f9, B:156:0x0401, B:158:0x0407, B:162:0x043e, B:163:0x0450, B:165:0x0454, B:183:0x04f1, B:185:0x0519, B:187:0x051d, B:189:0x0521, B:191:0x0525, B:167:0x0458, B:168:0x0465, B:170:0x046b, B:172:0x0485, B:173:0x0491, B:174:0x0499, B:176:0x049f, B:178:0x04da, B:180:0x04de, B:182:0x04e4, B:137:0x03a4, B:141:0x03ab, B:123:0x036e, B:125:0x0375, B:127:0x037b, B:129:0x0386, B:41:0x0122, B:142:0x03b0), top: B:199:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0195 A[Catch: Exception -> 0x054a, TryCatch #0 {Exception -> 0x054a, blocks: (B:11:0x0032, B:13:0x0038, B:15:0x005f, B:17:0x0078, B:19:0x007f, B:23:0x0086, B:25:0x008d, B:27:0x0093, B:29:0x0099, B:30:0x009f, B:34:0x00e2, B:36:0x00ee, B:40:0x0108, B:42:0x014f, B:43:0x015c, B:45:0x0162, B:47:0x017c, B:48:0x0188, B:52:0x0191, B:54:0x0195, B:56:0x019c, B:60:0x01a6, B:61:0x01b0, B:63:0x01b4, B:65:0x01b8, B:70:0x01cf, B:71:0x020b, B:72:0x0243, B:73:0x0250, B:75:0x0256, B:77:0x0270, B:78:0x027c, B:80:0x0285, B:81:0x028c, B:83:0x0290, B:85:0x0297, B:87:0x029b, B:89:0x02a2, B:91:0x02ad, B:93:0x02b3, B:95:0x02b7, B:96:0x02d4, B:97:0x02e1, B:99:0x02e7, B:101:0x0301, B:102:0x030d, B:104:0x0316, B:105:0x0318, B:107:0x031c, B:108:0x0329, B:110:0x032f, B:112:0x0347, B:113:0x0353, B:115:0x035c, B:117:0x0362, B:118:0x0364, B:120:0x0368, B:130:0x038a, B:132:0x039b, B:143:0x03bd, B:145:0x03c1, B:147:0x03c5, B:149:0x03c9, B:151:0x03cf, B:153:0x03dd, B:155:0x03f9, B:156:0x0401, B:158:0x0407, B:162:0x043e, B:163:0x0450, B:165:0x0454, B:183:0x04f1, B:185:0x0519, B:187:0x051d, B:189:0x0521, B:191:0x0525, B:167:0x0458, B:168:0x0465, B:170:0x046b, B:172:0x0485, B:173:0x0491, B:174:0x0499, B:176:0x049f, B:178:0x04da, B:180:0x04de, B:182:0x04e4, B:137:0x03a4, B:141:0x03ab, B:123:0x036e, B:125:0x0375, B:127:0x037b, B:129:0x0386, B:41:0x0122, B:142:0x03b0), top: B:199:0x0032 }] */
    /* JADX WARN: Type inference failed for: r0v42, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v43, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(final X.C0SZ8 r32, final X.C0S48 r33, final long r34) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0S44.LJIIL(X.0SZ8, X.0S48, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[PHI: r5
      0x003e: PHI (r5v7 android.view.View) = (r5v4 android.view.View), (r5v8 android.view.View) binds: [B:14:0x003c, B:10:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZIZ(java.util.Map r8, android.view.View r9, android.view.View r10, android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0S44.LIZIZ(java.util.Map, android.view.View, android.view.View, android.view.View):java.util.Map");
    }

    public static final void LJIILIIL(Map<String, String> map, C699060RbU c699060RbU, Map<String, Object> map2, String str) {
        String str2 = (String) ((HashMap) map).get(str);
        if (str2 != null) {
            for (String str3 : a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6)) {
                Set set = (Set) FeedVisibilityOptConfig.LJIIZILJ.getValue();
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it2 = set.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (u.LJJIIJZLJL(str3, (String) it2.next(), false)) {
                            C699090RbX<ComponentPriorityProtocol> c699090RbX = c699060RbU.LJIILIIL().get(str3);
                            if (c699090RbX != null || (c699090RbX = c699060RbU.LJIJJLI().get(str3)) != null) {
                                Object obj = c699090RbX.LL;
                                if (obj != null) {
                                    map2.put(str3, obj);
                                    C0S4B c0s4bLJI = C0S41.LJI(obj);
                                    if (c0s4bLJI != null) {
                                        map2.put(str3, c0s4bLJI);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
