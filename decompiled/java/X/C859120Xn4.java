package X;

import com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManagerImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xn4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManagerImpl$processAllTasks$1$taskJob$1", f = "ChatRoomAdaptiveRequestManagerImpl.kt", l = {134}, m = "invokeSuspend")
public final class C859120Xn4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ChatRoomAdaptiveRequestManagerImpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859120Xn4(ChatRoomAdaptiveRequestManagerImpl chatRoomAdaptiveRequestManagerImpl, InterfaceC1364105Vn<? super C859120Xn4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = chatRoomAdaptiveRequestManagerImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C859120Xn4 c859120Xn4 = new C859120Xn4(this.LLILLL, interfaceC1364105Vn);
        c859120Xn4.LLILLJJLI = obj;
        return c859120Xn4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        long j;
        C1C7U.LIZ("ChatRoomAdaptiveRequestManagerImpl@8a72.processAllTasks$1$taskJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
        }
        do {
            C859500Xng<?> c859500XngPoll = this.LLILLL.LJIIIIZZ.poll();
            if (c859500XngPoll == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ChatRoomAdaptiveRequestManagerImpl@8a72.processAllTasks$1$taskJob$1");
                return unit;
            }
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C859110Xn3(c859500XngPoll, null), 3);
            j = this.LLILLL.LIZIZ.LJ;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
        } while (AnonymousClass0958.LIZIZ(j, this) != objLJFF);
        C1C7U.LIZIZ("ChatRoomAdaptiveRequestManagerImpl@8a72.processAllTasks$1$taskJob$1");
        return objLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
