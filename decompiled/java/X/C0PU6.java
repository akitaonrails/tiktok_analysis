package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import java.util.List;

/* JADX INFO: renamed from: X.0PU6, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PU6 extends AbstractC645560PTu {
    public static final List<EnumC645610PTz> LJIIIIZZ = C1697810uHb.LJIIJJI(EnumC645610PTz.PRODUCT_IN_PRODUCT_CARD, EnumC645610PTz.LIVE_IN_PRODUCT_CARD, EnumC645610PTz.VIDEO_IN_PRODUCT_CARD);
    public final ClickSearchViewModel LJII;

    @Override // X.AbstractC645560PTu
    public final ClickSearchViewModel LJ() {
        return this.LJII;
    }

    public C0PU6(ClickSearchViewModel clickSearchViewModel) {
        super(EnumC645610PTz.PRODUCT_IN_PRODUCT_CARD, clickSearchViewModel);
        this.LJII = clickSearchViewModel;
    }

    public final void LJIIIZ(String str, EnumC1999307sN enumC1999307sN) {
        this.LJII.DQ2(this.LIZJ);
        LJII(this.LIZIZ, str, this.LIZJ, null, LIZLLL(this.LIZ, null), null);
    }
}
