package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20336714hp {
    public static final C20336714hp LIZ = new C20336714hp();
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"outreach_key", "outreach_type", "outreach_intention", "outreach_content", "outreach_landingpage_name", "outreach_extra_info"});

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de A[PHI: r1
      0x00de: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v7 java.lang.String) binds: [B:47:0x00db, B:25:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(org.json.JSONObject r7) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20336714hp.LIZJ(org.json.JSONObject):void");
    }

    public static void LIZLLL(int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject2.put(next, jSONObject.opt(next));
        }
        if (i > 0) {
            jSONObject2.put("outreach_clear_type", i);
        }
        C20684815ws.LJIJ("outreach_on_clear_storage", jSONObject2);
    }

    public static void LIZ(String str, Integer num, InterfaceC2214731BmB interfaceC2214731BmB) throws JSONException {
        Object c098200Yq;
        String mob = interfaceC2214731BmB.getMob();
        if (mob != null && mob.length() != 0) {
            try {
                String mob2 = interfaceC2214731BmB.getMob();
                if (mob2 == null) {
                    mob2 = "";
                }
                c098200Yq = new JSONObject(mob2);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = new JSONObject();
            }
            JSONObject jSONObject = (JSONObject) c098200Yq;
            C20336114hj.LIZ.getClass();
            C20336114hj.LIZJ(str, jSONObject);
            if (num != null) {
                jSONObject.put("outreach_clear_type", num.intValue());
            }
            LIZJ(jSONObject);
        }
    }

    public static void LIZIZ(C20336714hp c20336714hp, String str, JSONObject jSONObject) throws JSONException {
        c20336714hp.getClass();
        C20336114hj.LIZ.getClass();
        C20336114hj.LIZJ(str, jSONObject);
        LIZJ(jSONObject);
    }
}
