package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06ht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1679506ht {
    public static Keva LIZIZ;
    public static final C1679506ht LIZ = new C1679506ht();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1260));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1259));

    public final synchronized Keva LIZLLL() {
        Keva repo;
        repo = LIZIZ;
        if (repo == null) {
            repo = Keva.getRepo("streaks_push_remind_repo");
            LIZIZ = repo;
        }
        return repo;
    }

    public final boolean LIZIZ() {
        C1675106hB.LIZ.getClass();
        if (!C1675106hB.LIZIZ()) {
            return false;
        }
        if (C1675106hB.LIZ().variant == 1) {
            return System.currentTimeMillis() - LJFF() > ((long) ((Number) LIZJ.getValue()).intValue()) * 86400000;
        }
        if (C1675106hB.LIZJ()) {
            return System.currentTimeMillis() - LJ() > ((long) ((Number) LIZLLL.getValue()).intValue()) * 86400000;
        }
        if (C1675106hB.LIZ().variant != 3) {
            return false;
        }
        if (LJI() < 3) {
            if (System.currentTimeMillis() - LJFF() <= ((long) ((Number) LIZJ.getValue()).intValue()) * 86400000) {
                return false;
            }
        } else if (System.currentTimeMillis() - LJ() <= ((long) ((Number) LIZLLL.getValue()).intValue()) * 86400000) {
            return false;
        }
        return true;
    }

    public final boolean LIZ() {
        long j = LIZLLL().getLong(LJIIIIZZ("key_last_dm_push_popup_display_timestamp"), 1L);
        long j2 = LIZLLL().getLong(LJIIIIZZ("key_last_dm_push_inline_display_timestamp"), 1L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis - j >= 86400000 && jCurrentTimeMillis - j2 >= 86400000;
    }

    public final boolean LIZJ() {
        long jLJFF = LJFF();
        long jLJ = LJ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis - jLJFF >= 86400000 && jCurrentTimeMillis - jLJ >= 86400000;
    }

    public final long LJ() {
        return LIZLLL().getLong(LJIIIIZZ("key_last_inline_msg_display_timestamp"), 1L);
    }

    public final long LJFF() {
        return LIZLLL().getLong(LJIIIIZZ("key_last_popup_display_timestamp"), 1L);
    }

    public final int LJI() {
        return LIZLLL().getInt(LJIIIIZZ("key_reminder_displayed_count"), 0);
    }

    public final void LJII() {
        LIZLLL().storeInt(LJIIIIZZ("key_reminder_displayed_count"), LJI() + 1);
    }

    public static String LJIIIIZZ(String str) {
        String strLIZIZ = C461720I8s.LIZIZ();
        if (!(!Intrinsics.LJFF(strLIZIZ, "-1")) || strLIZIZ == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
