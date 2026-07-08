package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleUserInfoWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0aop, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949610aop {
    public static Pair LIZ(LinkMicBattleMessage linkMicBattleMessage, Long l) {
        List<BattleUserInfoWrapper> list;
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (LiveDirectMatchSetting.INSTANCE.isEnabled() && (list = linkMicBattleMessage.anchorInfo) != null && (!list.isEmpty())) {
            List<BattleUserInfoWrapper> list2 = linkMicBattleMessage.anchorInfo;
            if (list2 != null) {
                for (BattleUserInfoWrapper battleUserInfoWrapper : list2) {
                    Long l2 = battleUserInfoWrapper.userId;
                    if (l2 != null && l2.equals(l)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C954460awe c954460aweLIZ = C949620aoq.LIZ(battleUserInfoWrapper.userInfo);
                        if (c954460aweLIZ != null) {
                            arrayList.add(c954460aweLIZ);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("selfTeamMsgList, ");
                        sbLIZ.append(arrayList);
                        C20441214yg.LIZIZ("MessageConvertUtils", C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        C954460awe c954460aweLIZ2 = C949620aoq.LIZ(battleUserInfoWrapper.userInfo);
                        if (c954460aweLIZ2 != null) {
                            arrayList2.add(c954460aweLIZ2);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("rivalTeamMsgList, ");
                        sbLIZ2.append(arrayList2);
                        C20441214yg.LIZIZ("MessageConvertUtils", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
        } else {
            for (C954460awe c954460awe : C915980Zwa.LJII().LLILZLL(true)) {
                long j = c954460awe.LJ;
                if (l != null && j == l.longValue()) {
                    arrayList.add(c954460awe);
                } else {
                    arrayList2.add(c954460awe);
                }
            }
        }
        return new Pair(arrayList, arrayList2);
    }
}
