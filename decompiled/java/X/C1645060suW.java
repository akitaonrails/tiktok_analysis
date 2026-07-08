package X;

import com.ss.android.ugc.aweme.filter.FilterBean;

/* JADX INFO: renamed from: X.0suW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645060suW implements InterfaceC1453220nv6 {
    public final /* synthetic */ InterfaceC1645720sva LIZ;

    public C1645060suW(InterfaceC1645720sva interfaceC1645720sva) {
        this.LIZ = interfaceC1645720sva;
    }

    @Override // X.InterfaceC1453220nv6
    public final float LIZ(FilterBean filterBean) {
        float fLIZLLL = C1643880ssc.LIZLLL(filterBean);
        if (fLIZLLL == 0.0f) {
            return this.LIZ.LJLILLLLZI(filterBean.getFilterFolder());
        }
        return fLIZLLL;
    }
}
