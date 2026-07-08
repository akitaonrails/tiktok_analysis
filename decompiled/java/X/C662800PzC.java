package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreLiveV2Assem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PzC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662800PzC extends C09AY implements Function1<EnterRoomConfig, EnterRoomConfig> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ EcStoreLiveV2Assem LLILLJJLI;
    public final /* synthetic */ AddressCardProducts LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C662800PzC(boolean z, EcStoreLiveV2Assem ecStoreLiveV2Assem, AddressCardProducts addressCardProducts, String str) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = ecStoreLiveV2Assem;
        this.LLILLL = addressCardProducts;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final EnterRoomConfig invoke(EnterRoomConfig enterRoomConfig) {
        String str;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        EnterRoomConfig enterRoomConfig2 = enterRoomConfig;
        String str2 = "";
        if (this.LL) {
            EnterRoomConfig.ECWrapData eCWrapData = enterRoomConfig2.mECData;
            eCWrapData.autoOpenProductBag = 1;
            C661010PwJ c661010PwJ = this.LLILLJJLI.LLJZIJLIL;
            if (c661010PwJ == null || (searchMixFeedBase = c661010PwJ.LL) == null || (eComShopCardStruct = searchMixFeedBase.shopCard) == null || (str = eComShopCardStruct.roomId) == null) {
                str = "";
            }
            eCWrapData.autoOpenProductBagTrackParams = C1741890vQh.LJIIIIZZ(C662810PzD.LJ(null, "", str, false, c661010PwJ, C1558520qew.LJIIL(this.LLILLJJLI), true));
        } else {
            AddressCardProducts addressCardProducts = this.LLILLL;
            if (addressCardProducts != null) {
                EcStoreLiveV2Assem ecStoreLiveV2Assem = this.LLILLJJLI;
                enterRoomConfig2.mRoomsData.extraSchema = C662810PzD.LJI(addressCardProducts, false, ecStoreLiveV2Assem.LLJZIJLIL, null, C1558520qew.LJIIL(ecStoreLiveV2Assem), ecStoreLiveV2Assem.getContext(), EnumC657940PrM.GENERAL_SEARCH_STORE_CARD);
            }
        }
        try {
            str2 = ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this.LLILLJJLI), ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C662810PzD.LIZ(enterRoomConfig2, this.LLILLJJLI.LLJZIJLIL, str2);
        String str3 = this.LLILZ;
        if (str3 != null) {
            enterRoomConfig2.mLogData.sourceBtmToken = str3;
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig2.mRoomsData;
        roomsData.enterMethod = "live_cover";
        roomsData.actionType = "click";
        roomsData.enterType = "click";
        return enterRoomConfig2;
    }
}
