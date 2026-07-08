package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.080N, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C080N {
    public static final C080N LIZ = new C080N();
    public static final ConcurrentHashMap<String, Boolean> LIZIZ = new ConcurrentHashMap<>();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(817));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(816));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(711));

    public static final boolean LIZ(double d, String str) {
        Object c098200Yq;
        LIZ.getClass();
        boolean z = true;
        if (((Boolean) LIZJ.getValue()).booleanValue()) {
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OutreachSampler hitSample, key=");
            sbLIZ.append(str);
            sbLIZ.append(", rate=");
            sbLIZ.append(d);
            sbLIZ.append(", hit=true (debug build)");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZ(strLIZIZ);
            return true;
        }
        if (d <= 0.0d) {
            C20571615ec c20571615ec2 = C20571615ec.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("OutreachSampler hitSample, key=");
            sbLIZ2.append(str);
            sbLIZ2.append(", rate=");
            sbLIZ2.append(d);
            sbLIZ2.append(", hit=false (rate<=0)");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c20571615ec2.getClass();
            C20571615ec.LIZ(strLIZIZ2);
            return false;
        }
        if (d >= 1.0d) {
            C20571615ec c20571615ec3 = C20571615ec.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("OutreachSampler hitSample, key=");
            sbLIZ3.append(str);
            sbLIZ3.append(", rate=");
            sbLIZ3.append(d);
            sbLIZ3.append(", hit=true (rate>=1)");
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            c20571615ec3.getClass();
            C20571615ec.LIZ(strLIZIZ3);
            return true;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(str);
        sbLIZ4.append('_');
        sbLIZ4.append(d);
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LIZIZ;
        Boolean boolValueOf = concurrentHashMap.get(strLIZIZ4);
        if (boolValueOf == null) {
            try {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append((String) LJ.getValue());
                sbLIZ5.append('_');
                sbLIZ5.append(((Number) LIZLLL.getValue()).longValue());
                sbLIZ5.append('_');
                sbLIZ5.append(str);
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(C2188811AlT.LIZIZ(sbLIZ5).getBytes(Charsets.UTF_8));
                long j = 0;
                for (int i = 0; i < 8; i++) {
                    j = (j << 8) | (((long) bArrDigest[i]) & 255);
                }
                if ((j & Long.MAX_VALUE) / 9.223372036854776E18d >= d) {
                    z = false;
                }
                c098200Yq = Boolean.valueOf(z);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C20571615ec c20571615ec4 = C20571615ec.LIZ;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("OutreachSampler hashSample error, key=");
                sbLIZ6.append(str);
                sbLIZ6.append(", error=");
                sbLIZ6.append(thM5exceptionOrNullimpl);
                String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ6);
                c20571615ec4.getClass();
                C20571615ec.LIZIZ(strLIZIZ5);
            }
            Boolean bool = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = bool;
            }
            boolValueOf = Boolean.valueOf(((Boolean) c098200Yq).booleanValue());
            Boolean boolPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZIZ4, boolValueOf);
            if (boolPutIfAbsent != null) {
                boolValueOf = boolPutIfAbsent;
            }
        }
        Boolean bool2 = boolValueOf;
        C20571615ec c20571615ec5 = C20571615ec.LIZ;
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("OutreachSampler hitSample, key=");
        sbLIZ7.append(str);
        sbLIZ7.append(", rate=");
        sbLIZ7.append(d);
        sbLIZ7.append(", hit=");
        sbLIZ7.append(bool2);
        String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ7);
        c20571615ec5.getClass();
        C20571615ec.LIZ(strLIZIZ6);
        return bool2.booleanValue();
    }
}
