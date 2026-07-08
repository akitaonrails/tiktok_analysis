package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.020P, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020P extends C09AY implements Function0 {
    public final int $t;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C020P c020p) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("skip selectPaymentMethodByElevator because ccdc_all/cci_all select style is disabled, ");
        sbLIZ.append(c020p.s0);
        sbLIZ.append(", ");
        sbLIZ.append(c020p.s1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(C020P c020p) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("not select a valid pm for elevator, ");
        sbLIZ.append(c020p.s0);
        sbLIZ.append(", ");
        sbLIZ.append(c020p.s1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(C020P c020p) {
        JSONObject jSONObject = new JSONObject();
        String str = c020p.s0;
        String str2 = c020p.s1;
        try {
            jSONObject.put("type", str);
            jSONObject.put("message", str2);
            C20684815ws.LJIJ("following_feed_cache_error", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C020P c020p) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("real action invoke dispatched preloadName=");
        sbLIZ.append(c020p.s0);
        sbLIZ.append(", scene=");
        sbLIZ.append(c020p.s1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020P(String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
