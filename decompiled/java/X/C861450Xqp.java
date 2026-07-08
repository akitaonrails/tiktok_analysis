package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.EffectFinishComponentImpl$onCreate$1$1", f = "EffectFinishComponentImpl.kt", l = {47}, m = "invokeSuspend")
public final class C861450Xqp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C907140ZiK LLILLJJLI;
    public final /* synthetic */ C1647390syH LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861450Xqp(C907140ZiK c907140ZiK, C1647390syH c1647390syH, InterfaceC1364105Vn<? super C861450Xqp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c907140ZiK;
        this.LLILLL = c1647390syH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861450Xqp(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectFinishComponentImpl@dacc.onCreate$1$1");
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
            C05YC<C1647390syH> c05yc = this.LLILLJJLI.LLILZIL;
            C1647390syH c1647390syH = this.LLILLL;
            this.LL = 1;
            if (c05yc.emit(c1647390syH, this) == objLJFF) {
                C1C7U.LIZIZ("EffectFinishComponentImpl@dacc.onCreate$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectFinishComponentImpl@dacc.onCreate$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
