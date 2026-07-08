package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.relation.recuser.IRecUserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0dbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.fp.ContactFriendsPage$subscribeVM$2$1", f = "ContactFriendsPage.kt", l = {125}, m = "invokeSuspend")
public final class C1056460dbA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1056460dbA(InterfaceC1364105Vn<? super C1056460dbA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1056460dbA(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1056430db7 interfaceC1056430db7LJIILL;
        C1C7U.LIZ("ContactFriendsPage@5517.subscribeVM$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IRecUserService iRecUserService = (IRecUserService) PluggableExtentionKt.pluggableSpi$default(IRecUserService.class, false, false, false, 14, null);
            if (iRecUserService != null && (interfaceC1056430db7LJIILL = iRecUserService.LJIILL()) != null) {
                this.LL = 1;
                if (interfaceC1056430db7LJIILL.LIZ(C1071540dzU.LIZIZ.LIZIZ(), "ffp_contacts_page", false, this) == objLJFF) {
                    C1C7U.LIZIZ("ContactFriendsPage@5517.subscribeVM$2$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ContactFriendsPage@5517.subscribeVM$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1056460dbA(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
