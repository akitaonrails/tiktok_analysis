package X;

import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS117S0110000_31;
import njp.a;

/* JADX INFO: renamed from: X.14cq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.serverpush.compose.login.cell.BottomRadiosSubPagePushCellKt$BottomRadiosSubPagePushCell$2$1", f = "BottomRadiosSubPagePushCell.kt", l = {}, m = "invokeSuspend")
public final class C20305814cq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C291001Au<Unit> LL;
    public final /* synthetic */ PushSettingsLoginVM LLILLJJLI;
    public final /* synthetic */ C05P0<C19318810i2> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20305814cq(C291001Au<Unit> c291001Au, PushSettingsLoginVM pushSettingsLoginVM, C05P0<C19318810i2> c05p0, InterfaceC1364105Vn<? super C20305814cq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c291001Au;
        this.LLILLJJLI = pushSettingsLoginVM;
        this.LLILLL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20305814cq(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<AbstractC19318610i0<?>> listLIZJ;
        C1C7U.LIZ("BottomRadiosSubPagePushCellKt@4807.BottomRadiosSubPagePushCell$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL != null) {
            PushSettingsLoginVM pushSettingsLoginVM = this.LLILLJJLI;
            C19318810i2 value = this.LLILLL.getValue();
            if (value != null && (listLIZJ = value.LIZJ()) != null) {
                for (AbstractC19318610i0<?> abstractC19318610i0 : listLIZJ) {
                    if (abstractC19318610i0 instanceof C20694215yO) {
                        C20694215yO c20694215yO = (C20694215yO) abstractC19318610i0;
                        c20694215yO.getClass();
                        c20694215yO.LJI(new AwS117S0110000_31(c20694215yO, false, 1));
                    }
                }
            }
            pushSettingsLoginVM.AQ2(C20305914cr.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BottomRadiosSubPagePushCellKt@4807.BottomRadiosSubPagePushCell$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
