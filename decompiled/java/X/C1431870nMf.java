package X;

import Y.AComparatorS41S0000000_22;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsVQEvaluationService;
import com.ss.android.ugc.aweme.settings.PublishBlockUploadCancelConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.0nMf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431870nMf implements InterfaceC557280LtO {
    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        AVUploadSaveModel saveModel;
        List<String> imageModeLocalPaths;
        boolean zIsSaveLocal = videoPublishEditModel.isSaveLocal();
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            if (!zIsSaveLocal || (saveModel = videoPublishEditModel.getSaveModel()) == null || (imageModeLocalPaths = saveModel.getImageModeLocalPaths()) == null || imageModeLocalPaths.isEmpty()) {
                return false;
            }
            return true;
        }
        String localTempPath = videoPublishEditModel.getLocalTempPath();
        if (localTempPath != null && localTempPath.length() != 0 && new C0VSJ(localTempPath).exists() && new C0VSJ(localTempPath).length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!zIsSaveLocal || !z) {
            return false;
        }
        return true;
    }

    public static final int[] LJFF(VideoPublishEditModel videoPublishEditModel) {
        List<CreateAnchorInfo> list;
        ArrayList arrayList = new ArrayList();
        try {
            PublishExtensionModel publishExtensionModel = (PublishExtensionModel) C08JS.LIZ(videoPublishEditModel.commerceData, PublishExtensionModel.class);
            if (publishExtensionModel != null && (list = publishExtensionModel.createAnchorInfos) != null) {
                for (CreateAnchorInfo createAnchorInfo : list) {
                    if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJLJJLL().contains(Integer.valueOf(createAnchorInfo.getType()))) {
                        arrayList.add(Integer.valueOf(EnumC1430380nKG.ANCHOR_SHOP_LINK.getTYPE()));
                    } else {
                        arrayList.add(Integer.valueOf(createAnchorInfo.getType()));
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Collections.reverse(arrayList);
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS41S0000000_22(13));
        }
        return C13LP.LLII(arrayList);
    }

    public static final List<CreateAnchorInfo> LJI(VideoPublishEditModel videoPublishEditModel) {
        List<CreateAnchorInfo> list;
        try {
            PublishExtensionModel publishExtensionModel = (PublishExtensionModel) C08JS.LIZ(videoPublishEditModel.commerceData, PublishExtensionModel.class);
            if (publishExtensionModel != null) {
                list = publishExtensionModel.createAnchorInfos;
            } else {
                list = null;
            }
            if (list == null) {
                return C13BV.INSTANCE;
            }
            return list;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    public static final String LJII(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        List<CreateAnchorInfo> list;
        String str = videoPublishEditModel.commerceData;
        StringBuilder sb = new StringBuilder();
        try {
            PublishExtensionModel publishExtensionModel = (PublishExtensionModel) C08JS.LIZ(str, PublishExtensionModel.class);
            if (publishExtensionModel != null && (list = publishExtensionModel.createAnchorInfos) != null) {
                for (CreateAnchorInfo createAnchorInfo : list) {
                    int type = createAnchorInfo.getType();
                    if (type == EnumC1430380nKG.ANCHOR_SHOP_WINDOW.getTYPE()) {
                        sb.append("product");
                        sb.append(",");
                    } else {
                        EnumC1430380nKG enumC1430380nKG = EnumC1430380nKG.ANCHOR_SHOWCASE;
                        if (type == enumC1430380nKG.getTYPE()) {
                            sb.append(enumC1430380nKG.getTYPENAME());
                            sb.append(",");
                        } else if (type == EnumC1430380nKG.LEMON8_ANCHOR.getTYPE()) {
                            sb.append("Lemon8");
                            sb.append(",");
                        } else if (C1067090dsJ.LIZ(createAnchorInfo.getType())) {
                            sb.append("Lemon8");
                            sb.append(",");
                        }
                    }
                }
            }
            if (sb.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sb.setLength(sb.length() - 1);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return sb.toString();
    }

    public static final void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        C1402440mbC.LIZ.getClass();
        C1402470mbF.LJ(videoPublishEditModel, false, false, "", null, false);
    }

    public static final int LIZIZ(Context context, VideoPublishEditModel videoPublishEditModel) {
        EnumC1431880nMg enumC1431880nMg;
        C0CHQ.LIZ().LJIIJJI();
        IToolsVQEvaluationService iToolsVQEvaluationService = (IToolsVQEvaluationService) ServiceManager.get().getService(IToolsVQEvaluationService.class);
        if (iToolsVQEvaluationService != null) {
            iToolsVQEvaluationService.LIZIZ();
        }
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            enumC1431880nMg = EnumC1431880nMg.NORMAL_PUBLISH;
        } else {
            SettingsManager.LIZLLL().getClass();
            boolean zLIZ = SettingsManager.LIZ("tool_enable_privacy_preupload_switch", false);
            boolean zLJJJJJ = C0CHQ.LIZ().LJJIIZI().LJJJJJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enablePreUploadByBusiness switchEnable:");
            sbLIZ.append(zLIZ);
            sbLIZ.append(" authkeyEnable:");
            sbLIZ.append(zLJJJJJ);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (zLIZ && zLJJJJJ && C0CHQ.LIZ().getAccountService().isLogin() && !C0CHQ.LIZ().getAccountService().LIZ() && C854850XgB.LIZ(context)) {
                enumC1431880nMg = EnumC1431880nMg.PRE_PUBLISH;
            } else if (C854850XgB.LIZ(context)) {
                enumC1431880nMg = EnumC1431880nMg.PRE_SYNTHETIC;
            } else {
                enumC1431880nMg = EnumC1431880nMg.NORMAL_PUBLISH;
            }
        }
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("publishType: ");
        sbLIZ2.append(enumC1431880nMg);
        c1437510nVlLJJLIIIJ.LIZ("calculatePublishType", C2188811AlT.LIZIZ(sbLIZ2));
        int i = C1431890nMh.LIZ[enumC1431880nMg.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 0;
            }
            if (i != 3) {
                if (i == 4) {
                    return 2;
                }
                throw new C1954807lC();
            }
            return 1;
        }
        return -1;
    }

    public static final void LIZLLL(final long j, final Context context) {
        C15O7.LIZJ(new Callable() { // from class: X.0npB
            /* JADX WARN: Type inference failed for: r1v0, types: [X.0UWd] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1449570npD c1449570npDLIZ;
                C1C7U.LIZ("BusinessServiceImpl@2dc6.collectAndReportApplicationExitInfo$1");
                try {
                    c1449570npDLIZ = new Object(context) { // from class: X.0UWd
                        public final Context LIZ;

                        public final C1449570npD LIZ() {
                            ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(this.LIZ, "activity");
                            if (Build.VERSION.SDK_INT >= 30) {
                                try {
                                    ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) C13LP.LJJJLL(activityManager.getHistoricalProcessExitReasons(this.LIZ.getPackageName(), 0, 1));
                                    if (applicationExitInfo != null) {
                                        String description = applicationExitInfo.getDescription();
                                        if (description == null) {
                                            description = "";
                                        }
                                        return new C1449570npD(applicationExitInfo.getReason(), description, applicationExitInfo.getTimestamp(), applicationExitInfo.getImportance(), applicationExitInfo.getProcessName(), applicationExitInfo.toString());
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                            return null;
                        }

                        {
                            this.LIZ = context;
                        }
                    }.LIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c1449570npDLIZ = null;
                }
                C1449560npC c1449560npC = new C1449560npC();
                long j2 = j;
                if (c1449570npDLIZ == null) {
                    C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZLLL("app_exit", AFwS210S0000000_22.get$arr$(338));
                } else {
                    long j3 = c1449570npDLIZ.LIZJ;
                    long j4 = ((Keva) c1449560npC.LIZ.getValue()).getLong("key_app_kill_timestamp", -1L);
                    boolean z = j3 != j4;
                    C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZLLL("app_exit", new C784530Uq3(z, j3, j4));
                    if (z) {
                        String str = (String) C13LP.LJJJLL(C0CHQ.LIZ().getPublishService().LJIIL().LIZLLL());
                        C0LAB c0lab = new C0LAB();
                        c0lab.LJ("description", c1449570npDLIZ.LIZ);
                        c0lab.LIZ(c1449570npDLIZ.LIZIZ, "reason");
                        c0lab.LIZIZ(c1449570npDLIZ.LIZJ, "timestamp");
                        c0lab.LIZ(c1449570npDLIZ.LIZLLL, "importance");
                        c0lab.LJ("process_name", c1449570npDLIZ.LJ);
                        c0lab.LJ("creation_id", str);
                        c0lab.LJ("from_item_id", "");
                        c0lab.LJ("enter_from", "");
                        c0lab.LJ("string_representation", c1449570npDLIZ.LJFF);
                        c0lab.LIZIZ(j2, "interval_from_exit_app");
                        if (C523670KgH.LIZ()) {
                            c0lab.LJI(C0CHQ.LIZ().getPublishService().LJIIL().LJIIIZ());
                        }
                        C20684815ws.LJIILLIIL("app_kill_reason", c0lab.LIZ);
                        ((Keva) c1449560npC.LIZ.getValue()).storeLong("key_app_kill_timestamp", c1449570npDLIZ.LIZJ);
                        C0CHQ.LIZ().getPublishService().LJIIL().LJIIIIZZ();
                    }
                }
                if (C523670KgH.LIZ()) {
                    C139V c139v = C861730XrH.LIZ;
                    C13W7 c13w7 = new InterfaceC1688840u38() { // from class: X.13W7
                        @Override // X.InterfaceC1688840u38
                        public final void LIZ(C1688830u37 c1688830u37) {
                            if (c1688830u37.LIZIZ == 5) {
                                C0CHQ.LIZ().getPublishService().LJIIL().LJJ(new AwS576S0100000_32(c1688830u37, 508));
                            }
                        }
                    };
                    c139v.LIZIZ();
                    ((ArrayList) c139v.LIZJ).add(c13w7);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BusinessServiceImpl@2dc6.collectAndReportApplicationExitInfo$1");
                return unit;
            }
        });
    }

    public static final void LJ(VideoPublishEditModel videoPublishEditModel, int i) {
        videoPublishEditModel.setSaveModel(C1436280nTm.LIZ(videoPublishEditModel.getCreativeInfo(), videoPublishEditModel.getSaveModel(), i, false, C1431910nMj.LIZ, videoPublishEditModel, false));
    }

    public static final void LJIIIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        PublishBlockUploadCancelConfig publishBlockUploadCancelConfig = (PublishBlockUploadCancelConfig) C1431900nMi.LIZIZ.getValue();
        if (publishBlockUploadCancelConfig.enable && C13LQ.LJIILLIIL(str, publishBlockUploadCancelConfig.causeReasonList)) {
            C1402780mbk.LIZ.getClass();
            C1402780mbk.LIZ(videoPublishEditModel, "", -39993);
        }
    }

    public static final AVUploadSaveModel LJIIJ(CreativeInfo creativeInfo, VideoPublishEditModel videoPublishEditModel) {
        return C1436280nTm.LIZ(creativeInfo, null, 1, false, C1431910nMj.LIZ, videoPublishEditModel, false);
    }

    public static final void LJIIL(C538590LAj c538590LAj, InterfaceC540360LHe interfaceC540360LHe) {
        C0M5N c0m5n = C0M5N.LIZ;
        C540370LHf c540370LHf = new C540370LHf(c538590LAj, interfaceC540360LHe);
        c0m5n.getClass();
        C0M5N.LIZ(c540370LHf);
    }

    public static final AVUploadSaveModel LJIIJJI(VideoPublishEditModel videoPublishEditModel, int i, boolean z, InterfaceC1436300nTo interfaceC1436300nTo, boolean z2) {
        return C1436280nTm.LIZ(videoPublishEditModel.getCreativeInfo(), videoPublishEditModel.getSaveModel(), i, z, interfaceC1436300nTo, videoPublishEditModel, z2);
    }

    @Override // X.InterfaceC557280LtO
    public final void LIZ(Activity activity, VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2, Function1 function1, Bundle bundle, String str) {
        Bundle extras = bundle;
        C1402440mbC c1402440mbC = new C1402440mbC();
        if (extras == null) {
            try {
                extras = activity.getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
        }
        C1402440mbC.LJIILLIIL(c1402440mbC, activity, videoPublishEditModel, z, null, z2, function1, extras, str, 32);
    }
}
