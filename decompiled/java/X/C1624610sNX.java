package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sNX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624610sNX {
    public static final C1624610sNX LIZ = new C1624610sNX();
    public static List<String> LIZIZ = new ArrayList();
    public static boolean LIZJ = true;
    public static boolean LIZLLL = true;

    public static final boolean LIZIZ(Effect effect) {
        String sdkExtra;
        if (effect != null && (sdkExtra = effect.getSdkExtra()) != null && a0.LJJIIZI(sdkExtra, "pl", false) && a0.LJJIIZI(sdkExtra, "alg", false)) {
            try {
                C1446130njf.LIZ.getClass();
                JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
                if (jSONObjectLJIIIZ == null) {
                    return false;
                }
                if (!jSONObjectLJIIIZ.has("pl")) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1624230sMv LIZ(com.ss.android.ugc.effectmanager.effect.model.Effect r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1624610sNX.LIZ(com.ss.android.ugc.effectmanager.effect.model.Effect, boolean):X.0sMv");
    }
}
