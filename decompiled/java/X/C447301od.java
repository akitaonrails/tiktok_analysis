package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01od, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.services.FindCtxSettingServiceImpl$tryToRemoveMLBB$1$1$1$1", f = "FindCtxSettingServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C447301od extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C447301od(Context context, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C447301od> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C447301od(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindCtxSettingServiceImpl@2114.tryToRemoveMLBB$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context context = this.LL;
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        c1070520dxq.getClass();
        C1070520dxq.LJIIJJI(context, lifecycleOwner);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FindCtxSettingServiceImpl@2114.tryToRemoveMLBB$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
