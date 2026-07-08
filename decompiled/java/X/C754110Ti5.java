package X;

import com.ss.android.ugc.aweme.account.org.permissions.ManagePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ti5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.permissions.ManagePageKt$ManagePage$1$1", f = "ManagePage.kt", l = {}, m = "invokeSuspend")
public final class C754110Ti5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ManagePageViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754110Ti5(ManagePageViewModel managePageViewModel, InterfaceC1364105Vn<? super C754110Ti5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = managePageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754110Ti5(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ManagePageKt@44d7.ManagePage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.yQ2();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ManagePageKt@44d7.ManagePage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
