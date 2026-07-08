package X;

import Y.AgS76S0400000_25;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import njp.a;

/* JADX INFO: renamed from: X.0u4Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", f = "CoreTextField.kt", l = {347}, m = "invokeSuspend")
public final class C1689720u4Y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1691930u87 LLILLJJLI;
    public final /* synthetic */ C05P1<Boolean> LLILLL;
    public final /* synthetic */ C1692080u8M LLILZ;
    public final /* synthetic */ C1692140u8S LLILZIL;
    public final /* synthetic */ C1695020uD6 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1689720u4Y(C1691930u87 c1691930u87, C05P1<Boolean> c05p1, C1692080u8M c1692080u8M, C1692140u8S c1692140u8S, C1695020uD6 c1695020uD6, InterfaceC1364105Vn<? super C1689720u4Y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1691930u87;
        this.LLILLL = c05p1;
        this.LLILZ = c1692080u8M;
        this.LLILZIL = c1692140u8S;
        this.LLILZLL = c1695020uD6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1689720u4Y(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS569S0100000_25(this.LLILLL, (C05P1<C1687320u0g>) 1147));
                AgS76S0400000_25 agS76S0400000_25 = new AgS76S0400000_25(this.LLILLJJLI, this.LLILZ, this.LLILZIL, this.LLILZLL, 2);
                this.LL = 1;
                if (c095dLJIIIZ.collect(agS76S0400000_25, this) == objLJFF) {
                    return objLJFF;
                }
            }
            C1691920u86.LJ(this.LLILLJJLI);
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1691920u86.LJ(this.LLILLJJLI);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
