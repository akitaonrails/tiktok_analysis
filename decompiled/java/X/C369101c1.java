package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01c1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.gecko.IMBusinessGeckoResourceFetcher$preloadBusinessGeckoResource$1", f = "IMBusinessGeckoResourceFetcher.kt", l = {}, m = "invokeSuspend")
public final class C369101c1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C369101c1(InterfaceC1364105Vn<? super C369101c1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C369101c1(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMBusinessGeckoResourceFetcher@b853.preloadBusinessGeckoResource$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Forest forest = (Forest) C369201c2.LIZ.getValue();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.disableBuiltin = true;
        requestParams.enableMemoryCache = false;
        requestParams.enableCDNCache = true;
        requestParams.enableRequestReuse = true;
        requestParams.channel = "tiktok_im_business_inbox_lynx";
        requestParams.bundle = "/pages/business_center/template.js";
        forest.fetchResourceAsync("", requestParams, AnonymousClass0207.get$arr$(98));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMBusinessGeckoResourceFetcher@b853.preloadBusinessGeckoResource$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C369101c1(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
