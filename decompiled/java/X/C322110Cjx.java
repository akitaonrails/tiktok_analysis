package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import defpackage.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cjx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.cards.carry.processor.util.TakoProcessorUtil$fetchMessageConfig$2", f = "TakoProcessorUtil.kt", l = {122}, m = "invokeSuspend")
public final class C322110Cjx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Function1 LL;
    public int LLILLJJLI;
    public final /* synthetic */ Function1<u2, Unit> LLILLL;
    public final /* synthetic */ IMessageAbility LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C322110Cjx(Function1<? super u2, Unit> function1, IMessageAbility iMessageAbility, InterfaceC1364105Vn<? super C322110Cjx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
        this.LLILZ = iMessageAbility;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322110Cjx(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        C1C7U.LIZ("TakoProcessorUtil@346e.fetchMessageConfig$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                function1 = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            function1 = this.LLILLL;
            IMessageAbility iMessageAbility = this.LLILZ;
            if (iMessageAbility != null) {
                this.LL = function1;
                this.LLILLJJLI = 1;
                obj = iMessageAbility.ql0(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TakoProcessorUtil@346e.fetchMessageConfig$2");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        function1.invoke(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoProcessorUtil@346e.fetchMessageConfig$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
