package X;

import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0f0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110670f0b {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(User user, C1142400fpm c1142400fpm) {
        int i;
        List<BadgeStruct> badgeList;
        String str;
        List<BadgeStruct> listLJII;
        List<BadgeStruct> list = null;
        if (c1142400fpm != null && (listLJII = c1142400fpm.LJII(user, null)) != null) {
            list = listLJII;
        } else if (user != null && (badgeList = user.getBadgeList()) != null && (!badgeList.isEmpty())) {
            list = badgeList;
        } else {
            i = 0;
            if (0 != 0) {
            }
            return i;
        }
        i = 0;
        for (BadgeStruct badgeStruct : list) {
            if (badgeStruct.badgeScene == 8) {
                try {
                    PrivilegeLogExtra privilegeLogExtra = badgeStruct.logExtra;
                    if (privilegeLogExtra != null && (str = privilegeLogExtra.level) != null) {
                        i = CastIntegerProtector.parseInt(str);
                    } else {
                        i = 0;
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
        return i;
    }
}
