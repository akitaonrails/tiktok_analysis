package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DQQ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DQQ {
    public static final Pair<Integer, Integer>[] LJ;
    public final boolean LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    static {
        Integer numValueOf = Integer.valueOf(C538540LAe.LLJJJIL);
        LJ = new Pair[]{new Pair<>(40001, 40009), new Pair<>(50000, 50003), new Pair<>(numValueOf, numValueOf)};
    }

    public C0DQQ(Throwable th, String str) {
        C443120HZe c443120HZe;
        C1494460ozc c1494460ozc;
        boolean z = th instanceof C1494690ozz;
        String str2 = null;
        if (z && ((C1494690ozz) th).getStatusCode() == 403) {
            Throwable cause = th.getCause();
            if ((cause instanceof C1494430ozZ) && ((C1494430ozZ) cause).getErrorResponse() != null) {
                try {
                    JSONObject jSONObject = new JSONObject(((C1494430ozZ) cause).getErrorResponse());
                    int iOptInt = jSONObject.optInt("code");
                    for (Pair<Integer, Integer> pair : LJ) {
                        if (iOptInt >= pair.getFirst().intValue() && iOptInt <= pair.getSecond().intValue()) {
                            c443120HZe = new C443120HZe(Boolean.TRUE, Integer.valueOf(iOptInt), jSONObject);
                            break;
                        }
                    }
                    c443120HZe = new C443120HZe(Boolean.FALSE, -1, null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c443120HZe = new C443120HZe(Boolean.FALSE, -1, null);
                }
            } else {
                c443120HZe = new C443120HZe(Boolean.FALSE, -1, null);
            }
        } else {
            c443120HZe = new C443120HZe(Boolean.FALSE, -1, null);
        }
        boolean zBooleanValue = ((Boolean) c443120HZe.getFirst()).booleanValue();
        this.LIZ = zBooleanValue;
        this.LIZIZ = ((Number) c443120HZe.getSecond()).intValue();
        c443120HZe.getThird();
        if (zBooleanValue && z && (c1494460ozc = (C1494460ozc) th) != null) {
            str2 = c1494460ozc.url;
        }
        this.LIZJ = str2;
        this.LIZLLL = th.getMessage();
    }
}
