package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mHY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.PopupMonitorServiceImpl$onDialogShow$1", f = "PopupMonitorServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1390260mHY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Dialog LL;
    public final /* synthetic */ C1390660mIC LLILLJJLI;
    public final /* synthetic */ C1389930mH1 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1390260mHY(Dialog dialog, C1390660mIC c1390660mIC, C1389930mH1 c1389930mH1, InterfaceC1364105Vn<? super C1390260mHY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dialog;
        this.LLILLJJLI = c1390660mIC;
        this.LLILLL = c1389930mH1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1390260mHY(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PopupMonitorServiceImpl@8747.onDialogShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL instanceof ProgressDialogC1397770mTf) {
            C1390650mIB c1390650mIB = C1390650mIB.LIZ;
            EnumC1390310mHd enumC1390310mHd = EnumC1390310mHd.POPUP;
            C1390660mIC c1390660mIC = this.LLILLJJLI;
            c1390650mIB.getClass();
            C1390650mIB.LJFF("aweme_progress_dialog", enumC1390310mHd, c1390660mIC, "", 1, "");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PopupMonitorServiceImpl@8747.onDialogShow$1");
            return unit;
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        if (((Map) PopupMonitorServiceImpl.LJIIL.getValue()).containsKey(C2286608xc.LJ(this.LL.hashCode()))) {
            C1390650mIB.LIZ.getClass();
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PopupMonitorServiceImpl@8747.onDialogShow$1");
            return unit2;
        }
        C1390650mIB c1390650mIB2 = C1390650mIB.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("--onDialogShow():");
        sbLIZ.append(this.LL);
        sbLIZ.append(", stack: \n");
        sbLIZ.append(C13SZ.LIZIZ(this.LLILLL));
        C2188811AlT.LIZIZ(sbLIZ);
        c1390650mIB2.getClass();
        PopupMonitorServiceImpl.LJJJJJL(this.LL, this.LLILLJJLI);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PopupMonitorServiceImpl@8747.onDialogShow$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
