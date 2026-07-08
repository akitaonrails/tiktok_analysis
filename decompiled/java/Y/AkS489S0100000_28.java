package Y;

import X.C0Z31;
import X.C10FX;
import X.C10MB;
import X.C10ME;
import X.C11LE;
import X.C11NZ;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1701940uOG;
import X.C1886290zBb;
import X.C1886330zBf;
import X.C1901110zZV;
import X.C1906030zhR;
import X.C1906060zhU;
import X.C19215710Fn;
import X.C19645011tY;
import X.C2252408s6;
import X.C259800zU;
import X.C890330YwJ;
import X.InterfaceC1487280oo2;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.game.model.FeedExtra;
import com.bytedance.android.livesdk.game.model.FeedItemList;
import com.bytedance.android.livesdk.game.model.ItemInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreateAccountModel;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceResponse;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerSettingsConfig;
import com.ss.android.ugc.aweme.partnership.model.GameMixHomeViewModel;
import com.ss.android.ugc.aweme.partnership.model.GameMixVideosViewModel;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.ss.android.ugc.aweme.video.model.SubOnlyVideoResponse;
import com.ss.android.ugc.aweme.video.model.SubOnlyVideoViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import webcast.api.game_station.GameDetailVideosRequest;
import webcast.api.game_station.GameDetailVideosResponse;

/* JADX INFO: loaded from: classes29.dex */
public class AkS489S0100000_28 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            default:
                return null;
        }
    }

    public AkS489S0100000_28(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS489S0100000_28 akS489S0100000_28, Object obj) {
        final String str = (String) obj;
        final FtcCreateAccountModel ftcCreateAccountModel = (FtcCreateAccountModel) akS489S0100000_28.l0;
        return new C11LE() { // from class: X.10eN
            @Override // X.C11LE
            public final void subscribe(C11M9<? super AbstractC995520c0s> c11m9) {
                AbstractC995520c0s c995510c0r;
                FtcCreateAccountModel.UpdateUserNameNetworkEntity updateUserNameNetworkEntity = (FtcCreateAccountModel.UpdateUserNameNetworkEntity) GsonProtectorUtils.fromJson(NetworkProxyAccount.LIZ.LJII(), str, FtcCreateAccountModel.UpdateUserNameNetworkEntity.class);
                ftcCreateAccountModel.getClass();
                FtcCreateAccountModel.UserNameDataEntity userNameDataEntity = updateUserNameNetworkEntity.data;
                int i = userNameDataEntity.errorCode;
                if (i == 0) {
                    c995510c0r = C995530c0t.LIZ;
                } else {
                    c995510c0r = new C995510c0r(i, userNameDataEntity.description);
                }
                c11m9.onNext(c995510c0r);
            }
        };
    }

    public static final Object apply$1(AkS489S0100000_28 akS489S0100000_28, Object obj) {
        Throwable th = (Throwable) obj;
        IMChatListApi.LJJIII.getClass();
        C0Z31 c0z31LJIIZILJ = C890330YwJ.LIZ().LJIIZILJ();
        if (c0z31LJIIZILJ != null) {
            c0z31LJIIZILJ.LJIIL("-1");
        }
        C1901110zZV c1901110zZV = (C1901110zZV) akS489S0100000_28.l0;
        InboxEntranceResponse inboxEntranceResponse = new InboxEntranceResponse(null, null, null, null, null, 0L, null, 0L);
        inboxEntranceResponse.status_code = C2252408s6.LJ(th);
        inboxEntranceResponse.error_code = C2252408s6.LIZIZ(th);
        inboxEntranceResponse.status_msg = C2252408s6.LJFF(th);
        inboxEntranceResponse.extra = C2252408s6.LIZLLL(th);
        c1901110zZV.LJII(inboxEntranceResponse);
        return C11NZ.LJJJJZ(new InboxEntranceResponse(null, null, null, null, null, 0L, null, 0L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$2(AkS489S0100000_28 akS489S0100000_28, Object obj) {
        ArrayList arrayList;
        List listLL;
        boolean z;
        FeedItemList feedItemList;
        FeedExtra feedExtra;
        FeedItemList feedItemList2;
        List<ItemInfo> list;
        FeedItemList feedItemList3;
        List<String> list2;
        List listLL2;
        BaseResponse baseResponse = (BaseResponse) obj;
        Gson gson = ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson();
        GameDetailVideosResponse.ResponseData responseData = (GameDetailVideosResponse.ResponseData) baseResponse.data;
        if (responseData != null && (feedItemList3 = responseData.items) != null && (list2 = feedItemList3.awemeDetails) != null && (listLL2 = C13LP.LL(list2, 20)) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(listLL2, 10));
            Iterator it2 = listLL2.iterator();
            while (it2.hasNext()) {
                arrayList.add(GsonProtectorUtils.fromJson(gson, (String) it2.next(), Aweme.class));
            }
        } else {
            arrayList = null;
        }
        List list3 = arrayList;
        if (arrayList == null) {
            list3 = C13BV.INSTANCE;
        }
        GameDetailVideosResponse.ResponseData responseData2 = (GameDetailVideosResponse.ResponseData) baseResponse.data;
        if (responseData2 == null || (feedItemList2 = responseData2.items) == null || (list = feedItemList2.items) == null || (listLL = C13LP.LL(list, 20)) == null) {
            listLL = C13BV.INSTANCE;
        }
        ((GameMixHomeViewModel) akS489S0100000_28.l0).getClass();
        C1886290zBb c1886290zBb = new C1886290zBb();
        GameDetailVideosResponse.ResponseData responseData3 = (GameDetailVideosResponse.ResponseData) baseResponse.data;
        if (responseData3 != null && (feedItemList = responseData3.items) != null && (feedExtra = feedItemList.extra) != null) {
            z = feedExtra.hasMore;
        } else {
            z = false;
        }
        return new C1886330zBf(list3, listLL, c1886290zBb, z);
    }

    public static final Object apply$3(AkS489S0100000_28 akS489S0100000_28, Object obj) {
        int iIntValue;
        SubOnlyVideoResponse subOnlyVideoResponse = (SubOnlyVideoResponse) obj;
        MutableLiveData<Integer> mutableLiveData = ((SubOnlyVideoViewModel) akS489S0100000_28.l0).LLJIJIL;
        Integer num = subOnlyVideoResponse.creatorSovStatus;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        mutableLiveData.postValue(Integer.valueOf(iIntValue));
        List<? extends Aweme> list = subOnlyVideoResponse.awemeList;
        SubOnlyVideoViewModel subOnlyVideoViewModel = (SubOnlyVideoViewModel) akS489S0100000_28.l0;
        return new C1906030zhR(list, new C1906060zhU(subOnlyVideoViewModel.LLILZLL, subOnlyVideoResponse.minTime, subOnlyVideoResponse.maxTime, subOnlyVideoViewModel.LLIZ, subOnlyVideoResponse.cursorNext), subOnlyVideoResponse.creatorSovStatus, subOnlyVideoResponse.hasMore);
    }

    public static final Object apply$4(AkS489S0100000_28 akS489S0100000_28, Object obj) throws InterruptedException {
        long jLongValue;
        String str = (String) obj;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C259800zU c259800zU = new C259800zU();
        C1701940uOG.LIZIZ().LIZIZ(new ARunnableS22S1300000_28((C19645011tY) akS489S0100000_28.l0, str, c259800zU, countDownLatch, 2));
        Long l = ArticleStickerSettingsConfig.LIZ().titleParseTimeoutTimeMs;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = Mp4ScreenVideoLoadTimeout.CONTROL;
        }
        countDownLatch.await(jLongValue, TimeUnit.MILLISECONDS);
        Object obj2 = c259800zU.element;
        if (obj2 == null) {
            obj2 = "";
        }
        return new Pair(str, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$5(AkS489S0100000_28 akS489S0100000_28, Object obj) {
        ((C259800zU) akS489S0100000_28.l0).element = obj;
        return C19215710Fn.LIZ();
    }

    public static final Object apply$6(AkS489S0100000_28 akS489S0100000_28, Object obj) {
        new WeakReference(((C10MB) akS489S0100000_28.l0).LIZLLL.LIZ.LIZIZ());
        return C11NZ.LJJJJZ(new C10ME((ITpcConsentService) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$7(AkS489S0100000_28 akS489S0100000_28, Object obj) {
        ArrayList arrayList;
        long j;
        List list;
        boolean z;
        FeedItemList feedItemList;
        FeedExtra feedExtra;
        FeedItemList feedItemList2;
        FeedItemList feedItemList3;
        List<String> list2;
        BaseResponse baseResponse = (BaseResponse) obj;
        Gson gson = ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson();
        GameDetailVideosResponse.ResponseData responseData = (GameDetailVideosResponse.ResponseData) baseResponse.data;
        if (responseData != null && (feedItemList3 = responseData.items) != null && (list2 = feedItemList3.awemeDetails) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(GsonProtectorUtils.fromJson(gson, it2.next(), Aweme.class));
            }
        } else {
            arrayList = null;
        }
        GameDetailVideosRequest gameDetailVideosRequest = ((GameMixVideosViewModel) akS489S0100000_28.l0).LLJILJILJ;
        GameDetailVideosResponse.ResponseData responseData2 = (GameDetailVideosResponse.ResponseData) baseResponse.data;
        if (responseData2 != null) {
            j = responseData2.score;
        } else {
            j = 0;
        }
        gameDetailVideosRequest.pullScore = j;
        if (responseData2 == null || (feedItemList2 = responseData2.items) == null || (list = feedItemList2.items) == null) {
            list = C13BV.INSTANCE;
        }
        C1886290zBb c1886290zBb = new C1886290zBb();
        if (responseData2 != null && (feedItemList = responseData2.items) != null && (feedExtra = feedItemList.extra) != null) {
            z = feedExtra.hasMore;
        } else {
            z = false;
        }
        return new C1886330zBf(arrayList, list, c1886290zBb, z);
    }

    public static final Object apply$8(AkS489S0100000_28 akS489S0100000_28, Object obj) {
        int iIntValue;
        Integer numLIZJ;
        C10FX c10fx = (C10FX) akS489S0100000_28.l0;
        if (c10fx != null && (numLIZJ = c10fx.LIZJ()) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        return Integer.valueOf(iIntValue);
    }
}
