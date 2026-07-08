package X;

import Y.ACallableS412S0100000_4;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS10S1200000_4;
import Y.ARunnableS73S0200000_4;
import android.content.Context;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.performance.LiveColdBootApiOptConfig;
import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.android.starship.solaria.profile.IStarshipSolariaProfile;
import com.bytedance.android.starship.solaria.profile.StarshipSolariaProfile;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.experiment.LiveColdBootFirstTabApiOpt;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingResponse;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingResponseV2;
import com.ss.android.ugc.aweme.live.tab.LiveTabResponse;
import com.ss.android.ugc.aweme.notice.api.NoticeCountFetchManager$coldStartCombineRequest$1;
import com.ss.android.ugc.aweme.notice.api.ab.InboxNoticeCountStrategyExperiment;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.request_combine.UserSettingRequest;
import com.ss.android.ugc.aweme.request_combine.model.ComplianceSettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.LiveSettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.LiveSettingCombineModelV2;
import com.ss.android.ugc.aweme.request_combine.model.LiveTabCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.NoticeCountCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.PortraitCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.ShareSettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.UserSettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchComplianceSettingRequest;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchLiveSettingRequest;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchShareSettingRequest;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchUserSettingRequest;
import com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner;
import com.ss.android.ugc.aweme.setting.model.ShareSettings;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.simkit.model.hwdec.PlayerTypeAbConfigV2;
import com.ss.android.ugc.aweme.video.bitrate.RateSettingCombineModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0COq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312980COq implements IColdLaunchRequestCombiner {
    public static SettingCombineModel LIZIZ;
    public static final C312980COq LIZ = new C312980COq();
    public static final List<InterfaceC312970COp> LIZJ = new CopyOnWriteArrayList();
    public static final HashMap<String, AbstractC312990COr> LIZLLL = new HashMap<>();

    static {
        if (!C10EU.LJIILIIL() && (((InboxNoticeCountStrategyExperiment.MetaData) InboxNoticeCountStrategyExperiment.LIZIZ.getValue()).strategy & 2) != 2) {
            LIZJ(new AbstractC313010COt() { // from class: X.0CPz
                public BaseCombineMode LIZ;

                @Override // X.AbstractC312990COr
                public final Map LIZIZ() {
                    boolean zLJFF;
                    HashMap map = new HashMap();
                    map.put("source", "1");
                    map.put("ab_settings", C1901540zaC.LIZIZ());
                    if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LIZ() && ((Boolean) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZJ(Boolean.TRUE, "following_inbox_bubble_enable")).booleanValue()) {
                        map.put("need_hv_follow_count", "true");
                    }
                    if (C0CQ0.LIZ == null) {
                        synchronized (C0CQ0.class) {
                            try {
                                if (C0CQ0.LIZ == null) {
                                    C0CQ0.LIZ = new C0CQ0();
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                    int i = 0;
                    if (C0CQ0.LIZ != null) {
                        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "second_tab_last_status", true);
                        if (iLJIJ == 0) {
                            zLJFF = true;
                        } else if (iLJIJ == 1) {
                            zLJFF = false;
                        } else {
                            C844470XAv.LIZ.getClass();
                            zLJFF = ((InterfaceC1594010raB) C2419309dv.LIZ(C844470XAv.LIZ(), InterfaceC1594010raB.class)).LJFF();
                        }
                        if (zLJFF) {
                            i = 1;
                        }
                    }
                    map.put("second_tab_type", String.valueOf(i ^ 1));
                    map.put("follow_tab_position", String.valueOf(1));
                    C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
                    if (c19212010Ec.LLFFF()) {
                        map.put("need_latest_notice_time", "true");
                    }
                    if (c19212010Ec.LJJLIIIJL()) {
                        map.put("need_latest_unread_notice_time", "true");
                    }
                    return map;
                }

                @Override // X.AbstractC312990COr
                public final String LIZ() {
                    if (C0XQ7.LJFF().isLogin()) {
                        return "/aweme/v1/notice/count/";
                    }
                    return null;
                }

                @Override // X.AbstractC312990COr
                public final BaseCombineMode LIZJ() {
                    return this.LIZ;
                }

                @Override // X.AbstractC312990COr
                public final void LJ(C312960COo c312960COo) {
                    C0X4D.LIZ.getClass();
                    c312960COo.LIZ(new NoticeCountFetchManager$coldStartCombineRequest$1());
                }

                @Override // X.AbstractC313010COt
                public final void LJII(SettingCombineModel settingCombineModel) {
                    SettingCombineDataModel data;
                    NoticeCountCombineModel noticeCountCombineModel;
                    NoticeList noticeList;
                    NoticeList noticeList2;
                    if (((Boolean) C261630ANd.LIZ.getValue()).booleanValue()) {
                        Long latestUnreadNoticeTime = null;
                        if (settingCombineModel != null && (data = settingCombineModel.getData()) != null && (noticeCountCombineModel = data.noticeCountModel) != null && noticeCountCombineModel.httpCode == 200) {
                            Message messageObtain = Message.obtain();
                            messageObtain.obj = noticeCountCombineModel.getNoticeList();
                            messageObtain.what = 0;
                            C1903780zdo.LJII().LIZJ(messageObtain);
                            C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
                            Object messageObj = HandlerHook.getMessageObj(messageObtain.obj);
                            if (messageObj instanceof NoticeList) {
                                noticeList = (NoticeList) messageObj;
                            } else {
                                noticeList = null;
                            }
                            c19212010Ec.LJJLIIIIJ(noticeList);
                            Object messageObj2 = HandlerHook.getMessageObj(messageObtain.obj);
                            if ((messageObj2 instanceof NoticeList) && (noticeList2 = (NoticeList) messageObj2) != null) {
                                latestUnreadNoticeTime = noticeList2.getLatestUnreadNoticeTime();
                            }
                            c19212010Ec.LJJJJJL(latestUnreadNoticeTime);
                        }
                    }
                }

                @Override // X.AbstractC313010COt
                public final boolean LJIIIIZZ(SettingCombineModel settingCombineModel) {
                    NoticeCountCombineModel noticeCountCombineModel;
                    NoticeList noticeList;
                    SettingCombineDataModel data;
                    if (settingCombineModel != null && (data = settingCombineModel.getData()) != null) {
                        noticeCountCombineModel = data.noticeCountModel;
                    } else {
                        noticeCountCombineModel = null;
                    }
                    if (noticeCountCombineModel == null || (noticeList = noticeCountCombineModel.getNoticeList()) == null || noticeList.status_code != 0) {
                        return false;
                    }
                    this.LIZ = noticeCountCombineModel;
                    if (noticeCountCombineModel != null && noticeCountCombineModel.httpCode == 200) {
                        return true;
                    }
                    return false;
                }
            });
        }
        LIZJ(new AbstractC313010COt() { // from class: X.0COs
            public BaseCombineMode LIZ;

            @Override // X.AbstractC312990COr
            public final void LJ(C312960COo c312960COo) {
            }

            @Override // X.AbstractC313010COt
            public final void LJII(SettingCombineModel settingCombineModel) {
            }

            @Override // X.AbstractC312990COr
            public final String LIZ() {
                if (C291150Bb7.LIZ()) {
                    return "/aweme/v1/rate/settings/";
                }
                return null;
            }

            @Override // X.AbstractC312990COr
            public final BaseCombineMode LIZJ() {
                return this.LIZ;
            }

            @Override // X.AbstractC313010COt
            public final boolean LJIIIIZZ(SettingCombineModel settingCombineModel) {
                RateSettingCombineModel rateSettingCombineModel;
                RateSettingsResponse<PlayerTypeAbConfigV2> rateSetting;
                SettingCombineDataModel data;
                if (settingCombineModel != null && (data = settingCombineModel.getData()) != null) {
                    rateSettingCombineModel = data.rateSettingCombineModel;
                } else {
                    rateSettingCombineModel = null;
                }
                if (rateSettingCombineModel == null || (rateSetting = rateSettingCombineModel.getRateSetting()) == null || rateSetting.status_code != 0) {
                    return false;
                }
                this.LIZ = rateSettingCombineModel;
                if (rateSettingCombineModel != null && rateSettingCombineModel.httpCode == 200) {
                    return true;
                }
                return false;
            }
        });
        LIZJ(new AbstractC313010COt() { // from class: X.0CP5
            public BaseCombineMode LIZ;

            @Override // X.AbstractC312990COr
            public final String LIZ() {
                return "/aweme/v2/platform/share/settings/";
            }

            @Override // X.AbstractC312990COr
            public final BaseCombineMode LIZJ() {
                return this.LIZ;
            }

            @Override // X.AbstractC312990COr
            public final void LJ(C312960COo c312960COo) {
                c312960COo.LIZ(new FetchShareSettingRequest());
            }

            @Override // X.AbstractC313010COt
            public final void LJII(SettingCombineModel settingCombineModel) {
                SettingCombineDataModel data;
                ShareSettingCombineModel shareSettingCombineModel;
                if (settingCombineModel != null && (data = settingCombineModel.getData()) != null && (shareSettingCombineModel = data.shareSettingCombineModel) != null && shareSettingCombineModel.httpCode == 200) {
                    C313130CPf.LIZIZ().LIZ(shareSettingCombineModel.getShareSetting());
                }
            }

            @Override // X.AbstractC313010COt
            public final boolean LJIIIIZZ(SettingCombineModel settingCombineModel) {
                ShareSettingCombineModel shareSettingCombineModel;
                ShareSettings shareSetting;
                SettingCombineDataModel data;
                if (settingCombineModel != null && (data = settingCombineModel.getData()) != null) {
                    shareSettingCombineModel = data.shareSettingCombineModel;
                } else {
                    shareSettingCombineModel = null;
                }
                if (shareSettingCombineModel == null || (shareSetting = shareSettingCombineModel.getShareSetting()) == null || shareSetting.status_code != 0) {
                    return false;
                }
                this.LIZ = shareSettingCombineModel;
                if (shareSettingCombineModel != null && shareSettingCombineModel.httpCode == 200) {
                    return true;
                }
                return false;
            }
        });
        LIZJ(new AbstractC313010COt() { // from class: X.0COw
            public BaseCombineMode LIZ;

            @Override // X.AbstractC312990COr
            public final String LIZ() {
                if (C0XQ7.LJFF().isLogin()) {
                    return "/aweme/v1/user/settings/";
                }
                return null;
            }

            @Override // X.AbstractC312990COr
            public final BaseCombineMode LIZJ() {
                return this.LIZ;
            }

            @Override // X.AbstractC312990COr
            public final void LJ(C312960COo c312960COo) {
                c312960COo.LIZ(new FetchUserSettingRequest());
            }

            @Override // X.AbstractC313010COt
            public final void LJII(SettingCombineModel settingCombineModel) {
                SettingCombineDataModel data;
                UserSettingCombineModel userSettingCombineModel;
                if (settingCombineModel != null && (data = settingCombineModel.getData()) != null && (userSettingCombineModel = data.userSettingCombineModel) != null && userSettingCombineModel.httpCode == 200) {
                    PushSettings userSetting = userSettingCombineModel.getUserSetting();
                    C304790Bx7.LIZ.getClass();
                    int iLIZ = C304790Bx7.LIZ();
                    int i = C304790Bx7.LJ;
                    if ((iLIZ & i) == i) {
                        C799890VZj c799890VZj = new C799890VZj();
                        c799890VZj.LIZ(new UserSettingRequest.IdleTask(userSetting));
                        c799890VZj.LIZIZ();
                    } else if (((Boolean) C2269961Dt4.LIZJ.getValue()).booleanValue()) {
                        C823050WQl.LIZJ().execute(new ARunnableS104S0100000_4(userSetting, 35));
                    } else {
                        C315690CZb.LIZ(userSetting);
                    }
                }
            }

            @Override // X.AbstractC313010COt
            public final boolean LJIIIIZZ(SettingCombineModel settingCombineModel) {
                UserSettingCombineModel userSettingCombineModel;
                PushSettings userSetting;
                SettingCombineDataModel data;
                if (settingCombineModel != null && (data = settingCombineModel.getData()) != null) {
                    userSettingCombineModel = data.userSettingCombineModel;
                } else {
                    userSettingCombineModel = null;
                }
                if (userSettingCombineModel == null || (userSetting = userSettingCombineModel.getUserSetting()) == null || userSetting.status_code != 0) {
                    return false;
                }
                this.LIZ = userSettingCombineModel;
                if (userSettingCombineModel != null && userSettingCombineModel.httpCode == 200) {
                    return true;
                }
                return false;
            }
        });
        LIZJ(new AbstractC313010COt() { // from class: X.0CPJ
            public BaseCombineMode LIZ;

            @Override // X.AbstractC312990COr
            public final String LIZ() {
                return ((LiveColdBootApiOptConfig) C0CPM.LIZIZ.getValue()).settingsApiOptEnable ? "/webcast/setting/v2/" : "/webcast/setting/";
            }

            @Override // X.AbstractC312990COr
            public final Map LIZIZ() {
                HashMap map = new HashMap();
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().i4().LJIIJ(map);
                if (((LiveColdBootApiOptConfig) C0CPM.LIZIZ.getValue()).settingsApiOptEnable) {
                    boolean zLIZ = C0CPM.LIZ();
                    String string = C0CPM.LIZJ;
                    if (string == null) {
                        string = ((Keva) C0CPM.LIZ.getValue()).getString("live_seting_api_ver_ctr_code", null);
                    }
                    C0CPM.LIZJ = string;
                    map.put("force_full", String.valueOf(zLIZ));
                    if (string != null && !a0.LJJJIL(string)) {
                        map.put("client_setting_desc", string);
                    }
                }
                return map;
            }

            @Override // X.AbstractC312990COr
            public final boolean LIZLLL() {
                return ((LiveColdBootApiOptConfig) C0CPM.LIZIZ.getValue()).settingsApiOptEnable;
            }

            @Override // X.AbstractC312990COr
            public final BaseCombineMode LIZJ() {
                return this.LIZ;
            }

            @Override // X.AbstractC312990COr
            public final void LJ(C312960COo c312960COo) {
                c312960COo.LIZ(new FetchLiveSettingRequest(null));
            }

            @Override // X.AbstractC313010COt
            public final void LJII(SettingCombineModel settingCombineModel) {
                SettingCombineDataModel data;
                final LiveSettingCombineModel liveSettingCombineModel;
                SettingCombineDataModel data2;
                LiveSettingCombineModelV2 liveSettingCombineModelV2;
                if (((LiveColdBootApiOptConfig) C0CPM.LIZIZ.getValue()).settingsApiOptEnable) {
                    if (settingCombineModel != null && (data2 = settingCombineModel.getData()) != null && (liveSettingCombineModelV2 = data2.liveSettingV2) != null && liveSettingCombineModelV2.httpCode == 200) {
                        C823050WQl.LIZIZ().submit(new ARunnableS73S0200000_4(liveSettingCombineModelV2, ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4(), 26));
                        return;
                    }
                    return;
                }
                if (settingCombineModel == null || (data = settingCombineModel.getData()) == null || (liveSettingCombineModel = data.liveSetting) == null || liveSettingCombineModel.httpCode != 200) {
                    return;
                }
                final InterfaceC20318714ev interfaceC20318714evB4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4();
                C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.0CPI
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("CombineLiveSettingRequest@a548.doUpdateSettingV1$1");
                        try {
                            interfaceC20318714evB4.LJIIJ(liveSettingCombineModel.getLiveSetting());
                            liveSettingCombineModel.setLiveSetting(null);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("CombineLiveSettingRequest@a548.doUpdateSettingV1$1");
                    }
                });
            }

            @Override // X.AbstractC313010COt
            public final boolean LJIIIIZZ(SettingCombineModel settingCombineModel) {
                SettingCombineDataModel data;
                LiveSettingCombineModel liveSettingCombineModel;
                LiveSDKSettingResponse liveSetting;
                LiveSDKSettingResponse liveSetting2;
                SettingCombineDataModel data2;
                LiveSettingCombineModelV2 liveSettingCombineModelV2;
                LiveSDKSettingResponseV2 liveSetting3;
                LiveSDKSettingResponseV2 liveSetting4;
                if (((LiveColdBootApiOptConfig) C0CPM.LIZIZ.getValue()).settingsApiOptEnable) {
                    if (settingCombineModel == null || (data2 = settingCombineModel.getData()) == null || (liveSettingCombineModelV2 = data2.liveSettingV2) == null || (liveSetting3 = liveSettingCombineModelV2.getLiveSetting()) == null || liveSetting3.status_code != 0) {
                        return false;
                    }
                    this.LIZ = liveSettingCombineModelV2;
                    if (liveSettingCombineModelV2 == null || liveSettingCombineModelV2.httpCode != 200 || liveSettingCombineModelV2.getLiveSetting() == null || (liveSetting4 = liveSettingCombineModelV2.getLiveSetting()) == null || liveSetting4.status_code != 0) {
                        return false;
                    }
                } else {
                    if (settingCombineModel == null || (data = settingCombineModel.getData()) == null || (liveSettingCombineModel = data.liveSetting) == null || (liveSetting = liveSettingCombineModel.getLiveSetting()) == null || liveSetting.status_code != 0) {
                        return false;
                    }
                    this.LIZ = liveSettingCombineModel;
                    if (liveSettingCombineModel == null || liveSettingCombineModel.httpCode != 200 || liveSettingCombineModel.getLiveSetting() == null || (liveSetting2 = liveSettingCombineModel.getLiveSetting()) == null || liveSetting2.status_code != 0) {
                        return false;
                    }
                }
                return true;
            }

            @Override // X.AbstractC312990COr
            public final void LJFF(C312960COo c312960COo, Integer num) {
                if (num != null && num.intValue() == 404) {
                    c312960COo.LIZ(new FetchLiveSettingRequest(C0CPQ.V1));
                } else {
                    c312960COo.LIZ(new FetchLiveSettingRequest(null));
                }
            }
        });
        LIZJ(new AbstractC313010COt() { // from class: X.0CR4
            public BaseCombineMode LIZIZ;
            public boolean LIZJ;
            public int LIZLLL;
            public final String LIZ = "/aweme/v1/compliance/settings/";
            public String LJ = "";
            public int LJFF = -1;
            public String LJI = "";

            @Override // X.AbstractC312990COr
            public final String LIZ() {
                return this.LIZ;
            }

            @Override // X.AbstractC312990COr
            public final BaseCombineMode LIZJ() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC312990COr
            public final void LJ(C312960COo c312960COo) {
                if (!this.LIZJ) {
                    this.LIZLLL = -1;
                    this.LJFF = -10279;
                }
                c312960COo.LIZ(new FetchComplianceSettingRequest(C0CO3.IDLE));
                ComplianceServiceProvider.LJJI().LJJIIZI(this.LIZLLL, Integer.valueOf(this.LJFF), this.LJ, this.LJI, C2097908Jt.LIZJ(new Pair("scenario", "app_launch")));
                ComplianceServiceProvider.LJJI().LJIIIZ(null);
            }

            @Override // X.AbstractC313010COt
            public final void LJII(SettingCombineModel settingCombineModel) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0CRC(settingCombineModel, null), 3);
            }

            @Override // X.AbstractC313010COt
            public final boolean LJIIIIZZ(SettingCombineModel settingCombineModel) {
                ComplianceSettingCombineModel complianceSettingCombineModel;
                String str;
                BaseResponse.ServerTimeExtra serverTimeExtra;
                String str2;
                BaseResponse.ServerTimeExtra serverTimeExtra2;
                String str3;
                String imprId;
                String str4;
                SettingCombineDataModel data;
                this.LIZJ = true;
                ComplianceSetting complianceSetting = null;
                if (settingCombineModel != null && (data = settingCombineModel.getData()) != null) {
                    complianceSettingCombineModel = data.complianceSetting;
                    if (complianceSettingCombineModel != null) {
                        complianceSetting = complianceSettingCombineModel.getComplianceSetting();
                    }
                } else {
                    complianceSettingCombineModel = null;
                }
                String str5 = "";
                if (complianceSettingCombineModel != null && complianceSetting != null) {
                    int i = complianceSetting.status_code;
                    if (i != 0) {
                        this.LIZLLL = i;
                        this.LJFF = i;
                        String str6 = complianceSetting.status_msg;
                        if (str6 == null) {
                            str6 = "";
                        }
                        this.LJ = str6;
                        BaseResponse.ServerTimeExtra serverTimeExtra3 = complianceSetting.extra;
                        if (serverTimeExtra3 != null && (str4 = serverTimeExtra3.logid) != null) {
                            str5 = str4;
                        } else {
                            LogPbBean logPb = complianceSetting.getLogPb();
                            if (logPb != null && (imprId = logPb.getImprId()) != null) {
                                str5 = imprId;
                            }
                        }
                        this.LJI = str5;
                        return false;
                    }
                    this.LIZIZ = complianceSettingCombineModel;
                    if (complianceSettingCombineModel.httpCode == 200) {
                        return true;
                    }
                    this.LIZLLL = -1;
                    this.LJFF = -10278;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("An HTTP error occurred when fetching compliance settings. HttpCode: ");
                    sbLIZ.append(complianceSettingCombineModel.httpCode);
                    this.LJ = C2188811AlT.LIZIZ(sbLIZ);
                    if (settingCombineModel != null && (serverTimeExtra2 = settingCombineModel.extra) != null && (str3 = serverTimeExtra2.logid) != null) {
                        str5 = str3;
                    }
                    this.LJI = str5;
                    return false;
                }
                this.LIZLLL = -1;
                this.LJFF = -10277;
                if (settingCombineModel == null || (str = settingCombineModel.status_msg) == null) {
                    str = "";
                }
                this.LJ = str;
                if (settingCombineModel != null && (serverTimeExtra = settingCombineModel.extra) != null && (str2 = serverTimeExtra.logid) != null) {
                    str5 = str2;
                }
                this.LJI = str5;
                return false;
            }
        });
        if (LiveColdBootFirstTabApiOpt.INSTANCE.isEnable()) {
            LIZJ(new AbstractC313010COt() { // from class: X.0COx
                public final String LIZ = "/webcast/tab/";
                public BaseCombineMode LIZIZ;

                @Override // X.AbstractC312990COr
                public final Map LIZIZ() {
                    HashMap map = new HashMap();
                    map.put("live_entrance", "2");
                    return map;
                }

                @Override // X.AbstractC312990COr
                public final String LIZ() {
                    return this.LIZ;
                }

                @Override // X.AbstractC312990COr
                public final BaseCombineMode LIZJ() {
                    return this.LIZIZ;
                }

                @Override // X.AbstractC312990COr
                public final void LJ(C312960COo c312960COo) {
                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().ef();
                }

                @Override // X.AbstractC313010COt
                public final void LJII(SettingCombineModel settingCombineModel) {
                    List<ItemTab> list;
                    SettingCombineDataModel data;
                    LiveTabCombineModel liveTabCombineModel;
                    LiveTabResponse liveTab;
                    if (settingCombineModel != null && (data = settingCombineModel.getData()) != null && (liveTabCombineModel = data.liveTab) != null && (liveTab = liveTabCombineModel.getLiveTab()) != null) {
                        list = liveTab.data;
                    } else {
                        list = null;
                    }
                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().Xm(list);
                }

                @Override // X.AbstractC313010COt
                public final boolean LJIIIIZZ(SettingCombineModel settingCombineModel) {
                    LiveTabCombineModel liveTabCombineModel;
                    Integer numValueOf;
                    LiveTabResponse liveTab;
                    LiveTabResponse liveTab2;
                    SettingCombineDataModel data;
                    Integer numValueOf2 = null;
                    if (settingCombineModel != null && (data = settingCombineModel.getData()) != null) {
                        liveTabCombineModel = data.liveTab;
                    } else {
                        liveTabCombineModel = null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("webcast/tab isRequestSuccess: ");
                    sbLIZ.append(liveTabCombineModel);
                    sbLIZ.append(' ');
                    if (liveTabCombineModel != null && (liveTab2 = liveTabCombineModel.getLiveTab()) != null) {
                        numValueOf = Integer.valueOf(liveTab2.status_code);
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    sbLIZ.append(' ');
                    if (liveTabCombineModel != null) {
                        numValueOf2 = Integer.valueOf(liveTabCombineModel.httpCode);
                    }
                    sbLIZ.append(numValueOf2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (liveTabCombineModel == null || (liveTab = liveTabCombineModel.getLiveTab()) == null || liveTab.status_code != 0) {
                        return false;
                    }
                    this.LIZIZ = liveTabCombineModel;
                    if (liveTabCombineModel != null && liveTabCombineModel.httpCode == 200) {
                        return true;
                    }
                    return false;
                }
            });
        }
        if (((Boolean) C1103790epV.LIZIZ.getValue()).booleanValue() || !C2517709tn.LIZ) {
            return;
        }
        LIZJ(new AbstractC313010COt() { // from class: X.0CP6
            public BaseCombineMode LIZ;

            @Override // X.AbstractC312990COr
            public final String LIZ() {
                return "/tiktok/v1/efficiency_portrait/";
            }

            @Override // X.AbstractC312990COr
            public final Map LIZIZ() {
                HashMap map = new HashMap();
                IStarshipSolariaProfile iStarshipSolariaProfile = C0CP7.LIZ;
                map.put("group_list", "bitrate_selection,socket_dynamic_timeout_strategy,echo_smart_preload");
                return map;
            }

            @Override // X.AbstractC312990COr
            public final BaseCombineMode LIZJ() {
                return this.LIZ;
            }

            @Override // X.AbstractC312990COr
            public final void LJ(C312960COo c312960COo) {
                StarshipSolariaProfile.LJII();
            }

            @Override // X.AbstractC313010COt
            public final void LJII(SettingCombineModel settingCombineModel) {
                SettingCombineDataModel data;
                if (settingCombineModel != null && (data = settingCombineModel.getData()) != null && data.portraitCombineModel != null) {
                    StarshipSolariaProfile.LJII();
                }
            }

            @Override // X.AbstractC313010COt
            public final boolean LJIIIIZZ(SettingCombineModel settingCombineModel) {
                PortraitCombineModel portraitCombineModel;
                SettingCombineDataModel data;
                k portraitData = null;
                if (settingCombineModel != null && (data = settingCombineModel.getData()) != null) {
                    portraitCombineModel = data.portraitCombineModel;
                    if (portraitCombineModel != null) {
                        portraitData = portraitCombineModel.getPortraitData();
                    }
                } else {
                    portraitCombineModel = null;
                }
                if (portraitData == null) {
                    return false;
                }
                this.LIZ = portraitCombineModel;
                if (portraitCombineModel == null || portraitCombineModel.httpCode != 200) {
                    return false;
                }
                return true;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final BaseCombineMode getResponse() {
        AbstractC312990COr abstractC312990COr = LIZLLL.get("/aweme/v1/rate/settings/");
        if (abstractC312990COr != null) {
            return abstractC312990COr.LIZJ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final boolean LIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "combine_settings_req", true, true);
    }

    public static void LIZJ(AbstractC313010COt abstractC313010COt) {
        String strLIZ = abstractC313010COt.LIZ();
        if (strLIZ != null) {
            LIZLLL.put(strLIZ, abstractC313010COt);
        }
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final void LIZIZ(InterfaceC312970COp interfaceC312970COp) {
        if (interfaceC312970COp != null) {
            ((CopyOnWriteArrayList) LIZJ).add(interfaceC312970COp);
        }
    }

    public static void LIZLLL(String str, Integer num) {
        try {
            if (C036E.LIZ.LIZIZ()) {
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("errorCode", num);
                c2241008qG.LIZ.put("url", str);
                JSONObject jSONObjectLJ = c2241008qG.LJ();
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI("combine_settings_monitor_service", 2, jSONObjectLJ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJ(Context context, SettingCombineModel settingCombineModel) {
        BaseCombineMode baseCombineModeLIZJ;
        Integer numValueOf;
        Integer numValueOf2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C0CCS.LIZIZ) {
            System.currentTimeMillis();
            C15O7.LIZIZ(new ACallableS412S0100000_4(context, 11), C20684815ws.LJFF(), null);
            LIZIZ = settingCombineModel;
            C312960COo c312960COo = new C312960COo();
            for (Map.Entry<String, AbstractC312990COr> entry : LIZLLL.entrySet()) {
                C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS10S1200000_4(entry.getValue(), c312960COo, context, entry.getKey(), 0));
            }
            C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS104S0100000_4(c312960COo, 66));
            Iterator it2 = ((CopyOnWriteArrayList) LIZJ).iterator();
            while (it2.hasNext()) {
                C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS104S0100000_4((InterfaceC312970COp) it2.next(), 67));
            }
        } else {
            System.currentTimeMillis();
            Keva repoFromSp = KevaImpl.getRepoFromSp(context, "setting_repo_sp", 0);
            if (repoFromSp != null) {
                repoFromSp.storeInt("key_has_local_cache", 1);
            }
            LIZIZ = settingCombineModel;
            C312960COo c312960COo2 = new C312960COo();
            for (Map.Entry<String, AbstractC312990COr> entry2 : LIZLLL.entrySet()) {
                String key = entry2.getKey();
                AbstractC312990COr value = entry2.getValue();
                if (!value.LJI(LIZIZ) && ((baseCombineModeLIZJ = value.LIZJ()) == null || baseCombineModeLIZJ.httpCode != 509)) {
                    if (value.LIZLLL()) {
                        BaseCombineMode baseCombineModeLIZJ2 = value.LIZJ();
                        if (baseCombineModeLIZJ2 != null) {
                            numValueOf2 = Integer.valueOf(baseCombineModeLIZJ2.httpCode);
                        } else {
                            numValueOf2 = null;
                        }
                        value.LJFF(c312960COo2, numValueOf2);
                    } else {
                        value.LJ(c312960COo2);
                    }
                    BaseCombineMode baseCombineModeLIZJ3 = value.LIZJ();
                    if (baseCombineModeLIZJ3 != null) {
                        numValueOf = Integer.valueOf(baseCombineModeLIZJ3.httpCode);
                    } else {
                        numValueOf = null;
                    }
                    LIZLLL(key, numValueOf);
                }
            }
            c312960COo2.LIZIZ();
            Iterator it3 = ((CopyOnWriteArrayList) LIZJ).iterator();
            while (it3.hasNext()) {
                ((InterfaceC312970COp) it3.next()).LIZJ();
            }
        }
        C310770CGd.LIZ("system_launch").LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "ColdLaunchRequestCombiner:onCombineSuccess");
    }
}
