package X;

import com.bytedance.forest.model.RequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01bp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.resource.DMGeckoCommonChannelManager$fetchChannelInner$2", f = "DMGeckoCommonChannelManager.kt", l = {}, m = "invokeSuspend")
public final class C367901bp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1631620sYq<String, RequestParams, Function1<? super C1533790q13, Unit>, C1533910q1F> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C367901bp(InterfaceC1631620sYq<? super String, ? super RequestParams, ? super Function1<? super C1533790q13, Unit>, C1533910q1F> interfaceC1631620sYq, String str, Function2<? super Boolean, ? super String, Unit> function2, InterfaceC1364105Vn<? super C367901bp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1631620sYq;
        this.LLILLJJLI = str;
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C367901bp(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMGeckoCommonChannelManager@7bf7.fetchChannelInner$2");
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
        requestParams.bundle = "/photo_swap_lottie/";
        requestParams.supportDirectory = true;
        interfaceC1631620sYq.invoke("", requestParams, new C020R((Function2) this.LLILLL, (Function2<? super Boolean, ? super String, Unit>) this.LLILLJJLI, (String) 3));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMGeckoCommonChannelManager@7bf7.fetchChannelInner$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
