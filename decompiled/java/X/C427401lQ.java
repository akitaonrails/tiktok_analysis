package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestPageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01lQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestPageVM$initForNonRiskPage$1", f = "MessageRequestPageVM.kt", l = {125}, m = "invokeSuspend")
public final class C427401lQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageRequestPageVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C427401lQ(MessageRequestPageVM messageRequestPageVM, InterfaceC1364105Vn<? super C427401lQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageRequestPageVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C427401lQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestPageVM@32a0.initForNonRiskPage$1");
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
            AnonymousClass0951 anonymousClass0951LIZIZ = C09IC.LIZIZ(this.LLILLJJLI.LLILLL);
            C427301lP c427301lP = new C427301lP(null);
            this.LL = 1;
            if (C09IC.LJIJ(anonymousClass0951LIZIZ, this, c427301lP) == objLJFF) {
                C1C7U.LIZIZ("MessageRequestPageVM@32a0.initForNonRiskPage$1");
                return objLJFF;
            }
        }
        C0YOP.LIZ("enter_message_request_page", true, 0, null, 28);
        C880960YhC.LIZ.getClass();
        C23250099c.LIZLLL((InterfaceC497601wk) C880960YhC.LIZIZ.getValue(), null, null, new C427501lR(null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestPageVM@32a0.initForNonRiskPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
