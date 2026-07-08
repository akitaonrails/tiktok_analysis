package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.ComboBar;
import com.bytedance.android.livesdk.gift.model.FreqLimitGiftOption;
import com.bytedance.android.livesdk.gift.model.GiftChallengeProgress;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.RiskCtl;
import com.bytedance.android.livesdk.gift.model.SponsorshipInfo;
import com.bytedance.android.livesdk.model.Gift;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0fSt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1128210fSt {
    void addGalleryInfoUpdateListener(InterfaceC1128230fSv interfaceC1128230fSv);

    void cacheGiftListToMap(GiftListResult giftListResult, int i);

    boolean canSendGiftFree();

    void cancelGiftListRefresh(long j);

    int checkTabCanDisplay(int i);

    void clearCache();

    void clearFastGift(long j);

    void clearGiftMap();

    Gift findClosetGift(int i);

    Gift findGiftById(long j);

    long getCachedGiftListRoomId();

    ComboBar getComboBarById(long j);

    Gift getCommunityGift();

    Set<Long> getCurrentEffectSet();

    List<AbstractC1126600fQI<? extends AnonymousClass0054>> getCurrentGiftPanelList();

    List<GiftPage> getDataFromMemoryCache();

    Gift getFansClubJoinGift();

    Gift getFastGift(long j);

    ImageModel getFastGiftColorfulIcon(long j);

    ImageModel getFastGiftGreyIcon(long j);

    C177100m9 getFilterManager();

    long getFirstShowSubscribeGiftId();

    Map<Long, C1127130fR9> getFreqLimitInfoList();

    FreqLimitGiftOption getFreqLimitOption(Long l);

    C1127920fSQ getGalleryEntranceInfo();

    C1127820fSG getGalleryInfoMap(long j);

    InterfaceC1128430fTF getGalleryRepository();

    GiftChallengeProgress getGiftChallengeProgress();

    GiftsInfo getGiftIconInfo(long j);

    GiftListResult getGiftListResult();

    List<GiftPage> getGiftPageList();

    int getGiftPosition(long j);

    int getGiftPosition(String str);

    C1129650fVD getGiftRepository();

    EnumC1133020fae getGiftType(Integer num);

    String getGiftsHashString(Long l);

    boolean getIsGalleryAllSponsored(long j);

    Map<Integer, LinkedHashSet<Long>> getLockedGiftsMap();

    Long getMagicContainerId();

    List<Gift> getMatchGameGifts(int i);

    int getPollGiftIndex(long j);

    C1086850eOB getPollGifts();

    List<Gift> getPreDownloadEffectGiftList();

    int getTabByGiftId(long j);

    int getTabByGiftIdWithoutFirstRecharge(long j);

    int getTabLocation(int i);

    int getTabLocation(int i, boolean z);

    int getTabLocationByType(int i, boolean z);

    String getTabName(int i);

    String getTabNameByIndex(int i);

    int getTargetGiftDiamondCount(long j);

    RiskCtl getTargetRoomGiftRiskCtl(long j);

    C1118340fCy getTeamRankManager();

    Gift getUserLevelUpgradeGift();

    List<Gift> getVaultGifts();

    boolean hideBottomBar();

    boolean isDisableGalleryBannerForGift(Long l);

    boolean isDynamicGift(long j);

    boolean isEoy();

    boolean isGiftLimited(long j, long j2);

    boolean isInteractiveGift(long j);

    boolean isPollGift(long j);

    boolean isPreviouslySentGift(Long l);

    void onGiftListFail(Throwable th, long j, int i, boolean z, long j2, WeakReference<AbstractC1132980faa> weakReference, String str);

    void onGiftListSuccess(long j, long j2, boolean z, int i, C0WIY<GiftListResult, String> c0wiy, AbstractC1132980faa abstractC1132980faa, String str, String str2);

    void registerGiftListListener(InterfaceC1133110fan interfaceC1133110fan);

    void removeAllGalleryInfoListener();

    void removeGalleryInfoUpdateListener(InterfaceC1128230fSv interfaceC1128230fSv);

    void saveFastGifts(long j, List<Long> list);

    void setGiftChallengeProgress(GiftChallengeProgress giftChallengeProgress);

    void unRegisterGiftListListener(InterfaceC1133110fan interfaceC1133110fan);

    void updateFavoriteGift(List<GiftPage> list);

    void updateFreqList(long j, int i, long j2);

    void updateGalleryAllSponsored(long j, boolean z);

    void updateGalleryInfoMap(long j, SponsorshipInfo sponsorshipInfo);

    void updateGalleryInfoMap(long j, Map<Long, Gift.GiftSponsorInfo> map, boolean z, Pair<String, String> pair, ImageModel imageModel);

    void updateGalleryInfoMap(long j, Pair<String, String> pair);

    void updatePanelList(LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList);
}
