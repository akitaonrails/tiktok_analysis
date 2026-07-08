package X;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01nW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.view.uikit.AsyncImageSpan$1$data$1", f = "AsyncImageSpan.kt", l = {}, m = "invokeSuspend")
public final class C440401nW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Drawable>, Object> {
    public final /* synthetic */ Function0<Drawable> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C440401nW(Function0<? extends Drawable> function0, InterfaceC1364105Vn<? super C440401nW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C440401nW(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncImageSpan@86db.<init>$1$data$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Drawable drawableInvoke = this.LL.invoke();
        C1C7U.LIZIZ("AsyncImageSpan@86db.<init>$1$data$1");
        return drawableInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Drawable> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
