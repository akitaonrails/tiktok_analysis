package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.01ed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.settingpage.SettingsRegistry$dynamicItem$3$register$1", f = "LiveHostSettingsConfigFactory.kt", l = {214}, m = "invokeSuspend")
public final class C385301ed extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ InterfaceC1631620sYq<Fragment, LifecycleOwner, C499640Jic, Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ C499990JjB LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C385301ed(int i, InterfaceC1631620sYq<? super Fragment, ? super LifecycleOwner, ? super C499640Jic, Unit> interfaceC1631620sYq, Function0<Unit> function0, Function0<Unit> function02, C499990JjB c499990JjB, int i2, InterfaceC1364105Vn<? super C385301ed> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = interfaceC1631620sYq;
        this.LLILZ = function0;
        this.LLILZIL = function02;
        this.LLILZLL = c499990JjB;
        this.LLIZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C385301ed(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SettingsRegistry@fb82.dynamicItem$3$register$1");
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
            C385601eg c385601eg = new C385601eg(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c385601eg) == objLJFF) {
                C1C7U.LIZIZ("SettingsRegistry@fb82.dynamicItem$3$register$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SettingsRegistry@fb82.dynamicItem$3$register$1");
        return unit;
    }
}
