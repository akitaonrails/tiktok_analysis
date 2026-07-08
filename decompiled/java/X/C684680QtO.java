package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QtO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.share.SearchImageDownloader$innerDownloadImage$1$onFailed$1", f = "SearchImageDownloader.kt", l = {}, m = "invokeSuspend")
public final class C684680QtO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC684660QtM LL;
    public final /* synthetic */ Throwable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C684680QtO(InterfaceC684660QtM interfaceC684660QtM, Throwable th, InterfaceC1364105Vn<? super C684680QtO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC684660QtM;
        this.LLILLJJLI = th;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C684680QtO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchImageDownloader@68d6.innerDownloadImage$1$onFailed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC684660QtM interfaceC684660QtM = this.LL;
        if (interfaceC684660QtM != null) {
            Throwable th = this.LLILLJJLI;
            if (th != null) {
                th.getMessage();
            }
            interfaceC684660QtM.onFailure();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchImageDownloader@68d6.innerDownloadImage$1$onFailed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
