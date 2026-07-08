package X;

import com.bytedance.android.btm.impl.BtmServiceImpl;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18D7, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18D7 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ JSONObject LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18D7(String str, JSONObject jSONObject, String str2, int i) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
        this.LLILZ = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("btm", this.LL);
        linkedHashMap.put("error_code", Integer.valueOf(this.LLILLJJLI));
        linkedHashMap.put("tips", this.LLILLL);
        linkedHashMap.put("extend_info", this.LLILZ);
        BtmServiceImpl.INSTANCE.getAppLogExp().onEventV3(new C1523880pl4("btm_quality", new JSONObject(linkedHashMap)));
        return Unit.LIZ;
    }
}
