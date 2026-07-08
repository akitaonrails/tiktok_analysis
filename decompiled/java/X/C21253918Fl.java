package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Fl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21253918Fl extends C09AY implements Function0<Object> {
    public final /* synthetic */ InterfaceC21252118Et LL;
    public final /* synthetic */ PageInfo LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21253918Fl(InterfaceC21252118Et interfaceC21252118Et, PageInfo pageInfo, String str) {
        super(0);
        this.LL = interfaceC21252118Et;
        this.LLILLJJLI = pageInfo;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        InterfaceC21252118Et interfaceC21252118Et = this.LL;
        PageInfo pageInfo = this.LLILLJJLI;
        String str = this.LLILLL;
        jSONObject.put("node", interfaceC21252118Et);
        jSONObject.put("pageInfo", pageInfo);
        jSONObject.put("page", str);
        return jSONObject;
    }
}
