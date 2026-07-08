package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.01ee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.settingpage.SettingsRegistry$dynamicItem$3$unregister$1", f = "LiveHostSettingsConfigFactory.kt", l = {220}, m = "invokeSuspend")
public final class C385401ee extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C499990JjB LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C385401ee(C499990JjB c499990JjB, int i, int i2, InterfaceC1364105Vn<? super C385401ee> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c499990JjB;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C385401ee(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SettingsRegistry@fb82.dynamicItem$3$unregister$1");
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
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C385501ef c385501ef = new C385501ef(this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c385501ef) == objLJFF) {
                C1C7U.LIZIZ("SettingsRegistry@fb82.dynamicItem$3$unregister$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SettingsRegistry@fb82.dynamicItem$3$unregister$1");
        return unit;
    }
}
