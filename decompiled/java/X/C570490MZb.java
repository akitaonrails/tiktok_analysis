package X;

import Y.ACallableS13S0010000_8;
import android.app.Application;
import android.os.Build;
import android.os.Looper;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.experiment.PublishPageImpl;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0MZb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570490MZb {
    public static final void LIZ(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLJIILL = C2354709Kn.LJIILL();
        ((Keva) C570500MZc.LIZ.getValue()).storeLong("key_last_clean_non_creative_cache_time", System.currentTimeMillis());
        PublishPageImpl.LIZLLL().LIZJ();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "claer_duration");
        c0lab.LIZIZ((C2354709Kn.LJIILL() - jLJIILL) / ((long) 1024), "clear_size");
        c0lab.LIZ(z ? 1 : 0, "in_main_thread");
        C20684815ws.LJIILLIIL("clear_non_creative_cache_monitor", c0lab.LIZ);
    }

    public static final void LIZIZ(CreativeInfo creativeInfo) {
        boolean z = false;
        boolean z2 = false;
        AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(creativeInfo, z, z, z, 14));
        C20020913Vf c20020913Vf = C20020913Vf.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteUnusedCreativeFiles: creationId: ");
        sbLIZ.append(creativeInfo.getCreationId());
        sbLIZ.append(", version: ");
        sbLIZ.append(creativeInfo.getVersion());
        sbLIZ.append(", isDraft: ");
        int version = 0;
        if (awemeDraftLJI != null) {
            z2 = true;
        }
        sbLIZ.append(z2);
        sbLIZ.append("  draft_version: ");
        if (awemeDraftLJI != null) {
            version = awemeDraftLJI.LIZIZ().getVersion();
        }
        sbLIZ.append(version);
        C201955140j.LIZJ(c20020913Vf, C2188811AlT.LIZIZ(sbLIZ));
        if (awemeDraftLJI == null) {
            C08QA.LJIIZILJ(new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIZILJ(creativeInfo)));
            C08QA.LJIIZILJ(new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJII(creativeInfo)));
            C08QA.LJIIZILJ(new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZLLL(creativeInfo)));
        }
    }

    public static final String LIZJ(String str) {
        String str2 = File.separator;
        if (u.LJIIZILJ(str, str2, false)) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final boolean LIZLLL(String str) {
        File file;
        if (C2471909mP.LJJIIZI(str)) {
            return true;
        }
        if (str != null && str.length() != 0 && a0.LJJIIZI(str, "tt_glance", false)) {
            return true;
        }
        C01GW c01gw = C20021913Vp.LIZ;
        Application application = C0CHQ.LIZ;
        if (Build.VERSION.SDK_INT >= 24) {
            file = C795420VIe.LIZIZ(application);
        } else {
            String str2 = application.getApplicationInfo().dataDir;
            if (str2 != null) {
                file = new File(str2);
            } else {
                file = null;
            }
        }
        return !u.LJJIIJZLJL(str, file.getAbsolutePath(), false);
    }

    public static final boolean LJ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (u.LJJIIJZLJL(str, "http", false)) {
            return true;
        }
        if (C2471909mP.LJJIIZI(str)) {
            return C2471909mP.LJJIIZ(null, str, false);
        }
        return new C0VSJ(str).exists();
    }

    public static final void LJFF(File file) {
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
    }

    public static final boolean LJI(File file) {
        boolean z;
        boolean z2;
        if (file.exists()) {
            return true;
        }
        long jMax = Math.max(C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "studio_create_file_clean_cache_available_threshold", true), 0L);
        long jLJIILL = C2354709Kn.LJIILL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("smartCreateNewFile -> CacheCleanThresholdWhenCreateFile -> available storage size: ");
        float f = jLJIILL;
        sbLIZ.append((f / 1024.0f) / 1024.0f);
        sbLIZ.append("MB");
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (jMax > 0 && f < jMax / 1024.0f) {
            z = true;
        } else {
            z = false;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_create_file_clean_cache_duration", true) > 0 && System.currentTimeMillis() - ((Keva) C570500MZc.LIZ.getValue()).getLong("key_last_clean_non_creative_cache_time", 0L) > r2 * 60 * LSPassThroughRecordSizeConfig.DEFAULT) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("smartCreateNewFile -> CacheCleanThresholdWhenCreateFile.enableCacheCleanByThreshold() = ");
        sbLIZ2.append(z);
        sbLIZ2.append(";ClearNonCreativeCacheInterval.enableCleanCache() = ");
        sbLIZ2.append(z2);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (z && z2) {
            boolean zLJFF = Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper());
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("smartCreateNewFile -> in main thread = ");
            sbLIZ3.append(zLJFF);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            if (!zLJFF) {
                ((Keva) C570500MZc.LIZ.getValue()).storeLong("key_last_clean_non_creative_cache_time", System.currentTimeMillis());
                LIZ(false);
            }
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    if (parentFile.exists()) {
                        return file.createNewFile();
                    }
                    if (parentFile.mkdirs() && file.createNewFile()) {
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("smartCreateNewFile -> ");
                sbLIZ4.append(Unit.LIZ);
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ4));
                if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                    C15O7.LIZJ(new ACallableS13S0010000_8(zLJFF, 1));
                    return false;
                }
                return false;
            }
        }
        File parentFile2 = file.getParentFile();
        if (parentFile2 != null) {
            if (parentFile2.exists()) {
                return file.createNewFile();
            }
            if (parentFile2.mkdirs() && file.createNewFile()) {
                return true;
            }
        }
        return false;
    }
}
