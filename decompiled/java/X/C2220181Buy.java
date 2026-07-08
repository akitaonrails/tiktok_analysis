package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Buy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2220181Buy {
    public static final C2220181Buy LIZJ;
    public static final C2220181Buy LIZLLL;
    public static final C2220181Buy LJ;
    public static final C2220181Buy LJFF;
    public final C1525410pnX LIZ;
    public int LIZIZ;

    static {
        EnumC2192931As7 enumC2192931As7 = EnumC2192931As7.INVALID_API;
        LIZJ = new C2220181Buy(new C1525410pnX(false, null, new C1525420pnY(enumC2192931As7.getCode(), enumC2192931As7.getMsg()), null), 1);
        EnumC2192931As7 enumC2192931As72 = EnumC2192931As7.INVALID_PARAMS;
        LIZLLL = new C2220181Buy(new C1525410pnX(false, null, new C1525420pnY(enumC2192931As72.getCode(), enumC2192931As72.getMsg()), null), 1);
        EnumC2192931As7 enumC2192931As73 = EnumC2192931As7.NONE;
        LJ = new C2220181Buy(new C1525410pnX(true, null, new C1525420pnY(enumC2192931As73.getCode(), enumC2192931As73.getMsg()), null), 0);
        EnumC2192931As7 enumC2192931As74 = EnumC2192931As7.SYSTEM_CRASH;
        LJFF = new C2220181Buy(new C1525410pnX(false, null, new C1525420pnY(enumC2192931As74.getCode(), enumC2192931As74.getMsg()), null), 1);
    }

    public final JSONObject LIZ() {
        if (this.LIZ.LIZ) {
            this.LIZIZ = 1;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", this.LIZIZ);
            jSONObject.put("result", this.LIZ.LIZ());
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            return jSONObject;
        }
    }

    public C2220181Buy(C1525410pnX c1525410pnX, int i) {
        this.LIZ = c1525410pnX;
        this.LIZIZ = i;
    }
}
