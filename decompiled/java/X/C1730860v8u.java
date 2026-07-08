package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0v8u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1730860v8u extends C09AY implements Function1<C1730830v8r, C1730830v8r> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1730860v8u(int i, String str, String str2, String str3) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1730830v8r invoke(C1730830v8r c1730830v8r) {
        C1730830v8r c1730830v8r2 = c1730830v8r;
        TemplateFieldProduct templateFieldProduct = new TemplateFieldProduct(this.LLILLJJLI, String.valueOf(this.LL), this.LLILLL, null, this.LLILZ);
        String str = c1730830v8r2.LLILLJJLI;
        c1730830v8r2.getClass();
        return new C1730830v8r(templateFieldProduct, str);
    }
}
