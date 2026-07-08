package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creation.config.DMBDImageUploadConfig;
import com.ss.android.ugc.aweme.creation.config.DMEncryptedImageContent;
import com.ss.android.ugc.aweme.creation.config.DMEncryptedImageContentExtra;
import com.ss.android.ugc.aweme.creation.config.DMImageMetaInfo;
import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDImageXUploaderListener;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.0Z6H, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z6H {
    public final int LIZ = 0;
    public AnonymousClass0956 LIZIZ;
    public final Object LIZJ;
    public volatile boolean LIZLLL;
    public final BDImageXUploader LJ;

    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LIZIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        BDImageXUploader bDImageXUploader = this.LJ;
        if (bDImageXUploader != null) {
            bDImageXUploader.close();
        }
    }

    public C0Z6H(C0Z6J c0z6j, int i) {
        BDImageXUploader bDImageXUploader;
        DMBDImageUploadConfig dMBDImageUploadConfig = C1E9H.LIZ().imageBDConfig;
        this.LIZJ = new Object();
        try {
            bDImageXUploader = new BDImageXUploader();
            bDImageXUploader.setOpenBoe(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe());
            bDImageXUploader.setUploadDomain(c0z6j.LIZ);
            bDImageXUploader.setTopAccessKey(c0z6j.LIZIZ);
            bDImageXUploader.setTopSecretKey(c0z6j.LIZJ);
            bDImageXUploader.setTopSessionToken(c0z6j.LIZLLL);
            bDImageXUploader.setServiceID(c0z6j.LJ);
            bDImageXUploader.setNetworkType(403, dMBDImageUploadConfig.mainNetworkType);
            bDImageXUploader.setNetworkType(404, dMBDImageUploadConfig.backupNetworkType);
            bDImageXUploader.setSocketNum(dMBDImageUploadConfig.socketNum);
            bDImageXUploader.setFileRetryCount(dMBDImageUploadConfig.fileRetryCount);
            bDImageXUploader.setRWTimeout(dMBDImageUploadConfig.rwTimeout);
            bDImageXUploader.setMaxFailTime(dMBDImageUploadConfig.maxFailTimes);
            bDImageXUploader.setEnableHttps(dMBDImageUploadConfig.httpsEnable);
            bDImageXUploader.setProcessActionType(0);
            bDImageXUploader.setMaxConcurrentFileNum(i);
            TreeMap<String, Object> treeMap = new TreeMap<>();
            treeMap.put("copies", "cipher_v2");
            bDImageXUploader.setConfig(treeMap);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            bDImageXUploader = null;
        }
        this.LJ = bDImageXUploader;
    }

    public final void LIZIZ(String[] strArr, final C439320HKo c439320HKo) {
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = SystemClock.elapsedRealtime();
        final C118300cf c118300cf = new C118300cf();
        BDImageXUploader bDImageXUploader = this.LJ;
        if (bDImageXUploader != null) {
            bDImageXUploader.setFilePath(strArr.length, strArr);
        }
        BDImageXUploader bDImageXUploader2 = this.LJ;
        if (bDImageXUploader2 != null) {
            bDImageXUploader2.setListener(new BDImageXUploaderListener() { // from class: X.0Z7Q
                public final List<DMUploadImageResult> LIZ = new ArrayList();

                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final void onLog(int i, int i2, String str) {
                }

                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final int imageXUploadCheckNetState(int i, int i2) {
                    C844470XAv.LIZ.getClass();
                    C844470XAv.LIZ();
                    try {
                        return C036E.LIZ.LIZIZ() ? 1 : 0;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return 0;
                    }
                }

                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final void onNotify(int i, long j, BDImageXInfo bDImageXInfo) {
                    if (this.LIZIZ.LIZLLL) {
                        return;
                    }
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 6) {
                                if (i == 7) {
                                    C0Z6H c0z6h = this.LIZIZ;
                                    C0Z7S c0z7s = c439320HKo;
                                    synchronized (c0z6h.LIZJ) {
                                        try {
                                            if (!c0z6h.LIZLLL) {
                                                c0z6h.LIZLLL = true;
                                                c0z7s.LIZ();
                                                c0z6h.LIZ();
                                            }
                                        } finally {
                                            TryCatchGuardChecker.doCheck(th);
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            if (bDImageXInfo == null) {
                                C0Z6H c0z6h2 = this.LIZIZ;
                                C0Z7S c0z7s2 = c439320HKo;
                                synchronized (c0z6h2.LIZJ) {
                                    try {
                                        if (!c0z6h2.LIZLLL) {
                                            c0z6h2.LIZLLL = true;
                                            c0z7s2.LIZ();
                                            c0z6h2.LIZ();
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                return;
                            }
                            if (this.LIZIZ.LIZ == 1) {
                                ((ArrayList) this.LIZ).add(new DMUploadImageResult((DMEncryptedImageContent) C08JS.LIZ(bDImageXInfo.mEncryptionMeta, DMEncryptedImageContent.class), 1));
                                return;
                            }
                            DMImageMetaInfo dMImageMetaInfo = (DMImageMetaInfo) C08JS.LIZ(bDImageXInfo.mMetaInfo, DMImageMetaInfo.class);
                            List<DMUploadImageResult> list = this.LIZ;
                            ArrayList arrayList = (ArrayList) list;
                            arrayList.add(new DMUploadImageResult(new DMEncryptedImageContent(dMImageMetaInfo.imageUri, null, null, new DMEncryptedImageContentExtra(dMImageMetaInfo.width, dMImageMetaInfo.height, null)), 1));
                            return;
                        }
                        int i2 = (int) j;
                        if (i2 > c118300cf.element) {
                            c238400w2.element = SystemClock.elapsedRealtime();
                            c118300cf.element = i2;
                            return;
                        }
                        return;
                    }
                    C0Z6H c0z6h3 = this.LIZIZ;
                    C0Z7S c0z7s3 = c439320HKo;
                    synchronized (c0z6h3.LIZJ) {
                        try {
                            if (!c0z6h3.LIZLLL) {
                                c0z6h3.LIZLLL = true;
                                c0z7s3.LIZIZ(this.LIZ);
                                c0z6h3.LIZ();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            });
        }
        this.LIZIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C05I6(c238400w2, this, c439320HKo, null), 3);
        BDImageXUploader bDImageXUploader3 = this.LJ;
        if (bDImageXUploader3 != null) {
            bDImageXUploader3.start();
        }
    }
}
