package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMServiceBridgeApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.064n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.flow.StreakInviteUtil$enterChatroom$1", f = "StreakInviteUtil.kt", l = {}, m = "invokeSuspend")
public final class C15487064n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnterChatParams LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15487064n(EnterChatParams enterChatParams, InterfaceC1364105Vn<? super C15487064n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enterChatParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15487064n(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IMServiceBridgeApi iMServiceBridgeApiLIZ;
        C1C7U.LIZ("StreakInviteUtil@c779.enterChatroom$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (IMServiceBridgeApi.LIZ != null && (iMServiceBridgeApiLIZ = C15488064o.LIZ()) != null) {
            Boolean.valueOf(iMServiceBridgeApiLIZ.LIZLLL(this.LL));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakInviteUtil@c779.enterChatroom$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
