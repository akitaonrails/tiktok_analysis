package X;

import com.ss.android.ugc.aweme.ecommerce.core.router.EcomGeckoUpdateInterceptor;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0q6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537290q6h extends C09AY implements InterfaceC1631630sYr<String, String, Boolean, String, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537290q6h(String str, String str2, String str3) {
        super(4);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, String str2, Boolean bool, String str3) {
        boolean zBooleanValue = bool.booleanValue();
        EcomGeckoUpdateInterceptor ecomGeckoUpdateInterceptor = EcomGeckoUpdateInterceptor.LL;
        String str4 = this.LL;
        String str5 = this.LLILLJJLI;
        String str6 = this.LLILLL;
        ecomGeckoUpdateInterceptor.getClass();
        C1326370kcV.LIZ(new C1537360q6o(str4, str, str5, str6, zBooleanValue, str2, str3));
        return Unit.LIZ;
    }
}
