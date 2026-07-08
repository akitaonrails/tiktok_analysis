package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05wP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.IMSmartReplyService$updateBotSwitches$1", f = "IMSmartReplyService.kt", l = {236, 236}, m = "invokeSuspend")
public final class C1514705wP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Function2 LL;
    public int LLILLJJLI;
    public final /* synthetic */ Function2<InterfaceC1256904vv, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ AnonymousClass0622 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1514705wP(Function2<? super InterfaceC1256904vv, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, long j, AnonymousClass0622 anonymousClass0622, InterfaceC1364105Vn<? super C1514705wP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function2;
        this.LLILZ = j;
        this.LLILZIL = anonymousClass0622;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1514705wP(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Function2 function2;
        C1C7U.LIZ("IMSmartReplyService@3112.updateBotSwitches$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMSmartReplyService@3112.updateBotSwitches$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function2 = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            function2 = this.LLILLL;
            C15408061m c15408061m = C15408061m.LIZ;
            long j = this.LLILZ;
            AnonymousClass0622 anonymousClass0622 = this.LLILZIL;
            this.LL = function2;
            this.LLILLJJLI = 1;
            c15408061m.getClass();
            obj = C15408061m.LIZIZ.LLILZ.LJFF(j, anonymousClass0622, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMSmartReplyService@3112.updateBotSwitches$1");
                return objLJFF;
            }
        }
        this.LL = null;
        this.LLILLJJLI = 2;
        if (function2.invoke(obj, this) == objLJFF) {
            C1C7U.LIZIZ("IMSmartReplyService@3112.updateBotSwitches$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMSmartReplyService@3112.updateBotSwitches$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
