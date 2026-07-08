package X;

import android.view.View;
import com.bytedance.android.livesdk.broadcast.preview.widget.GamePreviewDecouplingWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ULa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.GamePreviewDecouplingWidget$checkDecouplingWidgetShow$1$2$1", f = "GamePreviewDecouplingWidget.kt", l = {}, m = "invokeSuspend")
public final class C770680ULa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ GamePreviewDecouplingWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C770680ULa(View view, GamePreviewDecouplingWidget gamePreviewDecouplingWidget, InterfaceC1364105Vn<? super C770680ULa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = view;
        this.LLILLJJLI = gamePreviewDecouplingWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C770680ULa(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        LiveMode liveModeLIZJ;
        C1C7U.LIZ("GamePreviewDecouplingWidget@a156.checkDecouplingWidgetShow$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C500260Jjc.LJJJI(Boolean.valueOf(!C500260Jjc.LJJJJIZL(this.LL))) && this.LLILLJJLI.LLJ) {
            C20441214yg.LIZIZ("VideoModeContainer", "decoupling_center_banner visible");
            this.LLILLJJLI.show();
            GamePreviewDecouplingWidget gamePreviewDecouplingWidget = this.LLILLJJLI;
            gamePreviewDecouplingWidget.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoupling_entrance_show");
            c474500IjALIZ.LJJII("live_take_page", "entrance_page");
            c474500IjALIZ.LJJII(gamePreviewDecouplingWidget.LLJI, "exposure_period");
            DataChannel dataChannel = gamePreviewDecouplingWidget.dataChannel;
            if (dataChannel != null && (liveModeLIZJ = C751980Tee.LIZJ(dataChannel)) != null) {
                str = liveModeLIZJ.logStreamingType;
            } else {
                str = null;
            }
            c474500IjALIZ.LJJII(str, "live_type");
            c474500IjALIZ.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GamePreviewDecouplingWidget@a156.checkDecouplingWidgetShow$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
