package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.tako.TakoNewInitTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0588, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoNewInitTask$run$1", f = "TakoNewInitTask.kt", l = {31, LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class AnonymousClass0588 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoNewInitTask LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0588(TakoNewInitTask takoNewInitTask, InterfaceC1364105Vn<? super AnonymousClass0588> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoNewInitTask;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0588(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoNewInitTask@cd8f.run$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoNewInitTask@cd8f.run$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Long lLJFF = C2286608xc.LJFF(((Number) AnonymousClass0589.LIZ.getValue()).longValue());
            if (lLJFF.longValue() > 0) {
                long jLongValue = lLJFF.longValue();
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                    C1C7U.LIZIZ("TakoNewInitTask@cd8f.run$1");
                    return objLJFF;
                }
            }
        }
        TakoNewInitTask takoNewInitTask = this.LLILLJJLI;
        this.LL = 2;
        if (takoNewInitTask.LIZ(this) == objLJFF) {
            C1C7U.LIZIZ("TakoNewInitTask@cd8f.run$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoNewInitTask@cd8f.run$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
