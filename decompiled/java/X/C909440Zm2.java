package X;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zm2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.strategy.StrategyPlatformManager$getCommonConfig$1$1", f = "StrategyPlatformManager.kt", l = {375}, m = "invokeSuspend")
public final class C909440Zm2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnumC909380Zlw LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C909440Zm2(EnumC909380Zlw enumC909380Zlw, String str, InterfaceC1364105Vn<? super C909440Zm2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC909380Zlw;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C909440Zm2(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StrategyPlatformManager@54c7.getCommonConfig$1$1");
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
            C909400Zly c909400Zly = C909400Zly.LIZIZ;
            List<? extends EnumC909380Zlw> listSingletonList = Collections.singletonList(this.LLILLJJLI);
            String str = this.LLILLL;
            this.LL = 1;
            if (c909400Zly.LJIIL(listSingletonList, str, "auto_retry", this) == objLJFF) {
                C1C7U.LIZIZ("StrategyPlatformManager@54c7.getCommonConfig$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StrategyPlatformManager@54c7.getCommonConfig$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
