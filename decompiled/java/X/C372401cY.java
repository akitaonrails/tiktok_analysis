package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01cY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$EffectRenderStrategy$render$2$applyTimeoutWatchdog$1", f = "PCSBoardEffectService.kt", l = {296}, m = "invokeSuspend")
public final class C372401cY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<Integer> LLILLJJLI;
    public final /* synthetic */ InterfaceC395901gL LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C372401cY(AnonymousClass0957<Integer> anonymousClass0957, InterfaceC395901gL interfaceC395901gL, InterfaceC1364105Vn<? super C372401cY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
        this.LLILLL = interfaceC395901gL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C372401cY(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectService$EffectRenderStrategy@f9c0.render$2$applyTimeoutWatchdog$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectService$EffectRenderStrategy@f9c0.render$2$applyTimeoutWatchdog$1");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.isActive()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("applyBoardTask pending >3000ms, boardId=");
            sbLIZ.append(this.LLILLL.getBoardId());
            sbLIZ.append(", bizType=");
            sbLIZ.append(this.LLILLL.getConfig().LIZ);
            C470401sM.LIZIZ(-1012, 5, C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectService$EffectRenderStrategy@f9c0.render$2$applyTimeoutWatchdog$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
