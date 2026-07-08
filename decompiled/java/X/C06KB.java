package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.06KB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.res.StreakDefaultGeckoResHelper$fetchResource$1", f = "StreakDefaultGeckoResHelper.kt", l = {}, m = "invokeSuspend")
public final class C06KB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C06K7 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06KB(C06K7 c06k7, InterfaceC1364105Vn<? super C06KB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c06k7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06KB(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakDefaultGeckoResHelper@51ca.fetchResource$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Forest forest = (Forest) this.LL.LIZ.getValue();
        if (forest != null) {
            RequestParams requestParams = new RequestParams(null, 1, null);
            requestParams.onlyLocal = true;
            requestParams.disableBuiltin = true;
            requestParams.disableCdn = true;
            requestParams.resourceScene = EnumC1533980q1M.OTHER;
            requestParams.enableRequestReuse = true;
            requestParams.enableMemoryCache = true;
            requestParams.enableCDNCache = true;
            requestParams.channel = "mt_dm_streak_common_resource";
            requestParams.bundle = "/dm_friends_restore/social_dm_friends_restore_Light.json";
            forest.fetchResourceAsync("", requestParams, new AwS581S0100000_2(this.LL, 634));
        }
        Forest forest2 = (Forest) this.LL.LIZ.getValue();
        if (forest2 != null) {
            RequestParams requestParams2 = new RequestParams(null, 1, null);
            requestParams2.onlyLocal = true;
            requestParams2.disableBuiltin = true;
            requestParams2.resourceScene = EnumC1533980q1M.OTHER;
            requestParams2.enableRequestReuse = true;
            requestParams2.enableMemoryCache = true;
            requestParams2.enableCDNCache = true;
            requestParams2.channel = "mt_dm_streak_common_resource";
            requestParams2.bundle = "/dm_friends_restore/social_dm_friends_restore_Dark.json";
            forest2.fetchResourceAsync("", requestParams2, new AwS581S0100000_2(this.LL, 635));
        }
        Forest forest3 = (Forest) this.LL.LIZ.getValue();
        if (forest3 != null) {
            RequestParams requestParams3 = new RequestParams(null, 1, null);
            requestParams3.disableBuiltin = true;
            requestParams3.resourceScene = EnumC1533980q1M.OTHER;
            requestParams3.enableRequestReuse = true;
            requestParams3.enableMemoryCache = true;
            requestParams3.enableCDNCache = true;
            requestParams3.channel = "mt_dm_streak_common_resource";
            requestParams3.bundle = "/egg_share_panel_animation.json";
            forest3.fetchResourceAsync("", requestParams3, new AwS581S0100000_2(this.LL, 636));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakDefaultGeckoResHelper@51ca.fetchResource$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
