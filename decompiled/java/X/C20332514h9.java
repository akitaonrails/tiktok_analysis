package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14h9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20332514h9 extends C09AY implements Function0<Object> {
    public final /* synthetic */ PageInfo LL;
    public final /* synthetic */ EnumC21250718Ef LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20332514h9(EnumC21250718Ef enumC21250718Ef, PageInfo pageInfo) {
        super(0);
        this.LL = pageInfo;
        this.LLILLJJLI = enumC21250718Ef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        PageInfo pageInfo = this.LL;
        EnumC21250718Ef enumC21250718Ef = this.LLILLJJLI;
        jSONObject.put("pageInfo", pageInfo.toString());
        jSONObject.put("resumeFuncOrigin", enumC21250718Ef);
        return jSONObject;
    }
}
