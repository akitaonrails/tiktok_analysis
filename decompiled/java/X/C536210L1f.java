package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateAlbumService;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateDetailService;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.TemplateConsumeData;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.external.ui.MediaChooseResultListener;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import com.ss.android.ugc.aweme.utils.oh;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0L1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536210L1f implements InterfaceC533910Kwn {
    public final long LIZ;
    public final long LIZIZ;
    public AnonymousClass0956 LIZJ;
    public InterfaceC2357009Lk LIZLLL;
    public List<? extends VideoSegment> LJ;
    public final WeakReference<Activity> LJFF;
    public CreativeDialogWrapper LJI;
    public int LJII;
    public long LJIIJ;
    public TemplateConsumeCoreParam LJIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public int LJIIIIZZ = 1005;
    public long LJIIIZ = -1;
    public String LJIIJJI = "";
    public String LJIILIIL = "";
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(130));

    @Override // X.InterfaceC533910Kwn
    public final void LIZ() {
    }

    @Override // X.InterfaceC533910Kwn
    public final void LIZJ(List<? extends MediaModel> list, Intent intent, boolean z, Function0<Unit> function0) {
    }

    public final ITemplateConsumeService LJIIIIZZ() {
        return (ITemplateConsumeService) this.LJIILLIIL.getValue();
    }

    public final Pair<Integer, Integer> LJIIJ() {
        List<? extends VideoSegment> list = this.LJ;
        int i = 0;
        if (list == null) {
            return new Pair<>(0, 0);
        }
        if (!list.isEmpty()) {
            Iterator<? extends VideoSegment> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().isImageType && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(list.size() - i));
    }

    public static final List<ImportVideoInfo> LJII(List<? extends VideoSegment> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (VideoSegment videoSegment : list) {
            int i = videoSegment.width;
            int i2 = videoSegment.height;
            int iLIZIZ = videoSegment.LIZIZ();
            int iLIZJ = videoSegment.LIZJ();
            String strLJFF = videoSegment.LJFF(true);
            strLJFF.toString();
            long j = videoSegment.duration;
            long jLIZLLL = videoSegment.LIZLLL() - videoSegment.LJII();
            String str = videoSegment.mDescription;
            String str2 = videoSegment.mMusicId;
            int iLJ = videoSegment.LJ();
            float fLJI = videoSegment.LJI();
            String strLJFF2 = videoSegment.LJFF(false);
            strLJFF2.toString();
            arrayList.add(new ImportVideoInfo(i, i2, iLIZIZ, iLIZJ, strLJFF, j, jLIZLLL, str, str2, iLJ, fLJI, strLJFF2, videoSegment.originPath, videoSegment.fastImportDependHW, null, videoSegment.aigcInfo, videoSegment.date));
        }
        return arrayList;
    }

    public static void LJIIL(TemplateConsumeCoreParam templateConsumeCoreParam) {
        String strLIZIZ;
        ITemplateDetailService iTemplateDetailService = C536250L1j.LIZ;
        if (iTemplateDetailService == null || (strLIZIZ = iTemplateDetailService.LIZIZ(templateConsumeCoreParam.templateId)) == null) {
            strLIZIZ = "";
        }
        ITemplateMobService iTemplateMobService = (ITemplateMobService) PluggableExtentionKt.pluggableSpi$default(ITemplateMobService.class, false, false, false, 14, null);
        if (iTemplateMobService != null) {
            iTemplateMobService.LIZJ(templateConsumeCoreParam.templateId, Integer.valueOf(templateConsumeCoreParam.templateType.getValue()), strLIZIZ, templateConsumeCoreParam.dispatchType.LIZ);
        }
    }

    public static List LJJ(TemplateConsumeCoreParam templateConsumeCoreParam) {
        List<TemplateSlot> listLJIIIZ;
        int iDoubleValue;
        ITemplateAlbumService iTemplateAlbumService = C523300Kfg.LIZ;
        if (iTemplateAlbumService == null || (listLJIIIZ = iTemplateAlbumService.LJIIIZ(templateConsumeCoreParam.templateId, templateConsumeCoreParam.templateType)) == null || listLJIIIZ.size() < 2) {
            return null;
        }
        Iterator<TemplateSlot> it2 = listLJIIIZ.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        TemplateSlot next = it2.next();
        double clipEnd = next.getClipEnd() - next.getClipStart();
        while (it2.hasNext()) {
            TemplateSlot next2 = it2.next();
            clipEnd = Math.max(clipEnd, next2.getClipEnd() - next2.getClipStart());
        }
        Double dValueOf = Double.valueOf(clipEnd);
        if (dValueOf == null || (iDoubleValue = (int) (dValueOf.doubleValue() * ((double) LSPassThroughRecordSizeConfig.DEFAULT))) <= 0) {
            return null;
        }
        return Collections.singletonList(new Pair(0, Integer.valueOf(iDoubleValue)));
    }

    public static final C0E4S LJJIFFI(VideoSegment videoSegment) {
        NLEResType nLEResType;
        String strLJFF = videoSegment.LJFF(false);
        if (videoSegment.isImageType) {
            nLEResType = NLEResType.IMAGE;
        } else {
            nLEResType = NLEResType.VIDEO;
        }
        long j = videoSegment.duration;
        float fLJI = videoSegment.LJI();
        long jLJII = videoSegment.LJII();
        long jLIZLLL = videoSegment.LIZLLL();
        String str = videoSegment.slotId;
        if (str == null) {
            str = "";
        }
        C0E4S c0e4s = new C0E4S(strLJFF, nLEResType, j, fLJI, jLJII, jLIZLLL, str, null, 128);
        c0e4s.LJII.put("create_time", Long.valueOf(videoSegment.date));
        return c0e4s;
    }

    public final void LJIIZILJ(String str) {
        TemplateConsumeCoreParam templateConsumeCoreParam = this.LJIIL;
        if (templateConsumeCoreParam == null) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("cancel_from", "click");
        c0lab.LIZIZ(System.currentTimeMillis() - this.LJIIJ, "time_elapsed");
        C20684815ws.LJIILLIIL("click_cancel_loading_content", c0lab.LIZ);
        LJIJI(3, str, "click");
        LJIILL(templateConsumeCoreParam, str, -1, "dismissDialog");
        LJIJ(this, templateConsumeCoreParam, str, -1, "dismissDialog", 0, null, 48);
    }

    public final Pair<Integer, String> LJIJJLI(C532520KuY c532520KuY) {
        if (this.LJFF.get() != null) {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                return new Pair<>(-10001, "network is not available");
            }
        }
        List<String> list = c532520KuY.LJII;
        if (list.contains("mattingTemplate")) {
            return new Pair<>(-10004, "matting failed");
        }
        if (list.contains("downloadMusic")) {
            return new Pair<>(-10002, "music download failed");
        }
        if (list.contains("magicTemplate")) {
            return new Pair<>(-10002, "magic apply failed");
        }
        if (list.contains("downloadTemplateZip")) {
            return new Pair<>(-10002, "download template zip failed");
        }
        return new Pair<>(-10002, "template apply failed");
    }

    public final void LJJI(String str) {
        this.LJIILIIL = str;
    }

    public final void LJJII(int i) {
        this.LJII = Math.min(i, 100);
        CreativeDialogWrapper creativeDialogWrapper = this.LJI;
        if (creativeDialogWrapper != null && creativeDialogWrapper.isShowing()) {
            CreativeLoadingDialog.DefaultImpls.updateProgress$default(creativeDialogWrapper, this.LJII, false, 2, null);
        }
    }

    public C536210L1f(Activity activity, long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LJFF = new WeakReference<>(activity);
    }

    public static ArrayList LJIIJJI(List list, Intent intent, InterfaceC497601wk interfaceC497601wk) {
        if (C297650Blb.LIZ()) {
            C2356009La.LIZ.getClass();
            return C571930Mbv.LIZ(list, false, C2356009La.LIZIZ, false, 2);
        }
        if (interfaceC497601wk != null) {
            C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZ, null, new C2355709Kx(intent, null), 2);
        }
        return C571930Mbv.LIZ(list, false, C2355609Kw.INSTANCE, false, 10);
    }

    public static final Object LJIILLIIL(List<? extends MediaModel> list, Intent intent, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return true;
    }

    public static TemplateConsumeCoreParam LJIL(Intent intent, Intent intent2, String str) {
        boolean z;
        Integer numLIZIZ;
        EnumC1412640mre enumC1412640mreLIZJ;
        TemplateConsumeCoreParam templateConsumeCoreParam = (TemplateConsumeCoreParam) intent.getParcelableExtra("template_consume_core_param");
        if (templateConsumeCoreParam != null) {
            return templateConsumeCoreParam;
        }
        TemplateConsumeData templateConsumeData = C0MUK.LIZIZ(intent2).templateConsumeData;
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "";
        if (z && (str = templateConsumeData.templateId) == null) {
            str = "";
        }
        if (str.length() != 0) {
            z2 = false;
        }
        if (z2 || (numLIZIZ = C1412630mrd.LIZIZ(templateConsumeData.templateType)) == null || (enumC1412640mreLIZJ = C1412660mrg.LIZJ(numLIZIZ.intValue())) == null) {
            return null;
        }
        String str3 = templateConsumeData.dispatchType;
        if (str3 != null) {
            str2 = str3;
        }
        return new TemplateConsumeCoreParam(str, enumC1412640mreLIZJ, new C1412390mrF(str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r7, com.ss.android.ugc.aweme.creative.model.CreativeModel r8, X.InterfaceC1364105Vn<? super java.util.ArrayList<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel>> r9) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C536210L1f.LJ(java.util.List, com.ss.android.ugc.aweme.creative.model.CreativeModel, X.05Vn):java.lang.Object");
    }

    public final void LJIJI(int i, String str, String str2) {
        Pair<Integer, Integer> pairLJIIJ = LJIIJ();
        int iIntValue = pairLJIIJ.getFirst().intValue();
        int iIntValue2 = pairLJIIJ.getSecond().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZIZ(System.currentTimeMillis() - this.LJIIJ, "time_elapsed");
        long j = 0;
        if (this.LJIIIZ > 0) {
            c0lab.LIZIZ(System.currentTimeMillis() - this.LJIIIZ, "interval_click_next");
        }
        c0lab.LIZ(iIntValue, "pic_cnt");
        c0lab.LIZ(iIntValue2, "video_cnt");
        boolean z = true;
        if (iIntValue + iIntValue2 <= 1) {
            z = false;
        }
        c0lab.LJFF("is_multi_content", z);
        c0lab.LJ("is_from_editor_pro", CardStruct.IStatusCode.DEFAULT);
        List<? extends VideoSegment> list = this.LJ;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                j += ((VideoSegment) it2.next()).duration;
            }
        }
        c0lab.LIZIZ(j, "total_import_duration");
        c0lab.LIZ(0, "is_use_sound_sync");
        c0lab.LIZ(0, "is_music_pre_download_success");
        c0lab.LIZ(0, "is_from_layout");
        c0lab.LIZ(0, "stage");
        c0lab.LJ("creation_id", this.LJIILIIL);
        if (str == null) {
            str = "";
        }
        c0lab.LJ("shoot_way", str);
        if (str2 != null) {
            c0lab.LJ("cancel_from", str2);
        }
        C20684815ws.LJIILLIIL("tools_performance_pre_cut_opt_process", c0lab.LIZ);
    }

    public final void LJIILIIL(TemplateConsumeCoreParam templateConsumeCoreParam, String str, long j, boolean z) {
        String strLIZIZ;
        int i;
        ITemplateDetailService iTemplateDetailService = C536250L1j.LIZ;
        String str2 = null;
        if (iTemplateDetailService == null || (strLIZIZ = iTemplateDetailService.LIZIZ(templateConsumeCoreParam.templateId)) == null) {
            strLIZIZ = "";
        }
        ITemplateMobService iTemplateMobService = (ITemplateMobService) PluggableExtentionKt.pluggableSpi$default(ITemplateMobService.class, false, false, false, 14, null);
        if (iTemplateMobService != null) {
            String str3 = templateConsumeCoreParam.templateId;
            Integer numValueOf = Integer.valueOf(templateConsumeCoreParam.templateType.getValue());
            String str4 = templateConsumeCoreParam.dispatchType.LIZ;
            if (z) {
                i = 0;
            } else {
                i = -10003;
            }
            if (!z) {
                str2 = "compressVideo failed";
            }
            iTemplateMobService.LJ(str3, numValueOf, strLIZIZ, str4, "compress_video", j, z, i, false, str2, null, null, str, this.LJIILIIL, true, new LinkedHashMap());
        }
    }

    public final void LJIILL(TemplateConsumeCoreParam templateConsumeCoreParam, String str, int i, String str2) {
        String strLIZIZ;
        ITemplateDetailService iTemplateDetailService = C536250L1j.LIZ;
        if (iTemplateDetailService != null) {
            strLIZIZ = iTemplateDetailService.LIZIZ(templateConsumeCoreParam.templateId);
        } else {
            strLIZIZ = null;
        }
        String str3 = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        Pair[] pairArr = new Pair[2];
        if (str != null) {
            str3 = str;
        }
        pairArr[0] = new Pair("shoot_way", str3);
        pairArr[1] = new Pair("creation_id", this.LJIILIIL);
        HashMap mapLJI = C2097608Jq.LJI(pairArr);
        ITemplateMobService iTemplateMobService = (ITemplateMobService) PluggableExtentionKt.pluggableSpi$default(ITemplateMobService.class, false, false, false, 14, null);
        if (iTemplateMobService != null) {
            iTemplateMobService.LJIIIZ(templateConsumeCoreParam.templateId, Integer.valueOf(templateConsumeCoreParam.templateType.getValue()), strLIZIZ, templateConsumeCoreParam.dispatchType.LIZ, Long.valueOf(System.currentTimeMillis() - this.LJIIJ), Integer.valueOf(i), str2, mapLJI, true);
        }
    }

    @Override // X.InterfaceC533910Kwn
    public final void LIZIZ(List<? extends MediaModel> list, Intent intent, Intent intent2, MediaChooseResultListener mediaChooseResultListener, Function0<Unit> function0) {
        String stringExtra;
        long jCurrentTimeMillis;
        AnonymousClass0956 anonymousClass0956 = this.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJIILJJIL = false;
        this.LJIILL = false;
        if (list.isEmpty()) {
            if (mediaChooseResultListener != null) {
                mediaChooseResultListener.onMediaChooseFail("selectedMediaList is null or empty");
            }
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Activity activity = this.LJFF.get();
        if (activity == null) {
            return;
        }
        C443120HZe<Boolean, Integer, Long> c443120HZeCheckMediaDurationValid = C0CHQ.LIZ().LJJJJJ().getAlbumService().checkMediaDurationValid(activity, list, 0L, this.LIZIZ);
        boolean zBooleanValue = c443120HZeCheckMediaDurationValid.getFirst().booleanValue();
        long jLongValue = c443120HZeCheckMediaDurationValid.getThird().longValue();
        if (!zBooleanValue) {
            if (mediaChooseResultListener != null) {
                mediaChooseResultListener.onMediaChooseFail("media duration is invalid");
            }
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(intent2);
        try {
            stringExtra = intent2.getStringExtra("shoot_way");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        this.LJIIIZ = intent2.getLongExtra("extra_start_enter_cut_page", -1L);
        Long lValueOf = Long.valueOf(intent.getLongExtra("extra_start_enter_edit_page", 0L));
        if (lValueOf.longValue() != 0) {
            jCurrentTimeMillis = lValueOf.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.LJIIJ = jCurrentTimeMillis;
        this.LIZJ = C23250099c.LIZLLL(C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ)), null, null, new C0L1T(this, list, intent2, intent, creativeModelLIZIZ, stringExtra, AFwS239S0000000_8.get$arr$(75), mediaChooseResultListener, function0, jLongValue, null), 3);
    }

    public static void LJIILJJIL(TemplateConsumeCoreParam templateConsumeCoreParam, String str, long j, int i, int i2, int i3, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("template_id", templateConsumeCoreParam.templateId);
        c0lab.LJ("tt_template_type", C1412630mrd.LIZLLL(templateConsumeCoreParam.templateType));
        c0lab.LJ("dispatch_type", templateConsumeCoreParam.dispatchType.LIZ);
        if (0 >= j) {
            j = 0;
        }
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("shoot_way", str);
        c0lab.LIZ(i, "pic_cnt");
        c0lab.LIZ(i2, "video_cnt");
        c0lab.LIZ(i3, "error_code");
        c0lab.LJ("error_msg", str2);
        C20684815ws.LJIILLIIL("ugc_template_import_material", c0lab.LIZ);
    }

    public final Pair<Intent, C569220MUe> LIZLLL(Intent intent, Intent intent2, VideoPublishEditModel videoPublishEditModel, List<? extends VideoSegment> list, ArrayList<ImportVideoInfo> arrayList, Cut2EditTransferModel cut2EditTransferModel, int i) {
        boolean z;
        if (videoPublishEditModel != null) {
            C580260MpM.LIZ(intent2, videoPublishEditModel);
        }
        Serializable serializableExtra = intent.getSerializableExtra("auto_selected_anchors");
        if (serializableExtra != null) {
            intent2.putExtra("auto_selected_anchors", serializableExtra);
        }
        Serializable serializableExtra2 = intent.getSerializableExtra("av_challenge_list");
        if (serializableExtra2 != null) {
            intent2.putExtra("av_challenge_list", serializableExtra2);
        }
        try {
            String stringExtra = intent.getStringExtra("open_platform_share_id");
            if (stringExtra != null) {
                intent2.putExtra("open_platform_share_id", stringExtra);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Workspace workspaceLIZ = C14D2.LIZ(C537520L6g.LIZ(intent2));
        C569220MUe c569220MUe = new C569220MUe();
        c569220MUe.LJIIIIZZ = workspaceLIZ;
        C569350MUr.LIZ.getClass();
        C569350MUr.LIZIZ(c569220MUe, intent2);
        boolean z2 = false;
        if (list.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        C569360MUs c569360MUs = new C569360MUs(list, 0L, z, false, null);
        C571550MbJ.LIZ.getClass();
        EditPreviewInfo editPreviewInfoLIZ = C571550MbJ.LIZ(true, workspaceLIZ, list, new long[]{-1, -1});
        editPreviewInfoLIZ.setPreviewVideoLength(i);
        oh.LIZ.getClass();
        oh.LIZIZ = i;
        MultiEditVideoRecordData multiEditVideoRecordDataLIZIZ = C574800MgY.LIZIZ(editPreviewInfoLIZ.getVideoList());
        if (multiEditVideoRecordDataLIZIZ == null) {
            return null;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
        Iterator<? extends VideoSegment> it2 = list.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += it2.next().duration;
        }
        multiEditVideoRecordDataLIZIZ.endTime = Math.min(j, C536240L1i.LIZ());
        if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
            if (multiEditVideoRecordDataLIZIZ.segmentDataList.size() == 1) {
                z2 = true;
            }
            multiEditVideoRecordDataLIZIZ.isSingleVideo = z2;
            multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordDataLIZIZ.cloneData();
        }
        multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordDataLIZIZ;
        C569350MUr c569350MUr = C569350MUr.LIZ;
        Intent intent3 = new Intent(intent2);
        long j2 = this.LJIIJ;
        c569350MUr.getClass();
        Intent intentLIZJ = C569350MUr.LIZJ(intent3, c569220MUe, c569360MUs, j2, true);
        intentLIZJ.putExtra("workspace", workspaceLIZ);
        C0MUK.LIZIZ(intentLIZJ).editModel.editPreviewInfo = editPreviewInfoLIZ;
        C0MUK.LIZIZ(intentLIZJ).editModel.multiEditVideoStatusRecordData = multiEditVideoStatusRecordData;
        C0MUK.LIZIZ(intentLIZJ).cut2EditTransferModel = cut2EditTransferModel;
        if (!arrayList.isEmpty()) {
            C0MUK.LIZIZ(intentLIZJ).albumModel.importInfoList = arrayList;
        }
        return new Pair<>(intentLIZJ, c569220MUe);
    }

    public static void LJIJ(C536210L1f c536210L1f, TemplateConsumeCoreParam templateConsumeCoreParam, String str, int i, String str2, int i2, Set set, int i3) {
        Set set2 = set;
        String str3 = str2;
        int i4 = i;
        int i5 = 0;
        if ((i3 & 4) != 0) {
            i4 = 0;
        }
        if ((i3 & 8) != 0) {
            str3 = "";
        }
        if ((i3 & 16) == 0) {
            i5 = i2;
        }
        if ((i3 & 32) != 0) {
            set2 = C08CX.INSTANCE;
        }
        if (templateConsumeCoreParam != null) {
            if (!c536210L1f.LJIILJJIL) {
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("shoot_way", str);
                c0lab.LJ("template_id", templateConsumeCoreParam.templateId);
                c0lab.LJ("tt_template_type", C1412630mrd.LIZLLL(templateConsumeCoreParam.templateType));
                c0lab.LJ("dispatch_type", templateConsumeCoreParam.dispatchType.LIZ);
                c0lab.LIZIZ(System.currentTimeMillis() - c536210L1f.LJIIJ, "duration");
                c0lab.LIZ(i4, "error_code");
                c0lab.LJ("error_msg", str3);
                c0lab.LIZ(i5, "final_status");
                if (!set2.isEmpty()) {
                    c0lab.LJ("template_feature", C13LP.LJJLIIIJ(set2, ",", null, null, 0, null, null, 62));
                }
                C20684815ws.LJIILLIIL("ugc_template_next_concat", c0lab.LIZ);
                if (i4 != -1) {
                    c536210L1f.LJIILL(templateConsumeCoreParam, str, i4, str3);
                }
                c536210L1f.LJIILJJIL = true;
                return;
            }
            return;
        }
        c536210L1f.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0280  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r14v7, types: [T, kotlin.Pair] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x02ea -> B:11:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(com.ss.android.ugc.aweme.creative.model.CreativeInfo r34, java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r35, boolean r36, boolean r37, java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> r38, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r39, com.ss.android.ugc.aweme.creative.model.CreativeModel r40, X.InterfaceC1364105Vn<? super X.C443120HZe<java.lang.Boolean, java.lang.Boolean, java.lang.Long>> r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C536210L1f.LJFF(com.ss.android.ugc.aweme.creative.model.CreativeInfo, java.util.List, boolean, boolean, java.util.List, kotlin.jvm.functions.Function1, com.ss.android.ugc.aweme.creative.model.CreativeModel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.EnumC1412640mre r22, android.content.Intent r23, android.content.Intent r24, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r25, com.bytedance.ies.nle.editor_jni.NLETemplateModel r26, java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r27, java.util.ArrayList<com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo> r28, com.ss.android.ugc.aweme.edit.Cut2EditTransferModel r29, int r30, X.InterfaceC1364105Vn<? super java.lang.Boolean> r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C536210L1f.LJIIIZ(X.0mre, android.content.Intent, android.content.Intent, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.bytedance.ies.nle.editor_jni.NLETemplateModel, java.util.List, java.util.ArrayList, com.ss.android.ugc.aweme.edit.Cut2EditTransferModel, int, X.05Vn):java.lang.Object");
    }
}
