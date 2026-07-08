package X;

import Y.ACallableS39S1300000_22;
import Y.AObjectS399S0100000_25;
import Y.ARunnableS108S0100000_8;
import Y.ARunnableS77S0200000_8;
import Y.ARunnableS9S1100000_3;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.commerce.tools.challenge.ICommerceToolsChallengeService;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.TemplateSchemaData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.internal.IInternalCommerceService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMusicPublishBridgeService;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.performance.OpenCameraStep;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.task.RecordTaskManager;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.zhiliaoapp.musically.R;
import dtj.u7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import jgp.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l5a.a;
import lth.o;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0u2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688680u2s {
    public static C138P LIZ = null;
    public static String LIZIZ = "";
    public static String LIZJ = "";

    public static Bundle LIZIZ(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LJFF(Intent intent) {
        if (!C537520L6g.LIZ(intent).isValid()) {
            C537520L6g.LIZLLL(intent, new CreativeInfo());
        }
    }

    public static boolean LJIILJJIL(Intent intent) {
        if (C19712912At.LIZ.LIZJ() && intent.getBooleanExtra("intercept_background", true)) {
            return true;
        }
        return false;
    }

    public static boolean LJIILL(Intent intent) {
        if (intent == null || !C298200BmU.LIZIZ() || C0CHQ.LIZ().getAccountService().LIZ() || C0LHB.LIZ(intent)) {
            return false;
        }
        return true;
    }

    public static boolean LJIJ(Intent intent) {
        boolean z;
        boolean z2;
        boolean zDownloadEffectOrMusicAfterEnterCamera = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
        String strLIZJ = LIZJ(intent, "shoot_way");
        String strLIZJ2 = LIZJ(intent, "mission_data");
        if (TextUtils.equals(strLIZJ, "mission") && !TextUtils.isEmpty(strLIZJ2)) {
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.equals(strLIZJ, "tcm_upload") && !TextUtils.isEmpty(strLIZJ2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("record_preset_resource");
        if ((zDownloadEffectOrMusicAfterEnterCamera || intent.getBooleanExtra("need_load_later", false)) && parcelableExtra != null && !z && !z2) {
            return true;
        }
        return false;
    }

    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhidbMhcI8P8732KS/8NvltAOT", null));
    }

    public static String LIZJ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static ShortVideoContext LIZLLL(C573840Mf0 c573840Mf0, List<String> list) {
        CreativeFlowData creativeFlowData;
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        CreativeInfo creativeInfo = new CreativeInfo();
        shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(creativeInfo);
        shortVideoContext.creativeInfo = creativeInfo;
        shortVideoContext.LJ().setCreationId(creativeInfo.getCreationId());
        shortVideoContext.shootWay = c573840Mf0.LIZIZ;
        shortVideoContext.enterFrom = c573840Mf0.LIZLLL;
        shortVideoContext.enterMethod = c573840Mf0.LJ;
        TemplateSchemaData templateSchemaData = shortVideoContext.creativeModel.templateSchemaData;
        String str = c573840Mf0.LIZJ;
        templateSchemaData.schemaTag = str;
        if (Objects.equals(str, "template_schema") && list != null && !list.isEmpty()) {
            shortVideoContext.creativeModel.pugcTemplateData.hashtags = list;
        }
        if (c573840Mf0.LJI) {
            shortVideoContext.creativeModel.postLandingModel.landingBack = Objects.equals(c573840Mf0.LJII, "1");
            shortVideoContext.creativeModel.postLandingModel.backUrl = c573840Mf0.LJIIIIZZ;
        }
        ShootExtraData shootExtraData = c573840Mf0.LJIIIZ;
        if (shootExtraData != null && (creativeFlowData = shortVideoContext.creativeFlowData) != null) {
            creativeFlowData.setShootExtraData(shootExtraData);
        }
        return shortVideoContext;
    }

    public static boolean LJIIJJI(Context context, Intent intent) {
        if (intent != null && LIZIZ(intent) != null) {
            C0MWH c0mwh = C0MWH.LIZ;
            Bundle bundleLIZIZ = LIZIZ(intent);
            c0mwh.getClass();
            return C0MWH.LJIJI(context, bundleLIZIZ);
        }
        return false;
    }

    public static void LJIIL(boolean z, int i) {
        C0MVY c0mvy;
        C194353111z c194353111z = C194353111z.LIZ;
        if (z) {
            c0mvy = C0MVY.SHOW;
        } else {
            c0mvy = C0MVY.DISMISS;
        }
        c194353111z.LIZIZ(i, c0mvy, C0LD3.DUAL_BALL, C0LEP.CLOSE_GONE);
    }

    public static void LJIILIIL(ShortVideoContext shortVideoContext, C573840Mf0 c573840Mf0) {
        Map<String, String> map;
        HashMap map2 = new HashMap();
        ShootExtraData shootExtraData = c573840Mf0.LJIIIZ;
        if (shootExtraData != null && (map = shootExtraData.getMobParams().get("shoot")) != null) {
            map2 = new HashMap(map);
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("template_dispatch_type", "schema_event");
        c0lab.LJ("tt_template_id", c573840Mf0.LIZ);
        c0lab.LJ("tt_template_type", C1412660mrg.LIZIZ(EnumC1412640mre.PUGC_TEMPLATE));
        c0lab.LJ("last_group_id", c573840Mf0.LJFF);
        c0lab.LIZ(0, "dual_camera_support");
        c0lab.LJI(map2);
        String str = shortVideoContext.shootWay;
        if (str == null) {
            str = "";
        }
        String str2 = shortVideoContext.enterFrom;
        if (str2 == null) {
            str2 = "";
        }
        C1449400now c1449400now = C1449400now.LIZ;
        String creationId = shortVideoContext.getCreationId();
        String str3 = c573840Mf0.LJFF;
        c1449400now.LIZIZ(new C1449410nox(creationId, str, str2, str3, str3, null), c0lab, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x02dd, code lost:
    
        if (r10 != null) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02cd A[Catch: all -> 0x02e8, TryCatch #2 {all -> 0x02e8, blocks: (B:65:0x0260, B:67:0x0272, B:68:0x027e, B:70:0x0284, B:72:0x0298, B:73:0x029e, B:76:0x02cd, B:81:0x02df, B:82:0x02e3, B:74:0x02c4), top: B:253:0x0260 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0307  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILLIIL(final android.app.Activity r32, final android.content.Intent r33) {
        /*
            Method dump skipped, instruction units count: 1929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688680u2s.LJIILLIIL(android.app.Activity, android.content.Intent):void");
    }

    public static void LJIIZILJ(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            intent.setClass(context, FTCVideoRecordNewActivity.class);
            return;
        }
        if (C0LHB.LIZ(intent)) {
            intent.setClass(context, TTEPEffectPreviewActivity.class);
            return;
        }
        intent.setClass(context, SAAActivity.class);
        if (intent.hasExtra("exterior_record_model")) {
            intent.putExtra("creative_saa_page", "ExteriorVideoRecordScene");
        }
        if (intent.hasExtra("social_record_model")) {
            intent.putExtra("creative_saa_page", "SocialVideoRecordScene");
        } else {
            intent.putExtra("creative_saa_page", "VideoRecordNewScene");
        }
    }

    public static boolean LJIJI(final Context context, final Intent intent) {
        if (!o.LJI() || !intent.getBooleanExtra("extra_clear_dialog_show_needed", true)) {
            return false;
        }
        C21566919al c21566919al = new C21566919al(new C1361400lX0(context, R.style.xm));
        c21566919al.LJFF(2131847278);
        c21566919al.LIZ(2131847277);
        c21566919al.LJII(R.string.f1_, null, false);
        c21566919al.LJIIJ(R.string.fte, new DialogInterface.OnClickListener() { // from class: X.0u2y
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C1688680u2s.LIZ(context, intent);
            }
        }, false);
        new C21566519ah(c21566919al).LIZLLL();
        return true;
    }

    public static void LJIJJ(Activity activity, Intent intent) {
        ARunnableS77S0200000_8 aRunnableS77S0200000_8 = new ARunnableS77S0200000_8(activity, intent, 18);
        String strLIZJ = LIZJ(intent, "shoot_way");
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        C535670Kzd.LIZ().LIZLLL(activity, strLIZJ, new AObjectS399S0100000_25(aRunnableS77S0200000_8, 12));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJJLI(final android.app.Activity r14, final android.content.Intent r15) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688680u2s.LJIJJLI(android.app.Activity, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIL(final android.app.Activity r29, android.content.Intent r30) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688680u2s.LJIL(android.app.Activity, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0347  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJ(android.app.Activity r10, com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAlbumConfig r11) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688680u2s.LJJ(android.app.Activity, com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAlbumConfig):void");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void LJI(final Activity activity, final Intent intent, Function1<List<Bundle>, Unit> function1) {
        String[] stringArrayExtra;
        boolean z;
        boolean z2;
        C15O7 c15o7;
        AVChallenge aVChallenge;
        String strLJFF;
        boolean z3;
        C15O7 c15o72;
        C15O7 c15o73;
        LIZ = C138P.LIZ();
        C524780Ki4.LIZ.step("av_video_record_init", "fetchData");
        String strOptString = null;
        a.LIZIZ.LIZIZ(C537520L6g.LIZ(intent).getCreationId(), new C1429980nJc(EnumC1429920nJW.BEFORE_ENTER_RECORD, intent, null), null);
        String strLIZJ = LIZJ(intent, "first_face_sticker");
        String strLIZJ2 = LIZJ(intent, "session");
        String strLIZJ3 = LIZJ(intent, "music_reuse_sticker_id");
        String strLIZJ4 = LIZJ(intent, "challenge_id");
        if (C1837707Hr.LIZ()) {
            stringArrayExtra = intent.getStringArrayExtra("csi_challenge_ids");
        } else {
            stringArrayExtra = null;
        }
        String strLIZJ5 = LIZJ(intent, "extra_live_source_params");
        if (!TextUtils.isEmpty(strLIZJ5)) {
            try {
                strOptString = new JSONObject(strLIZJ5).optString("challenge_id");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = strLIZJ4;
        }
        String strLIZJ6 = LIZJ(intent, "music_id");
        final String strLIZJ7 = LIZJ(intent, "extra_bind_mv_id");
        String strLIZJ8 = LIZJ(intent, "direct_use_sticker_music");
        final String strLIZJ9 = LIZJ(intent, "shoot_way");
        final String strLIZJ10 = LIZJ(intent, "reuse_giphy_gifs");
        String strLIZJ11 = LIZJ(intent, "host_uid");
        String strLIZJ12 = LIZJ(intent, "mission_data");
        if (!TextUtils.isEmpty(strLIZJ12) && (TextUtils.equals(strLIZJ9, "mission") || TextUtils.equals(strLIZJ9, "tcm_upload"))) {
            try {
                C1227904rF.LIZ.getClass();
                Mission mission = (Mission) C1227904rF.LIZIZ(strLIZJ12, Mission.class);
                if (mission != null) {
                    if (!TextUtils.isEmpty(mission.getStickerId())) {
                        strLIZJ = mission.getStickerId();
                    }
                    if (!TextUtils.isEmpty(mission.getMusicId())) {
                        strLIZJ6 = mission.getMusicId();
                    }
                }
            } catch (s e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        final ICommerceToolsMissionService iCommerceToolsMissionService = (ICommerceToolsMissionService) ServiceManager.get().getService(ICommerceToolsMissionService.class);
        ArrayList arrayList = new ArrayList();
        InterfaceC2385309Wh<Bundle, C15O7<Bundle>> interfaceC2385309Wh = new InterfaceC2385309Wh<Bundle, C15O7<Bundle>>() { // from class: X.0t2U
            @Override // X.InterfaceC2385309Wh
            public final C15O7<Bundle> then(C15O7<Bundle> c15o74) {
                C15O7<Bundle> c15o7LJIIJ;
                int statusCode;
                C1C7U.LIZ("AVToolsHelper@51fc.fetchData$1");
                if (!c15o74.LJIILIIL() && !c15o74.LJIILL()) {
                    c15o7LJIIJ = C15O7.LJIIJ(c15o74.LJIIL());
                } else {
                    if (c15o74.LJIILL() && c15o74.LJIIJJI() != null) {
                        if (c15o74.LJIIJJI() instanceof C202035143l) {
                            int errorCode = ((C202035143l) c15o74.LJIIJJI()).getErrorCode();
                            String message = c15o74.LJIIJJI().getMessage();
                            if (errorCode == 5) {
                                message = activity.getString(2131835566);
                                if (strLIZJ9.equals("share_sound")) {
                                    intent.putExtra("MUSIC_ID_INVALID", true);
                                }
                                iCommerceToolsMissionService.LIZLLL(intent);
                            }
                            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS9S1100000_3((Object) activity, message, 6));
                        } else {
                            Exception excLJIIJJI = c15o74.LJIIJJI();
                            int statusCode2 = -1;
                            if (excLJIIJJI instanceof C1650010t2V) {
                                statusCode = ((C1650010t2V) excLJIIJJI).getStatusCode();
                            } else if (excLJIIJJI instanceof StatusCodeException) {
                                statusCode = ((StatusCodeException) excLJIIJJI).getStatusCode();
                            } else {
                                statusCode = -1;
                            }
                            if (statusCode != -1) {
                                Exception excLJIIJJI2 = c15o74.LJIIJJI();
                                if (excLJIIJJI2 instanceof C1650010t2V) {
                                    statusCode2 = ((C1650010t2V) excLJIIJJI2).getStatusCode();
                                } else if (excLJIIJJI2 instanceof StatusCodeException) {
                                    statusCode2 = ((StatusCodeException) excLJIIJJI2).getStatusCode();
                                }
                                String message2 = c15o74.LJIIJJI().getMessage();
                                switch (statusCode2) {
                                    case 2002:
                                    case 2004:
                                        message2 = activity.getString(2131833754);
                                        iCommerceToolsMissionService.LJ(intent);
                                        break;
                                    case 2003:
                                        message2 = activity.getString(2131830633);
                                        iCommerceToolsMissionService.LJ(intent);
                                        break;
                                    case 2006:
                                        message2 = activity.getString(2131857911);
                                        iCommerceToolsMissionService.LJ(intent);
                                        break;
                                }
                                Activity activity2 = activity;
                                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                                creativeToastBuilder.message(message2);
                                creativeToastBuilder.isTuxToastLegacy(true);
                                C1390380mHk.LIZ(activity2, 3077, creativeToastBuilder);
                            } else {
                                Activity activity3 = activity;
                                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                                creativeToastBuilder2.message(c15o74.LJIIJJI().getMessage());
                                creativeToastBuilder2.isTuxToastLegacy(true);
                                C1390380mHk.LIZ(activity3, 3077, creativeToastBuilder2);
                            }
                        }
                    }
                    c15o7LJIIJ = C15O7.LJIIJ(new Bundle());
                }
                C1C7U.LIZIZ("AVToolsHelper@51fc.fetchData$1");
                return c15o7LJIIJ;
            }
        };
        if (!TextUtils.isEmpty(strLIZJ)) {
            if (LJIJ(intent)) {
                v7.o oVar = new v7.o();
                ArrayList<String> arrayListLIZIZ = C1624570sNT.LIZIZ(strLIZJ);
                if (C0IKQ.LIZ(arrayListLIZIZ)) {
                    oVar.LJ(new Bundle());
                    c15o73 = oVar.LIZ;
                } else {
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJIL(bundle, "reuse_sticker_ids", arrayListLIZIZ);
                    C786410Ut5.LJJJI("event_shoot_event_track", "cold_start", bundle);
                    C01TT.LIZLLL(new C580450Mpf(activity, bundle, oVar, (String) ListProtector.get(arrayListLIZIZ, 0)));
                    c15o73 = oVar.LIZ;
                }
                arrayList.add(c15o73.LJI(interfaceC2385309Wh));
            } else {
                if (strLIZJ2 == null && !intent.getBooleanExtra("show_preloading_dialog", false)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                int intExtra = intent.getIntExtra("msg_preloading_dialog", 2131848034);
                if (intExtra == 0) {
                    intExtra = 2131848034;
                }
                boolean booleanExtra = intent.getBooleanExtra("enter_form_flip_shoot_icon", false);
                v7.o oVar2 = new v7.o();
                ArrayList<String> arrayListLIZIZ2 = C1624570sNT.LIZIZ(strLIZJ);
                if (C0IKQ.LIZ(arrayListLIZIZ2)) {
                    oVar2.LJ(new Bundle());
                    c15o72 = oVar2.LIZ;
                } else {
                    Bundle bundle2 = new Bundle();
                    C786410Ut5.LJJJIL(bundle2, "reuse_sticker_ids", arrayListLIZIZ2);
                    C786410Ut5.LJJJI("event_shoot_event_track", "cold_start", bundle2);
                    C01TT.LIZLLL(new C1655450tBH(intExtra, activity, bundle2, oVar2, (String) ListProtector.get(arrayListLIZIZ2, 0), z3, booleanExtra));
                    c15o72 = oVar2.LIZ;
                }
                C15O7 c15o7LJI = c15o72.LJI(interfaceC2385309Wh);
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_flip_shoot_icon_effect_opti", true, false) && booleanExtra) {
                    c15o7LJI.LJI(new C1466870oH7(intent, 2));
                }
                arrayList.add(c15o7LJI);
            }
        }
        if (strLIZJ11 != null && !strLIZJ11.isEmpty()) {
            Bundle bundle3 = new Bundle();
            try {
                strLJFF = o.LJIIZILJ.LJI(strLIZJ11, null, EnumC1254700iku.STICKER_SHOOT).LJFF();
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                strLJFF = "";
            }
            v7.o oVar3 = new v7.o();
            if (!strLJFF.isEmpty()) {
                C786410Ut5.LJJJI("host_name", strLJFF, bundle3);
            }
            oVar3.LJ(bundle3);
            arrayList.add(oVar3.LIZ);
        }
        Serializable serializableExtra = intent.getSerializableExtra("extra_open_record_challenge");
        ArrayList arrayList2 = new ArrayList();
        if (serializableExtra != null) {
            arrayList2.add(serializableExtra);
        }
        arrayList2.addAll(C1443030nef.LJII().LIZ);
        if (!C086I.LIZIZ(arrayList2) && (aVChallenge = (AVChallenge) ListProtector.get(arrayList2, 0)) != null) {
            if (!TextUtils.isEmpty(aVChallenge.musicId)) {
                strLIZJ6 = aVChallenge.musicId;
            }
            if (!TextUtils.isEmpty(aVChallenge.mvId)) {
                strLIZJ7 = aVChallenge.mvId;
            }
        }
        if (!TextUtils.isEmpty(strLIZJ3)) {
            v7.o oVar4 = new v7.o();
            ArrayList<String> arrayListLIZIZ3 = C1624570sNT.LIZIZ(strLIZJ3);
            Bundle bundle4 = new Bundle();
            if (!C0IKQ.LIZ(arrayListLIZIZ3)) {
                C786410Ut5.LJJJIL(bundle4, "reuse_sticker_ids", arrayListLIZIZ3);
                C786410Ut5.LJJJI("event_shoot_event_track", "", bundle4);
                Effect effect = (Effect) intent.getParcelableExtra("music_with_sticker_effect");
                if (effect != null) {
                    C786410Ut5.LJJIJL(bundle4, "first_sticker", effect);
                    if (effect.getMusic() != null && !effect.getMusic().isEmpty()) {
                        String strLIZ = C1629700sVk.LIZ((String) ListProtector.get(effect.getMusic(), 0));
                        if (!TextUtils.isEmpty(strLIZ)) {
                            C786410Ut5.LJJJI("path", strLIZ, bundle4);
                        }
                    }
                }
            }
            oVar4.LJ(bundle4);
            arrayList.add(oVar4.LIZ.LJI((InterfaceC2385309Wh<TResult, C15O7<TContinuationResult>>) interfaceC2385309Wh));
        }
        if (!TextUtils.isEmpty(strLIZJ7)) {
            final v7.o oVar5 = new v7.o();
            if (TextUtils.isEmpty(strLIZJ7)) {
                oVar5.LJ(new Bundle());
                c15o7 = oVar5.LIZ;
            } else {
                EffectService.getInstance().createMvEffectPlatform(activity).LIZIZ(strLIZJ7, null, new IFetchEffectListener() { // from class: X.0nmw
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onStart(Effect effect2) {
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(Effect effect2) {
                        Bundle bundle5 = new Bundle();
                        bundle5.putBoolean("reuse_mvtheme_enter", true);
                        C786410Ut5.LJJJI("extra_bind_mv_id", strLIZJ7, bundle5);
                        C786410Ut5.LJJIJL(bundle5, "extra_mv_effect", effect2);
                        oVar5.LJ(bundle5);
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                        Exception exception = exceptionResult.getException();
                        if (exception == null) {
                            exception = new Exception("downloadBindMovieEffect Failed");
                        }
                        oVar5.LIZLLL(exception);
                    }
                });
                c15o7 = oVar5.LIZ;
            }
            arrayList.add(c15o7.LJI(interfaceC2385309Wh));
        }
        if (!TextUtils.isEmpty(strOptString) || (C1837707Hr.LIZ() && stringArrayExtra != null && stringArrayExtra.length > 0)) {
            v7.o oVar6 = new v7.o();
            C15O7.LIZJ(new ACallableS39S1300000_22(intent, strOptString, activity, oVar6, 0));
            arrayList.add(oVar6.LIZ.LJI((InterfaceC2385309Wh<TResult, C15O7<TContinuationResult>>) interfaceC2385309Wh));
        }
        if ((!intent.getBooleanExtra("music_download_complete", false) || !((Boolean) C258820ACi.LIZ.getValue()).booleanValue()) && !TextUtils.isEmpty(strLIZJ6) && !LJIJ(intent)) {
            boolean z4 = !TextUtils.equals(strLIZJ9, "challenge");
            String strLIZJ13 = LIZJ(intent, "shoot_way");
            if ((((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJJI() && Objects.equals(strLIZJ13, "direct_shoot")) || (((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIJLIJ() && !Objects.equals(strLIZJ13, "direct_shoot"))) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(LJ(activity, strLIZJ6, z4, z).LJI(interfaceC2385309Wh));
        }
        if (!TextUtils.isEmpty(strLIZJ8)) {
            if (!TextUtils.isEmpty(LIZJ(intent, "sticker_with_music_file_path"))) {
                Music music = (Music) intent.getSerializableExtra("sticker_music");
                String strLIZJ14 = LIZJ(intent, "sticker_with_music_file_path");
                v7.o oVar7 = new v7.o();
                Bundle bundle5 = new Bundle();
                IInternalCommerceService iInternalCommerceServiceLJIIJ = AVCommerceServiceImpl.LJIIJ();
                if (iInternalCommerceServiceLJIIJ.LJ() && iInternalCommerceServiceLJIIJ.LJII(music)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (music != null && z2) {
                    AVMusic aVMusicTransformMusicModel = o.LJI.transformMusicModel(music.convertToMusicModel());
                    ((Keva) C1629700sVk.LIZ.getValue()).storeString(strLIZJ8, strLIZJ14);
                    if (aVMusicTransformMusicModel != null) {
                        aVMusicTransformMusicModel.setMusicPriority(2);
                        aVMusicTransformMusicModel.path = strLIZJ14;
                    }
                    C1452640nuA.LJI(aVMusicTransformMusicModel);
                    C786410Ut5.LJJIZ(bundle5, "aweme_music", aVMusicTransformMusicModel);
                    C786410Ut5.LJJJI("path", strLIZJ14, bundle5);
                }
                oVar7.LJ(bundle5);
                arrayList.add(oVar7.LIZ.LJI((InterfaceC2385309Wh<TResult, C15O7<TContinuationResult>>) interfaceC2385309Wh));
            } else if (!intent.getBooleanExtra("do_not_load_music", false) && !LJIJ(intent)) {
                arrayList.add(LJ(activity, strLIZJ8, false, false).LJI(interfaceC2385309Wh));
            }
        }
        if (!TextUtils.isEmpty(strLIZJ10)) {
            final ArrayList arrayList3 = new ArrayList();
            final v7.o oVar8 = new v7.o();
            final ProgressDialogC1397800mTi progressDialogC1397800mTiLIZJ = ProgressDialogC1397800mTi.LIZJ(activity, activity.getResources().getString(R.string.txr));
            progressDialogC1397800mTiLIZJ.setIndeterminate(true);
            LJIIL(true, 1501);
            C15O7.LIZJ(new Callable() { // from class: X.0sf4
                public final /* synthetic */ boolean LLILZ = false;

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context = activity;
                    String str = strLIZJ10;
                    ProgressDialogC1397800mTi progressDialogC1397800mTi = progressDialogC1397800mTiLIZJ;
                    boolean z5 = this.LLILZ;
                    v7.o oVar9 = oVar8;
                    ArrayList arrayList4 = arrayList3;
                    C1C7U.LIZ("AVToolsHelper@51fc.downloadGifFilesByIds$1L");
                    C1633850scR.LIZ(context, null).xg(str, new C1638600sk6(progressDialogC1397800mTi, z5, oVar9, arrayList4));
                    C1C7U.LIZIZ("AVToolsHelper@51fc.downloadGifFilesByIds$1L");
                    return null;
                }
            });
            arrayList.add(oVar8.LIZ.LJI((InterfaceC2385309Wh<TResult, C15O7<TContinuationResult>>) interfaceC2385309Wh));
        }
        if (C086I.LIZIZ(arrayList)) {
            function1.invoke(null);
        } else {
            C15O7.LJJI(arrayList).LJ(new C346480DiA(function1, 6), C15O7.LJIIIIZZ, null);
        }
    }

    public static void LJII(ProgressDialogC1399790mWv progressDialogC1399790mWv, ExceptionResult exceptionResult, v7.o<Bundle> oVar) {
        if (progressDialogC1399790mWv != null) {
            C0FNU.LIZ(progressDialogC1399790mWv);
            LJIIL(false, 1502);
        }
        if (exceptionResult != null && exceptionResult.getException() != null) {
            exceptionResult.getException();
            oVar.LIZLLL(exceptionResult.getException());
        } else {
            oVar.LIZLLL(new C1473280oRS("unknown exception"));
        }
    }

    public static void LJIIIZ(Activity activity, Intent intent, List<Bundle> list) {
        CreativeInfo creativeInfo;
        Effect effect;
        ArrayList<String> stringArrayList;
        boolean z;
        if (intent.getBooleanExtra("MUSIC_ID_INVALID", false)) {
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                z = true;
            } else {
                z = false;
            }
            C539630LEj c539630LEj = C539630LEj.LIZ;
            String str = LIZJ;
            String str2 = LIZIZ;
            c539630LEj.getClass();
            C539630LEj.LJII(6, str, str2, z, intent, null);
            return;
        }
        long jLIZIZ = LIZ.LIZIZ(TimeUnit.MILLISECONDS);
        C524780Ki4.LIZ.step("av_video_record_init", "goRecordActivity");
        Intent intent2 = new Intent();
        if (!LJIJ(intent) && intent.hasExtra("record_preset_resource")) {
            intent.removeExtra("record_preset_resource");
        }
        boolean booleanExtra = intent.getBooleanExtra("show_no_splash_ad", false);
        boolean booleanExtra2 = intent.getBooleanExtra("sticker_pannel_show", false);
        boolean booleanExtra3 = intent.getBooleanExtra("enter_record_from_other_platform", false);
        String strLIZJ = LIZJ(intent, "shoot_way");
        CreativeInfo creativeInfoLIZ = C537520L6g.LIZ(intent);
        String strLIZJ2 = LIZJ(intent, "enter_from");
        String strLIZJ3 = LIZJ(intent, "enter_dm");
        int intExtra = intent.getIntExtra("draft_to_edit_from", 0);
        int intExtra2 = intent.getIntExtra("extra_video_length", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C857540XkW.LIZ(jCurrentTimeMillis - intent.getLongExtra("extra_start_record_time", 0L), strLIZJ, creativeInfoLIZ.getCreationId(), "finish_access_data", strLIZJ2);
        intent.putExtra("finish_access_data", jCurrentTimeMillis);
        C365090ETb.LIZIZ();
        if (booleanExtra3) {
            C1452640nuA.LJI(null);
            C1443030nef.LJII().LJIIIZ();
        }
        if (booleanExtra) {
            o.LIZJ.getClass();
            C1035180d2q.LIZIZ = true;
        }
        ((ICommerceToolsChallengeService) ServiceManager.get().getService(ICommerceToolsChallengeService.class)).LIZIZ(intent, intent2);
        ((ICommerceToolsMissionService) ServiceManager.get().getService(ICommerceToolsMissionService.class)).LJIIJ(intent, intent2, strLIZJ, creativeInfoLIZ.getCreationId());
        intent2.putExtra("sticker_pannel_show", booleanExtra2);
        intent2.putExtra("enter_record_from_other_platform", booleanExtra3);
        intent2.putExtra("draft_to_edit_from", intExtra);
        intent2.putExtra("star_atlas_object", LIZJ(intent, "star_atlas_object"));
        intent2.putExtra("extra_video_length", intExtra2);
        if (!TextUtils.isEmpty(strLIZJ2)) {
            intent2.putExtra("enter_from", strLIZJ2);
        }
        if (!TextUtils.isEmpty(strLIZJ3)) {
            intent2.putExtra("enter_dm", strLIZJ3);
        }
        RecordPresetResource recordPresetResource = (RecordPresetResource) intent.getParcelableExtra("record_preset_resource");
        if (list != null) {
            for (Bundle bundle : list) {
                intent2.putExtras(bundle);
                if (recordPresetResource != null) {
                    MusicModel musicModel = (MusicModel) intent.getSerializableExtra("music_model");
                    if (bundle != null) {
                        if (bundle.containsKey("reuse_sticker_ids") && (stringArrayList = bundle.getStringArrayList("reuse_sticker_ids")) != null && !stringArrayList.isEmpty()) {
                            recordPresetResource.setEffectId((String) ListProtector.get(stringArrayList, 0));
                        }
                        if (bundle.containsKey("first_sticker") && (effect = (Effect) bundle.getParcelable("first_sticker")) != null) {
                            recordPresetResource.setEffect(effect);
                        }
                        if (musicModel != null) {
                            recordPresetResource.setMusicId(musicModel.getMusicId());
                            recordPresetResource.setMusicModel(musicModel);
                        }
                    }
                }
            }
        }
        if (recordPresetResource != null) {
            intent2.putExtra("record_preset_resource", (Parcelable) recordPresetResource);
        }
        Bundle bundleLIZIZ = LIZIZ(intent);
        if (bundleLIZIZ != null) {
            intent2.putExtras(bundleLIZIZ);
        }
        if (!TextUtils.isEmpty(LIZJ(intent, "micro_app_class"))) {
            intent2.putExtra("micro_app_class", LIZJ(intent, "micro_app_class"));
        }
        if (TextUtils.isEmpty(strLIZJ)) {
            intent2.putExtra("shoot_way", "no_shoot_way");
        }
        if (!creativeInfoLIZ.isValid()) {
            creativeInfo = new CreativeInfo(C0DMI.LIZ(), creativeInfoLIZ.getVersion());
            C537520L6g.LIZLLL(intent2, creativeInfo);
        } else {
            creativeInfo = creativeInfoLIZ;
        }
        if (u7.LJ() || u7.LIZIZ()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", LIZJ(intent2, "enter_from"));
            c2344009Gk.LJIIIIZZ("type", "click_shoot_same_2_open_record");
            c2344009Gk.LIZLLL(System.currentTimeMillis() - intent2.getLongExtra("extra_start_record_time", 0L), "totaltime");
            C20684815ws.LJIILLIIL("tool_performance_operation_cost_time", c2344009Gk.LIZ);
        }
        if (intent2.getLongExtra("extra_start_record_time", 0L) == 0) {
            intent2.putExtra("extra_start_record_time", System.currentTimeMillis());
        }
        C2342609Fw.LIZ = new C2342509Fv(strLIZJ, creativeInfo.getCreationId());
        String creationId = creativeInfo.getCreationId();
        if (creationId != null) {
            C1404650mel c1404650mel = new C1404650mel(creationId, EnumC2007207te.DirectRecord);
            C1404800mf0.LIZ = c1404650mel;
            c1404650mel.LIZJ = C1404800mf0.LIZ();
        }
        if (!LJIIJJI(activity, intent2)) {
            if (C522620Kea.LIZ()) {
                RecordTaskManager.LIZ(new C536780L3k(), true);
            } else {
                RecordTaskManager.LIZ(new C536780L3k(), false);
            }
            if (C298010BmB.LIZ() && !C1647240sy2.LIZ().memoryTaskOpt) {
                RecordTaskManager.LIZ(new x(), true);
            }
        }
        intent2.putExtra("extra_start_record_download_res_time", jLIZIZ);
        if (intent.hasExtra("green_screen_kit_config")) {
            intent2.putExtra("green_screen_kit_config", intent.getSerializableExtra("green_screen_kit_config"));
            if (intent.hasExtra("green_screen_kit_preset_source")) {
                intent2.putExtra("record_preset_resource", intent.getParcelableExtra("green_screen_kit_preset_source"));
            }
        }
        if (intent.hasExtra("share_kit_panel")) {
            intent2.putExtra("share_kit_panel", intent.getSerializableExtra("share_kit_panel"));
        }
        if (intent.hasExtra("share_model")) {
            intent2.putExtra("share_model", intent.getSerializableExtra("share_model"));
        }
        if (intent.hasExtra("enter_record_from_feed")) {
            intent2.putExtra("enter_record_from_feed", intent.getBooleanExtra("enter_record_from_feed", false));
        }
        if (intent.hasExtra("upload_page_entrance_type")) {
            intent2.putExtra("upload_page_entrance_type", LIZJ(intent, "upload_page_entrance_type"));
        }
        if (intent.hasExtra("is_upload_direct_enter")) {
            intent2.putExtra("is_upload_direct_enter", intent.getBooleanExtra("is_upload_direct_enter", false));
        }
        if (intent.hasExtra("stitch_params")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("duet_and_stitch_router_config");
            StitchParams stitchParams = (StitchParams) intent.getParcelableExtra("stitch_params");
            if (!"draft_again".equals(strLIZJ)) {
                if (parcelableExtra != null) {
                    intent2.putExtra("duet_and_stitch_router_config", parcelableExtra);
                    intent2.putExtra("stitch_params", (Parcelable) stitchParams);
                    C1660680tJi.LIZ().LJIILL(activity, intent2, creativeInfo);
                    return;
                }
                boolean z2 = true;
                if (intent.getIntExtra("restore", 0) == 1 && !stitchParams.getRecordVideoPathLists().isEmpty()) {
                    intent2.putExtra("stitch_params", (Parcelable) stitchParams);
                    if (activity.isFinishing() || activity.isDestroyed()) {
                        z2 = false;
                    }
                    C539630LEj c539630LEj2 = C539630LEj.LIZ;
                    String str3 = LIZJ;
                    c539630LEj2.getClass();
                    C539630LEj.LJII(9, str3, strLIZJ, z2, intent2, null);
                    C1660680tJi.LIZ().LJIILLIIL(activity, intent2);
                    return;
                }
                C1660680tJi.LIZ().LJIIIIZZ(activity, stitchParams, creativeInfo);
                return;
            }
            boolean z3 = true;
            intent2.putExtra("stitch_params", (Parcelable) stitchParams);
            if (parcelableExtra != null) {
                intent2.putExtra("duet_and_stitch_router_config", parcelableExtra);
            }
            j jVar = C524780Ki4.LIZ;
            jVar.step("av_video_record_init", "real start activity");
            if (activity.isFinishing() || activity.isDestroyed()) {
                z3 = false;
            }
            C539630LEj c539630LEj3 = C539630LEj.LIZ;
            String str4 = LIZJ;
            c539630LEj3.getClass();
            C539630LEj.LJII(10, str4, strLIZJ, z3, intent2, null);
            jVar.step("av_video_open_camera_track", OpenCameraStep.REAL_START.getStepName());
            activity.runOnUiThread(new ARunnableS77S0200000_8(activity, intent2, 16));
            return;
        }
        boolean z4 = true;
        j jVar2 = C524780Ki4.LIZ;
        jVar2.step("av_video_record_init", "real start activity");
        if (activity.isFinishing() || activity.isDestroyed()) {
            z4 = false;
        }
        C539630LEj c539630LEj4 = C539630LEj.LIZ;
        String str5 = LIZJ;
        c539630LEj4.getClass();
        C539630LEj.LJII(5, str5, strLIZJ, z4, intent2, null);
        jVar2.step("av_video_open_camera_track", OpenCameraStep.REAL_START.getStepName());
        activity.runOnUiThread(new ARunnableS77S0200000_8(activity, intent2, 17));
    }

    public static C15O7 LJ(final Context context, final String str, final boolean z, boolean z2) {
        final v7.o oVar = new v7.o();
        final ProgressDialogC1397800mTi progressDialogC1397800mTiLIZJ = ProgressDialogC1397800mTi.LIZJ(context, context.getResources().getString(R.string.txr));
        progressDialogC1397800mTiLIZJ.setIndeterminate(true);
        LJIIL(true, 1504);
        o.LJI.Yk(context, str, z, progressDialogC1397800mTiLIZJ, new InterfaceC20498515Ix() { // from class: X.0Mq3
            public final /* synthetic */ int LIZJ = 2;

            @Override // X.InterfaceC20498515Ix
            public final void onFailed(Exception exc) {
                C786410Ut5.LJIILIIL(progressDialogC1397800mTiLIZJ);
                C1688680u2s.LJIIL(false, 1504);
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS108S0100000_8(context, 63));
                if (z) {
                    oVar.LIZLLL(exc);
                } else {
                    oVar.LJ(new Bundle());
                }
            }

            @Override // X.InterfaceC20498515Ix
            public final void LIZ(AVMusic aVMusic, String str2) {
                Bundle bundle = new Bundle();
                AVCommerceServiceImpl.LJIIJ();
                if (!((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).enableBAUserMusicExperienceOpt() && AVCommerceServiceImpl.LJIIJ().LJ() && !aVMusic.isCommerceMusic()) {
                    oVar.LJ(bundle);
                    return;
                }
                ((Keva) C1629700sVk.LIZ.getValue()).storeString(str, str2);
                aVMusic.setMusicPriority(this.LIZJ);
                C1452640nuA.LJI(aVMusic);
                C786410Ut5.LJJIZ(bundle, "aweme_music", aVMusic);
                C786410Ut5.LJJJI("path", str2, bundle);
                oVar.LJ(bundle);
            }
        }, z2);
        return oVar.LIZ;
    }

    public static void LJIIIIZZ(Effect effect, ProgressDialogC1399790mWv progressDialogC1399790mWv, Bundle bundle, v7.o<Bundle> oVar) {
        C0FNU.LIZ(progressDialogC1399790mWv);
        LJIIL(false, 1502);
        C786410Ut5.LJJIJL(bundle, "first_sticker", effect);
        if (effect.getMusic() != null && !effect.getMusic().isEmpty()) {
            String strLIZ = C1629700sVk.LIZ((String) ListProtector.get(effect.getMusic(), 0));
            if (!TextUtils.isEmpty(strLIZ)) {
                C786410Ut5.LJJJI("path", strLIZ, bundle);
            }
        }
        oVar.LJ(bundle);
    }

    public static void LJIIJ(InterfaceC1635410sex interfaceC1635410sex, final ProgressDialogC1399790mWv progressDialogC1399790mWv, final String str, final Bundle bundle, final v7.o<Bundle> oVar, final EffectListResponse effectListResponse) {
        C1626140sQ0.LIZ(interfaceC1635410sex).LIZJ((Effect) ListProtector.get(effectListResponse.getData(), 0), new IFetchEffectListener() { // from class: X.0tBM
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(Effect effect) {
                C1398060mU8.LIZIZ(str, effectListResponse);
                C1688680u2s.LJIIIIZZ(effect, progressDialogC1399790mWv, bundle, oVar);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                C1688680u2s.LJII(progressDialogC1399790mWv, exceptionResult, oVar);
            }
        });
    }
}
