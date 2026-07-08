package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.ss.mediakit.net.AVMDLDNSParser;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0oVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476090oVz {
    public static void LIZ(int i, int i2, DataLoaderHelper dataLoaderHelper) {
        dataLoaderHelper.LJJ.LIZJ(1);
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setIntValue key = ");
        sbLIZ.append(i);
        sbLIZ.append(", value = ");
        sbLIZ.append(i2);
        TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
        try {
            try {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i != 7) {
                                        if (i != 8) {
                                            if (i != 9) {
                                                if (i != 55) {
                                                    if (i != 56) {
                                                        if (i != 60) {
                                                            if (i != 61) {
                                                                if (i != 100) {
                                                                    if (i != 101) {
                                                                        switch (i) {
                                                                            case BdTuring.TYPE_EMAIL /* 11 */:
                                                                                dataLoaderHelper.LJIIIZ.mPreloadParallelNum = i2;
                                                                                AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIIZZ;
                                                                                if (aVMDLDataLoader != null) {
                                                                                    aVMDLDataLoader.setIntValue(102, i2);
                                                                                }
                                                                                break;
                                                                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                                                if (i2 >= 100) {
                                                                                    AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure = dataLoaderHelper.LJIIIZ;
                                                                                    dataLoaderHelper.LJJIZ = aVMDLDataLoaderConfigure.mPreloadStrategy;
                                                                                    aVMDLDataLoaderConfigure.mPreloadStrategy = 100;
                                                                                } else {
                                                                                    AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure2 = dataLoaderHelper.LJIIIZ;
                                                                                    dataLoaderHelper.LJJIZ = aVMDLDataLoaderConfigure2.mPreloadStrategy;
                                                                                    aVMDLDataLoaderConfigure2.mPreloadStrategy = i2;
                                                                                }
                                                                                dataLoaderHelper.LJJIL = i2;
                                                                                if (i2 == 200) {
                                                                                    dataLoaderHelper.LJIIIZ.mEnableIOManager = 1;
                                                                                }
                                                                                break;
                                                                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                                                dataLoaderHelper.LJIIIZ.mCheckSumLevel = i2;
                                                                                break;
                                                                            case 14:
                                                                                dataLoaderHelper.LJIIIZ.mTestSpeedTypeVersion = i2;
                                                                                break;
                                                                            case 15:
                                                                                dataLoaderHelper.LJIILL = i2;
                                                                                break;
                                                                            default:
                                                                                if (i != 112) {
                                                                                    if (i != 113) {
                                                                                        boolean z = false;
                                                                                        switch (i) {
                                                                                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                                                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                                                sbLIZ2.append("set write file notify intervalMS ");
                                                                                                sbLIZ2.append(i2);
                                                                                                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                                                                                                dataLoaderHelper.LJIIIZ.mWriteFileNotifyIntervalMS = i2;
                                                                                                break;
                                                                                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                                                                            case 19:
                                                                                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                                                                            case 1155:
                                                                                            case 2037:
                                                                                            case 9000:
                                                                                            case 9030:
                                                                                            case 12002:
                                                                                                break;
                                                                                            case 21:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableDownloaderLog = i2;
                                                                                                break;
                                                                                            case 22:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableTTNetLoader = i2;
                                                                                                break;
                                                                                            case 23:
                                                                                                dataLoaderHelper.LJIIIZ.mTTNetLoaderCronetBufSizeKB = i2;
                                                                                                break;
                                                                                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableTTQuicHeLoader = i2;
                                                                                                break;
                                                                                            case 25:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableTTQuicHeLoaderCheckWithNetworkType = i2;
                                                                                                break;
                                                                                            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                                                                                                dataLoaderHelper.LJIIIZ.mIsCloseFileCache = i2;
                                                                                                break;
                                                                                            case 80:
                                                                                                dataLoaderHelper.LJIIIZ.mPreloadWaitListType = i2;
                                                                                                break;
                                                                                            case 119:
                                                                                                C1309100kAe c1309100kAeLJ = C1309100kAe.LJ();
                                                                                                c1309100kAeLJ.LJFF = i2;
                                                                                                if (C1308970kAR.LIZJ != null) {
                                                                                                    c1309100kAeLJ.LIZIZ();
                                                                                                    c1309100kAeLJ.LJFF();
                                                                                                }
                                                                                                break;
                                                                                            case 121:
                                                                                                dataLoaderHelper.LJIIIZ.mUseNewSpeedTestForSingle = i2;
                                                                                                break;
                                                                                            case 123:
                                                                                                if (i2 > 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mDeviceScoreEx = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 200:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableEventInfo = i2;
                                                                                                break;
                                                                                            case 1115:
                                                                                                dataLoaderHelper.LJIIIZ.mMaxIPV6Num = i2;
                                                                                                break;
                                                                                            case 1116:
                                                                                                dataLoaderHelper.LJIIIZ.mMaxIPV4Num = i2;
                                                                                                break;
                                                                                            case 1117:
                                                                                                dataLoaderHelper.LJIIIZ.mForbidByPassCookie = i2;
                                                                                                break;
                                                                                            case 1118:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableLazyBufferpool = i2;
                                                                                                break;
                                                                                            case 1119:
                                                                                                dataLoaderHelper.LJIIIZ.mSessionTimeout = i2;
                                                                                                break;
                                                                                            case 1120:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableNewBufferpool = i2;
                                                                                                break;
                                                                                            case 1121:
                                                                                                dataLoaderHelper.LJIIIZ.mNewBufferPoolBlockSize = i2;
                                                                                                break;
                                                                                            case 1122:
                                                                                                dataLoaderHelper.LJIIIZ.mNewBufferPoolResidentSize = i2;
                                                                                                break;
                                                                                            case 1123:
                                                                                                dataLoaderHelper.LJIIIZ.mNewBufferPoolGrowBlockCount = i2;
                                                                                                break;
                                                                                            case 1124:
                                                                                                dataLoaderHelper.LJIIIZ.mEnablePlayInfoCache = i2;
                                                                                                break;
                                                                                            case 1125:
                                                                                                dataLoaderHelper.LJIIIZ.mControlCDNRangeType = i2;
                                                                                                break;
                                                                                            case 1126:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableP2PPreDown = i2;
                                                                                                break;
                                                                                            case 1127:
                                                                                                dataLoaderHelper.LJIIIZ.mEnablePlayLog = i2;
                                                                                                break;
                                                                                            case 1128:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableNetScheduler = i2;
                                                                                                break;
                                                                                            case 1129:
                                                                                                dataLoaderHelper.LJIIIZ.mNetSchedulerBlockAllNetErr = i2;
                                                                                                break;
                                                                                            case 1130:
                                                                                                dataLoaderHelper.LJIIIZ.mNetSchedulerBlockErrCount = i2;
                                                                                                break;
                                                                                            case 1131:
                                                                                                dataLoaderHelper.LJIIIZ.mNetSChedulerBlockDurationMs = i2;
                                                                                                break;
                                                                                            case 1132:
                                                                                                dataLoaderHelper.LJIIIZ.mFirstRangeLeftThreshold = i2;
                                                                                                break;
                                                                                            case 1133:
                                                                                                dataLoaderHelper.LJIIIZ.mIsAllowTryTheLastUrl = i2;
                                                                                                break;
                                                                                            case 1134:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableCacheReqRange = i2;
                                                                                                break;
                                                                                            case 1135:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableLoaderSeek = i2;
                                                                                                break;
                                                                                            case 1136:
                                                                                                dataLoaderHelper.LJIIIZ.mP2PPreDownPeerCount = i2;
                                                                                                break;
                                                                                            case 1137:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableDynamicTimeout = i2;
                                                                                                break;
                                                                                            case 1138:
                                                                                                dataLoaderHelper.LJIIIZ.mSocketInitialTimeout = i2;
                                                                                                break;
                                                                                            case 1139:
                                                                                                dataLoaderHelper.LJIIIZ.mMaxSocketReuseCount = i2;
                                                                                                break;
                                                                                            case 1140:
                                                                                                AVMDLDNSParser.setIntValue(10, i2);
                                                                                                break;
                                                                                            case 1141:
                                                                                                AVMDLDNSParser.setIntValue(2, i2);
                                                                                                break;
                                                                                            case 1143:
                                                                                                dataLoaderHelper.LJIIIZ.mP2PFirstRangeLoaderType = i2;
                                                                                                break;
                                                                                            case 1145:
                                                                                                dataLoaderHelper.LJIIIZ.mMaxAliveHostNum = i2;
                                                                                                break;
                                                                                            case 1146:
                                                                                                dataLoaderHelper.LJIIIZ.mFileExtendSizeKB = i2;
                                                                                                break;
                                                                                            case 1147:
                                                                                                dataLoaderHelper.LJIIIZ.mMinAllowSpeed = i2;
                                                                                                break;
                                                                                            case 1148:
                                                                                                dataLoaderHelper.LJIIIZ.mNetSchedulerBlockHostIpErrCount = i2;
                                                                                                break;
                                                                                            case 1150:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableIOManager = i2;
                                                                                                break;
                                                                                            case 1151:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableOwnVDPPreloadNotify = i2;
                                                                                                break;
                                                                                            case 1154:
                                                                                                dataLoaderHelper.LJJJ = i2;
                                                                                                break;
                                                                                            case 1156:
                                                                                                if (i2 > 0) {
                                                                                                    dataLoaderHelper.LJJJJL.LIZ = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 1157:
                                                                                                if (i2 > 0) {
                                                                                                    dataLoaderHelper.LJJJJL.LIZIZ = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 1158:
                                                                                                dataLoaderHelper.LJIIIZ.mMaxFileMemCacheSize = i2;
                                                                                                break;
                                                                                            case 1159:
                                                                                                dataLoaderHelper.LJIIIZ.mMaxFileMemCacheNum = i2;
                                                                                                break;
                                                                                            case 1160:
                                                                                                if (i2 >= 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mEnableEarlyData = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 1161:
                                                                                                if (i2 > 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mSocketRecvBufferSize = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 1162:
                                                                                                if (i2 > 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mEnableSpeedPredict = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 1163:
                                                                                                dataLoaderHelper.LJJJI = i2;
                                                                                                break;
                                                                                            case 1164:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableUseOriginalUrl = i2;
                                                                                                break;
                                                                                            case 1166:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableLoaderLogExtractUrls = i2;
                                                                                                break;
                                                                                            case 1167:
                                                                                                dataLoaderHelper.LJIIIZ.mMaxLoaderLogNum = i2;
                                                                                                break;
                                                                                            case 1168:
                                                                                                dataLoaderHelper.LJIIIZ.mCheckContentTypeMethod = i2;
                                                                                                break;
                                                                                            case 1169:
                                                                                                dataLoaderHelper.LJIIIZ.mCloseThreadPool = i2;
                                                                                                break;
                                                                                            case 1170:
                                                                                                dataLoaderHelper.LJJJIL = i2;
                                                                                                break;
                                                                                            case 1171:
                                                                                                if (i2 > 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mEnableSpeedEngine = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 1172:
                                                                                                if (i2 > 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mEnableSpeedReport = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 1503:
                                                                                                dataLoaderHelper.LJJJJIZL = i2;
                                                                                                break;
                                                                                            case 1504:
                                                                                                dataLoaderHelper.LJJJJJ = i2;
                                                                                                break;
                                                                                            case 1505:
                                                                                                dataLoaderHelper.LJJJJ = i2;
                                                                                                break;
                                                                                            case 1513:
                                                                                                dataLoaderHelper.LJJJJI = i2;
                                                                                                break;
                                                                                            case 1514:
                                                                                                dataLoaderHelper.LJIIIZ.mGetCookieTokenLevel = i2;
                                                                                                break;
                                                                                            case 1601:
                                                                                                dataLoaderHelper.LJIIIZ.mZeroRatingStatus = i2;
                                                                                                AVMDLDataLoader aVMDLDataLoader2 = dataLoaderHelper.LJIIIIZZ;
                                                                                                if (aVMDLDataLoader2 != null) {
                                                                                                    aVMDLDataLoader2.setIntValue(6601, i2);
                                                                                                }
                                                                                                break;
                                                                                            case 1701:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableByteMediaNetLoader = i2;
                                                                                                break;
                                                                                            case 1702:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableJavaThreadMerge = i2;
                                                                                                break;
                                                                                            case 1705:
                                                                                                dataLoaderHelper.LJIIIZ.mNewUserOptVer = i2;
                                                                                                break;
                                                                                            case 2000:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableStorageModule = i2;
                                                                                                break;
                                                                                            case 2001:
                                                                                                dataLoaderHelper.LJIIIZ.mStoPlayDldWinSizeKBNM = i2;
                                                                                                break;
                                                                                            case 2002:
                                                                                                dataLoaderHelper.LJIIIZ.mStoPlayDldWinSizeKBLS = i2;
                                                                                                break;
                                                                                            case 2003:
                                                                                                dataLoaderHelper.LJIIIZ.mStoRingBufferSizeKB = i2;
                                                                                                break;
                                                                                            case 2004:
                                                                                                dataLoaderHelper.LJIIIZ.mStoIoWriteLimitKBTh1 = i2;
                                                                                                break;
                                                                                            case 2005:
                                                                                                dataLoaderHelper.LJIIIZ.mStoIoWriteLimitKBTh2 = i2;
                                                                                                break;
                                                                                            case 2006:
                                                                                                dataLoaderHelper.LJIIIZ.mStoMaxIdleTimeSec = i2;
                                                                                                break;
                                                                                            case 2008:
                                                                                                if (i2 >= 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mThreadStackSizeLevel = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2009:
                                                                                                if (i2 > 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mThreadPoolMinCount = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2010:
                                                                                                if (i2 > 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mEnableThreadPoolCheckIdle = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2011:
                                                                                                if (i2 > 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mThreadPoolTTLSecond = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2012:
                                                                                                if (i2 > 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mMaxIpNum = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2013:
                                                                                                dataLoaderHelper.LJIIIZ.mNonBlockRangeMode = i2;
                                                                                                break;
                                                                                            case 2014:
                                                                                                dataLoaderHelper.LJIIIZ.mNonBlockRangeMaxSizeKB = i2;
                                                                                                break;
                                                                                            case 2015:
                                                                                                if (i2 >= 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mNetUnreachableStopRetry = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2016:
                                                                                                if (i2 >= 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mEnableWaitNetReachable = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2017:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableFileMutexOptimize = i2;
                                                                                                break;
                                                                                            case 2018:
                                                                                                if (i2 > 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mSkipCDNBeforeExpiredSec = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2019:
                                                                                                if (i2 > 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mNetUnreachableTimeout = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2020:
                                                                                            case 2021:
                                                                                                if (i2 >= 1 && i2 <= 32) {
                                                                                                    if (!TextUtils.isEmpty(dataLoaderHelper.LJIIIZ.mP2PCostTag)) {
                                                                                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                                                                        AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure3 = dataLoaderHelper.LJIIIZ;
                                                                                                        sbLIZ3.append(aVMDLDataLoaderConfigure3.mP2PCostTag);
                                                                                                        sbLIZ3.append(',');
                                                                                                        sbLIZ3.append(Integer.toString(i2));
                                                                                                        aVMDLDataLoaderConfigure3.mP2PCostTag = C2188811AlT.LIZIZ(sbLIZ3);
                                                                                                    } else {
                                                                                                        dataLoaderHelper.LJIIIZ.mP2PCostTag = Integer.toString(i2);
                                                                                                    }
                                                                                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                                                                    sbLIZ4.append("cur p2p cost tag is: ");
                                                                                                    sbLIZ4.append(dataLoaderHelper.LJIIIZ.mP2PCostTag);
                                                                                                    TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ4));
                                                                                                }
                                                                                                break;
                                                                                            case 2022:
                                                                                                if (i2 > 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mIgnoreTextSpeedTest = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2023:
                                                                                                if (i2 > 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mEnableOptimizeRange = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2024:
                                                                                                if (i2 > 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mDownLogMaxSize = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2025:
                                                                                                dataLoaderHelper.LJIIIZ.mCheckCacheDir = i2;
                                                                                                break;
                                                                                            case 2026:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableUseGroupId = i2;
                                                                                                break;
                                                                                            case 2027:
                                                                                                dataLoaderHelper.LJIIIZ.mDisableRecentCache = i2;
                                                                                                break;
                                                                                            case 2028:
                                                                                                dataLoaderHelper.LJIIIZ.mUpdateCacheFileInternal = i2;
                                                                                                break;
                                                                                            case 2031:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableMissReason = i2;
                                                                                                break;
                                                                                            case 2032:
                                                                                                dataLoaderHelper.LJIIIZ.mPreloadInfoRecordMaxCnt = i2;
                                                                                                break;
                                                                                            case 2033:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableTraceIdPreloadLog = i2;
                                                                                                break;
                                                                                            case 2034:
                                                                                                dataLoaderHelper.LJIIIZ.mSessionCacheInterval = i2;
                                                                                                break;
                                                                                            case 2035:
                                                                                                dataLoaderHelper.LJIIIZ.mFileManagerInterval = i2;
                                                                                                break;
                                                                                            case 2036:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableEnginePortrait = i2;
                                                                                                break;
                                                                                            case 2038:
                                                                                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                                                                sbLIZ5.append("set sto_sensitive_user ");
                                                                                                sbLIZ5.append(i2);
                                                                                                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ5));
                                                                                                dataLoaderHelper.LJIIIZ.mStoSensitiveUser = i2;
                                                                                                AVMDLDataLoader aVMDLDataLoader3 = dataLoaderHelper.LJIIIIZZ;
                                                                                                if (aVMDLDataLoader3 != null && i2 > 0) {
                                                                                                    aVMDLDataLoader3.setIntValue(7453, i2);
                                                                                                }
                                                                                                break;
                                                                                            case 2039:
                                                                                                AVMDLDataLoader aVMDLDataLoader4 = dataLoaderHelper.LJIIIIZZ;
                                                                                                if (aVMDLDataLoader4 != null) {
                                                                                                    aVMDLDataLoader4.setIntValue(7454, i2);
                                                                                                }
                                                                                                break;
                                                                                            case 2040:
                                                                                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                                                                sbLIZ6.append("set sto_level ");
                                                                                                sbLIZ6.append(i2);
                                                                                                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ6));
                                                                                                dataLoaderHelper.LJIIIZ.mStoLevel = i2;
                                                                                                AVMDLDataLoader aVMDLDataLoader5 = dataLoaderHelper.LJIIIIZZ;
                                                                                                if (aVMDLDataLoader5 != null && i2 > 0) {
                                                                                                    aVMDLDataLoader5.setIntValue(7455, i2);
                                                                                                }
                                                                                                break;
                                                                                            case 2041:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableDataLoaderLockOpt = i2;
                                                                                                break;
                                                                                            case 2042:
                                                                                                dataLoaderHelper.LJIIIZ.mPlayTaskNotWriteDisk = i2;
                                                                                                break;
                                                                                            case 2100:
                                                                                                if (i2 >= 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mEnableP2pUpload = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2102:
                                                                                                if (i2 >= 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mDevDiskSizeMB = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 2104:
                                                                                                if (i2 >= 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mDevMemorySizeMB = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 9001:
                                                                                                dataLoaderHelper.LJIIIZ.mIgnorePlayInfo = i2;
                                                                                                break;
                                                                                            case 9008:
                                                                                                dataLoaderHelper.LJJIJIL = i2;
                                                                                                break;
                                                                                            case 9013:
                                                                                                dataLoaderHelper.LJJJJLI = i2;
                                                                                                break;
                                                                                            case 9014:
                                                                                                if (i2 == 1 || i2 == 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mEnableMultiDownloadPath = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 9016:
                                                                                                dataLoaderHelper.LJJJJLL = i2;
                                                                                                break;
                                                                                            case 9017:
                                                                                                dataLoaderHelper.LJJJJZI = i2;
                                                                                                break;
                                                                                            case 9018:
                                                                                                dataLoaderHelper.LJJJLIIL = i2;
                                                                                                break;
                                                                                            case 9019:
                                                                                                dataLoaderHelper.LJJJLL = i2;
                                                                                                break;
                                                                                            case 9021:
                                                                                                dataLoaderHelper.LJJJJZ = i2;
                                                                                                break;
                                                                                            case 9302:
                                                                                                if (i2 > 0) {
                                                                                                    dataLoaderHelper.LJIIIZ.mLoadPcdnInterval = i2;
                                                                                                }
                                                                                                break;
                                                                                            case 13000:
                                                                                                dataLoaderHelper.LJJLIIIJJI = i2;
                                                                                                break;
                                                                                            case 13001:
                                                                                                dataLoaderHelper.LJJLIIIJILLIZJL = i2;
                                                                                                break;
                                                                                            case 13002:
                                                                                                dataLoaderHelper.LJJLIIIJJIZ = i2;
                                                                                                break;
                                                                                            case 13003:
                                                                                                dataLoaderHelper.LJJLIIIJLJLI = i2;
                                                                                                break;
                                                                                            case 13004:
                                                                                                if (i2 == 1) {
                                                                                                    z = true;
                                                                                                }
                                                                                                dataLoaderHelper.LJJLIIIJLLLLLLLZ = z;
                                                                                                break;
                                                                                            case 13005:
                                                                                                dataLoaderHelper.LJIIIZ.mEnableCellularUp = i2;
                                                                                                break;
                                                                                            case 13006:
                                                                                                dataLoaderHelper.LJJLIIIJL = i2;
                                                                                                break;
                                                                                            case 13007:
                                                                                                dataLoaderHelper.LJIIIZ.mCellularUpAsyncDelay = i2;
                                                                                                break;
                                                                                            default:
                                                                                                switch (i) {
                                                                                                    case 103:
                                                                                                        AVMDLDNSParser.setIntValue(4, i2);
                                                                                                        break;
                                                                                                    case 104:
                                                                                                        AVMDLDNSParser.setIntValue(5, i2);
                                                                                                        break;
                                                                                                    case 105:
                                                                                                        AVMDLDNSParser.setIntValue(6, i2);
                                                                                                        break;
                                                                                                    case 106:
                                                                                                        AVMDLDNSParser.setIntValue(7, i2);
                                                                                                        break;
                                                                                                    default:
                                                                                                        switch (i) {
                                                                                                            case 500:
                                                                                                                dataLoaderHelper.LJIIIZ.mLiveP2pAllow = i2;
                                                                                                                break;
                                                                                                            case 501:
                                                                                                                dataLoaderHelper.LJIIIZ.mLiveLoaderType = i2;
                                                                                                                break;
                                                                                                            case 502:
                                                                                                                dataLoaderHelper.LJIIIZ.mLiveLoaderEnable = i2;
                                                                                                                break;
                                                                                                            default:
                                                                                                                switch (i) {
                                                                                                                    case 505:
                                                                                                                        dataLoaderHelper.LJIIIZ.mLiveWatchDurationThreshold = i2;
                                                                                                                        break;
                                                                                                                    case 506:
                                                                                                                        dataLoaderHelper.LJIIIZ.mLiveCacheThresholdHttpToP2p = i2;
                                                                                                                        break;
                                                                                                                    case 507:
                                                                                                                        dataLoaderHelper.LJIIIZ.mLiveCacheThresholdP2pToHttp = i2;
                                                                                                                        break;
                                                                                                                    case 508:
                                                                                                                        dataLoaderHelper.LJIIIZ.mLiveMaxTrySwitchP2pTimes = i2;
                                                                                                                        break;
                                                                                                                    case 509:
                                                                                                                        dataLoaderHelper.LJIIIZ.mLiveWaitP2pReadyThreshold = i2;
                                                                                                                        break;
                                                                                                                    case 510:
                                                                                                                        dataLoaderHelper.LJIIIZ.mLiveMobileUploadAllow = i2;
                                                                                                                        break;
                                                                                                                    case 511:
                                                                                                                        dataLoaderHelper.LJIIIZ.mLiveMobileDownloadAllow = i2;
                                                                                                                        break;
                                                                                                                    case 512:
                                                                                                                        dataLoaderHelper.LJIIIZ.mAlogEnable = i2;
                                                                                                                        AVMDLDataLoader aVMDLDataLoader6 = dataLoaderHelper.LJIIIIZZ;
                                                                                                                        if (aVMDLDataLoader6 != null) {
                                                                                                                            aVMDLDataLoader6.setIntValue(7225, i2);
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 513:
                                                                                                                        dataLoaderHelper.LJIIIZ.mLiveRecvDataTimeout = i2;
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        switch (i) {
                                                                                                                            case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                                                                                                                                if (dataLoaderHelper.LJJIFFI == 1) {
                                                                                                                                    dataLoaderHelper.LJJI();
                                                                                                                                }
                                                                                                                                AVMDLDataLoader aVMDLDataLoader7 = dataLoaderHelper.LJIIIIZZ;
                                                                                                                                if (aVMDLDataLoader7 != null) {
                                                                                                                                    aVMDLDataLoader7.setIntValue(7217, i2);
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 1001:
                                                                                                                                dataLoaderHelper.LJIIIZ.mEnablePreconnect = i2;
                                                                                                                                break;
                                                                                                                            case 1002:
                                                                                                                                dataLoaderHelper.LJIIIZ.mPreconnectNum = i2;
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                switch (i) {
                                                                                                                                    case 1004:
                                                                                                                                        if (i2 != 0) {
                                                                                                                                            z = true;
                                                                                                                                        }
                                                                                                                                        dataLoaderHelper.LJIJJ = z;
                                                                                                                                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                                                                                                        sbLIZ7.append("setIntValue: mInvalidMdlProcotol: ");
                                                                                                                                        sbLIZ7.append(dataLoaderHelper.LJIJJ);
                                                                                                                                        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ7));
                                                                                                                                        break;
                                                                                                                                    case 1005:
                                                                                                                                        if (i2 == 1) {
                                                                                                                                            z = true;
                                                                                                                                        }
                                                                                                                                        dataLoaderHelper.LJIL = z;
                                                                                                                                        if (dataLoaderHelper.LJJIJIIJI) {
                                                                                                                                            dataLoaderHelper.LJIL = true;
                                                                                                                                        }
                                                                                                                                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                                                                                                                        sbLIZ8.append("config DATALOADER_KEY_SET_MDL_PROTOCOL_ENABLE: ");
                                                                                                                                        sbLIZ8.append(dataLoaderHelper.LJIL);
                                                                                                                                        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ8));
                                                                                                                                        break;
                                                                                                                                    case 1006:
                                                                                                                                        dataLoaderHelper.LJIIIZ.mRingBufferSizeKB = i2;
                                                                                                                                        break;
                                                                                                                                    case 1007:
                                                                                                                                        dataLoaderHelper.LJIIIZ.mEnableFileCacheV2 = i2;
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        switch (i) {
                                                                                                                                            case 1009:
                                                                                                                                                dataLoaderHelper.LJIIIZ.mEnableFileRingBuffer = i2;
                                                                                                                                                break;
                                                                                                                                            case 1010:
                                                                                                                                                dataLoaderHelper.LJIIIZ.mEnableUseFileExtendLoaderBuffer = i2;
                                                                                                                                                break;
                                                                                                                                            case 1011:
                                                                                                                                                dataLoaderHelper.LJJIFFI = i2;
                                                                                                                                                break;
                                                                                                                                            case 1012:
                                                                                                                                                dataLoaderHelper.LJJIJ = i2;
                                                                                                                                                break;
                                                                                                                                            case 1013:
                                                                                                                                                if (i2 == 1) {
                                                                                                                                                    z = true;
                                                                                                                                                }
                                                                                                                                                dataLoaderHelper.LJJIJIIJI = z;
                                                                                                                                                if (z) {
                                                                                                                                                    dataLoaderHelper.LJIL = true;
                                                                                                                                                    dataLoaderHelper.LJJIJIIJIL = true;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            case 1014:
                                                                                                                                                if (i2 == 1) {
                                                                                                                                                    z = true;
                                                                                                                                                }
                                                                                                                                                dataLoaderHelper.LJJIJIIJIL = z;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                switch (i) {
                                                                                                                                                    case 1100:
                                                                                                                                                        break;
                                                                                                                                                    case 1101:
                                                                                                                                                        dataLoaderHelper.LJIIIZ.mEnableLoaderPreempt = i2;
                                                                                                                                                        break;
                                                                                                                                                    case 1102:
                                                                                                                                                        dataLoaderHelper.LJIIIZ.mAccessCheckLevel = i2;
                                                                                                                                                        break;
                                                                                                                                                    case 1103:
                                                                                                                                                        dataLoaderHelper.LJIIIZ.mNextDownloadThreshold = i2;
                                                                                                                                                        break;
                                                                                                                                                    case 1104:
                                                                                                                                                        AVMDLDataLoader aVMDLDataLoader8 = dataLoaderHelper.LJIIIIZZ;
                                                                                                                                                        if (aVMDLDataLoader8 != null) {
                                                                                                                                                            aVMDLDataLoader8.setIntValue(7219, i2);
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    case 1105:
                                                                                                                                                        dataLoaderHelper.LJIIIZ.mSocketSendBufferKB = i2;
                                                                                                                                                        break;
                                                                                                                                                    default:
                                                                                                                                                        switch (i) {
                                                                                                                                                            case 1108:
                                                                                                                                                                dataLoaderHelper.LJIIIZ.mEnableSyncDnsForPcdn = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 1109:
                                                                                                                                                                AVMDLDataLoader aVMDLDataLoader9 = dataLoaderHelper.LJIIIIZZ;
                                                                                                                                                                if (aVMDLDataLoader9 != null) {
                                                                                                                                                                    aVMDLDataLoader9.setIntValue(7227, i2);
                                                                                                                                                                }
                                                                                                                                                                break;
                                                                                                                                                            case 1110:
                                                                                                                                                                dataLoaderHelper.LJIIIZ.mXYLibValue = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 1111:
                                                                                                                                                                dataLoaderHelper.LJIIIZ.mCheckPreloadLevel = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 1112:
                                                                                                                                                                dataLoaderHelper.LJJIIJZLJL = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 1113:
                                                                                                                                                                if (i2 != 0) {
                                                                                                                                                                    z = true;
                                                                                                                                                                }
                                                                                                                                                                dataLoaderHelper.LJJIIZ = z;
                                                                                                                                                                break;
                                                                                                                                                            default:
                                                                                                                                                                switch (i) {
                                                                                                                                                                    case 30:
                                                                                                                                                                        dataLoaderHelper.LJIIIZ.mEncryptVersion = i2;
                                                                                                                                                                        break;
                                                                                                                                                                    case 31:
                                                                                                                                                                        dataLoaderHelper.LJIIIZ.mEnableOkHttpLoader = i2;
                                                                                                                                                                        break;
                                                                                                                                                                    case 32:
                                                                                                                                                                        if (i2 > 0) {
                                                                                                                                                                            z = true;
                                                                                                                                                                        }
                                                                                                                                                                        dataLoaderHelper.LJJJJJL = z;
                                                                                                                                                                        break;
                                                                                                                                                                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                                                                                                                                                        if (i2 != 0) {
                                                                                                                                                                            z = true;
                                                                                                                                                                        }
                                                                                                                                                                        dataLoaderHelper.LJIILLIIL = z;
                                                                                                                                                                        break;
                                                                                                                                                                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                                                                                                                                                        dataLoaderHelper.LJIIIZ.mEnablePcdnAuto = i2;
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        switch (i) {
                                                                                                                                                                            case 63:
                                                                                                                                                                                dataLoaderHelper.LJIIIZ.mMaxIpCountEachDomain = i2;
                                                                                                                                                                                break;
                                                                                                                                                                            case 64:
                                                                                                                                                                                dataLoaderHelper.LJIIIZ.mEnableIpBucket = i2;
                                                                                                                                                                                break;
                                                                                                                                                                            case 65:
                                                                                                                                                                                dataLoaderHelper.LJIIIZ.mErrorStateTrustTime = i2;
                                                                                                                                                                                break;
                                                                                                                                                                            case 66:
                                                                                                                                                                                dataLoaderHelper.LJIIIZ.mOnlyUseCdn = i2;
                                                                                                                                                                                break;
                                                                                                                                                                            default:
                                                                                                                                                                                switch (i) {
                                                                                                                                                                                    case 90:
                                                                                                                                                                                        dataLoaderHelper.LJIIIZ.mDNSMainType = i2;
                                                                                                                                                                                        AVMDLDNSParser.setIntValue(0, i2);
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 91:
                                                                                                                                                                                        dataLoaderHelper.LJIIIZ.mDNSBackType = i2;
                                                                                                                                                                                        AVMDLDNSParser.setIntValue(1, i2);
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 92:
                                                                                                                                                                                        dataLoaderHelper.LJIIIZ.mMainToBackUpDelayedTime = i2;
                                                                                                                                                                                        AVMDLDNSParser.setIntValue(3, i2);
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 93:
                                                                                                                                                                                        dataLoaderHelper.LJIIIZ.mEnableBenchMarkIOSpeed = i2;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 94:
                                                                                                                                                                                        dataLoaderHelper.LJIIIZ.mSpeedCoefficientValue = i2;
                                                                                                                                                                                        break;
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                                break;
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                        break;
                                                                                                }
                                                                                                break;
                                                                                        }
                                                                                    } else {
                                                                                        dataLoaderHelper.LJIIIZ.mGlobalSpeedSampleInterval = i2;
                                                                                        AVMDLDataLoader aVMDLDataLoader10 = dataLoaderHelper.LJIIIIZZ;
                                                                                        if (aVMDLDataLoader10 != null) {
                                                                                            aVMDLDataLoader10.setIntValue(7370, i2);
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    dataLoaderHelper.LJIIIZ.mSpeedSampleInterval = i2;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        dataLoaderHelper.LJIIIZ.mEnableSessionReuse = i2;
                                                                    }
                                                                } else {
                                                                    dataLoaderHelper.LJIIIZ.mMaxTlsVersion = i2;
                                                                }
                                                            } else {
                                                                dataLoaderHelper.LJJI = i2;
                                                            }
                                                        } else {
                                                            dataLoaderHelper.LJIIIZ.mEnablePreloadReUse = i2;
                                                        }
                                                    } else {
                                                        dataLoaderHelper.LJIIIZ.mEnableMaxCacheAgeForAllDir = i2;
                                                    }
                                                } else {
                                                    dataLoaderHelper.LJIIIZ.mMaxCacheAge = i2;
                                                }
                                            } else {
                                                dataLoaderHelper.LJIIIZ.mSocketIdleTimeOut = i2;
                                            }
                                        } else {
                                            dataLoaderHelper.LJIIIZ.mEnableSocketReuse = i2;
                                        }
                                    } else {
                                        dataLoaderHelper.LJIIIZ.mEnableExternDNS = i2;
                                    }
                                } else {
                                    dataLoaderHelper.LJIIIZ.mLoaderType = i2;
                                }
                            } else {
                                dataLoaderHelper.LJIIIZ.mTryCount = i2;
                            }
                        } else {
                            dataLoaderHelper.LJIIIZ.mOpenTimeOut = i2;
                        }
                    } else {
                        dataLoaderHelper.LJIIIZ.mRWTimeOut = i2;
                    }
                } else {
                    dataLoaderHelper.LJIIIZ.mMaxCacheSize = i2;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C786410Ut5.v3();
            }
            dataLoaderHelper.LJJ.LJFF(1);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            dataLoaderHelper.LJJ.LJFF(1);
            throw th;
        }
    }
}
