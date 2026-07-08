package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS17S0401000_25;
import njp.a;

/* JADX INFO: renamed from: X.0uG8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.view.TakoAIVideoWaveBackgroundKt$TakoAIVideoWaveBackgroundOptimized$1$1", f = "TakoAIVideoWaveBackground.kt", l = {197}, m = "invokeSuspend")
public final class C1696900uG8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C118300cf LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C05P1<Float> LLILZLL;
    public final /* synthetic */ C1696970uGF LLIZ;
    public final /* synthetic */ InterfaceC1675750ti1 LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1696900uG8(int i, C05P1<Float> c05p1, C1696970uGF c1696970uGF, InterfaceC1675750ti1 interfaceC1675750ti1, InterfaceC1364105Vn<? super C1696900uG8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = i;
        this.LLILZLL = c05p1;
        this.LLIZ = c1696970uGF;
        this.LLIZLLLIL = interfaceC1675750ti1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1696900uG8 c1696900uG8 = new C1696900uG8(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1696900uG8.LLILZ = obj;
        return c1696900uG8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C118300cf c118300cf;
        int i;
        C1C7U.LIZ("TakoAIVideoWaveBackgroundKt@a678.TakoAIVideoWaveBackgroundOptimized$1$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLL;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LLILLJJLI;
                c118300cf = this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
            c118300cf = new C118300cf();
            i = this.LLILZIL;
            if (i < 1) {
                i = 1;
            }
        }
        while (C2296808zG.LJI(interfaceC497601wk)) {
            AwS17S0401000_25 awS17S0401000_25 = new AwS17S0401000_25(i, this.LLIZLLLIL, this.LLILZLL, this.LLIZ, c118300cf, 2);
            this.LLILZ = interfaceC497601wk;
            this.LL = c118300cf;
            this.LLILLJJLI = i;
            this.LLILLL = 1;
            if (C1838620xwi.LIZIZ(this, awS17S0401000_25) == objLJFF) {
                C1C7U.LIZIZ("TakoAIVideoWaveBackgroundKt@a678.TakoAIVideoWaveBackgroundOptimized$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoWaveBackgroundKt@a678.TakoAIVideoWaveBackgroundOptimized$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
