package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609680rzS {
    public static final Set<EnumC1609700rzU> LIZ = C13LQ.LJLIIL(new EnumC1609700rzU[]{EnumC1609700rzU.AVATAR_THUMB, EnumC1609700rzU.AVATAR_MEDIUM, EnumC1609700rzU.AVATAR_LARGE, EnumC1609700rzU.AVATAR_300});

    public static final UrlModel LIZJ(UrlModel urlModel) {
        List<String> urlList;
        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || urlList.isEmpty()) {
            return null;
        }
        return urlModel;
    }

    public static final boolean LIZ(User user, User user2) {
        UrlModel avatarMedium;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (LIZIZ(user.getAvatarLarger(), user2.getAvatarLarger())) {
            linkedHashSet.add(EnumC1609700rzU.AVATAR_LARGE);
            avatarMedium = user.getAvatarLarger();
        } else {
            avatarMedium = null;
        }
        if (LIZIZ(user.getAvatar300(), user2.getAvatar300())) {
            linkedHashSet.add(EnumC1609700rzU.AVATAR_300);
            avatarMedium = user.getAvatar300();
        }
        if (LIZIZ(user.getAvatarThumb(), user2.getAvatarThumb())) {
            linkedHashSet.add(EnumC1609700rzU.AVATAR_THUMB);
            avatarMedium = user.getAvatarThumb();
        }
        if (LIZIZ(user.getAvatarMedium(), user2.getAvatarMedium())) {
            linkedHashSet.add(EnumC1609700rzU.AVATAR_MEDIUM);
            avatarMedium = user.getAvatarMedium();
        }
        if (avatarMedium != null) {
            Set<EnumC1609700rzU> set = LIZ;
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (true ^ linkedHashSet.contains(obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int i = C1609710rzV.LIZ[((EnumC1609700rzU) it2.next()).ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                user.setAvatar300(avatarMedium);
                            }
                        } else {
                            user.setAvatarThumb(avatarMedium);
                        }
                    } else {
                        user.setAvatarMedium(avatarMedium);
                    }
                } else {
                    user.setAvatarLarger(avatarMedium);
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(UrlModel urlModel, UrlModel urlModel2) {
        if (!Intrinsics.LJFF(urlModel, urlModel2) && LIZJ(urlModel) != null) {
            return true;
        }
        return false;
    }
}
