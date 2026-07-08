package X;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.fe.method.upload.config.UploadConfig;
import com.ss.android.ugc.aweme.fe.method.upload.response.I18nUploadResponse;
import com.ss.bduploader.BDMediaDataReader;
import com.ss.bduploader.BDVideoInfo;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.BDVideoUploaderListener;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14W0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14W0 extends C20276614Vo {
    public final WeakReference<Activity> LLILZLL;
    public final C20277714Vz LLIZ;
    public final InterfaceC20276114Vj LLIZLLLIL;
    public final UploadConfig LLJ;
    public final InterfaceC1507230pKD LLJI;

    public final void LJI(String str) {
        Object c098200Yq;
        long jLJII;
        this.LLILZIL = true;
        if (this.LLJ != null) {
            try {
                jLJII = C2400409as.LJII(this.LLILZLL.get(), UriProtector.parse(str));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (this.LLJ != null) {
                if (jLJII > r0.getMaxFileSize()) {
                    C1233040iBy c1233040iBy = new C1233040iBy(this.LLILZLL.get());
                    c1233040iBy.LIZIZ(2131858156);
                    c1233040iBy.LIZLLL();
                    LIZLLL(0, "uploadFailed");
                } else {
                    UploadConfig uploadConfig = this.LLJ;
                    if (uploadConfig != null) {
                        LJII(str, jLJII, uploadConfig);
                        this.LLIZ.LIZJ(this.LLILZLL.get(), this);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6.m1boximpl(c098200Yq);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void LJIIIIZZ(String str) {
        if (str == null) {
            return;
        }
        this.LLILZ = new BDVideoUploader();
        UploadConfig uploadConfig = this.LLJ;
        if (uploadConfig != null && !C504670Jqj.LIZIZ(uploadConfig.getVideoHostName())) {
            LJI(str);
        } else {
            this.LLJI.LIZ().LJ(new C20308514dH(this, str, 1), C15O7.LJIIIIZZ, null);
        }
    }

    @Override // X.C20276614Vo
    public final void LJ(final int i, final String str) {
        this.LLJI.LIZIZ(str, 3).LJ(new InterfaceC2385309Wh() { // from class: X.14Vv
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) throws JSONException, InterruptedException {
                Object obj;
                Object obj2;
                String uri;
                String uri2;
                Object objValueOf;
                C1C7U.LIZ("I18nVideoUploadFeature@80ea.onSuccess$1");
                if (c15o7 != null && !c15o7.LJIILL() && ((BaseResponse) c15o7.LJIIL()).status_code == 0) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    I18nUploadResponse i18nUploadResponse = (I18nUploadResponse) c15o7.LJIIL();
                    C14W0 c14w0 = this;
                    Object objValueOf2 = "";
                    if (i18nUploadResponse.getVideo() == null || i18nUploadResponse.getVideo().getUrlList() == null || i18nUploadResponse.getVideo().getUrlList().isEmpty()) {
                        obj = "";
                    } else {
                        obj = ListProtector.get(i18nUploadResponse.getVideo().getUrlList(), 0);
                    }
                    if (i18nUploadResponse.getCover() == null || i18nUploadResponse.getCover().getUrlList() == null || i18nUploadResponse.getCover().getUrlList().isEmpty()) {
                        obj2 = "";
                    } else {
                        obj2 = ListProtector.get(i18nUploadResponse.getCover().getUrlList(), 0);
                    }
                    if (i18nUploadResponse.getVideo() == null || i18nUploadResponse.getVideo().getUri() == null) {
                        uri = "";
                    } else {
                        uri = i18nUploadResponse.getVideo().getUri();
                    }
                    if (i18nUploadResponse.getCover() == null || i18nUploadResponse.getCover().getUri() == null) {
                        uri2 = "";
                    } else {
                        uri2 = i18nUploadResponse.getCover().getUri();
                    }
                    if (i18nUploadResponse.getCover() == null) {
                        objValueOf = "";
                    } else {
                        objValueOf = Integer.valueOf(i18nUploadResponse.getCover().getHeight());
                    }
                    if (i18nUploadResponse.getCover() != null) {
                        objValueOf2 = Integer.valueOf(i18nUploadResponse.getCover().getWidth());
                    }
                    jSONObject.put("mainUrl", obj);
                    jSONObject.put("posterUrl", obj2);
                    jSONObject.put("posterWidth", objValueOf2);
                    jSONObject.put("posterHeight", objValueOf);
                    jSONObject.put("posterUri", uri2);
                    jSONObject.put("videoUri", uri);
                    jSONObject.put("mediaType", "video");
                    jSONArray.put(jSONObject);
                    c14w0.LLIZLLLIL.LIZJ(jSONArray);
                } else if (i <= 0) {
                    if (c15o7 != null && !c15o7.LJIILL()) {
                        if (((BaseResponse) c15o7.LJIIL()).status_code != 0) {
                            this.LIZLLL(((BaseResponse) c15o7.LJIIL()).status_code, ((BaseResponse) c15o7.LJIIL()).status_msg);
                        }
                    } else {
                        this.LIZLLL(0, "uploadFailed");
                    }
                } else {
                    Thread.sleep(1000L);
                    this.LJ(i - 1, str);
                }
                C1C7U.LIZIZ("I18nVideoUploadFeature@80ea.onSuccess$1");
                return null;
            }
        }, C15O7.LJI, null);
    }

    public final void LJII(String str, final long j, UploadConfig uploadConfig) {
        String accessKeyId;
        String secretAccessKey;
        String sessionToken;
        BDVideoUploader bDVideoUploaderLIZJ = LIZJ();
        try {
            this.LLILZLL.get();
            final Uri uri = UriProtector.parse(str);
            bDVideoUploaderLIZJ.setMediaDataReader(new BDMediaDataReader(uri, j) { // from class: X.08ew
                public final Uri LIZ;
                public final long LIZIZ;
                public InputStream LIZJ;
                public BufferedInputStream LIZLLL;

                @Override // com.ss.bduploader.BDMediaDataReader
                public final int close(int i) {
                    Unit unit;
                    try {
                        BufferedInputStream bufferedInputStream = this.LIZLLL;
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                            unit = Unit.LIZ;
                        } else {
                            unit = null;
                        }
                        C189200o6.m2constructorimpl(unit);
                        return 0;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        return 0;
                    }
                }

                @Override // com.ss.bduploader.BDMediaDataReader
                public final int open(int i) {
                    Object c098200Yq;
                    try {
                        C844470XAv.LIZ.getClass();
                        c098200Yq = C09N1.LJFF(C844470XAv.LIZ(), this.LIZ);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    InputStream inputStream = (InputStream) c098200Yq;
                    this.LIZJ = inputStream;
                    if (inputStream != null) {
                        return 1;
                    }
                    return -1;
                }

                {
                    this.LIZ = uri;
                    this.LIZIZ = j;
                }

                @Override // com.ss.bduploader.BDMediaDataReader
                public final long getValue(int i, int i2) {
                    if (i2 == 0) {
                        return this.LIZIZ;
                    }
                    return 0L;
                }

                @Override // com.ss.bduploader.BDMediaDataReader
                public final int read(int i, long j2, byte[] bArr, int i2) {
                    if (this.LIZJ == null) {
                        return -1;
                    }
                    if (j2 > this.LIZIZ) {
                        return 0;
                    }
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(this.LIZJ);
                    this.LIZLLL = bufferedInputStream;
                    return bufferedInputStream.read(bArr);
                }
            });
            UploadConfig.STSAuthConfig authorizationV2 = uploadConfig.getAuthorizationV2();
            String spaceName = null;
            if (authorizationV2 != null) {
                accessKeyId = authorizationV2.getAccessKeyId();
            } else {
                accessKeyId = null;
            }
            bDVideoUploaderLIZJ.setTopAccessKey(accessKeyId);
            UploadConfig.STSAuthConfig authorizationV22 = uploadConfig.getAuthorizationV2();
            if (authorizationV22 != null) {
                secretAccessKey = authorizationV22.getSecretAccessKey();
            } else {
                secretAccessKey = null;
            }
            bDVideoUploaderLIZJ.setTopSecretKey(secretAccessKey);
            UploadConfig.STSAuthConfig authorizationV23 = uploadConfig.getAuthorizationV2();
            if (authorizationV23 != null) {
                sessionToken = authorizationV23.getSessionToken();
            } else {
                sessionToken = null;
            }
            bDVideoUploaderLIZJ.setTopSessionToken(sessionToken);
            UploadConfig.STSAuthConfig authorizationV24 = uploadConfig.getAuthorizationV2();
            if (authorizationV24 != null) {
                spaceName = authorizationV24.getSpaceName();
            }
            bDVideoUploaderLIZJ.setSpaceName(spaceName);
            bDVideoUploaderLIZJ.setFileRetryCount(uploadConfig.getFileRetryCount());
            bDVideoUploaderLIZJ.setEnableHttps(uploadConfig.getEnableHttps());
            bDVideoUploaderLIZJ.setRWTimeout(uploadConfig.getSliceTimeout());
            bDVideoUploaderLIZJ.setSliceReTryCount(uploadConfig.getSliceRetryCount());
            bDVideoUploaderLIZJ.setSliceSize(uploadConfig.getSliceSize());
            bDVideoUploaderLIZJ.setSocketNum(uploadConfig.getSocketNumber());
            bDVideoUploaderLIZJ.setMaxFailTime(uploadConfig.getMaxFailTime());
            bDVideoUploaderLIZJ.setUploadDomain(uploadConfig.getVideoHostName());
            bDVideoUploaderLIZJ.setBusinessTag("bridge_h5_i18n");
            bDVideoUploaderLIZJ.setListener(new BDVideoUploaderListener() { // from class: X.14Vu
                @Override // com.ss.bduploader.BDVideoUploaderListener
                public final String getStringFromExtern(int i) {
                    return "";
                }

                @Override // com.ss.bduploader.BDVideoUploaderListener
                public final void onLog(int i, int i2, String str2) {
                }

                @Override // com.ss.bduploader.BDVideoUploaderListener
                public final void onUploadVideoStage(int i, long j2) {
                }

                @Override // com.ss.bduploader.BDVideoUploaderListener
                public final int videoUploadCheckNetState(int i, int i2) {
                    if (this.LL.get() != null && C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.F2(this.LL.get(), "connectivity")) != null) {
                        return 1;
                    }
                    return 0;
                }

                @Override // com.ss.bduploader.BDVideoUploaderListener
                public final void onNotify(int i, long j2, BDVideoInfo bDVideoInfo) {
                    String str2;
                    if (i != 0) {
                        if (i == 2) {
                            this.LIZLLL(0, "uploadFailed");
                            try {
                                this.LIZJ().close();
                                return;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                return;
                            }
                        }
                        return;
                    }
                    try {
                        C20276614Vo c20276614Vo = this;
                        if (c20276614Vo.LLILZIL) {
                            JSONObject jSONObject = new JSONObject();
                            String str3 = null;
                            if (bDVideoInfo != null) {
                                str2 = bDVideoInfo.mCoverUri;
                            } else {
                                str2 = null;
                            }
                            jSONObject.put("posterUri", str2);
                            if (bDVideoInfo != null) {
                                str3 = bDVideoInfo.mVideoId;
                            }
                            jSONObject.put("vid", str3);
                            if (bDVideoInfo != null) {
                                jSONObject.put("videoMeta", new JSONObject(bDVideoInfo.mVideoMediaInfo));
                                this.LLILLJJLI.LIZIZ(new JSONObject().put("videoInfo", jSONObject));
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else if (bDVideoInfo != null) {
                            c20276614Vo.LJ(3, bDVideoInfo.mVideoId);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        this.LIZJ().close();
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            });
            bDVideoUploaderLIZJ.start();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    @Override // X.InterfaceC20277514Vx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onActivityResult(int r12, int r13, android.content.Intent r14) throws java.lang.Throwable {
        /*
            r11 = this;
            r4 = 600(0x258, float:8.41E-43)
            java.lang.String r8 = "filePath"
            java.lang.String r6 = "uploadCancel"
            r1 = 0
            r10 = 1
            r2 = 0
            if (r12 == r4) goto Laa
            java.lang.String r3 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytLZLLyDqfCkROTfE1WS0IRaY4f672xzHTHNKiDBz88Jl6mtJ74g=="
            java.lang.String r5 = "Activity_startActivityForResult_2"
            java.lang.String r9 = "src"
            r7 = 700(0x2bc, float:9.81E-43)
            if (r12 == r7) goto L64
            r4 = 900(0x384, float:1.261E-42)
            r7 = 800(0x320, float:1.121E-42)
            if (r12 == r7) goto L1e
            if (r12 == r4) goto Laa
        L1d:
            return r10
        L1e:
            if (r13 != 0) goto L24
            r11.LIZLLL(r1, r6)
            return r10
        L24:
            android.content.Intent r6 = new android.content.Intent
            java.lang.ref.WeakReference<android.app.Activity> r0 = r11.LLILZLL
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity> r0 = com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity.class
            r6.<init>(r1, r0)
            if (r14 == 0) goto L62
            android.net.Uri r0 = r14.getData()
        L39:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6.putExtra(r8, r0)
            r6.putExtra(r9, r7)
            java.lang.ref.WeakReference<android.app.Activity> r0 = r11.LLILZLL
            java.lang.Object r1 = r0.get()
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 == 0) goto L1d
            com.bytedance.router.monitor.RouterPageMonitor r0 = com.bytedance.router.monitor.RouterPageMonitor.INSTANCE
            com.bytedance.router.monitor.page.IRouterPageEventDispatcher r0 = r0.getDispatcher()
            r0.dispatchActivityOpReached(r1, r6, r5)
            X.C1701330uNH.LIZ(r6, r1)
            X.0WZX r0 = new X.0WZX
            r0.<init>(r3, r2)
            X.C2204961BRm.LJIIZILJ(r4, r1, r6, r0)
            return r10
        L62:
            r0 = r2
            goto L39
        L64:
            if (r13 != 0) goto L6a
            r11.LIZLLL(r1, r6)
            return r10
        L6a:
            android.content.Intent r6 = new android.content.Intent
            java.lang.ref.WeakReference<android.app.Activity> r0 = r11.LLILZLL
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity> r0 = com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity.class
            r6.<init>(r1, r0)
            if (r14 == 0) goto La8
            android.net.Uri r0 = r14.getData()
        L7f:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6.putExtra(r8, r0)
            r6.putExtra(r9, r7)
            java.lang.ref.WeakReference<android.app.Activity> r0 = r11.LLILZLL
            java.lang.Object r1 = r0.get()
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 == 0) goto L1d
            com.bytedance.router.monitor.RouterPageMonitor r0 = com.bytedance.router.monitor.RouterPageMonitor.INSTANCE
            com.bytedance.router.monitor.page.IRouterPageEventDispatcher r0 = r0.getDispatcher()
            r0.dispatchActivityOpReached(r1, r6, r5)
            X.C1701330uNH.LIZ(r6, r1)
            X.0WZX r0 = new X.0WZX
            r0.<init>(r3, r2)
            X.C2204961BRm.LJIIZILJ(r4, r1, r6, r0)
            return r10
        La8:
            r0 = r2
            goto L7f
        Laa:
            r0 = -1
            if (r13 == r0) goto Lb3
            if (r13 != 0) goto L1d
            r11.LIZLLL(r1, r6)
            return r10
        Lb3:
            if (r14 == 0) goto Lbe
            java.lang.String r2 = r14.getStringExtra(r8)     // Catch: java.lang.Exception -> Lba
            goto Lbe
        Lba:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lbe:
            r11.LJIIIIZZ(r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14W0.onActivityResult(int, int, android.content.Intent):boolean");
    }

    public C14W0(WeakReference weakReference, C20277714Vz c20277714Vz, AbstractC20277614Vy abstractC20277614Vy, UploadConfig uploadConfig) {
        super(weakReference, c20277714Vz, abstractC20277614Vy);
        this.LLILZLL = weakReference;
        this.LLIZ = c20277714Vz;
        this.LLIZLLLIL = abstractC20277614Vy;
        this.LLJ = uploadConfig;
        this.LLJI = new C1505120pGo().LIZ;
    }
}
