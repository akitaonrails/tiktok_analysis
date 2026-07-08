package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.051Z, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C051Z extends C09AY implements Function2<JSONObject, String, Object> {
    public static final /* synthetic */ int LL = 0;

    static {
        new C051Z();
    }

    public C051Z() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(JSONObject jSONObject, String str) {
        Object objLIZJ = C12868051u.LIZJ(jSONObject, str);
        if (objLIZJ instanceof Float) {
            return Integer.valueOf((int) ((Number) objLIZJ).floatValue());
        }
        return objLIZJ;
    }
}
