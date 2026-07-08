package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HYP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HYP {
    public static final C0HYP LIZ = new C0HYP();
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;

    static {
        UUID.randomUUID().toString();
        LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(447));
        LIZJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(446));
    }

    public static void LIZIZ() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarProfileFloatingNotice");
        sbLIZ.append(" Keva check start");
        C2188811AlT.LIZIZ(sbLIZ);
        if (LIZ(C0HKX.PROFILE, false)) {
            throw new Exception("Is showing intro sheet");
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SocialAvatarProfileFloatingNotice");
        sbLIZ2.append(" No intro sheet showing");
        C2188811AlT.LIZIZ(sbLIZ2);
        long j = LJ().getLong("profile_popup_sheet_show_timestamp", 0L);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("SocialAvatarProfileFloatingNotice");
        sbLIZ3.append(" Intro sheet show time ");
        sbLIZ3.append(new Date(j));
        C2188811AlT.LIZIZ(sbLIZ3);
        if (j != 0 && System.currentTimeMillis() - j < TimeUnit.DAYS.toMillis(3L)) {
            throw new Exception("Less than three days after intro sheet");
        }
        if (LJ().getBoolean("profile_floating_notice_dismissed", false)) {
            throw new Exception("Has been dismissed");
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("SocialAvatarProfileFloatingNotice");
        sbLIZ4.append(" Hasn't been dismissed");
        C2188811AlT.LIZIZ(sbLIZ4);
        if (LJ().getBoolean("profile_floating_notice_clicked", false)) {
            throw new Exception("Has been clicked");
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("SocialAvatarProfileFloatingNotice");
        sbLIZ5.append(" Hasn't been clicked");
        C2188811AlT.LIZIZ(sbLIZ5);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("SocialAvatarProfileFloatingNotice");
        sbLIZ6.append(" Keva check succes");
        C2188811AlT.LIZIZ(sbLIZ6);
    }

    public static String LIZJ() {
        String strValueOf;
        int i = KevaImpl.getRepo("social_avatar_download_keva", 1).getInt("should_refresh_profile_self", 1);
        if (i < 10) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("00");
            sbLIZ.append(i);
            strValueOf = C2188811AlT.LIZIZ(sbLIZ);
        } else if (i < 100) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('0');
            sbLIZ2.append(i);
            strValueOf = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strValueOf = String.valueOf(i);
        }
        KevaImpl.getRepo("social_avatar_download_keva", 1).storeInt("should_refresh_profile_self", i + 1);
        return strValueOf;
    }

    public static EnumC437540HDs LIZLLL() {
        User currentUser;
        String uid;
        EnumC437540HDs enumC437540HDs;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        return (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null || (enumC437540HDs = ((C437560HDu) ((ISocialAvatarCreationStatusService) ServiceManager.get().getService(ISocialAvatarCreationStatusService.class)).LIZ(uid).getValue()).LIZ) == null) ? EnumC437540HDs.UNKNOWN : enumC437540HDs;
    }

    public static Keva LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("social_avatar_keva_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return KevaImpl.getRepo(C2188811AlT.LIZIZ(sbLIZ), 1);
    }

    public static boolean LJFF() {
        return LJ().getBoolean("has_shown_dm_new_stickers_popup", false);
    }

    public static void LJI(C0HLR c0hlr) {
        LJ().storeInt("uploading_flow_status", c0hlr.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(X.C0HKX r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HYP.LIZ(X.0HKX, boolean):boolean");
    }
}
