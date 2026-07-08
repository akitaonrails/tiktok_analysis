package X;

import android.app.Application;
import android.text.TextUtils;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.shortvideo.AVAweme;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.subtitle.FeedbackBody;
import com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleApi;
import com.ss.android.ugc.aweme.sticker.data.AutocaptionType;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.aweme.tools.sticker.core.liveshare.LiveShareStickerModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.text.a0;
import lth.o;

/* JADX INFO: renamed from: X.0nZB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439630nZB implements InterfaceC1433360nP4<CreateBaseAwemeResponse> {
    public final int LL;
    public Object LLILLJJLI;
    public final CountDownLatch LLILLL = new CountDownLatch(2);

    @Override // X.InterfaceC1433360nP4
    public final void LIZLLL(String str) {
    }

    @Override // X.InterfaceC1433360nP4
    public final void LJ() {
    }

    @Override // X.InterfaceC1433360nP4
    public final void LJFF(int i, C1434900nRY c1434900nRY) {
    }

    public C1439630nZB(int i, BaseShortVideoContext baseShortVideoContext) {
        this.LL = i;
        this.LLILLJJLI = baseShortVideoContext;
    }

    @Override // X.InterfaceC1433360nP4
    public final void LIZIZ(C1434650nR9 c1434650nR9, PublishModel publishModel) {
        BaseShortVideoContext baseShortVideoContext;
        VideoPublishEditModel videoPublishEditModel;
        if (publishModel != null) {
            this.LLILLJJLI = publishModel.editModel;
        }
        C863370Xtv.LIZ("normal").LIZ(1);
        if (this.LL == 0) {
            Object obj = this.LLILLJJLI;
            if ((obj instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) obj) != null) {
                LJI(videoPublishEditModel, Integer.valueOf(c1434650nR9.getOriginErrorCode()), false);
            } else {
                return;
            }
        }
        C1439650nZD c1439650nZD = C1439650nZD.LIZ;
        C1439650nZD.LIZJ = false;
        C1439650nZD.LJFF = false;
        c1439650nZD.LIZJ(false);
        if (publishModel != null && (baseShortVideoContext = publishModel.editModel) != null) {
            C572660Md6 c572660Md6 = new C572660Md6(baseShortVideoContext);
            if (!c572660Md6.LIZIZ) {
                if (((Boolean) C262820ARs.LIZ.getValue()).booleanValue()) {
                    if (publishModel.LIZJ()) {
                        C1439640nZC.LIZ.getClass();
                        String draftPrimaryKey = publishModel.editModel.getDraftPrimaryKey();
                        if (draftPrimaryKey != null) {
                            boolean z = publishModel.isStoryPublish;
                            if (!ComplianceServiceProvider.LJFF().LIZJ(1) && ((Boolean) C2547209yY.LIZJ.getValue()).booleanValue() && (publishModel.videoType != 11 || C0C64.LJIILLIIL().LJIIIZ(31744, "studio_image_album_publish_auto_retry", true, false))) {
                                C0CHQ.LIZ().getPublishService().LJIIL();
                                if (C1436830nUf.LJIILIIL(draftPrimaryKey, z)) {
                                    return;
                                }
                            }
                        }
                        C0CHQ.LIZ().getPublishService().LJIIL();
                        C1436830nUf.LJIJI(c572660Md6);
                        return;
                    }
                    return;
                }
                C0CHQ.LIZ().getPublishService().LJIIL();
                C1436830nUf.LJIJI(c572660Md6);
            }
        }
    }

    public static void LJI(VideoPublishEditModel videoPublishEditModel, Integer num, boolean z) {
        LiveShareStickerModel next;
        String string;
        long jLongValue;
        Long lLJIILIIL;
        Iterator<LiveShareStickerModel> it2 = videoPublishEditModel.creativeModel.stickerModel.liveShareStickerModels.iterator();
        String string2 = null;
        if (it2.hasNext()) {
            next = it2.next();
        } else {
            next = null;
        }
        LiveShareStickerModel liveShareStickerModel = next;
        if (liveShareStickerModel != null) {
            String str = "1";
            if (z) {
                String roomId = liveShareStickerModel.getRoomId();
                LiveRoomStruct liveRoomStruct = liveShareStickerModel.getLiveRoomStruct();
                if (liveRoomStruct != null) {
                    string2 = Long.valueOf(liveRoomStruct.getAnchorId()).toString();
                }
                boolean z2 = C486660J6q.LIZ;
                int iLJII = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().LJII();
                HashMap map = new HashMap();
                map.put("room_id", roomId);
                map.put("anchor_id", string2);
                if (iLJII <= 0) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_guest_connection", str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(iLJII);
                sbLIZ.append("");
                map.put("guest_cnt", C2188811AlT.LIZIZ(sbLIZ));
                C20684815ws.LJIILLIIL("livesdk_multi_share_story_publish", map);
            } else {
                String roomId2 = liveShareStickerModel.getRoomId();
                LiveRoomStruct liveRoomStruct2 = liveShareStickerModel.getLiveRoomStruct();
                if (liveRoomStruct2 != null) {
                    string = Long.valueOf(liveRoomStruct2.getAnchorId()).toString();
                } else {
                    string = null;
                }
                if (num != null) {
                    string2 = num.toString();
                }
                boolean z3 = C486660J6q.LIZ;
                int iLJII2 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().LJII();
                HashMap map2 = new HashMap();
                map2.put("room_id", roomId2);
                map2.put("anchor_id", string);
                map2.put("error_code", string2);
                if (iLJII2 <= 0) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                map2.put("is_guest_connection", str);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(iLJII2);
                sbLIZ2.append("");
                map2.put("guest_cnt", C2188811AlT.LIZIZ(sbLIZ2));
                C20684815ws.LJIILLIIL("livesdk_multi_share_story_publish_fail", map2);
            }
            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            String roomId3 = liveShareStickerModel.getRoomId();
            if (roomId3 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(roomId3)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            iLiveOuterService.c4(jLongValue, true, z);
        }
    }

    @Override // X.InterfaceC1433360nP4
    public final void LIZJ(CreateBaseAwemeResponse createBaseAwemeResponse, boolean z, PublishModel publishModel) {
        String str;
        BaseShortVideoContext baseShortVideoContext;
        VideoPublishEditModel videoPublishEditModel;
        boolean zIsSaveLocalWithWaterMark;
        String localSilentSharePath;
        AVUploadSaveModel saveModel;
        VideoPublishEditModel videoPublishEditModel2;
        String str2;
        InteractStickerStruct interactStickerStruct;
        CaptionStruct captionStruct;
        BaseShortVideoContext baseShortVideoContext2;
        String imageModeCoverPath;
        List<String> imageModeLocalPaths;
        if (publishModel != null) {
            this.LLILLJJLI = publishModel.editModel;
        }
        if (publishModel != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        createBaseAwemeResponse.creationId = str;
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        } else {
            baseShortVideoContext = null;
        }
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
        } else {
            videoPublishEditModel = null;
        }
        if (videoPublishEditModel != null) {
            zIsSaveLocalWithWaterMark = videoPublishEditModel.isSaveLocalWithWaterMark();
        } else {
            zIsSaveLocalWithWaterMark = false;
        }
        createBaseAwemeResponse.isSaveLocalWithWatermark = zIsSaveLocalWithWaterMark;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("args is ");
        sbLIZ.append(this.LLILLJJLI);
        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        int i = this.LL;
        if (i != 0 && i != 11) {
            saveModel = null;
            localSilentSharePath = null;
        } else {
            VideoPublishEditModel videoPublishEditModel3 = (VideoPublishEditModel) this.LLILLJJLI;
            localSilentSharePath = videoPublishEditModel3.getLocalSilentSharePath();
            if (localSilentSharePath == null) {
                localSilentSharePath = "";
            }
            saveModel = videoPublishEditModel3.getSaveModel();
        }
        if (!TextUtils.isEmpty(localSilentSharePath) || (saveModel != null && (((imageModeCoverPath = saveModel.getImageModeCoverPath()) != null && !a0.LJJJIL(imageModeCoverPath)) || ((imageModeLocalPaths = saveModel.getImageModeLocalPaths()) != null && !imageModeLocalPaths.isEmpty())))) {
            createBaseAwemeResponse.mSaveModel = saveModel;
            C2354709Kn.LJIJJ(C1449640npK.LJII);
        }
        int i2 = this.LL;
        if (i2 != 0 && i2 != 11) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("unknown video type=");
            sbLIZ2.append(this.LL);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("ShortVideoPublishCallback", C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            Object obj = this.LLILLJJLI;
            if ((obj instanceof VideoPublishEditModel) && (videoPublishEditModel2 = (VideoPublishEditModel) obj) != null) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0M50(videoPublishEditModel2, createBaseAwemeResponse, publishModel, this, null), 3);
                o.LJIJI.getClass();
                AVAweme aVAwemeLambda$getAVConverter$0 = AVServiceProxyImpl.lambda$getAVConverter$0(createBaseAwemeResponse);
                if (aVAwemeLambda$getAVConverter$0 != null) {
                    List<InteractStickerStruct> listLJI = C1429860nJQ.LJI(videoPublishEditModel2.getMainBusinessContext(), 11, EnumC1428480nHC.TRACK_PAGE_EDIT);
                    CaptionStruct captionStruct2 = aVAwemeLambda$getAVConverter$0.captionStruct;
                    if (captionStruct2 != null) {
                        String str3 = createBaseAwemeResponse.materialId;
                        if (str3 == null) {
                            str3 = "";
                        }
                        List list = captionStruct2.utterances;
                        if (list == null) {
                            list = C13BV.INSTANCE;
                        }
                        FeedbackBody feedbackBody = new FeedbackBody(str3, list);
                        if (listLJI == null || (interactStickerStruct = (InteractStickerStruct) C13LP.LJJJLZIJ(0, listLJI)) == null || (captionStruct = interactStickerStruct.getCaptionStruct()) == null || (str2 = captionStruct.taskId) == null) {
                            str2 = "";
                        }
                        SubtitleApi subtitleApi = (SubtitleApi) C0CHQ.LIZ().getNetworkService().createRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ(), true, SubtitleApi.class);
                        String str4 = createBaseAwemeResponse.materialId;
                        if (str4 == null) {
                            str4 = "";
                        }
                        subtitleApi.feedback(str4, aVAwemeLambda$getAVConverter$0.aid, str2, feedbackBody);
                        new Object() { // from class: X.0nZE
                        }.getClass();
                        if (captionStruct2.utterances != null) {
                            String strLJJIII = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIII(C1445850njD.LIZ, "");
                            new C0VSJ(strLJJIII).mkdirs();
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(strLJJIII);
                            sbLIZ3.append(System.currentTimeMillis());
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            C2354709Kn.LJJ(strLIZIZ, C08JS.LIZLLL(captionStruct2));
                            Application application = C0CHQ.LIZ;
                            UrlModel urlModel = new UrlModel();
                            urlModel.setUrlList(C1697810uHb.LJIILJJIL(strLIZIZ));
                            captionStruct2.setAutoCaptions(C1697810uHb.LJIILJJIL(new AutocaptionType(((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getCurrentI18nItem(application).LIZ(), urlModel)));
                        }
                    }
                }
                LJI(videoPublishEditModel2, null, true);
            } else {
                return;
            }
        }
        Object obj2 = this.LLILLJJLI;
        if ((obj2 instanceof BaseShortVideoContext) && (baseShortVideoContext2 = (BaseShortVideoContext) obj2) != null) {
            C0CHQ.LIZ().getPublishService().LJIIL();
            C1436830nUf.LJIJI(new C572660Md6(baseShortVideoContext2));
            C1439650nZD c1439650nZD = C1439650nZD.LIZ;
            C1439650nZD.LJFF = false;
            C1439650nZD.LIZJ = false;
            c1439650nZD.LIZJ(false);
            C863370Xtv.LIZ("normal").LIZ(1);
        }
    }

    public final Object LJII(VideoPublishEditModel videoPublishEditModel, CreateBaseAwemeResponse createBaseAwemeResponse, AwemeDraft awemeDraft, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C565810MHb(awemeDraft, createBaseAwemeResponse, this, videoPublishEditModel, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}
