package X;

import com.bytedance.forest.model.RequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01bl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.resource.DMGeckoCommonChannelManager$fetchFortuneCookie$2", f = "DMGeckoCommonChannelManager.kt", l = {}, m = "invokeSuspend")
public final class C367501bl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1631620sYq<String, RequestParams, Function1<? super C1533790q13, Unit>, C1533910q1F> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C367501bl(String str, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC1631620sYq interfaceC1631620sYq) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1631620sYq;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C367501bl(this.LLILLJJLI, interfaceC1364105Vn, this.LL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMGeckoCommonChannelManager@7bf7.fetchFortuneCookie$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1631620sYq<String, RequestParams, Function1<? super C1533790q13, Unit>, C1533910q1F> interfaceC1631620sYq = this.LL;
        RequestParams requestParams = new RequestParams(null, 1, null);
        String str = this.LLILLJJLI;
        requestParams.disableBuiltin = true;
        requestParams.resourceScene = EnumC1533980q1M.OTHER;
        requestParams.enableRequestReuse = true;
        requestParams.enableMemoryCache = true;
        requestParams.enableCDNCache = true;
        requestParams.channel = str;
        requestParams.bundle = "/fortune_cookie/icon_popup.png";
        interfaceC1631620sYq.invoke("", requestParams, AnonymousClass0207.get$arr$(191));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMGeckoCommonChannelManager@7bf7.fetchFortuneCookie$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
