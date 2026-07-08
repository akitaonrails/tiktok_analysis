package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Htr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C455650Htr extends AbstractC455680Htu {
    public final long LIZJ;
    public final Long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C455650Htr)) {
            return false;
        }
        C455650Htr c455650Htr = (C455650Htr) obj;
        return this.LIZJ == c455650Htr.LIZJ && Intrinsics.LJFF(this.LIZLLL, c455650Htr.LIZLLL);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZJ) * 31;
        Long l = this.LIZLLL;
        return iY2 + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultScroll(refMsgId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", messageType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C455650Htr(long j, Long l) {
        super(j, l);
        this.LIZJ = j;
        this.LIZLLL = l;
    }

    @Override // X.AbstractC455680Htu
    public final void LIZ(View view, MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility) {
        long j = this.LIZJ;
        messageListQuotedMessageClickAbility.KZ0(j, this.LIZLLL, j, j);
    }
}
