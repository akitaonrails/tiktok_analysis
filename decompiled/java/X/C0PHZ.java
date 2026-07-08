package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PHZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PHZ extends C09AY implements Function1<C642240PHa, Unit> {
    public final /* synthetic */ SearchMixFeed LL;
    public final /* synthetic */ C0PSG LLILLJJLI;
    public final /* synthetic */ C0PHT LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PHZ(SearchMixFeed searchMixFeed, C0PSG c0psg, C0PHT c0pht, boolean z, boolean z2) {
        super(1);
        this.LL = searchMixFeed;
        this.LLILLJJLI = c0psg;
        this.LLILLL = c0pht;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C642240PHa c642240PHa) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        DynamicPatch dynamicPatch;
        C0PHI<T> config;
        C642240PHa c642240PHaLJFF;
        C642240PHa c642240PHa2 = c642240PHa;
        int i = 1;
        ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolLJFF = C0PH8.LJFF(this.LL, C0NMY.GENERAL_SEARCH, C651290Pgd.LIZLLL(), true);
        if (iSearchCardProtocolLJFF != null && (config = iSearchCardProtocolLJFF.getConfig()) != 0 && (c642240PHaLJFF = config.LJFF()) != null) {
            z = c642240PHaLJFF.LIZ;
        } else {
            z = false;
        }
        if (z || this.LL.getFeedType() == 65280 || this.LL.getFeedType() == 36 || ((((Boolean) C0BC0.LIZ.getValue()).booleanValue() && (dynamicPatch = this.LL.getDynamicPatch()) != null && Intrinsics.LJFF(dynamicPatch.getNeedDynamicPatchVideos(), Boolean.TRUE)) || ((C1839707Il.LIZ() || C0PM5.LIZIZ(this.LLILLJJLI) || (C0PM5.LIZ() && this.LLILLL.LJI())) && !C0PLR.LIZIZ(this.LL)))) {
            z2 = true;
        } else {
            z2 = false;
        }
        c642240PHa2.LIZ = z2;
        c642240PHa2.LIZIZ = this.LLILZ;
        if (this.LLILZIL || ((aweme3 = this.LL.getAweme()) != null && aweme3.isAd())) {
            z3 = false;
        } else {
            z3 = true;
        }
        c642240PHa2.LJIIIIZZ = z3;
        if (this.LLILZIL || ((aweme2 = this.LL.getAweme()) != null && aweme2.isAd())) {
            z4 = false;
        } else {
            z4 = true;
        }
        c642240PHa2.LJII = z4;
        if (this.LL.getFeedType() == 65280) {
            z5 = true;
        } else {
            z5 = false;
        }
        c642240PHa2.LJIIIZ = z5;
        boolean z6 = this.LLILZIL;
        c642240PHa2.LJFF = z6;
        c642240PHa2.LJI = z6;
        if (z6 || ((aweme = this.LL.getAweme()) != null && aweme.isAd() && !C1840607Iu.LIZ())) {
            i = 0;
        }
        c642240PHa2.LIZLLL = i;
        c642240PHa2.LJIIJ = this.LLILZIL;
        return Unit.LIZ;
    }
}
