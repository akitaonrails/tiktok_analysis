package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01eg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.settingpage.SettingsRegistry$dynamicItem$3$register$1$1", f = "LiveHostSettingsConfigFactory.kt", l = {}, m = "invokeSuspend")
public final class C385601eg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ InterfaceC1631620sYq<Fragment, LifecycleOwner, C499640Jic, Unit> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ C499990JjB LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C385601eg(int i, InterfaceC1631620sYq<? super Fragment, ? super LifecycleOwner, ? super C499640Jic, Unit> interfaceC1631620sYq, Function0<Unit> function0, Function0<Unit> function02, C499990JjB c499990JjB, int i2, InterfaceC1364105Vn<? super C385601eg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = interfaceC1631620sYq;
        this.LLILLL = function0;
        this.LLILZ = function02;
        this.LLILZIL = c499990JjB;
        this.LLILZLL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C385601eg(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SettingsRegistry@fb82.dynamicItem$3$register$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        this.LLILZIL.LIZ.wQ2(i, this.LLILZLL, new C385801ei(i, this.LLILLJJLI, this.LLILLL, this.LLILZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SettingsRegistry@fb82.dynamicItem$3$register$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
