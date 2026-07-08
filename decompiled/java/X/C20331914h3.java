package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14h3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20331914h3 extends C09AY implements Function0<Object> {
    public final /* synthetic */ PageInfo LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ EnumC21250718Ef LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20331914h3(PageInfo pageInfo, boolean z, EnumC21250718Ef enumC21250718Ef, String str) {
        super(0);
        this.LL = pageInfo;
        this.LLILLJJLI = z;
        this.LLILLL = enumC21250718Ef;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        C18DA c18da = C18DA.LIZ;
        PageInfo pageInfo = this.LL;
        JSONObject jSONObject = new JSONObject();
        boolean z = this.LLILLJJLI;
        EnumC21250718Ef enumC21250718Ef = this.LLILLL;
        String str = this.LLILZ;
        jSONObject.put("isBack", z);
        jSONObject.put("resumeFuncOrigin", enumC21250718Ef);
        jSONObject.put("resumedPageId", str);
        return C18DA.LIZJ(c18da, pageInfo, jSONObject);
    }
}
