package X;

import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515130KId extends C09AY implements Function1<Pair<? extends String, ? extends List<SubscriptionProductDetailWithTemplateInfo>>, Unit> {
    public final /* synthetic */ Function1<Pair<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>>, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C515130KId(C514690KGl c514690KGl) {
        super(1);
        this.LL = c514690KGl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> pair) {
        this.LL.invoke(pair);
        return Unit.LIZ;
    }
}
