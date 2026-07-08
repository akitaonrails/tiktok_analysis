package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.RestrictDialog;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0DU7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.RestrictDialog$onViewCreated$1", f = "RestrictDialog.kt", l = {}, m = "invokeSuspend")
public final class C0DU7 extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RestrictDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DU7(RestrictDialog restrictDialog, InterfaceC1364105Vn<? super C0DU7> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = restrictDialog;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RestrictDialog@5514.onViewCreated$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.dismiss();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RestrictDialog@5514.onViewCreated$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0DU7(this.LL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
