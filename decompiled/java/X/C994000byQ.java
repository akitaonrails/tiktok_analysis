package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0byQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C994000byQ {
    public static final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ);

    public static final int LIZ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            return -1;
        }
        C994010byR c994010byR = C994010byR.LIZ;
        if (((Integer) C293120BeI.LIZ("tt_story_fyp_skylight", new C989890brn())).intValue() != 0) {
            if (C994010byR.LIZIZ()) {
                return 1;
            }
            if (!c994010byR.LIZ()) {
                return 2;
            }
            return -1;
        }
        return 0;
    }

    public static final void LIZIZ(String str, Function1<? super JSONObject, Unit> function1) {
        try {
            C189200o6.m2constructorimpl(C23250099c.LIZLLL(LIZ, null, null, new C353001Yq(str, function1, null), 3));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
