package X;

import com.bytedance.android.btm.api.PageProp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18F3, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18F3 extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ PageProp LL;
    public final /* synthetic */ Exception LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18F3(PageProp pageProp, Exception exc) {
        super(1);
        this.LL = pageProp;
        this.LLILLJJLI = exc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        String btm;
        JSONObject jSONObject2 = jSONObject;
        PageProp pageProp = this.LL;
        if (pageProp != null) {
            btm = pageProp.getBtm();
        } else {
            btm = null;
        }
        jSONObject2.put("btm", btm);
        jSONObject2.put("fun", "buildPageTree");
        jSONObject2.put("err", this.LLILLJJLI.toString());
        return Unit.LIZ;
    }
}
