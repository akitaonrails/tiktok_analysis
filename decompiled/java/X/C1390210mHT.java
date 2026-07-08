package X;

import android.widget.PopupWindow;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.innerpush.ui.InnerPushPopupWindow;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mHT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.PopupMonitorServiceImpl$onPopupWindowShow$1", f = "PopupMonitorServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1390210mHT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PopupWindow LL;
    public final /* synthetic */ C1389930mH1 LLILLJJLI;
    public final /* synthetic */ C1390660mIC LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1390210mHT(PopupWindow popupWindow, C1389930mH1 c1389930mH1, C1390660mIC c1390660mIC, InterfaceC1364105Vn<? super C1390210mHT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = popupWindow;
        this.LLILLJJLI = c1389930mH1;
        this.LLILLL = c1390660mIC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1390210mHT(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PopupMonitorServiceImpl@8747.onPopupWindowShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL instanceof InnerPushPopupWindow) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PopupMonitorServiceImpl@8747.onPopupWindowShow$1");
            return unit;
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        if (((Map) PopupMonitorServiceImpl.LJIILIIL.getValue()).containsKey(C2286608xc.LJ(this.LL.hashCode()))) {
            C1390650mIB.LIZ.getClass();
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PopupMonitorServiceImpl@8747.onPopupWindowShow$1");
            return unit2;
        }
        C1390650mIB c1390650mIB = C1390650mIB.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("--onPopupWindowShow():");
        sbLIZ.append(this.LL);
        sbLIZ.append(", stack: \n");
        sbLIZ.append(C13SZ.LIZIZ(this.LLILLJJLI));
        C2188811AlT.LIZIZ(sbLIZ);
        c1390650mIB.getClass();
        PopupMonitorServiceImpl.LJJJJJL(this.LL, this.LLILLL);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PopupMonitorServiceImpl@8747.onPopupWindowShow$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
