package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01PY, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$EffectRenderStrategy$render$2$boardPrepare$1", f = "PCSBoardEffectService.kt", l = {312}, m = "invokeSuspend")
public final class C01PY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends String>>, Object> {
    public int LL;
    public final /* synthetic */ C394101g3 LLILLJJLI;
    public final /* synthetic */ InterfaceC395901gL LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01PY(InterfaceC395901gL interfaceC395901gL, C394101g3 c394101g3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c394101g3;
        this.LLILLL = interfaceC395901gL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01PY(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PCSBoardEffectService$EffectRenderStrategy@f9c0.render$2$boardPrepare$1");
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
            C394101g3 c394101g3 = this.LLILLJJLI;
            InterfaceC395901gL interfaceC395901gL = this.LLILLL;
            this.LL = 1;
            obj = c394101g3.LJIJI(interfaceC395901gL, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectService$EffectRenderStrategy@f9c0.render$2$boardPrepare$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PCSBoardEffectService$EffectRenderStrategy@f9c0.render$2$boardPrepare$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
