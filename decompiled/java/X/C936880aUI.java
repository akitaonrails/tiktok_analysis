package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownEntranceClickEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aUI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936880aUI extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C937020aUW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C936880aUI(C937020aUW c937020aUW) {
        super(0);
        this.LL = c937020aUW;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        DataChannel dataChannel = this.LL.LL;
        if (dataChannel != null) {
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            dataChannel.LC0(GuestShowdownEntranceClickEvent.class, new C334801Rq("play_panel", C978360bZC.LJ(), 2));
        }
        return Unit.LIZ;
    }
}
