package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477750oYf implements ISimPlayerConfig {
    public final ISimPlayerConfig LIZ;

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void downloadFile(String str, String str2, String str3, String str4) {
        this.LIZ.downloadFile(str, str2, str3, "legacy_video_thumb");
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final int getAverageSpeedInKBps() {
        return this.LIZ.getAverageSpeedInKBps();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final InterfaceC1477850oYp getBindCpuCore() {
        return InterfaceC1477850oYp.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final C1480730odT getISimPlayerPlaySessionConfig(boolean z) {
        return this.LIZ.getISimPlayerPlaySessionConfig(z);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final C1480980ods getPlayerConfig(EnumC1479760obu enumC1479760obu, boolean z, boolean z2) {
        return this.LIZ.getPlayerConfig(enumC1479760obu, false, z2);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final EnumC2281141EQm getProperResolution(String str, InterfaceC1476900oXI interfaceC1476900oXI) {
        return this.LIZ.getProperResolution(str, interfaceC1476900oXI);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final SimVideoUrlModel getVideoPlayAddr(SimVideo simVideo, EnumC1479760obu enumC1479760obu) {
        return this.LIZ.getVideoPlayAddr(simVideo, enumC1479760obu);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isCache(SimVideoUrlModel simVideoUrlModel) {
        return this.LIZ.isCache(simVideoUrlModel);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final /* synthetic */ boolean isForceHdrOff() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isHttpsVideoUrlModel(SimVideoUrlModel simVideoUrlModel) {
        return this.LIZ.isHttpsVideoUrlModel(simVideoUrlModel);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isPluginApplied() {
        return this.LIZ.isPluginApplied();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final /* synthetic */ boolean perfEventEnabledInPlayRequest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void recordMiscLog(Context context, String str, JSONObject jSONObject) {
        this.LIZ.recordMiscLog(context, "video_playq", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final InterfaceC1477840oYo createAudioUrlProcessor() {
        InterfaceC1477840oYo interfaceC1477840oYoCreateAudioUrlProcessor = this.LIZ.createAudioUrlProcessor();
        if (interfaceC1477840oYoCreateAudioUrlProcessor != null) {
            return interfaceC1477840oYoCreateAudioUrlProcessor;
        }
        final ArrayList arrayList = new ArrayList();
        if (C582130MsN.LIZ().getConfig().getCommonConfig().getVideoUrlHooks() != null) {
            arrayList.addAll(C582130MsN.LIZ().getConfig().getCommonConfig().getVideoUrlHooks());
        }
        if (C582130MsN.LIZ().getConfig().getPreloaderExperiment().PreloadTypeExperiment() == C0NKF.VideoCache) {
            EnumC1477770oYh.VideoCache.call(new InterfaceC1481300oeO() { // from class: X.0oYm
                @Override // X.InterfaceC1481300oeO
                public final Object call() {
                    return Boolean.valueOf(arrayList.add(new C1477910oYv(C1478160oZK.LIZ())));
                }
            });
        } else {
            arrayList.add(new C1477900oYu(C1478160oZK.LIZ(), C582130MsN.LIZ().getConfig().getCommonConfig().getVideoUrlHookHook()));
        }
        final long defaultCDNTimeoutTime = C582130MsN.LIZ().getConfig().getCommonConfig().getDefaultCDNTimeoutTime();
        return new InterfaceC1477840oYo(arrayList, defaultCDNTimeoutTime) { // from class: X.0oX2
            public final long LIZ;
            public final List<InterfaceC1477240oXq> LIZIZ;
            public final boolean LIZJ;
            public final long LIZLLL;

            @Override // X.InterfaceC1477840oYo
            public final C1471970oPL LIZ(C1476750oX3 c1476750oX3) {
                int iIntValue;
                String languageCode;
                int iIntValue2;
                float fFloatValue;
                String urlKey;
                String format;
                if (c1476750oX3 == null) {
                    return null;
                }
                C1471970oPL c1471970oPL = new C1471970oPL();
                c1471970oPL.LIZ = 1;
                String volumeInfo = "";
                c1471970oPL.LIZIZ = "";
                if (c1476750oX3.getUrlList() != null && !c1476750oX3.getUrlList().isEmpty()) {
                    c1471970oPL.LIZIZ = ListProtector.get(c1476750oX3.getUrlList(), 0);
                    if (C1474810oTv.LLJZIJLIL()) {
                        c1471970oPL.LIZJ = (String[]) c1476750oX3.getUrlList().toArray(new String[0]);
                    }
                }
                if (c1476750oX3.getBitRate() != null) {
                    iIntValue = c1476750oX3.getBitRate().intValue();
                } else {
                    iIntValue = 0;
                }
                c1471970oPL.LIZLLL = iIntValue;
                if (c1476750oX3.getLanguageCode() == null) {
                    languageCode = "";
                } else {
                    languageCode = c1476750oX3.getLanguageCode();
                }
                c1471970oPL.LJ = languageCode;
                if (c1476750oX3.getInfoId() != null) {
                    iIntValue2 = c1476750oX3.getInfoId().intValue();
                } else {
                    iIntValue2 = -1;
                }
                c1471970oPL.LJFF = iIntValue2;
                float fFloatValue2 = 0.0f;
                if (c1476750oX3.getLoudness() != null) {
                    fFloatValue = c1476750oX3.getLoudness().floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                c1471970oPL.LJI = fFloatValue;
                if (c1476750oX3.getPeak() != null) {
                    fFloatValue2 = c1476750oX3.getPeak().floatValue();
                }
                c1471970oPL.LJII = fFloatValue2;
                if (c1476750oX3.getUrlKey() == null) {
                    urlKey = "";
                } else {
                    urlKey = c1476750oX3.getUrlKey();
                }
                c1471970oPL.LJIIIIZZ = urlKey;
                if (c1476750oX3.getFormat() == null) {
                    format = "";
                } else {
                    format = c1476750oX3.getFormat();
                }
                c1471970oPL.LJIIIZ = format;
                if (c1476750oX3.getVolumeInfo() != null) {
                    volumeInfo = c1476750oX3.getVolumeInfo();
                }
                c1471970oPL.LJIIJ = volumeInfo;
                c1471970oPL.LJIIJJI = false;
                return c1471970oPL;
            }

            @Override // X.InterfaceC1477840oYo
            public final C1471970oPL LIZIZ(C1476750oX3 c1476750oX3) {
                long jLongValue;
                Object obj;
                int iIntValue;
                String languageCode;
                int iIntValue2;
                float fFloatValue;
                String urlKey;
                String format;
                String str;
                if (c1476750oX3 == null || c1476750oX3.getUrlKey() == null || TextUtils.isEmpty(c1476750oX3.getUrlKey()) || c1476750oX3.getUrlList() == null || c1476750oX3.getUrlList().isEmpty()) {
                    return null;
                }
                C1476760oX4 c1476760oX4 = new C1476760oX4();
                c1476760oX4.LIZIZ = c1476750oX3.getUrlKey();
                c1476760oX4.LIZJ = c1476750oX3.getFileCheckSum();
                int size = c1476750oX3.getUrlList().size();
                String[] strArr = new String[size];
                c1476750oX3.getUrlList().toArray(strArr);
                long j = 0;
                if (c1476750oX3.getCdnUrlExpired() == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = c1476750oX3.getCdnUrlExpired().longValue();
                }
                long createTime = c1476750oX3.getCreateTime();
                if (C1480850odf.LIZJ.forceHttps()) {
                    for (int i = 0; i < size; i++) {
                        String strReplaceFirst = strArr[i];
                        if (strReplaceFirst != null && strReplaceFirst.startsWith("http") && !strReplaceFirst.startsWith("https")) {
                            strReplaceFirst = strReplaceFirst.replaceFirst("http", "https");
                        }
                        strArr[i] = strReplaceFirst;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                InterfaceC1484530ojb interfaceC1484530ojbLIZ = C582130MsN.LIZ();
                int i2 = 0;
                while (i2 < size) {
                    String str2 = strArr[i2];
                    if (str2 != null) {
                        if ((str2.contains("aweme/v1/play") || strArr[i2].contains("aweme/v2/play")) && interfaceC1484530ojbLIZ.getConfig().getCommonConfig().getCommonParamsProcessor() != null) {
                            interfaceC1484530ojbLIZ.getConfig().getCommonConfig().getCommonParamsProcessor();
                            arrayList2.add(C0XA0.LIZ(strArr[i2]));
                        } else if (jLongValue > j && this.LIZJ) {
                            if (System.currentTimeMillis() / 1000 < this.LIZLLL + jLongValue) {
                                arrayList2.add(strArr[i2]);
                            }
                        } else if (SystemClock.elapsedRealtime() - createTime < this.LIZ) {
                            arrayList2.add(strArr[i2]);
                        }
                    }
                    i2++;
                    j = 0;
                }
                c1476760oX4.LIZ = (String[]) arrayList2.toArray(new String[0]);
                C1477400oY6.LJJJJI.LJJIII(c1476760oX4.LIZIZ, c1476760oX4.LIZJ);
                C1471970oPL c1471970oPL = new C1471970oPL();
                C1478000oZ4 c1478000oZ4 = new C1478000oZ4(c1476750oX3, c1476760oX4.LIZIZ, c1476760oX4.LIZ);
                C1477210oXn c1477210oXnLIZJ = new C1477250oXr(this.LIZIZ, c1478000oZ4, 0).LIZJ(c1478000oZ4);
                c1471970oPL.LIZ = 1;
                String volumeInfo = "";
                if (c1477210oXnLIZJ != null && (str = c1477210oXnLIZJ.LIZIZ) != null) {
                    c1471970oPL.LIZIZ = str;
                } else {
                    c1471970oPL.LIZIZ = "";
                    if (c1476750oX3.getUrlList() != null && !c1476750oX3.getUrlList().isEmpty()) {
                        if (TextUtils.isEmpty((CharSequence) ListProtector.get(c1476750oX3.getUrlList(), 0))) {
                            obj = "";
                        } else {
                            obj = ListProtector.get(c1476750oX3.getUrlList(), 0);
                        }
                        c1471970oPL.LIZIZ = obj;
                    }
                }
                if (c1476750oX3.getUrlList() != null && !c1476750oX3.getUrlList().isEmpty() && C1474810oTv.LLJZIJLIL()) {
                    c1471970oPL.LIZJ = (String[]) c1476750oX3.getUrlList().toArray(new String[0]);
                }
                if (c1476750oX3.getBitRate() != null) {
                    iIntValue = c1476750oX3.getBitRate().intValue();
                } else {
                    iIntValue = 0;
                }
                c1471970oPL.LIZLLL = iIntValue;
                if (c1476750oX3.getLanguageCode() == null) {
                    languageCode = "";
                } else {
                    languageCode = c1476750oX3.getLanguageCode();
                }
                c1471970oPL.LJ = languageCode;
                if (c1476750oX3.getInfoId() != null) {
                    iIntValue2 = c1476750oX3.getInfoId().intValue();
                } else {
                    iIntValue2 = -1;
                }
                c1471970oPL.LJFF = iIntValue2;
                float fFloatValue2 = 0.0f;
                if (c1476750oX3.getLoudness() != null) {
                    fFloatValue = c1476750oX3.getLoudness().floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                c1471970oPL.LJI = fFloatValue;
                if (c1476750oX3.getPeak() != null) {
                    fFloatValue2 = c1476750oX3.getPeak().floatValue();
                }
                c1471970oPL.LJII = fFloatValue2;
                if (c1476750oX3.getUrlKey() == null) {
                    urlKey = "";
                } else {
                    urlKey = c1476750oX3.getUrlKey();
                }
                c1471970oPL.LJIIIIZZ = urlKey;
                if (c1476750oX3.getFormat() == null) {
                    format = "";
                } else {
                    format = c1476750oX3.getFormat();
                }
                c1471970oPL.LJIIIZ = format;
                if (c1476750oX3.getVolumeInfo() != null) {
                    volumeInfo = c1476750oX3.getVolumeInfo();
                }
                c1471970oPL.LJIIJ = volumeInfo;
                if (c1477210oXnLIZJ != null) {
                    c1471970oPL.LJIIJJI = c1477210oXnLIZJ.LIZLLL;
                }
                return c1471970oPL;
            }

            {
                this.LIZ = 2400000L;
                this.LIZIZ = ((ArrayList) arrayList).isEmpty() ? Collections.singletonList(InterfaceC1477240oXq.LIZ) : arrayList;
                this.LIZ = defaultCDNTimeoutTime;
                this.LIZJ = C582130MsN.LIZ().getConfig().getSimPlayerExperiment().enableCdnUrlExpiredExperiment();
                this.LIZLLL = C582130MsN.LIZ().getConfig().getSimPlayerExperiment().cdnUrlExpiredOffset();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final InterfaceC1478020oZ6 createSubUrlProcessor() {
        InterfaceC1478020oZ6 interfaceC1478020oZ6CreateSubUrlProcessor = this.LIZ.createSubUrlProcessor();
        if (interfaceC1478020oZ6CreateSubUrlProcessor != null) {
            return interfaceC1478020oZ6CreateSubUrlProcessor;
        }
        final ArrayList arrayList = new ArrayList();
        if (C582130MsN.LIZ().getConfig().getCommonConfig().getVideoUrlHooks() != null) {
            arrayList.addAll(C582130MsN.LIZ().getConfig().getCommonConfig().getVideoUrlHooks());
        }
        if (C582130MsN.LIZ().getConfig().getPreloaderExperiment().PreloadTypeExperiment() == C0NKF.VideoCache) {
            EnumC1477770oYh.VideoCache.call(new InterfaceC1481300oeO() { // from class: X.0oYl
                @Override // X.InterfaceC1481300oeO
                public final Object call() {
                    return Boolean.valueOf(arrayList.add(new C1477910oYv(C1478160oZK.LIZ())));
                }
            });
        } else {
            arrayList.add(new C1477900oYu(C1478160oZK.LIZ(), C582130MsN.LIZ().getConfig().getCommonConfig().getVideoUrlHookHook()));
        }
        final long defaultCDNTimeoutTime = C582130MsN.LIZ().getConfig().getCommonConfig().getDefaultCDNTimeoutTime();
        return new InterfaceC1478020oZ6(arrayList, defaultCDNTimeoutTime) { // from class: X.0oYr
            public final long LIZ;
            public final List<InterfaceC1477240oXq> LIZIZ;
            public final boolean LIZJ;
            public final long LIZLLL;

            {
                this.LIZ = 2400000L;
                this.LIZIZ = ((ArrayList) arrayList).isEmpty() ? Collections.singletonList(InterfaceC1477240oXq.LIZ) : arrayList;
                this.LIZ = defaultCDNTimeoutTime;
                this.LIZJ = C582130MsN.LIZ().getConfig().getSimPlayerExperiment().enableCdnUrlExpiredExperiment();
                this.LIZLLL = C582130MsN.LIZ().getConfig().getSimPlayerExperiment().cdnUrlExpiredOffset();
            }

            @Override // X.InterfaceC1478020oZ6
            public final C1477880oYs LIZ(String str, C1477890oYt c1477890oYt) {
                String str2;
                String str3;
                List<String> list;
                List<String> list2;
                if (c1477890oYt == null) {
                    return null;
                }
                if (TextUtils.isEmpty(c1477890oYt.url) && TextUtils.isEmpty(c1477890oYt.uri) && ((list2 = c1477890oYt.urlList) == null || list2.isEmpty())) {
                    return null;
                }
                C1478030oZ7 c1478030oZ7 = new C1478030oZ7();
                String.valueOf(c1477890oYt.subId);
                if (((Boolean) C1474810oTv.B2.getValue()).booleanValue() && (list = c1477890oYt.urlList) != null && !list.isEmpty()) {
                    String[] strArr = new String[c1477890oYt.urlList.size()];
                    c1477890oYt.urlList.toArray(strArr);
                    c1478030oZ7.LIZ = strArr;
                } else {
                    String[] strArr2 = {c1477890oYt.url};
                    long j = c1477890oYt.createTime;
                    long j2 = c1477890oYt.expire;
                    if (C1480850odf.LIZJ.forceHttps()) {
                        String strReplaceFirst = strArr2[0];
                        if (strReplaceFirst != null && strReplaceFirst.startsWith("http") && !strReplaceFirst.startsWith("https")) {
                            strReplaceFirst = strReplaceFirst.replaceFirst("http", "https");
                        }
                        strArr2[0] = strReplaceFirst;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    InterfaceC1484530ojb interfaceC1484530ojbLIZ = C582130MsN.LIZ();
                    String str4 = strArr2[0];
                    if (str4 != null) {
                        if ((str4.contains("aweme/v1/play") || strArr2[0].contains("aweme/v2/play")) && interfaceC1484530ojbLIZ.getConfig().getCommonConfig().getCommonParamsProcessor() != null) {
                            interfaceC1484530ojbLIZ.getConfig().getCommonConfig().getCommonParamsProcessor();
                            arrayList2.add(C0XA0.LIZ(strArr2[0]));
                        } else if (j2 > 0 && this.LIZJ) {
                            if (System.currentTimeMillis() / 1000 < this.LIZLLL + j2) {
                                arrayList2.add(strArr2[0]);
                            }
                        } else if (SystemClock.elapsedRealtime() - j < this.LIZ) {
                            arrayList2.add(strArr2[0]);
                        }
                    }
                    c1478030oZ7.LIZ = (String[]) arrayList2.toArray(new String[0]);
                }
                C1477880oYs c1477880oYs = new C1477880oYs();
                C1478010oZ5 c1478010oZ5 = new C1478010oZ5(c1477890oYt, c1478030oZ7.LIZ, str);
                C1477210oXn c1477210oXnLIZIZ = new C1477250oXr(this.LIZIZ, c1478010oZ5, 0).LIZIZ(c1478010oZ5);
                c1477880oYs.LIZ = c1477890oYt.id;
                c1477880oYs.LIZIZ = c1477890oYt.lang;
                c1477880oYs.LIZJ = c1477890oYt.languageId;
                if (c1477210oXnLIZIZ != null && (str3 = c1477210oXnLIZIZ.LIZIZ) != null) {
                    c1477880oYs.LIZLLL = str3;
                } else {
                    if (!TextUtils.isEmpty(c1477890oYt.url)) {
                        str2 = c1477890oYt.url;
                    } else {
                        str2 = "";
                    }
                    c1477880oYs.LIZLLL = str2;
                }
                c1477880oYs.LJ = c1477890oYt.expire;
                c1477880oYs.LJFF = c1477890oYt.captionFormat;
                c1477880oYs.LJI = c1477890oYt.subId;
                return c1477880oYs;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final InterfaceC1475250oUd createVideoUrlProcessor() {
        InterfaceC1475250oUd interfaceC1475250oUdCreateVideoUrlProcessor = this.LIZ.createVideoUrlProcessor();
        return interfaceC1475250oUdCreateVideoUrlProcessor != null ? interfaceC1475250oUdCreateVideoUrlProcessor : C1477740oYe.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean enableByteVc1FailCheckCountPolicy() {
        return this.LIZ.enableByteVc1FailCheckCountPolicy();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean enableForceUseH264CheckPolicy() {
        return this.LIZ.enableForceUseH264CheckPolicy();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean enableForceUseH264Global() {
        return this.LIZ.enableForceUseH264Global();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final int getPlayerType() {
        return this.LIZ.getPlayerType();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final InterfaceC1483040ohC getPreRenderConfig() {
        return this.LIZ.getPreRenderConfig();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final int getTTPlayerPlan() {
        return this.LIZ.getTTPlayerPlan();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isPlayerPreferchTtsAudio() {
        return this.LIZ.isPlayerPreferchTtsAudio();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean perfEventEnabled() {
        return this.LIZ.perfEventEnabled();
    }

    public C1477750oYf(ISimPlayerConfig iSimPlayerConfig) {
        this.LIZ = iSimPlayerConfig;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean disableSleepResume(String str) {
        return this.LIZ.disableSleepResume(str);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean enableFileIoOpt(String str) {
        return this.LIZ.enableFileIoOpt(str);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final String getThumbCacheDir(Context context) {
        return this.LIZ.getThumbCacheDir(context);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final C1477160oXi getProcessUrlData(SimVideoUrlModel simVideoUrlModel, String str) {
        SimBitRate simBitRate = null;
        if (simVideoUrlModel == null) {
            return null;
        }
        if (((Boolean) C1474810oTv.LLJJIJIIJIL.getValue()).booleanValue() && C1474930oU7.LJII && !C1474930oU7.LJIIIIZZ) {
            C1478160oZK.LIZ().LJIJJLI();
        }
        InterfaceC1482870ogv interfaceC1482870ogvLIZ = C1478160oZK.LIZ();
        if (interfaceC1482870ogvLIZ != null && simVideoUrlModel.getBitRate() != null && simVideoUrlModel.getBitRate().size() != 0 && !TextUtils.isEmpty(str)) {
            Iterator<SimBitRate> it2 = simVideoUrlModel.getBitRate().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SimBitRate next = it2.next();
                if (interfaceC1482870ogvLIZ.LJJIIJ(next.getUrlKey(), str) > 0) {
                    simBitRate = next;
                    break;
                }
            }
        }
        C1477160oXi c1477160oXi = new C1477160oXi();
        if (simBitRate != null && !TextUtils.isEmpty(simBitRate.getUrlKey()) && simBitRate.urlList() != null && simBitRate.urlList().size() > 0) {
            c1477160oXi.LIZ = ListProtector.get(simBitRate.urlList(), 0);
            c1477160oXi.LJFF = simBitRate.getUrlKey();
            c1477160oXi.LJI = simBitRate.getChecksum();
            c1477160oXi.LJIJJLI = new String[simBitRate.urlList().size()];
            simBitRate.urlList().toArray(c1477160oXi.LJIJJLI);
            c1477160oXi.LIZJ = simBitRate.getCodecType();
            c1477160oXi.LIZLLL = new C1478290oZX(simBitRate.getBitRate(), simBitRate.getGearName(), simBitRate.getQualityType(), simBitRate.isBytevc1(), simBitRate.getUrlKey(), simBitRate.urlList(), simBitRate.getChecksum(), simBitRate.getSize(), simBitRate.getSimVideoExtra(), simBitRate.getHdrType(), simBitRate.getHdrBit(), simBitRate.getVideoWidth(), simBitRate.getVideoHeight());
            return c1477160oXi;
        }
        c1477160oXi.LJFF = simVideoUrlModel.getUrlKey();
        c1477160oXi.LJI = simVideoUrlModel.getFileCheckSum();
        c1477160oXi.LJIJJLI = new String[simVideoUrlModel.getUrlList().size()];
        simVideoUrlModel.getUrlList().toArray(c1477160oXi.LJIJJLI);
        c1477160oXi.LIZJ = simVideoUrlModel.getCodecType();
        c1477160oXi.LIZ = ListProtector.get(simVideoUrlModel.getUrlList(), 0);
        c1477160oXi.LIZLLL = new C1478290oZX((int) simVideoUrlModel.getSize(), "", -1, simVideoUrlModel.getCodecType(), simVideoUrlModel.getUrlKey(), simVideoUrlModel.getUrlList(), simVideoUrlModel.getFileCheckSum(), (int) simVideoUrlModel.getSize(), null, -1, -1, simVideoUrlModel.getWidth(), simVideoUrlModel.getHeight());
        return c1477160oXi;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isCacheAboveOrComplete(SimVideoUrlModel simVideoUrlModel, int i) {
        return this.LIZ.isCacheAboveOrComplete(simVideoUrlModel, i);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final C1477160oXi getDashProcessUrlData(String str, boolean z, long j) {
        int iLIZLLL;
        C1477160oXi c1477160oXi = new C1477160oXi();
        InterfaceC1477050oXX superResolutionStrategy = C582130MsN.LIZ().getConfig().getCommonConfig().getSuperResolutionStrategy();
        if (z && superResolutionStrategy != null) {
            iLIZLLL = superResolutionStrategy.LIZLLL(1.0f, 0, 0, 0, j, null, null, str, "", true);
            if (iLIZLLL == 100) {
                c1477160oXi.LJIIJ = true;
            }
        } else {
            iLIZLLL = 1;
        }
        Session sessionLJIIIZ = C1477400oY6.LJJJJI.LJIIIZ(str);
        if (sessionLJIIIZ != null) {
            boolean z2 = c1477160oXi.LJIIJ;
            if (z2) {
                iLIZLLL = 100;
            }
            sessionLJIIIZ.bizSRStrategyStatus = iLIZLLL;
            sessionLJIIIZ.isOpenSuperResolution = z2;
        }
        return c1477160oXi;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void onRecordFirstFrameTime(String str, long j, String str2, boolean z, int i) {
        this.LIZ.onRecordFirstFrameTime(str, j, str2, z, i);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void onRecordPrepareTime(String str, long j, String str2, boolean z, int i) {
        this.LIZ.onRecordPrepareTime(str, j, str2, z, i);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void onRecordFirstFrameTime(String str, long j, String str2, boolean z, boolean z2) {
        this.LIZ.onRecordFirstFrameTime(str, j, str2, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void onRecordPrepareTime(String str, long j, String str2, boolean z, boolean z2) {
        this.LIZ.onRecordPrepareTime(str, j, str2, z, z2);
    }
}
