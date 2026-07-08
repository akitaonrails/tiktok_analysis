package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: renamed from: X.0HHm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinGeckoManager$get$1", f = "BulletinGeckoManager.kt", l = {}, m = "invokeSuspend")
public final class C438520HHm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C438520HHm(InterfaceC1364105Vn<? super C438520HHm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C438520HHm(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinGeckoManager@3a47.get$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Forest forestLIZ = C0T1N.LIZ();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.channel = "tiktok_bulletin_board_emoji_list";
        requestParams.bundle = "emoji_self_delete.json";
        requestParams.waitGeckoUpdate = true;
        forestLIZ.fetchResourceAsync("", requestParams, AFwS240S0000000_9.get$arr$(910));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinGeckoManager@3a47.get$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C438520HHm(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
