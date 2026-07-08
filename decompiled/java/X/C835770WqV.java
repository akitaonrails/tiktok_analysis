package X;

import Y.ACallableS245S0200000_13;
import Y.ARunnableS1S2200200_13;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.alog.Alog;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.external.IExternalAlbumService;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService;
import com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import com.ss.bduploader.BDObjectInfo;
import com.ss.bduploader.BDObjectUploader;
import com.ss.bduploader.BDObjectUploaderListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS449S0200000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v7.o;

/* JADX INFO: renamed from: X.0WqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835770WqV {
    public static void LJFF() throws JSONException {
        Map<String, ConfigItem> map = C2502809rO.LIZ;
        JSONArray jSONArray = new JSONArray();
        HashMap map2 = (HashMap) map;
        for (String str : map2.keySet()) {
            JSONObject jSONObject = new JSONObject();
            C0C59 c0c59LJ = C0C59.LJ();
            c0c59LJ.LJIILJJIL(0, false);
            Object objLJIIJJI = c0c59LJ.LJIIJJI(str, true);
            ConfigItem configItem = (ConfigItem) map2.get(str);
            if (configItem != null) {
                jSONObject.put("abKey", str);
                jSONObject.put("filedTypedName", configItem.type.toString());
                if (objLJIIJJI == null || Intrinsics.LJFF(objLJIIJJI, "null")) {
                    jSONObject.put("value", "null");
                } else {
                    jSONObject.put("value", objLJIIJJI.toString());
                }
                jSONArray.put(jSONObject);
            }
        }
        String string = jSONArray.toString();
        try {
            C2215208m6 c2215208m6 = new C2215208m6("y+6T0b/qfIqkZDbYHfFiN/8XI5fyqrwX5d2WZ2NN3w==");
            if (!c2215208m6.exists()) {
                c2215208m6.mkdir();
            }
            C09BI c09bi = new C09BI(new C2215208m6("y++T0b/oeIukZDfZHPFiNf8XI5fyqrwX5d2WZ2NN32Fsy5H77EPLLv3Kd2s="));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(c09bi));
            bufferedWriter.write(string);
            bufferedWriter.close();
            c09bi.close();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ() {
        List listLJJLL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        long jLJIJ = (jCurrentTimeMillis / j) - ((long) ((C0C64.LJIILLIIL().LJIJ(31744, 3, "ttk_feedback_alog_size", true) * 60) * 60));
        long jCurrentTimeMillis2 = System.currentTimeMillis() / j;
        C827360Wcw c827360Wcw = ALog.sConfig;
        String absolutePath = c827360Wcw != null ? c827360Wcw.LJFF : null;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ttk_feedback_alog_upload_opt", true, false) && (absolutePath == null || absolutePath.length() == 0)) {
            C844470XAv.LIZ.getClass();
            absolutePath = C08OV.LIZJ(C844470XAv.LIZ()).getAbsolutePath();
        }
        long j2 = jLJIJ * j;
        long j3 = j * jCurrentTimeMillis2;
        C827390Wcz.LIZ.getClass();
        if (C294900BhA.LIZ()) {
            C827300Wcq.LIZ.getClass();
            try {
                Alog alog = C827300Wcq.LIZIZ;
                listLJJLL = alog != null ? C13LQ.LJJLL(alog.LJFF(j2, j3)) : C13BV.INSTANCE;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                listLJJLL = C13BV.INSTANCE;
            }
            C827300Wcq c827300Wcq = C827300Wcq.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start upload files:");
            sbLIZ.append(listLJJLL);
            c827300Wcq.LIZJ("FeedALogMonitor", 4, "FeedALogMonitor", C2188811AlT.LIZIZ(sbLIZ));
            int size = listLJJLL.size();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event", "request");
                jSONObject.put("file_count", size);
                jSONObject.put("log_dir_path", absolutePath == null ? "empty" : absolutePath);
                C793770VBv.LJII("feeds_alog_monitor", jSONObject, null, null);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ttk_feedback_alog_upload_opt", true, false)) {
            ApmDelegate apmDelegate = C788700Uwm.LIZ;
            C827400Wd0 c827400Wd0 = C827400Wd0.LIZ;
            if (apmDelegate.LLJILLL) {
                C787900UvU.LIZ.LJII(new ARunnableS1S2200200_13(absolutePath, jLJIJ, jCurrentTimeMillis2, 1));
            } else {
                c827400Wd0.LIZ(C2404309bV.LIZ(false, 9, null, null), false);
            }
            if (apmDelegate.LLJJ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("alog_scene: ");
                sbLIZ2.append("feedback");
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        } else {
            C793770VBv.LIZ(absolutePath, jLJIJ, jCurrentTimeMillis2, "feedback", new InterfaceC794220VDo() { // from class: X.0Wcv
                @Override // X.InterfaceC794220VDo
                public final void LIZ() {
                    try {
                        if (C294900BhA.LIZ()) {
                            C844470XAv.LIZ.getClass();
                            Context contextLIZ = C844470XAv.LIZ();
                            C827300Wcq.LIZ.LJ(contextLIZ, C08OV.LIZJ(contextLIZ));
                        }
                        ALog.asyncFlush();
                        ALog.forceLogSharding();
                        Thread.sleep(1000L);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            }, new InterfaceC794020VCu() { // from class: X.0Wd1
                @Override // X.InterfaceC794020VCu
                public final void LIZ(JSONObject jSONObject2, boolean z) {
                    String str;
                    Pair[] pairArr = new Pair[2];
                    if (z) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    } else {
                        str = "1";
                    }
                    pairArr[0] = new Pair(str, "success");
                    pairArr[1] = new Pair(jSONObject2.optString("code"), "status_code");
                    C20684815ws.LJIJI("feedback_alog_upload", pairArr);
                    C827390Wcz.LIZ.getClass();
                    C827390Wcz.LIZ(jSONObject2, z);
                }
            });
        }
        C0VGF.LIZIZ.LIZIZ();
    }

    public static String LJIIIIZZ() throws JSONException {
        LJFF();
        C15O7 c15o7LJIIJ = LJIIJ(new C2215208m6("y++T0b/oeIukZDfZHPFiNf8XI5fyqrwX5d2WZ2NN32Fsy5H77EPLLv3Kd2s=").getAbsolutePath());
        if (c15o7LJIIJ == null) {
            return null;
        }
        c15o7LJIIJ.LJIL(10L, TimeUnit.SECONDS);
        return (String) c15o7LJIIJ.LJIIL();
    }

    public static C15O7 LJIIJ(String str) {
        IExternalUploaderService iExternalUploaderServiceExternalUploaderService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).externalUploaderService();
        o oVar = new o();
        String sdkV4AuthKey = iExternalUploaderServiceExternalUploaderService.getSdkV4AuthKey();
        if (TextUtils.isEmpty(sdkV4AuthKey)) {
            iExternalUploaderServiceExternalUploaderService.cacheUploadAuthKeyConfig();
            oVar.LIZJ("Failed Upload Config: NO sdkV4AuthKey");
            return oVar.LIZ;
        }
        LJII(oVar, iExternalUploaderServiceExternalUploaderService.getUploadVideoConfig(sdkV4AuthKey), iExternalUploaderServiceExternalUploaderService, str);
        return oVar.LIZ;
    }

    public final void LIZJ(Function1<? super JSONObject, Unit> function1) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C835790WqX(this, function1, null), 3);
        C0S4O.LIZIZ(C0S4O.LIZ, C0S48.ENTRY_FEEDBACK, 4);
        LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC1364105Vn<? super java.lang.String> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C835770WqV.LJIIIZ(X.05Vn):java.lang.Object");
    }

    public static JSONObject LJ(String str, String str2) throws JSONException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Boolean boolValueOf;
        Map<String, Object> mapLJLI;
        boolean z5;
        JSONObject jSONObject = new JSONObject();
        String string = null;
        boolean z6 = false;
        try {
            jSONObject.put("is_from_h5", "true");
            JSONObject jSONObject2 = new JSONObject();
            IFavoriteService iFavoriteService = (IFavoriteService) ServiceManager.get().getService(IFavoriteService.class);
            if (iFavoriteService == null || !iFavoriteService.LJIIZILJ()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                z2 = true;
            } else {
                z2 = false;
            }
            jSONObject2.put("favorite_reverse", z2);
            jSONObject2.put("is_table", false);
            IFavoriteService iFavoriteService2 = (IFavoriteService) ServiceManager.get().getService(IFavoriteService.class);
            if (iFavoriteService2 == null || !iFavoriteService2.LJIIIIZZ()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            jSONObject2.put("favorite_on_video_player", z4);
            jSONObject2.put("has_player_favorite_button", C614440O8c.LIZIZ);
            IFavoriteService iFavoriteService3 = (IFavoriteService) ServiceManager.get().getService(IFavoriteService.class);
            if (iFavoriteService3 != null) {
                boolValueOf = Boolean.valueOf(iFavoriteService3.LJIIJ());
            } else {
                boolValueOf = null;
            }
            jSONObject2.put("hit_frequency_control", boolValueOf);
            jSONObject.put("favorite_info", C786410Ut5.J3(jSONObject2));
            ITranslationService iTranslationService = (ITranslationService) PluggableExtentionKt.pluggableSpi$default(ITranslationService.class, false, false, false, 14, null);
            if (iTranslationService != null) {
                mapLJLI = iTranslationService.LJLI();
            } else {
                mapLJLI = null;
            }
            if (mapLJLI != null) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, Object> entry : mapLJLI.entrySet()) {
                    jSONObject3.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("cla_diagnostic_info", C786410Ut5.J3(jSONObject3));
            }
            jSONObject.put("favorite_last_30_api_error", C614440O8c.LIZJ.LJIIIIZZ());
            String[] disableUploadRegion = C0CLW.LIZIZ.LIZ.getFeedbackConf().getDisableUploadRegion();
            if (disableUploadRegion != null) {
                if (disableUploadRegion.length != 0) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (!z5) {
                    jSONObject.put("disable_upload_region", C08JS.LIZLLL(disableUploadRegion));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).LIZLLL()) {
            C835850Wqd.LIZ.getClass();
            C835850Wqd.LIZIZ = false;
        } else {
            C835850Wqd.LIZ.getClass();
            C835850Wqd.LIZIZ = true;
            C835850Wqd.LIZJ = true;
            for (Map.Entry<String, String> entry2 : ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).LIZIZ().entrySet()) {
                try {
                    jSONObject.put(entry2.getKey(), entry2.getValue());
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C835850Wqd c835850Wqd = C835850Wqd.LIZ;
                    String strValueOf = String.valueOf(e2.getMessage());
                    c835850Wqd.getClass();
                    ((ArrayList) C835850Wqd.LJII).add(strValueOf);
                }
            }
            C835850Wqd.LIZ.getClass();
            C835850Wqd.LIZLLL = C835850Wqd.LIZ(jSONObject);
        }
        try {
            Map<String, ?> all = Keva.getRepo("user_logout_log").getAll();
            if (!all.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<String, ?> entry3 : all.entrySet()) {
                    if (!Intrinsics.LJFF(entry3.getKey(), "last_time")) {
                        sb.append(entry3.getKey());
                        sb.append(":");
                        sb.append(entry3.getValue());
                        sb.append(" ");
                    }
                }
                string = sb.toString();
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            string = "error";
        }
        if (!TextUtils.isEmpty(str) && !Intrinsics.LJFF("null", str)) {
            try {
                jSONObject.put("abnor_abclone", str);
            } catch (JSONException e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
        if (str2 != null) {
            jSONObject.put("draft_log_file_tos", str2);
        }
        String strLJ = ((IExternalAlbumService) ServiceManager.get().getService(IExternalAlbumService.class)).LJ();
        if (strLJ == null || strLJ.length() == 0) {
            z6 = true;
        }
        if (!z6) {
            jSONObject.put("media_permission", strLJ);
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                jSONObject.put("logout_info", string);
                return jSONObject;
            } catch (JSONException e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
        }
        return jSONObject;
    }

    public static void LJI(long j, boolean z) {
        long length = new C0VSJ(C0CHQ.LIZ().LJI().LJI()).length() / ((long) 1024);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(length, "file_size");
        c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "upload_time");
        c2344009Gk.LIZJ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C20684815ws.LJIILLIIL("upload_draft_log_monitor", c2344009Gk.LIZ);
    }

    public final void LIZIZ(final Function1<? super JSONObject, Unit> function1, Function2<? super Integer, ? super String, Unit> function2) {
        final C013C c013c = new C013C();
        final AwS449S0200000_13 awS449S0200000_13 = new AwS449S0200000_13(c013c, (C013C) function2, (Function2<? super Integer, ? super String, Unit>) 0);
        C15O7.LIZJ(new ACallableS245S0200000_13(awS449S0200000_13, this, 27)).LJ(new C854730Xfz(this, awS449S0200000_13, 0), C15O7.LJI, null).LJ(new InterfaceC2385309Wh() { // from class: X.0WqU
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                String localizedMessage;
                C1C7U.LIZ("UploadALogUtil@5934.doUploadALog$3");
                if (!c15o7.LJIILL() && !c15o7.LJIILIIL()) {
                    if (!c013c.element) {
                        function1.invoke((JSONObject) c15o7.LJIIL());
                    }
                } else {
                    Function2<Integer, String, Unit> function22 = awS449S0200000_13;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("task has error: ");
                    Exception excLJIIJJI = c15o7.LJIIJJI();
                    if (excLJIIJJI == null || (localizedMessage = excLJIIJJI.getLocalizedMessage()) == null) {
                        localizedMessage = "unknown error";
                    }
                    sbLIZ.append(localizedMessage);
                    function22.invoke(3, C2188811AlT.LIZIZ(sbLIZ));
                }
                C0S4O.LIZIZ(C0S4O.LIZ, C0S48.ENTRY_FEEDBACK, 4);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("UploadALogUtil@5934.doUploadALog$3");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
        LIZ();
    }

    public static void LJII(final o oVar, ExternalUploadVideoConfig externalUploadVideoConfig, IExternalUploaderService iExternalUploaderService, String str) {
        final BDObjectUploader bDObjectUploader = new BDObjectUploader();
        bDObjectUploader.setListener(new BDObjectUploaderListener() { // from class: X.0Wqb
            @Override // com.ss.bduploader.BDObjectUploaderListener
            public final int objectUploadCheckNetState(int i, int i2) {
                return 0;
            }

            @Override // com.ss.bduploader.BDObjectUploaderListener
            public final void onLog(int i, int i2, String str2) {
            }

            @Override // com.ss.bduploader.BDObjectUploaderListener
            public final void onNotify(int i, long j, BDObjectInfo bDObjectInfo) {
                if (i != 6) {
                    if (i == 7) {
                        oVar.LIZJ("failed");
                        bDObjectUploader.close();
                        return;
                    }
                    return;
                }
                oVar.LIZJ(bDObjectInfo.mImageTosKey);
                bDObjectUploader.close();
            }
        });
        bDObjectUploader.setTopAccessKey(externalUploadVideoConfig.topAccessKey);
        bDObjectUploader.setTopSecretKey(externalUploadVideoConfig.topSecretKey);
        bDObjectUploader.setTopSessionToken(externalUploadVideoConfig.topSessionToken);
        bDObjectUploader.setSpaceName(externalUploadVideoConfig.spaceName);
        bDObjectUploader.setUploadDomain(externalUploadVideoConfig.videoHostName);
        bDObjectUploader.setSliceSize(externalUploadVideoConfig.sliceSize);
        bDObjectUploader.setSocketNum(1);
        bDObjectUploader.setSliceRetryCount(1);
        bDObjectUploader.setFileRetryCount(1);
        bDObjectUploader.setFilePath(1, new String[]{str});
        bDObjectUploader.setNetworkType(403, iExternalUploaderService.getUploadMainNetworkType());
        bDObjectUploader.setNetworkType(404, iExternalUploaderService.getUploadBackupNetworkType());
        bDObjectUploader.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[PHI: r8
      0x004b: PHI (r8v6 java.lang.String) = (r8v2 java.lang.String), (r8v7 java.lang.String) binds: [B:19:0x0049, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[PHI: r8
      0x004f: PHI (r8v5 java.lang.String) = (r8v2 java.lang.String), (r8v6 java.lang.String) binds: [B:19:0x0049, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053 A[PHI: r8 r9
      0x0053: PHI (r8v3 java.lang.String) = (r8v5 java.lang.String), (r8v6 java.lang.String) binds: [B:23:0x0051, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r9v0 java.lang.String) = (r9v2 java.lang.String), (r9v3 java.lang.String) binds: [B:23:0x0051, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f A[PHI: r11
      0x005f: PHI (r11v10 java.lang.String) = (r11v0 java.lang.String), (r11v11 java.lang.String) binds: [B:29:0x005d, B:27:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[PHI: r11
      0x0063: PHI (r11v9 java.lang.String) = (r11v0 java.lang.String), (r11v10 java.lang.String) binds: [B:29:0x005d, B:31:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067 A[PHI: r11 r12
      0x0067: PHI (r11v1 java.lang.String) = (r11v9 java.lang.String), (r11v10 java.lang.String) binds: [B:33:0x0065, B:31:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r12v0 java.lang.String) = (r12v8 java.lang.String), (r12v9 java.lang.String) binds: [B:33:0x0065, B:31:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f A[PHI: r11 r12
      0x006f: PHI (r11v8 java.lang.String) = (r11v1 java.lang.String), (r11v1 java.lang.String), (r11v9 java.lang.String) binds: [B:35:0x0069, B:37:0x006d, B:33:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r12v7 java.lang.String) = (r12v0 java.lang.String), (r12v0 java.lang.String), (r12v8 java.lang.String) binds: [B:35:0x0069, B:37:0x006d, B:33:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073 A[PHI: r11 r12 r13
      0x0073: PHI (r11v7 java.lang.String) = (r11v1 java.lang.String), (r11v8 java.lang.String) binds: [B:37:0x006d, B:39:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r12v6 java.lang.String) = (r12v0 java.lang.String), (r12v7 java.lang.String) binds: [B:37:0x006d, B:39:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r13v6 java.lang.String) = (r13v0 java.lang.String), (r13v7 java.lang.String) binds: [B:37:0x006d, B:39:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b A[PHI: r11 r12 r13
      0x007b: PHI (r11v2 java.lang.String) = (r11v7 java.lang.String), (r11v7 java.lang.String), (r11v8 java.lang.String) binds: [B:41:0x0075, B:43:0x0079, B:39:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x007b: PHI (r12v1 java.lang.String) = (r12v6 java.lang.String), (r12v6 java.lang.String), (r12v7 java.lang.String) binds: [B:41:0x0075, B:43:0x0079, B:39:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x007b: PHI (r13v1 java.lang.String) = (r13v6 java.lang.String), (r13v6 java.lang.String), (r13v7 java.lang.String) binds: [B:41:0x0075, B:43:0x0079, B:39:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f A[PHI: r11 r12 r13 r14
      0x007f: PHI (r11v6 java.lang.String) = (r11v2 java.lang.String), (r11v7 java.lang.String) binds: [B:45:0x007d, B:43:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x007f: PHI (r12v5 java.lang.String) = (r12v1 java.lang.String), (r12v6 java.lang.String) binds: [B:45:0x007d, B:43:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x007f: PHI (r13v5 java.lang.String) = (r13v1 java.lang.String), (r13v6 java.lang.String) binds: [B:45:0x007d, B:43:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x007f: PHI (r14v4 java.lang.String) = (r14v0 java.lang.String), (r14v5 java.lang.String) binds: [B:45:0x007d, B:43:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087 A[PHI: r11 r12 r13 r14
      0x0087: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v6 java.lang.String), (r11v6 java.lang.String) binds: [B:45:0x007d, B:47:0x0081, B:49:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r12v2 java.lang.String) = (r12v1 java.lang.String), (r12v5 java.lang.String), (r12v5 java.lang.String) binds: [B:45:0x007d, B:47:0x0081, B:49:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r13v2 java.lang.String) = (r13v1 java.lang.String), (r13v5 java.lang.String), (r13v5 java.lang.String) binds: [B:45:0x007d, B:47:0x0081, B:49:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r14v1 java.lang.String) = (r14v0 java.lang.String), (r14v4 java.lang.String), (r14v4 java.lang.String) binds: [B:45:0x007d, B:47:0x0081, B:49:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b A[PHI: r11 r12 r13 r14 r15
      0x008b: PHI (r11v5 java.lang.String) = (r11v3 java.lang.String), (r11v6 java.lang.String) binds: [B:51:0x0089, B:49:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x008b: PHI (r12v4 java.lang.String) = (r12v2 java.lang.String), (r12v5 java.lang.String) binds: [B:51:0x0089, B:49:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x008b: PHI (r13v4 java.lang.String) = (r13v2 java.lang.String), (r13v5 java.lang.String) binds: [B:51:0x0089, B:49:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x008b: PHI (r14v3 java.lang.String) = (r14v1 java.lang.String), (r14v4 java.lang.String) binds: [B:51:0x0089, B:49:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x008b: PHI (r15v2 java.lang.String) = (r15v0 java.lang.String), (r15v3 java.lang.String) binds: [B:51:0x0089, B:49:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r18, v7.o<java.lang.String> r19, com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService r20, X.InterfaceC1364105Vn<? super X.C15O7<java.lang.String>> r21) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C835770WqV.LIZLLL(java.lang.String, v7.o, com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService, X.05Vn):java.lang.Object");
    }
}
