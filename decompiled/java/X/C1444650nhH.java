package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadSettingConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nhH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444650nhH {
    public static volatile UploadAuthKeyConfig LIZIZ;
    public static final C1444650nhH LIZ = new C1444650nhH();
    public static final Keva LIZJ = Keva.getRepo("cache_authkey_keva");

    public static void LIZIZ() {
        Object objLJII;
        if (LIZIZ == null) {
            String strLIZ = LIZ();
            if (strLIZ.length() != 0) {
                try {
                    objLJII = C0CHQ.LIZ().getGson().LJII(strLIZ, UploadAuthKeyConfig.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Json AB ConfigError， Config:");
                    sbLIZ.append(strLIZ);
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    objLJII = null;
                }
            } else {
                objLJII = null;
            }
            LIZIZ = (UploadAuthKeyConfig) objLJII;
        }
    }

    public static String LIZ() {
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        String uid = currentUser != null ? currentUser.getUid() : null;
        return uid != null ? LIZJ.getString(uid, "") : "";
    }

    public static void LIZLLL(long j) {
        if (j == 100026 || j == -39982 || j == -190105 || j == 30406) {
            LIZIZ = null;
            LJFF("");
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_clear_authkey_cache", true, false)) {
            if (j == -60000 || j == -39974) {
                LIZIZ = null;
                LJFF("");
            }
        }
    }

    public static void LJFF(String str) {
        String uid;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null && (uid = currentUser.getUid()) != null) {
            LIZJ.storeString(uid, str);
        }
    }

    public static final void LJI(UploadAuthKeyConfig uploadAuthKeyConfig, long j) {
        boolean z;
        UploadSettingConfig uploadSettingConfig = uploadAuthKeyConfig.uploadSettingConfig;
        if (uploadSettingConfig == null) {
            return;
        }
        InterfaceC1444620nhE interfaceC1444620nhELJJIIZI = C0CHQ.LIZ().LJJIIZI();
        boolean z2 = false;
        if (uploadSettingConfig.enablePreUpload == 1) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1444620nhELJJIIZI.LJJJJL(z);
        C0CHQ.LIZ().LJJIIZI().LJI(uploadSettingConfig.preUploadEncryptionMode);
        InterfaceC1444620nhE interfaceC1444620nhELJJIIZI2 = C0CHQ.LIZ().LJJIIZI();
        if (uploadSettingConfig.publishCloseClientWatermark == 0) {
            z2 = true;
        }
        interfaceC1444620nhELJJIIZI2.LJJIIZI(z2);
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("server config: publish_close_client_watermark=");
        sbLIZ.append(uploadSettingConfig.publishCloseClientWatermark);
        sbLIZ.append(", authkey request time: ");
        sbLIZ.append(j);
        c1437510nVlLJJLIIIJ.LIZ("post_save_local", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.util.Map r4, final kotlin.jvm.functions.Function1 r5, final kotlin.jvm.functions.Function1 r6) {
        /*
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0niP r3 = r0.getNetworkService()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.tools.AVApi> r0 = com.ss.android.ugc.aweme.tools.AVApi.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.tools.AVApi r0 = (com.ss.android.ugc.aweme.tools.AVApi) r0
            java.lang.String r2 = r0.LIZ()
            r1 = 1
            java.lang.Class<com.ss.android.ugc.aweme.utils.AuthKeyApi> r0 = com.ss.android.ugc.aweme.utils.AuthKeyApi.class
            java.lang.Object r0 = r3.createRetrofit(r2, r1, r0)
            com.ss.android.ugc.aweme.utils.AuthKeyApi r0 = (com.ss.android.ugc.aweme.utils.AuthKeyApi) r0
            X.11NZ r3 = r0.getUploadAuthKeyConfig(r4)
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L5a
            com.ss.android.ugc.aweme.setting.performance.ToolsNetworkPriorityConfig r0 = X.C20163113uv.LIZ()
            boolean r0 = r0.enable
            if (r0 == 0) goto L6a
            java.lang.Thread r0 = X.C786410Ut5.u3()
            java.lang.String r1 = r0.getName()
            com.ss.android.ugc.aweme.shortvideo.ui.task.RecordTaskManager r0 = com.ss.android.ugc.aweme.shortvideo.ui.task.RecordTaskManager.LIZ
            r0.getClass()
            X.01GW r0 = com.ss.android.ugc.aweme.shortvideo.ui.task.RecordTaskManager.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Thread r0 = (java.lang.Thread) r0
            java.lang.String r0 = r0.getName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6a
        L5a:
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r3.LJL(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r3 = r1.LJJJLZIJ(r0)
        L6a:
            long r1 = java.lang.System.currentTimeMillis()
            X.0nhI r0 = new X.0nhI
            r0.<init>()
            r3.LIZIZ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1444650nhH.LIZJ(java.util.Map, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    public static final void LJ(boolean z, Map<String, String> map, Function1<? super UploadAuthKeyConfig, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Long lValueOf;
        boolean z2 = false;
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_authkey_cache_timeout_s", true);
        if (!z && iLJIJ > 0) {
            LIZ.getClass();
            LIZIZ();
            long jCurrentTimeMillis = System.currentTimeMillis();
            UploadAuthKeyConfig uploadAuthKeyConfig = LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("local cache is null? : ");
            if (uploadAuthKeyConfig == null) {
                z2 = true;
            }
            sbLIZ.append(z2);
            C2188811AlT.LIZIZ(sbLIZ);
            if (uploadAuthKeyConfig != null && jCurrentTimeMillis - uploadAuthKeyConfig.saveTime <= iLJIJ * LSPassThroughRecordSizeConfig.DEFAULT) {
                C0CHQ.LIZ().getRegionService();
                if (C20186013yc.LIZ().equals(uploadAuthKeyConfig.currentRegion)) {
                    function1.invoke(uploadAuthKeyConfig);
                    return;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("currentTime: ");
            sbLIZ2.append(jCurrentTimeMillis);
            sbLIZ2.append(", localSaveTime: ");
            String str = null;
            if (uploadAuthKeyConfig != null) {
                lValueOf = Long.valueOf(uploadAuthKeyConfig.saveTime);
            } else {
                lValueOf = null;
            }
            sbLIZ2.append(lValueOf);
            sbLIZ2.append(", authKeyCacheTime: ");
            sbLIZ2.append(iLJIJ);
            sbLIZ2.append(", currentRegion: ");
            C0CHQ.LIZ().getRegionService();
            sbLIZ2.append(C20186013yc.LIZ());
            sbLIZ2.append(", localCache region: ");
            if (uploadAuthKeyConfig != null) {
                str = uploadAuthKeyConfig.currentRegion;
            }
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            LIZJ(map, new C1444690nhL(function1), function12);
            return;
        }
        C1444650nhH c1444650nhH = LIZ;
        C1444680nhK c1444680nhK = new C1444680nhK(function1);
        c1444650nhH.getClass();
        LIZJ(map, c1444680nhK, function12);
    }
}
