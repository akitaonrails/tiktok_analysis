package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I41, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I41 extends AbstractC455680Htu {
    public final String LIZJ;
    public final long LIZLLL;
    public final FeatureAttachmentContent LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I41)) {
            return false;
        }
        C0I41 c0i41 = (C0I41) obj;
        return Intrinsics.LJFF(this.LIZJ, c0i41.LIZJ) && this.LIZLLL == c0i41.LIZLLL && Intrinsics.LJFF(this.LJ, c0i41.LJ);
    }

    public final int hashCode() {
        String str = this.LIZJ;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        FeatureAttachmentContent featureAttachmentContent = this.LJ;
        return iHashCode + (featureAttachmentContent != null ? featureAttachmentContent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharedFeedClick(aid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", refMsgId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", attachment=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC455680Htu
    public final void LIZ(View view, MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility) {
        messageListQuotedMessageClickAbility.Zb1(view.getContext(), this.LIZJ, this.LJ);
    }

    public C0I41(String str, long j, FeatureAttachmentContent featureAttachmentContent) {
        super(j, Long.valueOf(1809));
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = featureAttachmentContent;
    }
}
