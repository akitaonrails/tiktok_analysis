package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14hJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20333514hJ extends C09AY implements Function0<Object> {
    public final /* synthetic */ EnumC21250718Ef LL;
    public final /* synthetic */ PageInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20333514hJ(EnumC21250718Ef enumC21250718Ef, PageInfo pageInfo) {
        super(0);
        this.LL = enumC21250718Ef;
        this.LLILLJJLI = pageInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        EnumC21250718Ef enumC21250718Ef = this.LL;
        PageInfo pageInfo = this.LLILLJJLI;
        jSONObject.putOpt("resume_func_origin", enumC21250718Ef);
        jSONObject.putOpt("page_info", pageInfo.toString());
        return jSONObject;
    }
}
