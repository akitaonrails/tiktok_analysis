package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01vi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C491201vi implements InterfaceC910720Zo6 {
    public final String LIZ;
    public final Long LIZIZ;
    public final Long LIZJ;
    public final AbstractC1623806Xk<List<C869590Y9l>> LIZLLL;
    public final AbstractC1623806Xk<List<C869590Y9l>> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C491201vi)) {
            return false;
        }
        C491201vi c491201vi = (C491201vi) obj;
        return Intrinsics.LJFF(this.LIZ, c491201vi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c491201vi.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c491201vi.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c491201vi.LIZLLL) && Intrinsics.LJFF(this.LJ, c491201vi.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Long l = this.LIZIZ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LIZJ;
        return ((((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupUnreadData(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", unreadCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", readIndex=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", unreadSelfMentionedMessages=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", unreadGroupOwnerMessages=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC910720Zo6
    public final String getConversationId() {
        return this.LIZ;
    }

    @Override // X.InterfaceC910720Zo6
    public final Long getReadIndex() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC910720Zo6
    public final Long getUnreadCount() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C491201vi(String str, Long l, Long l2, AbstractC1623806Xk<? extends List<? extends C869590Y9l>> abstractC1623806Xk, AbstractC1623806Xk<? extends List<? extends C869590Y9l>> abstractC1623806Xk2) {
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = l2;
        this.LIZLLL = abstractC1623806Xk;
        this.LJ = abstractC1623806Xk2;
    }
}
