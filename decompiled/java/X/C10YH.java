package X;

import android.net.Uri;
import com.tiktok.kmp.deeplink.IKMPDeeplinkService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10YH, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.deeplink.converter.ShortLinkHandlerV2$requestS2LForKMP$1$1", f = "ShortLinkHandlerV2.kt", l = {}, m = "invokeSuspend")
public final class C10YH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C10Y8 LL;
    public final /* synthetic */ Uri LLILLJJLI;
    public final /* synthetic */ C19266910Zf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10YH(C10Y8 c10y8, Uri uri, C19266910Zf c19266910Zf, InterfaceC1364105Vn<? super C10YH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c10y8;
        this.LLILLJJLI = uri;
        this.LLILLL = c19266910Zf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10YH(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShortLinkHandlerV2@8389.requestS2LForKMP$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZLLL(this.LLILLJJLI, this.LLILLL.LIZIZ);
        C10YA c10ya = C10YA.LIZ;
        C19266910Zf c19266910Zf = this.LLILLL;
        c10ya.getClass();
        IKMPDeeplinkService iKMPDeeplinkServiceLIZ = C10YA.LIZ();
        if (iKMPDeeplinkServiceLIZ != null) {
            iKMPDeeplinkServiceLIZ.LIZ(c19266910Zf);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShortLinkHandlerV2@8389.requestS2LForKMP$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
