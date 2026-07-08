package X;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.viewmodule.BroadcastPreviewBannerWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Vj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.viewmodule.BroadcastPreviewBannerWidget$monitorViewHeightChange$1$1", f = "BroadcastPreviewBannerWidget.kt", l = {}, m = "invokeSuspend")
public final class C344501Vj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BroadcastPreviewBannerWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C344501Vj(BroadcastPreviewBannerWidget broadcastPreviewBannerWidget, InterfaceC1364105Vn<? super C344501Vj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = broadcastPreviewBannerWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C344501Vj(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BroadcastPreviewBannerWidget@2453.monitorViewHeightChange$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        View view = this.LL.getView();
        if (view != null && view.getVisibility() == 4) {
            C500260Jjc.LLFFF(this.LL.getView());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BroadcastPreviewBannerWidget@2453.monitorViewHeightChange$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
