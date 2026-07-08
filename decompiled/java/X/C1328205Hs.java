package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05Hs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.common.observer.AccountObserver$onAccountResult$1", f = "AccountObserver.kt", l = {}, m = "invokeSuspend")
public final class C1328205Hs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ User LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1328205Hs(User user, InterfaceC1364105Vn<? super C1328205Hs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = user;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1328205Hs(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String curUserId;
        C1C7U.LIZ("AccountObserver@78.onAccountResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        User user = this.LL;
        if (user == null || (curUserId = user.getUid()) == null) {
            C1328305Ht c1328305Ht = C1328305Ht.LL;
            curUserId = ((IAccountService) C1328305Ht.LLILZ.getValue()).LJIIJ().getCurUserId();
        }
        C1328305Ht c1328305Ht2 = C1328305Ht.LL;
        if (!Intrinsics.LJFF(C1328305Ht.LIZ(), curUserId)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("new user login: ");
            sbLIZ.append(C1328305Ht.LIZ());
            sbLIZ.append(" -> ");
            sbLIZ.append(curUserId);
            C1327105Hh.LIZIZ("AccountObserver", C2188811AlT.LIZIZ(sbLIZ));
            C1328305Ht.LLILLJJLI.setValue(curUserId);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AccountObserver@78.onAccountResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
