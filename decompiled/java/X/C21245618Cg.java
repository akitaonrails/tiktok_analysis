package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Cg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21245618Cg extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ PageInfo LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ BufferBtm LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21245618Cg(String str, PageInfo pageInfo, String str2, String str3, BufferBtm bufferBtm) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = pageInfo;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = bufferBtm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        PageInfo pageInfo = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        BufferBtm bufferBtm = this.LLILZIL;
        jSONObject.put("btm", str);
        jSONObject.put("pageInfo", pageInfo);
        jSONObject.put("nodeId", str2);
        jSONObject.put("treeId", str3);
        jSONObject.put("bufferBtm", bufferBtm.toString());
        return jSONObject;
    }
}
