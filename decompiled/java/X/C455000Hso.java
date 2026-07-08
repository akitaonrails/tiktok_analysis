package X;

import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C455000Hso {
    public final C869590Y9l LIZ;
    public final FeatureAttachmentContent LIZIZ;
    public final FeatureAttachmentData LIZJ;
    public final C0I3C LIZLLL;

    public C455000Hso() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C455000Hso)) {
            return false;
        }
        C455000Hso c455000Hso = (C455000Hso) obj;
        return Intrinsics.LJFF(this.LIZ, c455000Hso.LIZ) && Intrinsics.LJFF(this.LIZIZ, c455000Hso.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c455000Hso.LIZJ) && this.LIZLLL == c455000Hso.LIZLLL;
    }

    public final int hashCode() {
        C869590Y9l c869590Y9l = this.LIZ;
        int iHashCode = (c869590Y9l == null ? 0 : c869590Y9l.hashCode()) * 31;
        FeatureAttachmentContent featureAttachmentContent = this.LIZIZ;
        int iHashCode2 = (iHashCode + (featureAttachmentContent == null ? 0 : featureAttachmentContent.hashCode())) * 31;
        FeatureAttachmentData featureAttachmentData = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (featureAttachmentData == null ? 0 : featureAttachmentData.hashCode())) * 31;
        C0I3C c0i3c = this.LIZLLL;
        return iHashCode3 + (c0i3c != null ? c0i3c.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplyContext(replyMessage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", jsonAttachment=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", templateAttachment=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", origin=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C455000Hso(C869590Y9l c869590Y9l, FeatureAttachmentContent featureAttachmentContent, FeatureAttachmentData featureAttachmentData, C0I3C c0i3c) {
        this.LIZ = c869590Y9l;
        this.LIZIZ = featureAttachmentContent;
        this.LIZJ = featureAttachmentData;
        this.LIZLLL = c0i3c;
    }
}
