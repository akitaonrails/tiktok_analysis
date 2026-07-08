package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Y2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.leaveconversation.LeaveConversationUseCase$leaveConversation$saveIntoDBResult$1", f = "LeaveConversationUseCase.kt", l = {}, m = "invokeSuspend")
public final class C867880Y2w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C867900Y2y>, Object> {
    public final /* synthetic */ C867910Y2z LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C0Y8T LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C867880Y2w(C867910Y2z c867910Y2z, String str, C0Y8T c0y8t, InterfaceC1364105Vn<? super C867880Y2w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c867910Y2z;
        this.LLILLJJLI = str;
        this.LLILLL = c0y8t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C867880Y2w(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C867900Y2y c867900Y2y;
        C1C7U.LIZ("LeaveConversationUseCase@f268.leaveConversation$saveIntoDBResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C867910Y2z c867910Y2z = this.LL;
        String str = this.LLILLJJLI;
        if (c867910Y2z.LIZLLL.LJJLIIIJILLIZJL(this.LLILLL.getLastMessageIndex(), str)) {
            c867900Y2y = new C867900Y2y(null, 2);
        } else {
            C0YMW c0ymw = C0YMW.newBuilder().LIZ;
            c0ymw.code = -3001;
            c867900Y2y = new C867900Y2y(c0ymw, 1);
        }
        C1C7U.LIZIZ("LeaveConversationUseCase@f268.leaveConversation$saveIntoDBResult$1");
        return c867900Y2y;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C867900Y2y> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
