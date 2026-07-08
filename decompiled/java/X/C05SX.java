package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05SX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.share.TakoShareLongImageShowViewKt$LongImagePreviewScreen$2$1", f = "TakoShareLongImageShowView.kt", l = {170}, m = "invokeSuspend")
public final class C05SX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ C05P0<Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05SX(int i, C1677480tko<Float, C1677280tkU> c1677480tko, Function0<Unit> function0, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C05SX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = c1677480tko;
        this.LLILZ = function0;
        this.LLILZIL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05SX(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoShareLongImageShowViewKt@d9ba.LongImagePreviewScreen$2$1");
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
            if (this.LLILLJJLI > 0 && !this.LLILZIL.getValue().booleanValue()) {
                this.LLILZIL.setValue(Boolean.TRUE);
                C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLL;
                Float fLIZLLL = C2286608xc.LIZLLL(0.0f);
                C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 0, null, 6);
                this.LL = 1;
                if (C1677480tko.LIZJ(c1677480tko, fLIZLLL, c1677050tk7LIZLLL, null, null, this, 12) == objLJFF) {
                    C1C7U.LIZIZ("TakoShareLongImageShowViewKt@d9ba.LongImagePreviewScreen$2$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TakoShareLongImageShowViewKt@d9ba.LongImagePreviewScreen$2$1");
                return unit;
            }
        }
        this.LLILZ.invoke();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoShareLongImageShowViewKt@d9ba.LongImagePreviewScreen$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
