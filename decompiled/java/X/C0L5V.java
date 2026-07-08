package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L5V, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.magic.I2VMagicTaskLoadingScene$I2VDelegateFromConsume$onClickBack$2$1", f = "I2VMagicTaskLoadingScene.kt", l = {465}, m = "invokeSuspend")
public final class C0L5V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0LAO LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L5V(C0LAO c0lao, InterfaceC1364105Vn<? super C0L5V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0lao;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L5V(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I2VMagicTaskLoadingScene$I2VDelegateFromConsume@cf33.onClickBack$2$1");
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
            Function1<InterfaceC1364105Vn<? super Unit>, Object> function1 = this.LLILLJJLI.LLLLIL().LIZJ;
            this.LL = 1;
            if (function1.invoke(this) == objLJFF) {
                C1C7U.LIZIZ("I2VMagicTaskLoadingScene$I2VDelegateFromConsume@cf33.onClickBack$2$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LLLLLJLJLL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("I2VMagicTaskLoadingScene$I2VDelegateFromConsume@cf33.onClickBack$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
