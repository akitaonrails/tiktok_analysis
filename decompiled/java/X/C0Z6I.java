package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creation.config.DMEncryptedImageContent;
import com.ss.android.ugc.aweme.creation.config.DMEncryptedImageContentExtra;
import com.ss.android.ugc.aweme.creation.config.DMImageMetaInfo;
import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDImageXUploaderListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Z6I, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z6I {
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0Z6I(X.C0Z6K r11, int r12) {
        /*
            r10 = this;
            r10.<init>()
            r5 = 0
            r10.LIZ = r5
            com.ss.android.ugc.aweme.creation.config.DMCameraSettingsConfig r0 = X.C1E9H.LIZ()
            com.ss.android.ugc.aweme.creation.config.DMBDImageUploadConfig r2 = r0.imageBDConfig
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r10.LIZJ = r0
            com.ss.bduploader.BDImageXUploader r3 = new com.ss.bduploader.BDImageXUploader     // Catch: java.lang.Exception -> L89
            r3.<init>()     // Catch: java.lang.Exception -> L89
            java.lang.Class<com.ss.android.ugc.aweme.local_test.LocalTestApi> r4 = com.ss.android.ugc.aweme.local_test.LocalTestApi.class
            r8 = 14
            r9 = 0
            r6 = r5
            r7 = r5
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L89
            com.ss.android.ugc.aweme.local_test.LocalTestApi r0 = (com.ss.android.ugc.aweme.local_test.LocalTestApi) r0     // Catch: java.lang.Exception -> L89
            if (r0 == 0) goto L87
            boolean r1 = r0.enableBoe()     // Catch: java.lang.Exception -> L89
            r0 = 1
            if (r1 != r0) goto L87
        L2e:
            r3.setOpenBoe(r0)     // Catch: java.lang.Exception -> L89
            java.lang.String r0 = r11.LIZ     // Catch: java.lang.Exception -> L89
            r3.setUploadDomain(r0)     // Catch: java.lang.Exception -> L89
            java.lang.String r0 = r11.LIZIZ     // Catch: java.lang.Exception -> L89
            r3.setTopAccessKey(r0)     // Catch: java.lang.Exception -> L89
            java.lang.String r0 = r11.LIZJ     // Catch: java.lang.Exception -> L89
            r3.setTopSecretKey(r0)     // Catch: java.lang.Exception -> L89
            java.lang.String r0 = r11.LIZLLL     // Catch: java.lang.Exception -> L89
            r3.setTopSessionToken(r0)     // Catch: java.lang.Exception -> L89
            java.lang.String r0 = r11.LJ     // Catch: java.lang.Exception -> L89
            r3.setServiceID(r0)     // Catch: java.lang.Exception -> L89
            int r1 = r2.mainNetworkType     // Catch: java.lang.Exception -> L89
            r0 = 403(0x193, float:5.65E-43)
            r3.setNetworkType(r0, r1)     // Catch: java.lang.Exception -> L89
            int r1 = r2.backupNetworkType     // Catch: java.lang.Exception -> L89
            r0 = 404(0x194, float:5.66E-43)
            r3.setNetworkType(r0, r1)     // Catch: java.lang.Exception -> L89
            int r0 = r2.socketNum     // Catch: java.lang.Exception -> L89
            r3.setSocketNum(r0)     // Catch: java.lang.Exception -> L89
            int r0 = r2.fileRetryCount     // Catch: java.lang.Exception -> L89
            r3.setFileRetryCount(r0)     // Catch: java.lang.Exception -> L89
            int r0 = r2.rwTimeout     // Catch: java.lang.Exception -> L89
            r3.setRWTimeout(r0)     // Catch: java.lang.Exception -> L89
            int r0 = r2.maxFailTimes     // Catch: java.lang.Exception -> L89
            r3.setMaxFailTime(r0)     // Catch: java.lang.Exception -> L89
            int r0 = r2.httpsEnable     // Catch: java.lang.Exception -> L89
            r3.setEnableHttps(r0)     // Catch: java.lang.Exception -> L89
            r3.setProcessActionType(r5)     // Catch: java.lang.Exception -> L89
            r3.setMaxConcurrentFileNum(r12)     // Catch: java.lang.Exception -> L89
            java.util.TreeMap r2 = new java.util.TreeMap     // Catch: java.lang.Exception -> L89
            r2.<init>()     // Catch: java.lang.Exception -> L89
            java.lang.String r1 = "copies"
            java.lang.String r0 = "cipher_v2"
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L89
            r3.setConfig(r2)     // Catch: java.lang.Exception -> L89
            goto L8e
        L87:
            r0 = 0
            goto L2e
        L89:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r3 = 0
        L8e:
            r10.LJ = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z6I.<init>(X.0Z6K, int):void");
    }

    public final void LIZIZ(String[] strArr, final C0I2S c0i2s) {
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = SystemClock.elapsedRealtime();
        final C118300cf c118300cf = new C118300cf();
        BDImageXUploader bDImageXUploader = this.LJ;
        if (bDImageXUploader != null) {
            bDImageXUploader.setFilePath(strArr.length, strArr);
        }
        BDImageXUploader bDImageXUploader2 = this.LJ;
        if (bDImageXUploader2 != null) {
            bDImageXUploader2.setListener(new BDImageXUploaderListener() { // from class: X.0Z7R
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
                                    C0Z6I c0z6i = this.LIZIZ;
                                    C0Z7T c0z7t = c0i2s;
                                    synchronized (c0z6i.LIZJ) {
                                        try {
                                            if (!c0z6i.LIZLLL) {
                                                c0z6i.LIZLLL = true;
                                                c0z7t.LIZ();
                                                c0z6i.LIZ();
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
                                C0Z6I c0z6i2 = this.LIZIZ;
                                C0Z7T c0z7t2 = c0i2s;
                                synchronized (c0z6i2.LIZJ) {
                                    try {
                                        if (!c0z6i2.LIZLLL) {
                                            c0z6i2.LIZLLL = true;
                                            c0z7t2.LIZ();
                                            c0z6i2.LIZ();
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
                    C0Z6I c0z6i3 = this.LIZIZ;
                    C0Z7T c0z7t3 = c0i2s;
                    synchronized (c0z6i3.LIZJ) {
                        try {
                            if (!c0z6i3.LIZLLL) {
                                c0z6i3.LIZLLL = true;
                                c0z7t3.LIZIZ(this.LIZ);
                                c0z6i3.LIZ();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            });
        }
        this.LIZIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C05I7(c238400w2, this, c0i2s, null), 3);
        BDImageXUploader bDImageXUploader3 = this.LJ;
        if (bDImageXUploader3 != null) {
            bDImageXUploader3.start();
        }
    }
}
