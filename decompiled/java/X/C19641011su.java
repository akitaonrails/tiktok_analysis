package X;

import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerConfigResponse;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerSettingsConfig;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerStorage;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11su, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19641011su extends C09AY implements Function0<C19640011sk> {
    public final /* synthetic */ C19640311sn LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19641011su(C19640311sn c19640311sn) {
        super(0);
        this.LL = c19640311sn;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.11sk] */
    @Override // kotlin.jvm.functions.Function0
    public final C19640011sk invoke() {
        final C19640311sn c19640311sn = this.LL;
        return new InterfaceC19622811py() { // from class: X.11sk
            @Override // X.InterfaceC19622811py
            public final void LIZ() {
                c19640311sn.LIZ().getClass();
                C0NJD<Boolean> c0njd = ArticleStickerStorage.LJFF;
                Boolean bool = Boolean.TRUE;
                c0njd.LIZIZ(bool);
                ArticleStickerStorage.LJI.postValue(bool);
                C11S5.LIZ().LIZIZ(new Runnable() { // from class: X.11so
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ArticleStickerStorage@913a.markEntranceClicked$1");
                        try {
                            ArticleStickerStorage.LIZ.getClass();
                            Keva kevaLIZLLL = ArticleStickerStorage.LIZLLL();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("STORAGE_KEY_ARTICLE_STICKER_ENTRANCE_CLICKED_");
                            sbLIZ.append(ArticleStickerStorage.LIZ());
                            kevaLIZLLL.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ArticleStickerStorage@913a.markEntranceClicked$1");
                    }
                });
            }

            @Override // X.InterfaceC19622811py
            public final void LIZJ() {
                c19640311sn.LIZ().getClass();
                C11S5.LIZ().LIZIZ(new Runnable() { // from class: X.11sp
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ArticleStickerStorage@913a.markStickerReEditGuideShown$1");
                        try {
                            ArticleStickerStorage.LJII.LIZIZ(Boolean.TRUE);
                            ArticleStickerStorage.LIZ.getClass();
                            ArticleStickerStorage.LIZLLL().storeBoolean("STORAGE_KEY_ARTICLE_STICKER_RE_EDIT_GUIDE_SHOWN", true);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ArticleStickerStorage@913a.markStickerReEditGuideShown$1");
                    }
                });
            }

            @Override // X.InterfaceC19622811py
            public final boolean LJ() {
                c19640311sn.LIZ().getClass();
                Object objLIZ = ArticleStickerStorage.LJII.LIZ();
                if (objLIZ == null) {
                    try {
                        boolean z = ArticleStickerStorage.LIZLLL().getBoolean("STORAGE_KEY_ARTICLE_STICKER_RE_EDIT_GUIDE_SHOWN", false);
                        ArticleStickerStorage.LJFF.LIZIZ(Boolean.valueOf(z));
                        objLIZ = Boolean.valueOf(z);
                        C189200o6.m2constructorimpl(objLIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        objLIZ = new C098200Yq(th);
                        C189200o6.m2constructorimpl(objLIZ);
                    }
                    if (C189200o6.m7isFailureimpl(objLIZ)) {
                        objLIZ = null;
                    }
                }
                return !Intrinsics.LJFF(objLIZ, Boolean.TRUE);
            }

            @Override // X.InterfaceC19622811py
            public final boolean LJI() {
                if (c19640311sn.LIZIZ.LIZIZ()) {
                    C19640311sn c19640311sn2 = c19640311sn;
                    synchronized (this) {
                        try {
                            if (c19640311sn2.LIZIZ.LIZIZ()) {
                                ArticleStickerStorage articleStickerStorageLIZ = c19640311sn2.LIZ();
                                Boolean bool = Boolean.FALSE;
                                articleStickerStorageLIZ.getClass();
                                ArticleStickerStorage.LJFF(bool);
                                c19640311sn2.LIZIZ.LIZJ(false);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                c19640311sn.LIZ().getClass();
                ArticleStickerConfigResponse articleStickerConfigResponseLIZJ = ArticleStickerStorage.LIZJ();
                if (articleStickerConfigResponseLIZJ != null) {
                    return Intrinsics.LJFF(articleStickerConfigResponseLIZJ.isEnable, Boolean.TRUE);
                }
                return false;
            }

            @Override // X.InterfaceC19622811py
            public final boolean LIZIZ() {
                return C108200b2.LIZ();
            }

            @Override // X.InterfaceC19622811py
            public final boolean LJII() {
                Integer num = ArticleStickerSettingsConfig.LIZ().enableStickerImageSafeRect;
                return num == null || num.intValue() == 1;
            }

            @Override // X.InterfaceC19622811py
            public final C19641611t0 LIZLLL(FrameLayout frameLayout) {
                return new C19641611t0(frameLayout, c19640311sn.LIZ());
            }

            @Override // X.InterfaceC19622811py
            public final boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
                CreativeModel creativeModel;
                CreativeModel creativeModel2;
                ImageAlbumData imageAlbumData;
                List<SingleImageData> imageList;
                List<ArticleStickerModel> articleStickers;
                ImageAlbumData imageAlbumData2;
                ImageStickerInfoNewEngine stickerInfoNewEngine;
                List<ArticleStickerModel> articleStickers2;
                StickerNewEngineModel stickerNewEngineModel;
                List<ArticleStickerModel> list;
                if (videoPublishEditModel == null) {
                    return false;
                }
                CreativeModel creativeModel3 = videoPublishEditModel.creativeModel;
                if ((creativeModel3 == null || (stickerNewEngineModel = creativeModel3.stickerModel) == null || (list = stickerNewEngineModel.articleStickers) == null || !(!list.isEmpty())) && ((creativeModel = videoPublishEditModel.creativeModel) == null || (imageAlbumData2 = creativeModel.imageAlbumModel) == null || (stickerInfoNewEngine = imageAlbumData2.getStickerInfoNewEngine()) == null || (articleStickers2 = stickerInfoNewEngine.getArticleStickers()) == null || !(!articleStickers2.isEmpty()))) {
                    if (videoPublishEditModel == null || (creativeModel2 = videoPublishEditModel.creativeModel) == null || (imageAlbumData = creativeModel2.imageAlbumModel) == null || (imageList = imageAlbumData.getImageList()) == null) {
                        return false;
                    }
                    for (SingleImageData singleImageData : imageList) {
                        ImageStickerInfoNewEngine stickerInfoNewEngine2 = singleImageData.getStickerInfoNewEngine();
                        if (stickerInfoNewEngine2 != null && (articleStickers = stickerInfoNewEngine2.getArticleStickers()) != null && (!articleStickers.isEmpty())) {
                            if (singleImageData == null) {
                                return false;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }
        };
    }
}
