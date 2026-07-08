package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager$goToCheckConflict$1", f = "PCSBoardEffectManager.kt", l = {}, m = "invokeSuspend")
public final class C387301ex extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends Boolean>>, Object> {
    public /* synthetic */ boolean LL;
    public final /* synthetic */ C389701fL LLILLJJLI;
    public final /* synthetic */ EnumC389301fH LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C387301ex(C389701fL c389701fL, EnumC389301fH enumC389301fH, Context context, InterfaceC1364105Vn<? super C387301ex> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c389701fL;
        this.LLILLL = enumC389301fH;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C387301ex c387301ex = new C387301ex(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c387301ex.LL = ((Boolean) obj).booleanValue();
        return c387301ex;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c095d;
        C1C7U.LIZ("PCSBoardEffectManager@20d3.goToCheckConflict$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            C389701fL c389701fL = this.LLILLJJLI;
            c389701fL.getClass();
            if (C389701fL.LIZJ()) {
                c095d = new C095D(new C321701Mp(null));
            } else {
                C392601fo.LJII(C392201fk.LIZ, null);
                C392601fo.LJII(C393201fu.LIZ, null);
                C395101gD c395101gD = c389701fL.LIZ;
                c395101gD.getClass();
                c095d = C09IC.LJIJJLI(new C387401ey(c389701fL, null), C09IC.LJIJJLI(new C383501eL(c389701fL, null), C09IC.LJIL(new C095D(new C394301g5(c395101gD, null)), C0PEM.LIZJ)));
            }
        } else {
            c095d = new C095D(new C321901Mr(null));
        }
        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.goToCheckConflict$1");
        return c095d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
