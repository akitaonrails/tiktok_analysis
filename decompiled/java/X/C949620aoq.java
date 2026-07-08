package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0aoq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949620aoq {
    public static final /* synthetic */ int LIZ = 0;

    public static C954460awe LIZ(BattleUserInfo battleUserInfo) {
        BattleBaseUserInfo battleBaseUserInfo;
        long jLongValue;
        if (battleUserInfo != null && (battleBaseUserInfo = battleUserInfo.user) != null) {
            Long l = battleBaseUserInfo.userId;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            C954460awe c954460awe = new C954460awe(jLongValue, battleBaseUserInfo.roomId);
            String str = battleBaseUserInfo.nickName;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = battleBaseUserInfo.displayId;
            if (str3 != null) {
                str2 = str3;
            }
            c954460awe.LJIJJ = new C754570Tip(str2, str, battleBaseUserInfo.avatarThumb);
            return c954460awe;
        }
        return null;
    }

    public static List LIZIZ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C954460awe c954460aweLIZ = LIZ((BattleUserInfo) it2.next());
            if (c954460aweLIZ != null) {
                arrayList.add(c954460aweLIZ);
            }
        }
        return arrayList;
    }
}
