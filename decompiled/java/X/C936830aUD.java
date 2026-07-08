package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownEntranceClickEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aUD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936830aUD extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C941180abE LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C936830aUD(C941180abE c941180abE) {
        super(0);
        this.LL = c941180abE;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        DataChannel dataChannel = this.LL.LJI;
        if (dataChannel != null) {
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            dataChannel.LC0(GuestShowdownEntranceClickEvent.class, new C334801Rq("play_panel", C978360bZC.LJ(), 2));
        }
        return Unit.LIZ;
    }
}
