package X;

import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.content.CommentContent;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I45, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I45 extends AbstractC455680Htu {
    public final C869590Y9l LIZJ;
    public final CommentContent LIZLLL;
    public final Long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I45)) {
            return false;
        }
        C0I45 c0i45 = (C0I45) obj;
        return Intrinsics.LJFF(this.LIZJ, c0i45.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0i45.LIZLLL) && Intrinsics.LJFF(this.LJ, c0i45.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode()) * 31;
        Long l = this.LJ;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentClick(message=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", messageType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC455680Htu
    public final void LIZ(View view, MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility) {
        IIMMessageAdapterAnalytics iIMMessageAdapterAnalytics;
        messageListQuotedMessageClickAbility.OI2(view, this.LIZJ, this.LIZLLL);
        if (this.LIZJ.getMsgType() == 40 && (iIMMessageAdapterAnalytics = (IIMMessageAdapterAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMessageAdapterAnalytics.class)) != null) {
            iIMMessageAdapterAnalytics.LJIILIIL(this.LIZJ, C0I0B.LJFF.LIZIZ(), "above_content");
        }
    }

    public C0I45(C869590Y9l c869590Y9l, CommentContent commentContent, Long l) {
        super(c869590Y9l.getRefMsgId(), l);
        this.LIZJ = c869590Y9l;
        this.LIZLLL = commentContent;
        this.LJ = l;
    }
}
