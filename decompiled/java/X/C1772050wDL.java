package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wDL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKDataRequestOperator$initObserver$1", f = "ECMMKDataOperator.kt", l = {105, 108}, m = "invokeSuspend")
public final class C1772050wDL extends C09AX implements Function2<AbstractC1772170wDX, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1772030wDJ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1772050wDL(C1772030wDJ c1772030wDJ, InterfaceC1364105Vn<? super C1772050wDL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1772030wDJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1772050wDL c1772050wDL = new C1772050wDL(this.LLILLL, interfaceC1364105Vn);
        c1772050wDL.LLILLJJLI = obj;
        return c1772050wDL;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0067 -> B:25:0x0072). Please report as a decompilation issue!!! */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECMMKDataRequestOperator@ed96.initObserver$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                AbstractC1772170wDX abstractC1772170wDX = (AbstractC1772170wDX) this.LLILLJJLI;
                if (abstractC1772170wDX instanceof C1772160wDW) {
                    this.LL = 1;
                    if (this.LLILLL.LIZJ((C1772160wDW) abstractC1772170wDX, this) == objLJFF) {
                        C1C7U.LIZIZ("ECMMKDataRequestOperator@ed96.initObserver$1");
                        return objLJFF;
                    }
                } else if (abstractC1772170wDX instanceof C1772180wDY) {
                    this.LL = 2;
                    if (this.LLILLL.LIZIZ((C1772180wDY) abstractC1772170wDX, this) == objLJFF) {
                        C1C7U.LIZIZ("ECMMKDataRequestOperator@ed96.initObserver$1");
                        return objLJFF;
                    }
                } else {
                    C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("error: request intent error: ");
                    sbLIZ.append(abstractC1772170wDX);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c599820Nfo.getClass();
                    C599820Nfo.LIZIZ();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1768370w7P.LIZ(th, EnumC1771210wBz.REQUEST_INTENT, "ECMMKDataRequestOperator:requestIntent.onEach", null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECMMKDataRequestOperator@ed96.initObserver$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1772170wDX abstractC1772170wDX, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1772170wDX, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
