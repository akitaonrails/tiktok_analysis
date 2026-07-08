package X;

import com.ss.android.ugc.aweme.ecommerce.common.model.ProductAddToShowcaseResponse;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.EcProductAddButtonViewModel;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model.FypCtaButton;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS112S1000000_28;
import kotlin.jvm.internal.AwS64S1300000_28;

/* JADX INFO: renamed from: X.0zL3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892150zL3 extends C09AY implements Function1<ProductAddToShowcaseResponse, Unit> {
    public final /* synthetic */ C197039127h LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ EcProductAddButtonViewModel LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ FypCtaButton LLIZLLLIL;
    public final /* synthetic */ FypCtaButton LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1892150zL3(C197039127h c197039127h, String str, Long l, EcProductAddButtonViewModel ecProductAddButtonViewModel, String str2, String str3, int i, FypCtaButton fypCtaButton, FypCtaButton fypCtaButton2) {
        super(1);
        this.LL = c197039127h;
        this.LLILLJJLI = str;
        this.LLILLL = l;
        this.LLILZ = ecProductAddButtonViewModel;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = i;
        this.LLIZLLLIL = fypCtaButton;
        this.LLJ = fypCtaButton2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ProductAddToShowcaseResponse productAddToShowcaseResponse) {
        C1592306Lh.LIZ(C1592306Lh.LIZ, this.LL, new AwS112S1000000_28(this.LLILZIL, 12));
        int i = this.LLIZ;
        C197039127h c197039127h = this.LL;
        FypCtaButton fypCtaButton = this.LLIZLLLIL;
        FypCtaButton fypCtaButton2 = this.LLJ;
        EcProductAddButtonViewModel ecProductAddButtonViewModel = this.LLILZ;
        C1892160zL4.LIZ(i, c197039127h, fypCtaButton, fypCtaButton2, ecProductAddButtonViewModel, this.LLILZIL, new AwS64S1300000_28(c197039127h, ecProductAddButtonViewModel, this.LLILLL, this.LLILZLL, 0));
        ConcurrentHashMap<String, Object> concurrentHashMap = C1892170zL5.LIZ;
        C1892170zL5.LIZ(true, this.LLILLJJLI, this.LLILLL, this.LLILZ.LLJ);
        return Unit.LIZ;
    }
}
