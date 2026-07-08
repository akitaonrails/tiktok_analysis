package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1A2z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2173111A2z extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2173111A2z(int i, boolean z, String str) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        String str;
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("album_authorized", this.LL);
        jSONObject2.put("camera_authorized", this.LLILLJJLI ? 1 : 0);
        jSONObject2.put("album_authorized_type", this.LLILLL);
        if (this.LLILLJJLI) {
            str = "allow access";
        } else {
            str = "not allow";
        }
        jSONObject2.put("camera_authorized_type", str);
        return Unit.LIZ;
    }
}
