package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18CO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18CO extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ BufferBtm LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18CO(BufferBtm bufferBtm) {
        super(1);
        this.LL = bufferBtm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        Regex regex = C18C3.LIZ;
        jSONObject.put("btm", C18C3.LJI(this.LL.getBtm()));
        return Unit.LIZ;
    }
}
