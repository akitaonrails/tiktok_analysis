package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01oY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.services.FindCtxSettingServiceImpl$tryToRemoveContact$1$1$1$2", f = "FindCtxSettingServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C446801oY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ Function1<Integer, Unit> LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C446801oY(int i, Context context, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1, Function1 function12) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = function1;
        this.LLILZ = function12;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C446801oY(this.LLILZIL, this.LL, this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindCtxSettingServiceImpl@2114.tryToRemoveContact$1$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context context = this.LL;
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        Function1<Integer, Unit> function1 = this.LLILLL;
        Function1<Boolean, Unit> function12 = this.LLILZ;
        int i = this.LLILZIL;
        c1070520dxq.getClass();
        C1070520dxq.LJIIL(context, lifecycleOwner, function1, function12, i);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FindCtxSettingServiceImpl@2114.tryToRemoveContact$1$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
