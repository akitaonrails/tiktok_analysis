package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JhT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C498930JhT extends C2217421BqW implements Function0<Unit> {
    public C498930JhT(Object obj) {
        super(0, obj, C0UXA.class, "logToolTipShow", "logToolTipShow()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0UXA c0uxa = (C0UXA) this.receiver;
        c0uxa.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_poll_bubble_show");
        c474500IjALIZ.LJIJJLI(c0uxa.LL);
        c474500IjALIZ.LIZ();
        C0JGR.u2.LJFF(Boolean.FALSE);
        DataChannel dataChannel = c0uxa.LL;
        if (dataChannel != null) {
            dataChannel.SX0(C0TZU.class, Boolean.TRUE);
        }
        return Unit.LIZ;
    }
}
