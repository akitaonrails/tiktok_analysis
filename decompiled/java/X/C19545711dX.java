package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAudioConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import com.ss.bduploader.BDVideoInfo;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.BDVideoUploaderListener;
import kotlin.Unit;

/* JADX INFO: renamed from: X.11dX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.UploadAudioHandler$handleData$2$resultList$2", f = "UploadAudioHandler.kt", l = {45}, m = "invokeSuspend")
public final class C19545711dX extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, C19536311c1, InterfaceC1364105Vn<? super C19538411cM>, Object> {
    public int LL;
    public /* synthetic */ C19536311c1 LLILLJJLI;
    public final /* synthetic */ UploadAuthKeyConfig LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19545711dX(UploadAuthKeyConfig uploadAuthKeyConfig, InterfaceC1364105Vn<? super C19545711dX> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = uploadAuthKeyConfig;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.1BbD, com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadAudioHandler@f8b.handleData$2$resultList$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C19536311c1 c19536311c1 = this.LLILLJJLI;
            C19545411dU c19545411dU = C19545411dU.LIZ;
            final UploadAuthKeyConfig uploadAuthKeyConfig = this.LLILLL;
            this.LL = 1;
            c19545411dU.getClass();
            String str = c19536311c1.LIZLLL;
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (!z && C2286708xd.LIZJ(str)) {
                C1441720ncY c1441720ncY = C1441720ncY.LIZ;
                final EnumC19551211eQ enumC19551211eQ = EnumC19551211eQ.VOICE_CONVERSION;
                c1441720ncY.getClass();
                final ?? r2 = new AbstractVideoUploader(uploadAuthKeyConfig, enumC19551211eQ) { // from class: X.1BbD
                    public final BDVideoUploader LIZ;

                    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
                    public final void LIZIZ() {
                    }

                    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
                    public final void LIZJ() {
                    }

                    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
                    public final void LIZ() {
                        this.LIZ.close();
                    }

                    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
                    public final void LJII() {
                        this.LIZ.start();
                    }

                    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
                    public final void LIZLLL(String str2) {
                        this.LIZ.setBusinessTag(str2);
                    }

                    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
                    public final void LJ(final InterfaceC2208111BbV interfaceC2208111BbV) {
                        this.LIZ.setListener(new BDVideoUploaderListener() { // from class: X.1BbS
                            @Override // com.ss.bduploader.BDVideoUploaderListener
                            public final String getStringFromExtern(int i2) {
                                interfaceC2208111BbV.LIZIZ();
                                return null;
                            }

                            @Override // com.ss.bduploader.BDVideoUploaderListener
                            public final void onUploadVideoStage(int i2, long j) {
                                interfaceC2208111BbV.LIZJ();
                            }

                            @Override // com.ss.bduploader.BDVideoUploaderListener
                            public final int videoUploadCheckNetState(int i2, int i3) {
                                return interfaceC2208111BbV.LJ();
                            }

                            @Override // com.ss.bduploader.BDVideoUploaderListener
                            public final void onLog(int i2, int i3, String str2) {
                                interfaceC2208111BbV.LIZ();
                            }

                            @Override // com.ss.bduploader.BDVideoUploaderListener
                            public final void onNotify(int i2, long j, BDVideoInfo bDVideoInfo) {
                                String str2;
                                long j2;
                                String str3;
                                InterfaceC2208111BbV interfaceC2208111BbV2 = interfaceC2208111BbV;
                                String str4 = null;
                                if (bDVideoInfo != null) {
                                    str4 = bDVideoInfo.mTosKey;
                                    str2 = bDVideoInfo.mVideoId;
                                    j2 = bDVideoInfo.mErrorCode;
                                    str3 = bDVideoInfo.mErrorMsg;
                                } else {
                                    str2 = null;
                                    j2 = 0;
                                    str3 = null;
                                }
                                interfaceC2208111BbV2.LIZLLL(i2, j, new AbstractVideoUploader.VideoUploadInfo(str4, str2, j2, str3));
                            }
                        });
                    }

                    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
                    public final void LJFF(String str2) {
                        this.LIZ.setPathName(str2);
                    }

                    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
                    public final void LJI(String str2) {
                        this.LIZ.setUserReference(str2);
                    }

                    {
                        String str2;
                        String str3;
                        String str4;
                        String str5;
                        int i2;
                        STSAuthConfig sTSAuthConfig;
                        STSAuthConfig sTSAuthConfig2;
                        STSAuthConfig sTSAuthConfig3;
                        STSAuthConfig sTSAuthConfig4;
                        BDVideoUploader bDVideoUploader = new BDVideoUploader();
                        this.LIZ = bDVideoUploader;
                        if (C19551111eP.LIZ[enumC19551211eQ.ordinal()] == 1) {
                            UploadAudioConfig uploadAudioConfig = uploadAuthKeyConfig.uploadAudioConfig;
                            if (uploadAudioConfig != null && (sTSAuthConfig4 = uploadAudioConfig.authorization2) != null) {
                                str2 = sTSAuthConfig4.accessKeyId;
                            } else {
                                str2 = null;
                            }
                            bDVideoUploader.setTopAccessKey(str2);
                            UploadAudioConfig uploadAudioConfig2 = uploadAuthKeyConfig.uploadAudioConfig;
                            if (uploadAudioConfig2 != null && (sTSAuthConfig3 = uploadAudioConfig2.authorization2) != null) {
                                str3 = sTSAuthConfig3.secretAccessKey;
                            } else {
                                str3 = null;
                            }
                            bDVideoUploader.setTopSecretKey(str3);
                            UploadAudioConfig uploadAudioConfig3 = uploadAuthKeyConfig.uploadAudioConfig;
                            if (uploadAudioConfig3 != null && (sTSAuthConfig2 = uploadAudioConfig3.authorization2) != null) {
                                str4 = sTSAuthConfig2.sessionToken;
                            } else {
                                str4 = null;
                            }
                            bDVideoUploader.setTopSessionToken(str4);
                            UploadAudioConfig uploadAudioConfig4 = uploadAuthKeyConfig.uploadAudioConfig;
                            if (uploadAudioConfig4 != null && (sTSAuthConfig = uploadAudioConfig4.authorization2) != null) {
                                str5 = sTSAuthConfig.spaceName;
                            } else {
                                str5 = null;
                            }
                            bDVideoUploader.setSpaceName(str5);
                            UploadAudioConfig uploadAudioConfig5 = uploadAuthKeyConfig.uploadAudioConfig;
                            bDVideoUploader.setUploadDomain(uploadAudioConfig5 != null ? uploadAudioConfig5.fileHostName : null);
                            UploadAudioConfig uploadAudioConfig6 = uploadAuthKeyConfig.uploadAudioConfig;
                            if (uploadAudioConfig6 != null) {
                                i2 = uploadAudioConfig6.maxFailTime;
                            } else {
                                i2 = 0;
                            }
                            bDVideoUploader.setMaxFailTime(i2);
                        }
                        bDVideoUploader.setNetworkType(403, C541470LLl.LIZ());
                        bDVideoUploader.setNetworkType(404, C2207881Bb8.LIZ());
                        bDVideoUploader.setFileRetryCount(1);
                        C2208411Bbz c2208411Bbz = new C2208411Bbz();
                        UploadVideoConfig uploadVideoConfig = uploadAuthKeyConfig.videoConfig;
                        if (uploadVideoConfig != null) {
                            bDVideoUploader.setEnableLogCallBack(uploadVideoConfig.enableTTUploaderLogCallback);
                            bDVideoUploader.setSliceSize(uploadVideoConfig.sliceSize);
                            bDVideoUploader.setEnableHttps(uploadVideoConfig.enableHttps);
                            c2208411Bbz.LIZ(uploadVideoConfig);
                        }
                        bDVideoUploader.setServerParameter(c2208411Bbz.LIZLLL());
                    }
                };
                r2.LIZLLL("audio_sami");
                final C259800zU c259800zU = new C259800zU();
                try {
                    r2.LJ(new InterfaceC2208111BbV() { // from class: X.11dZ
                        @Override // X.InterfaceC2208111BbV
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC2208111BbV
                        public final void LIZIZ() {
                        }

                        @Override // X.InterfaceC2208111BbV
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC2208111BbV
                        public final int LJ() {
                            UploadVideoConfig uploadVideoConfig = uploadAuthKeyConfig.videoConfig;
                            if (uploadVideoConfig != null) {
                                return C1404960mfG.LIZ(uploadVideoConfig, "SubtitleOriginalSoundUpload");
                            }
                            return -1;
                        }

                        /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
                        @Override // X.InterfaceC2208111BbV
                        public final void LIZLLL(int i2, long j, AbstractVideoUploader.VideoUploadInfo videoUploadInfo) {
                            r2.LIZIZ();
                            if (i2 == 0) {
                                c259800zU.element = videoUploadInfo.mVideoId;
                                r2.LIZ();
                                InterfaceC1364105Vn<C19538411cM> interfaceC1364105Vn = c23260099m;
                                C19538411cM c19538411cM = new C19538411cM();
                                C259800zU<String> c259800zU2 = c259800zU;
                                c19538411cM.LIZ = true;
                                c19538411cM.LIZIZ = c259800zU2.element;
                                c19538411cM.LIZJ = null;
                                C189200o6.m2constructorimpl(c19538411cM);
                                interfaceC1364105Vn.resumeWith(c19538411cM);
                                return;
                            }
                            r2.LIZJ();
                            if (i2 != 2) {
                                return;
                            }
                            r2.LIZ();
                            InterfaceC1364105Vn<C19538411cM> interfaceC1364105Vn2 = c23260099m;
                            C19538411cM c19538411cM2 = new C19538411cM();
                            c19538411cM2.LIZJ = videoUploadInfo;
                            C189200o6.m2constructorimpl(c19538411cM2);
                            interfaceC1364105Vn2.resumeWith(c19538411cM2);
                        }
                    });
                    r2.LJFF(str);
                    r2.LJII();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    r2.LIZ();
                    C19538411cM c19538411cM = new C19538411cM();
                    C189200o6.m2constructorimpl(c19538411cM);
                    c23260099m.resumeWith(c19538411cM);
                }
            } else {
                C19538411cM c19538411cM2 = new C19538411cM();
                C189200o6.m2constructorimpl(c19538411cM2);
                c23260099m.resumeWith(c19538411cM2);
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UploadAudioHandler@f8b.handleData$2$resultList$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("UploadAudioHandler@f8b.handleData$2$resultList$2");
        return obj;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, C19536311c1 c19536311c1, InterfaceC1364105Vn<? super C19538411cM> interfaceC1364105Vn) {
        C19545711dX c19545711dX = new C19545711dX(this.LLILLL, interfaceC1364105Vn);
        c19545711dX.LLILLJJLI = c19536311c1;
        return c19545711dX.invokeSuspend(Unit.LIZ);
    }
}
