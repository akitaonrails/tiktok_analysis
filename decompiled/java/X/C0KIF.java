package X;

import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KIF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KIF extends C09AY implements Function1<C0KGF, C0KGF> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KIF(String str) {
        super(1);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0KGF invoke(C0KGF c0kgf) {
        List<SubscriptionProductDetailWithTemplateInfo> list;
        Map<String, List<SubscriptionProductDetailWithTemplateInfo>> map;
        C0KGF c0kgf2 = c0kgf;
        String str = this.LL;
        C514600KGc c514600KGc = c0kgf2.LLILLJJLI;
        if (c514600KGc != null && (map = c514600KGc.LIZ) != null) {
            list = map.get(str);
        } else {
            list = null;
        }
        return C0KGF.LIZ(c0kgf2, null, null, new Pair(str, list), null, null, null, null, 503);
    }
}
