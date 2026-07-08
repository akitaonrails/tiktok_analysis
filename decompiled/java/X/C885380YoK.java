package X;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YoK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885380YoK {
    public final C05RV LIZ;
    public final String LIZIZ;
    public final Set<String> LIZJ;
    public final Map<String, String> LIZLLL;
    public final Map<String, List<Integer>> LJ;
    public final Map<String, List<Integer>> LJFF;

    public final Map<String, Object> LIZ() {
        return C2097608Jq.LJIIIIZZ(new Pair("inbox_mode", this.LIZ.getMobValue()), new Pair("tab_type", this.LIZIZ), new Pair("conversation_tags", C13LP.LLIIII(this.LIZJ)), new Pair("core_info_ext", this.LIZLLL), new Pair("peer_relation", this.LJ), new Pair("current_user_tags", this.LJFF));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C885380YoK)) {
            return false;
        }
        C885380YoK c885380YoK = (C885380YoK) obj;
        return this.LIZ == c885380YoK.LIZ && Intrinsics.LJFF(this.LIZIZ, c885380YoK.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c885380YoK.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c885380YoK.LIZLLL) && Intrinsics.LJFF(this.LJ, c885380YoK.LJ) && Intrinsics.LJFF(this.LJFF, c885380YoK.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMBusinessChatLabelMetaData(inboxMode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tabType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", conversationTags=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", coreInfoExt=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", peerRelation=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", currentUserTags=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C885380YoK() {
        this(C05RV.PERSONAL_INBOX, "", C08CX.INSTANCE, C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C885380YoK(C05RV c05rv, String str, Set<String> set, Map<String, String> map, Map<String, ? extends List<Integer>> map2, Map<String, ? extends List<Integer>> map3) {
        this.LIZ = c05rv;
        this.LIZIZ = str;
        this.LIZJ = set;
        this.LIZLLL = map;
        this.LJ = map2;
        this.LJFF = map3;
    }
}
