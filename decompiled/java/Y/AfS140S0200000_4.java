package Y;

import X.AbstractC335880DEs;
import X.C05FZ;
import X.C09JN;
import X.C0CKO;
import X.C0CO9;
import X.C0COB;
import X.C0DF6;
import X.C0DFD;
import X.C0E48;
import X.C0LAB;
import X.C1033630d0L;
import X.C1389890mGx;
import X.C19EG;
import X.C1C7U;
import X.C20684815ws;
import X.C2097608Jq;
import X.C311600CJi;
import X.C311760CJy;
import X.C314660CVc;
import X.C331140CyW;
import X.C331200Cyc;
import X.C335870DEr;
import X.C336010DFf;
import X.C336020DFg;
import X.C336040DFi;
import X.C336060DFk;
import X.C344600Df8;
import X.C344610Df9;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC311620CJk;
import X.EnumC344640DfC;
import X.InterfaceC1034470d1h;
import X.InterfaceC1364105Vn;
import X.InterfaceC21374418ko;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.model.DoBStatus;
import com.ss.android.ugc.aweme.setting.ui.vm.VideoAuthorizationViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.tns.userrelation.block.api.UserBatchBlockResponse;
import com.ss.android.ugc.tiktok.tns.userrelation.block.ui.RemoveInactiveUserFragment;
import com.tiktok.ef.absettings.api.IABSettingsApi;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS45S0301000_18;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public class AfS140S0200000_4 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS140S0200000_4 afS140S0200000_4, Object obj) {
        C1C7U.LIZ("SettingManageMyAccountRouter@934e.open$3");
        SmartRoute smartRoute = (SmartRoute) afS140S0200000_4.l0;
        smartRoute.withParam("dob_status", (DoBStatus) obj);
        smartRoute.open();
        C786410Ut5.LJIIJ((DialogC1389620mGW) afS140S0200000_4.l1);
        C1C7U.LIZIZ("SettingManageMyAccountRouter@934e.open$3");
    }

    public static final void accept$1(AfS140S0200000_4 afS140S0200000_4, Object obj) {
        C1C7U.LIZ("SettingManageMyAccountRouter@934e.open$4");
        ((SmartRoute) afS140S0200000_4.l0).open();
        C786410Ut5.LJIIJ((DialogC1389620mGW) afS140S0200000_4.l1);
        C1C7U.LIZIZ("SettingManageMyAccountRouter@934e.open$4");
    }

    public static final void accept$10(AfS140S0200000_4 afS140S0200000_4, Object obj) {
        Fragment fragment;
        C19EG activity;
        C1C7U.LIZ("EcCompleteHandler@aa35.handle$1");
        C336060DFk c336060DFk = (C336060DFk) afS140S0200000_4.l0;
        C0DF6 c0df6 = (C0DF6) afS140S0200000_4.l1;
        c336060DFk.getClass();
        InterfaceC1034470d1h interfaceC1034470d1h = c0df6.LJI;
        if (interfaceC1034470d1h != null && (fragment = interfaceC1034470d1h.getFragment()) != null && (activity = fragment.getActivity()) != null) {
            activity.runOnUiThread(new ARunnableS73S0200000_4(c0df6, fragment, 34));
        }
        C1C7U.LIZIZ("EcCompleteHandler@aa35.handle$1");
    }

    public static final void accept$11(AfS140S0200000_4 afS140S0200000_4, Object obj) {
        boolean zAdd;
        C19EG activity;
        Fragment fragment;
        C1C7U.LIZ("EcPaymentCredentialRequestHandler@ba16.handle$1");
        C0DF6 c0df6 = (C0DF6) afS140S0200000_4.l0;
        ((C0DFD) afS140S0200000_4.l1).getClass();
        C336040DFi c336040DFi = C336040DFi.LIZ;
        String str = c0df6.LIZIZ;
        synchronized (c336040DFi) {
            zAdd = C336040DFi.LIZIZ.add(str);
        }
        if (zAdd) {
            C336020DFg c336020DFg = C336010DFf.LIZJ;
            c336020DFg.getClass();
            InterfaceC1034470d1h interfaceC1034470d1h = c0df6.LJI;
            if (interfaceC1034470d1h != null && (fragment = interfaceC1034470d1h.getFragment()) != null) {
                activity = fragment.getActivity();
            } else {
                activity = null;
            }
            String str2 = c0df6.LIZIZ;
            if (activity != null) {
                activity.runOnUiThread(new ARunnableS5S1300000_4(activity, c0df6, str2, c336020DFg, 5));
            }
            C336010DFf.LIZJ(c0df6);
        }
        C1C7U.LIZIZ("EcPaymentCredentialRequestHandler@ba16.handle$1");
    }

    public static final void accept$12(AfS140S0200000_4 afS140S0200000_4, Object obj) {
        C335870DEr c335870DEr;
        C1C7U.LIZ("EcPaymentCredentialRequestHandler@ba16.handle$2");
        AbstractC335880DEs abstractC335880DEs = (AbstractC335880DEs) obj;
        if ((abstractC335880DEs instanceof C335870DEr) && (c335870DEr = (C335870DEr) abstractC335880DEs) != null && !c335870DEr.LIZJ) {
            C0DF6 c0df6 = (C0DF6) afS140S0200000_4.l0;
            ((C0DFD) afS140S0200000_4.l1).getClass();
            C336010DFf.LIZIZ(c0df6);
        }
        C1C7U.LIZIZ("EcPaymentCredentialRequestHandler@ba16.handle$2");
    }

    public static final void accept$13(AfS140S0200000_4 afS140S0200000_4, Object obj) {
        C1C7U.LIZ("EcPaymentCredentialRequestHandler@ba16.handle$3");
        C0DF6 c0df6 = (C0DF6) afS140S0200000_4.l0;
        ((C0DFD) afS140S0200000_4.l1).getClass();
        C336010DFf.LIZIZ(c0df6);
        C1C7U.LIZIZ("EcPaymentCredentialRequestHandler@ba16.handle$3");
    }

    public static final void accept$14(AfS140S0200000_4 afS140S0200000_4, Object obj) {
        C1C7U.LIZ("AIMattingFetcher@f0c9.fetchAIMattingModels$disposable$1");
        Integer num = (Integer) obj;
        if (num == null || -1 != num.intValue()) {
            ((LifecycleCoroutineScope) afS140S0200000_4.l0).launchWhenResumed(new C314660CVc((C0E48) afS140S0200000_4.l1, null));
        }
        C1C7U.LIZIZ("AIMattingFetcher@f0c9.fetchAIMattingModels$disposable$1");
    }

    public static final void accept$15(AfS140S0200000_4 afS140S0200000_4, Object obj) {
        long j;
        String uid;
        C1C7U.LIZ("ListLiveCircleItemVM@a76e.refreshUserLiveStatus$1");
        Map map = (Map) obj;
        for (User user : (ArrayList) afS140S0200000_4.l0) {
            if (user.roomId != 0) {
                try {
                    uid = user.getUid();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (uid != null) {
                    j = CastLongProtector.parseLong(uid);
                } else {
                    j = 0;
                }
                Long l = (Long) map.get(Long.valueOf(j));
                if (l != null) {
                    long jLongValue = l.longValue();
                    if (jLongValue == 0 || jLongValue != user.roomId) {
                    }
                }
                user.roomId = 0L;
            }
        }
        ((ListLiveCircleItemVM) afS140S0200000_4.l1).LL.postValue(Boolean.TRUE);
        C1C7U.LIZIZ("ListLiveCircleItemVM@a76e.refreshUserLiveStatus$1");
    }

    public static final void accept$2(AfS140S0200000_4 afS140S0200000_4, Object obj) {
        C0CO9 c0co9 = (C0CO9) afS140S0200000_4.l0;
        IESSettingsProxy iESSettingsProxy = (IESSettingsProxy) afS140S0200000_4.l1;
        c0co9.getClass();
        C1C7U.LIZ("AbstractCommonSettingsWatcher@42b8.change$2L");
        C0COB c0cobLIZ = C0COB.LIZ();
        c0cobLIZ.getClass();
        synchronized (C0COB.class) {
            try {
                c0cobLIZ.LIZ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c0co9.LIZJ(iESSettingsProxy);
        C1C7U.LIZIZ("AbstractCommonSettingsWatcher@42b8.change$2L");
    }

    public static final void accept$3(AfS140S0200000_4 afS140S0200000_4, Object obj) {
        String string;
        C1C7U.LIZ("BlockLimitDialog@e498.clearInactiveAccounts$2");
        UserBatchBlockResponse userBatchBlockResponse = (UserBatchBlockResponse) obj;
        if (userBatchBlockResponse.status_code == 0) {
            if (userBatchBlockResponse.getClearCount() > 0) {
                ((C344610Df9) afS140S0200000_4.l0).LIZJ.storeLong("block_limit_dialog_timestamp", System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                C0LAB c0lab = new C0LAB();
                c0lab.LIZ(userBatchBlockResponse.getClearCount(), "accounts_removed");
                C20684815ws.LJIILLIIL("remove_inactive_account_success", c0lab.LIZ);
            } else {
                C20684815ws.onEventV3("remove_inactive_account_failed_0");
            }
            C344610Df9 c344610Df9 = (C344610Df9) afS140S0200000_4.l0;
            if (!c344610Df9.LIZIZ) {
                C1389890mGx c1389890mGx = new C1389890mGx((C19EG) afS140S0200000_4.l1);
                if (userBatchBlockResponse.getClearCount() > 0) {
                    string = ((C19EG) afS140S0200000_4.l1).getResources().getQuantityString(2131755113, userBatchBlockResponse.getClearCount(), Integer.valueOf(userBatchBlockResponse.getClearCount()));
                } else {
                    string = ((C19EG) afS140S0200000_4.l1).getString(2131827604);
                }
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
            } else {
                TuxSheet tuxSheet = c344610Df9.LIZ;
                if (tuxSheet != null) {
                    String str = RemoveInactiveUserFragment._pnsPageId;
                    tuxSheet.aS(C344600Df8.LIZ(userBatchBlockResponse.getClearCount(), "success"), false, EnumC344640DfC.SLIDE);
                }
            }
        }
        C1C7U.LIZIZ("BlockLimitDialog@e498.clearInactiveAccounts$2");
    }

    public static final void accept$4(AfS140S0200000_4 afS140S0200000_4, Object obj) {
        C1C7U.LIZ("BlockLimitDialog@e498.clearInactiveAccounts$3");
        C20684815ws.onEventV3("remove_inactive_account_failed");
        C344610Df9 c344610Df9 = (C344610Df9) afS140S0200000_4.l0;
        if (!c344610Df9.LIZIZ) {
            C1389890mGx c1389890mGx = new C1389890mGx((C19EG) afS140S0200000_4.l1);
            c1389890mGx.LJIIIZ(2131827603);
            c1389890mGx.LJIIJJI();
        } else {
            TuxSheet tuxSheet = c344610Df9.LIZ;
            if (tuxSheet != null) {
                String str = RemoveInactiveUserFragment._pnsPageId;
                tuxSheet.aS(C344600Df8.LIZ(0, "failed"), false, EnumC344640DfC.SLIDE);
            }
        }
        C1C7U.LIZIZ("BlockLimitDialog@e498.clearInactiveAccounts$3");
    }

    public static final void accept$5(AfS140S0200000_4 afS140S0200000_4, Object obj) throws JSONException {
        C1C7U.LIZ("FetchABSettingsTask@1710.run$result$6");
        C0CKO c0cko = (C0CKO) obj;
        try {
            C311600CJi c311600CJi = (C311600CJi) afS140S0200000_4.l0;
            if (c311600CJi != null) {
                c311600CJi.LJIIJ = SystemClock.elapsedRealtimeNanos() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            }
            C311760CJy.LIZIZ.LIZJ((Context) afS140S0200000_4.l1, c0cko.LIZ, (C311600CJi) afS140S0200000_4.l0, new IABSettingsApi.FetchCallback() { // from class: X.0CKN
                @Override // com.tiktok.ef.absettings.api.IABSettingsApi.FetchCallback
                public final void onAfterSaveToDB(n nVar, n nVar2) {
                }

                @Override // com.tiktok.ef.absettings.api.IABSettingsApi.FetchCallback
                public final void onBeforeSaveToDB() {
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C311600CJi c311600CJi2 = (C311600CJi) afS140S0200000_4.l0;
            if (c311600CJi2 != null) {
                c311600CJi2.LJI(EnumC311620CJk.DATA_STORE_FAILED);
                c311600CJi2.LJFF(th.toString());
                c311600CJi2.LIZJ();
            }
        }
        C1C7U.LIZIZ("FetchABSettingsTask@1710.run$result$6");
    }

    public static final void accept$6(AfS140S0200000_4 afS140S0200000_4, Object obj) {
        C1C7U.LIZ("BottombarFeedHelper@dc49.requestFeed$observable$1");
        C331140CyW c331140CyW = (C331140CyW) obj;
        ArrayList arrayList = new ArrayList();
        List<Aweme> list = c331140CyW.LIZIZ;
        final Map map = (Map) afS140S0200000_4.l1;
        for (final Aweme aweme : list) {
            arrayList.add(new InterfaceC21374418ko(aweme, map) { // from class: X.15eb
                public final Aweme LIZ;
                public final Map<String, String> LIZIZ;

                @Override // X.InterfaceC21374418ko
                public final List<String> LIZ() {
                    UrlModel cover;
                    List<String> urlList;
                    Video video = this.LIZ.getVideo();
                    return (video == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null) ? C13BV.INSTANCE : urlList;
                }

                @Override // X.InterfaceC21374418ko
                public final String LIZIZ() {
                    String userCountDes;
                    LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(this.LIZ);
                    return (newLiveRoomDataExt == null || (userCountDes = newLiveRoomDataExt.getUserCountDes()) == null) ? CardStruct.IStatusCode.DEFAULT : userCountDes;
                }

                @Override // X.InterfaceC21374418ko
                public final List<String> LIZJ() {
                    UrlModel avatarThumb;
                    List<String> urlList;
                    User author = this.LIZ.getAuthor();
                    return (author == null || (avatarThumb = author.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null) ? C13BV.INSTANCE : urlList;
                }

                @Override // X.InterfaceC21374418ko
                public final String LIZLLL() {
                    String nickname;
                    User author = this.LIZ.getAuthor();
                    return (author == null || (nickname = author.getNickname()) == null) ? "" : nickname;
                }

                @Override // X.InterfaceC21374418ko
                public final List<String> LJ() {
                    UrlModel avatarThumb;
                    List<String> urlList;
                    LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(this.LIZ);
                    if (newLiveRoomDataExt == null) {
                        return C13BV.INSTANCE;
                    }
                    User user = newLiveRoomDataExt.owner;
                    return (user == null || (avatarThumb = user.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null) ? C13BV.INSTANCE : urlList;
                }

                @Override // X.InterfaceC21374418ko
                public final List<String> LJFF() {
                    List<String> urlList;
                    LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(this.LIZ);
                    if (newLiveRoomDataExt == null) {
                        return C13BV.INSTANCE;
                    }
                    UrlModel urlModel = newLiveRoomDataExt.roomCover;
                    return (urlModel == null || (urlList = urlModel.getUrlList()) == null) ? C13BV.INSTANCE : urlList;
                }

                @Override // X.InterfaceC21374418ko
                public final String LJI() {
                    String desc = this.LIZ.getDesc();
                    return desc == null ? "" : desc;
                }

                @Override // X.InterfaceC21374418ko
                public final String LJII() {
                    String str;
                    LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(this.LIZ);
                    return (newLiveRoomDataExt == null || (str = newLiveRoomDataExt.title) == null) ? "" : str;
                }

                @Override // X.InterfaceC21374418ko
                public final Room LJIIIIZZ() {
                    LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(this.LIZ);
                    if (newLiveRoomDataExt == null) {
                        return new Room();
                    }
                    Room roomLIZ = C2175221ABc.LIZ(newLiveRoomDataExt);
                    return roomLIZ == null ? new Room() : roomLIZ;
                }

                @Override // X.InterfaceC21374418ko
                public final String LJIIIZ() {
                    AwemeStatistics statistics = this.LIZ.getStatistics();
                    return C1843500y4a.LIZIZ(statistics != null ? statistics.getDiggCount() : 0L);
                }

                @Override // X.InterfaceC21374418ko
                public final String LJIIJ() {
                    String authorUid = AwemeExtKt.getAuthorUid(this.LIZ);
                    return authorUid == null ? "" : authorUid;
                }

                @Override // X.InterfaceC21374418ko
                public final String LJIIJJI() {
                    User user;
                    String nickname;
                    LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(this.LIZ);
                    return (newLiveRoomDataExt == null || (user = newLiveRoomDataExt.owner) == null || (nickname = user.getNickname()) == null) ? "" : nickname;
                }

                @Override // X.InterfaceC21374418ko
                public final String getAwemeId() {
                    String aid = this.LIZ.getAid();
                    return aid == null ? "" : aid;
                }

                @Override // X.InterfaceC21374418ko
                public final boolean isLive() {
                    return AwemeSaaSExtKt.isLive(this.LIZ);
                }

                @Override // X.InterfaceC21374418ko
                public final Aweme getAweme() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC21374418ko
                public final Map<String, String> getLogExtra() {
                    return this.LIZIZ;
                }

                {
                    this.LIZ = aweme;
                    this.LIZIZ = map;
                }
            });
        }
        ((Function1) afS140S0200000_4.l0).invoke(new C331200Cyc(c331140CyW.LIZ, arrayList));
        C1C7U.LIZIZ("BottombarFeedHelper@dc49.requestFeed$observable$1");
    }

    public static final void accept$7(AfS140S0200000_4 afS140S0200000_4, Object obj) {
        C1C7U.LIZ("MixVideosViewModel@67cc.doLoadMoreOnPowerList$1");
        C05FZ c05fz = C05FZ.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("duration_ms", String.valueOf(System.currentTimeMillis() - C1033630d0L.LIZIZ)), new Pair("reason", "success"), new Pair(Scene.SCENE_SERVICE, "detail_page"));
        c05fz.getClass();
        C05FZ.LIZLLL(mapLJIIIIZZ);
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) afS140S0200000_4.l0;
        mixVideosViewModel.withState(new AwS45S0301000_18(3, (MixVideosResponse) obj, mixVideosViewModel, (InterfaceC1364105Vn) afS140S0200000_4.l1, 4));
        C1C7U.LIZIZ("MixVideosViewModel@67cc.doLoadMoreOnPowerList$1");
    }

    public static final void accept$8(AfS140S0200000_4 afS140S0200000_4, Object obj) {
        C1C7U.LIZ("VideoAuthorizationViewModel@114.fetchPageInfo$2");
        C1389890mGx c1389890mGx = new C1389890mGx((Activity) afS140S0200000_4.l0);
        c1389890mGx.LJIIJ(((Throwable) obj).getMessage());
        c1389890mGx.LJIIJJI();
        ((VideoAuthorizationViewModel) afS140S0200000_4.l1).LL.setValue(Boolean.FALSE);
        C1C7U.LIZIZ("VideoAuthorizationViewModel@114.fetchPageInfo$2");
    }

    public static final void accept$9(AfS140S0200000_4 afS140S0200000_4, Object obj) {
        C1C7U.LIZ("VideoAuthorizationViewModel@114.updatePageInfo$2");
        C1389890mGx c1389890mGx = new C1389890mGx((Activity) afS140S0200000_4.l0);
        c1389890mGx.LJIIJ(((Throwable) obj).getMessage());
        c1389890mGx.LJIIJJI();
        ((VideoAuthorizationViewModel) afS140S0200000_4.l1).LL.setValue(Boolean.FALSE);
        C1C7U.LIZIZ("VideoAuthorizationViewModel@114.updatePageInfo$2");
    }

    public AfS140S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
