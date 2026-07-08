package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514000KDu extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0KE0 LL;
    public final /* synthetic */ PGCSubscriptionProductDetailWithTemplateInfo LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514000KDu(PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo, C0KE0 c0ke0, boolean z) {
        super(0);
        this.LL = c0ke0;
        this.LLILLJJLI = pGCSubscriptionProductDetailWithTemplateInfo;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0K0R.LIZ(this.LL.LLILZLL);
        C0K0R.LIZ(this.LL.LLILZIL);
        C0K0R.LIZ(this.LL.LLILZ);
        C0K0R.LIZ(this.LL.LLIZLLLIL);
        C0K0R.LIZJ(this.LL.LLILLL);
        TextView textView = this.LL.LLILLL;
        PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo = this.LLILLJJLI;
        textView.setText(C511960K5y.LIZ(textView, C513890KDj.LJI(pGCSubscriptionProductDetailWithTemplateInfo), C513840KDe.LJIILJJIL(pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()), this.LLILLL));
        return Unit.LIZ;
    }
}
