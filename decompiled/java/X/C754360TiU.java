package X;

import android.widget.ScrollView;
import com.bytedance.android.livesdk.broadcast.preview.widget.replay.PreviewReplayWidget;
import com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayEnableChannel;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TiU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.modecontainer.GameModeContainerRevision$attachBanners$showReplayWidgetAction$1$1", f = "GameModeContainerRevision.kt", l = {513}, m = "invokeSuspend")
public final class C754360TiU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0UL3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754360TiU(C0UL3 c0ul3, InterfaceC1364105Vn<? super C754360TiU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ul3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754360TiU(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int height;
        C1C7U.LIZ("GameModeContainerRevision@e6b8.attachBanners$showReplayWidgetAction$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long millis = TimeUnit.SECONDS.toMillis(3L);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(millis, this) == objLJFF) {
                C1C7U.LIZIZ("GameModeContainerRevision@e6b8.attachBanners$showReplayWidgetAction$1$1");
                return objLJFF;
            }
        }
        int[] iArr = new int[2];
        ScrollView bannerScrollerView = this.LLILLJJLI.getBannerScrollerView();
        if (bannerScrollerView != null) {
            bannerScrollerView.getLocationOnScreen(iArr);
        }
        int i2 = iArr[1];
        ScrollView bannerScrollerView2 = this.LLILLJJLI.getBannerScrollerView();
        if (bannerScrollerView2 != null) {
            height = bannerScrollerView2.getHeight();
        } else {
            height = 0;
        }
        int i3 = i2 + height;
        C425960Gn4 flowLayoutFromXml = this.LLILLJJLI.getFlowLayoutFromXml();
        if (flowLayoutFromXml != null) {
            flowLayoutFromXml.getLocationOnScreen(iArr);
        }
        int i4 = iArr[1];
        int iLIZ = C439101nJ.LIZ(74);
        if (i3 == 0 || i4 == 0 || i4 - iLIZ > i3) {
            C0UKC.LIZ(C13LE.LIZ(PreviewReplayWidget.class), this.LLILLJJLI.getReplayContainerFromXml(), new C13IQ[]{C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(ReplayEnableChannel.class)}, true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameModeContainerRevision@e6b8.attachBanners$showReplayWidgetAction$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
