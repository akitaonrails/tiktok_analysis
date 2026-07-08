package X;

import com.bytedance.android.live.liveinteract.multilive.model.GetUploadAuthResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDImageXUploaderListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.142L, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C142L extends C09AY implements Function0<C189200o6<? extends Unit>> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Function2<String, String, Unit> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C142L(long j, String str, String str2, Function2 function2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = function2;
        this.LLILLL = str2;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C189200o6<? extends Unit> invoke() {
        Object c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start upload: pic path: ");
        sbLIZ.append(this.LL);
        C20441214yg.LIZIZ("NoticeBoardImageUploadManager", C2188811AlT.LIZIZ(sbLIZ));
        String str = this.LL;
        final Function2<String, String, Unit> function2 = this.LLILLJJLI;
        final String str2 = this.LLILLL;
        final long j = this.LLILZ;
        try {
            final BDImageXUploader bDImageXUploader = new BDImageXUploader();
            GetUploadAuthResponse.ResponseData responseData = C953370aut.LIZ;
            bDImageXUploader.setUploadDomain(responseData != null ? responseData.uploadDomain : null);
            GetUploadAuthResponse.ResponseData responseData2 = C953370aut.LIZ;
            bDImageXUploader.setTopAccessKey(responseData2 != null ? responseData2.accessKey : null);
            GetUploadAuthResponse.ResponseData responseData3 = C953370aut.LIZ;
            bDImageXUploader.setTopSecretKey(responseData3 != null ? responseData3.secretKey : null);
            GetUploadAuthResponse.ResponseData responseData4 = C953370aut.LIZ;
            bDImageXUploader.setTopSessionToken(responseData4 != null ? responseData4.sessionToken : null);
            GetUploadAuthResponse.ResponseData responseData5 = C953370aut.LIZ;
            bDImageXUploader.setServiceID(responseData5 != null ? responseData5.serviceId : null);
            bDImageXUploader.setFilePath(1, new String[]{str});
            bDImageXUploader.setNetworkType(403, 1);
            bDImageXUploader.setNetworkType(404, 404);
            bDImageXUploader.setFileRetryCount(2);
            bDImageXUploader.setSocketNum(2);
            bDImageXUploader.setRWTimeout(10);
            bDImageXUploader.setMaxFailTime(5);
            bDImageXUploader.setEnableHttps(1);
            bDImageXUploader.setFileExtension(".webp");
            bDImageXUploader.setListener(new BDImageXUploaderListener() { // from class: X.0avT
                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final void onLog(int i, int i2, String str3) {
                }

                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final int imageXUploadCheckNetState(int i, int i2) {
                    C915980Zwa.LIZJ().context();
                    try {
                        return C036E.LIZ.LIZIZ() ? 1 : 0;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return 0;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[PHI: r1
                  0x005e: PHI (r1v8 java.lang.String) = (r1v6 java.lang.String), (r1v9 java.lang.String) binds: [B:15:0x002f, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // com.ss.bduploader.BDImageXUploaderListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onNotify(int r8, long r9, com.ss.bduploader.BDImageXInfo r11) {
                    /*
                        Method dump skipped, instruction units count: 223
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C953730avT.onNotify(int, long, com.ss.bduploader.BDImageXInfo):void");
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
