package X;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ve.standalone.fileinfo.StandaloneVideoFileInfoTool;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: renamed from: X.09oh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2486109oh {
    public static volatile boolean LIZ;
    public static final Object LIZIZ = new Object();

    public static int LIZ(String str) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi(CreativeToolsPluginService.class);
        new Object() { // from class: X.09oi
        }.getClass();
        CreativeToolsPluginService creativeToolsPluginService2 = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService2 != null && creativeToolsPluginService2.LJIIIZ() && C0C64.LJIILLIIL().LJIIIZ(31744, "standalone_audio_check_enabled", true, true) && creativeToolsPluginService != null && !creativeToolsPluginService.LJI(C1BWL.LIZ())) {
            if (!LIZ) {
                synchronized (LIZIZ) {
                    try {
                        if (!LIZ) {
                            try {
                                Application applicationLIZ = C1BWL.LIZ();
                                if (applicationLIZ != null) {
                                    StandaloneVideoFileInfoTool.init(C786410Ut5.M3(applicationLIZ));
                                    LIZ = true;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("VideoUtils_wht StandaloneVideoFileInfoTool.init failed: ");
                                sbLIZ.append(th.getMessage());
                                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }
            return StandaloneVideoFileInfoTool.checkAudioFile(str);
        }
        return TEVideoUtils.nativeCheckAudioFile(str);
    }

    public static boolean LIZIZ(String str) {
        File externalFilesDir = C0CHQ.LIZ.getExternalFilesDir(null);
        File filesDir = C0CHQ.LIZ.getFilesDir();
        if (externalFilesDir != null && str.startsWith(externalFilesDir.getAbsolutePath())) {
            return true;
        }
        if (filesDir != null && str.startsWith(filesDir.getAbsolutePath())) {
            return true;
        }
        return false;
    }

    public static int[] LJ(String str) {
        int i;
        int[] iArr = new int[6];
        if (str == null) {
            iArr[0] = 1;
            return iArr;
        }
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (videoFileInfo != null && (i = videoFileInfo.width) != 0) {
            iArr[0] = 0;
            iArr[1] = videoFileInfo.duration;
            int i2 = videoFileInfo.rotation;
            if (i2 != 90 && i2 != 270) {
                iArr[2] = i;
                iArr[3] = videoFileInfo.height;
            } else {
                iArr[2] = videoFileInfo.height;
                iArr[3] = i;
            }
            iArr[4] = 320;
            iArr[5] = (videoFileInfo.height * 320) / i;
            return iArr;
        }
        iArr[0] = 1;
        return iArr;
    }

    public static boolean LIZJ(Context context, Uri uri) {
        try {
            InputStream inputStreamLJ = C09NT.LJ(context.getContentResolver(), uri);
            if (inputStreamLJ == null) {
                return false;
            }
            inputStreamLJ.close();
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("media uri legal error", e);
            return false;
        }
    }

    public static boolean LIZLLL(Context context, String str) {
        if (str != null && !LIZIZ(str)) {
            return LIZJ(context, UriProtector.parse(str));
        }
        return C2354709Kn.LIZIZ(str);
    }
}
