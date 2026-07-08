package X;

import android.text.TextUtils;
import com.bytedance.apm.doctor.DoctorManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VB1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VB1 implements C0VBC {
    public static volatile C0VB1 LJFF = new C0VB1();
    public static C0VBD LJI;
    public C793760VBu LIZ;
    public C793750VBt LIZIZ;
    public volatile boolean LIZJ;
    public InterfaceC794310VDx LIZLLL;
    public final C0VB8 LJ = new C0VB8(this);

    /* JADX WARN: Type inference failed for: r0v55, types: [X.0VBF] */
    @Override // X.C0VBC
    public final void LIZ(C0VB5 c0vb5) throws JSONException {
        String str;
        if (!this.LIZJ) {
            synchronized (this) {
                if (!this.LIZJ) {
                    if (C792190V5t.LIZ()) {
                        C792910V8n.LIZ("APM-Slardar", "Initializing SlardarHandler...");
                        if (C792420V6q.LIZIZ() == 0) {
                            throw new RuntimeException("Aid is 0, maybe Apm has not been started or Aid is not configured in Header.");
                        }
                    }
                    C793600VBe.LIZIZ().LIZJ();
                    C793520VAw.LIZ.LIZ(C792190V5t.LIZIZ);
                    C0V78 c0v78 = (C0V78) C792590V7h.LIZ(C0V78.class);
                    if (c0v78 != null) {
                        LIZJ(c0v78.getConfig());
                    }
                    if (this.LIZLLL == null) {
                        this.LIZLLL = (InterfaceC794310VDx) C792590V7h.LIZ(InterfaceC794310VDx.class);
                    }
                    C793760VBu c793760VBu = new C793760VBu(C793610VBf.LIZ(), C793630VBh.LIZJ(), C793630VBh.LIZ());
                    this.LIZ = c793760VBu;
                    C0VBK c0vbk = C0VBJ.LIZ;
                    c0vbk.LIZLLL = c793760VBu;
                    C0VB3.LJ.LIZ(c0vbk);
                    C0VB3 c0vb3 = C0VB3.LJ;
                    final C0VBN c0vbn = C0VBA.LIZ;
                    c0vb3.LIZ(c0vbn);
                    final C0VB3 c0vb32 = C0VB3.LJ;
                    c0vb32.getClass();
                    if (C792420V6q.LJIILJJIL()) {
                        C792490V6x.LIZ(EnumC792970V8t.IO).LIZJ(new AbstractRunnableC792500V6y() { // from class: X.0VB4
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("WeedOutManager@b2b1.init$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("WeedOutManager@b2b1.init$1");
                            }

                            public final void LIZ() {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                C0VB3 c0vb33 = c0vb32;
                                int i = c0vb33.LIZLLL;
                                long j = ((long) c0vb33.LIZJ) * 1024 * 1024;
                                HashMap map = new HashMap();
                                if (C792190V5t.LIZ()) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("start weedOut:");
                                    sbLIZ.append(jCurrentTimeMillis - (((long) i) * 86400000));
                                    C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ));
                                }
                                long size = 0;
                                for (C0VB7 c0vb7 : (HashSet) c0vb32.LIZ) {
                                    C0VB6 c0vb6 = new C0VB6();
                                    map.put(c0vb7.getName(), c0vb6);
                                    c0vb6.LIZ = c0vb7.getName();
                                    c0vb6.LIZIZ = c0vb7.getSize();
                                    if (C792190V5t.LIZ()) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("weedOut:name:");
                                        sbLIZ2.append(c0vb6.LIZ);
                                        sbLIZ2.append(" beforeSize:");
                                        sbLIZ2.append(c0vb6.LIZIZ);
                                        C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ2));
                                    }
                                    c0vb7.LIZ(jCurrentTimeMillis - (((long) i) * 86400000));
                                    long size2 = c0vb7.getSize();
                                    c0vb6.LIZJ = size2;
                                    if (C792190V5t.LIZ()) {
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("weedOut:name:");
                                        sbLIZ3.append(c0vb6.LIZ);
                                        sbLIZ3.append(" afterSize:");
                                        sbLIZ3.append(c0vb6.LIZIZ);
                                        C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ3));
                                    }
                                    size += size2;
                                }
                                while (true) {
                                    i--;
                                    if (size <= j || i <= 0) {
                                        break;
                                    }
                                    size = 0;
                                    for (C0VB7 c0vb72 : (HashSet) c0vb32.LIZ) {
                                        c0vb72.LIZ(jCurrentTimeMillis - (((long) i) * 86400000));
                                        long size3 = c0vb72.getSize();
                                        C0VB6 c0vb62 = (C0VB6) map.get(c0vb72.getName());
                                        if (c0vb62 != null) {
                                            c0vb62.LIZJ = size3;
                                        }
                                        size += c0vb72.getSize();
                                    }
                                }
                                C0V6K c0v6k = c0vb32.LIZIZ;
                                if (c0v6k != null) {
                                    ArrayList<C0VB6> arrayList = new ArrayList(map.values());
                                    c0v6k.getClass();
                                    if (C08GN.LIZIZ(arrayList)) {
                                        return;
                                    }
                                    JSONObject jSONObject = new JSONObject();
                                    for (C0VB6 c0vb63 : arrayList) {
                                        try {
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append("before_size_");
                                            sbLIZ4.append(c0vb63.LIZ);
                                            jSONObject.put(C2188811AlT.LIZIZ(sbLIZ4), c0vb63.LIZIZ);
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append("after_size_");
                                            sbLIZ5.append(c0vb63.LIZ);
                                            jSONObject.put(C2188811AlT.LIZIZ(sbLIZ5), c0vb63.LIZJ);
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                    }
                                    C0V6Y.LIZLLL("apm_db_size", 0, null, jSONObject, null);
                                }
                            }

                            {
                                super(0L, 14400000L);
                            }
                        });
                    }
                    c0vbk.LIZJ();
                    c0vbn.getClass();
                    c0vbn.LIZIZ = new AbstractRunnableC792500V6y() { // from class: X.0VBF
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LogSender@45fd.init$2");
                            try {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                C0VBN c0vbn2 = c0vbn;
                                if (jCurrentTimeMillis - c0vbn2.LIZLLL >= c0vbn2.LIZJ) {
                                    try {
                                        c0vbn2.LIZLLL();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C792910V8n.LIZJ("APM-Slardar", "send", th);
                                    }
                                    c0vbn.LIZLLL = System.currentTimeMillis();
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LogSender@45fd.init$2");
                        }

                        {
                            super(0L, 30000L);
                        }
                    };
                    C792490V6x.LIZ(EnumC792970V8t.IO).LIZJ(c0vbn.LIZIZ);
                    this.LIZJ = true;
                }
            }
        }
        JSONObject jSONObjectLIZ = c0vb5.LIZ();
        C0VBD c0vbd = LJI;
        if (c0vbd != null) {
            try {
                jSONObjectLIZ = c0vbd.LIZ(jSONObjectLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (C792190V5t.LIZ()) {
                    C792910V8n.LIZJ("APM-Slardar", "IEventJsonInterceptor throws a Throwable", th);
                }
            }
        }
        if (TextUtils.isEmpty(c0vb5.getStoreRegion())) {
            if (C792420V6q.LIZJ == null) {
                str = "";
            } else {
                str = C792400V6o.LJJIFFI;
            }
            jSONObjectLIZ.put("store_region", str);
        } else {
            jSONObjectLIZ.put("store_region", c0vb5.getStoreRegion());
        }
        if (!C791180V1w.LIZ.contains(c0vb5.getLogType()) && !"tracing".equals(c0vb5.getLogType())) {
            if (!C793520VAw.LIZ.LIZJ(C792420V6q.LIZIZ(), jSONObjectLIZ)) {
                if (C792190V5t.LIZ()) {
                    String logType = c0vb5.getLogType();
                    JSONObject jSONObjectOptJSONObject = jSONObjectLIZ.optJSONObject("DATA_DOCTOR");
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = new JSONObject();
                    }
                    try {
                        if (jSONObjectOptJSONObject.optInt("DATA_ID", -1) == -1) {
                            jSONObjectOptJSONObject.put("DATA_ID", C793430VAn.LIZ.incrementAndGet());
                        }
                        jSONObjectOptJSONObject.put("DATA_PROCESS", C2162308dZ.LIZ(C792190V5t.LIZIZ));
                        jSONObjectOptJSONObject.put("DATA_TYPE", logType);
                        jSONObjectOptJSONObject.put("DATA_AID", C792420V6q.LIZIZ());
                        jSONObjectLIZ.put("DATA_DOCTOR", jSONObjectOptJSONObject);
                        DoctorManager.getInstance().LIZ("DATA_DOWNGRADE", new JSONObject(C786410Ut5.J3(jSONObjectLIZ)));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("push failed: event(aid=");
                    sbLIZ.append(C792420V6q.LIZIZ());
                    sbLIZ.append(" is downgraded: ");
                    sbLIZ.append(C786410Ut5.J3(jSONObjectLIZ));
                    C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            LIZIZ(jSONObjectLIZ, true);
        } else {
            LIZIZ(jSONObjectLIZ, false);
        }
        if (C792190V5t.LIZ()) {
            C793430VAn.LIZ(jSONObjectLIZ, c0vb5.getLogType(), true);
        }
        if (c0vb5.LIZIZ()) {
            if (this.LIZIZ == null) {
                C793750VBt c793750VBt = new C793750VBt(C793610VBf.LIZ());
                this.LIZIZ = c793750VBt;
                C0VBJ.LIZ.LJ = c793750VBt;
            }
            this.LIZIZ.LIZLLL(jSONObjectLIZ);
            return;
        }
        this.LIZ.LJ(jSONObjectLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[Catch: all -> 0x006a, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0016, B:7:0x0019, B:9:0x0027, B:11:0x0042, B:15:0x0062, B:16:0x0065, B:12:0x0045, B:14:0x004b), top: B:22:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[Catch: all -> 0x006a, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0016, B:7:0x0019, B:9:0x0027, B:11:0x0042, B:15:0x0062, B:16:0x0065, B:12:0x0045, B:14:0x004b), top: B:22:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZJ(X.C792880V8k r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            if (r8 == 0) goto L45
            X.0V7Z r0 = X.C792520V7a.LIZ     // Catch: java.lang.Throwable -> L6a
            r0.LJFF = r8     // Catch: java.lang.Throwable -> L6a
            X.0VBK r6 = X.C0VBJ.LIZ     // Catch: java.lang.Throwable -> L6a
            long r0 = r8.LJIIIIZZ     // Catch: java.lang.Throwable -> L6a
            r6.LJFF(r0)     // Catch: java.lang.Throwable -> L6a
            long r4 = r8.LIZ     // Catch: java.lang.Throwable -> L6a
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L65
            r6.getClass()     // Catch: java.lang.Throwable -> L6a
        L19:
            X.0VB3 r4 = X.C0VB3.LJ     // Catch: java.lang.Throwable -> L6a
            int r1 = r8.LJIIIZ     // Catch: java.lang.Throwable -> L6a
            int r0 = r8.LJIIJ     // Catch: java.lang.Throwable -> L6a
            r4.LIZIZ(r1, r0)     // Catch: java.lang.Throwable -> L6a
            int r5 = r8.LJIIJJI     // Catch: java.lang.Throwable -> L6a
            r0 = 2
            if (r5 != r0) goto L62
            android.app.Application r4 = X.C792190V5t.LIZIZ     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = "dict_interval"
            r0 = 0
            android.content.SharedPreferences r1 = X.C810670Vr7.LIZJ(r4, r0, r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "force_zstd_timestamp"
            long r0 = r1.getLong(r0, r2)     // Catch: java.lang.Throwable -> L6a
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6a
            long r3 = r3 - r0
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L62
            r0 = 1
            X.C793470VAr.LJIIJ = r0     // Catch: java.lang.Throwable -> L6a
        L45:
            boolean r0 = X.C792190V5t.LIZ()     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L68
            java.lang.String r2 = "APM-Slardar"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "setSlardarHandlerConfig:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L6a
            r1.append(r8)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L6a
            X.C792910V8n.LIZ(r2, r0)     // Catch: java.lang.Throwable -> L6a
            goto L68
        L62:
            X.C793470VAr.LJIIJ = r5     // Catch: java.lang.Throwable -> L6a
            goto L45
        L65:
            r6.LIZIZ = r4     // Catch: java.lang.Throwable -> L6a
            goto L19
        L68:
            monitor-exit(r7)
            return
        L6a:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VB1.LIZJ(X.0V8k):void");
    }

    public final void LIZIZ(JSONObject jSONObject, boolean z) {
        String sessionId;
        int iLIZ;
        InterfaceC792440V6s interfaceC792440V6s;
        InterfaceC792440V6s interfaceC792440V6s2;
        try {
            ((C0V6O) C792420V6q.LIZJ).getClass();
            String sessionId2 = null;
            if (C792400V6o.LJ() != null && (interfaceC792440V6s2 = C792400V6o.LJI) != null) {
                sessionId = interfaceC792440V6s2.getSessionId();
            } else {
                sessionId = null;
            }
            if (!TextUtils.isEmpty(sessionId)) {
                ((C0V6O) C792420V6q.LIZJ).getClass();
                if (C792400V6o.LJ() != null && (interfaceC792440V6s = C792400V6o.LJI) != null) {
                    sessionId2 = interfaceC792440V6s.getSessionId();
                }
                jSONObject.put("session_id", sessionId2);
            }
            if (jSONObject.isNull("network_type")) {
                EnumC804620VhM enumC804620VhME3 = C786410Ut5.e3(C792190V5t.LIZIZ);
                jSONObject.put("network_type", enumC804620VhME3.getValue());
                if ((enumC804620VhME3.is2G() || enumC804620VhME3.is3GOrHigher()) && (iLIZ = C0VB2.LIZ(C792190V5t.LIZIZ, this.LJ)) != -10000) {
                    jSONObject.put("network_type_code", iLIZ);
                }
            }
            if (jSONObject.isNull("timestamp") || jSONObject.optLong("timestamp") <= 0) {
                jSONObject.put("timestamp", System.currentTimeMillis());
            }
            if (jSONObject.isNull("sid")) {
                jSONObject.put("sid", C792420V6q.LJIIIZ());
            }
            jSONObject.put("process_name", C792420V6q.LJ());
            if (z) {
                jSONObject.put("seq_no", C0VB9.LIZ.LIZ());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
