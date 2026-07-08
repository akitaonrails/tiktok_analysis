package X;

import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import kotlin.Pair;

/* JADX INFO: renamed from: X.11BY, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11BY extends AbstractC1050620dRk {
    public C11BY() {
        super(0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011c  */
    @Override // X.AbstractC1050620dRk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11BY.LIZLLL(java.lang.String):java.lang.Object");
    }

    public final void LJIIJ(long j, EnumC588360N5u enumC588360N5u) {
        LJI("branded_mission_shoot_failed", new Pair<>("reason", enumC588360N5u), new Pair<>("mission_id", Long.valueOf(j)));
    }

    public final void LJIIJJI(long j, boolean z) {
        int i;
        Pair<String, ? extends Object>[] pairArr = new Pair[2];
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        pairArr[0] = new Pair<>("is_success", Integer.valueOf(i));
        pairArr[1] = new Pair<>("duration", Long.valueOf(j));
        LJI("mission_duet_check_permission_finish", pairArr);
    }

    public final void LJIIL(long j, boolean z) {
        int i;
        Pair<String, ? extends Object>[] pairArr = new Pair[2];
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        pairArr[0] = new Pair<>("is_success", Integer.valueOf(i));
        pairArr[1] = new Pair<>("duration", Long.valueOf(j));
        LJI("mission_duet_download_effect_finish", pairArr);
    }

    public final void LJIILIIL(long j, boolean z) {
        int i;
        Pair<String, ? extends Object>[] pairArr = new Pair[2];
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        pairArr[0] = new Pair<>("is_success", Integer.valueOf(i));
        pairArr[1] = new Pair<>("duration", Long.valueOf(j));
        LJI("mission_duet_get_video_finish", pairArr);
    }

    public final void LJIILLIIL(Mission mission, int i) {
        LJIIIZ(mission);
        LIZ(Integer.valueOf(i), "value");
        LJII("mission_requirement_modified", "mission_id", "page_source", "creator_followers", "creator_type");
    }

    public final void LJIIZILJ(Mission mission, int i) {
        LJIIIZ(mission);
        LIZ(Integer.valueOf(i), "event");
        LIZ(1, "sticker_type");
        LJII("mission_requirement_sticker", "mission_id", "page_source", "creator_followers");
    }

    public final void LJIJ(int i, Long l) {
        C1839150xxZ c1839150xxZ = C1839150xxZ.LIZ;
        LJI("mission_requirement_toast", new Pair<>("reason", Integer.valueOf(i)), new Pair<>("mission_id", l), new Pair<>("creator_followers", c1839150xxZ), new Pair<>("creator_type", c1839150xxZ));
    }

    public final void LJIJI(Mission mission, int i) {
        LJIIIIZZ(mission);
        LIZ(Integer.valueOf(i), "reason");
        LJII("mission_requirement_toast", "mission_id", "page_source", "creator_followers", "creator_type");
    }

    public final void LJIILL(Mission mission, boolean z, EnumC1779330wP5 enumC1779330wP5) {
        LJIIIIZZ(mission);
        LJI("mission_post_reminder_click", new Pair<>("mission_id", C1839150xxZ.LIZ), new Pair<>("box_checked", Integer.valueOf(z ? 1 : 0)), new Pair<>("button_click_type", Integer.valueOf(enumC1779330wP5.getValue())));
    }

    public final void LJIILJJIL(Long l, String str, boolean z, EnumC1779340wP6 enumC1779340wP6) {
        String str2;
        int i = C1779350wP7.LIZ[enumC1779340wP6.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str2 = "mission_videos_to_duet_with_content_reuse_toast_show";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str2 = "mission_videos_to_duet_with_allow_duet_toast_show";
            }
        } else {
            str2 = "mission_videos_to_duet_with_privacy_toast_show";
        }
        LJI(str2, new Pair<>("mission_id", l), new Pair<>("video_id", str), new Pair<>("video_duet_with", Integer.valueOf(z ? 1 : 0)));
    }
}
