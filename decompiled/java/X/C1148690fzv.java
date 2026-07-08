package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpLeftListChannel;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0fzv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1148690fzv extends AbstractC2203101BKi {
    public List<BattleUserArmy> LIZ;
    public List<BattleUserArmy> LIZIZ;
    public final String LIZJ = "match_contributors_viewer_index";

    @Override // X.AbstractC2203101BKi
    public final void LIZJ() {
        this.LIZ = null;
        this.LIZIZ = null;
    }

    @Override // X.InterfaceC2203111BKj
    public final String getName() {
        return this.LIZJ;
    }

    public static int LIZLLL(List list) {
        if (list != null) {
            Iterator it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (((BattleUserArmy) it2.next()).userId != UserService.getInstance().user().getCurrentUserId()) {
                    i++;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // X.InterfaceC2203111BKj
    public final Object LIZ(JSONArray jSONArray) {
        Object c098200Yq;
        int iLIZLLL;
        try {
            String str = (String) jSONArray.get(0);
            if (Intrinsics.LJFF(str, "host_team")) {
                iLIZLLL = LIZLLL(this.LIZ);
            } else if (Intrinsics.LJFF(str, "guest_team")) {
                iLIZLLL = LIZLLL(this.LIZIZ);
            } else {
                iLIZLLL = -1;
            }
            c098200Yq = Integer.valueOf(iLIZLLL);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            return -1;
        }
        return c098200Yq;
    }

    @Override // X.AbstractC2203101BKi
    public final void LIZIZ(Fragment fragment, DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.BQ2(fragment, BattleMvpLeftListChannel.class, new AwS596S0100000_17(this, 272));
            dataChannel.BQ2(fragment, BattleMvpLeftListChannel.class, new AwS596S0100000_17(this, 273));
        }
    }
}
