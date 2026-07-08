package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxFilterBarViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.widget.multi.InboxFilterBarViewModel$onPrepared$1", f = "InboxFilterBarViewModel.kt", l = {69}, m = "invokeSuspend")
public final class C889820YvU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InboxFilterBarViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C889820YvU(InboxFilterBarViewModel inboxFilterBarViewModel, InterfaceC1364105Vn<? super C889820YvU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inboxFilterBarViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C889820YvU(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxFilterBarViewModel@c921.onPrepared$1");
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
            IMChatListApi.LJJIII.getClass();
            C05RH c05rh = new C05RH(C890330YwJ.LIZ().LJIIIZ().LIZ());
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 20);
            this.LL = 1;
            if (c05rh.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("InboxFilterBarViewModel@c921.onPrepared$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxFilterBarViewModel@c921.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
