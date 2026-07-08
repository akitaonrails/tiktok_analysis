package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01oV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.services.FindCtxSettingServiceImpl$tryToRemoveContact$1$1", f = "FindCtxSettingServiceImpl.kt", l = {99}, m = "invokeSuspend")
public final class C446501oV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;
    public final /* synthetic */ Function1<Integer, Unit> LLILZIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C446501oV(int i, Context context, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1, Function1 function12) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = context;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = function1;
        this.LLILZLL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C446501oV(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn, this.LLILZIL, this.LLILZLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindCtxSettingServiceImpl@2114.tryToRemoveContact$1$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C446601oW c446601oW = new C446601oW(this.LLILLJJLI, this.LLILLL, this.LLILZ, null, this.LLILZIL, this.LLILZLL);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c446601oW) == objLJFF) {
                C1C7U.LIZIZ("FindCtxSettingServiceImpl@2114.tryToRemoveContact$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FindCtxSettingServiceImpl@2114.tryToRemoveContact$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
