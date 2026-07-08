package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.setting.VoiceUploadConfiguration;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinUploadAuthKeyResponse;
import com.ss.bduploader.BDVideoInfo;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.BDVideoUploaderListener;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: renamed from: X.1B55, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B55 {
    public static final C1B55 LIZ = new C1B55();

    public static void LIZ(BDVideoUploader bDVideoUploader, VoiceUploadConfiguration voiceUploadConfiguration) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinVoiceUploadTask: applying tuning mainNet=");
        sbLIZ.append(voiceUploadConfiguration.mainNetworkType);
        sbLIZ.append(" backupNet=");
        sbLIZ.append(voiceUploadConfiguration.backupNetworkType);
        sbLIZ.append(" sliceRetry=");
        sbLIZ.append(voiceUploadConfiguration.sliceRetryCount);
        sbLIZ.append(" fileRetry=");
        sbLIZ.append(voiceUploadConfiguration.fileRetryCount);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        try {
            bDVideoUploader.setMaxFailTime(voiceUploadConfiguration.maxFailTimes);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        try {
            bDVideoUploader.setSliceSize(voiceUploadConfiguration.sliceSize);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        try {
            bDVideoUploader.setSliceReTryCount(voiceUploadConfiguration.sliceRetryCount);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C189200o6.m2constructorimpl(new C098200Yq(th3));
        }
        try {
            bDVideoUploader.setRWTimeout(voiceUploadConfiguration.rwTimeout);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            C189200o6.m2constructorimpl(new C098200Yq(th4));
        }
        try {
            bDVideoUploader.setFileRetryCount(voiceUploadConfiguration.fileRetryCount);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            C189200o6.m2constructorimpl(new C098200Yq(th5));
        }
        try {
            bDVideoUploader.setSocketNum(voiceUploadConfiguration.socketNum);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            C189200o6.m2constructorimpl(new C098200Yq(th6));
        }
        try {
            bDVideoUploader.setAliveMaxFailTime(voiceUploadConfiguration.aliveMaxFailTime);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th7) {
            TryCatchGuardChecker.doCheck(th7);
            C189200o6.m2constructorimpl(new C098200Yq(th7));
        }
        try {
            bDVideoUploader.setTcpOpenTimeOutMilliSec(voiceUploadConfiguration.tcpOpenTimeout);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th8) {
            TryCatchGuardChecker.doCheck(th8);
            C189200o6.m2constructorimpl(new C098200Yq(th8));
        }
        try {
            bDVideoUploader.setEnableHttps(voiceUploadConfiguration.httpsEnable);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th9) {
            TryCatchGuardChecker.doCheck(th9);
            C189200o6.m2constructorimpl(new C098200Yq(th9));
        }
        try {
            bDVideoUploader.setTranTimeOutUnit(voiceUploadConfiguration.tranTimeOut);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th10) {
            TryCatchGuardChecker.doCheck(th10);
            C189200o6.m2constructorimpl(new C098200Yq(th10));
        }
        try {
            bDVideoUploader.setNetworkType(403, voiceUploadConfiguration.mainNetworkType);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th11) {
            TryCatchGuardChecker.doCheck(th11);
            C189200o6.m2constructorimpl(new C098200Yq(th11));
        }
        try {
            bDVideoUploader.setNetworkType(404, voiceUploadConfiguration.backupNetworkType);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th12) {
            TryCatchGuardChecker.doCheck(th12);
            C189200o6.m2constructorimpl(new C098200Yq(th12));
        }
    }

    public static Object LIZIZ(String str, BulletinUploadAuthKeyResponse bulletinUploadAuthKeyResponse, InterfaceC1364105Vn interfaceC1364105Vn) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinVoiceUploadTask: starting upload ");
        sbLIZ.append(str);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
            BDVideoUploader bDVideoUploader = new BDVideoUploader();
            String str2 = bulletinUploadAuthKeyResponse.uploadHost;
            if (str2 == null) {
                str2 = "";
            }
            bDVideoUploader.setUploadDomain(str2);
            String str3 = bulletinUploadAuthKeyResponse.resourceSpace;
            if (str3 == null) {
                str3 = "";
            }
            bDVideoUploader.setSpaceName(str3);
            bDVideoUploader.setBusinessTag("bulletin_board_voice");
            bDVideoUploader.setTopAccessKey(bulletinUploadAuthKeyResponse.accessKey);
            bDVideoUploader.setTopSecretKey(bulletinUploadAuthKeyResponse.secretAccessKey);
            bDVideoUploader.setTopSessionToken(bulletinUploadAuthKeyResponse.token);
            bDVideoUploader.setEnableLogCallBack(true);
            bDVideoUploader.setEnableHttps(1);
            bDVideoUploader.setPathName(str);
            C1B55 c1b55 = LIZ;
            VoiceUploadConfiguration voiceUploadConfiguration = (VoiceUploadConfiguration) C1B56.LIZIZ.getValue();
            c1b55.getClass();
            LIZ(bDVideoUploader, voiceUploadConfiguration);
            bDVideoUploader.setListener(new BDVideoUploaderListener() { // from class: X.08bj
                @Override // com.ss.bduploader.BDVideoUploaderListener
                public final String getStringFromExtern(int i) {
                    return null;
                }

                @Override // com.ss.bduploader.BDVideoUploaderListener
                public final void onLog(int i, int i2, String str4) {
                }

                @Override // com.ss.bduploader.BDVideoUploaderListener
                public final void onUploadVideoStage(int i, long j) {
                }

                @Override // com.ss.bduploader.BDVideoUploaderListener
                public final int videoUploadCheckNetState(int i, int i2) {
                    Object c098200Yq;
                    boolean zLIZIZ;
                    try {
                        C844470XAv.LIZ.getClass();
                        C844470XAv.LIZ();
                        try {
                            zLIZIZ = C036E.LIZ.LIZIZ();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            zLIZIZ = false;
                        }
                        c098200Yq = Boolean.valueOf(zLIZIZ);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Boolean bool = Boolean.TRUE;
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = bool;
                    }
                    return ((Boolean) c098200Yq).booleanValue() ? 1 : 0;
                }

                @Override // com.ss.bduploader.BDVideoUploaderListener
                public final void onNotify(int i, long j, BDVideoInfo bDVideoInfo) {
                    String str4;
                    if (i != 0) {
                        if (i != 121) {
                            if (i != 2) {
                                if (i != 3) {
                                    return;
                                }
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("upload failed code=");
                                sbLIZ2.append(j);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("BulletinVoiceUploadTask: ");
                                sbLIZ3.append(strLIZIZ);
                                C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ3));
                                C1B55.LIZJ(atomicBoolean, c2252611DEt, new C2150108bb("", false, (Long) (-300L), strLIZIZ));
                                return;
                            }
                        }
                        C1B55.LIZJ(atomicBoolean, c2252611DEt, new C2150108bb("", false, (Long) (-305L), 8));
                        return;
                    }
                    if (bDVideoInfo == null || (str4 = bDVideoInfo.mVideoId) == null) {
                        str4 = "";
                    }
                    if (str4.length() == 0) {
                        C0OPX.LJIIIIZZ("BulletinVoiceUploadTask: complete with empty vid, surfacing as fail");
                        C1B55.LIZJ(atomicBoolean, c2252611DEt, new C2150108bb("", false, (Long) (-304L), 8));
                        return;
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("BulletinVoiceUploadTask: complete, vid=");
                    sbLIZ4.append(str4);
                    C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ4));
                    C1B55.LIZJ(atomicBoolean, c2252611DEt, new C2150108bb(str4, true, (Long) null, 12));
                }
            });
            c2252611DEt.LJJII(new AwS613S0100000_34(bDVideoUploader, 129));
            try {
                bDVideoUploader.start();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BulletinVoiceUploadTask: start() threw ");
                sbLIZ2.append(th.getClass().getSimpleName());
                sbLIZ2.append(": ");
                sbLIZ2.append(th.getMessage());
                C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
                try {
                    bDVideoUploader.close();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                LIZJ(atomicBoolean, c2252611DEt, new C2150108bb("", false, C2286608xc.LJFF(-303L), th.getClass().getSimpleName() + ": " + th.getMessage()));
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("BulletinVoiceUploadTask: setup threw ");
            sbLIZ3.append(th3.getClass().getSimpleName());
            sbLIZ3.append(": ");
            sbLIZ3.append(th3.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ3));
            if (atomicBoolean.compareAndSet(false, true) && c2252611DEt.isActive()) {
                Long lLJFF = C2286608xc.LJFF(-303L);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(th3.getClass().getSimpleName());
                sbLIZ4.append(": ");
                sbLIZ4.append(th3.getMessage());
                C2150108bb c2150108bb = new C2150108bb("", false, lLJFF, C2188811AlT.LIZIZ(sbLIZ4));
                C189200o6.m2constructorimpl(c2150108bb);
                c2252611DEt.resumeWith(c2150108bb);
            }
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static final void LIZJ(AtomicBoolean atomicBoolean, InterfaceC20236714Gf<? super C2150108bb> interfaceC20236714Gf, C2150108bb c2150108bb) {
        if (atomicBoolean.compareAndSet(false, true) && interfaceC20236714Gf.isActive()) {
            C189200o6.m2constructorimpl(c2150108bb);
            interfaceC20236714Gf.resumeWith(c2150108bb);
        }
    }
}
