package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpLeftListChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0fzw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1148700fzw extends AbstractC2203101BKi {
    public final String LIZ = "match_contributors_count";
    public int LIZIZ;
    public int LIZJ;

    @Override // X.AbstractC2203101BKi
    public final void LIZJ() {
        this.LIZIZ = 0;
        this.LIZJ = 0;
    }

    @Override // X.InterfaceC2203111BKj
    public final String getName() {
        return this.LIZ;
    }

    @Override // X.InterfaceC2203111BKj
    public final Object LIZ(JSONArray jSONArray) {
        Object c098200Yq;
        int i;
        try {
            String str = (String) jSONArray.get(0);
            if (Intrinsics.LJFF(str, "host_team")) {
                i = this.LIZIZ;
            } else if (Intrinsics.LJFF(str, "guest_team")) {
                i = this.LIZJ;
            } else {
                i = 0;
            }
            c098200Yq = Integer.valueOf(i);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            return 0;
        }
        return c098200Yq;
    }

    @Override // X.AbstractC2203101BKi
    public final void LIZIZ(Fragment fragment, DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.BQ2(fragment, BattleMvpLeftListChannel.class, new AwS596S0100000_17(this, 270));
            dataChannel.BQ2(fragment, BattleMvpLeftListChannel.class, new AwS596S0100000_17(this, 271));
        }
    }
}
