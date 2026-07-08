package X;

import Y.ACallableS176S0300000_8;
import Y.ACallableS415S0100000_8;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.p1;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS148S0101000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS8S1401000_8;
import pic.q;

/* JADX INFO: renamed from: X.0MV0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MV0 implements InterfaceC573980MfE {
    public static final /* synthetic */ int LJIILIIL = 0;
    public C0MV1 LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public WeakReference<Activity> LJI;
    public C0MPH LJII;
    public boolean LJIIIIZZ;
    public final AtomicReference<CountDownLatch> LJIIIZ = new AtomicReference<>(null);
    public RecordScene LJIIJ;
    public CreativeInfo LJIIJJI;
    public AwemeDraft LJIIL;

    @Override // X.InterfaceC573980MfE
    public final void LIZ() {
        this.LIZIZ = false;
    }

    @Override // X.InterfaceC573980MfE
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC573980MfE
    public final AwemeDraft LJII() {
        Pair<AwemeDraft, VideoPublishEditModel> pairLJJ = LJJ(false);
        if (pairLJJ != null) {
            return pairLJJ.getFirst();
        }
        return null;
    }

    @Override // X.InterfaceC573980MfE
    public final boolean LIZIZ() {
        boolean z = this.LJFF;
        this.LJFF = false;
        return z;
    }

    @Override // X.InterfaceC573980MfE
    public final AwemeDraft LJIIIIZZ() {
        AwemeDraft awemeDraft = this.LJIIL;
        if (awemeDraft != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getEditingOrCheckPointDraft: hit memory cache, ");
            sbLIZ.append(LJJI(awemeDraft));
            C2188811AlT.LIZIZ(sbLIZ);
            return awemeDraft;
        }
        String string = Keva.getRepo("publish").getString("checkpoint_editing_draft_id", "");
        String str = (string == null || string.length() == 0) ? "CHECK_POINT" : string;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getEditingOrCheckPointDraft: editingDraftId=");
        sbLIZ2.append(string);
        sbLIZ2.append(", queryPrimaryKey=");
        sbLIZ2.append(str);
        sbLIZ2.append(", checkpointScene=");
        sbLIZ2.append(LJIJJ(C1439190nYT.LIZ()));
        C2188811AlT.LIZIZ(sbLIZ2);
        AwemeDraft awemeDraftLJIJJLI = LJIJJLI(str);
        if (awemeDraftLJIJJLI == null) {
            return null;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("getEditingOrCheckPointDraft: query result ");
        sbLIZ3.append(LJJI(awemeDraftLJIJJLI));
        C2188811AlT.LIZIZ(sbLIZ3);
        return awemeDraftLJIJJLI;
    }

    @Override // X.InterfaceC573980MfE
    public final boolean LJIIJ() {
        return this.LIZIZ && C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_keep_editing_popup_change_to_push", true) <= 0;
    }

    @Override // X.InterfaceC573980MfE
    public final boolean LJIIJJI() {
        boolean z = this.LJ;
        this.LJ = false;
        return z;
    }

    @Override // X.InterfaceC573980MfE
    public final AwemeDraft LJIIL() {
        AwemeDraft awemeDraft = this.LJIIL;
        return awemeDraft != null ? awemeDraft : LJIJJLI("CHECK_POINT");
    }

    @Override // X.InterfaceC573980MfE
    public final void deleteUselessCheckPointFile() {
        if (this.LJIIIIZZ || this.LJIIIZ.get() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deleteUselessCheckPointFile: skip, isSavingDraft=");
            sbLIZ.append(this.LJIIIIZZ);
            sbLIZ.append(", v3PushShowSavePending=");
            sbLIZ.append(this.LJIIIZ.get() != null);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (!C298170BmR.LIZ()) {
            C15O7.LIZJ(new ACallableS415S0100000_8(this, 24));
            return;
        }
        AwemeDraft awemeDraftLJIIL = LJIIL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("deleteUselessCheckPointFile: creativeId: ");
        sbLIZ2.append(awemeDraftLJIIL != null ? awemeDraftLJIIL.LIZ() : null);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (awemeDraftLJIIL == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0LCR(awemeDraftLJIIL, null), 3);
    }

    @Override // X.InterfaceC573980MfE
    public final void LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearCheckPoint: scene ");
        sbLIZ.append(LJIJJ(C1439190nYT.LIZ()));
        sbLIZ.append(" -> UNKNOWN, editingDraftId=");
        sbLIZ.append(Keva.getRepo("publish").getString("checkpoint_editing_draft_id", ""));
        sbLIZ.append(" -> empty");
        C2188811AlT.LIZIZ(sbLIZ);
        C1439190nYT.LIZLLL(3);
        Keva.getRepo("publish").storeString("checkpoint_editing_draft_id", "");
    }

    public final boolean LJIJ() {
        AVDraftExtras aVDraftExtras;
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        AwemeDraft awemeDraftLJIIIIZZ = LJIIIIZZ();
        if (awemeDraftLJIIIIZZ == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkNeedRestoreToEdit: draft=");
        sbLIZ.append(LJJI(awemeDraftLJIIIIZZ));
        C2188811AlT.LIZIZ(sbLIZ);
        if (LJIL(awemeDraftLJIIIIZZ)) {
            this.LJIIJJI = awemeDraftLJIIIIZZ.LIZIZ();
        } else {
            this.LIZJ = true;
        }
        if (!C297610BlX.LIZ() && C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(awemeDraftLJIIIIZZ.LIZIZ(), false, false, false, 14)) != null) {
            return false;
        }
        CreativeModel creativeModel = awemeDraftLJIIIIZZ.LIZ;
        if (creativeModel.initialModel.dmCameraModel.enterFromDM) {
            return false;
        }
        if (!creativeModel.ugcTemplateData.isUgcTemplateFromAnchor && C1412660mrg.LIZJ(creativeModel.mvModel.templateType) != EnumC1412640mre.PUGC_TEMPLATE && (aVDraftExtras = awemeDraftLJIIIIZZ.LJJJJIZL) != null && (infoStickerModel = aVDraftExtras.infoStickerModel) != null && (list = infoStickerModel.stickers) != null) {
            ArrayList arrayList = new ArrayList();
            for (StickerItemModel stickerItemModel : list) {
                if (stickerItemModel.type != 2) {
                    arrayList.add(stickerItemModel);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((StickerItemModel) it2.next()).path == null) {
                    return false;
                }
            }
        }
        boolean zIsSuc = C0MYA.LIZ(awemeDraftLJIIIIZZ).isSuc();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("checkNeedRestoreToEdit: end, result=");
        sbLIZ2.append(zIsSuc);
        C2188811AlT.LIZIZ(sbLIZ2);
        return zIsSuc;
    }

    public static RecordConfig LJIILJJIL(Long l) {
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay("direct_shoot");
        builder.restoreType(2);
        builder.setDraftLandPage("video_post_page");
        if (l != null) {
            builder.decompressTime(l.longValue());
        }
        return builder.build();
    }

    public static String LJIJJ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("OTHER(");
                                sbLIZ.append(i);
                                sbLIZ.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }
                            return "TEXT2IMAGE";
                        }
                        return "IMAGE";
                    }
                    return "UNKNOWN";
                }
                return "PUBLISH";
            }
            return "EDIT";
        }
        return "RECORD";
    }

    public static boolean LJIL(AwemeDraft awemeDraft) {
        if (awemeDraft.LJJJJIZL.publishStage == 50) {
            return true;
        }
        return false;
    }

    public static String LJJI(AwemeDraft awemeDraft) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("creationId=");
        sbLIZ.append(awemeDraft.LIZ());
        sbLIZ.append(", publishStage=");
        sbLIZ.append(awemeDraft.LJJJJIZL.publishStage);
        sbLIZ.append("(CHECK_POINT=50), isCheckPointDraft=");
        sbLIZ.append(LJIL(awemeDraft));
        sbLIZ.append(", isPublishedDraft=");
        sbLIZ.append(awemeDraft.LJJJI);
        sbLIZ.append(", isImageMode=");
        sbLIZ.append(awemeDraft.LJIIL());
        sbLIZ.append(", isDraft=");
        sbLIZ.append(awemeDraft.LIZ.draftInfoModel.isDraft);
        sbLIZ.append(", draftToEditFrom=");
        sbLIZ.append(awemeDraft.LJIJI);
        sbLIZ.append(", draftPrimaryKey=");
        sbLIZ.append(awemeDraft.LIZJ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0159 A[EDGE_INSN: B:100:0x0159->B:49:0x0159 BREAK  A[LOOP:0: B:62:0x018d->B:102:?]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015e  */
    @Override // X.InterfaceC573980MfE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(android.app.Activity r13) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MV0.LJ(android.app.Activity):boolean");
    }

    @Override // X.InterfaceC573980MfE
    public final boolean LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isDuet() || videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isStitchMode() || videoPublishEditModel.isUploadVideo() || videoPublishEditModel.isCutSameVideoType() || videoPublishEditModel.getShootMode() == 15 || videoPublishEditModel.getShootMode() == 17 || videoPublishEditModel.getShootMode() == 20 || videoPublishEditModel.getShootMode() == 23 || videoPublishEditModel.getShootMode() == 29 || videoPublishEditModel.getShootMode() == 20 || ((videoPublishEditModel.getShootMode() == 10 && C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData()) && !videoPublishEditModel.isUploadVideo()) || C1428470nHB.LJZL(videoPublishEditModel) || C1428470nHB.LLIIIILZ(videoPublishEditModel) || ((C301570Brv.LIZ() || C301790BsH.LIZ()) && (videoPublishEditModel.getShootMode() == 10 || videoPublishEditModel.getShootMode() == 11 || videoPublishEditModel.getShootMode() == 14 || videoPublishEditModel.getShootMode() == 18)))) {
            return true;
        }
        if (C301790BsH.LIZ() && videoPublishEditModel.creativeModel.nowsShootModel != null) {
            return true;
        }
        return false;
    }

    public final void LJIILL(Activity activity) {
        Activity activity2;
        if (this.LJI == null && activity != null) {
            this.LJI = new WeakReference<>(activity);
        }
        WeakReference<Activity> weakReference = this.LJI;
        if (weakReference != null && (activity2 = weakReference.get()) != null) {
            AwemeDraft awemeDraftLJIIL = LJIIL();
            if (awemeDraftLJIIL != null) {
                if (awemeDraftLJIIL.LIZ.aiLivePhotoModel.LJI()) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0LD0(this, activity2, null), 3);
                    return;
                }
                return;
            }
            LJIILLIIL(activity, null);
        }
    }

    public final boolean LJIJI(boolean z) {
        int length;
        AwemeDraft awemeDraftLJIIIIZZ;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkNeedRestoreToRecord: begin, deleteFiles=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        RecordScene recordSceneLIZIZ = this.LJIIJ;
        if (recordSceneLIZIZ == null) {
            recordSceneLIZIZ = C1439190nYT.LIZIZ();
        }
        this.LJIIJ = recordSceneLIZIZ;
        this.LJIIJJI = recordSceneLIZIZ.creativeInfo;
        String strLJJIIJ = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIIJ(recordSceneLIZIZ.creativeInfo, "", false);
        File[] fileArrListFiles = new C0VSJ(strLJJIIJ).listFiles();
        if (fileArrListFiles != null) {
            length = fileArrListFiles.length;
        } else {
            length = 0;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("checkNeedRestoreToRecord: creativeInfo=");
        sbLIZ2.append(recordSceneLIZIZ.creativeInfo);
        sbLIZ2.append(", recordDir=");
        sbLIZ2.append(strLJJIIJ);
        sbLIZ2.append(", fileCount=");
        sbLIZ2.append(length);
        sbLIZ2.append(", shootMode=");
        sbLIZ2.append(recordSceneLIZIZ.shootMode);
        C2188811AlT.LIZIZ(sbLIZ2);
        File[] fileArrListFiles2 = new C0VSJ(strLJJIIJ).listFiles();
        if (fileArrListFiles2 != null && fileArrListFiles2.length != 0) {
            C1443030nef c1443030nefLJII = C1443030nef.LJII();
            if (recordSceneLIZIZ.isSegmentsNotValid() || ((awemeDraftLJIIIIZZ = LJIIIIZZ()) != null && (creativeModel = awemeDraftLJIIIIZZ.LIZ) != null && (creativeInitialModel = creativeModel.initialModel) != null && (dMCameraModel = creativeInitialModel.dmCameraModel) != null && dMCameraModel.enterFromDM)) {
                return false;
            }
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("aigc_countdown_restore_dialog_killswitch", false) && recordSceneLIZIZ.isAigcCountdownRecord) {
                if (z) {
                    c1443030nefLJII.getClass();
                    C1443030nef.LJIIJ(recordSceneLIZIZ);
                    C1439190nYT.LIZJ();
                }
                return false;
            }
            if (!recordSceneLIZIZ.isDuetMode() && !recordSceneLIZIZ.isStitchMode()) {
                if (recordSceneLIZIZ.recordMode == 1) {
                    if (z) {
                        C2354709Kn.LJIJJLI(recordSceneLIZIZ.mp4Path);
                        C2354709Kn.LJIJJLI(recordSceneLIZIZ.musicPath);
                        c1443030nefLJII.getClass();
                        C1443030nef.LJIIJ(recordSceneLIZIZ);
                        C1439190nYT.LIZJ();
                    }
                    return false;
                }
                if (TextUtils.isEmpty(recordSceneLIZIZ.mp4Path)) {
                    return true;
                }
            } else if (z) {
                C2354709Kn.LJIJJLI(recordSceneLIZIZ.duetVideoPath);
                C2354709Kn.LJIJJLI(recordSceneLIZIZ.duetAudioPath);
                c1443030nefLJII.getClass();
                C1443030nef.LJIIJ(recordSceneLIZIZ);
                C1439190nYT.LIZJ();
            }
            return false;
        }
        if (z) {
            C1439190nYT.LIZJ();
        }
        return false;
    }

    public final AwemeDraft LJIJJLI(String str) {
        AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(str, 0, null, 6, null), false, false, false, 14));
        if (awemeDraftLJI != null) {
            C1411560mpu.LIZIZ = false;
            C391360FWc.LJ("", new AwS549S0100000_5(awemeDraftLJI, 1696));
            awemeDraftLJI.LIZLLL = awemeDraftLJI.LIZ();
            this.LJIIL = awemeDraftLJI;
            return awemeDraftLJI;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<AwemeDraft, VideoPublishEditModel> LJJ(boolean z) {
        Bundle extras = null;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LJI(null) || !LJIJI(z)) {
            return null;
        }
        RecordConfig recordConfigLJIILJJIL = LJIILJJIL(null);
        new q();
        try {
            extras = AbstractC20598115it.LIZ(recordConfigLJIILJJIL).getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C844470XAv.LIZ.getClass();
        ShortVideoContext shortVideoContextLIZJ = C1443540nfU.LIZJ(extras, C844470XAv.LIZ(), this.LJIIJ);
        C580120Mp8 c580120Mp8 = new C580120Mp8();
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordDataLJFF = p1.LJFF(shortVideoContextLIZJ, C580200MpG.LIZ(shortVideoContextLIZJ));
        try {
            Intent intentLIZIZ = new C580090Mp5().LIZIZ(new C580100Mp6(c580120Mp8, System.currentTimeMillis(), shortVideoContextLIZJ, 0, (AVMusicWaveBean) ((AbstractC19852312lt) C11NZ.LJIJJLI(new C2325391G0r(shortVideoContextLIZJ, 0)).LIZLLL()).orNull(), multiEditVideoStatusRecordDataLJFF, multiEditVideoStatusRecordDataLJFF.curMultiEditVideoRecordData.segmentDataList.get(0).videoPath, multiEditVideoStatusRecordDataLJFF.curMultiEditVideoRecordData.segmentDataList.get(0).audioPath), shortVideoContextLIZJ);
            new C1438570nXT("CheckPointServiceImpl");
            VideoPublishEditModel videoPublishEditModelLJFF = C1438570nXT.LJFF(intentLIZIZ);
            return new Pair<>(C1438570nXT.LIZLLL(videoPublishEditModelLJFF), videoPublishEditModelLJFF);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJ(e2);
            return null;
        }
    }

    public final void LJJIFFI(Activity activity) {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abnormalExitLogService().logRestoreDialogClick(false, this.LIZJ);
        LJIILL(activity);
        C1403010mc7.LIZ.getBridgeService().LJI(activity);
    }

    public static boolean LJJIIZI(int i, AwemeDraft awemeDraft) {
        boolean z = true;
        if (!LJIL(awemeDraft) && (!C0LD1.LIZJ() || (i != 1 && i != 2 && i != 4 && i != 5))) {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldRestoreAsInterruptCheckpoint: scene=");
        sbLIZ.append(LJIJJ(i));
        sbLIZ.append(", result=");
        sbLIZ.append(z);
        sbLIZ.append(", ");
        sbLIZ.append(LJJI(awemeDraft));
        C2188811AlT.LIZIZ(sbLIZ);
        return z;
    }

    @Override // X.InterfaceC573980MfE
    public final void LIZJ(String str, Function0<Unit> function0) {
        C0MV1 c0mv1 = this.LIZ;
        if (c0mv1 != null) {
            HandlerHook.viewRemoveCallbacks(c0mv1.LL, c0mv1.LLIZLLLIL);
            if (!c0mv1.LLIZ) {
                c0mv1.LLIZ = true;
                InterfaceC539120LCk interfaceC539120LCk = c0mv1.LLILZLL;
                if (interfaceC539120LCk != null) {
                    interfaceC539120LCk.LIZIZ(str, null, false);
                }
                c0mv1.LLILZ.invoke(Boolean.valueOf(c0mv1.LL.LLJI), c0mv1.LJIILIIL(true), function0);
                return;
            }
            InterfaceC539120LCk interfaceC539120LCk2 = c0mv1.LLILZLL;
            if (interfaceC539120LCk2 != null) {
                interfaceC539120LCk2.LIZIZ(str, null, false);
            }
            function0.invoke();
            return;
        }
        function0.invoke();
    }

    public final void LJIILLIIL(Activity activity, Function0<Unit> function0) {
        if (C0LD1.LIZJ() && this.LJIIIZ.get() != null) {
            C15O7.LIZJ(new ACallableS176S0300000_8(this, activity, function0, 7));
        } else {
            LJIIZILJ(activity, function0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(android.app.Activity r5, kotlin.jvm.functions.Function0<kotlin.Unit> r6) {
        /*
            r4 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r4.LJI
            if (r0 != 0) goto Ld
            if (r5 == 0) goto Ld
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            r4.LJI = r0
        Ld:
            java.lang.ref.WeakReference<android.app.Activity> r0 = r4.LJI
            if (r0 == 0) goto L40
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L40
            boolean r0 = X.C0LD1.LIZJ()
            if (r0 != 0) goto L20
            r0 = 0
            r4.LIZIZ = r0
        L20:
            com.ss.android.ugc.aweme.shortvideo.model.RecordScene r3 = r4.LJIIJ
            int r1 = X.C1439190nYT.LIZ()
            if (r1 == 0) goto L4a
            r0 = 1
            if (r1 == r0) goto L41
            r0 = 2
            if (r1 == r0) goto L41
            r0 = 3
            if (r1 == r0) goto L4a
            r0 = 4
            if (r1 == r0) goto L41
            r0 = 5
            if (r1 == r0) goto L41
        L37:
            boolean r0 = X.C298240BmY.LIZ()
            if (r0 == 0) goto L40
            r4.deleteUselessCheckPointFile()
        L40:
            return
        L41:
            X.C1439190nYT.LIZJ()
            if (r6 == 0) goto L37
            r6.invoke()
            goto L37
        L4a:
            boolean r0 = X.C0LD1.LIZJ()
            if (r0 == 0) goto L56
            if (r6 == 0) goto L37
            r6.invoke()
            goto L37
        L56:
            java.util.concurrent.ExecutorService r0 = X.C741040T5a.LIZ
            java.util.concurrent.ExecutorService r2 = X.C741040T5a.LIZ
            Y.ARunnableS77S0200000_8 r1 = new Y.ARunnableS77S0200000_8
            r0 = 41
            r1.<init>(r3, r6, r0)
            r2.execute(r1)
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MV0.LJIIZILJ(android.app.Activity, kotlin.jvm.functions.Function0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x013f, code lost:
    
        if (r12 != 20) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(android.app.Activity r23, androidx.lifecycle.LifecycleOwner r24) {
        /*
            Method dump skipped, instruction units count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MV0.LJJIJIIJI(android.app.Activity, androidx.lifecycle.LifecycleOwner):void");
    }

    @Override // X.InterfaceC573980MfE
    public final void saveCheckPointToDraft(Activity activity, int i) {
        if (activity == null) {
            return;
        }
        LJJIIJZLJL(this, activity, i, false, 0, AFwS239S0000000_8.get$arr$(392), 28);
    }

    @Override // X.InterfaceC573980MfE
    public final void LJI(int i, VideoPublishEditModel videoPublishEditModel, String str) {
        LIZJ("save", new C0MUW(this, videoPublishEditModel, str, i));
    }

    public final void LJJII(Activity activity, LifecycleOwner lifecycleOwner, String str) {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abnormalExitLogService().logRestoreDialogClick(true, this.LIZJ);
        C1398110mUD.LIZ = str;
        C1403010mc7.LIZ.getBridgeService().LIZ();
        LJJIJIIJI(activity, lifecycleOwner);
    }

    public final Dialog LJJIJ(final Activity activity, final String str, final Function1<? super Boolean, Unit> function1) {
        C21566919al c21566919al = new C21566919al(activity);
        c21566919al.LIZ(2131858157);
        c21566919al.LJIIJ(R.string.fte, new DialogInterface.OnClickListener() { // from class: X.0MV2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C1440600nak.LIZ.logRestoreDialogClick(true, this.LL.LIZJ);
                C1398110mUD.LIZ = str;
                C1403010mc7.LIZ.getBridgeService().LIZ();
                function1.invoke(Boolean.TRUE);
                dialogInterface.dismiss();
            }
        }, false);
        c21566919al.LJII(R.string.f1_, new DialogInterface.OnClickListener() { // from class: X.0MV3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C1440600nak.LIZ.logRestoreDialogClick(false, this.LL.LIZJ);
                this.LL.LJIILL(activity);
                function1.invoke(Boolean.FALSE);
                dialogInterface.dismiss();
                C1403010mc7.LIZ.getBridgeService().LJI(activity);
            }
        }, false);
        c21566919al.LJII = false;
        return new C21566519ah(c21566919al).LJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x01f8, code lost:
    
        r7 = 5;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC573980MfE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Dialog showRestoreWorkDialog(android.app.Activity r84, androidx.lifecycle.LifecycleOwner r85, java.lang.String r86) {
        /*
            Method dump skipped, instruction units count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MV0.showRestoreWorkDialog(android.app.Activity, androidx.lifecycle.LifecycleOwner, java.lang.String):android.app.Dialog");
    }

    public static void LJJIII(AwemeDraft awemeDraft, final Activity activity, final LifecycleOwner lifecycleOwner, final Function1 function1) {
        C542610LPv.LIZLLL(new C542550LPp(new InterfaceC537370L5r(activity, lifecycleOwner) { // from class: X.0LCQ
            public final Context LIZ;
            public final LifecycleOwner LIZIZ;

            @Override // X.InterfaceC537370L5r
            public final IDraftListener LIZ() {
                return null;
            }

            @Override // X.InterfaceC537370L5r
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC537370L5r
            public final Context getContext() {
                return this.LIZ;
            }

            @Override // X.InterfaceC537370L5r
            public final LifecycleOwner getLifecycleOwner() {
                return this.LIZIZ;
            }

            {
                C19FO c19fo;
                this.LIZ = activity;
                if (lifecycleOwner == null) {
                    if (activity instanceof C19EG) {
                        c19fo = (C19FO) activity;
                    } else {
                        c19fo = null;
                    }
                    lifecycleOwner = c19fo;
                }
                this.LIZIZ = lifecycleOwner;
            }
        }, awemeDraft, new C0M2T(false, null, "clickFromContinuePopup", 0, false, 23)), new InterfaceC542470LPh() { // from class: X.0LCP
            @Override // X.InterfaceC542470LPh
            public final void LIZ(C0LBJ c0lbj) {
                VideoPublishEditModel videoPublishEditModel = c0lbj.LIZIZ;
                if (videoPublishEditModel != null) {
                    function1.invoke(videoPublishEditModel);
                } else {
                    C0MYY.LIZ(c0lbj.LIZ, activity);
                }
            }

            @Override // X.InterfaceC542470LPh
            public final void LIZIZ(C0LBJ c0lbj) {
                C0MYY.LIZ(c0lbj.LIZ, activity);
            }
        });
    }

    @Override // X.InterfaceC573980MfE
    public final void LJIILIIL(VideoPublishEditModel videoPublishEditModel, String str, int i, Function0<Unit> function0, Function1<? super C540340LHc, Unit> function1) {
        LIZJ("save", new AwS8S1401000_8(this, (C0MV0) videoPublishEditModel, (VideoPublishEditModel) str, (String) i, (int) function0, (Function0<Unit>) function1, (Function1<? super C540340LHc, Unit>) 1));
    }

    public static void LJJIIJZLJL(C0MV0 c0mv0, Activity activity, int i, boolean z, int i2, Function1 function1, int i3) {
        boolean z2;
        boolean z3;
        int i4 = i2;
        boolean z4 = z;
        if ((i3 & 4) != 0) {
            z4 = false;
        }
        if ((i3 & 8) != 0) {
            i4 = 2131844962;
        }
        if ((i3 & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c0mv0.getClass();
        int iLIZ = C1439190nYT.LIZ();
        if (z2) {
            c0mv0.LIZIZ = false;
        }
        if (iLIZ != 0) {
            if (iLIZ != 1 && iLIZ != 2) {
                if (iLIZ != 3) {
                    if (iLIZ != 4 && iLIZ != 5) {
                        return;
                    }
                }
            }
            AwemeDraft awemeDraftLJIIIIZZ = c0mv0.LJIIIIZZ();
            if (awemeDraftLJIIIIZZ == null) {
                return;
            }
            awemeDraftLJIIIIZZ.LIZJ = i;
            if (!LJIL(awemeDraftLJIIIIZZ) && !awemeDraftLJIIIIZZ.LJJJI) {
                if (C0LD1.LIZJ() && !z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (C0C64.LJIILLIIL().LJIJ(31744, 1, "studio_restore_push_save_draft_fix", true) > 0 && !z3) {
                    c0mv0.LJFF();
                }
                if (z4 && C0LD1.LIZIZ()) {
                    C01TT.LIZLLL(new AwS148S0101000_8(activity, i4, 13));
                }
                function1.invoke(Boolean.TRUE);
                return;
            }
            c0mv0.LJJIIJ(activity, awemeDraftLJIIIIZZ, null, i, z4, i4, false, function1);
            return;
        }
        LJJIIZ(c0mv0, activity, i, function1, z4, i4, 64);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJIIZ(C0MV0 c0mv0, Activity activity, int i, Function1 function1, boolean z, int i2, int i3) {
        boolean z2;
        int i4 = i2;
        boolean z3 = z;
        Function1 function12 = function1;
        if ((i3 & 4) != 0) {
            function12 = null;
        }
        boolean z4 = false;
        if ((i3 & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i3 & 16) != 0) {
            z3 = true;
        }
        if ((i3 & 32) != 0) {
            i4 = 2131844962;
        }
        if ((i3 & 64) != 0) {
            z4 = true;
        }
        c0mv0.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveDraftWithRecordScene: begin, deleteRecordFiles=");
        sbLIZ.append(z4);
        sbLIZ.append(", scene=");
        sbLIZ.append(LJIJJ(C1439190nYT.LIZ()));
        sbLIZ.append(", saveFrom=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        Pair<AwemeDraft, VideoPublishEditModel> pairLJJ = c0mv0.LJJ(z4);
        if (pairLJJ == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("saveDraftWithRecordScene: recordScene2Draft=null, deleteRecordFiles=");
            sbLIZ2.append(z4);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (function12 != null) {
                function12.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        c0mv0.LJJIIJ(activity, pairLJJ.getFirst(), pairLJJ.getSecond(), i, z3, i4, z2, function12);
    }

    public final void LJJIIJ(final Activity activity, AwemeDraft awemeDraft, final VideoPublishEditModel videoPublishEditModel, final int i, final boolean z, final int i2, final boolean z2, final Function1<? super Boolean, Unit> function1) {
        final VideoPublishEditModel videoPublishEditModelLIZJ;
        String enterFrom;
        String str;
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        if (this.LJIIIIZZ || awemeDraft == null) {
            return;
        }
        int i3 = 0;
        awemeDraft.LJJJJIZL.publishStage = 0;
        awemeDraft.lastEditTime = System.currentTimeMillis();
        if (awemeDraft.LJ == null) {
            awemeDraft.LJII = null;
        }
        if (videoPublishEditModel == null) {
            new C1438570nXT("CheckPointServiceImpl");
            videoPublishEditModelLIZJ = C1438570nXT.LIZJ(awemeDraft, false);
        } else {
            videoPublishEditModelLIZJ = videoPublishEditModel;
        }
        if (videoPublishEditModelLIZJ.isMultiVideoEdit()) {
            MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModelLIZJ.getMultiEditVideoRecordData();
            if (multiEditVideoRecordData2 != null) {
                str = multiEditVideoRecordData2.coverImagePath;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                C0MVV.LIZ.getClass();
                if (C0MVV.LIZIZ != null && (multiEditVideoRecordData = videoPublishEditModelLIZJ.getMultiEditVideoRecordData()) != null) {
                    multiEditVideoRecordData.coverImagePath = C0MVV.LIZIZ;
                }
            }
        }
        C1428470nHB.LIZJ(videoPublishEditModelLIZJ.creativeModel.draftInfoModel);
        DraftInfoModel draftInfoModel = videoPublishEditModelLIZJ.creativeModel.draftInfoModel;
        StringBuilder sb = new StringBuilder();
        char[] charArray = "auto_save_from_continue_popup".toCharArray();
        int length = charArray.length;
        int i4 = 0;
        while (i3 < length) {
            char c = charArray[i3];
            int i5 = i4 + 1;
            if (Character.isUpperCase(c) && i4 != 0) {
                sb.append("_");
                sb.append(String.valueOf(c).toLowerCase(Locale.ROOT));
            } else {
                sb.append(String.valueOf(c).toLowerCase(Locale.ROOT));
            }
            i3++;
            i4 = i5;
        }
        draftInfoModel.saveDraftScene = sb.toString();
        videoPublishEditModelLIZJ.setShootEnterMethod("continue_popup_auto_save");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[saveDraft]: creation id = ");
        sbLIZ.append(awemeDraft.LIZ());
        C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIIIZZ = true;
        if (z2) {
            C01TT.LIZLLL(new AwS409S0200000_8(this, activity, 159));
        }
        if (videoPublishEditModel == null || (enterFrom = videoPublishEditModel.getEnterFrom()) == null) {
            enterFrom = "";
        }
        C1402520mbK.LIZLLL(videoPublishEditModelLIZJ, enterFrom, null, false, Boolean.FALSE, "", null, null, null);
        C741040T5a.LIZ.execute(new Runnable() { // from class: X.0MBP
            /* JADX WARN: Removed duplicated region for block: B:44:0x0104  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 328
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0MBP.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CheckPointServiceImpl@1176.saveDraft$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CheckPointServiceImpl@1176.saveDraft$1");
            }
        });
    }
}
