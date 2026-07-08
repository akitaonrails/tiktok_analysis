package X;

import com.bytedance.android.live.liveinteract.multilive.model.GetUploadTokenResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDImageXUploaderListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.142M, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C142M extends C09AY implements Function0<C189200o6<? extends Unit>> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C238400w2 LLILLJJLI;
    public final /* synthetic */ InterfaceC1631620sYq<Integer, String, Long, Unit> LLILLL;
    public final /* synthetic */ int LLILZ = 1;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C142M(String str, C238400w2 c238400w2, InterfaceC1631620sYq interfaceC1631620sYq, long j) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c238400w2;
        this.LLILLL = interfaceC1631620sYq;
        this.LLILZIL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C189200o6<? extends Unit> invoke() {
        Object c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start upload: path: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" , uploadToken:");
        sbLIZ.append(C1870330ylr.LIZ);
        C20441214yg.LIZIZ("ImageUploadUtil", C2188811AlT.LIZIZ(sbLIZ));
        String str = this.LL;
        final C238400w2 c238400w2 = this.LLILLJJLI;
        final InterfaceC1631620sYq<Integer, String, Long, Unit> interfaceC1631620sYq = this.LLILLL;
        final int i = this.LLILZ;
        final long j = this.LLILZIL;
        try {
            final BDImageXUploader bDImageXUploader = new BDImageXUploader();
            GetUploadTokenResponse.ResponseData responseData = C1870330ylr.LIZ;
            bDImageXUploader.setUploadDomain(responseData != null ? responseData.uploadDomain : null);
            GetUploadTokenResponse.ResponseData responseData2 = C1870330ylr.LIZ;
            bDImageXUploader.setTopAccessKey(responseData2 != null ? responseData2.accessKey : null);
            GetUploadTokenResponse.ResponseData responseData3 = C1870330ylr.LIZ;
            bDImageXUploader.setTopSecretKey(responseData3 != null ? responseData3.secretKey : null);
            GetUploadTokenResponse.ResponseData responseData4 = C1870330ylr.LIZ;
            bDImageXUploader.setTopSessionToken(responseData4 != null ? responseData4.sessionToken : null);
            GetUploadTokenResponse.ResponseData responseData5 = C1870330ylr.LIZ;
            bDImageXUploader.setServiceID(responseData5 != null ? responseData5.serviceId : null);
            bDImageXUploader.setFilePath(1, new String[]{str});
            bDImageXUploader.setNetworkType(403, 1);
            bDImageXUploader.setNetworkType(404, 404);
            bDImageXUploader.setFileRetryCount(3);
            bDImageXUploader.setSocketNum(2);
            bDImageXUploader.setRWTimeout(10);
            bDImageXUploader.setMaxFailTime(5);
            bDImageXUploader.setEnableHttps(1);
            bDImageXUploader.setListener(new BDImageXUploaderListener() { // from class: X.0avV
                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final int imageXUploadCheckNetState(int i2, int i3) {
                    C915980Zwa.LIZJ().context();
                    try {
                        return C036E.LIZ.LIZIZ() ? 1 : 0;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return 0;
                    }
                }

                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final void onLog(int i2, int i3, String str2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onLog what: ");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(" ,code: ");
                    sbLIZ2.append(i3);
                    sbLIZ2.append(" ,info: ");
                    sbLIZ2.append(str2);
                    C20441214yg.LIZIZ("ImageUploadUtil", C2188811AlT.LIZIZ(sbLIZ2));
                }

                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final void onNotify(int i2, long j2, BDImageXInfo bDImageXInfo) {
                    String str2;
                    String str3;
                    String str4 = null;
                    if (i2 != 0) {
                        String str5 = "";
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 6) {
                                    if (i2 == 7) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("upload single image fail: ");
                                        sbLIZ2.append(i2);
                                        C20441214yg.LJ("ImageUploadUtil", C2188811AlT.LIZIZ(sbLIZ2));
                                        interfaceC1631620sYq.invoke(Integer.valueOf(i2), "", Long.valueOf(c238400w2.element));
                                        bDImageXUploader.close();
                                        if (i == 1) {
                                            int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                                            if (bDImageXInfo != null && (str3 = bDImageXInfo.mErrorMsg) != null) {
                                                str5 = str3;
                                            }
                                            C936400aTW.LIZLLL(iCurrentTimeMillis, i2, str5, false);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("upload single image complete: ");
                                if (bDImageXInfo != null) {
                                    str4 = bDImageXInfo.mImageTosKey;
                                }
                                sbLIZ3.append(str4);
                                C20441214yg.LIZIZ("ImageUploadUtil", C2188811AlT.LIZIZ(sbLIZ3));
                                InterfaceC1631620sYq<Integer, String, Long, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                                Integer numValueOf = Integer.valueOf(i2);
                                if (bDImageXInfo == null || (str2 = bDImageXInfo.mImageTosKey) == null) {
                                    str2 = "";
                                }
                                interfaceC1631620sYq2.invoke(numValueOf, str2, Long.valueOf(c238400w2.element));
                                bDImageXUploader.close();
                                if (i != 1) {
                                    return;
                                }
                                C936400aTW.LIZLLL((int) ((System.currentTimeMillis() - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 0, "", true);
                                return;
                            }
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("upload fail: ");
                            if (bDImageXInfo != null) {
                                str4 = bDImageXInfo.mImageTosKey;
                            }
                            sbLIZ4.append(str4);
                            C20441214yg.LIZIZ("ImageUploadUtil", C2188811AlT.LIZIZ(sbLIZ4));
                            return;
                        }
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("upload progress: ");
                        sbLIZ5.append(j2);
                        C20441214yg.LIZIZ("ImageUploadUtil", C2188811AlT.LIZIZ(sbLIZ5));
                        c238400w2.element = j2;
                        interfaceC1631620sYq.invoke(Integer.valueOf(i2), "", Long.valueOf(c238400w2.element));
                        return;
                    }
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("upload complete: ");
                    if (bDImageXInfo != null) {
                        str4 = bDImageXInfo.mImageTosKey;
                    }
                    sbLIZ6.append(str4);
                    C20441214yg.LIZIZ("ImageUploadUtil", C2188811AlT.LIZIZ(sbLIZ6));
                }
            });
            bDImageXUploader.start();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return C189200o6.m1boximpl(c098200Yq);
    }
}
