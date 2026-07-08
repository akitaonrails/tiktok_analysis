package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.service.IDMGeckoCommonChannelManager;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0YlR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor.mediator.InboxSessionMediator$fetchResource$1", f = "InboxSessionMediator.kt", l = {}, m = "invokeSuspend")
public final class C883590YlR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C883590YlR(InterfaceC1364105Vn<? super C883590YlR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C883590YlR(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSessionMediator@f2ca.fetchResource$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZJ(EnumC883570YlP.ENTER_SESSION_LIST);
        ((IDMGeckoCommonChannelManager) ServiceManager.get().getService(IDMGeckoCommonChannelManager.class)).LJIIJ();
        if (((Number) C289850BXr.LIZ.getValue()).intValue() == 1) {
            IMStickerApi.LIZ.LIZIZ().getImStickerStoreService().LJJIIJ(null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSessionMediator@f2ca.fetchResource$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C883590YlR(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
