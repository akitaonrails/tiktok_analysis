package X;

import com.ss.android.ugc.aweme.bean.MixRankSkylightItem;
import com.ss.android.ugc.aweme.bean.MixRankSkylightItemBizData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.story.inbox.ThoughtInboxItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596960rew implements InterfaceC1597070rf7 {
    public static final C1596960rew LIZ = new C1596960rew();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(19));
    public static final List<Integer> LIZJ = C1697810uHb.LJIIJJI(1, 2, 3);

    @Override // X.InterfaceC1597700rg8
    public final Object LIZJ(C1596730reZ c1596730reZ, InterfaceC1364105Vn<? super C1160260gIa<? extends InterfaceC1891350zJl>> interfaceC1364105Vn) {
        return C1597080rf8.LIZ(this, c1596730reZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0581  */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v51, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r34v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r34v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v11 */
    /* JADX WARN: Type inference failed for: r35v12 */
    /* JADX WARN: Type inference failed for: r35v13 */
    /* JADX WARN: Type inference failed for: r35v14 */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r35v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r52v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean] */
    @Override // X.InterfaceC1597070rf7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C1596730reZ r54, X.InterfaceC1364105Vn<? super java.util.Map<X.EnumC1597060rf6, ? extends X.C1160260gIa<? extends X.InterfaceC1891350zJl>>> r55) {
        /*
            Method dump skipped, instruction units count: 1790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596960rew.LIZLLL(X.0reZ, X.05Vn):java.lang.Object");
    }

    public static User LIZ(MixRankSkylightItem mixRankSkylightItem, String str, String str2, List list, Map map, Map map2) {
        ThoughtInfo thoughtInfo;
        User user;
        Long l;
        MixRankSkylightItemBizData mixRankSkylightItemBizData = mixRankSkylightItem.bizData;
        if (mixRankSkylightItemBizData == null || (thoughtInfo = mixRankSkylightItemBizData.thoughtInfo) == null || (user = mixRankSkylightItemBizData.user) == null) {
            return null;
        }
        String uid = user.getUid();
        if ((uid == null || uid.length() <= 0) && ((l = mixRankSkylightItem.userId) == null || (uid = l.toString()) == null || uid.length() <= 0 || uid == null)) {
            return null;
        }
        ThoughtInfo thoughtInfoCopy = thoughtInfo.copy(thoughtInfo.thoughtId, thoughtInfo.textContent, thoughtInfo.createTimeMs, thoughtInfo.privacySetting, thoughtInfo.interactionPreview, thoughtInfo.viewerInteraction, uid, thoughtInfo.isPublishing);
        if (Intrinsics.LJFF(uid, str2)) {
            if (!map2.containsKey(uid)) {
                map2.put(uid, thoughtInfoCopy);
            }
            return null;
        }
        if (map.containsKey(uid)) {
            return null;
        }
        map.put(uid, thoughtInfoCopy);
        user.setRequestId(str);
        ((ArrayList) list).add(new ThoughtInboxItem(user, thoughtInfoCopy, 5000, 0, -1, 0));
        return user;
    }
}
