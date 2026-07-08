package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;

/* JADX INFO: renamed from: X.0QXF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QXF implements InterfaceC664240Q3q {
    public final /* synthetic */ C0QXE LIZ;

    @Override // X.InterfaceC664240Q3q
    public final String LLIIIL() {
        return "";
    }

    @Override // X.InterfaceC664240Q3q
    public final void LLIIIZ() {
    }

    @Override // X.InterfaceC664240Q3q
    public final String LLIIJI() {
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // X.InterfaceC664240Q3q
    public final void LLIIJLIL(EnumC664210Q3n enumC664210Q3n) {
    }

    @Override // X.InterfaceC664240Q3q
    public final void LLIIL(Context context, SearchResultParam searchResultParam) {
    }

    @Override // X.InterfaceC664240Q3q
    public final boolean LLIILII(EnumC664210Q3n enumC664210Q3n) {
        return false;
    }

    @Override // X.InterfaceC664240Q3q
    public final C0QER LLIIIJ() {
        SearchResultParam searchResultParam = this.LIZ.searchResultParam;
        if (searchResultParam != null) {
            return searchResultParam.getSearchEnterParam();
        }
        return null;
    }

    public C0QXF(C0QXE c0qxe) {
        this.LIZ = c0qxe;
    }
}
