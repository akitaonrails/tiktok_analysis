package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.11wN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19662511wN {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C474500IjA c474500IjA, C19663611wY c19663611wY) {
        long j;
        c474500IjA.LJJII("sticker", "register_position");
        c474500IjA.LJJII("live_detail_module", "enter_from");
        long j2 = c19663611wY.LJFF / 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        if (jCurrentTimeMillis > j2) {
            j = -1;
        } else {
            j = j2 - jCurrentTimeMillis;
        }
        c474500IjA.LJJII(Long.valueOf(j), "countdown_time");
        c474500IjA.LJJII("upcoming", "live_event_status");
    }

    public static void LIZIZ(C474500IjA c474500IjA, C19663611wY c19663611wY) {
        c474500IjA.LJJII(Long.valueOf(c19663611wY.LIZLLL), "live_event_id");
        c474500IjA.LJJII(Integer.valueOf(!c19663611wY.LJIIJJI ? 1 : 0), "is_free");
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(c19663611wY.LJII.isEmpty() ^ true)) ? 1 : 0), "has_register");
    }

    public static void LIZJ(C19663611wY c19663611wY, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_live_event_module_close");
        LIZIZ(c474500IjALIZ, c19663611wY);
        c474500IjALIZ.LJJII(str, "event_page");
        c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() - c19663611wY.LJIILIIL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "duration");
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(C19663611wY c19663611wY, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_live_event_module_drag");
        LIZIZ(c474500IjALIZ, c19663611wY);
        c474500IjALIZ.LJJII(Integer.valueOf(c19663611wY.LIZ()), "module_position_x");
        c474500IjALIZ.LJJII(Integer.valueOf(c19663611wY.LIZIZ), "module_position_y");
        c474500IjALIZ.LJJII(str, "event_page");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(C19663611wY c19663611wY, String str) {
        int i;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_live_event_module_show");
        LIZIZ(c474500IjALIZ, c19663611wY);
        int i2 = c19663611wY.LJIIL;
        if (i2 != 2 && i2 != 6) {
            i = 0;
        } else {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_from_takepage");
        c474500IjALIZ.LJJII(str, "event_page");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(C19663611wY c19663611wY, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_module_close");
        LIZIZ(c474500IjALIZ, c19663611wY);
        c474500IjALIZ.LJJII(Integer.valueOf(c19663611wY.LIZ()), "module_position_x");
        c474500IjALIZ.LJJII(Integer.valueOf(c19663611wY.LIZIZ), "module_position_y");
        c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() - c19663611wY.LJIILIIL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "duration");
        c474500IjALIZ.LJJII(str, "close_type");
        c474500IjALIZ.LIZ();
    }
}
