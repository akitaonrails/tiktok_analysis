package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.ur.alias.IAliasService;

/* JADX INFO: renamed from: X.0iYU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247000iYU {
    public static final String LIZ(IMUser iMUser) {
        String uid = iMUser.getUid();
        if (uid != null) {
            return ((IAliasService) ServiceManager.get().getService(IAliasService.class)).LIZJ(uid);
        }
        return null;
    }

    public static final String LIZIZ(User user) {
        String uid = user.getUid();
        if (uid != null) {
            return ((IAliasService) ServiceManager.get().getService(IAliasService.class)).LIZJ(uid);
        }
        return null;
    }

    public static final String LIZJ(String str) {
        IAliasService iAliasService = (IAliasService) PluggableExtentionKt.pluggableSpi$default(IAliasService.class, false, false, false, 14, null);
        if (iAliasService != null) {
            return iAliasService.LIZJ(str);
        }
        return null;
    }

    public static final boolean LJ(User user) {
        if (LIZIZ(user) != null) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(Integer num, Integer num2) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canEnableAliasEntranceV3 - permission type ");
        sbLIZ.append(num);
        sbLIZ.append(", follow status ");
        sbLIZ.append(num2);
        C2188811AlT.LIZIZ(sbLIZ);
        int value = EnumC1247010iYV.FOLLOWER.getValue();
        if (num != null && num.intValue() != value) {
            if (num.intValue() == EnumC1247010iYV.FRIEND.getValue()) {
                if (num2 == null || num2.intValue() != 2) {
                    return false;
                }
            } else {
                if (num.intValue() != EnumC1247010iYV.NOBODY.getValue()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("canShowAliasEntrance incompatible permission type ");
                    sbLIZ2.append(num);
                    sbLIZ2.append(", follow status ");
                    sbLIZ2.append(num2);
                    C1720106oR.LJI("UserAlias", C2188811AlT.LIZIZ(sbLIZ2));
                    return false;
                }
                return false;
            }
        } else {
            if (num2 != null) {
                if (num2.intValue() == 1 || num2.intValue() == 4 || num2.intValue() == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
