package X;

import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerVariant;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HlD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC450290HlD {
    void addFavouriteSticker(StickerItem stickerItem);

    void addStickerSet(StickerSetInfo stickerSetInfo);

    void addTypingRecommendation(String str, String str2, String str3, String str4, String str5);

    void cleanExpiredTypingRecommendationCache();

    C05YD<AbstractC450030Hkn<List<StickerSetInfo>>> getAddedStickerSetsFlow();

    Object getFavouriteSticker(String str, InterfaceC1364105Vn<? super StickerItem> interfaceC1364105Vn);

    C01S9<AbstractC450200Hl4> getFavouriteStickerUpdateFlow();

    C05YD<AbstractC450030Hkn<List<StickerItem>>> getFavouriteStickersFlow();

    C05YD<List<StickerItem>> getRecentStickersFlow();

    C05YD<AbstractC450030Hkn<List<SetSticker>>> getSetStickersFlow(long j);

    Object getTypingRecommendation(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super Pair<Long, String>> interfaceC1364105Vn);

    C01S9<StickerSetInfo> getUseStickerSetFlow();

    Object loadMoreFavouriteStickers(String str, InterfaceC1364105Vn<? super AbstractC450030Hkn<List<StickerItem>>> interfaceC1364105Vn);

    void refreshAddedStickerSets(boolean z, boolean z2, String str);

    void refreshFavouriteStickers(boolean z, boolean z2, String str);

    void refreshSetStickers(List<Long> list, String str);

    void removeFavouriteSticker(String str);

    List<SetSticker> searchSetStickers(String str);

    void updateAddedStickerSets(List<StickerSetInfo> list, Function0<Unit> function0, Function0<Unit> function02);

    void updateFavStickerVariant(long j, @StickerVariant int i);

    void useStickerSet(StickerSetInfo stickerSetInfo);
}
