package X;

import com.bytedance.android.livesdk.pad.IPadAutoRotateScreenService;
import com.bytedance.android.livesdk.pad.widget.PadAutoRotateScreenGuideWidget;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS551S0100000_7;
import njp.a;

/* JADX INFO: renamed from: X.0Im3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.pad.widget.PadAutoRotateScreenGuideWidget$showGuideDelay$1$1", f = "PadAutoRotateScreenGuideWidget.kt", l = {}, m = "invokeSuspend")
public final class C476290Im3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PadAutoRotateScreenGuideWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C476290Im3(PadAutoRotateScreenGuideWidget padAutoRotateScreenGuideWidget, InterfaceC1364105Vn<? super C476290Im3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = padAutoRotateScreenGuideWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C476290Im3(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("PadAutoRotateScreenGuideWidget@d6ef.showGuideDelay$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PadAutoRotateScreenGuideWidget padAutoRotateScreenGuideWidget = this.LL;
        if (padAutoRotateScreenGuideWidget.isViewValid()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showGuide contentView is View.VISIBLE:");
            if (padAutoRotateScreenGuideWidget.contentView.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(" current time:");
            sbLIZ.append(System.currentTimeMillis());
            C20441214yg.LJIIIZ("PadAutoRotateScreenGuideWidget", C2188811AlT.LIZIZ(sbLIZ));
            if (padAutoRotateScreenGuideWidget.x1() && padAutoRotateScreenGuideWidget.contentView.getVisibility() != 0) {
                ((IPadAutoRotateScreenService) C1161920gLG.LIZJ(IPadAutoRotateScreenService.class)).RQ0();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_landscape_guide_show");
                c474500IjALIZ.LJIJJLI(padAutoRotateScreenGuideWidget.dataChannel);
                c474500IjALIZ.LIZ();
                C12ES.LJIILL(0, padAutoRotateScreenGuideWidget.contentView);
                padAutoRotateScreenGuideWidget.contentView.setOnTouchListener(padAutoRotateScreenGuideWidget);
                KeyBoardUtil.LIZIZ(padAutoRotateScreenGuideWidget.context, padAutoRotateScreenGuideWidget.contentView);
                padAutoRotateScreenGuideWidget.z1(new AwS551S0100000_7(padAutoRotateScreenGuideWidget, 787), true);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PadAutoRotateScreenGuideWidget@d6ef.showGuideDelay$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
