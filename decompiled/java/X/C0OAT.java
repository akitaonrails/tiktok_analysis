package X;

import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OAT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OAT implements InterfaceC1891350zJl {
    public final TopicRawInfo LL;
    public final List<Position> LLILLJJLI;
    public final C2344009Gk LLILLL;
    public final Boolean LLILZ;
    public final String LLILZIL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        List<Position> list = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        C2344009Gk c2344009Gk = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c2344009Gk == null ? 0 : c2344009Gk.hashCode())) * 31;
        Boolean bool = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.LLILZIL;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopicInfoItem(topicRawInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", highlight=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", eventMapBuilder=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isKeyWordsEmpty=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", viewModelID=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return equals(interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return equals(interfaceC1891350zJl);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0OAT)) {
            return false;
        }
        C0OAT c0oat = (C0OAT) obj;
        if (!Intrinsics.LJFF(this.LL.type, c0oat.LL.type) || !Intrinsics.LJFF(this.LL.id, c0oat.LL.id)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0OAT(TopicRawInfo topicRawInfo, List<? extends Position> list, C2344009Gk c2344009Gk, Boolean bool, String str) {
        this.LL = topicRawInfo;
        this.LLILLJJLI = list;
        this.LLILLL = c2344009Gk;
        this.LLILZ = bool;
        this.LLILZIL = str;
    }

    public /* synthetic */ C0OAT(TopicRawInfo topicRawInfo, List list, C2344009Gk c2344009Gk, Boolean bool, String str, int i) {
        this(topicRawInfo, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : c2344009Gk, (i & 8) != 0 ? null : bool, (i & 16) == 0 ? str : null);
    }
}
