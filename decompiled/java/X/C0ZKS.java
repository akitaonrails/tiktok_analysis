package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZKS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.avatarloader.impl.adapter.DMAvatarDataLightenGetter$getBitmap$1$onCompleted$1", f = "DMAvatarDataLightenGetter.kt", l = {}, m = "invokeSuspend")
public final class C0ZKS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ UrlModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C0ZKN LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZKS(long j, UrlModel urlModel, boolean z, C0ZKN c0zkn, InterfaceC1364105Vn<? super C0ZKS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = urlModel;
        this.LLILLL = z;
        this.LLILZ = c0zkn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZKS(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("DMAvatarDataLightenGetter@9aad.getBitmap$1$onCompleted$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
        List<String> urlList = this.LLILLJJLI.getUrlList();
        if (urlList == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
            str = "";
        }
        C0ZKR.LIZIZ(jCurrentTimeMillis, str, this.LLILZ.LIZ, "private", "bitmap_get", "success", this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMAvatarDataLightenGetter@9aad.getBitmap$1$onCompleted$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
