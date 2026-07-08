package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadSettingConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.service.INetworkDebugService;
import com.ss.android.ugc.aweme.settings.StudioVideoUpload1001TimeoutAB;
import com.ss.bduploader.BDUploadResolver;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.net.HTTPDNS;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1BbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207951BbF extends C09AY implements Function1<BDVideoUploader, Unit> {
    public final /* synthetic */ C2208141BbY LL;
    public final /* synthetic */ STSAuthConfig LLILLJJLI;
    public final /* synthetic */ UploadVideoConfig LLILLL;
    public final /* synthetic */ UploadAuthKeyConfig LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2207951BbF(C2208141BbY c2208141BbY, STSAuthConfig sTSAuthConfig, UploadVideoConfig uploadVideoConfig, UploadAuthKeyConfig uploadAuthKeyConfig, Map<String, String> map) {
        super(1);
        this.LL = c2208141BbY;
        this.LLILLJJLI = sTSAuthConfig;
        this.LLILLL = uploadVideoConfig;
        this.LLILZ = uploadAuthKeyConfig;
        this.LLILZIL = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BDVideoUploader bDVideoUploader) {
        BDVideoUploader bDVideoUploader2 = this.LL.LJ;
        BDVideoUploader bDVideoUploader3 = null;
        if (bDVideoUploader2 == null) {
            bDVideoUploader2 = null;
        }
        bDVideoUploader2.setTopAccessKey(this.LLILLJJLI.accessKeyId);
        BDVideoUploader bDVideoUploader4 = this.LL.LJ;
        if (bDVideoUploader4 == null) {
            bDVideoUploader4 = null;
        }
        bDVideoUploader4.setTopSecretKey(this.LLILLJJLI.secretAccessKey);
        BDVideoUploader bDVideoUploader5 = this.LL.LJ;
        if (bDVideoUploader5 == null) {
            bDVideoUploader5 = null;
        }
        bDVideoUploader5.setTopSessionToken(this.LLILLJJLI.sessionToken);
        BDVideoUploader bDVideoUploader6 = this.LL.LJ;
        if (bDVideoUploader6 == null) {
            bDVideoUploader6 = null;
        }
        bDVideoUploader6.setSpaceName(this.LLILLJJLI.spaceName);
        BDVideoUploader bDVideoUploader7 = this.LL.LJ;
        if (bDVideoUploader7 == null) {
            bDVideoUploader7 = null;
        }
        bDVideoUploader7.setTTNetEngineFallbackOption(0);
        BDVideoUploader bDVideoUploader8 = this.LL.LJ;
        if (bDVideoUploader8 == null) {
            bDVideoUploader8 = null;
        }
        bDVideoUploader8.setEnableLogCallBack(this.LLILLL.enableTTUploaderLogCallback);
        BDVideoUploader bDVideoUploader9 = this.LL.LJ;
        if (bDVideoUploader9 == null) {
            bDVideoUploader9 = null;
        }
        bDVideoUploader9.setMaxFailTime(this.LLILLL.maxFailTime);
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("default slice size = ");
        sbLIZ.append(this.LLILLL.sliceSize);
        C201955140j.LIZLLL(c830690WiJ, "UploadSmartSlice", C2188811AlT.LIZIZ(sbLIZ));
        int i = this.LLILLL.sliceSize;
        if (i <= 0) {
            BDVideoUploader bDVideoUploader10 = this.LL.LJ;
            if (bDVideoUploader10 == null) {
                bDVideoUploader10 = null;
            }
            bDVideoUploader10.setSliceSize(524288);
        } else {
            BDVideoUploader bDVideoUploader11 = this.LL.LJ;
            if (bDVideoUploader11 == null) {
                bDVideoUploader11 = null;
            }
            bDVideoUploader11.setSliceSize(i);
        }
        BDVideoUploader bDVideoUploader12 = this.LL.LJ;
        if (bDVideoUploader12 == null) {
            bDVideoUploader12 = null;
        }
        bDVideoUploader12.setUploadDomain(this.LLILLL.videoHostName);
        BDVideoUploader bDVideoUploader13 = this.LL.LJ;
        if (bDVideoUploader13 == null) {
            bDVideoUploader13 = null;
        }
        bDVideoUploader13.setRWTimeout(this.LLILLL.sliceTimeout);
        BDVideoUploader bDVideoUploader14 = this.LL.LJ;
        if (bDVideoUploader14 == null) {
            bDVideoUploader14 = null;
        }
        bDVideoUploader14.setSliceReTryCount(this.LLILLL.sliceRetryCount);
        BDVideoUploader bDVideoUploader15 = this.LL.LJ;
        if (bDVideoUploader15 == null) {
            bDVideoUploader15 = null;
        }
        bDVideoUploader15.setFileRetryCount(this.LLILLL.fileRetryCount);
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_uploader_file_retry_count", true);
        if (iLJIJ > 0) {
            BDVideoUploader bDVideoUploader16 = this.LL.LJ;
            if (bDVideoUploader16 == null) {
                bDVideoUploader16 = null;
            }
            bDVideoUploader16.setFileRetryCount(iLJIJ);
        }
        BDVideoUploader bDVideoUploader17 = this.LL.LJ;
        if (bDVideoUploader17 == null) {
            bDVideoUploader17 = null;
        }
        bDVideoUploader17.setSocketNum(1);
        BDVideoUploader bDVideoUploader18 = this.LL.LJ;
        if (bDVideoUploader18 == null) {
            bDVideoUploader18 = null;
        }
        bDVideoUploader18.setAliveMaxFailTime(this.LLILLL.aliveMaxFailTime);
        BDVideoUploader bDVideoUploader19 = this.LL.LJ;
        if (bDVideoUploader19 == null) {
            bDVideoUploader19 = null;
        }
        bDVideoUploader19.setTcpOpenTimeOutMilliSec(this.LLILLL.openTimeOut);
        BDVideoUploader bDVideoUploader20 = this.LL.LJ;
        if (bDVideoUploader20 == null) {
            bDVideoUploader20 = null;
        }
        bDVideoUploader20.setResponseTimeOut(C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_uploader_response_time_out", true));
        BDVideoUploader bDVideoUploader21 = this.LL.LJ;
        if (bDVideoUploader21 == null) {
            bDVideoUploader21 = null;
        }
        bDVideoUploader21.setEnableExternDNS(this.LLILLL.enableExternDNS);
        int iLJIJ2 = C0C64.LJIILLIIL().LJIJ(31744, 0, "tool_upload_sdk_max_speed_thres", true);
        if (iLJIJ2 > 0) {
            BDVideoUploader bDVideoUploader22 = this.LL.LJ;
            if (bDVideoUploader22 == null) {
                bDVideoUploader22 = null;
            }
            bDVideoUploader22.setMaxUploadSpeedThresh(iLJIJ2);
        }
        BDUploadResolver.setEnableTTNetDNS(this.LLILLL.enableTTNetDNS);
        C2208141BbY c2208141BbY = this.LL;
        UploadSettingConfig uploadSettingConfig = this.LLILZ.uploadSettingConfig;
        c2208141BbY.getClass();
        if (uploadSettingConfig != null) {
            BDUploadResolver.setDNSType(uploadSettingConfig.dnsVersion, uploadSettingConfig.dnsMainType, uploadSettingConfig.dnsBackType, uploadSettingConfig.dnsBackupUsedDelayTime, uploadSettingConfig.dnsExpiredTime);
            HTTPDNS.setDNSServerHost(uploadSettingConfig.dnsOwnServer, uploadSettingConfig.dnsGoogleServer);
        }
        BDVideoUploader bDVideoUploader23 = this.LL.LJ;
        if (bDVideoUploader23 == null) {
            bDVideoUploader23 = null;
        }
        UploadVideoConfig uploadVideoConfig = this.LLILLL;
        C2208411Bbz c2208411Bbz = new C2208411Bbz();
        c2208411Bbz.LIZ(uploadVideoConfig);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c2208411Bbz.LIZLLL());
        sbLIZ2.append(C0BZ9.LIZ());
        bDVideoUploader23.setServerParameter(C2188811AlT.LIZIZ(sbLIZ2));
        BDVideoUploader bDVideoUploader24 = this.LL.LJ;
        if (bDVideoUploader24 == null) {
            bDVideoUploader24 = null;
        }
        bDVideoUploader24.setEnableHttps(this.LLILLL.enableHttps);
        C2208141BbY c2208141BbY2 = this.LL;
        c2208141BbY2.getClass();
        if (((Boolean) C262870ARx.LIZ.getValue()).booleanValue()) {
            BDVideoUploader bDVideoUploader25 = c2208141BbY2.LJ;
            if (bDVideoUploader25 == null) {
                bDVideoUploader25 = null;
            }
            bDVideoUploader25.setHeartBeatOption(1, ((Number) C0ARZ.LIZ.getValue()).intValue());
        }
        if (((Boolean) C0ARX.LIZ.getValue()).booleanValue()) {
            BDVideoUploader bDVideoUploader26 = c2208141BbY2.LJ;
            if (bDVideoUploader26 == null) {
                bDVideoUploader26 = null;
            }
            bDVideoUploader26.setHeartBeatErrorInfoOption(1);
        }
        if (((Boolean) C262640ARa.LIZ.getValue()).booleanValue()) {
            BDVideoUploader bDVideoUploader27 = c2208141BbY2.LJ;
            if (bDVideoUploader27 == null) {
                bDVideoUploader27 = null;
            }
            bDVideoUploader27.setInternalErrorInfoEventOption(1);
        }
        BDVideoUploader bDVideoUploader28 = c2208141BbY2.LJ;
        if (bDVideoUploader28 == null) {
            bDVideoUploader28 = null;
        }
        bDVideoUploader28.setGeneralOption(((Number) C0ARU.LIZ.getValue()).intValue());
        C2208141BbY c2208141BbY3 = this.LL;
        c2208141BbY3.getClass();
        C0CHQ.LIZ().getApplicationService();
        boolean zLJFF = C19221910Hx.LJFF();
        BDVideoUploader bDVideoUploader29 = c2208141BbY3.LJ;
        if (bDVideoUploader29 == null) {
            bDVideoUploader29 = null;
        }
        bDVideoUploader29.setOpenBoe(zLJFF);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("BDVideoUploader enableBoe:");
        sbLIZ3.append(zLJFF);
        C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ3));
        C2208141BbY c2208141BbY4 = this.LL;
        Map<String, String> map = this.LLILZIL;
        c2208141BbY4.getClass();
        TreeMap<String, Object> treeMap = new TreeMap<>();
        C1430780nKu.LIZ();
        INetworkDebugService iNetworkDebugService = (INetworkDebugService) ServiceManager.get().getService(INetworkDebugService.class);
        if (iNetworkDebugService != null) {
            iNetworkDebugService.LIZIZ();
        }
        treeMap.putAll(map);
        BDVideoUploader bDVideoUploader30 = c2208141BbY4.LJ;
        if (bDVideoUploader30 == null) {
            bDVideoUploader30 = null;
        }
        bDVideoUploader30.setCustomHttpHeaders(treeMap);
        C2208141BbY c2208141BbY5 = this.LL;
        UploadVideoConfig uploadVideoConfig2 = this.LLILLL;
        c2208141BbY5.getClass();
        int i2 = uploadVideoConfig2.mainNetworkType;
        C1462550oA9.LIZIZ(i2);
        int i3 = uploadVideoConfig2.backupNetworkType;
        C1462550oA9.LIZIZ(i3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("mainNetworkType=");
        sbLIZ4.append(i2);
        sbLIZ4.append(", backupNetworkType=");
        sbLIZ4.append(i3);
        C201955140j.LIZLLL(c830690WiJ, "AbstractPublishUploader", C2188811AlT.LIZIZ(sbLIZ4));
        Integer numValueOf = Integer.valueOf(((Number) C0AU2.LIZ.getValue()).intValue());
        if (numValueOf.intValue() >= 0) {
            int iIntValue = numValueOf.intValue();
            BDVideoUploader bDVideoUploader31 = c2208141BbY5.LJ;
            if (bDVideoUploader31 == null) {
                bDVideoUploader31 = null;
            }
            bDVideoUploader31.setHttpRequestPriority(iIntValue);
        }
        BDVideoUploader bDVideoUploader32 = c2208141BbY5.LJ;
        if (bDVideoUploader32 == null) {
            bDVideoUploader32 = null;
        }
        bDVideoUploader32.setNetworkType(403, i2);
        BDVideoUploader bDVideoUploader33 = c2208141BbY5.LJ;
        if (bDVideoUploader33 == null) {
            bDVideoUploader33 = null;
        }
        bDVideoUploader33.setNetworkType(404, i3);
        if (uploadVideoConfig2.enableQuic == 1) {
            BDVideoUploader bDVideoUploader34 = c2208141BbY5.LJ;
            if (bDVideoUploader34 == null) {
                bDVideoUploader34 = null;
            }
            bDVideoUploader34.setDataTransportProtocol(2);
        } else {
            BDVideoUploader bDVideoUploader35 = c2208141BbY5.LJ;
            if (bDVideoUploader35 == null) {
                bDVideoUploader35 = null;
            }
            bDVideoUploader35.setDataTransportProtocol(0);
        }
        C2208141BbY c2208141BbY6 = this.LL;
        c2208141BbY6.getClass();
        StudioVideoUpload1001TimeoutAB.LIZ.getClass();
        StudioVideoUpload1001TimeoutAB.Config config = (StudioVideoUpload1001TimeoutAB.Config) StudioVideoUpload1001TimeoutAB.LIZJ.getValue();
        int i4 = config.fileUploadApplyPhaseSocketConnTimeout;
        int i5 = config.fileUploadApplyPhaseSocketReadTimeout;
        int i6 = config.fileUploadApplyPhaseSocketWriteTimeout;
        int i7 = config.fileUploadApplyPhaseTotalRequestTimeout;
        if (i4 > 0 && i5 > 0 && i6 > 0 && i7 > 0) {
            BDVideoUploader bDVideoUploader36 = c2208141BbY6.LJ;
            if (bDVideoUploader36 == null) {
                bDVideoUploader36 = null;
            }
            bDVideoUploader36.setCustomApplyPhaseTimeoutParams(i4, i5, i6, i7);
        }
        C2208141BbY c2208141BbY7 = this.LL;
        c2208141BbY7.getClass();
        if (C297790Blp.LIZ()) {
            BDVideoUploader bDVideoUploader37 = c2208141BbY7.LJ;
            if (bDVideoUploader37 == null) {
                bDVideoUploader37 = null;
            }
            bDVideoUploader37.setDiskResumeOption(1);
        } else {
            BDVideoUploader bDVideoUploader38 = c2208141BbY7.LJ;
            if (bDVideoUploader38 == null) {
                bDVideoUploader38 = null;
            }
            bDVideoUploader38.setDiskResumeOption(0);
        }
        C2208141BbY c2208141BbY8 = this.LL;
        BDVideoUploader bDVideoUploader39 = c2208141BbY8.LJ;
        if (bDVideoUploader39 == null) {
            bDVideoUploader39 = null;
        }
        bDVideoUploader39.setSDKRetryCallbackOption(((Number) C0AS2.LIZ.getValue()).intValue());
        BDVideoUploader bDVideoUploader40 = c2208141BbY8.LJ;
        if (bDVideoUploader40 == null) {
            bDVideoUploader40 = null;
        }
        bDVideoUploader40.setSimpleRequestConfigOption(((Number) C0AS5.LIZ.getValue()).intValue());
        C2208141BbY c2208141BbY9 = this.LL;
        c2208141BbY9.getClass();
        if (((Boolean) C262730ARj.LIZ.getValue()).booleanValue()) {
            C01GW c01gw = C115400cC.LIZIZ;
            if (!((Set) c01gw.getValue()).isEmpty()) {
                String strLJJLIIIJ = C13LP.LJJLIIIJ((Set) c01gw.getValue(), ",", null, null, 0, null, null, 62);
                BDVideoUploader bDVideoUploader41 = c2208141BbY9.LJ;
                if (bDVideoUploader41 == null) {
                    bDVideoUploader41 = null;
                }
                bDVideoUploader41.setTTNetForbidOption(1, strLJJLIIIJ);
            }
        }
        C01GW c01gw2 = C0BW0.LIZ;
        if (((Number) c01gw2.getValue()).intValue() != 0) {
            BDVideoUploader bDVideoUploader42 = c2208141BbY9.LJ;
            if (bDVideoUploader42 == null) {
                bDVideoUploader42 = null;
            }
            bDVideoUploader42.setNoNetBlockOption(((Number) c01gw2.getValue()).intValue());
        }
        BDVideoUploader bDVideoUploader43 = this.LL.LJ;
        if (bDVideoUploader43 != null) {
            bDVideoUploader3 = bDVideoUploader43;
        }
        bDVideoUploader3.setStarshipOption(((Number) C266660Aci.LIZ.getValue()).intValue());
        this.LL.LIZIZ = true;
        return Unit.LIZ;
    }
}
