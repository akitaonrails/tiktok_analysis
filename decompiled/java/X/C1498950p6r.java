package X;

import Y.AComparatorS22S0000000_3;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.net.experiment.BackgroundRequestFilterStrategy;
import com.ss.android.ugc.aweme.net.experiment.RepeatRequestFilterStrategy;
import com.ss.android.ugc.aweme.net.experiment.RiskyRetryReportStrategy;
import com.ss.android.ugc.aweme.net.experiment.Strategy;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0p6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498950p6r {
    public static final C1498950p6r LIZ = new C1498950p6r();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(124));

    public static void LIZ(C0XM9 c0xm9) {
        boolean z;
        C1498960p6s c1498960p6s;
        Object next;
        int i;
        TypedOutput typedOutput;
        String strMd5Stub;
        TypedOutput typedOutput2;
        String strMimeType;
        if (C1498970p6t.LIZ(c0xm9) || (C1498970p6t.LIZIZ(c0xm9) && (typedOutput2 = c0xm9.LJ.LIZIZ) != null && (strMimeType = typedOutput2.mimeType()) != null && (a0.LJJIIZI(strMimeType, "application/x-www-form-urlencoded", false) || a0.LJJIIZI(strMimeType, "application/json", false)))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RepeatRequestFilterStrategy repeatRequestFilterStrategy = (RepeatRequestFilterStrategy) C1498980p6u.LIZIZ.getValue();
            if ((repeatRequestFilterStrategy.enableDuringStartup || C0CN5.LJII()) && repeatRequestFilterStrategy.limit > 0 && !C1216130hkh.LIZ(c0xm9.LIZJ.LJFF.LIZ(), repeatRequestFilterStrategy.whiteList) && (repeatRequestFilterStrategy.strictMode || C1216130hkh.LIZ(c0xm9.LIZJ.LJFF.LIZ(), repeatRequestFilterStrategy.blackList))) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strLIZIZ = c0xm9.LIZJ.LJIIIIZZ;
                if (C1498970p6t.LIZIZ(c0xm9) && (typedOutput = c0xm9.LJ.LIZIZ) != null && (strMd5Stub = typedOutput.md5Stub()) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append("&md5=");
                    sbLIZ.append(strMd5Stub);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                if (C123100dR.LIZ(strLIZIZ)) {
                    ConcurrentHashMap<String, Long> concurrentHashMap = C1499000p6w.LIZ;
                    Long l = concurrentHashMap.get(strLIZIZ);
                    if (l != null && jCurrentTimeMillis - l.longValue() < repeatRequestFilterStrategy.limit * LSPassThroughRecordSizeConfig.DEFAULT) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Drop repeat request in ");
                        sbLIZ2.append(repeatRequestFilterStrategy.limit);
                        sbLIZ2.append(" second");
                        C1499020p6y c1499020p6y = new C1499020p6y(-2222, C2188811AlT.LIZIZ(sbLIZ2));
                        LIZ.getClass();
                        LIZJ(c0xm9, c1499020p6y);
                        throw null;
                    }
                    concurrentHashMap.put(strLIZIZ, Long.valueOf(jCurrentTimeMillis));
                    long j = jCurrentTimeMillis - 0;
                    long j2 = repeatRequestFilterStrategy.limit * LSPassThroughRecordSizeConfig.DEFAULT;
                    if (j < j2 && (i = C1499000p6w.LIZIZ) < 3) {
                        C1499000p6w.LIZIZ = i + 1;
                    } else {
                        C1499000p6w.LIZIZ = 0;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, Long> entry : concurrentHashMap.entrySet()) {
                            if (jCurrentTimeMillis - entry.getValue().longValue() > j2) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        ArrayList arrayList = new ArrayList(linkedHashMap.size());
                        Iterator it2 = linkedHashMap.entrySet().iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((Map.Entry) it2.next()).getKey());
                        }
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            C1499000p6w.LIZ.remove(it3.next());
                        }
                    }
                }
            }
        }
        C1210740hc0.LIZIZ.getValue();
        int iLIZJ = C19266210Yy.LIZIZ.LIZJ();
        if (iLIZJ > 0 && C1210740hc0.LIZ) {
            C01GW c01gw = C07NX.LIZJ;
            if (((BackgroundRequestFilterStrategy) c01gw.getValue()).enable) {
                Iterator it4 = C13LP.LJLLLL(new AComparatorS22S0000000_3(16), ((BackgroundRequestFilterStrategy) c01gw.getValue()).strategy).iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (iLIZJ >= ((Strategy) next).threshold) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Strategy strategy = (Strategy) next;
                if (strategy != null && !C1216130hkh.LIZ(c0xm9.LIZJ.LJFF.LIZ(), strategy.whiteList) && (strategy.strictMode || C1216130hkh.LIZ(c0xm9.LIZJ.LJFF.LIZ(), strategy.blackList))) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Drop background requests when went background for ");
                    sbLIZ3.append(iLIZJ);
                    sbLIZ3.append(" minutes");
                    C1499020p6y c1499020p6y2 = new C1499020p6y(-2223, C2188811AlT.LIZIZ(sbLIZ3));
                    LIZ.getClass();
                    LIZJ(c0xm9, c1499020p6y2);
                    throw null;
                }
            }
        }
        String strLIZ = c0xm9.LIZJ.LJFF.LIZ();
        if (C1498940p6q.LIZIZ(strLIZ, c0xm9.LIZJ.LJIIIIZZ) && (c1498960p6s = (C1498960p6s) ((ConcurrentHashMap) C1498940p6q.LIZ.getValue()).get(strLIZ)) != null && System.currentTimeMillis() < c1498960p6s.LIZIZ.get()) {
            try {
                Thread.sleep(500L);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1499020p6y c1499020p6y3 = new C1499020p6y(-2224, "API [" + strLIZ + "] is blocked by risk retry request filter");
            LIZ.getClass();
            LIZJ(c0xm9, c1499020p6y3);
            throw null;
        }
    }

    public static void LIZJ(C0XM9 c0xm9, C1499020p6y c1499020p6y) throws C1494690ozz {
        C1494600ozq c1494600ozqCreate = C1494600ozq.LJJJJZ.create();
        c1494600ozqCreate.LIZLLL = new C1494570ozn();
        c1494600ozqCreate.LJJIIJZLJL = new JSONObject();
        C1494690ozz c1494690ozz = new C1494690ozz(new Exception(c1499020p6y.LIZIZ), c1494600ozqCreate, c1499020p6y.LIZ);
        c1494690ozz.setInfo(false, true, c0xm9.LIZJ.LJIIIIZZ, "", c1494600ozqCreate);
        if (c1499020p6y.LIZ == -2224) {
            try {
                RiskyRetryReportStrategy riskyRetryReportStrategy = (RiskyRetryReportStrategy) C20583084n.LIZIZ.getValue();
                if (riskyRetryReportStrategy.enable) {
                    double d = riskyRetryReportStrategy.sampleRate;
                    if (d >= 1.0d || (d > 0.0d && ((SecureRandom) LIZIZ.getValue()).nextDouble() < d)) {
                        String str = c0xm9.LIZJ.LJIIIIZZ;
                        String strLJJZ = a0.LJJZ(str, "?", str);
                        C1910107dz c1910107dzLIZ = C20581084l.LIZ(strLJJZ);
                        if (c1910107dzLIZ.LIZ) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("url", strLJJZ);
                            jSONObject.put("code", c1499020p6y.LIZ);
                            jSONObject.put("drop_count", c1910107dzLIZ.LIZIZ);
                            jSONObject.put("qps", c1910107dzLIZ.LIZJ);
                            C20684815ws.LJIJ("net_risky_retry_request_dropped", jSONObject);
                            throw c1494690ozz;
                        }
                        throw c1494690ozz;
                    }
                    throw c1494690ozz;
                }
                throw c1494690ozz;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw c1494690ozz;
            }
        }
        throw c1494690ozz;
    }

    public static void LIZIZ(Request request, C0X52 c0x52, Throwable th) {
        C1494430ozZ c1494430ozZ;
        Integer numValueOf;
        C1494690ozz c1494690ozz;
        String path = request.getPath();
        if (C1498940p6q.LIZIZ(path, request.getUrl())) {
            if (((c0x52 != null && (numValueOf = Integer.valueOf(c0x52.LIZ.LIZIZ)) != null) || (((th instanceof C1494690ozz) && (c1494690ozz = (C1494690ozz) th) != null && (numValueOf = Integer.valueOf(c1494690ozz.getStatusCode())) != null) || ((th instanceof C1494430ozZ) && (c1494430ozZ = (C1494430ozZ) th) != null && (numValueOf = Integer.valueOf(c1494430ozZ.getStatusCode())) != null))) && C1498940p6q.LIZJ().errorHttpCode.contains(numValueOf)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C01GW c01gw = C1498940p6q.LIZ;
                C1498960p6s c1498960p6s = (C1498960p6s) ((ConcurrentHashMap) c01gw.getValue()).get(path);
                if (c1498960p6s == null) {
                    c1498960p6s = new C1498960p6s(null);
                    C1498960p6s c1498960p6s2 = (C1498960p6s) ((ConcurrentHashMap) c01gw.getValue()).putIfAbsent(path, c1498960p6s);
                    if (c1498960p6s2 != null) {
                        c1498960p6s = c1498960p6s2;
                    }
                }
                c1498960p6s.LIZ.add(Long.valueOf(jCurrentTimeMillis));
                long j = jCurrentTimeMillis - ((long) C1498940p6q.LIZJ().errorTimeMs);
                while (c1498960p6s.LIZ.peek() != null && c1498960p6s.LIZ.peek().longValue() < j) {
                    c1498960p6s.LIZ.poll();
                }
                if (c1498960p6s.LIZ.size() >= C1498940p6q.LIZJ().errorMaxCount) {
                    long j2 = jCurrentTimeMillis + ((long) C1498940p6q.LIZJ().blockWindowMs);
                    c1498960p6s.LIZIZ.set(j2);
                    c1498960p6s.LIZ.clear();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Rate limit for API [");
                    sbLIZ.append(path);
                    sbLIZ.append("] exceeded. Blocking it until ");
                    sbLIZ.append(((DateFormat) C1498940p6q.LIZIZ.getValue()).format(new Date(j2)));
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
    }
}
