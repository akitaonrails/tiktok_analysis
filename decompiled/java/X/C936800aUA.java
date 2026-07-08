package X;

import com.bytedance.android.live.liveinteract.api.event.ShowPlaybookPlayToolPage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aUA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936800aUA extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C941180abE LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C936800aUA(C941180abE c941180abE) {
        super(0);
        this.LL = c941180abE;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        DataChannel dataChannel = this.LL.LJI;
        if (dataChannel != null) {
            EnumC936670aTx enumC936670aTx = EnumC936670aTx.LIVE_SHOW;
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            dataChannel.LC0(ShowPlaybookPlayToolPage.class, new C936640aTu(enumC936670aTx, "play_panel", C978360bZC.LJ(), "liveshow_playbook"));
        }
        return Unit.LIZ;
    }
}
