package X;

import android.content.Context;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0lCV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348690lCV {
    public static boolean LIZ(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return true;
        }
        User author = aweme.getAuthor();
        int commentSetting = author.getCommentSetting();
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZJ(author.getUid())) {
            if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser().getCommentSetting() != 3 && aweme.getCommentSetting() != 3) {
                return true;
            }
            return false;
        }
        if (commentSetting == 0) {
            return true;
        }
        if (commentSetting == 1) {
            C735280Sso.LIZ.getClass();
            if (C735280Sso.LIZLLL(aweme)) {
                return true;
            }
        } else if (commentSetting == 2) {
            C735280Sso.LIZ.getClass();
            if (C735280Sso.LIZIZ(aweme)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return true;
        }
        User author = aweme.getAuthor();
        int commentSetting = author.getCommentSetting();
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZJ(author.getUid()) || commentSetting == 0) {
            return true;
        }
        if (commentSetting == 1) {
            C735280Sso.LIZ.getClass();
            if (C735280Sso.LIZLLL(aweme)) {
                return true;
            }
        } else if (commentSetting == 2) {
            C735280Sso.LIZ.getClass();
            if (C735280Sso.LIZIZ(aweme)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZJ(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        if (aweme.getAuthor().getCommentSetting() != 3 && aweme.getCommentSetting() != 3) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Aweme aweme) {
        if (aweme == null || !C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme)) || !C330820Cy0.LIZ()) {
            return false;
        }
        return true;
    }

    public static void LJ(Context context, int i, String str) {
        if (context == null) {
            return;
        }
        C21566919al c21566919al = new C21566919al(context);
        c21566919al.LJFF(i);
        c21566919al.LIZJ = str;
        c21566919al.LJIIJ(2131828219, null, false);
        c21566919al.LJII = false;
        new C21566519ah(c21566919al).LIZLLL();
    }
}
