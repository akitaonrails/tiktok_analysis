package X;

import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514630KGf extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C514790KGv LL;
    public final /* synthetic */ SubscriptionProductDetailWithTemplateInfo LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514630KGf(C514790KGv c514790KGv, SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo, boolean z) {
        super(0);
        this.LL = c514790KGv;
        this.LLILLJJLI = subscriptionProductDetailWithTemplateInfo;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C500260Jjc.LJIILIIL(this.LL.LLILZLL);
        C500260Jjc.LJIILIIL(this.LL.LLILZIL);
        C500260Jjc.LJIILIIL(this.LL.LLILZ);
        C500260Jjc.LJIILIIL(this.LL.LLIZLLLIL);
        C500260Jjc.LLFFF(this.LL.LLILLL);
        C16F5 c16f5 = this.LL.LLILLL;
        SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo = this.LLILLJJLI;
        c16f5.setText(C0KBO.LIZ(c16f5, C513900KDk.LJI(subscriptionProductDetailWithTemplateInfo), C513940KDo.LJIILJJIL(subscriptionProductDetailWithTemplateInfo.getTemplateInfo()), this.LLILLL));
        return Unit.LIZ;
    }
}
