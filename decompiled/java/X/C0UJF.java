package X;

import com.bytedance.android.livesdk.dataChannel.EffectDownloadEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UJF, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.modecontainer.VideoModeContainerRevision$19$1$1", f = "VideoModeContainerRevision.kt", l = {}, m = "invokeSuspend")
public final class C0UJF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DataChannel>, Object> {
    public final /* synthetic */ C770190UJd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UJF(C770190UJd c770190UJd, InterfaceC1364105Vn<? super C0UJF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c770190UJd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0UJF(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoModeContainerRevision@ec60.<init>$19$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C770190UJd c770190UJd = this.LL;
        DataChannel dataChannel = c770190UJd.LLLIIL;
        dataChannel.BQ2(c770190UJd.LLILZ, EffectDownloadEvent.class, c770190UJd.LLLZLL);
        C1C7U.LIZIZ("VideoModeContainerRevision@ec60.<init>$19$1$1");
        return dataChannel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DataChannel> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
