package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0XOn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848030XOn extends C09AY implements Function1<Map<String, String>, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C848030XOn(String str, String str2, String str3, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, String> map) {
        Map<String, String> map2 = map;
        map2.put("enter_from", this.LL);
        map2.put("aweme_id", this.LLILLJJLI);
        map2.put("industry", this.LLILLL);
        map2.put("is_industry_supported", String.valueOf(this.LLILZ));
        return Unit.LIZ;
    }
}
