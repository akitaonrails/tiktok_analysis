package Y;

import X.C0CHQ;
import X.C0E6D;
import X.C0L48;
import X.C0LAB;
import X.C0M2T;
import X.C0MMX;
import X.C0MPQ;
import X.C0MV0;
import X.C0MYU;
import X.C1253930ijf;
import X.C13LP;
import X.C1403010mc7;
import X.C1412660mrg;
import X.C1440470naX;
import X.C1443410nfH;
import X.C1444180ngW;
import X.C1458570o3j;
import X.C15438062q;
import X.C1720106oR;
import X.C19556611fI;
import X.C1C7U;
import X.C1DOT;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2260008tK;
import X.C2286708xd;
import X.C2341909Fp;
import X.C2344809Gs;
import X.C2354709Kn;
import X.C287010BMt;
import X.C356530DyN;
import X.C356670Dyb;
import X.C530130Kqh;
import X.C539970LFr;
import X.C545640Lac;
import X.C553680Lna;
import X.C558570LvT;
import X.C560950LzJ;
import X.C562880M5u;
import X.C570330MYl;
import X.C570670MZt;
import X.C570790Ma5;
import X.C570800Ma6;
import X.C571800Mbi;
import X.C573990MfF;
import X.C580130Mp9;
import X.C790050Uyx;
import X.C810560Vqw;
import X.EnumC1412640mre;
import X.InterfaceC2342209Fs;
import X.RunnableC530220Kqq;
import android.graphics.Bitmap;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.mvtheme.MvSourceItemInfo;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.draft.music.DraftSoundEffectProcessor;
import com.ss.android.ugc.aweme.tools.draft.music.PermissionCheckApi;
import com.ss.android.ugc.aweme.tools.draft.music.PermissionCheckResponse;
import com.ss.android.ugc.aweme.tools.draft.music.PermissionCheckResultBean;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lth.o;

/* JADX INFO: loaded from: classes9.dex */
public class ACallableS415S0100000_8 implements Callable {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ Object call$2(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        C1C7U.LIZ("EPDraftProvider@89e.sam$java_util_concurrent_Callable$0");
        Object objInvoke = ((Function0) aCallableS415S0100000_8.l0).invoke();
        C1C7U.LIZIZ("EPDraftProvider@89e.sam$java_util_concurrent_Callable$0");
        return objInvoke;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return call$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return call$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case 16:
                return call$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return call$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return call$18(this);
            case 19:
                return call$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return call$20(this);
            case 21:
                return call$21(this);
            case 22:
                return call$22(this);
            case 23:
                return call$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return call$24(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        C1C7U.LIZ("Editor1VideoLegalChecker@e914.isCanImport$1");
        Integer numValueOf = Integer.valueOf(C530130Kqh.LIZ((MediaModel) aCallableS415S0100000_8.l0));
        C1C7U.LIZIZ("Editor1VideoLegalChecker@e914.isCanImport$1");
        return numValueOf;
    }

    public static final Object call$1(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        C1C7U.LIZ("LocalVideoLegalChecker@3c01.checkVideoLegal$checkWithVEIsCanImport$1");
        Integer numValueOf = Integer.valueOf(C530130Kqh.LIZ((MediaModel) aCallableS415S0100000_8.l0));
        C1C7U.LIZIZ("LocalVideoLegalChecker@3c01.checkVideoLegal$checkWithVEIsCanImport$1");
        return numValueOf;
    }

    public static final Object call$10(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        C1C7U.LIZ("EditAutoSaveDraftComponent@a3.initRecoverLogic$1");
        ((C1443410nfH) aCallableS415S0100000_8.l0).LLJJIJIIJIL = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(((C1443410nfH) aCallableS415S0100000_8.l0).LJJJLIIL().getCreativeInfo(), false, false, false, 14));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditAutoSaveDraftComponent@a3.initRecoverLogic$1");
        return unit;
    }

    public static final Object call$11(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        C1C7U.LIZ("DownloadCanvasStyleTask@348c.runInternal$2");
        C0MPQ c0mpq = C0MPQ.LIZ;
        String str = ((C0MMX) aCallableS415S0100000_8.l0).LIZIZ;
        c0mpq.getClass();
        String strLIZ = C0MPQ.LIZ(str, null);
        C1C7U.LIZIZ("DownloadCanvasStyleTask@348c.runInternal$2");
        return strLIZ;
    }

    public static final Object call$12(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        C1C7U.LIZ("DraftAllowListProvider@67e6.notifyDraftUpdated$1");
        Set<String> setLJ = ((C571800Mbi) aCallableS415S0100000_8.l0).LJ();
        C1C7U.LIZIZ("DraftAllowListProvider@67e6.notifyDraftUpdated$1");
        return setLJ;
    }

    public static final Object call$13(ACallableS415S0100000_8 aCallableS415S0100000_8) throws IOException {
        C1C7U.LIZ("ImageEditRootScene@a14e.saveData$2");
        C1440470naX c1440470naX = C1440470naX.LIZ;
        ImageEditRootScene imageEditRootScene = (ImageEditRootScene) aCallableS415S0100000_8.l0;
        VideoPublishEditModel videoPublishEditModel = imageEditRootScene.LLJL;
        ImageAlbumData imageAlbumData = null;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        ImageAlbumData imageAlbumData2 = imageEditRootScene.LLJJL;
        if (imageAlbumData2 != null) {
            imageAlbumData = imageAlbumData2;
        }
        c1440470naX.getClass();
        C1440470naX.LIZIZ(videoPublishEditModel, imageAlbumData);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageEditRootScene@a14e.saveData$2");
        return unit;
    }

    public static final Object call$14(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        Unit unit;
        C1C7U.LIZ("DraftSoundEffectProcessor@c98.process$2");
        DraftSoundEffectProcessor draftSoundEffectProcessor = (DraftSoundEffectProcessor) aCallableS415S0100000_8.l0;
        C0MYU c0myu = draftSoundEffectProcessor.LLILLJJLI;
        if (c0myu != null) {
            c0myu.LIZ(draftSoundEffectProcessor.LLILZ);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("DraftSoundEffectProcessor@c98.process$2");
        return unit;
    }

    public static final Object call$15(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        boolean z;
        C1C7U.LIZ("DraftSoundEffectProcessor@c98.process$3");
        ((DraftSoundEffectProcessor) aCallableS415S0100000_8.l0).getClass();
        int i = 0;
        if (!C0CHQ.LIZ().getAccountService().LIZ() && C790050Uyx.LIZ(C0CHQ.LIZ)) {
            DraftSoundEffectProcessor draftSoundEffectProcessor = (DraftSoundEffectProcessor) aCallableS415S0100000_8.l0;
            List<SoundEffect> list = draftSoundEffectProcessor.LLILLL;
            HashSet hashSet = new HashSet();
            ArrayList<SoundEffect> arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                if (hashSet.add(C356670Dyb.LIZ((SoundEffect) obj))) {
                    arrayList.add(obj);
                }
            }
            C570790Ma5 c570790Ma5 = new C570790Ma5();
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (SoundEffect soundEffect : arrayList) {
                PermissionCheckApi.PermissionCheckEntity permissionCheckEntity = new PermissionCheckApi.PermissionCheckEntity();
                permissionCheckEntity.setIdType(4);
                permissionCheckEntity.setId(C356670Dyb.LIZ(soundEffect));
                permissionCheckEntity.setCheckType(4);
                arrayList2.add(permissionCheckEntity);
            }
            c570790Ma5.LIZ = arrayList2;
            PermissionCheckResponse permissionCheckResponseLIZ = C570800Ma6.LIZ(c570790Ma5);
            if (permissionCheckResponseLIZ == null) {
                C356530DyN.LIZIZ(C0E6D.LIZIZ, "checkSoundEffectPermission", "response is null");
                List<SoundEffect> list2 = draftSoundEffectProcessor.LLILLL;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator it2 = ((ArrayList) list2).iterator();
                while (it2.hasNext()) {
                    arrayList3.add(C356670Dyb.LIZ((SoundEffect) it2.next()));
                }
                DraftSoundEffectProcessor.LIZ(0, "response is null", arrayList3);
            } else {
                C0E6D c0e6d = C0E6D.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("response: ");
                sbLIZ.append(permissionCheckResponseLIZ.result);
                C356530DyN.LIZIZ(c0e6d, "checkSoundEffectPermission", C2188811AlT.LIZIZ(sbLIZ));
                List<PermissionCheckResultBean> list3 = permissionCheckResponseLIZ.result;
                if (list3 != null && !list3.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    for (PermissionCheckResultBean permissionCheckResultBean : list3) {
                        List<C570670MZt> list4 = draftSoundEffectProcessor.LLILZ;
                        ArrayList<C570670MZt> arrayList4 = new ArrayList();
                        for (Object obj2 : (ArrayList) list4) {
                            if (Intrinsics.LJFF(((C570670MZt) obj2).LIZ, permissionCheckResultBean.id)) {
                                arrayList4.add(obj2);
                            }
                        }
                        for (C570670MZt c570670MZt : arrayList4) {
                            c570670MZt.LIZIZ = permissionCheckResultBean.allowCurrent;
                            c570670MZt.LIZLLL = permissionCheckResultBean.reason;
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (PermissionCheckResultBean permissionCheckResultBean2 : list3) {
                        if (!permissionCheckResultBean2.allowCurrent) {
                            arrayList5.add(permissionCheckResultBean2);
                        }
                    }
                    if (!arrayList5.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        for (PermissionCheckResultBean permissionCheckResultBean3 : list3) {
                            if (!permissionCheckResultBean3.allowCurrent) {
                                arrayList6.add(permissionCheckResultBean3);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(arrayList6, 10));
                        Iterator it3 = arrayList6.iterator();
                        while (it3.hasNext()) {
                            arrayList7.add(((PermissionCheckResultBean) it3.next()).id);
                        }
                        DraftSoundEffectProcessor.LIZ(2, "", arrayList7);
                    } else {
                        List<SoundEffect> list5 = draftSoundEffectProcessor.LLILLL;
                        ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(list5, 10));
                        Iterator it4 = ((ArrayList) list5).iterator();
                        while (it4.hasNext()) {
                            arrayList8.add(C356670Dyb.LIZ((SoundEffect) it4.next()));
                        }
                        DraftSoundEffectProcessor.LIZ(1, "", arrayList8);
                    }
                } else {
                    List<SoundEffect> list6 = draftSoundEffectProcessor.LLILLL;
                    ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(list6, 10));
                    Iterator it5 = ((ArrayList) list6).iterator();
                    while (it5.hasNext()) {
                        arrayList9.add(C356670Dyb.LIZ((SoundEffect) it5.next()));
                    }
                    DraftSoundEffectProcessor.LIZ(1, "", arrayList9);
                }
            }
        }
        DraftSoundEffectProcessor draftSoundEffectProcessor2 = (DraftSoundEffectProcessor) aCallableS415S0100000_8.l0;
        for (SoundEffect soundEffect2 : (ArrayList) draftSoundEffectProcessor2.LLILLL) {
            int i2 = i + 1;
            CreativeModel creativeModel = draftSoundEffectProcessor2.LL.LIZ;
            if (!creativeModel.ugcTemplateData.isUgcTemplateFromAnchor && C1412660mrg.LIZJ(creativeModel.mvModel.templateType) != EnumC1412640mre.PUGC_TEMPLATE) {
                ((C570670MZt) ListProtector.get(draftSoundEffectProcessor2.LLILZ, i)).LIZJ = C1458570o3j.LIZ(C19556611fI.LIZ(soundEffect2));
            } else {
                ((C570670MZt) ListProtector.get(draftSoundEffectProcessor2.LLILZ, i)).LIZJ = C2354709Kn.LIZIZ(soundEffect2.fileLocalPath);
            }
            i = i2;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftSoundEffectProcessor@c98.process$3");
        return unit;
    }

    public static final Object call$16(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        AwemeDraft awemeDraft = (AwemeDraft) aCallableS415S0100000_8.l0;
        C1C7U.LIZ("MvThemeUtils@1e6a.deleteMvThemeTempFile$1L");
        if (!C287010BMt.LIZ()) {
            ArrayList<String> arrayList = awemeDraft.LJJJJIZL.mvCreateVideoData.selectMediaList;
            if (!C580130Mp9.LIZ(arrayList)) {
                Iterator<String> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C2354709Kn.LJIJJLI(it2.next());
                }
            }
        }
        ArrayList<MvNetFileBean> arrayList2 = awemeDraft.LJJJJIZL.mvCreateVideoData.newMaskFileData;
        if (!C580130Mp9.LIZ(arrayList2)) {
            Iterator<MvNetFileBean> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C2354709Kn.LJIJJLI(it3.next().getFilePath());
            }
        }
        ArrayList<MvSourceItemInfo> arrayList3 = awemeDraft.LJJJJIZL.mvCreateVideoData.sourceItemList;
        if (!C580130Mp9.LIZ(arrayList3)) {
            Iterator<MvSourceItemInfo> it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                C2354709Kn.LJIJJLI(it4.next().getOriginFilePath());
            }
        }
        C2354709Kn.LJIJJLI(awemeDraft.LJJJJIZL.mvCreateVideoData.videoCoverImgPath);
        C2354709Kn.LJIJJLI(awemeDraft.LJJJJIZL.mvCreateVideoData.contactVideoPath);
        C1C7U.LIZIZ("MvThemeUtils@1e6a.deleteMvThemeTempFile$1L");
        return null;
    }

    public static final Object call$17(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        String effectPath;
        String bgPath;
        C1C7U.LIZ("StatusFileUtils@1e.deleteDraftFile$1");
        StatusCreateVideoData statusCreateVideoData = ((AwemeDraft) aCallableS415S0100000_8.l0).LJJJJIZL.statusCreateVideoData;
        if (statusCreateVideoData != null) {
            C2260008tK.LIZLLL(statusCreateVideoData.getVideoCoverImgPath());
            StatusCreateVideoData statusCreateVideoData2 = ((AwemeDraft) aCallableS415S0100000_8.l0).LJJJJIZL.statusCreateVideoData;
            String musicPath = null;
            if (statusCreateVideoData2 != null) {
                effectPath = statusCreateVideoData2.getEffectPath();
            } else {
                effectPath = null;
            }
            C2260008tK.LIZLLL(effectPath);
            StatusCreateVideoData statusCreateVideoData3 = ((AwemeDraft) aCallableS415S0100000_8.l0).LJJJJIZL.statusCreateVideoData;
            if (statusCreateVideoData3 != null && (bgPath = statusCreateVideoData3.getBgPath()) != null && a0.LJJIIZI(bgPath, "status/resizeImage", false)) {
                C2260008tK.LIZLLL(bgPath);
            }
            StatusCreateVideoData statusCreateVideoData4 = ((AwemeDraft) aCallableS415S0100000_8.l0).LJJJJIZL.statusCreateVideoData;
            if (statusCreateVideoData4 != null) {
                musicPath = statusCreateVideoData4.getMusicPath();
            }
            C2260008tK.LIZLLL(musicPath);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StatusFileUtils@1e.deleteDraftFile$1");
        return unit;
    }

    public static final Object call$18(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        C0CHQ.LIZ().LJI().LIZIZ().LJ(new C570330MYl((AwemeDraft) aCallableS415S0100000_8.l0, new C560950LzJ("DraftEditHelper not Support", "deleteOfflineDraft"), false, null, null, 124), null);
        return null;
    }

    public static final Object call$19(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        AwemeDraft awemeDraft = (AwemeDraft) aCallableS415S0100000_8.l0;
        C1C7U.LIZ("DraftEditHelper@b4d4.mobEditDraft$1L");
        DraftDBSaveResult draftDBSaveResultLJFF = o.LJIL.LJI().LIZIZ().LJFF(new C545640Lac(awemeDraft, new C0M2T("DraftEditHelper", 7)));
        C1C7U.LIZIZ("DraftEditHelper@b4d4.mobEditDraft$1L");
        return draftDBSaveResultLJFF;
    }

    public static final Object call$20(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        C1C7U.LIZ("DraftDataAnalyzeServiceImpl@df0c.mobDraftLoad$1");
        C1403010mc7.LIZ.LJII().getDraftMonitorService().reportDraftRestoreFailure((DraftRestoreResult) aCallableS415S0100000_8.l0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftDataAnalyzeServiceImpl@df0c.mobDraftLoad$1");
        return unit;
    }

    public static final Object call$21(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        C1C7U.LIZ("DraftDataAnalyzeServiceImpl@df0c.mobDraftSave$1");
        C1403010mc7.LIZ.LJII().getDraftMonitorService().reportDraftSaveFailure((DraftSaveResult) aCallableS415S0100000_8.l0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftDataAnalyzeServiceImpl@df0c.mobDraftSave$1");
        return unit;
    }

    public static final Object call$22(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) aCallableS415S0100000_8.l0;
        awemeListFragmentImpl.getClass();
        C1C7U.LIZ("AwemeListFragmentImpl@a373.showDraftBox$1L");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = C562880M5u.LIZJ;
        if (j != -1) {
            jCurrentTimeMillis = j;
        }
        C562880M5u.LIZJ = jCurrentTimeMillis;
        try {
            C553680Lna c553680LnaJS = awemeListFragmentImpl.JS();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" -> finish query draft info, draft count = ");
            sbLIZ.append(c553680LnaJS.LIZ);
            C1720106oR.LJI("AwemeListFragmentImpl.draftBox", C2188811AlT.LIZIZ(sbLIZ));
            if (!awemeListFragmentImpl.x && ((IExternalService) ServiceManager.get().getService(IExternalService.class)).draftService().enableAddDraftLossMonitor()) {
                awemeListFragmentImpl.x = true;
                C1253930ijf.LIZ.getClass();
                C1253930ijf.LJIIIIZZ(c553680LnaJS, "query_draft_info_from_db");
            }
            C810560Vqw.LIZJ(new ARunnableS88S0200000_19(awemeListFragmentImpl, c553680LnaJS, 55));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" -> query draft info error: ");
            sbLIZ2.append(th);
            C1720106oR.LJI("AwemeListFragmentImpl.draftBox", C2188811AlT.LIZIZ(sbLIZ2));
            C2344809Gs.LJI(th);
        }
        C1C7U.LIZIZ("AwemeListFragmentImpl@a373.showDraftBox$1L");
        return null;
    }

    public static final Object call$23(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        C1C7U.LIZ("ImageCoverHelperKt@2181.loadImageCover$1");
        Pair<Bitmap, Boolean> pairLIZ = C1444180ngW.LIZ((VideoPublishEditModel) aCallableS415S0100000_8.l0);
        C1C7U.LIZIZ("ImageCoverHelperKt@2181.loadImageCover$1");
        return pairLIZ;
    }

    public static final Object call$24(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        C1C7U.LIZ("CheckPointServiceImpl@1176.deleteUselessCheckPointFile$2");
        CreativeInfo creativeInfo = ((C0MV0) aCallableS415S0100000_8.l0).LJIIJJI;
        if (creativeInfo != null && C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(creativeInfo, false, false, false, 14)) == null) {
            C2286708xd.LJIIZILJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZIZ(creativeInfo));
            ((C0MV0) aCallableS415S0100000_8.l0).LJIIJJI = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CheckPointServiceImpl@1176.deleteUselessCheckPointFile$2");
        return unit;
    }

    public static final Object call$3(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        C1C7U.LIZ("VECutVideoPresenter@ba2a.callTaskInMain$1");
        ((Function0) aCallableS415S0100000_8.l0).invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VECutVideoPresenter@ba2a.callTaskInMain$1");
        return unit;
    }

    public static final Object call$4(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        C1C7U.LIZ("VEMediaParserFrameProviderImpl@276f.releaseFrames$1");
        C0L48 c0l48 = (C0L48) ((VEMediaParserFrameProviderImpl) aCallableS415S0100000_8.l0).LLILZLL.getValue();
        c0l48.getClass();
        try {
            c0l48.LIZIZ().delete();
            c0l48.LIZIZ().getDirectory().delete();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((VEMediaParserFrameProviderImpl) aCallableS415S0100000_8.l0).LIZIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VEMediaParserFrameProviderImpl@276f.releaseFrames$1");
        return unit;
    }

    public static final Object call$5(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        C1C7U.LIZ("VEMediaParserProviderV2@d09d.releaseFrames$1");
        ((VEMediaParserProviderV2) aCallableS415S0100000_8.l0).LIZ();
        C0L48 c0l48 = (C0L48) ((VEMediaParserProviderV2) aCallableS415S0100000_8.l0).LLIZ.getValue();
        c0l48.getClass();
        try {
            c0l48.LIZIZ().delete();
            c0l48.LIZIZ().getDirectory().delete();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        VEMediaParserProviderV2 vEMediaParserProviderV2 = (VEMediaParserProviderV2) aCallableS415S0100000_8.l0;
        vEMediaParserProviderV2.LLILLL.execute(new RunnableC530220Kqq(vEMediaParserProviderV2));
        ArrayList arrayList = (ArrayList) ((VEMediaParserProviderV2) aCallableS415S0100000_8.l0).LLILZLL;
        if (!arrayList.isEmpty()) {
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C0LAB c0lab = new C0LAB();
            c0lab.LIZIZ(C13LP.LJZL(arrayList), "duration");
            c0lab.LIZ(arrayList.size(), "count");
            c0lab.LJ(Scene.SCENE_SERVICE, "video_clip");
            C2341909Fp.LIZ("tool_performance_fetch_frames", c0lab.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VEMediaParserProviderV2@d09d.releaseFrames$1");
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$6(Y.ACallableS415S0100000_8 r13) {
        /*
            java.lang.Object r6 = r13.l0
            X.0KpZ r6 = (X.ViewOnClickListenerC529430KpZ) r6
            r6.getClass()
            java.lang.String r13 = "MvImageAlbumAdapter@5488.updateImageLivePhotoInfo$1L"
            X.C1C7U.LIZ(r13)
            java.util.HashMap r5 = X.C0MZO.LIZ()
            X.0Kgh r4 = r6.LLLIL()
            java.util.ArrayList<X.0Kgh> r0 = r6.LLILLL
            r3 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            X.0Kgh r0 = (X.C523930Kgh) r0
            java.util.Set<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r0.LIZJ
            java.util.Iterator r12 = r0.iterator()
            r8 = 0
            r7 = 0
            r11 = 0
        L26:
            r2 = r8
        L27:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r9 = r12.next()
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r9 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r9
            r10 = 1
            int r11 = r11 + 1
            java.lang.String r1 = r9.LJFF()
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r5.get(r1)
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r5.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != r10) goto L5e
        L52:
            r9.subType = r10
            if (r4 == 0) goto L5d
            java.util.Set<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r4.LIZJ
            r0.add(r9)
            int r2 = r2 + 1
        L5d:
            r7 = 1
        L5e:
            int r0 = r11 % 50
            if (r0 != 0) goto L27
            if (r2 <= r8) goto L27
            X.0Koy r0 = new X.0Koy
            r0.<init>()
            X.11LJ r1 = X.AbstractC19486711Lt.LJIIJJI(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11Lq r0 = r1.LJIJJLI(r0)
            r0.LJIIZILJ()
            r8 = r2
            goto L26
        L7a:
            r0 = 0
            boolean r0 = com.ss.android.vesdk.VEUtils.isLivePhotoForJPEGFile(r1, r0, r3)
            X.C0MZO.LIZIZ(r0, r1)
            if (r0 == 0) goto L5e
            goto L52
        L85:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            X.C1C7U.LIZIZ(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS415S0100000_8.call$6(Y.ACallableS415S0100000_8):java.lang.Object");
    }

    public static final Object call$7(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        C1C7U.LIZ("PreviewVideoScene@5654.onDestroyView$1$1");
        ((C1DOT) aCallableS415S0100000_8.l0).destroy();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreviewVideoScene@5654.onDestroyView$1$1");
        return unit;
    }

    public static final Object call$8(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        ArrayList<ImportVideoInfo> importInfoList;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aCallableS415S0100000_8.l0;
        videoPublishContainerScene.getClass();
        C1C7U.LIZ("VideoPublishContainerScene@d2f3.buildHypicDesc$1L");
        VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLLLIILL;
        if (videoPublishEditModel != null && (importInfoList = videoPublishEditModel.getImportInfoList()) != null) {
            for (ImportVideoInfo importVideoInfo : importInfoList) {
                if (importVideoInfo.getHypicDescription() == null) {
                    String originImportPath = importVideoInfo.getOriginImportPath();
                    if (originImportPath == null && (originImportPath = importVideoInfo.getRealImportPath()) == null) {
                        originImportPath = "";
                    }
                    importVideoInfo.setHypicDescription(C573990MfF.LIZJ(originImportPath));
                }
            }
        }
        C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.buildHypicDesc$1L");
        return null;
    }

    public static final Object call$9(ACallableS415S0100000_8 aCallableS415S0100000_8) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aCallableS415S0100000_8.l0;
        videoPublishContainerScene.getClass();
        C1C7U.LIZ("VideoPublishContainerScene@d2f3.buildAutoCutTemplateZip$1L");
        VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLLLIILL;
        videoPublishEditModel.creativeModel.autoCutAnchorModel.templateZipPath = C539970LFr.LIZ(videoPublishEditModel);
        C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.buildAutoCutTemplateZip$1L");
        return null;
    }

    public ACallableS415S0100000_8(AwemeDraft awemeDraft, int i) {
        this.$t = i;
        switch (i) {
            case 16:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            case 19:
                this.l0 = awemeDraft;
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            default:
                this.l0 = awemeDraft;
                break;
        }
    }

    public ACallableS415S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
