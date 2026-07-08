package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kzW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340640kzW implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final Aweme LLILZIL;
    public final String LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1340640kzW)) {
            return false;
        }
        C1340640kzW c1340640kzW = (C1340640kzW) obj;
        return Intrinsics.LJFF(this.LL, c1340640kzW.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1340640kzW.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1340640kzW.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1340640kzW.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1340640kzW.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1340640kzW.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        String str = this.LLILZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Aweme aweme = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        String str2 = this.LLILZLL;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentIntentionItem(text=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", buttonUrl=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", targetCid=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", targetAweme=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", postCommentContent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1340640kzW() {
        this(null, "", "", "", "", "");
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1340640kzW(Aweme aweme, String str, String str2, String str3, String str4, String str5) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = aweme;
        this.LLILZLL = str5;
    }
}
