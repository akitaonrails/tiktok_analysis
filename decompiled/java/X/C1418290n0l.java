package X;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418290n0l {
    public static final EnumC1418280n0k LIZ(String str) {
        if (str == null) {
            return EnumC1418280n0k.DEFAULT;
        }
        String upperCase = str.toUpperCase(Locale.getDefault());
        if (Intrinsics.LJFF(upperCase, "UPLOAD_PAGE")) {
            return EnumC1418280n0k.UPLOAD_PAGE;
        }
        if (Intrinsics.LJFF(upperCase, "PREVIEW_PAGE")) {
            return EnumC1418280n0k.PREVIEW_PAGE;
        }
        if (Intrinsics.LJFF(upperCase, "EDIT_PAGE")) {
            return EnumC1418280n0k.EDIT_PAGE;
        }
        if (Intrinsics.LJFF(upperCase, "ANCHOR")) {
            return EnumC1418280n0k.ANCHOR;
        }
        if (Intrinsics.LJFF(upperCase, "MUSIC_DETAIL")) {
            return EnumC1418280n0k.MUSIC_DETAIL;
        }
        if (Intrinsics.LJFF(upperCase, "shoot_page_edit_tab".toUpperCase(Locale.getDefault()))) {
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "autocut_loading_change_title", true, false) && C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_auto_cut_cancel_delay_seconds", true) <= 0) {
                return EnumC1418280n0k.DEFAULT;
            }
            return EnumC1418280n0k.SHOOT_PAGE_EDIT_TAB;
        }
        return EnumC1418280n0k.DEFAULT;
    }
}
