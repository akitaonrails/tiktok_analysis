package X;

import com.ss.android.common.lib.AppLogNewUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01V3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01V3 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ JSONObject LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01V3(JSONObject jSONObject) {
        super(0);
        this.LL = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AppLogNewUtils.onEventV3("search_view_cache_monitor", this.LL);
        return Unit.LIZ;
    }
}
