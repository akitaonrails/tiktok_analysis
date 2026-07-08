package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZKK, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.avatarloader.impl.adapter.DMAvatarLoaderLightenImpl$loadUserAvatarInner$lightenListener$1$onFailed$1", f = "DMAvatarLoaderLightenImpl.kt", l = {}, m = "invokeSuspend")
public final class C0ZKK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ UrlModel LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C0ZKG LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZKK(UrlModel urlModel, long j, boolean z, C0ZKG c0zkg, InterfaceC1364105Vn<? super C0ZKK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = urlModel;
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = c0zkg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZKK(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        List<String> urlList;
        C1C7U.LIZ("DMAvatarLoaderLightenImpl@cff3.loadUserAvatarInner$lightenListener$1$onFailed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        UrlModel urlModel = this.LL;
        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
            str = "";
        }
        C0ZKR.LIZIZ(this.LLILLJJLI, str, this.LLILZ.LIZ, "private", "lighten_load", "failed", this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMAvatarLoaderLightenImpl@cff3.loadUserAvatarInner$lightenListener$1$onFailed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
