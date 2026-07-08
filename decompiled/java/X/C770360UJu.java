package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewDecouplingWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.modecontainer.VideoModeContainer$1$2$1", f = "VideoModeContainer.kt", l = {}, m = "invokeSuspend")
public final class C770360UJu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C770200UJe LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C770360UJu(C770200UJe c770200UJe, InterfaceC1364105Vn<? super C770360UJu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c770200UJe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C770360UJu(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoModeContainer@8970.<init>$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.getAllBannerContainerFromXml().getVisibility() == 4) {
            C20441214yg.LIZIZ("VideoModeContainer", "all_banner_container visible");
            C500260Jjc.LLFFF(this.LL.getAllBannerContainerFromXml());
            PreviewDecouplingWidget previewDecouplingWidget = (PreviewDecouplingWidget) C0UKC.LJFF(C13LE.LIZ(PreviewDecouplingWidget.class));
            if (previewDecouplingWidget != null) {
                previewDecouplingWidget.I1();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoModeContainer@8970.<init>$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
