package X;

import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;

/* JADX INFO: renamed from: X.06tx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1754306tx implements FakeMsgContent {
    public final int LL;

    public C1754306tx() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1754306tx) && this.LL == ((C1754306tx) obj).LL;
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GoLiveFakeMsgContent(msgType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.FakeMsgContent
    public final int getMsgType() {
        return this.LL;
    }

    public C1754306tx(int i) {
        this.LL = 4082;
    }
}
