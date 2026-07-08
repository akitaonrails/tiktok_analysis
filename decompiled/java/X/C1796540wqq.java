package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1796540wqq implements InterfaceC1151200g3y {
    public static final C1796540wqq LIZ = new C1796540wqq();

    @Override // X.InterfaceC1151200g3y
    public final boolean LIZIZ(long j, long j2) {
        boolean z = true;
        if (!C1797030wrd.LJI ? j == j2 : C1797030wrd.LJIIJJI == j2) {
            z = false;
        }
        C1797030wrd.LJI = false;
        C1797030wrd.LJIIJJI = 0L;
        return z;
    }

    public static void LIZJ(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject jSONObject4 = new JSONObject();
        try {
            if (jSONObject.has("product")) {
                jSONObject4.put("product", jSONObject.remove("product"));
            }
            C1807660x8m.LIZ(str2, str, jSONObject, jSONObject2, jSONObject3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        try {
            Iterator<String> itKeys = jSONObject4.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObject4.opt(next));
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1AF0.LJ(th2);
        }
    }

    @Override // X.InterfaceC1151200g3y
    public final void LIZ(EnumC1796260wqO enumC1796260wqO, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str2) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        int i = C1796270wqP.LIZ[enumC1796260wqO.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LIZJ(str2, str, jSONObject, jSONObject2, jSONObject3);
                    if (jSONObject4 != null) {
                        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
                        c474500IjALIZ.LJJIIJZLJL(jSONObject4);
                        c474500IjALIZ.LIZ();
                        return;
                    } else {
                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ(str);
                        c474500IjALIZ2.LJJIIJZLJL(jSONObject);
                        c474500IjALIZ2.LJJIIJZLJL(jSONObject2);
                        c474500IjALIZ2.LJJIIJZLJL(jSONObject3);
                        c474500IjALIZ2.LIZ();
                        return;
                    }
                }
                throw new C1954807lC();
            }
            if (jSONObject4 != null) {
                C474500IjA c474500IjALIZ3 = C0IJT.LIZ(str);
                c474500IjALIZ3.LJJIIJZLJL(jSONObject4);
                c474500IjALIZ3.LIZ();
                return;
            } else {
                C474500IjA c474500IjALIZ4 = C0IJT.LIZ(str);
                c474500IjALIZ4.LJJIIJZLJL(jSONObject);
                c474500IjALIZ4.LJJIIJZLJL(jSONObject2);
                c474500IjALIZ4.LJJIIJZLJL(jSONObject3);
                c474500IjALIZ4.LIZ();
                return;
            }
        }
        LIZJ(str2, str, jSONObject, jSONObject2, jSONObject3);
    }
}
