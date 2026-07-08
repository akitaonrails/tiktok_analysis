package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Eb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21250318Eb extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ BufferBtm LL;
    public final /* synthetic */ C259800zU<BufferBtm> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21250318Eb(BufferBtm bufferBtm, C259800zU<BufferBtm> c259800zU) {
        super(1);
        this.LL = bufferBtm;
        this.LLILLJJLI = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("type", 1);
        Regex regex = C18C3.LIZ;
        jSONObject2.put("page_buffer_btm", C18C3.LJII(this.LL.getBtm()));
        jSONObject2.put("buffer_btm", C18C3.LJII(this.LLILLJJLI.element.getBtm()));
        return Unit.LIZ;
    }
}
