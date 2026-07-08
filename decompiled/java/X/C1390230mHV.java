package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mHV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.PopupMonitorServiceImpl$onPopupClicked$1", f = "PopupMonitorServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1390230mHV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1389930mH1 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1390660mIC LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1390230mHV(String str, boolean z, C1389930mH1 c1389930mH1, String str2, C1390660mIC c1390660mIC, InterfaceC1364105Vn<? super C1390230mHV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = c1389930mH1;
        this.LLILZ = str2;
        this.LLILZIL = c1390660mIC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1390230mHV(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PopupMonitorServiceImpl@8747.onPopupClicked$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1390650mIB c1390650mIB = C1390650mIB.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("--onPopupClicked():");
        sbLIZ.append(this.LL);
        sbLIZ.append('-');
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", stack: \n");
        sbLIZ.append(C13SZ.LIZIZ(this.LLILLL));
        C2188811AlT.LIZIZ(sbLIZ);
        c1390650mIB.getClass();
        C1390650mIB.LIZIZ(this.LL, this.LLILLJJLI, this.LLILZ, this.LLILZIL, EnumC1390310mHd.POPUP, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PopupMonitorServiceImpl@8747.onPopupClicked$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
