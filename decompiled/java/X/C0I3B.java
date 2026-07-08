package X;

import com.bytedance.ies.im.core.api.model.RichTextInfo;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I3B, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I3B implements Serializable {
    public final Long createTime;
    public final String draftContent;
    public final Long quotedMessageId;
    public final List<RichTextInfo> richTextInfoList;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I3B)) {
            return false;
        }
        C0I3B c0i3b = (C0I3B) obj;
        return Intrinsics.LJFF(this.draftContent, c0i3b.draftContent) && Intrinsics.LJFF(this.quotedMessageId, c0i3b.quotedMessageId) && Intrinsics.LJFF(this.richTextInfoList, c0i3b.richTextInfoList) && Intrinsics.LJFF(this.createTime, c0i3b.createTime);
    }

    public int hashCode() {
        String str = this.draftContent;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.quotedMessageId;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List<RichTextInfo> list = this.richTextInfoList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.createTime;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final boolean hasDraftData() {
        return C123100dR.LIZ(this.draftContent) || this.quotedMessageId != null || C866950Xzh.LIZIZ(this.richTextInfoList);
    }

    public final boolean hasDraftTextData() {
        return C123100dR.LIZ(this.draftContent) || C866950Xzh.LIZIZ(this.richTextInfoList);
    }

    public final boolean hasRichTextData() {
        return C123100dR.LIZ(this.draftContent) && C866950Xzh.LIZIZ(this.richTextInfoList);
    }

    public C0I3B(String str, Long l, List<RichTextInfo> list, Long l2) {
        this.draftContent = str;
        this.quotedMessageId = l;
        this.richTextInfoList = list;
        this.createTime = l2;
    }
}
