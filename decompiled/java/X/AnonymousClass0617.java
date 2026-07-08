package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0617, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0617 implements InterfaceC1491305sd {
    public final C0YM2 LL;
    public final String LLILLJJLI;

    public final AnonymousClass0617 copy(C0YM2 c0ym2, String str) {
        return new AnonymousClass0617(c0ym2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0617)) {
            return false;
        }
        AnonymousClass0617 anonymousClass0617 = (AnonymousClass0617) obj;
        return this.LL == anonymousClass0617.LL && Intrinsics.LJFF(this.LLILLJJLI, anonymousClass0617.LLILLJJLI);
    }

    public int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationWrapperKey(bizId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C0YM2 getBizId() {
        return this.LL;
    }

    public final String getConversationId() {
        return this.LLILLJJLI;
    }

    public AnonymousClass0617(C0YM2 c0ym2, String str) {
        this.LL = c0ym2;
        this.LLILLJJLI = str;
    }
}
