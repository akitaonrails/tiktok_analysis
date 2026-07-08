package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.base.IToolsDiskLruCacheInstance;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.13TC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13TC {
    public static Map LIZJ() {
        if (!((Boolean) C1866290yfL.LIZ.getValue()).booleanValue()) {
            C0WKX c0wkx = C13TD.LIZJ;
            if (c0wkx != null) {
                return c0wkx.LJ;
            }
            return null;
        }
        C201955140j.LIZIZ("ReuseCreationMusicUrlHook", "use toolsDiskCache");
        C13S6 c13s6 = C13TD.LIZLLL;
        if (c13s6 != null) {
            return c13s6.LJIILJJIL();
        }
        return null;
    }

    public static void LIZLLL() {
        C20012713Sb c20012713SbLIZ;
        if (C13TD.LIZIZ) {
            return;
        }
        C13TD.LIZIZ = true;
        if (!C0C0Y.LIZ()) {
            C1490520otG.LJFF().LIZ();
            AFwS219S0000000_30 aFwS219S0000000_30 = AFwS219S0000000_30.get$arr$(221);
            if (C20008413Qk.LIZ) {
                C20008413Qk.LIZIZ.put("music", aFwS219S0000000_30);
                return;
            }
            return;
        }
        try {
            String strLIZ = C1490520otG.LJFF().LIZ();
            if (!C1487190ont.LIZ(strLIZ)) {
                C1487190ont.LIZIZ(strLIZ);
            }
            if (((Boolean) C1866290yfL.LIZ.getValue()).booleanValue()) {
                C20008513Ql.LIZ.getClass();
                IToolsDiskLruCacheInstance iToolsDiskLruCacheInstance = (IToolsDiskLruCacheInstance) PluggableExtentionKt.pluggableSpi$default(IToolsDiskLruCacheInstance.class, false, false, false, 14, null);
                C13S6 c13s6LIZ = null;
                if (iToolsDiskLruCacheInstance != null && iToolsDiskLruCacheInstance.LIZ() != null) {
                    IToolsDiskLruCacheInstance iToolsDiskLruCacheInstance2 = (IToolsDiskLruCacheInstance) PluggableExtentionKt.pluggableSpi$default(IToolsDiskLruCacheInstance.class, false, false, false, 14, null);
                    if (iToolsDiskLruCacheInstance2 != null && (c20012713SbLIZ = iToolsDiskLruCacheInstance2.LIZ()) != null) {
                        c13s6LIZ = c20012713SbLIZ.LIZ();
                    }
                    C13TD.LIZLLL = c13s6LIZ;
                    if (!C300100BpY.LIZ() || C0WKX.LJIIJJI) {
                        C201955140j.LIZIZ("ReuseCreationMusicUrlHook", "don't clear old keva map");
                        return;
                    }
                    C0WKX.LJIIJJI = true;
                    C201955140j.LIZIZ("ReuseCreationMusicUrlHook", "clear old keva map");
                    Keva.getRepo("music_repo").clear();
                    return;
                }
            }
            C13TD.LIZJ = new C0WKX(new C0VSJ(strLIZ), C0C64.LJIILLIIL().LJIJJLI(31744, 100L, "creative_tool_music_cache_threshold", true) * 1048576, C2428509fP.LIZ() ? new HashSet() : C13LP.LLIFFJFJJ(((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig().draftMusicList()));
            AFwS219S0000000_30 aFwS219S0000000_302 = AFwS219S0000000_30.get$arr$(220);
            if (C20008413Qk.LIZ) {
                C20008413Qk.LIZIZ.put("music", aFwS219S0000000_302);
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static C13TD LIZIZ() {
        LIZLLL();
        return new C13TD();
    }

    public static void LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add file to music cache, path = ");
        sbLIZ.append(str);
        sbLIZ.append(", musicId = ");
        sbLIZ.append(str2);
        C201955140j.LIZIZ("ReuseCreationMusicUrlHook", C2188811AlT.LIZIZ(sbLIZ));
        if (!C13TD.LIZIZ) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1304950k3x(str, str2, null), 3);
    }
}
