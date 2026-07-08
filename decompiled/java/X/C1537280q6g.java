package X;

import com.ss.android.ugc.aweme.ecommerce.core.router.EcomGeckoUpdateInterceptor;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0q6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537280q6g extends C09AY implements InterfaceC1631630sYr<String, String, Boolean, String, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1537330q6l LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537280q6g(String str, C1537330q6l c1537330q6l) {
        super(4);
        this.LL = str;
        this.LLILLJJLI = c1537330q6l;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, String str2, Boolean bool, String str3) {
        boolean zBooleanValue = bool.booleanValue();
        EcomGeckoUpdateInterceptor ecomGeckoUpdateInterceptor = EcomGeckoUpdateInterceptor.LL;
        String str4 = this.LL;
        C1537330q6l c1537330q6l = this.LLILLJJLI;
        String str5 = c1537330q6l.LIZ;
        String str6 = c1537330q6l.LIZIZ;
        ecomGeckoUpdateInterceptor.getClass();
        C1326370kcV.LIZ(new C1537360q6o(str4, str, str5, str6, zBooleanValue, str2, str3));
        return Unit.LIZ;
    }
}
