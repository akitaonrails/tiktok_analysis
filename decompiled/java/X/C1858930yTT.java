package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProductInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProductItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSearchInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0yTT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858930yTT implements InterfaceC1857900yRo, InterfaceC1587906Jp {
    public final TakoProductInfo LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final /* synthetic */ int LLILZ;

    @Override // X.InterfaceC1857900yRo
    public final boolean LJJLJ() {
        return false;
    }

    @Override // X.InterfaceC1857900yRo
    public final Integer LJLZ() {
        return Integer.valueOf(this.LLILZ + C1859250yTz.LJI());
    }

    @Override // X.InterfaceC1857900yRo
    public final String LJJL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1857900yRo
    public final boolean LLJL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1857900yRo
    public final TakoProductInfo getProductInfo() {
        return this.LL;
    }

    public C1858930yTT(List<TakoProductItem> list, TakoMixFeed takoMixFeed, int i) {
        String str;
        TakoSearchInfo takoSearchInfo;
        this.LLILZ = i;
        this.LL = new TakoProductInfo(list, false);
        if (takoMixFeed != null && (takoSearchInfo = takoMixFeed.searchInfo) != null) {
            str = takoSearchInfo.query;
        } else {
            str = null;
        }
        this.LLILLJJLI = str;
        this.LLILLL = true;
    }
}
