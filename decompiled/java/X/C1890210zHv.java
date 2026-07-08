package X;

import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetStatus;
import com.ss.android.ugc.aweme.relation.recuser.inbox.UserCardWidgetV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zHv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.recuser.inbox.UserCardWidgetV2$onNewState$4", f = "UserCardWidgetV2.kt", l = {723}, m = "invokeSuspend")
public final class C1890210zHv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UserCardWidgetV2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1890210zHv(UserCardWidgetV2 userCardWidgetV2, InterfaceC1364105Vn<? super C1890210zHv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = userCardWidgetV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1890210zHv(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCardWidgetV2@a30b.onNewState$4");
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
            InterfaceC332260D0u<InboxWidgetStatus> interfaceC332260D0uAp = this.LLILLJJLI.ap();
            C1889340zGW c1889340zGW = C1889340zGW.LIZ;
            this.LL = 1;
            if (interfaceC332260D0uAp.emit(c1889340zGW, this) == objLJFF) {
                C1C7U.LIZIZ("UserCardWidgetV2@a30b.onNewState$4");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserCardWidgetV2@a30b.onNewState$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
