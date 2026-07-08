package X;

import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515730KKl extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0KJX LL;
    public final /* synthetic */ HashMap<String, List<SubscriptionProductDetailWithTemplateInfo>> LLILLJJLI;
    public final /* synthetic */ C515710KKj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C515730KKl(C0KJX c0kjx, HashMap<String, List<SubscriptionProductDetailWithTemplateInfo>> map, C515710KKj c515710KKj) {
        super(0);
        this.LL = c0kjx;
        this.LLILLJJLI = map;
        this.LLILLL = c515710KKj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJIIJ.LJ(this.LLILLJJLI, this.LLILLL.LIZ);
        return Unit.LIZ;
    }
}
