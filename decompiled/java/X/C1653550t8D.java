package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t8D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653550t8D {
    public final ShortVideoContext LIZ;

    public final boolean LIZ() {
        String str;
        if (!this.LIZ.LJJJJLL() && C0C64.LJIILLIIL().LJIIIZ(31744, "mv_theme_mode_switch", true, true) && !this.LIZ.LJJLL()) {
            ShortVideoContext shortVideoContext = this.LIZ;
            if (shortVideoContext.enterMvThemeEffect != null || (((str = shortVideoContext.enterCutsameId) != null && str.length() > 0) || Intrinsics.LJFF(this.LIZ.creativeModel.landingModel.landingTab, "mv") || Intrinsics.LJFF(this.LIZ.creativeModel.landingModel.landingTab, "editor_tab"))) {
                return false;
            }
        }
        return true;
    }

    public C1653550t8D(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
    }
}
