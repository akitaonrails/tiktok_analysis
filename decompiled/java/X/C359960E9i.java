package X;

/* JADX INFO: renamed from: X.0E9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359960E9i {
    public static boolean LIZ(C0ELJ c0elj) {
        boolean z = false;
        boolean zLIZ = C363750ENx.LIZ.LIZ("func_bar_transition_anim_show", false);
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "editor_pro_test_mode_for_enter_ep_experience", true, false) && zLIZ) {
            return false;
        }
        if (c0elj == null) {
            return true;
        }
        if (c0elj.getInitIntent() == EnumC359990E9l.OPEN_MUSIC_FROM_EDITOR) {
            z = true;
        }
        return !z;
    }
}
