package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Htn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C455610Htn extends AbstractC455680Htu {
    public final String LIZJ;
    public final long LIZLLL;
    public final Long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C455610Htn)) {
            return false;
        }
        C455610Htn c455610Htn = (C455610Htn) obj;
        return Intrinsics.LJFF(this.LIZJ, c455610Htn.LIZJ) && this.LIZLLL == c455610Htn.LIZLLL && Intrinsics.LJFF(this.LJ, c455610Htn.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZJ.hashCode() * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        Long l = this.LJ;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoClick(photoId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", photoMsgId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", messageType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC455680Htu
    public final void LIZ(View view, MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility) {
        messageListQuotedMessageClickAbility.TQ0(view, this.LIZ, this.LJ, this.LIZJ);
    }

    public C455610Htn(long j, String str, Long l) {
        super(j, l);
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = l;
    }
}
