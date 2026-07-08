package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.15FP, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15FP implements InterfaceC20489715Fn {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(195));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(705));
    public final String LIZJ = "livesdk_custom_log_match_score_change";
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;

    @Override // X.InterfaceC20489715Fn
    public final void Ig() {
        this.LIZLLL = 0L;
    }

    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC20489715Fn
    public final void g0(Fragment fragment, DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.BQ2(fragment, BattleTimeLeftChannel.class, new AwS610S0100000_31(this, 409));
        }
    }
}
