package X;

import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.operation.GroupChatConfig;
import com.ss.android.ugc.aweme.operation.GroupTypeRule;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06pg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1727806pg implements InterfaceC1732006qM {
    public static final C1727806pg LIZ = new C1727806pg();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1413));

    @Override // X.InterfaceC1732006qM
    public final boolean LIZ(String str, String str2, String str3, boolean z) {
        C0Y8T c0y8tLIZ;
        int i;
        Object next;
        if (str2 == null) {
            return false;
        }
        if (z) {
            c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str2);
        } else {
            c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str2);
        }
        if (c0y8tLIZ == null || !c0y8tLIZ.isGroupChat()) {
            return false;
        }
        int iLJFF = C1461005nk.LIZ.LJFF(Long.valueOf(C461720I8s.LIZJ()), c0y8tLIZ.getConversationId());
        if (iLJFF == -1 && Intrinsics.LJFF(str3, C461720I8s.LIZIZ())) {
            C0YAE member = c0y8tLIZ.getMember();
            iLJFF = member != null ? member.getRole() : -1;
        }
        if (iLJFF == C0Z9N.ADMIN.getValue()) {
            i = 4;
        } else if (iLJFF == C0Z9N.OWNER.getValue()) {
            i = 8;
        } else if (iLJFF == C0Z9N.ORDINARY.getValue()) {
            i = 2;
        } else {
            i = 0;
        }
        List listLIZIZ = C1554610qYd.LIZIZ(GScope.LL, GroupChatConfig.class, false);
        if (listLIZIZ == null) {
            listLIZIZ = C13BV.INSTANCE;
        }
        Iterator it2 = listLIZIZ.iterator();
        loop0: while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                GroupChatConfig groupChatConfig = (GroupChatConfig) next;
                if (Intrinsics.LJFF(groupChatConfig.C32(), str)) {
                    Map<Integer, Integer> mapPC2 = groupChatConfig.PC2();
                    if (!mapPC2.isEmpty()) {
                        for (Map.Entry<Integer, Integer> entry : mapPC2.entrySet()) {
                            LIZ.getClass();
                            GroupTypeRule groupTypeRule = (GroupTypeRule) ((Map) LIZIZ.getValue()).get(entry.getKey());
                            if (groupTypeRule != null && groupTypeRule.GE2(c0y8tLIZ) && (entry.getValue().intValue() & i) != 0) {
                                break loop0;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        GroupChatConfig groupChatConfig2 = (GroupChatConfig) next;
        if (groupChatConfig2 == null) {
            return false;
        }
        return groupChatConfig2.enable(str2);
    }
}
