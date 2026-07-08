package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0ecg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095840ecg {
    public final CopyOnWriteArrayList<C1095900ecm> LIZ = new CopyOnWriteArrayList<>();

    public final void LIZ() {
        C1095900ecm c1095900ecm = (C1095900ecm) C13LP.LJJJLL(this.LIZ);
        if (c1095900ecm != null) {
            EnumC1095860eci enumC1095860eci = c1095900ecm.LIZ;
            if (enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_CLAIM_NOTIF_TYPE_SEQ_MID) {
                c1095900ecm.LIZ = EnumC1095860eci.FANS_CLUB_ANIM_CLAIM_NOTIF_TYPE_SEQ_START;
                this.LIZ.add(0, new C1095900ecm(EnumC1095860eci.FANS_CLUB_ANIM_HIDE_DOT_TYPE, c1095900ecm.LIZIZ, 0L, 0L, null));
            } else if (enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_CLAIM_NOTIF_TYPE_SEQ_END) {
                C19719612Di.LJJIIZI(this.LIZ);
            }
        }
    }
}
