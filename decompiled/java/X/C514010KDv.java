package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514010KDv extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0KE0 LL;
    public final /* synthetic */ C513830KDd LLILLJJLI;
    public final /* synthetic */ C0KE0 LLILLL;
    public final /* synthetic */ PGCSubscriptionProductDetailWithTemplateInfo LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514010KDv(C0KE0 c0ke0, C513830KDd c513830KDd, C0KE0 c0ke02, PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo, boolean z) {
        super(0);
        this.LL = c0ke0;
        this.LLILLJJLI = c513830KDd;
        this.LLILLL = c0ke02;
        this.LLILZ = pGCSubscriptionProductDetailWithTemplateInfo;
        this.LLILZIL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0K0R.LIZJ(this.LL.LLILZLL);
        C0KE0 c0ke0 = this.LL;
        c0ke0.LLILZLL.setText(c0ke0.LLILZIL.getText());
        TextView textView = this.LL.LLILZIL;
        if (textView != null) {
            C786410Ut5.LJLLLLLL(4, textView);
        }
        C513830KDd c513830KDd = this.LLILLJJLI;
        C0KE0 c0ke02 = this.LLILLL;
        PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo = this.LLILZ;
        c513830KDd.getClass();
        C513830KDd.LLLI(c0ke02, pGCSubscriptionProductDetailWithTemplateInfo);
        TextView textView2 = this.LLILLL.LLILLL;
        PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo2 = this.LLILZ;
        textView2.setText(C511960K5y.LIZ(textView2, C513840KDe.LJFF(pGCSubscriptionProductDetailWithTemplateInfo2, true), false, this.LLILZIL));
        return Unit.LIZ;
    }
}
