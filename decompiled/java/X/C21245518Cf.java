package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Cf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21245518Cf extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C18EK LLILLJJLI;
    public final /* synthetic */ PageInfo LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ BufferBtm LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21245518Cf(String str, C18EK c18ek, PageInfo pageInfo, String str2, String str3, BufferBtm bufferBtm) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c18ek;
        this.LLILLL = pageInfo;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = bufferBtm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        C18EK c18ek = this.LLILLJJLI;
        PageInfo pageInfo = this.LLILLL;
        String str2 = this.LLILZ;
        String str3 = this.LLILZIL;
        BufferBtm bufferBtm = this.LLILZLL;
        jSONObject.put("btm", str);
        jSONObject.put("useTimes", c18ek.LIZJ);
        jSONObject.put("targetPages", c18ek.LIZLLL);
        jSONObject.put("pageInfo", pageInfo);
        jSONObject.put("nodeId", str2);
        jSONObject.put("treeId", str3);
        jSONObject.put("bufferBtm", bufferBtm.toString());
        return jSONObject;
    }
}
