package X;

import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I46, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I46 extends AbstractC455680Htu {
    public final String LIZJ;
    public final String LIZLLL;
    public final C869590Y9l LJ;
    public final long LJFF;
    public final Long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I46)) {
            return false;
        }
        C0I46 c0i46 = (C0I46) obj;
        return Intrinsics.LJFF(this.LIZJ, c0i46.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0i46.LIZLLL) && Intrinsics.LJFF(this.LJ, c0i46.LJ) && this.LJFF == c0i46.LJFF && Intrinsics.LJFF(this.LJI, c0i46.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Y2(this.LJFF)) * 31;
        Long l = this.LJI;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostClick(awemeId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", repostUid=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", refMsgId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", messageType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC455680Htu
    public final void LIZ(View view, MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility) {
        IIMMessageAdapterAnalytics iIMMessageAdapterAnalytics;
        messageListQuotedMessageClickAbility.S52(view.getContext(), this.LJ, this.LIZJ, this.LIZLLL);
        if (this.LJ.getMsgType() == 1817 && (iIMMessageAdapterAnalytics = (IIMMessageAdapterAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMessageAdapterAnalytics.class)) != null) {
            iIMMessageAdapterAnalytics.LJIILIIL(this.LJ, C0I0B.LJFF.LIZIZ(), "above_content");
        }
    }

    public C0I46(String str, String str2, C869590Y9l c869590Y9l, long j, Long l) {
        super(j, l);
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = c869590Y9l;
        this.LJFF = j;
        this.LJI = l;
    }
}
