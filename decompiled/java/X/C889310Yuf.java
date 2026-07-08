package X;

import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Yuf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.redpoint.InboxUnreadConsistencyChecker$register$1", f = "InboxUnreadConsistencyChecker.kt", l = {139}, m = "invokeSuspend")
public final class C889310Yuf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C889310Yuf(InterfaceC1364105Vn<? super C889310Yuf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C889310Yuf(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxUnreadConsistencyChecker@efbe.register$1");
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
            InterfaceC346701Wf<? super Object> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0Yug
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    C0ZA1.LIZ.getClass();
                    C0ZA1.LJIIIIZZ("dm_count");
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c05rh.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("InboxUnreadConsistencyChecker@efbe.register$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxUnreadConsistencyChecker@efbe.register$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C889310Yuf(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
