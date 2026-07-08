package X;

import com.ss.android.ugc.aweme.feed.adapter.ad.DetailCommerceVideoViewHolder;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0S0B, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S0B extends C09AY implements Function1<C0RF0, C0SZ8> {
    public C0S0B() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SZ8 invoke(C0RF0 c0rf0) {
        C0RF0 c0rf02 = c0rf0;
        DetailCommerceVideoViewHolder detailCommerceVideoViewHolder = new DetailCommerceVideoViewHolder(c0rf02);
        C711750Rvx.LIZ(detailCommerceVideoViewHolder, c0rf02.LJII, c0rf02.LJIIIIZZ);
        return detailCommerceVideoViewHolder;
    }
}
