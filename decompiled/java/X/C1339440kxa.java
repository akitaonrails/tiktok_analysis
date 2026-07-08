package X;

import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kxa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1339440kxa {
    public static final C1339440kxa LIZ = new C1339440kxa();

    public static UrlModel LIZ(User user) {
        UrlModel avatarThumb = user.getAvatarThumb();
        C0XQ7.LJ();
        User curUser = C0XQ7.LIZ.LJIIJ().getCurUser();
        if (Intrinsics.LJFF(curUser.getUid(), user.getUid())) {
            return curUser.getAvatarThumb();
        }
        return avatarThumb;
    }

    public static void LIZIZ(User user, String str, Drawable drawable, TuxIconDrawable tuxIconDrawable, int i, C427870Gq9 c427870Gq9) {
        UrlModel urlModelLIZ;
        C1341210l0R c1341210l0RLIZJ;
        if (C294220Bg4.LIZ()) {
            if (c427870Gq9 == null || (urlModelLIZ = LIZ(user)) == null || (c1341210l0RLIZJ = C1341200l0Q.LIZJ(urlModelLIZ, str, i)) == null) {
                return;
            }
            C1344350l5V.LIZJ(c1341210l0RLIZJ.LIZ, "buildRequest");
            C1341180l0O.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZJ = C1341180l0O.LIZJ(c1341210l0RLIZJ, false);
            c1331670kl3LIZJ.LJJ(c427870Gq9);
            c1331670kl3LIZJ.LJJIIZI(drawable);
            c1331670kl3LIZJ.LJIL(tuxIconDrawable);
            c1331670kl3LIZJ.LJJIJLIJ = true;
            c1331670kl3LIZJ.LJIIJJI();
            return;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(LIZ(user)));
        c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
        c1331670kl3LJIIIIZZ.LJJIIZI(drawable);
        c1331670kl3LJIIIIZZ.LJIL(tuxIconDrawable);
        c1331670kl3LJIIIIZZ.LJIIIIZZ = i;
        c1331670kl3LJIIIIZZ.LJIIIZ = i;
        c1331670kl3LJIIIIZZ.LIZLLL("CommentViewHolder");
        c1331670kl3LJIIIIZZ.LJJ(c427870Gq9);
        c1331670kl3LJIIIIZZ.LJJIJLIJ = true;
        c1331670kl3LJIIIIZZ.LJIIJJI();
    }
}
