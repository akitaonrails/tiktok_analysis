package X;

import android.os.Build;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18FF, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18FF extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18FF(String str) {
        super(0);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("activity", this.LL);
        jSONObject.put("sdk_int", Build.VERSION.SDK_INT);
        C21250518Ed.LJ.getClass();
        jSONObject.put("isBackProcess", C21250518Ed.LJIIJJI());
        jSONObject.put("numActivities", C21250518Ed.LJII);
        return jSONObject;
    }
}
