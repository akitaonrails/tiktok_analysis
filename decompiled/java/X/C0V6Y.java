package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V6Y, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V6Y {
    public static boolean LIZ;
    public static volatile C205100qf LIZIZ;
    public static volatile boolean LIZJ;
    public static final C0V6Z<C0VB5> LIZLLL;
    public static boolean LJ;
    public static InterfaceC792300V6e LJFF;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0V6d] */
    static {
        C0V6Z<C0VB5> c0v6z = new C0V6Z<>(LSPassThroughRecordSizeConfig.DEFAULT);
        LIZLLL = c0v6z;
        LJ = true;
        c0v6z.LIZJ = new Object() { // from class: X.0V6d
        };
    }

    public static synchronized void LIZ() {
        InterfaceC792210V5v interfaceC792210V5v;
        if (!LIZJ && (interfaceC792210V5v = (InterfaceC792210V5v) C792590V7h.LIZ(InterfaceC792210V5v.class)) != null) {
            LJII(interfaceC792210V5v.getConfig());
            LIZJ = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C0V6V r6) {
        /*
            r0 = 137663(0x219bf, float:1.92907E-40)
            boolean r5 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            if (r6 != 0) goto Lf
            if (r5 == 0) goto Le
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        Le:
            return
        Lf:
            X.00qf r0 = X.C0V6Y.LIZIZ
            java.lang.String r3 = "APM-CommonEvent"
            if (r0 != 0) goto L3c
            X.0V6Z<X.0VB5> r0 = X.C0V6Y.LIZLLL
            r0.LIZJ(r6)
            boolean r0 = X.C792190V5t.LIZ()
            if (r0 == 0) goto L33
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Cached CommonLog: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C792910V8n.LIZ(r3, r0)
        L33:
            LIZ()
            if (r5 == 0) goto L3b
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L3b:
            return
        L3c:
            X.0V6e r0 = X.C0V6Y.LJFF
            r4 = 0
            if (r0 == 0) goto L7a
            org.json.JSONObject r0 = r6.LIZJ
            boolean r0 = X.C792340V6i.LIZ(r0)
            if (r0 == 0) goto L7a
            X.0V6e r0 = X.C0V6Y.LJFF
            org.json.JSONObject r0 = r6.LIZJ
            X.C792340V6i.LIZIZ(r0)
        L50:
            org.json.JSONObject r0 = r6.LIZJ
            org.json.JSONObject r0 = X.C792450V6t.LJII(r0)
            r6.LIZJ = r0
            boolean r0 = X.C792190V5t.LIZ()
            if (r0 == 0) goto L71
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Sampled CommonLog:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C792910V8n.LIZ(r3, r0)
        L71:
            X.C0VBB.LIZ(r6)
        L74:
            if (r5 == 0) goto L79
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L79:
            return
        L7a:
            X.00qf r2 = X.C0V6Y.LIZIZ
            java.lang.String r1 = r6.LIZIZ
            org.json.JSONObject r0 = r6.LIZJ
            boolean r0 = r2.LIZ(r1, r0)
            if (r0 != 0) goto L50
            boolean r0 = X.C792190V5t.LIZ()
            if (r0 == 0) goto L74
            org.json.JSONObject r0 = r6.LIZJ
            org.json.JSONObject r0 = X.C792450V6t.LJII(r0)
            r6.LIZJ = r0
            java.lang.String r1 = r6.LIZIZ
            org.json.JSONObject r0 = r6.LIZ()
            X.C793430VAn.LIZ(r0, r1, r4)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "UnSampled CommonLog:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C792910V8n.LIZ(r3, r0)
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0V6Y.LIZIZ(X.0V6V):void");
    }

    public static void LIZJ(C0V6X c0v6x) {
        if (c0v6x == null) {
            return;
        }
        if (LIZIZ == null) {
            LIZLLL.LIZJ(c0v6x);
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cached CommonEvent:");
                sbLIZ.append(c0v6x);
                C792910V8n.LIZ("APM-CommonEvent", C2188811AlT.LIZIZ(sbLIZ));
            }
            LIZ();
            return;
        }
        InterfaceC792280V6c interfaceC792280V6c = (InterfaceC792280V6c) C792590V7h.LIZ(InterfaceC792280V6c.class);
        if (interfaceC792280V6c != null && interfaceC792280V6c.LIZ(c0v6x.LIZIZ)) {
            c0v6x.LIZJ();
            C0VBB.LIZ(c0v6x);
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("HighPriority CommonEvent:");
                sbLIZ2.append(c0v6x);
                C792910V8n.LIZ("APM-CommonEvent", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            return;
        }
        if (LJFF != null && C792340V6i.LIZ(c0v6x.LJI)) {
            InterfaceC792300V6e interfaceC792300V6e = LJFF;
            C792340V6i.LIZIZ(c0v6x.LJI);
        } else {
            C205100qf c205100qf = LIZIZ;
            String str = c0v6x.LIZIZ;
            Set<String> set = c205100qf.LIZ;
            if (set == null || !set.contains(str)) {
                if (C792190V5t.LIZ()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("UnSampled CommonEvent:");
                    sbLIZ3.append(c0v6x);
                    C792910V8n.LIZ("APM-CommonEvent", C2188811AlT.LIZIZ(sbLIZ3));
                }
                if (!C792190V5t.LIZ()) {
                    return;
                }
                c0v6x.LIZJ();
                C793430VAn.LIZ(c0v6x.LIZ(), "service_monitor", false);
                return;
            }
        }
        c0v6x.LIZJ();
        C0VBB.LIZ(c0v6x);
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Sampled CommonEvent:");
            sbLIZ4.append(c0v6x);
            C792910V8n.LIZ("APM-CommonEvent", C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public static void LJ(C0V6R c0v6r) {
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trace_data:");
            sbLIZ.append(c0v6r.LIZ());
            C792910V8n.LIZ("APM-CommonEvent", C2188811AlT.LIZIZ(sbLIZ));
        }
        C0VBB.LIZ(c0v6r);
    }

    public static synchronized void LJI(C792340V6i c792340V6i) {
        LJFF = c792340V6i;
    }

    public static synchronized void LJII(C205100qf c205100qf) {
        if (c205100qf != null) {
            if (LIZIZ != c205100qf) {
                if (C792190V5t.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateConfig ");
                    sbLIZ.append(c205100qf);
                    C792910V8n.LIZ("APM-CommonEvent", C2188811AlT.LIZIZ(sbLIZ));
                }
                LIZIZ = c205100qf;
                while (true) {
                    C0V6Z<C0VB5> c0v6z = LIZLLL;
                    if (!c0v6z.LIZ()) {
                        C0VB5 c0vb5LIZIZ = c0v6z.LIZIZ();
                        if (c0vb5LIZIZ instanceof C0V6X) {
                            LIZJ((C0V6X) c0vb5LIZIZ);
                        } else if (c0vb5LIZIZ instanceof C0V6V) {
                            LIZIZ((C0V6V) c0vb5LIZIZ);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static boolean LJFF(Boolean bool, String str, JSONObject jSONObject) {
        if (!LIZ || LIZIZ == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (LJFF != null && C792340V6i.LIZ(jSONObject)) {
            InterfaceC792300V6e interfaceC792300V6e = LJFF;
            C792340V6i.LIZIZ(jSONObject);
            return false;
        }
        if (bool.booleanValue()) {
            Set<String> set = LIZIZ.LIZ;
            if (set != null && set.contains(str)) {
                return false;
            }
        } else if (LIZIZ.LIZ(str, jSONObject)) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        LIZJ(new C0V6X(str, i, null, jSONObject, jSONObject2, jSONObject3));
    }
}
