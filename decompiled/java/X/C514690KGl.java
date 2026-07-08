package X;

import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KGl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514690KGl extends C09AY implements Function1<Pair<? extends String, ? extends List<SubscriptionProductDetailWithTemplateInfo>>, Unit> {
    public final /* synthetic */ C514670KGj LL;
    public final /* synthetic */ C513700KCq LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514690KGl(C514670KGj c514670KGj, C513700KCq c513700KCq) {
        super(1);
        this.LL = c514670KGj;
        this.LLILLJJLI = c513700KCq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> pair) {
        List<SubscriptionProductDetailWithTemplateInfo> second;
        boolean z;
        C0KCF c0kcf;
        Pair<? extends String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> pair2 = pair;
        if (pair2 != null && (second = pair2.getSecond()) != null) {
            C514670KGj c514670KGj = this.LL;
            C513700KCq c513700KCq = this.LLILLJJLI;
            C514660KGi c514660KGi = c514670KGj.LLILLJJLI;
            if (c513700KCq != null && (c0kcf = c513700KCq.LL) != null && Intrinsics.LJFF(c0kcf.LIZJ, "sub_change_price_email")) {
                z = true;
            } else {
                z = false;
            }
            c514660KGi.LLILZ = second;
            c514660KGi.LL = z;
            c514660KGi.LLILLJJLI = true;
            c514660KGi.notifyDataSetChanged();
        }
        return Unit.LIZ;
    }
}
