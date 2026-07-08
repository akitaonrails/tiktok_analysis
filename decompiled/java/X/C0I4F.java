package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I4F, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I4F extends AbstractC455680Htu {
    public final C0I5R LIZJ;
    public final long LIZLLL;
    public final Long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I4F)) {
            return false;
        }
        C0I4F c0i4f = (C0I4F) obj;
        return Intrinsics.LJFF(this.LIZJ, c0i4f.LIZJ) && this.LIZLLL == c0i4f.LIZLLL && Intrinsics.LJFF(this.LJ, c0i4f.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZJ.hashCode() * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        Long l = this.LJ;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotedVideoClick(quotedVideoData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", refMsgId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", messageType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC455680Htu
    public final void LIZ(View view, MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility) {
        messageListQuotedMessageClickAbility.lC1(view, this.LIZLLL, this.LJ, this.LIZJ);
    }

    public C0I4F(C0I5R c0i5r, long j, Long l) {
        super(j, l);
        this.LIZJ = c0i5r;
        this.LIZLLL = j;
        this.LJ = l;
    }
}
