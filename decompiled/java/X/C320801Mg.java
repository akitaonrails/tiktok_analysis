package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Mg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVMKt$executeWhenExpose$3$1", f = "SearchRefreshPredictMobCanShowVM.kt", l = {}, m = "invokeSuspend")
public final class C320801Mg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320801Mg(View view, InterfaceC1364105Vn<? super C320801Mg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320801Mg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Runnable runnable;
        C1C7U.LIZ("SearchRefreshPredictMobCanShowVMKt@8574.executeWhenExpose$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object tag = this.LL.getTag(R.id.u_2);
        if ((tag instanceof Runnable) && (runnable = (Runnable) tag) != null) {
            runnable.run();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchRefreshPredictMobCanShowVMKt@8574.executeWhenExpose$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
