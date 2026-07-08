package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.10EU, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public class C10EU {
    public static User LIZ;
    public static User LIZIZ;
    public static boolean LIZJ;

    public static boolean LJIIJ(int i) {
        return (i == 0 || i == 4) ? false : true;
    }

    public static User LIZ() {
        User user = LIZIZ;
        if (user == null || TextUtils.isEmpty(user.getUid())) {
            LIZIZ = C0XQ7.LJFF().getCurUser();
        }
        return LIZIZ;
    }

    public static boolean LJIIIIZZ() {
        return C0XQ7.LJFF().LIZ();
    }

    public static boolean LJIIIZ() {
        return C0XQ7.LJFF().isDeleteByAgeGate();
    }

    public static boolean LJIILIIL() {
        return ComplianceServiceProvider.LJII().LIZLLL() ? C08Q1.LIZJ() : LJIIIIZZ();
    }

    public static String LIZJ(User user) {
        if (user == null) {
            return "";
        }
        if (TextUtils.isEmpty(user.getUniqueId())) {
            if (user.getShortId() == null) {
                return "";
            }
            return user.getShortId();
        }
        return user.getUniqueId();
    }

    public static UrlModel LIZLLL(User user) {
        if (user == null) {
            return null;
        }
        UrlModel avatarLarger = user.getAvatarLarger();
        if (avatarLarger == null) {
            UrlModel avatarMedium = user.getAvatarMedium();
            if (avatarMedium == null) {
                return user.getAvatarThumb();
            }
            return avatarMedium;
        }
        return avatarLarger;
    }

    public static String LJ(User user) {
        if (user == null) {
            return "";
        }
        if (!C2222691Bz1.LJIIIIZZ()) {
            return LIZJ(user);
        }
        return user.getNickname();
    }

    public static int LJFF(User user) {
        if (LJIILL(user, TextUtils.equals(user.getUid(), C0XQ7.LJFF().getCurUserId()))) {
            return 0;
        }
        return user.getTabType();
    }

    public static String[] LJI(UrlModel urlModel) {
        if (urlModel != null && !C1256140inE.LIZ(urlModel.getUrlList())) {
            return (String[]) urlModel.getUrlList().toArray(new String[urlModel.getUrlList().size()]);
        }
        return null;
    }

    public static UrlModel LJII(User user) {
        UrlModel avatarVideoUri;
        if (user == null || (avatarVideoUri = user.getAvatarVideoUri()) == null || !C1256140inE.LIZIZ(avatarVideoUri.getUrlList()) || TextUtils.isEmpty((CharSequence) ListProtector.get(avatarVideoUri.getUrlList(), 0))) {
            return null;
        }
        return avatarVideoUri;
    }

    public static boolean LJIIJJI(Aweme aweme) {
        if (aweme != null && aweme.getAuthor() != null) {
            return LJIIJ(aweme.getAuthor().getFollowStatus());
        }
        return false;
    }

    public static boolean LJIIL(User user) {
        if (user == null) {
            return false;
        }
        return LJIIJ(user.getFollowStatus());
    }

    public static boolean LJIILJJIL(User user) {
        boolean z;
        boolean z2;
        if (user == null) {
            return false;
        }
        if (user.getAccurateRecType() != null) {
            z = true;
        } else {
            z = false;
        }
        if (user.getFollowStatus() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static boolean LJIILLIIL(User user) {
        if (user == null) {
            return false;
        }
        if (user == LIZ) {
            return LIZJ;
        }
        boolean zEquals = TextUtils.equals(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID(), user.getUid());
        LIZJ = zEquals;
        LIZ = user;
        return zEquals;
    }

    public static boolean LJIIZILJ(String str) {
        return TextUtils.equals(C0XQ7.LJFF().getCurUserId(), str);
    }

    public static boolean LJIJ(User user) {
        if (user != null && TextUtils.equals("unique_id", user.getNameField())) {
            return true;
        }
        return false;
    }

    public static String LIZIZ(User user, boolean z) {
        String nickname;
        String str;
        if (user == null) {
            return "";
        }
        if (!TextUtils.isEmpty(user.getRemarkName())) {
            nickname = user.getRemarkName();
        } else {
            nickname = user.getNickname();
        }
        if (!z) {
            str = "";
        } else {
            str = e3.g;
        }
        if (TextUtils.isEmpty(nickname)) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(nickname);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJIILL(User user, boolean z) {
        if (user != null && !z && user.getFollowStatus() != 1 && user.getFollowStatus() != 2 && user.isSecret()) {
            return true;
        }
        return false;
    }
}
