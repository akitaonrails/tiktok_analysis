package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.vesdk.VERecordData;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS286S0300000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import lth.o;

/* JADX INFO: renamed from: X.0MVV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MVV {
    public static final C0MVV LIZ = new C0MVV();
    public static String LIZIZ;

    public static String LIZ(VideoPublishEditModel videoPublishEditModel, WeakReference weakReference) {
        Integer numValueOf;
        String str;
        String str2;
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        String strLIZJ;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LJI(null)) {
            return null;
        }
        VERecordData vERecordDataLIZJ = C574800MgY.LIZJ(videoPublishEditModel.getCurMultiEditVideoRecordData());
        Pair<Integer, Integer> playInOutTime = videoPublishEditModel.getCurMultiEditVideoRecordData().getPlayInOutTime();
        vERecordDataLIZJ.setTimeRange(((Number) playInOutTime.first).longValue() * 1000, ((Number) playInOutTime.second).longValue() * 1000);
        int videoCoverStartTm = (int) (videoPublishEditModel.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT);
        if (videoPublishEditModel.isUseTimeReverseEffect()) {
            videoCoverStartTm = (((Number) playInOutTime.second).intValue() - ((Number) playInOutTime.first).intValue()) - videoCoverStartTm;
        }
        View view = (View) weakReference.get();
        if (view == null || (numValueOf = Integer.valueOf(view.getWidth())) == null) {
            return null;
        }
        int iIntValue = (int) (numValueOf.intValue() / ((videoPublishEditModel.videoWidth() * 1.0f) / videoPublishEditModel.videoHeight()));
        o.LJFF(C2216131BoR.LIZ());
        MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData2 != null) {
            str = multiEditVideoRecordData2.coverImagePath;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) && (multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData()) != null) {
            if (C0MBI.LIZ()) {
                C0MH8.LIZ.getClass();
                strLIZJ = C0MH8.LJI(videoPublishEditModel, -2);
            } else {
                strLIZJ = C383300F1c.LIZJ(videoPublishEditModel.getCreativeInfo());
            }
            multiEditVideoRecordData.coverImagePath = strLIZJ;
        }
        C1456230nzx c1456230nzx = new C1456230nzx(videoPublishEditModel);
        c1456230nzx.LIZ.LJIIIIZZ = null;
        MultiEditVideoStatusRecordData multiEditVideoRecordData3 = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData3 != null) {
            str2 = multiEditVideoRecordData3.coverImagePath;
        } else {
            str2 = null;
        }
        c1456230nzx.LIZ.LIZIZ = str2;
        c1456230nzx.LIZ(numValueOf.intValue(), iIntValue);
        C1457050o1H c1457050o1H = c1456230nzx.LIZ;
        c1457050o1H.LJFF = videoCoverStartTm;
        c1457050o1H.LJIJ = true;
        C1457060o1I.LIZIZ(c1457050o1H);
        MultiEditVideoStatusRecordData multiEditVideoRecordData4 = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData4 == null) {
            return null;
        }
        return multiEditVideoRecordData4.coverImagePath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(final X.C11KT r23, java.lang.ref.WeakReference r24) {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MVV.LJ(X.11KT, java.lang.ref.WeakReference):void");
    }

    public static void LIZLLL(final WeakReference weakReference, final float f, RecordScene recordScene, LifecycleOwner lifecycleOwner) {
        AbstractC19484711Kz.LJII(new C581110Mqj(recordScene, weakReference, lifecycleOwner, 1)).LJJIJIIJI(C11S5.LIZ()).LJIL(new InterfaceC1487280oo2() { // from class: X.0MVQ
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) throws Throwable {
                Bitmap bitmap;
                C0MVR c0mvr = (C0MVR) obj;
                if (c0mvr.LIZ == null && (bitmap = c0mvr.LIZIZ) != null && !bitmap.isRecycled()) {
                    File cacheDir = C0CHQ.LIZ.getCacheDir();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(System.currentTimeMillis());
                    sbLIZ.append("_temp.jpg");
                    File fileLJIL = C08QA.LJIL(cacheDir, C2188811AlT.LIZIZ(sbLIZ));
                    C1319770kRr.LJ(70, Bitmap.CompressFormat.JPEG, bitmap, fileLJIL);
                    return C0MVT.LIZIZ(fileLJIL.getPath());
                }
                return c0mvr;
            }
        }).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.0MVP
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LoadCoverHelper@7f4f.load$3");
                C0MVR c0mvr = (C0MVR) obj;
                SmartImageView smartImageView = weakReference.get();
                if (smartImageView == null) {
                    C201955140j.LIZIZ("LoadCoverHelper", "ImageView is null");
                } else {
                    String str = c0mvr.LIZ;
                    if (str == null) {
                        C201955140j.LIZIZ("LoadCoverHelper", "coverPath is null");
                    } else if (!TextUtils.isEmpty(str)) {
                        try {
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Failed to set image URI: ");
                            sbLIZ.append(e.getMessage());
                            C201955140j.LJFF("LoadCoverHelper", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        if (!new C0VSJ(c0mvr.LIZ).exists()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("cover path not exist: ");
                            sbLIZ2.append(c0mvr.LIZ);
                            C201955140j.LIZIZ("LoadCoverHelper", C2188811AlT.LIZIZ(sbLIZ2));
                        } else {
                            smartImageView.setImageURI(Uri.fromFile(new C0VSJ(c0mvr.LIZ)).toString());
                            try {
                                C1331750klB c1331750klB = new C1331750klB();
                                c1331750klB.LJ = C0JAI.LIZ(f, smartImageView.getContext());
                                smartImageView.setCircleOptions(c1331750klB.LIZ());
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("Failed to set circle options: ");
                                sbLIZ3.append(e2.getMessage());
                                C201955140j.LJFF("LoadCoverHelper", C2188811AlT.LIZIZ(sbLIZ3));
                            }
                        }
                    } else {
                        C1331750klB c1331750klB2 = new C1331750klB();
                        c1331750klB2.LJ = C0JAI.LIZ(f, smartImageView.getContext());
                        smartImageView.setCircleOptions(c1331750klB2.LIZ());
                    }
                }
                C1C7U.LIZIZ("LoadCoverHelper@7f4f.load$3");
            }
        }, new C09JN() { // from class: X.0MVO
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LoadCoverHelper@7f4f.load$4");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cover loading failed: ");
                sbLIZ.append(((Throwable) obj).getMessage());
                C201955140j.LJFF("LoadCoverHelper", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("LoadCoverHelper@7f4f.load$4");
            }
        });
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str, WeakReference weakReference, final Function0 function0, final Function2 function2) {
        Pair<Integer, Integer> playInOutTime;
        Integer numValueOf;
        final String str2;
        VERecordData vERecordDataLIZJ = C574800MgY.LIZJ(videoPublishEditModel.getCurMultiEditVideoRecordData());
        MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
        if (curMultiEditVideoRecordData != null && (playInOutTime = curMultiEditVideoRecordData.getPlayInOutTime()) != null) {
            vERecordDataLIZJ.setTimeRange(((Number) playInOutTime.first).longValue() * 1000, ((Number) playInOutTime.second).longValue() * 1000);
            int videoCoverStartTm = (int) (videoPublishEditModel.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT);
            if (videoPublishEditModel.isUseTimeReverseEffect()) {
                videoCoverStartTm = (((Number) playInOutTime.second).intValue() - ((Number) playInOutTime.first).intValue()) - videoCoverStartTm;
            }
            View view = (View) weakReference.get();
            if (view != null && (numValueOf = Integer.valueOf(view.getWidth())) != null) {
                int iIntValue = (int) (numValueOf.intValue() / ((videoPublishEditModel.videoWidth() * 1.0f) / videoPublishEditModel.videoHeight()));
                o.LJFF(C2216131BoR.LIZ());
                if (videoPublishEditModel.isDuet()) {
                    str2 = "Duet";
                } else if (videoPublishEditModel.isMultiVideoEdit()) {
                    str2 = "MultiVideoEdit";
                } else {
                    str2 = "";
                }
                C1456230nzx c1456230nzx = new C1456230nzx(videoPublishEditModel);
                C1457050o1H c1457050o1H = c1456230nzx.LIZ;
                c1457050o1H.LJIIIIZZ = null;
                c1457050o1H.LIZIZ = str;
                c1456230nzx.LIZ(numValueOf.intValue(), iIntValue);
                C1457050o1H c1457050o1H2 = c1456230nzx.LIZ;
                c1457050o1H2.LJFF = videoCoverStartTm;
                c1457050o1H2.LIZJ = new C0MBV() { // from class: X.0MVX
                    @Override // X.C0MBV
                    public final void LIZLLL() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("LoadCoverHelper -> loadCoverDetailFromDraft -> ");
                        sbLIZ.append(str2);
                        sbLIZ.append(" -> get cover success");
                        C201955140j.LIZIZ("CoverAsyncExtractMethodCallExp", C2188811AlT.LIZIZ(sbLIZ));
                        Function0<Unit> function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                    }
                };
                c1457050o1H2.LJIIJ = new InterfaceC1457180o1U() { // from class: X.0MVW
                    @Override // X.InterfaceC1457180o1U
                    public final void onError(int i, String str3) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("LoadCoverHelper -> loadCoverDetailFromDraft -> ");
                        sbLIZ.append(str2);
                        sbLIZ.append(" -> get cover error, code: ");
                        sbLIZ.append(i);
                        sbLIZ.append(", msg: ");
                        sbLIZ.append(str3);
                        C201955140j.LIZIZ("CoverAsyncExtractMethodCallExp", C2188811AlT.LIZIZ(sbLIZ));
                        Function2<Integer, String, Unit> function22 = function2;
                        if (function22 != null) {
                            function22.invoke(Integer.valueOf(i), str3);
                        }
                    }
                };
                C1457060o1I.LIZIZ(c1457050o1H2);
            }
        }
    }

    public static final void LIZJ(VideoPublishEditModel videoPublishEditModel, InterfaceC2329309At<C0MVR> interfaceC2329309At, C259800zU<String> c259800zU, WeakReference<SmartImageView> weakReference, AwemeDraft awemeDraft) throws Throwable {
        boolean z;
        String str;
        ArrayList<ImportVideoInfo> importInfoList;
        ImportVideoInfo importVideoInfo;
        ArrayList<ImportVideoInfo> importInfoList2;
        ImportVideoInfo importVideoInfo2;
        String realImportPath;
        ImportVideoInfo importVideoInfo3;
        String str2;
        String videoCoverPath = videoPublishEditModel.getVideoCoverPath();
        if (videoCoverPath != null && videoCoverPath.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            String videoCoverPath2 = videoPublishEditModel.getVideoCoverPath();
            if (videoCoverPath2 != null) {
                if (new C0VSJ(videoCoverPath2).exists()) {
                    String videoCoverPath3 = videoPublishEditModel.getVideoCoverPath();
                    if (videoCoverPath3 != null) {
                        Bitmap bitmapLIZ = C0MZ9.LIZ(null, videoCoverPath3);
                        if (bitmapLIZ != null && (!bitmapLIZ.isRecycled())) {
                            interfaceC2329309At.onSuccess(C0MVT.LIZ(bitmapLIZ));
                            return;
                        } else {
                            interfaceC2329309At.onSuccess(new C0MVR(null, null));
                            return;
                        }
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData != null) {
            str = multiEditVideoRecordData.coverImagePath;
        } else {
            str = null;
        }
        if (C2286708xd.LIZJ(str)) {
            MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel.getMultiEditVideoRecordData();
            if (multiEditVideoRecordData2 != null) {
                str2 = multiEditVideoRecordData2.coverImagePath;
            } else {
                str2 = null;
            }
            Bitmap bitmapLIZ2 = C0MZ9.LIZ(null, str2);
            if (bitmapLIZ2 != null && (!bitmapLIZ2.isRecycled())) {
                interfaceC2329309At.onSuccess(C0MVT.LIZ(bitmapLIZ2));
                return;
            } else {
                interfaceC2329309At.onSuccess(new C0MVR(null, null));
                return;
            }
        }
        ArrayList<ImportVideoInfo> importInfoList3 = videoPublishEditModel.getImportInfoList();
        if (importInfoList3 != null && !importInfoList3.isEmpty() && (importInfoList = videoPublishEditModel.getImportInfoList()) != null && (importVideoInfo = (ImportVideoInfo) C13LP.LJJJLZIJ(0, importInfoList)) != null && importVideoInfo.getBitRate() == 0 && (importInfoList2 = videoPublishEditModel.getImportInfoList()) != null && (importVideoInfo2 = (ImportVideoInfo) C13LP.LJJJLZIJ(0, importInfoList2)) != null && importVideoInfo2.getOriginFps() == 0) {
            LIZ.getClass();
            if (!C298990Bnl.LIZ() || videoPublishEditModel.getVideoCoverStartTm() <= 0.0f) {
                ArrayList<ImportVideoInfo> importInfoList4 = videoPublishEditModel.getImportInfoList();
                if (importInfoList4 != null && (importVideoInfo3 = (ImportVideoInfo) C13LP.LJJJLZIJ(0, importInfoList4)) != null) {
                    realImportPath = importVideoInfo3.getRealImportPath();
                } else {
                    realImportPath = null;
                }
                Bitmap bitmapLIZLLL = C2471909mP.LIZLLL(realImportPath, null);
                if (bitmapLIZLLL == null || !(!bitmapLIZLLL.isRecycled())) {
                    return;
                }
                interfaceC2329309At.onSuccess(C0MVT.LIZ(C0MZX.LIZIZ(bitmapLIZLLL, videoPublishEditModel.getCoverPublishModel())));
                return;
            }
        }
        C0MVV c0mvv = LIZ;
        String str3 = c259800zU.element;
        AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8((InterfaceC2329309At) interfaceC2329309At, (InterfaceC2329309At<C0MVR>) c259800zU, (C259800zU<String>) 161);
        AwS286S0300000_8 awS286S0300000_8 = new AwS286S0300000_8((C259800zU) c259800zU, (C259800zU<String>) awemeDraft, (AwemeDraft) interfaceC2329309At, (InterfaceC2329309At<C0MVR>) 13);
        c0mvv.getClass();
        LIZIZ(videoPublishEditModel, str3, weakReference, awS409S0200000_8, awS286S0300000_8);
    }
}
