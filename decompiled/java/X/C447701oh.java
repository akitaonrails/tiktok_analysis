package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01oh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingManager$checkContactRemoveStatus$1$1", f = "FindCtxSettingManager.kt", l = {}, m = "invokeSuspend")
public final class C447701oh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C447701oh(Context context, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C447701oh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C447701oh(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindCtxSettingManager@b41b.checkContactRemoveStatus$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context context = this.LL;
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        c1070520dxq.getClass();
        C1389890mGx c1389890mGxLJFF = C1070520dxq.LJFF(context, lifecycleOwner);
        if (c1389890mGxLJFF != null) {
            c1389890mGxLJFF.LJIIIZ(2131846226);
            c1389890mGxLJFF.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FindCtxSettingManager@b41b.checkContactRemoveStatus$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
