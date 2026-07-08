package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YXR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YXR extends C09AY implements Function1<Map<String, Object>, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YXR(String str, List<String> list, String str2, String str3, String str4) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, Object> map) {
        Map<String, Object> map2 = map;
        map2.put("api_url", this.LL);
        map2.put("frontierUrls", this.LLILLJJLI);
        map2.put("idc_region", this.LLILLL);
        map2.put("shop_region", this.LLILZ);
        map2.put("pigeon_cid", this.LLILZIL);
        return Unit.LIZ;
    }
}
