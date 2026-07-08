package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Eg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21250818Eg extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ BufferBtm LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21250818Eg(BufferBtm bufferBtm) {
        super(1);
        this.LL = bufferBtm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("type", 0);
        Regex regex = C18C3.LIZ;
        jSONObject2.put("buffer_btm", C18C3.LJII(this.LL.getBtm()));
        return Unit.LIZ;
    }
}
