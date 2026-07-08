package X;

import com.ss.android.ugc.aweme.amazon.model.AmazonTokenGenerateResponse;
import com.ss.android.ugc.aweme.amazon.model.AmazonTokenInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.amazon.AmazonLoginHandler$refreshToken$1$1", f = "AmazonLoginHandler.kt", l = {}, m = "invokeSuspend")
public final class C315290CXn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0DHD LL;
    public final /* synthetic */ AmazonTokenGenerateResponse LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315290CXn(C0DHD c0dhd, AmazonTokenGenerateResponse amazonTokenGenerateResponse, String str, InterfaceC1364105Vn<? super C315290CXn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0dhd;
        this.LLILLJJLI = amazonTokenGenerateResponse;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315290CXn(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        AmazonTokenInfo amazonTokenInfo;
        C1C7U.LIZ("AmazonLoginHandler@ccef.refreshToken$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0DHD c0dhd = this.LL;
        AmazonTokenGenerateResponse amazonTokenGenerateResponse = this.LLILLJJLI;
        c0dhd.getClass();
        if (C0DHD.LIZIZ(amazonTokenGenerateResponse)) {
            Function2<String, String, Unit> function2 = this.LL.LIZIZ;
            AmazonTokenGenerateResponse amazonTokenGenerateResponse2 = this.LLILLJJLI;
            if (amazonTokenGenerateResponse2 != null && (amazonTokenInfo = amazonTokenGenerateResponse2.amazonTokenInfo) != null) {
                str = amazonTokenInfo.accessToken;
            } else {
                str = null;
            }
            function2.invoke(str, this.LLILLL);
        } else {
            this.LL.LIZJ.invoke(this.LLILLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AmazonLoginHandler@ccef.refreshToken$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
