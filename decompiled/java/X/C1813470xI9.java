package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS571S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0xI9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog$onViewCreated$1", f = "AutoPostLivingPanelDialog.kt", l = {}, m = "invokeSuspend")
public final class C1813470xI9 extends C09AX implements Function2<EnumC1813400xI2, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AutoPostLivingPanelDialog LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813470xI9(AutoPostLivingPanelDialog autoPostLivingPanelDialog, InterfaceC1364105Vn<? super C1813470xI9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = autoPostLivingPanelDialog;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1813470xI9 c1813470xI9 = new C1813470xI9(this.LLILLJJLI, interfaceC1364105Vn);
        c1813470xI9.LL = obj;
        return c1813470xI9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoPostLivingPanelDialog@f7a.onViewCreated$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC1813400xI2 enumC1813400xI2 = (EnumC1813400xI2) this.LL;
        AutoPostLivingPanelDialog autoPostLivingPanelDialog = this.LLILLJJLI;
        autoPostLivingPanelDialog.getClass();
        int i = C1813420xI4.LIZ[enumC1813400xI2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        C20441214yg.LIZIZ("AutoPostLivingPanelDialog", "renderLoadingState UNKNOWN");
                    } else {
                        C20441214yg.LIZIZ("AutoPostLivingPanelDialog", "renderLoadingState FAILED");
                        C500260Jjc.LJIILLIIL(autoPostLivingPanelDialog.LLJZ);
                        C1749280vcc c1749280vcc = autoPostLivingPanelDialog.LLL;
                        if (c1749280vcc != null) {
                            C1722300uv6 c1722300uv6 = new C1722300uv6();
                            C1893080zMY.LJFF(c1722300uv6, new AwS571S0100000_27(autoPostLivingPanelDialog, 302));
                            c1749280vcc.setStatus(c1722300uv6);
                        }
                    }
                } else {
                    C20441214yg.LIZIZ("AutoPostLivingPanelDialog", "renderLoadingState LOADING");
                    C500260Jjc.LLFFF(autoPostLivingPanelDialog.LLL);
                    C1749280vcc c1749280vcc2 = autoPostLivingPanelDialog.LLL;
                    if (c1749280vcc2 != null) {
                        c1749280vcc2.LJ();
                    }
                }
            } else {
                C20441214yg.LIZIZ("AutoPostLivingPanelDialog", "renderLoadingState EMPTY");
            }
        } else {
            C20441214yg.LIZIZ("AutoPostLivingPanelDialog", "renderLoadingState SUCCESS");
            C500260Jjc.LJIILLIIL(autoPostLivingPanelDialog.LLL);
            C500260Jjc.LLFFF(autoPostLivingPanelDialog.LLJZ);
            C1826520xdC c1826520xdC = autoPostLivingPanelDialog.LLLF;
            if (c1826520xdC != null) {
                c1826520xdC.setSelectedAt(0);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoPostLivingPanelDialog@f7a.onViewCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EnumC1813400xI2 enumC1813400xI2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(enumC1813400xI2, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
