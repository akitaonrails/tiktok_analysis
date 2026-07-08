package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q39, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q39 implements InterfaceC1618170sD9<C0Q39> {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;

    public C0Q39() {
        this(0);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q39)) {
            return false;
        }
        C0Q39 c0q39 = (C0Q39) obj;
        return Intrinsics.LJFF(this.LL, c0q39.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0q39.LLILLJJLI) && this.LLILLL == c0q39.LLILLL && this.LLILZ == c0q39.LLILZ && this.LLILZIL == c0q39.LLILZIL && this.LLILZLL == c0q39.LLILZLL;
    }

    public final int hashCode() {
        return (((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("author_id", this.LL);
        linkedHashMap.put("group_id", this.LLILLJJLI);
        linkedHashMap.put("is_feed_liked", Boolean.valueOf(this.LLILLL));
        linkedHashMap.put("is_feed_collected", Boolean.valueOf(this.LLILZ));
        linkedHashMap.put("is_feed_comment_clicked", Boolean.valueOf(this.LLILZIL));
        linkedHashMap.put("is_feed_forward_clicked", Boolean.valueOf(this.LLILZLL));
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchVideoState(authorId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isFeedLiked=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isFeedCollected=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isFeedCommentClicked=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isFeedForwardClicked=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public /* synthetic */ C0Q39(int i) {
        this("", false, false, false, "", false);
    }

    public C0Q39(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = z4;
        C0P8T.LIZ();
    }
}
