package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.BaseSheet;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mHU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.PopupMonitorServiceImpl$onDialogFragmentShow$1", f = "PopupMonitorServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1390220mHU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ C1389930mH1 LLILLJJLI;
    public final /* synthetic */ C1390660mIC LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1390220mHU(Fragment fragment, C1389930mH1 c1389930mH1, C1390660mIC c1390660mIC, InterfaceC1364105Vn<? super C1390220mHU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fragment;
        this.LLILLJJLI = c1389930mH1;
        this.LLILLL = c1390660mIC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1390220mHU(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PopupMonitorServiceImpl@8747.onDialogFragmentShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL instanceof BaseSheet) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PopupMonitorServiceImpl@8747.onDialogFragmentShow$1");
            return unit;
        }
        C1390650mIB c1390650mIB = C1390650mIB.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("--onDialogFragmentShow():");
        sbLIZ.append(this.LL);
        C2188811AlT.LIZIZ(sbLIZ);
        c1390650mIB.getClass();
        PopupMonitorServiceImpl popupMonitorServiceImpl = PopupMonitorServiceImpl.LIZ;
        Fragment fragment = this.LL;
        C1390660mIC c1390660mIC = this.LLILLL;
        popupMonitorServiceImpl.getClass();
        PopupMonitorServiceImpl.LJJJJJL(fragment, c1390660mIC);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PopupMonitorServiceImpl@8747.onDialogFragmentShow$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
