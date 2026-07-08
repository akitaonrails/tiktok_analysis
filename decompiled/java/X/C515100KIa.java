package X;

import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515100KIa extends C09AY implements Function2<C514600KGc, Pair<? extends String, ? extends List<SubscriptionProductDetailWithTemplateInfo>>, Unit> {
    public final /* synthetic */ Function2<C514600KGc, Pair<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>>, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C515100KIa(C0KBL c0kbl) {
        super(2);
        this.LL = c0kbl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C514600KGc c514600KGc, Pair<? extends String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> pair) {
        this.LL.invoke(c514600KGc, pair);
        return Unit.LIZ;
    }
}
