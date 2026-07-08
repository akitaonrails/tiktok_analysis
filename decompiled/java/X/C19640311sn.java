package X;

import com.ss.android.ugc.aweme.ogc.news.sticker.IArticleStickerService;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerStorage;

/* JADX INFO: renamed from: X.11sn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19640311sn implements IArticleStickerService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C19641111sv());
    public final C557050Lt1 LIZIZ = new C557050Lt1(true);
    public final C01GW LIZJ = C452501pT.LIZIZ(new C19641011su(this));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C19617311p5());

    public final ArticleStickerStorage LIZ() {
        return (ArticleStickerStorage) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ogc.news.sticker.IArticleStickerService
    public final InterfaceC19603111mn getConsumer() {
        return (InterfaceC19603111mn) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ogc.news.sticker.IArticleStickerService
    public final InterfaceC19622811py getPublisher() {
        return (InterfaceC19622811py) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ogc.news.sticker.IArticleStickerService
    public final void clearCache() {
        LIZ().getClass();
        ArticleStickerStorage.LIZLLL.LIZIZ(null);
        ArticleStickerStorage.LJFF.LIZIZ(null);
        ArticleStickerStorage.LJII.LIZIZ(null);
        ArticleStickerStorage.LIZLLL().clear();
    }
}
