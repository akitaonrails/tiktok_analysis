package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0gT6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166780gT6 extends C09AY implements Function2<EnumC1153320g7O, JSONObject, Unit> {
    public final /* synthetic */ Function2<String, JSONObject, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1166780gT6(Function2<? super String, ? super JSONObject, Unit> function2) {
        super(2);
        this.LL = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(EnumC1153320g7O enumC1153320g7O, JSONObject jSONObject) {
        Function2<String, JSONObject, Unit> function2 = this.LL;
        if (function2 != null) {
            function2.invoke("cai_ttm_center_info", jSONObject);
        }
        return Unit.LIZ;
    }
}
