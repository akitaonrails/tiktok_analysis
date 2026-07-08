package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;

/* JADX INFO: renamed from: X.0HDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437480HDm {
    public static final C437480HDm LIZ = new C437480HDm();

    public static boolean LIZ(String str) {
        EnumC437540HDs enumC437540HDs;
        AnonymousClass0951 anonymousClass0951LIZ;
        C437560HDu c437560HDu;
        if (str == null || str.length() == 0) {
            return false;
        }
        ISocialAvatarCreationStatusService iSocialAvatarCreationStatusService = (ISocialAvatarCreationStatusService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarCreationStatusService.class, false, false, false, 14, null);
        if (iSocialAvatarCreationStatusService != null && (anonymousClass0951LIZ = iSocialAvatarCreationStatusService.LIZ(str)) != null && (c437560HDu = (C437560HDu) anonymousClass0951LIZ.getValue()) != null) {
            enumC437540HDs = c437560HDu.LIZ;
        } else {
            enumC437540HDs = null;
        }
        if (enumC437540HDs == EnumC437540HDs.UPLOADING || enumC437540HDs == EnumC437540HDs.GENERATING || enumC437540HDs == EnumC437540HDs.IN_QUEUE || enumC437540HDs == EnumC437540HDs.REGENERATING) {
            return true;
        }
        return false;
    }
}
