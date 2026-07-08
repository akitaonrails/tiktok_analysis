package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;

/* JADX INFO: renamed from: X.0HDr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437530HDr {
    public static final EnumC437540HDs LIZ(User user) {
        String uid;
        AnonymousClass0951 anonymousClass0951LIZ;
        C437560HDu c437560HDu;
        EnumC437540HDs enumC437540HDs;
        if (user != null && (uid = user.getUid()) != null && uid.length() != 0) {
            ISocialAvatarCreationStatusService iSocialAvatarCreationStatusService = (ISocialAvatarCreationStatusService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarCreationStatusService.class, false, false, false, 14, null);
            if (iSocialAvatarCreationStatusService != null && (anonymousClass0951LIZ = iSocialAvatarCreationStatusService.LIZ(uid)) != null && (c437560HDu = (C437560HDu) anonymousClass0951LIZ.getValue()) != null && (enumC437540HDs = c437560HDu.LIZ) != null) {
                return enumC437540HDs;
            }
            return EnumC437540HDs.UNKNOWN;
        }
        return EnumC437540HDs.UNKNOWN;
    }

    public static final boolean LIZIZ(User user) {
        String uid;
        AnonymousClass0951 anonymousClass0951LIZ;
        C437560HDu c437560HDu;
        EnumC437540HDs enumC437540HDs = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        if (uid == null || uid.length() == 0) {
            return false;
        }
        ISocialAvatarCreationStatusService iSocialAvatarCreationStatusService = (ISocialAvatarCreationStatusService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarCreationStatusService.class, false, false, false, 14, null);
        if (iSocialAvatarCreationStatusService != null && (anonymousClass0951LIZ = iSocialAvatarCreationStatusService.LIZ(uid)) != null && (c437560HDu = (C437560HDu) anonymousClass0951LIZ.getValue()) != null) {
            enumC437540HDs = c437560HDu.LIZ;
        }
        if (enumC437540HDs == EnumC437540HDs.SUCCESSFUL) {
            return true;
        }
        return false;
    }
}
