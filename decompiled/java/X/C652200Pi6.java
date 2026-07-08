package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.ui.SearchLiveCollectionAssem;

/* JADX INFO: renamed from: X.0Pi6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652200Pi6 implements InterfaceC653420Pk4 {
    public final /* synthetic */ SearchLiveCollectionAssem LIZ;

    @Override // X.InterfaceC653420Pk4
    public final void LIZIZ() {
        SearchLiveCollectionAssem searchLiveCollectionAssem = this.LIZ;
        C0PUF c0puf = searchLiveCollectionAssem.LLL;
        if (c0puf != null) {
            c0puf.LJI(0);
        } else {
            C0PUV.LIZ(searchLiveCollectionAssem.ep().pm());
        }
    }

    public C652200Pi6(SearchLiveCollectionAssem searchLiveCollectionAssem) {
        this.LIZ = searchLiveCollectionAssem;
    }

    @Override // X.InterfaceC653420Pk4
    public final void LIZ(Aweme aweme) {
        String aid;
        C0PUF c0puf;
        C0PUF c0puf2 = this.LIZ.LLL;
        if (c0puf2 != null) {
            c0puf2.LIZ(0, aweme, "");
        }
        if (aweme != null && (aid = aweme.getAid()) != null && (c0puf = this.LIZ.LLL) != null) {
            c0puf.LJIIIZ(aid, EnumC1999307sN.CLICK);
        }
    }
}
