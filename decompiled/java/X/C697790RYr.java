package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS54S2100000_11;

/* JADX INFO: renamed from: X.0RYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697790RYr {
    public static final C697790RYr LIZ = new C697790RYr();
    public static final List<EnumC697290RWt> LIZIZ = C697310RWv.LIZ;
    public static final ConcurrentHashMap<String, C697800RYs> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> LIZLLL = new ConcurrentHashMap<>();

    public static void LIZ(String str, Map map) {
        C697800RYs c697800RYs;
        if (C715260S3w.LIZIZ() && str != null && (c697800RYs = LIZJ.get(str)) != null) {
            for (Map.Entry entry : map.entrySet()) {
                c697800RYs.LJII.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public static void LIZIZ(String str, String str2, Long l, EnumC697820RYu enumC697820RYu) {
        if (l != null && l.longValue() >= 3) {
            LIZJ(str, str2, l, enumC697820RYu, null, EnumC114300c1.METHOD_TIME);
        } else {
            new C020E(str, str2, l, 1);
            C695630RQj.LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void LIZJ(String str, String str2, Long l, EnumC697820RYu enumC697820RYu, Map map, EnumC114300c1 enumC114300c1) {
        ConcurrentHashMap<String, AbstractC1879407Xs> concurrentHashMap;
        C1879207Xq c1879207Xq;
        if (!C715260S3w.LIZIZ() || str == null) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = l;
        if (l == 0) {
            c259800zU.element = Long.valueOf(System.currentTimeMillis());
        }
        if (enumC697820RYu == null) {
            enumC697820RYu = EnumC697820RYu.OVERRIDE;
        }
        if (enumC114300c1 == null) {
            enumC114300c1 = EnumC114300c1.LOAD_TIME;
        }
        ConcurrentHashMap<String, C697800RYs> concurrentHashMap2 = LIZJ;
        String str3 = LIZLLL.get(str);
        if (str3 == null) {
            str3 = str;
        }
        C697800RYs c697800RYs = concurrentHashMap2.get(str3);
        if (c697800RYs == null) {
            c697800RYs = new C697800RYs(str, LIZIZ);
            C697800RYs c697800RYsPutIfAbsent = concurrentHashMap2.putIfAbsent(str3, c697800RYs);
            if (c697800RYsPutIfAbsent != null) {
                c697800RYs = c697800RYsPutIfAbsent;
            }
        }
        C697800RYs c697800RYs2 = c697800RYs;
        long jLongValue = ((Number) c259800zU.element).longValue();
        if ((!c697800RYs2.LIZJ || enumC114300c1 != EnumC114300c1.LOAD_TIME) && (!c697800RYs2.LIZLLL || enumC114300c1 != EnumC114300c1.METHOD_TIME)) {
            if (enumC114300c1 == EnumC114300c1.LOAD_TIME) {
                concurrentHashMap = c697800RYs2.LJFF;
            } else {
                concurrentHashMap = c697800RYs2.LJI;
            }
            synchronized (concurrentHashMap) {
                try {
                    AbstractC1879407Xs c1879307Xr = concurrentHashMap.get(str2);
                    int i = C697810RYt.LIZ[enumC697820RYu.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                if (c1879307Xr == null) {
                                    c1879307Xr = new C1879307Xr(jLongValue);
                                }
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            if (c1879307Xr instanceof C1879307Xr) {
                                c1879207Xq = new C1879207Xq(C13LQ.LJJLJLI(new long[]{((C1879307Xr) c1879307Xr).LIZ, jLongValue}));
                            } else if (c1879307Xr instanceof C1879207Xq) {
                                C1879207Xq c1879207Xq2 = (C1879207Xq) c1879307Xr;
                                c1879207Xq2.getClass();
                                c1879207Xq = new C1879207Xq(C13LP.LJLILLLLZI(Long.valueOf(jLongValue), c1879207Xq2.LIZ));
                            } else {
                                c1879207Xq = new C1879207Xq(C13LQ.LJJLJLI(new long[]{jLongValue}));
                            }
                            c1879307Xr = c1879207Xq;
                        }
                    } else {
                        c1879307Xr = new C1879307Xr(jLongValue);
                    }
                    concurrentHashMap.put(str2, c1879307Xr);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (map != null) {
            LIZ(str, map);
        }
        new AwS54S2100000_11(str, str2, (String) c259800zU, (C259800zU<Long>) 0);
        C695630RQj.LIZ();
    }
}
