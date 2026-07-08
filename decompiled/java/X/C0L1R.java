package X;

import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L1R, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.TemplateMediaChosenHandler$resolveMedia$2$6", f = "TemplateMediaChosenHandler.kt", l = {}, m = "invokeSuspend")
public final class C0L1R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C536210L1f LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L1R(C536210L1f c536210L1f, InterfaceC1364105Vn<? super C0L1R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c536210L1f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L1R(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateMediaChosenHandler@d239.resolveMedia$2$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C536210L1f c536210L1f = this.LL;
        CreativeDialogWrapper creativeDialogWrapper = c536210L1f.LJI;
        if (creativeDialogWrapper != null) {
            creativeDialogWrapper.dismiss();
        }
        c536210L1f.LJI = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateMediaChosenHandler@d239.resolveMedia$2$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
