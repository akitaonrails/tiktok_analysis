package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L5S, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.magic.I2VMagicTaskLoadingScene$I2VDelegateFromPush$onClickBack$1$1", f = "I2VMagicTaskLoadingScene.kt", l = {525}, m = "invokeSuspend")
public final class C0L5S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0LAO LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L5S(C0LAO c0lao, InterfaceC1364105Vn<? super C0L5S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0lao;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L5S(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I2VMagicTaskLoadingScene$I2VDelegateFromPush@e5dc.onClickBack$1$1");
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
            C0LAO c0lao = this.LLILLJJLI;
            this.LL = 1;
            if (c0lao.LLLLLL(this) == objLJFF) {
                C1C7U.LIZIZ("I2VMagicTaskLoadingScene$I2VDelegateFromPush@e5dc.onClickBack$1$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LLLLLLIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("I2VMagicTaskLoadingScene$I2VDelegateFromPush@e5dc.onClickBack$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
