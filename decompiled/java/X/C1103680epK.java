package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0epK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103680epK extends C09AY implements Function0<JSONObject> {
    public C1103680epK() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final JSONObject invoke() {
        String stringJustDisk = ((Keva) C1103670epJ.LIZ.getValue()).getStringJustDisk("profile_usage", null);
        if (stringJustDisk != null) {
            try {
                return new JSONObject(stringJustDisk);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                ((Keva) C1103670epJ.LIZ.getValue()).erase("profile_usage");
            }
        }
        return null;
    }
}
