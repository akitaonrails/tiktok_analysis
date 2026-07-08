package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z3U, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z3U implements InterfaceC888430YtF {
    public final int LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final long LLIZ;
    public final int LLIZLLLIL;

    public final C0Z3U copy(int i, int i2, String str, boolean z, boolean z2, boolean z3, long j, int i3) {
        return new C0Z3U(i, i2, str, z, z2, z3, j, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Z3U)) {
            return false;
        }
        C0Z3U c0z3u = (C0Z3U) obj;
        return this.LL == c0z3u.LL && this.LLILLJJLI == c0z3u.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0z3u.LLILLL) && this.LLILZ == c0z3u.LLILZ && this.LLILZIL == c0z3u.LLILZIL && this.LLILZLL == c0z3u.LLILZLL && this.LLIZ == c0z3u.LLIZ && this.LLIZLLLIL == c0z3u.LLIZLLLIL;
    }

    public int hashCode() {
        return (((((((((((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Y2(this.LLIZ)) * 31) + this.LLIZLLLIL;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestEntranceChatListVOExtra(sessionType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", viewHolderType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isSupportMute=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isMute=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isCheckEmoji=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", conversationUpdatedAt=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC888430YtF
    public long getConversationUpdatedAt() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC888430YtF
    public int getPriority() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC888430YtF
    public String getSessionId() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC888430YtF
    public int getSessionType() {
        return this.LL;
    }

    @Override // X.InterfaceC888430YtF
    public int getViewHolderType() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC888430YtF
    public boolean isCheckEmoji() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC888430YtF
    public boolean isMute() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC888430YtF
    public boolean isSupportMute() {
        return this.LLILZ;
    }

    public C0Z3U(int i, int i2, String str, boolean z, boolean z2, boolean z3, long j, int i3) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
        this.LLIZ = j;
        this.LLIZLLLIL = i3;
    }
}
