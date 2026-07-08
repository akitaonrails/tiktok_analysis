package X;

import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.assem.SubPackageMultiMonthAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.assem.SubPackageMultiMonthAssem$initVM$5", f = "SubPackageMultiMonthAssem.kt", l = {}, m = "invokeSuspend")
public final class C513190KAr extends C09AX implements Function2<C512190K6v, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SubPackageMultiMonthAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C513190KAr(SubPackageMultiMonthAssem subPackageMultiMonthAssem, InterfaceC1364105Vn<? super C513190KAr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = subPackageMultiMonthAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C513190KAr(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Function0<Unit> function0;
        C1C7U.LIZ("SubPackageMultiMonthAssem@b35a.initVM$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0KC4 c0kc4Hp = this.LL.hp();
        if (c0kc4Hp != null && (function0 = c0kc4Hp.LLJILJIL) != null) {
            function0.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubPackageMultiMonthAssem@b35a.initVM$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C512190K6v c512190K6v, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c512190K6v, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
