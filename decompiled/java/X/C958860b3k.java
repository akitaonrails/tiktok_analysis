package X;

import com.bytedance.android.live.liveinteract.match.model.BattleQuickStartRequest;
import com.bytedance.android.live.liveinteract.match.model.BattleQuickStartResponse;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0b3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958860b3k extends AbstractC962030b8r implements InterfaceC963680bBW {
    public long LJI;
    public final String LJII = "ttlive_client_anchor_cohost_monitor";

    @Override // X.AbstractC962030b8r
    public final boolean LJIJJ() {
        return true;
    }

    @Override // X.AbstractC962030b8r
    public final String LJIJI() {
        return this.LJII;
    }

    @Override // X.InterfaceC963680bBW
    public final void LIZ(BattleQuickStartResponse.ResponseData responseData) {
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "battle_id", Long.valueOf(this.LJI), true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "is_last_start", Integer.valueOf(responseData.isLastStart ? 1 : 0), true);
        LJIIL("team_pair", Scene.SCENE_SERVICE, true);
        LJIJJLI("tech_quick_start_response_success");
    }

    @Override // X.InterfaceC963680bBW
    public final void LIZIZ(BattleQuickStartRequest battleQuickStartRequest) {
        this.LJI = battleQuickStartRequest.battleId;
        LJIIL("team_pair", Scene.SCENE_SERVICE, true);
        LJIJJLI("tech_quick_start_request");
    }

    @Override // X.InterfaceC963680bBW
    public final void onFailure(Throwable th) {
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "battle_id", Long.valueOf(this.LJI), true);
        LJIIJJI(th);
        LJIIL("team_pair", Scene.SCENE_SERVICE, true);
        LJIJJLI("tech_quick_start_response_error");
    }
}
