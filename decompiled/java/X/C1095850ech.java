package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0ech, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095850ech implements InterfaceC1096110ed7 {
    public final /* synthetic */ C1095910ecn LIZ;

    @Override // X.InterfaceC1096110ed7
    public final void LIZ() {
        long j;
        long j2;
        long j3;
        long j4;
        C1095910ecn c1095910ecn = this.LIZ;
        if (c1095910ecn.LJJJI) {
            c1095910ecn.LJIJJLI();
        }
        C1095910ecn c1095910ecn2 = this.LIZ;
        c1095910ecn2.LJJJLL = null;
        c1095910ecn2.LJJJ = false;
        C1092520eXK c1092520eXK = c1095910ecn2.LJJLIIIJILLIZJL;
        DataChannel dataChannel = c1095910ecn2.LJIILL;
        if (dataChannel != null) {
            C500260Jjc.LJJLIIIJ(dataChannel);
        }
        C1092530eXL c1092530eXL = c1092520eXK.LIZ;
        if (c1092530eXL != null) {
            c1092530eXL.LIZIZ = false;
            c1092530eXL.LIZJ = "";
            c1092530eXL.LIZ = 0;
            c1092530eXL.LIZLLL = null;
        }
        C1095910ecn c1095910ecn3 = this.LIZ;
        C1095840ecg c1095840ecg = c1095910ecn3.LJJJIL;
        C1095140ebY c1095140ebY = c1095910ecn3.LIZLLL;
        c1095840ecg.getClass();
        if (c1095140ebY != null) {
            j = c1095140ebY.LIZ;
            j2 = c1095140ebY.LIZIZ;
        } else {
            j = 0;
            j2 = 0;
        }
        while (!c1095840ecg.LIZ.isEmpty()) {
            C1095900ecm c1095900ecm = (C1095900ecm) C19719612Di.LJJIIZI(c1095840ecg.LIZ);
            if (c1095900ecm != null) {
                C1095140ebY c1095140ebY2 = c1095900ecm.LIZIZ;
                if (c1095140ebY2 != null) {
                    j3 = c1095140ebY2.LIZ;
                    j4 = c1095140ebY2.LIZIZ;
                } else {
                    j3 = 0;
                    j4 = 0;
                }
                long j5 = j4 + c1095900ecm.LIZJ;
                EnumC1095860eci enumC1095860eci = c1095900ecm.LIZ;
                if (j3 > j || j5 > j2 || ((j3 >= j && (enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_FINISH_ALL_TASK_TYPE || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_SLEEP_TO_ACTIVE_TYPE)) || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_CLAIM_GUIDE_TYPE || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_CLAIM_NOTIF_TYPE_SEQ_START || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_CLAIM_NOTIF_TYPE_SEQ_MID || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_CLAIM_NOTIF_TYPE_SEQ_END || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_CLAIMED_TYPE || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_HIDE_DOT_TYPE || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_SHOW_DOT_TYPE || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_ABOUT_TO_UPGRADE_TYPE || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_ENTRANCE_TYPE || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_POINTS_INCREASE_FROM_ZERO || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_POINTS_DECREASE || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_POINTS_INCREASE || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_POINTS_RECOVER || enumC1095860eci == EnumC1095860eci.SUPER_FANS_GUIDE_ANIM || enumC1095860eci == EnumC1095860eci.FANS_CLUB_MILESTONE_GUIDE_ANIM || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_HIGH_LIGHT_GUIDE_TYPE || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_GUIDE_TEXT_TYPE || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_GUIDE_IMAGE_TEXT_TYPE || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_GUIDE_IMAGE_TYPE || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_GUIDE_FILE_ANIM_TYPE || enumC1095860eci == EnumC1095860eci.FANS_CLUB_UNJOIN_ANIM_GUIDE_TEXT_TYPE || enumC1095860eci == EnumC1095860eci.FANS_CLUB_ROOM_INFO_ANIM_GUIDE_TYPE)) {
                    c1095910ecn3.LJJJJJL(c1095900ecm.LIZ, c1095910ecn3.LIZLLL, c1095900ecm.LIZIZ, c1095900ecm.LIZJ, c1095900ecm.LIZLLL, c1095900ecm.LJ);
                    return;
                }
            }
        }
    }

    public C1095850ech(C1095910ecn c1095910ecn) {
        this.LIZ = c1095910ecn;
    }
}
