package X;

import com.ss.android.ugc.aweme.feed.adapter.ad.CommerceVideoViewHolder;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0S04, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S04 extends C09AY implements Function1<C0RF0, C0SZ8> {
    public C0S04() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SZ8 invoke(C0RF0 c0rf0) {
        C0RF0 c0rf02 = c0rf0;
        CommerceVideoViewHolder commerceVideoViewHolder = new CommerceVideoViewHolder(c0rf02);
        C711750Rvx.LIZ(commerceVideoViewHolder, c0rf02.LJII, c0rf02.LJIIIIZZ);
        return commerceVideoViewHolder;
    }
}
