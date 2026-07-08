package X;

import android.os.Build;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloaderParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DrQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2268941DrQ {
    public static final C2268941DrQ LIZ = new C2268941DrQ();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static TemplateSourceConfig LIZLLL = new C2269721Dsg().LIZ();
    public static final Map<EnumC539100LCi, NLEModelDownloader> LJ = new LinkedHashMap();

    public static NLEModelDownloaderParams LIZJ(TemplateSourceConfig templateSourceConfig) {
        NLEModelDownloaderParams nLEModelDownloaderParams = new NLEModelDownloaderParams(templateSourceConfig.appID, templateSourceConfig.appVersion, templateSourceConfig.effectSdkVersion, templateSourceConfig.accessKey, "android", templateSourceConfig.deviceId, Build.MODEL, templateSourceConfig.region, templateSourceConfig.appLanguage, templateSourceConfig.effectCacheDir, templateSourceConfig.effectHost, templateSourceConfig.effectModelCacheDir, templateSourceConfig.artistHost, templateSourceConfig.artistCacheDir, templateSourceConfig.imuseCacheDir, templateSourceConfig.imuseHost, "720", true, "760.0.2.0", templateSourceConfig.isEpRequest);
        nLEModelDownloaderParams.addMusicParams(templateSourceConfig.musicHost, templateSourceConfig.musicCacheDir, templateSourceConfig.appID);
        nLEModelDownloaderParams.setMaterialResourceAccessKey(templateSourceConfig.materialResourceAccessKey);
        nLEModelDownloaderParams.setMaterialResourceAppId(templateSourceConfig.materialResourceAppId);
        nLEModelDownloaderParams.setMaterialResourceAppVersion(templateSourceConfig.materialResourceAppVersion);
        nLEModelDownloaderParams.setMaterialResourceAppName(templateSourceConfig.materialResourceAppName);
        nLEModelDownloaderParams.setAc(templateSourceConfig.ac);
        nLEModelDownloaderParams.setUid(templateSourceConfig.uid);
        nLEModelDownloaderParams.setMaterialResourceStatus(templateSourceConfig.materialResourceStatus);
        nLEModelDownloaderParams.setMaterialResourceTag(templateSourceConfig.materialResourceTag);
        nLEModelDownloaderParams.setMaterialResourceHost(templateSourceConfig.materialResourceHost);
        nLEModelDownloaderParams.setMaterialResourceCache(templateSourceConfig.materialResourceCache);
        return nLEModelDownloaderParams;
    }

    public final synchronized NLEModelDownloader LIZ(EnumC539100LCi enumC539100LCi) {
        NLEModelDownloader nLEModelDownloader;
        Map<EnumC539100LCi, NLEModelDownloader> map = LJ;
        nLEModelDownloader = (NLEModelDownloader) ((LinkedHashMap) map).get(enumC539100LCi);
        if (nLEModelDownloader == null) {
            nLEModelDownloader = new NLEModelDownloader();
            NLETemplateSource.LJIIIIZZ.initNLEModelDownloader(C14LJ.LIZLLL(nLEModelDownloader), C14LJ.LIZLLL(LIZJ(LIZLLL)));
            map.put(enumC539100LCi, nLEModelDownloader);
        }
        return nLEModelDownloader;
    }

    public final synchronized void LIZIZ(Function0<TemplateSourceConfig> function0) {
        TemplateSourceConfig templateSourceConfigInvoke = function0.invoke();
        LIZLLL = templateSourceConfigInvoke;
        LIZIZ = templateSourceConfigInvoke.templateCacheDir;
        LIZJ = templateSourceConfigInvoke.mediaCacheDir;
    }
}
