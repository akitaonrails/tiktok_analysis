package X;

import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubPackagePageDialog;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CU7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubPackagePageDialog$initObserver$1", f = "SubPackagePageDialog.kt", l = {}, m = "invokeSuspend")
public final class C0CU7 extends C09AX implements Function2<C221300tH, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SubPackagePageDialog LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CU7(SubPackagePageDialog subPackagePageDialog, InterfaceC1364105Vn<? super C0CU7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = subPackagePageDialog;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0CU7 c0cu7 = new C0CU7(this.LLILLJJLI, interfaceC1364105Vn);
        c0cu7.LL = obj;
        return c0cu7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubPackagePageDialog@79bf.initObserver$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        Map<String, String> map = this.LLILLJJLI.LLJJI;
        if (map != null) {
            obj2.getClass();
            map.putAll(null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubPackagePageDialog@79bf.initObserver$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C221300tH c221300tH, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c221300tH, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
