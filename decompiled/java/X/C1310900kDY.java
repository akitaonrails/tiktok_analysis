package X;

import android.content.Context;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.lynx.service.reporter.LynxEventReporterService;
import com.bytedance.lynx.service.reporter.performance.LynxMemoryUsageGlobalReporter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kDY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310900kDY implements InterfaceC1310880kDW {
    public Context LJ;
    public final ConcurrentHashMap<Integer, C1310840kDS> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, C1310930kDb> LIZIZ = new ConcurrentHashMap<>();
    public final AtomicReference<String> LIZJ = new AtomicReference<>(null);
    public final AtomicReference<Boolean> LIZLLL = new AtomicReference<>(Boolean.FALSE);
    public final C01GW LJFF = C452501pT.LIZIZ(new C1310990kDh(this));
    public final C01GW LJI = C452501pT.LIZIZ(new C1310890kDX());

    public C1310900kDY() {
        Npth.addAttachLongUserData(new AttachUserData() { // from class: X.0kDZ
            @Override // com.bytedance.crash.AttachUserData
            public final Map getUserData(CrashType crashType) {
                String str = this.LIZ.LIZJ.get();
                if (str == null) {
                    str = "Unknown";
                }
                return C2097908Jt.LIZJ(new Pair("LynxSDKMemoryUsage", str));
            }
        }, CrashType.ALL);
    }

    public static Integer LIZJ(C1310800kDO c1310800kDO) {
        Object obj = c1310800kDO.LIZLLL.get("instanceId");
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    @Override // X.InterfaceC1310880kDW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(X.C1310800kDO r5) {
        /*
            r4 = this;
            X.01GW r0 = r4.LJI
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            java.lang.String r2 = r5.LIZ
            int r1 = r2.hashCode()
            r0 = -701686520(0xffffffffd62d1d08, float:-4.758505E13)
            if (r1 == r0) goto L4b
            r0 = 101203(0x18b53, float:1.41816E-40)
            if (r1 == r0) goto L31
            r0 = 528832539(0x1f85581b, float:5.647345E-20)
            if (r1 != r0) goto L28
            java.lang.String r0 = "actualFmp"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L3a
        L28:
            java.lang.String r1 = r5.LIZIZ
            java.lang.String r0 = "memory"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            return r0
        L31:
            java.lang.String r0 = "fcp"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L3a
            goto L28
        L3a:
            java.lang.Integer r0 = LIZJ(r5)
            if (r0 == 0) goto L28
            int r2 = r0.intValue()
            java.lang.String r1 = r5.LIZ
            r0 = 0
            r4.LIZLLL(r2, r1, r0)
            goto L28
        L4b:
            java.lang.String r0 = "loadBundle"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L28
            java.lang.Integer r0 = LIZJ(r5)
            if (r0 == 0) goto L28
            int r3 = r0.intValue()
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, X.0kDb> r1 = r4.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L28
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
            X.0NMl r0 = new X.0NMl
            r0.<init>(r3, r1)
            X.0kDb r2 = new X.0kDb
            r2.<init>(r0)
            boolean r0 = r2.LIZLLL
            if (r0 != 0) goto L89
            r0 = 1
            r2.LIZLLL = r0
            r0 = 0
            r2.LIZIZ = r0
            r0 = 0
            r2.LIZJ = r0
            r2.LIZ()
        L89:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, X.0kDb> r0 = r4.LIZIZ
            r0.put(r1, r2)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1310900kDY.LIZ(X.0kDO):boolean");
    }

    @Override // X.InterfaceC1310880kDW
    public final Map<String, Object> LIZIZ(C1310800kDO c1310800kDO) {
        Integer numLIZJ;
        String str;
        if ((c1310800kDO instanceof C1310840kDS) && (numLIZJ = LIZJ(c1310800kDO)) != null) {
            int iIntValue = numLIZJ.intValue();
            C1310840kDS c1310840kDS = (C1310840kDS) c1310800kDO;
            ((LynxMemoryUsageGlobalReporter) this.LJFF.getValue()).processMemoryUsageEntry(c1310840kDS, iIntValue, this.LIZ.get(Integer.valueOf(iIntValue)));
            long j = c1310840kDS.LJ;
            long j2 = 0;
            if (j == 0) {
                this.LIZ.remove(Integer.valueOf(iIntValue));
                C1310930kDb c1310930kDbRemove = this.LIZIZ.remove(Integer.valueOf(iIntValue));
                if (c1310930kDbRemove != null) {
                    c1310930kDbRemove.LIZLLL = false;
                }
            } else {
                this.LIZ.put(Integer.valueOf(iIntValue), c1310800kDO);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C1310840kDS c1310840kDS2 : this.LIZ.values()) {
                long j3 = c1310840kDS2.LJ;
                C1310850kDT c1310850kDT = c1310840kDS2.LJFF.get("backgroundThreadScriptingEngine");
                if (c1310850kDT != null && (str = c1310850kDT.LIZIZ.get("groupId")) != null) {
                    if (linkedHashSet.contains(str)) {
                        j3 -= c1310850kDT.LIZ;
                    } else {
                        linkedHashSet.add(str);
                    }
                }
                Object obj = c1310840kDS2.LIZLLL.get("url");
                if ((obj instanceof String) && obj != null) {
                    linkedHashMap.put(obj, new JSONObject(c1310840kDS2.LIZLLL));
                    j2 += j3;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sizeBytes", j2);
                jSONObject.put("lynxViewCount", linkedHashMap.size());
                jSONObject.put("detail", new JSONObject(linkedHashMap));
                LynxLog.i("LynxSDKMonitor", "LynxSDKMemoryUsage - totalSizeBytes: " + j2 + ", lynxViewCount: " + linkedHashMap.size());
                StringBuilder sb = new StringBuilder();
                sb.append("LynxSDKMemoryUsage - detail: ");
                sb.append(jSONObject);
                String string = sb.toString();
                this.LIZJ.set(string);
                LynxLog.i("LynxSDKMonitor", string);
                if (!this.LIZLLL.get().booleanValue()) {
                    this.LIZLLL.set(Boolean.TRUE);
                    Npth.addTag("enableLynxMemoryMonitor", "true");
                    return null;
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                LynxLog.e("LynxMemoryUsageProcessor", message);
            }
        }
        return null;
    }

    @Override // X.InterfaceC1310880kDW
    public final void onInitialize(Context context) {
        this.LJ = context;
    }

    public final void LIZLLL(int i, String str, Map<String, ? extends Object> map) {
        C1310840kDS c1310840kDS = this.LIZ.get(Integer.valueOf(i));
        if (c1310840kDS == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("totalSizeBytes", Long.valueOf(c1310840kDS.LJ));
        linkedHashMap.put("stage", str);
        for (Map.Entry<String, C1310850kDT> entry : c1310840kDS.LJFF.entrySet()) {
            String key = entry.getKey();
            C1310850kDT value = entry.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(key);
            sbLIZ.append("SizeBytes");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(value.LIZ));
        }
        HashMap<String, Object> map2 = c1310840kDS.LIZLLL;
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        AppLogNewUtils.onEventV3("lynxsdk_performance_entry_memory", LynxEventReporterService.INSTANCE.convertBooleanToInt(new JSONObject(linkedHashMap)));
    }
}
