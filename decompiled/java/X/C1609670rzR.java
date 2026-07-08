package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rzR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609670rzR {
    public static final Pair LIZ = new Pair(null, null);

    public static final Pair<UrlModel, EnumC1609700rzU> LIZ(User user, EnumC1609480rz8 enumC1609480rz8) {
        int i;
        if (enumC1609480rz8 == null) {
            i = -1;
        } else {
            i = C1609490rz9.LIZ[enumC1609480rz8.ordinal()];
        }
        if (i != -1 && i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                if (C1609680rzS.LIZJ(user.getAvatarLarger()) != null) {
                    return new Pair<>(user.getAvatarLarger(), EnumC1609700rzU.AVATAR_LARGE);
                }
                if (C1609680rzS.LIZJ(user.getAvatarMedium()) != null) {
                    return new Pair<>(user.getAvatarMedium(), EnumC1609700rzU.AVATAR_MEDIUM);
                }
                if (C1609680rzS.LIZJ(user.getAvatarThumb()) == null) {
                    return null;
                }
                return new Pair<>(user.getAvatarThumb(), EnumC1609700rzU.AVATAR_THUMB);
            }
            if (C1609680rzS.LIZJ(user.getAvatar300()) != null) {
                return new Pair<>(user.getAvatar300(), EnumC1609700rzU.AVATAR_300);
            }
            if (C1609680rzS.LIZJ(user.getAvatarMedium()) != null) {
                return new Pair<>(user.getAvatarMedium(), EnumC1609700rzU.AVATAR_MEDIUM);
            }
            if (C1609680rzS.LIZJ(user.getAvatarThumb()) != null) {
                return new Pair<>(user.getAvatarThumb(), EnumC1609700rzU.AVATAR_THUMB);
            }
            if (C1609680rzS.LIZJ(user.getAvatarLarger()) == null) {
                return null;
            }
            return new Pair<>(user.getAvatarLarger(), EnumC1609700rzU.AVATAR_LARGE);
        }
        if (C1609680rzS.LIZJ(user.getAvatarThumb()) != null) {
            return new Pair<>(user.getAvatarThumb(), EnumC1609700rzU.AVATAR_THUMB);
        }
        if (C1609680rzS.LIZJ(user.getAvatarMedium()) != null) {
            return new Pair<>(user.getAvatarMedium(), EnumC1609700rzU.AVATAR_MEDIUM);
        }
        if (C1609680rzS.LIZJ(user.getAvatarLarger()) == null) {
            return null;
        }
        return new Pair<>(user.getAvatarLarger(), EnumC1609700rzU.AVATAR_LARGE);
    }
}
