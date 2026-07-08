package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565750qqb implements InterfaceC111300bX {
    public final String LL;
    public Aweme LLILLJJLI;
    public final String LLILLL;
    public String LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1565750qqb)) {
            return false;
        }
        C1565750qqb c1565750qqb = (C1565750qqb) obj;
        return Intrinsics.LJFF(this.LL, c1565750qqb.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1565750qqb.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1565750qqb.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1565750qqb.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Aweme aweme = this.LLILLJJLI;
        return ((((iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeatureVideoAwemeListInitData(selectedEffectId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedFeaturedVideo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectedAuthorID=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selectedVideoID=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1565750qqb() {
        this("", "", "", null);
    }

    public C1565750qqb(String str, String str2, String str3, Aweme aweme) {
        this.LL = str;
        this.LLILLJJLI = aweme;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }
}
