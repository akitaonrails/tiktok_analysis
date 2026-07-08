package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PzY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663020PzY implements InterfaceC645880PVa {
    public final SearchMixFeed LL;
    public EnumC663040Pza LLILLJJLI;
    public final C01GW LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C663020PzY)) {
            return false;
        }
        C663020PzY c663020PzY = (C663020PzY) obj;
        return Intrinsics.LJFF(this.LL, c663020PzY.LL) && this.LLILLJJLI == c663020PzY.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchAILivePhotoCardRenderData(item=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", curButtonClickedType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC645880PVa
    public final C650430PfF LLIZLLLIL() {
        return (C650430PfF) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC645880PVa
    public final boolean LLJJJIL() {
        return this.LLILZ;
    }

    public C663020PzY(SearchMixFeed searchMixFeed) {
        EnumC663040Pza enumC663040Pza = EnumC663040Pza.NONE;
        this.LL = searchMixFeed;
        this.LLILLJJLI = enumC663040Pza;
        this.LLILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1065));
        this.LLILZ = true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
