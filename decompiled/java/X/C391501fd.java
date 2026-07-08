package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01fd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$updateBoardVisibility$1", f = "PCSBoardEffectService.kt", l = {184}, m = "invokeSuspend")
public final class C391501fd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C394101g3 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C391501fd(C394101g3 c394101g3, boolean z, InterfaceC1364105Vn<? super C391501fd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c394101g3;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C391501fd(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectService@8a7a.updateBoardVisibility$1");
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
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectService@8a7a.updateBoardVisibility$1");
                return objLJFF;
            }
        }
        C394101g3 c394101g3 = this.LLILLJJLI;
        c394101g3.LJIILIIL = this.LLILLL;
        List<InterfaceC395901gL> listLJFF = c394101g3.LJFF();
        C394101g3 c394101g32 = this.LLILLJJLI;
        for (InterfaceC395901gL interfaceC395901gL : listLJFF) {
            try {
                if (interfaceC395901gL.getConfig().LJJIII) {
                    c394101g32.getClass();
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C391401fc(interfaceC395901gL, c394101g32, null), 3);
                } else {
                    c394101g32.getClass();
                    C1DFH c1dfh2 = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C391201fa(c394101g32, interfaceC395901gL, null, null), 3);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJII(e);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectService@8a7a.updateBoardVisibility$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
