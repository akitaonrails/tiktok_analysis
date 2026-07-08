package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZGp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896930ZGp implements InterfaceC0148002o {
    public final C291001Au<C0IAV> LL;
    public final C291001Au<CharSequence> LLILLJJLI;

    public C896930ZGp() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C896930ZGp)) {
            return false;
        }
        C896930ZGp c896930ZGp = (C896930ZGp) obj;
        return Intrinsics.LJFF(this.LL, c896930ZGp.LL) && Intrinsics.LJFF(this.LLILLJJLI, c896930ZGp.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DetailFeedDMState(sendMessageEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", quickReplyEmojiEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C896930ZGp(int i) {
        this(new C291001Au(null), new C291001Au(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C896930ZGp(C291001Au<? extends C0IAV> c291001Au, C291001Au<? extends CharSequence> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
