package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0SY4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.messagelist.IMProfileDisplayHostBridgeImpl$bindRelationBtn$2", f = "IMProfileDisplayHostBridgeImpl.kt", l = {}, m = "invokeSuspend")
public final class C0SY4 extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ RelationButton LL;
    public final /* synthetic */ User LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SY4(RelationButton relationButton, User user, InterfaceC1364105Vn<? super C0SY4> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = relationButton;
        this.LLILLJJLI = user;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0SY4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMProfileDisplayHostBridgeImpl@dcec.bindRelationBtn$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C786410Ut5.t0(this.LL, 8);
        InterfaceC1345705Ol imUserService = C1336205Ku.LIZ(false).getImUserService();
        User user = this.LLILLJJLI;
        user.isBlock = false;
        IMUser.Companion.getClass();
        imUserService.LJIILJJIL(C2201941BFw.LIZJ(user));
        C1C7U.LIZIZ("IMProfileDisplayHostBridgeImpl@dcec.bindRelationBtn$2");
        return false;
    }
}
