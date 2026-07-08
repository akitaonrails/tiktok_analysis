package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01fc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$nativeBoardRealAddOrRefresh$1", f = "PCSBoardEffectService.kt", l = {}, m = "invokeSuspend")
public final class C391401fc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC395901gL LL;
    public final /* synthetic */ C394101g3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C391401fc(InterfaceC395901gL interfaceC395901gL, C394101g3 c394101g3, InterfaceC1364105Vn<? super C391401fc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC395901gL;
        this.LLILLJJLI = c394101g3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C391401fc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectService@8a7a.nativeBoardRealAddOrRefresh$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getConfig().LIZLLL = this.LLILLJJLI.LJIILIIL;
        C394501g7 config = this.LL.getConfig();
        C394101g3 c394101g3 = this.LLILLJJLI;
        config.LJ = c394101g3.LJIILJJIL;
        c394101g3.LJIILL(this.LL, true);
        InterfaceC392301fl statusCallback = this.LL.getStatusCallback();
        if (statusCallback != null) {
            statusCallback.LIZJ();
        }
        this.LLILLJJLI.LJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectService@8a7a.nativeBoardRealAddOrRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
