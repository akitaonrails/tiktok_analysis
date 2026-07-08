package X;

import android.content.Context;
import android.graphics.Rect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01fe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$addOrRefreshBoard$1$1", f = "PCSBoardEffectService.kt", l = {237}, m = "invokeSuspend")
public final class C391601fe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC395901gL LLILLJJLI;
    public final /* synthetic */ C394101g3 LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ C388501f9 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C391601fe(Context context, C388501f9 c388501f9, InterfaceC395901gL interfaceC395901gL, C394101g3 c394101g3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC395901gL;
        this.LLILLL = c394101g3;
        this.LLILZ = context;
        this.LLILZIL = c388501f9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C391601fe(this.LLILZ, this.LLILZIL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC391701ff interfaceC391701ff;
        C1C7U.LIZ("PCSBoardEffectService@8a7a.addOrRefreshBoard$1$1");
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
            if (this.LLILLJJLI.getConfig().LJJIII) {
                final C394101g3 c394101g3 = this.LLILLL;
                interfaceC391701ff = new InterfaceC391701ff() { // from class: X.01fb
                    @Override // X.InterfaceC391701ff
                    public final Object LIZ(Context context, InterfaceC395901gL interfaceC395901gL, C388501f9 c388501f9, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                        C392601fo c392601fo = C392601fo.LIZ;
                        C392601fo.LJFF(interfaceC395901gL.getGroupId() + interfaceC395901gL.getBoardId(), C391801fg.LIZ, "native_render");
                        c394101g3.LJFF.put(C2286608xc.LJFF(interfaceC395901gL.getBoardId()), interfaceC395901gL);
                        interfaceC395901gL.getConfig().LIZLLL = c394101g3.LJIILIIL;
                        C394501g7 config = interfaceC395901gL.getConfig();
                        C394101g3 c394101g32 = c394101g3;
                        config.LJ = c394101g32.LJIILJJIL;
                        c394101g32.LJIILL(interfaceC395901gL, true);
                        C392601fo.LJFF(interfaceC395901gL.getGroupId() + interfaceC395901gL.getBoardId(), new C391901fh(new Rect()), null);
                        InterfaceC392301fl statusCallback = interfaceC395901gL.getStatusCallback();
                        if (statusCallback != null) {
                            statusCallback.LIZJ();
                        }
                        c394101g3.LJJI();
                        C392601fo.LIZJ(c392601fo, interfaceC395901gL.getGroupId() + interfaceC395901gL.getBoardId(), null, 6);
                        return Unit.LIZ;
                    }
                };
            } else {
                final C394101g3 c394101g32 = this.LLILLL;
                interfaceC391701ff = new InterfaceC391701ff() { // from class: X.01fZ
                    @Override // X.InterfaceC391701ff
                    public final Object LIZ(Context context, InterfaceC395901gL interfaceC395901gL, C388501f9 c388501f9, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                        Object objLJ = C2296808zG.LJ(new C391001fY(context, c388501f9, interfaceC395901gL, c394101g32, null), interfaceC1364105Vn);
                        if (objLJ == C099R.LJFF()) {
                            return objLJ;
                        }
                        return Unit.LIZ;
                    }
                };
            }
            Context context = this.LLILZ;
            InterfaceC395901gL interfaceC395901gL = this.LLILLJJLI;
            C388501f9 c388501f9 = this.LLILZIL;
            this.LL = 1;
            if (interfaceC391701ff.LIZ(context, interfaceC395901gL, c388501f9, this) == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectService@8a7a.addOrRefreshBoard$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectService@8a7a.addOrRefreshBoard$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
