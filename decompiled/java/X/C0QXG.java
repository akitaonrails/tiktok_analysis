package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.search.result.ui.HalfDynamicSearchShopFragment;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.List;

/* JADX INFO: renamed from: X.0QXG, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QXG implements InterfaceC664250Q3r {
    public final /* synthetic */ HalfDynamicSearchShopFragment LIZ;
    public final /* synthetic */ C0QXE LIZIZ;

    @Override // X.InterfaceC664250Q3r
    public final InterfaceC650130Pel LIZJ() {
        return null;
    }

    @Override // X.InterfaceC664250Q3r
    public final InterfaceC664230Q3p LIZ() {
        final HalfDynamicSearchShopFragment halfDynamicSearchShopFragment = this.LIZ;
        return new InterfaceC664230Q3p() { // from class: X.0QXD
            @Override // X.InterfaceC664230Q3p
            public final NextLiveData<Integer> LIZIZ() {
                return null;
            }

            @Override // X.InterfaceC664230Q3p
            public final int LIZJ(EnumC669620QOi enumC669620QOi) {
                return 0;
            }

            @Override // X.InterfaceC664230Q3p
            public final String LJ(int i) {
                return "";
            }

            @Override // X.InterfaceC664230Q3p
            public final int getInitIndex() {
                return 0;
            }

            @Override // X.InterfaceC664230Q3p
            public final List<String> LIZLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC664230Q3p
            public final String LIZ(int i) {
                SearchResultParam searchResultParam;
                C0QER searchEnterParam;
                EnumC669620QOi targetTab;
                String tabName;
                C0QXE c0qxe = halfDynamicSearchShopFragment.LLIZ;
                if (c0qxe == null || (searchResultParam = c0qxe.searchResultParam) == null || (searchEnterParam = searchResultParam.getSearchEnterParam()) == null || (targetTab = searchEnterParam.getTargetTab()) == null || (tabName = targetTab.getTabName()) == null) {
                    return "";
                }
                return tabName;
            }
        };
    }

    @Override // X.InterfaceC664250Q3r
    public final InterfaceC664240Q3q LIZIZ() {
        return new C0QXF(this.LIZIZ);
    }

    public C0QXG(HalfDynamicSearchShopFragment halfDynamicSearchShopFragment, C0QXE c0qxe) {
        this.LIZ = halfDynamicSearchShopFragment;
        this.LIZIZ = c0qxe;
    }
}
