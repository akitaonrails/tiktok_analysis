package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.competition.core.timer.CompetitionCountTimeEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.15FQ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15FQ implements InterfaceC20489715Fn {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(651));
    public final String LIZIZ = "livesdk_custom_log_match_time_left";
    public long LIZJ;
    public long LIZLLL;

    @Override // X.InterfaceC20489715Fn
    public final void Ig() {
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
    }

    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC20489715Fn
    public final void g0(Fragment fragment, DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.BQ2(fragment, CompetitionCountTimeEvent.class, new AwS610S0100000_31(this, 275));
            dataChannel.BQ2(fragment, BattleTimeLeftChannel.class, new AwS610S0100000_31(this, 276));
        }
    }
}
