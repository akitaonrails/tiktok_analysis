package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01PW, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$EffectRenderStrategy$render$2$applyBoardTask$1", f = "PCSBoardEffectService.kt", l = {289, 290}, m = "invokeSuspend")
public final class C01PW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public int LL;
    public final /* synthetic */ C394101g3 LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ InterfaceC395901gL LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01PW(C394101g3 c394101g3, Context context, InterfaceC395901gL interfaceC395901gL, InterfaceC1364105Vn<? super C01PW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c394101g3;
        this.LLILLL = context;
        this.LLILZ = interfaceC395901gL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01PW(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectService$EffectRenderStrategy@f9c0.render$2$applyBoardTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("PCSBoardEffectService$EffectRenderStrategy@f9c0.render$2$applyBoardTask$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C394101g3 c394101g3 = this.LLILLJJLI;
            Context context = this.LLILLL;
            EnumC389301fH enumC389301fH = this.LLILZ.getConfig().LIZ;
            this.LL = 1;
            if (c394101g3.LJIIIZ(context, enumC389301fH, this) == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectService$EffectRenderStrategy@f9c0.render$2$applyBoardTask$1");
                return objLJFF;
            }
        }
        AnonymousClass0950 anonymousClass0950 = this.LLILLJJLI.LJIJ().LIZLLL;
        C01PT c01pt = new C01PT(null);
        this.LL = 2;
        obj = C09IC.LJIJ(anonymousClass0950, this, c01pt);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("PCSBoardEffectService$EffectRenderStrategy@f9c0.render$2$applyBoardTask$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("PCSBoardEffectService$EffectRenderStrategy@f9c0.render$2$applyBoardTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
