package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.scene.Scene;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0bNC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970920bNC extends AbstractC963310bAv {
    public final String LJI = "ttlive_client_audience_take_stage_monitor";

    @Override // X.AbstractC962030b8r
    public final int LJIJ() {
        return 1;
    }

    @Override // X.AbstractC962030b8r
    public final boolean LJIJJ() {
        return false;
    }

    @Override // X.AbstractC963310bAv, X.AbstractC962030b8r
    public final void LJIILLIIL() {
        EnumC919170a1j enumC919170a1jLJFF;
        String string;
        super.LJIILLIIL();
        List listLIZLLL = C973890bRz.LIZLLL();
        Object obj = null;
        if (listLIZLLL != null) {
            Iterator it2 = listLIZLLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((GiftMode) next).giftId == C973890bRz.LJII) {
                    obj = next;
                    break;
                }
            }
            GiftMode giftMode = (GiftMode) obj;
            if (giftMode != null) {
                long j = giftMode.giftId;
                if (j > 0) {
                    AbstractC962030b8r.LJIIJ(this.LIZLLL, "gift_id", Long.valueOf(j), true);
                }
            }
        }
        if (C915980Zwa.LJFF().xB0().isMatch()) {
            enumC919170a1jLJFF = C915980Zwa.LJFF().xB0();
        } else if (C915980Zwa.LIZIZ().Dn0().isTakeTheStage()) {
            C962950bAL c962950bAL = EnumC962960bAM.Companion;
            EnumC962960bAM enumC962960bAMDn0 = C915980Zwa.LIZIZ().Dn0();
            c962950bAL.getClass();
            enumC919170a1jLJFF = C962950bAL.LJFF(enumC962960bAMDn0);
        } else {
            enumC919170a1jLJFF = EnumC919170a1j.UNKNOWN;
        }
        EnumC919170a1j.Companion.getClass();
        LJIIL(C917350Zyn.LIZJ(enumC919170a1jLJFF), "match_type", true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "current_user_id", Long.valueOf(C950220apo.LJFF()), true);
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 == null || (string = Long.valueOf(c981480beEM91.LJIIIZ).toString()) == null) {
            string = "";
        }
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "battle_id", string, true);
        if (C973930bS3.LJ()) {
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "performer_uid", Long.valueOf(C973930bS3.LIZLLL()), true);
        }
    }

    @Override // X.AbstractC962030b8r
    public final String LJIJI() {
        return this.LJI;
    }

    public final void LJJIFFI(String str) {
        LJIIL(str, Scene.SCENE_SERVICE, true);
        LJIJJLI("final_call_start");
    }

    public final void LJJIIJ(String str) {
        LJIILIIL();
        LJIIL(str, Scene.SCENE_SERVICE, true);
        LJIJJLI("battle_info_succeed");
    }

    public final void LJJII(long j, boolean z) {
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "match_duration", Long.valueOf(j), true);
        if (C915980Zwa.LIZIZ().JV1(false).isPlayingIncludeResult()) {
            LJIIL(0, "stage", true);
        } else {
            LJIIL(1, "stage", true);
        }
        LJIIL(Boolean.valueOf(z), "is_leave_room", true);
        LJIJJLI("battle_finish");
    }

    public final void LJJIII(String str, Throwable th) {
        LJIIL(str, Scene.SCENE_SERVICE, true);
        LJIIJJI(th);
        LJIJJLI("battle_info_failed");
    }
}
