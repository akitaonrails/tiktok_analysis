package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.020D, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020D extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C020D c020d, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("enter_from", c020d.s0);
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c020d.z1 ? 1 : 0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(C020D c020d, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("enter_from", c020d.s0);
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c020d.z1 ? 1 : 0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(C020D c020d, Object obj) {
        Map map = (Map) obj;
        map.put("success", String.valueOf(c020d.z1));
        map.put("source_type", c020d.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020D(String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020D(boolean z, String str, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.s0 = str;
    }
}
