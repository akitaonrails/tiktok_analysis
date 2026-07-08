package X;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07Rv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1864107Rv extends C09AY implements Function1<String, String> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ JSONObject LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864107Rv(JSONObject jSONObject, Map map) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String str) {
        String str2;
        String str3 = str;
        Map<String, String> map = this.LL;
        if (map == null || (str2 = map.get(str3)) == null) {
            JSONObject jSONObject = this.LLILLJJLI;
            if (jSONObject != null) {
                return jSONObject.optString(str3);
            }
            return null;
        }
        return str2;
    }
}
