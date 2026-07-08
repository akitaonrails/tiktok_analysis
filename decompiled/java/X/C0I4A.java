package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I4A, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I4A extends AbstractC455680Htu {
    public final C0I5R LIZJ;
    public final int LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I4A)) {
            return false;
        }
        C0I4A c0i4a = (C0I4A) obj;
        return Intrinsics.LJFF(this.LIZJ, c0i4a.LIZJ) && this.LIZLLL == c0i4a.LIZLLL && this.LJ == c0i4a.LJ;
    }

    public final int hashCode() {
        return (((this.LIZJ.hashCode() * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedDMQuickReplyClick(quotedVideoData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", refVideoAwemeType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", refMsgId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC455680Htu
    public final void LIZ(View view, MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility) {
        messageListQuotedMessageClickAbility.wz0(this.LJ, this.LIZIZ, view.getContext(), this.LIZLLL, this.LIZJ);
    }

    public C0I4A(C0I5R c0i5r, int i, long j) {
        super(j, Long.valueOf(1809));
        this.LIZJ = c0i5r;
        this.LIZLLL = i;
        this.LJ = j;
    }
}
