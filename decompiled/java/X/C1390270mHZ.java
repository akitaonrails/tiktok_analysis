package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mHZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.PopupMonitorServiceImpl$startSystemPermissionMonitor$1$1$onPermissionPopUpShow$1", f = "PopupMonitorServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1390270mHZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String[] LL;
    public final /* synthetic */ C1390660mIC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1390270mHZ(String[] strArr, C1390660mIC c1390660mIC, InterfaceC1364105Vn<? super C1390270mHZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = strArr;
        this.LLILLJJLI = c1390660mIC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1390270mHZ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PopupMonitorServiceImpl@8747.startSystemPermissionMonitor$1$1$onPermissionPopUpShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1390650mIB c1390650mIB = C1390650mIB.LIZ;
        String strLJJJ = C13LQ.LJJJ(this.LL, null, null, null, null, 63);
        EnumC1390310mHd enumC1390310mHd = EnumC1390310mHd.PERMISSION;
        C1390660mIC c1390660mIC = this.LLILLJJLI;
        c1390650mIB.getClass();
        C1390650mIB.LJFF(strLJJJ, enumC1390310mHd, c1390660mIC, "", 1, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PopupMonitorServiceImpl@8747.startSystemPermissionMonitor$1$1$onPermissionPopUpShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
