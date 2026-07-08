package X;

import com.ss.android.ugc.aweme.feed.adapter.ad.MidRollAdsVideoViewHolder;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rx8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712480Rx8 extends C09AY implements Function1<C0RF0, C0SZ8> {
    public C712480Rx8() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SZ8 invoke(C0RF0 c0rf0) {
        C0RF0 c0rf02 = c0rf0;
        MidRollAdsVideoViewHolder midRollAdsVideoViewHolder = new MidRollAdsVideoViewHolder(c0rf02);
        C711750Rvx.LIZ(midRollAdsVideoViewHolder, c0rf02.LJII, c0rf02.LJIIIIZZ);
        return midRollAdsVideoViewHolder;
    }
}
