package X;

import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514650KGh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C514790KGv LL;
    public final /* synthetic */ C0KGN LLILLJJLI;
    public final /* synthetic */ C514790KGv LLILLL;
    public final /* synthetic */ SubscriptionProductDetailWithTemplateInfo LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514650KGh(C514790KGv c514790KGv, C0KGN c0kgn, C514790KGv c514790KGv2, SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo, boolean z) {
        super(0);
        this.LL = c514790KGv;
        this.LLILLJJLI = c0kgn;
        this.LLILLL = c514790KGv2;
        this.LLILZ = subscriptionProductDetailWithTemplateInfo;
        this.LLILZIL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C500260Jjc.LLFFF(this.LL.LLILZLL);
        C514790KGv c514790KGv = this.LL;
        c514790KGv.LLILZLL.setText(c514790KGv.LLILZIL.getText());
        C500260Jjc.LJIILLIIL(this.LL.LLILZIL);
        C0KGN c0kgn = this.LLILLJJLI;
        C514790KGv c514790KGv2 = this.LLILLL;
        SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo = this.LLILZ;
        c0kgn.getClass();
        C0KGN.LLLI(c514790KGv2, subscriptionProductDetailWithTemplateInfo);
        C16F5 c16f5 = this.LLILLL.LLILLL;
        SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo2 = this.LLILZ;
        c16f5.setText(C0KBO.LIZ(c16f5, C513940KDo.LJFF(subscriptionProductDetailWithTemplateInfo2, true), false, this.LLILZIL));
        return Unit.LIZ;
    }
}
