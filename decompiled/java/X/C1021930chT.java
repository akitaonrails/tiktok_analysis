package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.api.FeedLiveRoomApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.response.BaseResponse;
import com.ss.android.ugc.aweme.live.response.Extra;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0chT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1021930chT {
    public static final C1021930chT LIZ = new C1021930chT();
    public static boolean LIZIZ;

    public static final boolean LIZ(final Context context, final Aweme aweme, final int i, final InterfaceC1022210chv interfaceC1022210chv) {
        long j;
        final IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
        if (!C1017070cZd.LLJI(aweme)) {
            return false;
        }
        if (LIZIZ) {
            return true;
        }
        final User author = aweme.getAuthor();
        if (author == null) {
            return false;
        }
        if (TextUtils.isEmpty(author.getUid())) {
            j = 0;
        } else {
            j = CastLongProtector.parseLong(author.getUid());
        }
        if (C1017070cZd.LLJIJIL(aweme)) {
            LIZIZ = true;
            FeedLiveRoomApi.LIZ.queryTopViewLiveRoomInfo(j, author.getSecUid()).enqueue(new InterfaceC594300NSq<BaseResponse<Room, Extra>>() { // from class: X.0chu
                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<BaseResponse<Room, Extra>> c0x9s, Throwable th) {
                    C1021930chT.LIZIZ = false;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2108208Ns.LIZ), null, null, new C435301mh(context, null), 3);
                    IAdSceneService iAdSceneService2 = iAdSceneService;
                    if (iAdSceneService2 != null && iAdSceneService2.LIZIZ() != null) {
                        C1022290ci3.LIZLLL(context, aweme, i);
                    }
                    Context context2 = context;
                    Aweme aweme2 = aweme;
                    C1019030ccn.LJJJJ(context2, "live_show_failed", aweme2, C1019030ccn.LJIIIZ(context2, aweme2));
                    C2184171Adz.LIZLLL("draw_ad", "live_show_failed", aweme.getAwemeRawAd()).LJIIIIZZ();
                }

                @Override // X.InterfaceC594300NSq
                public final void onResponse(C0X9S<BaseResponse<Room, Extra>> c0x9s, C0X52<BaseResponse<Room, Extra>> c0x52) {
                    boolean z;
                    String webUrl;
                    BaseResponse<Room, Extra> baseResponse;
                    Room room;
                    BaseResponse<Room, Extra> baseResponse2;
                    Room room2;
                    InterfaceC20673515v3 interfaceC20673515v3K4;
                    EnterRoomConfig enterRoomConfigLJJIZ;
                    Room room3;
                    AwemeSplashInfo splashInfo;
                    C1021930chT.LIZIZ = false;
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null && (splashInfo = awemeRawAd.getSplashInfo()) != null) {
                        splashInfo.hasUpdateLiving = true;
                    }
                    if (c0x52 != null && c0x52.LIZJ()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Long lValueOf = null;
                    if (z && (baseResponse = c0x52.LIZIZ) != null && (room = baseResponse.data) != null && room.getId() > 0 && (baseResponse2 = c0x52.LIZIZ) != null && (room2 = baseResponse2.data) != null && room2.getStatus() == 2) {
                        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (enterRoomConfigLJJIZ = interfaceC20673515v3K4.LJJIZ(c0x52.LIZIZ.data)) != null) {
                            User author2 = aweme.getAuthor();
                            if (author2 != null) {
                                BaseResponse<Room, Extra> baseResponse3 = c0x52.LIZIZ;
                                if (baseResponse3 != null && (room3 = baseResponse3.data) != null) {
                                    lValueOf = Long.valueOf(room3.getId());
                                }
                                author2.roomId = lValueOf.longValue();
                            }
                            C1019100ccu.LIZ(aweme, enterRoomConfigLJJIZ, i);
                            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().LJIIIIZZ(context, author, enterRoomConfigLJJIZ);
                            IAdSceneService iAdSceneService2 = iAdSceneService;
                            if (iAdSceneService2 != null && iAdSceneService2.LIZIZ() != null) {
                                C1022290ci3.LIZLLL(context, aweme, i);
                            }
                            C1019100ccu.LJFF();
                            return;
                        }
                        return;
                    }
                    User author3 = aweme.getAuthor();
                    if (author3 != null) {
                        author3.roomId = 0L;
                    }
                    if (i != 42) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2108208Ns.LIZ), null, null, new C435201mg(context, null), 3);
                    }
                    interfaceC1022210chv.LIZ();
                    Context context2 = context;
                    Aweme aweme2 = aweme;
                    C1019030ccn.LJJJJ(context2, "live_show_failed", aweme2, C1019030ccn.LJIIIZ(context2, aweme2));
                    C2184171Adz.LIZLLL("draw_ad", "live_show_failed", aweme.getAwemeRawAd()).LJIIIIZZ();
                    C1440005kM.LIZ(new C739360SzO(aweme.getAid(), i));
                    int i2 = i;
                    if (i2 != 2 && i2 != 1) {
                        return;
                    }
                    AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                    if (awemeRawAd2 != null && (webUrl = awemeRawAd2.getWebUrl()) != null && webUrl.length() != 0) {
                        return;
                    }
                    C1440005kM.LIZ(new C739510Szd(aweme.getAid()));
                }
            });
            return true;
        }
        User author2 = aweme.getAuthor();
        if (author2 == null || !author2.isLive()) {
            return false;
        }
        C1019110ccv.LIZIZ.LJIIIZ(context, aweme, i, null, true);
        return true;
    }
}
