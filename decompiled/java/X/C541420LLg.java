package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publish.model.AutoCutAgentAuthConfig;
import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.bduploader.BDVideoInfo;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.BDVideoUploaderListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0LLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.VideoUploadTask$uploadVideo$result$1", f = "VideoUploadTask.kt", l = {368}, m = "invokeSuspend")
public final class C541420LLg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0LKV>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AutoCutAgentAuthConfig LLILZ;
    public final /* synthetic */ C0LKQ LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541420LLg(String str, AutoCutAgentAuthConfig autoCutAgentAuthConfig, C0LKQ c0lkq, InterfaceC1364105Vn<? super C541420LLg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = autoCutAgentAuthConfig;
        this.LLILZIL = c0lkq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C541420LLg(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        C1C7U.LIZ("VideoUploadTask@79a.uploadVideo$result$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String str5 = this.LLILLL;
            AutoCutAgentAuthConfig autoCutAgentAuthConfig = this.LLILZ;
            final C0LKQ c0lkq = this.LLILZIL;
            this.LL = str5;
            this.LLILLJJLI = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            final BDVideoUploader bDVideoUploader = new BDVideoUploader();
            STSAuthConfig sTSAuthConfig = autoCutAgentAuthConfig.authorizationV2;
            if (sTSAuthConfig != null) {
                str = sTSAuthConfig.accessKeyId;
            } else {
                str = null;
            }
            bDVideoUploader.setTopAccessKey(str);
            STSAuthConfig sTSAuthConfig2 = autoCutAgentAuthConfig.authorizationV2;
            if (sTSAuthConfig2 != null) {
                str2 = sTSAuthConfig2.secretAccessKey;
            } else {
                str2 = null;
            }
            bDVideoUploader.setTopSecretKey(str2);
            STSAuthConfig sTSAuthConfig3 = autoCutAgentAuthConfig.authorizationV2;
            if (sTSAuthConfig3 != null) {
                str3 = sTSAuthConfig3.sessionToken;
            } else {
                str3 = null;
            }
            bDVideoUploader.setTopSessionToken(str3);
            STSAuthConfig sTSAuthConfig4 = autoCutAgentAuthConfig.authorizationV2;
            if (sTSAuthConfig4 != null) {
                str4 = sTSAuthConfig4.spaceName;
            } else {
                str4 = null;
            }
            bDVideoUploader.setSpaceName(str4);
            bDVideoUploader.setBusinessTag("aigc_autocut");
            bDVideoUploader.setUploadDomain(autoCutAgentAuthConfig.fileHostName);
            bDVideoUploader.setRWTimeout(autoCutAgentAuthConfig.rwTimeout);
            bDVideoUploader.setSocketNum(autoCutAgentAuthConfig.socketNumber);
            bDVideoUploader.setMaxFailTime(autoCutAgentAuthConfig.maxFailTime);
            bDVideoUploader.setFileRetryCount(autoCutAgentAuthConfig.fileRetryCount);
            bDVideoUploader.setNetworkType(403, C541470LLl.LIZ());
            bDVideoUploader.setNetworkType(404, C541470LLl.LIZ());
            final C557050Lt1 c557050Lt1 = new C557050Lt1(false);
            c2252611DEt.LJJII(new AwS587S0100000_8(bDVideoUploader, 29));
            try {
                bDVideoUploader.setListener(new BDVideoUploaderListener() { // from class: X.0LKY
                    @Override // com.ss.bduploader.BDVideoUploaderListener
                    public final String getStringFromExtern(int i2) {
                        return null;
                    }

                    @Override // com.ss.bduploader.BDVideoUploaderListener
                    public final void onLog(int i2, int i3, String str6) {
                    }

                    @Override // com.ss.bduploader.BDVideoUploaderListener
                    public final void onUploadVideoStage(int i2, long j) {
                    }

                    @Override // com.ss.bduploader.BDVideoUploaderListener
                    public final int videoUploadCheckNetState(int i2, int i3) {
                        return C790050Uyx.LIZIZ(C0CHQ.LIZ) ? 1 : 0;
                    }

                    @Override // com.ss.bduploader.BDVideoUploaderListener
                    public final void onNotify(int i2, long j, BDVideoInfo bDVideoInfo) {
                        String str6;
                        int iLJ;
                        Number numberValueOf;
                        String str7;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 8) {
                                    if (i2 == 9) {
                                        C557050Lt1 c557050Lt12 = c557050Lt1;
                                        BDVideoUploader bDVideoUploader2 = bDVideoUploader;
                                        InterfaceC20236714Gf<C0LKV> interfaceC20236714Gf = c2252611DEt;
                                        if (bDVideoInfo != null) {
                                            numberValueOf = Long.valueOf(bDVideoInfo.mErrorCode);
                                        } else {
                                            numberValueOf = 7016;
                                        }
                                        Long lValueOf = Long.valueOf(numberValueOf.longValue());
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("upload fail msg=");
                                        if (bDVideoInfo != null) {
                                            str7 = bDVideoInfo.mErrorMsg;
                                        } else {
                                            str7 = null;
                                        }
                                        sbLIZ.append(str7);
                                        sbLIZ.append(", info=");
                                        sbLIZ.append(bDVideoInfo);
                                        C541420LLg.LIZ(c557050Lt12, bDVideoUploader2, interfaceC20236714Gf, new C0LKV(null, lValueOf, C2188811AlT.LIZIZ(sbLIZ)));
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                if (bDVideoInfo != null) {
                                    iLJ = (int) bDVideoInfo.mProgress;
                                } else {
                                    iLJ = C13LZ.LJ((int) j, 0, 100);
                                }
                                C0LKQ c0lkq2 = c0lkq;
                                C23250099c.LIZLLL(c0lkq2.LJIIJ, null, null, new C539450LDr(c0lkq2, ((int) (iLJ * 0.5f)) + 50, null), 3);
                                C0LKQ c0lkq3 = c0lkq;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("upload video in progress: progress=");
                                sbLIZ2.append(iLJ);
                                sbLIZ2.append(", info=");
                                sbLIZ2.append(bDVideoInfo);
                                c0lkq3.LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ2));
                                return;
                            }
                        }
                        if (bDVideoInfo != null && (str6 = bDVideoInfo.mVideoId) != null && !a0.LJJJIL(str6)) {
                            C541420LLg.LIZ(c557050Lt1, bDVideoUploader, c2252611DEt, new C0LKV(str6, 6));
                            return;
                        }
                        C557050Lt1 c557050Lt13 = c557050Lt1;
                        BDVideoUploader bDVideoUploader3 = bDVideoUploader;
                        InterfaceC20236714Gf<C0LKV> interfaceC20236714Gf2 = c2252611DEt;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("upload complete but tosKey empty, info=");
                        sbLIZ3.append(bDVideoInfo);
                        C541420LLg.LIZ(c557050Lt13, bDVideoUploader3, interfaceC20236714Gf2, new C0LKV(null, 7016L, C2188811AlT.LIZIZ(sbLIZ3)));
                    }
                });
                bDVideoUploader.setPathName(str5);
                bDVideoUploader.start();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Long lLJFF = C2286608xc.LJFF(7017L);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start upload crash: ");
                sbLIZ.append(th.getMessage());
                LIZ(c557050Lt1, bDVideoUploader, c2252611DEt, new C0LKV(null, lLJFF, C2188811AlT.LIZIZ(sbLIZ)));
            }
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VideoUploadTask@79a.uploadVideo$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("VideoUploadTask@79a.uploadVideo$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0LKV> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    public static final void LIZ(C557050Lt1 c557050Lt1, BDVideoUploader bDVideoUploader, InterfaceC20236714Gf<? super C0LKV> interfaceC20236714Gf, C0LKV c0lkv) {
        if (!c557050Lt1.LIZ(false, true)) {
            return;
        }
        try {
            bDVideoUploader.close();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C189200o6.m2constructorimpl(c0lkv);
        interfaceC20236714Gf.resumeWith(c0lkv);
    }
}
