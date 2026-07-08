package X;

import com.bytedance.android.livesdk.model.UserAttr;
import java.util.Map;

/* JADX INFO: renamed from: X.0JBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488040JBy {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(int i) {
        Boolean boolValueOf;
        UserAttr userAttrLIZ;
        Map<Integer, Integer> map;
        Integer num;
        UserAttr userAttrLIZ2 = C0KXJ.LIZ();
        if (userAttrLIZ2 != null) {
            boolValueOf = Boolean.valueOf(userAttrLIZ2.isAdmin);
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJJI(boolValueOf) || (userAttrLIZ = C0KXJ.LIZ()) == null || (map = userAttrLIZ.adminPermissions) == null || (num = map.get(Integer.valueOf(i))) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }
}
