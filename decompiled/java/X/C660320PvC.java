package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PvC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660320PvC implements InterfaceC660330PvD {
    public final boolean LL;
    public final Aweme LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;
    public final String LLILZIL;
    public final SearchResultParam LLILZLL;
    public boolean LLIZ;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECVideoItem(isRefresh=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", searchId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", imprId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", searchResultParam=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null) {
            return aweme.hashCode();
        }
        return 0;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C660320PvC) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C660320PvC) interfaceC1891350zJl).LLILLJJLI);
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C660320PvC) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C660320PvC) obj).LLILLJJLI);
        }
        return super.equals(obj);
    }

    public C660320PvC(boolean z, Aweme aweme, String str, int i, String str2, SearchResultParam searchResultParam) {
        this.LL = z;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = str2;
        this.LLILZLL = searchResultParam;
    }
}
