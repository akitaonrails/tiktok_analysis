package X;

import Y.AgS34S0500000_8;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.compileconfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.forward.OnThisDayPostData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS6S1001000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.b;

/* JADX INFO: renamed from: X.0MKJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MKJ {
    public static AnonymousClass0956 LIZIZ;
    public static AnonymousClass0956 LIZJ;
    public static CreativeInfo LJ;
    public static final C0MKJ LIZ = new C0MKJ();
    public static final C0MKL LIZLLL = new C0MKL();
    public static final Map<String, C0MKQ> LJFF = new ConcurrentHashMap();
    public static final Map<String, C09AE> LJI = new ConcurrentHashMap();

    public static final void LJ() {
        LJIJI(false);
        C0MKL c0mkl = LIZLLL;
        c0mkl.LIZLLL();
        LJIJJ(1, AFwS239S0000000_8.get$arr$(1));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finish setup environment,total cost:");
        sbLIZ.append(c0mkl.LIZ());
        sbLIZ.append(" ms,downloadVideo cost:");
        C138P c138p = c0mkl.LIZIZ;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        sbLIZ.append(c138p.LIZIZ(timeUnit));
        sbLIZ.append(" ms,downloadStyleCost:");
        sbLIZ.append(c0mkl.LIZLLL.LIZIZ(timeUnit));
        sbLIZ.append(" ms,calculateBgCost:");
        sbLIZ.append(c0mkl.LIZJ.LIZIZ(timeUnit));
        sbLIZ.append(" ms");
        LJIJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LJIIL() {
        return C570490MZb.LIZJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.STREAM_EDIT_VIDEO, "", true).getAbsolutePath());
    }

    public static boolean LIZIZ(List list) {
        if (!list.isEmpty()) {
            if (list.isEmpty()) {
                return true;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!new C0VSJ((String) it2.next()).exists()) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(InterfaceC346701Wf interfaceC346701Wf) {
        C0XIR c0xir;
        C23112093u c23112093u;
        LJIJ("exception happen in prepareDataFlow,directly cancel");
        AnonymousClass0956 anonymousClass0956 = LIZIZ;
        String errorMsg = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        int errorCode = 0;
        LJIJI(false);
        LIZLLL.LIZLLL();
        if (interfaceC346701Wf instanceof CancellationException) {
            Throwable th = (Throwable) interfaceC346701Wf;
            Throwable cause = th.getCause();
            if ((cause instanceof C0XIR) && (c23112093u = (C23112093u) cause) != null) {
                errorCode = c23112093u.getErrorCode();
            }
            Throwable cause2 = th.getCause();
            if ((cause2 instanceof C0XIR) && (c0xir = (C0XIR) cause2) != null) {
                errorMsg = c0xir.getErrorMsg();
            }
            LJIJJ(-1, new AwS6S1001000_8(errorCode, errorMsg, 0));
        }
    }

    public static ForwardMediaDownloader.DownloadConfig LJI(ForwardMedia forwardMedia) {
        String strLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C08HM.LIZJ((String) C13LP.LJJJJZI(forwardMedia.video.getPlayAddressList())));
        sbLIZ.append(".mp4");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLJIIL);
        sbLIZ2.append(strLIZIZ);
        return new ForwardMediaDownloader.DownloadConfig(strLJIIL, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), true, -1L, false);
    }

    public static List LJII(ForwardMedia forwardMedia) {
        List<PhotoModeImageUrlModel> imageList;
        String str;
        List<String> urlList;
        String strLJIIL = LJIIL();
        PhotoModeImageInfo photoModeImageInfo = forwardMedia.photoModeImageInfo;
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
            for (PhotoModeImageUrlModel photoModeImageUrlModel : imageList) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                UrlModel urlModel = photoModeImageUrlModel.displayImageNoWatermark;
                if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
                    str = (String) C13LP.LJJJJZI(urlList);
                } else {
                    str = null;
                }
                sbLIZ.append(C08HM.LIZJ(str));
                sbLIZ.append(".png");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLJIIL);
                sbLIZ2.append(strLIZIZ);
                arrayList.add(new ForwardMediaDownloader.DownloadConfig(strLJIIL, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), true, -1L, false));
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static int LJIILLIIL(ForwardMedia forwardMedia) {
        if (forwardMedia.isStory()) {
            return 1;
        }
        if (forwardMedia.localMedia == null) {
            return 0;
        }
        return 2;
    }

    public static ArrayList LJIIZILJ(String str) {
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(str, iArr) != 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[6];
        int i4 = iArr[8];
        long j = iArr[3];
        arrayList.add(new ImportVideoInfo(i, i2, i3, i4, str, j, j, null, null, iArr[7], 1.0f, str, str, false, null, null, 0L, 98304, null));
        return arrayList;
    }

    public static void LJIJ(String str) {
        C1429810nJL c1429810nJL = C1429810nJL.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForwardEnvironment->");
        sbLIZ.append(str);
        C201955140j.LIZJ(c1429810nJL, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIJI(boolean z) {
        C0MVY c0mvy;
        C194353111z c194353111z = C194353111z.LIZ;
        if (z) {
            c0mvy = C0MVY.SHOW;
        } else {
            c0mvy = C0MVY.DISMISS;
        }
        c194353111z.LIZIZ(1605, c0mvy, C0LD3.DUAL_BALL_WITH_MESSAGE, C0LEP.CLOSE_GONE);
    }

    public static Pair LJIL(ForwardMedia forwardMedia) {
        List<PhotoModeImageUrlModel> imageList;
        if (forwardMedia.localMedia == null) {
            if (forwardMedia.awemeType != 150) {
                if (forwardMedia.video.getPlayAddressList().isEmpty() || ((String) C13LP.LJJLIIIJJI(forwardMedia.video.getPlayAddressList())).length() == 0) {
                    return new Pair(-5000, "error for url invalid");
                }
                return null;
            }
            PhotoModeImageInfo photoModeImageInfo = forwardMedia.photoModeImageInfo;
            if (photoModeImageInfo != null && !C086I.LIZIZ(photoModeImageInfo.getImageList())) {
                PhotoModeImageInfo photoModeImageInfo2 = forwardMedia.photoModeImageInfo;
                if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null) {
                    Iterator<PhotoModeImageUrlModel> it2 = imageList.iterator();
                    while (it2.hasNext()) {
                        UrlModel urlModel = it2.next().displayImageNoWatermark;
                        if (urlModel == null || C086I.LIZIZ(urlModel.getUrlList())) {
                        }
                    }
                    return null;
                }
                return null;
            }
            return new Pair(-5000, "error for url invalid");
        }
        return null;
    }

    public static boolean LIZLLL(long j, List list) {
        String strLJFF;
        String strLJFF2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            OnThisDayTiktokMediaModel onThisDayTiktokMediaModel = (OnThisDayTiktokMediaModel) it2.next();
            ForwardMedia forwardMedia = onThisDayTiktokMediaModel.forwardMedia;
            LIZ.getClass();
            int i3 = C0L3V.LIZ[onThisDayTiktokMediaModel.loadSource.ordinal()];
            if (i3 == 1 ? (strLJFF = onThisDayTiktokMediaModel.LJFF()) == null || strLJFF.length() == 0 : i3 != 2 && (onThisDayTiktokMediaModel.forwardMedia == null || (strLJFF2 = onThisDayTiktokMediaModel.LJFF()) == null || strLJFF2.length() == 0)) {
                String strLIZ = "";
                if (onThisDayTiktokMediaModel.LJIILJJIL()) {
                    if (forwardMedia != null) {
                        strLIZ = C0MKZ.LIZJ(forwardMedia);
                    }
                    arrayList.add(strLIZ);
                } else {
                    if (forwardMedia != null) {
                        strLIZ = C0MKZ.LIZ(forwardMedia);
                    }
                    arrayList2.add(strLIZ);
                }
                z = false;
            }
            if (onThisDayTiktokMediaModel.LJIILJJIL()) {
                i++;
            } else {
                i2++;
            }
        }
        if (!z) {
            C201955140j.LIZLLL(C201967140v.LIZIZ, "ForwardEnvironment", "prepare: download materials failed.");
            C0ML7 c0ml7 = C0ML7.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downloadFailedUrlListVideo: ");
            sbLIZ.append(arrayList);
            sbLIZ.append("\ndownloadFailedUrlListImg: ");
            sbLIZ.append(arrayList2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c0ml7.getClass();
            C0ML7.LJIIJJI(1, i, i2, jCurrentTimeMillis, "view_all_total", strLIZIZ);
            return false;
        }
        C0ML7 c0ml72 = C0ML7.LIZ;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
        c0ml72.getClass();
        C0ML7.LJIIJJI(0, i, i2, jCurrentTimeMillis2, "view_all_total", "");
        return true;
    }

    public static void LJIJJ(int i, Function1 function1) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C0MKL c0mkl = LIZLLL;
        c0lab.LIZIZ(c0mkl.LIZ(), "total_time");
        C138P c138p = c0mkl.LIZIZ;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0lab.LIZIZ(c138p.LIZIZ(timeUnit), "download_video_time");
        c0lab.LIZIZ(c0mkl.LIZLLL.LIZIZ(timeUnit), "download_style_time");
        c0lab.LIZIZ(c0mkl.LIZJ.LIZIZ(timeUnit), "calculate_bg_time");
        c0lab.LIZIZ(0L, "external_cache_size");
        function1.invoke(c0lab);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tools_performance_on_this_day_pre_process", c0lab.LIZ);
    }

    public static void LJJIFFI(int i, Context context) {
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null || (activityLIZ = C19713312Ax.LIZIZ()) != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(i);
            C1390380mHk.LIZ(activityLIZ, 6001, creativeToastBuilder);
        }
    }

    public static String LJFF(CreativeInfo creativeInfo, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.CONCAT, null, false, 12));
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C2471909mP.LIZJ(str, strLIZIZ)) {
            return strLIZIZ;
        }
        return str;
    }

    public static void LJIIJJI(CreativeInfo creativeInfo, List list, Function2 function2) {
        AnonymousClass0956 anonymousClass0956 = LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LIZJ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C566640MKg(list, function2, creativeInfo, null), 3);
    }

    public static Intent LJIILJJIL(Context context, C0MKG c0mkg, VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModelLJIIIIZZ;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        boolean z;
        OnThisDayData onThisDayData;
        String str;
        Intent intent = new Intent();
        if (videoPublishEditModel == null || (creativeModelLJIIIIZZ = videoPublishEditModel.creativeModel) == null) {
            creativeModelLJIIIIZZ = C0MUK.LJIIIIZZ();
        }
        C0MUK.LJIIIZ(intent, creativeModelLJIIIIZZ);
        C537520L6g.LIZLLL(intent, c0mkg.LIZ);
        AVChallenge aVChallenge = new AVChallenge();
        aVChallenge.challengeName = context.getString(2131821884);
        intent.putExtra("challenge", (Serializable) Collections.singletonList(aVChallenge));
        C0MKJ c0mkj = LIZ;
        Pair<Integer, Integer> pair = c0mkg.LIZLLL;
        String str2 = c0mkg.LJ;
        c0mkj.getClass();
        VideoFileInfo videoFileInfoLJIIJ = C571500MbE.LJIIJ(str2);
        VideoPublishEditModel videoPublishEditModel2 = null;
        EditVideoSegment editVideoSegment = new EditVideoSegment(str2, null, videoFileInfoLJIIJ);
        EditPreviewInfo editPreviewInfoLIZ = new C538330L9j(pair.getFirst().intValue(), pair.getSecond().intValue(), 12).LIZ(new EditVideoSegment(str2, null, videoFileInfoLJIIJ));
        List listSingletonList = Collections.singletonList(editVideoSegment);
        MultiEditVideoRecordData multiEditVideoRecordDataLIZIZ = C574800MgY.LIZIZ(editPreviewInfoLIZ.getVideoList());
        if (multiEditVideoRecordDataLIZIZ == null) {
            multiEditVideoStatusRecordData = null;
        } else {
            multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
            Iterator it2 = listSingletonList.iterator();
            long duration = 0;
            while (it2.hasNext()) {
                duration += ((EditVideoSegment) it2.next()).getVideoFileInfo().getDuration();
            }
            multiEditVideoRecordDataLIZIZ.endTime = Math.min(duration, C536240L1i.LIZ());
            if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
                if (multiEditVideoRecordDataLIZIZ.segmentDataList.size() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                multiEditVideoRecordDataLIZIZ.isSingleVideo = z;
                multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordDataLIZIZ.cloneData();
            }
            multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordDataLIZIZ;
        }
        ArrayList<ImportVideoInfo> arrayListLJIIZILJ = LJIIZILJ(str2);
        C0MUK.LIZIZ(intent).editModel.multiEditVideoStatusRecordData = multiEditVideoStatusRecordData;
        C0MUK.LIZIZ(intent).editModel.editPreviewInfo = editPreviewInfoLIZ;
        C0MUK.LIZIZ(intent).albumModel.importInfoList = arrayListLJIIZILJ;
        C0MKJ c0mkj2 = LIZ;
        ForwardMedia forwardMedia = c0mkg.LIZIZ;
        CreativeInfo creativeInfo = c0mkg.LIZ;
        if (C0CHL.LIZ()) {
            videoPublishEditModel2 = videoPublishEditModel;
        }
        c0mkj2.getClass();
        LIZ(intent, context, 0, forwardMedia, creativeInfo, videoPublishEditModel2);
        C0MUK.LIZIZ(intent).importModel.isFastImport = true;
        if (videoPublishEditModel != null) {
            Bundle bundle = new Bundle();
            C1438580nXU.LIZ.getClass();
            C1438580nXU.LIZ(bundle, videoPublishEditModel);
            intent.putExtras(bundle);
            Serializable serializableExtra = intent.getSerializableExtra("on_this_day_day");
            if ((serializableExtra instanceof OnThisDayData) && (onThisDayData = (OnThisDayData) serializableExtra) != null) {
                ArrayList<OnThisDayPostData> arrayList = new ArrayList<>();
                int iLJIILLIIL = LJIILLIIL(c0mkg.LIZIZ);
                ForwardMedia forwardMedia2 = c0mkg.LIZIZ;
                MediaModel mediaModel = forwardMedia2.localMedia;
                if (mediaModel != null) {
                    str = mediaModel.id;
                } else {
                    str = forwardMedia2.sourceId;
                }
                C0ML7 c0ml7 = C0ML7.LIZ;
                String str3 = c0mkg.LJ;
                c0ml7.getClass();
                arrayList.add(new OnThisDayPostData(str, iLJIILLIIL, C1697810uHb.LJ(C0ML7.LJII(iLJIILLIIL, str3))));
                onThisDayData.setPostDataList(arrayList);
            }
        }
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Bundle LJIILL(android.content.Context r40, X.C0MKF r41, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r42) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MKJ.LJIILL(android.content.Context, X.0MKF, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):android.os.Bundle");
    }

    public static void LJJI(C0MKJ c0mkj, C094D c094d, Object obj) {
        c0mkj.getClass();
        if (!c094d.LJ()) {
            C094C.LIZIZ(c094d, obj);
            c094d.LJIIJJI(null);
        }
    }

    public static InterfaceC346201Wa LJIIIIZZ(final Context context, final ForwardMedia forwardMedia, final C0MMK c0mmk, final CreativeInfo creativeInfo) {
        MediaModel mediaModel = forwardMedia.localMedia;
        if (mediaModel != null) {
            return new C095D(new C0MHY(creativeInfo, forwardMedia, c0mmk, context, mediaModel, null));
        }
        final C581170Mqp c581170Mqp = new C581170Mqp(C09IC.LJ(new C566630MKf(forwardMedia, null)), LJI(forwardMedia), creativeInfo, 0);
        return new InterfaceC346201Wa<C0MKG>() { // from class: X.0MKN
            @Override // X.InterfaceC346201Wa
            public final Object collect(InterfaceC346701Wf<? super C0MKG> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = c581170Mqp.collect(new AgS34S0500000_8(interfaceC346701Wf, creativeInfo, forwardMedia, c0mmk, context, 0), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        };
    }

    public static void LJIIJ(Context context, ForwardMedia forwardMedia, C0MMK c0mmk, VideoPublishEditModel videoPublishEditModel) {
        boolean zLIZIZ;
        boolean z;
        AVMusic aVMusicExtractAVMusic;
        LJIJ("downloadResAndJumpToEditPage");
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            LJJIFFI(R.string.m25, context);
            MediaModel mediaModel = forwardMedia.localMedia;
            if (mediaModel != null) {
                C0ML7.LIZ.getClass();
                C0ML7.LJIILIIL("jump_edit_page", "network_error", C1697810uHb.LJ(mediaModel.mimeType));
                return;
            }
            return;
        }
        if (C565720MGs.LIZ(forwardMedia)) {
            MusicBuzModel musicBuzModel = C566580MKa.LIZ(forwardMedia).LIZIZ;
            if (C0MRM.LIZ(musicBuzModel) && !C0MRM.LIZ(videoPublishEditModel.creativeModel.musicBuzModel) && (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel)) != null) {
                MusicBeanUtilKt.updateAVMusic(videoPublishEditModel.creativeModel.musicBuzModel, aVMusicExtractAVMusic);
                String str = musicBuzModel.musicSelectedFrom;
                if (str != null) {
                    videoPublishEditModel.creativeModel.onThisDayData.setMusicSelectedFromV2(str);
                    MusicBuzModel musicBuzModel2 = videoPublishEditModel.creativeModel.musicBuzModel;
                    if (musicBuzModel2.music != null) {
                        musicBuzModel2.musicOrigin = str;
                    }
                }
                videoPublishEditModel.creativeModel.onThisDayData.setDisableAutoSelectMusicInEditing(forwardMedia.disableAutoSelectMusicInEditing);
            }
        }
        if (C301560Bru.LIZ() && Intrinsics.LJFF(videoPublishEditModel.creativeModel.onThisDayData.getDisableAutoSelectMusicInEditing(), Boolean.TRUE)) {
            z = false;
        } else {
            z = true;
        }
        LJJII(context, forwardMedia, c0mmk, null, videoPublishEditModel, z);
    }

    public static Intent LJIILIIL(Context context, C0MKE c0mke, CanvasVideoData canvasVideoData, VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModelLJIIIIZZ;
        OnThisDayData onThisDayData;
        String str;
        Intent intent = new Intent();
        if (videoPublishEditModel == null || (creativeModelLJIIIIZZ = videoPublishEditModel.creativeModel) == null) {
            creativeModelLJIIIIZZ = C0MUK.LJIIIIZZ();
        }
        C0MUK.LJIIIZ(intent, creativeModelLJIIIIZZ);
        C537520L6g.LIZLLL(intent, c0mke.LIZ);
        C0MKJ c0mkj = LIZ;
        String str2 = c0mke.LIZLLL.LIZ;
        ForwardMedia forwardMedia = c0mke.LIZIZ;
        CreativeInfo creativeInfo = c0mke.LIZ;
        Pair<Integer, Integer> pair = c0mke.LJFF;
        c0mkj.getClass();
        CompileConfigResolution compileConfigResolutionLIZIZ = C1440740nay.LIZIZ(str2, false, 6);
        CompileConfigResolution compileConfigResolution = new CompileConfigResolution(compileConfigResolutionLIZIZ.width, compileConfigResolutionLIZIZ.height, null, null, 12, null);
        ArrayList<ImportVideoInfo> arrayListLJIIZILJ = LJIIZILJ(str2);
        VideoFileInfo videoFileInfo = new VideoFileInfo(compileConfigResolution.width, compileConfigResolution.height, forwardMedia.video.getSourceDuration(), 30, 0, 0, 0, 0, 0.0f, 496, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.CONCAT, null, false, 12));
        sbLIZ.append(C1449640npK.LIZ(".mp4"));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C570490MZb.LJI(new C0VSJ(strLIZIZ));
        C538330L9j c538330L9j = new C538330L9j(pair.getFirst().intValue(), pair.getSecond().intValue(), 12);
        ArrayList arrayList = null;
        C0MUK.LIZIZ(intent).editModel.editPreviewInfo = c538330L9j.LIZ(new EditVideoSegment(strLIZIZ, null, videoFileInfo));
        C0MUK.LIZIZ(intent).albumModel.importInfoList = arrayListLJIIZILJ;
        C0MUK.LIZIZ(intent).canvasVideoData = canvasVideoData;
        LIZ(intent, context, 4, c0mke.LIZIZ, c0mke.LIZ, videoPublishEditModel);
        if (videoPublishEditModel != null) {
            Bundle bundle = new Bundle();
            C1438580nXU.LIZ.getClass();
            C1438580nXU.LIZ(bundle, videoPublishEditModel);
            intent.putExtras(bundle);
            Serializable serializableExtra = intent.getSerializableExtra("on_this_day_day");
            if ((serializableExtra instanceof OnThisDayData) && (onThisDayData = (OnThisDayData) serializableExtra) != null) {
                ArrayList<OnThisDayPostData> arrayList2 = new ArrayList<>();
                int iLJIILLIIL = LJIILLIIL(c0mke.LIZIZ);
                ForwardMedia forwardMedia2 = c0mke.LIZIZ;
                MediaModel mediaModel = forwardMedia2.localMedia;
                if (mediaModel != null) {
                    str = mediaModel.id;
                } else {
                    str = forwardMedia2.sourceId;
                }
                List<String> list = canvasVideoData.sourceInfo;
                if (list != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (String str3 : list) {
                        C0ML7.LIZ.getClass();
                        arrayList.add(C0ML7.LJII(iLJIILLIIL, str3));
                    }
                }
                arrayList2.add(new OnThisDayPostData(str, iLJIILLIIL, C09HN.LIZ(arrayList)));
                onThisDayData.setPostDataList(arrayList2);
            }
        }
        return intent;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0MKT] */
    public static C0MKT LJJ(final Context context, final ForwardMedia forwardMedia, final C0MMK c0mmk, final CreativeInfo creativeInfo) {
        final List listLJII = LJII(forwardMedia);
        final b bVarLJ = C09IC.LJ(new C566600MKc(forwardMedia, null));
        return new InterfaceC346201Wa<C0MKF>() { // from class: X.0MKT
            @Override // X.InterfaceC346201Wa
            public final Object collect(InterfaceC346701Wf<? super C0MKF> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = bVarLJ.collect(new C0MKU(interfaceC346701Wf, listLJII, creativeInfo, forwardMedia, c0mmk, context), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.0MHc] */
    public static C565820MHc LJIIIZ(final Context context, final ForwardMedia forwardMedia, final C0MMK c0mmk, final CreativeInfo creativeInfo, CreativeModel creativeModel) {
        Object objLJJ;
        if (forwardMedia.localMedia != null) {
            objLJJ = new C095D(new C0MHZ(creativeInfo, forwardMedia, c0mmk, context, null));
        } else {
            objLJJ = LJJ(context, forwardMedia, c0mmk, creativeInfo);
        }
        final C2501209r8 c2501209r8LJIJJLI = C09IC.LJIJJLI(new C565840MHe(creativeModel, creativeInfo, null), new C581160Mqo(objLJJ, 0));
        return new InterfaceC346201Wa<Pair<? extends C0MKE, ? extends CanvasVideoData>>() { // from class: X.0MHc
            @Override // X.InterfaceC346201Wa
            public final Object collect(InterfaceC346701Wf<? super Pair<? extends C0MKE, ? extends CanvasVideoData>> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = c2501209r8LJIJJLI.collect(new AgS34S0500000_8(interfaceC346701Wf, creativeInfo, forwardMedia, c0mmk, context, 1), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        };
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LIZ(Intent intent, Context context, int i, ForwardMedia forwardMedia, CreativeInfo creativeInfo, VideoPublishEditModel videoPublishEditModel) {
        MediaModel mediaModel;
        String str;
        AVChallenge aVChallenge = new AVChallenge();
        aVChallenge.challengeName = context.getString(2131821884);
        intent.putExtra("challenge", (Serializable) Collections.singletonList(aVChallenge));
        OnThisDayData onThisDayData = C0MUK.LIZIZ(intent).onThisDayData;
        ArrayList<String> arrayList = new ArrayList<>();
        LIZ.getClass();
        if (LJIILLIIL(forwardMedia) == 2 && (mediaModel = forwardMedia.localMedia) != null && (str = mediaModel.mimeType) != null) {
            arrayList.add(str);
        }
        onThisDayData.setLocalMediaMimeType(arrayList);
        intent.putExtra("on_this_day_day", onThisDayData.copy(true, 0, i, forwardMedia.pastMemoryKey, forwardMedia.createTime, onThisDayData.loadedIndexList, onThisDayData.loadedSticker, C566780MKu.LIZ(C0MUK.LIZIZ(intent)) ? 1 : 0, onThisDayData.leftWay, onThisDayData.postCnt, onThisDayData.storyCnt, onThisDayData.textStyle, onThisDayData.postDataList, onThisDayData.celebrationType, onThisDayData.clickNextButtonTime, onThisDayData.needAdjustStickers, onThisDayData.isPublishNormalFromOnThisDayPage, onThisDayData.isPublishStoryFromOnThisDayPage, onThisDayData.localCnt, onThisDayData.localMediaMimeType, onThisDayData.moveMusicToTop, onThisDayData.disableAutoSelectMusicInEditing, onThisDayData.enterMethod, onThisDayData.enterType));
        Workspace workspaceLIZ = C14D2.LIZ(creativeInfo);
        if (videoPublishEditModel != null) {
            workspaceLIZ.MC(videoPublishEditModel.creativeModel.musicBuzModel.path);
            if (C0CHL.LIZ() && videoPublishEditModel.getVeAudioRecorderParam() != null) {
                Parcelable veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam();
                if (!(veAudioRecorderParam instanceof Parcelable)) {
                    veAudioRecorderParam = null;
                }
                intent.putExtra("audio_record_param", veAudioRecorderParam);
                intent.putExtra("voice_volume", videoPublishEditModel.getVoiceVolume());
                intent.putExtra("music_origin", videoPublishEditModel.creativeModel.musicBuzModel.musicOrigin);
            }
        }
        intent.putExtra("workspace", workspaceLIZ);
        intent.putExtra("origin", 0);
        intent.putExtra("shoot_way", "on_this_day");
        intent.putExtra("enter_from", "homepage_friends");
        intent.putExtra("content_type", "share");
        intent.putExtra("content_source", "upload");
        intent.putExtra("extra_start_enter_edit_page", System.currentTimeMillis());
        intent.putExtra("extra_import_compile_cost_time", LIZLLL.LIZ());
        if (C566780MKu.LIZ(C0MUK.LIZIZ(intent))) {
            intent.putExtra("extra_saa_scene_force_disable_translucent", true);
        }
    }

    public static void LJIJJLI(String str, int i, String str2, List list, String str3, String str4) {
        String creationId;
        IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
        CreativeInfo creativeInfo = LJ;
        String str5 = "";
        if (creativeInfo == null || (creationId = creativeInfo.getCreationId()) == null) {
            creationId = "";
        }
        String str6 = "story_archive";
        if (!Intrinsics.LJFF(str2, "story_archive")) {
            if (Intrinsics.LJFF(str2, "click_story_upload_page_entrance")) {
                str6 = "video_upload_page";
            } else {
                str6 = "notification_page";
            }
        }
        if (str != null) {
            str5 = str;
        }
        C1449410nox c1449410nox = new C1449410nox(creationId, "on_this_day", str6, null, null, new C1449430noz(str5, "on_this_day"), null, null, 216);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("last_group_id", C1443560nfW.LIZIZ);
        c0lab.LJ("last_gid_from", C1443560nfW.LIZJ);
        c0lab.LIZ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
        c0lab.LJ("on_this_day_enter_method", str3);
        c0lab.LJ("on_this_day_enter_type", str4);
        C0ML7.LIZ.getClass();
        C0ML7.LJ(c0lab, list);
        C0ML9.LIZJ(c0lab, i, false, str2);
        iRecordMobService.LIZLLL(c1449410nox, c0lab.LIZ);
    }

    public static void LJJII(Context context, ForwardMedia forwardMedia, C0MMK c0mmk, Function0 function0, VideoPublishEditModel videoPublishEditModel, boolean z) {
        AnonymousClass0956 anonymousClass0956 = LIZIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LIZIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C2108108Nr.LIZ), null, null, new C0MHV(videoPublishEditModel, context, forwardMedia, z, c0mmk, function0, null), 3);
    }
}
