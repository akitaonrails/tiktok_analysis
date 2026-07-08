package X;

import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tj6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment$collectCameraExposureParam$1$1", f = "LiveBroadcastPreviewFragment.kt", l = {}, m = "invokeSuspend")
public final class C754740Tj6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveBroadcastPreviewFragment LL;
    public final /* synthetic */ C013C LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754740Tj6(LiveBroadcastPreviewFragment liveBroadcastPreviewFragment, C013C c013c, InterfaceC1364105Vn<? super C754740Tj6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveBroadcastPreviewFragment;
        this.LLILLJJLI = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754740Tj6(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBroadcastPreviewFragment@146.collectCameraExposureParam$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0U4R c0u4r = new C0U4R();
        LiveBroadcastPreviewFragment liveBroadcastPreviewFragment = this.LL;
        c0u4r.LIZLLL = 2131842531;
        c0u4r.LIZJ = "pm_liveBrightness_goLivePage_toast";
        c0u4r.LJFF = true;
        DataChannel dataChannel = liveBroadcastPreviewFragment.LLILZLL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        c0u4r.LJII = dataChannel;
        c0u4r.LJI = C2097908Jt.LIZJ(new Pair("extra", "brightness_detect"));
        C766270U4b.LJIIJ(c0u4r);
        this.LL.LLJL = System.currentTimeMillis();
        this.LLILLJJLI.element = true;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBroadcastPreviewFragment@146.collectCameraExposureParam$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
