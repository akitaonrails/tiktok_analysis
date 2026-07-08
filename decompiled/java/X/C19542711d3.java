package X;

import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAudioConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadSettingConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import com.ss.bduploader.BDUploadResolver;
import com.ss.bduploader.BDVideoInfo;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.BDVideoUploaderListener;
import com.ss.bduploader.net.HTTPDNS;

/* JADX INFO: renamed from: X.11d3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19542711d3 implements InterfaceC19523111Zt<InterfaceC19543011d6> {
    @Override // X.InterfaceC19523111Zt
    public final C11ZA LJIIIIZZ() {
        return new InterfaceC19543011d6() { // from class: X.11dY
            /* JADX WARN: Type inference failed for: r1v1, types: [X.1BbE, com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader] */
            @Override // X.InterfaceC19543011d6
            public final Object LIZJ(String str, final UploadAuthKeyConfig uploadAuthKeyConfig, C19541511cr c19541511cr) {
                final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c19541511cr));
                if (str.length() != 0 && C2286708xd.LIZJ(str)) {
                    C1441720ncY.LIZ.getClass();
                    final ?? r1 = new AbstractVideoUploader(uploadAuthKeyConfig) { // from class: X.1BbE
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

                        {
                            String str2;
                            String str3;
                            String str4;
                            String str5;
                            int i;
                            STSAuthConfig sTSAuthConfig;
                            STSAuthConfig sTSAuthConfig2;
                            STSAuthConfig sTSAuthConfig3;
                            STSAuthConfig sTSAuthConfig4;
                            BDVideoUploader bDVideoUploader = new BDVideoUploader();
                            this.LIZ = bDVideoUploader;
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
                                i = uploadAudioConfig6.maxFailTime;
                            } else {
                                i = 0;
                            }
                            bDVideoUploader.setMaxFailTime(i);
                            bDVideoUploader.setNetworkType(403, C541470LLl.LIZ());
                            bDVideoUploader.setNetworkType(404, C2207881Bb8.LIZ());
                            C2208411Bbz c2208411Bbz = new C2208411Bbz();
                            UploadVideoConfig uploadVideoConfig = uploadAuthKeyConfig.videoConfig;
                            if (uploadVideoConfig != null) {
                                bDVideoUploader.setEnableLogCallBack(uploadVideoConfig.enableTTUploaderLogCallback);
                                bDVideoUploader.setSliceSize(uploadVideoConfig.sliceSize);
                                bDVideoUploader.setRWTimeout(uploadVideoConfig.sliceTimeout);
                                bDVideoUploader.setSliceReTryCount(uploadVideoConfig.sliceRetryCount);
                                bDVideoUploader.setFileRetryCount(uploadVideoConfig.fileRetryCount);
                                bDVideoUploader.setSocketNum(1);
                                bDVideoUploader.setAliveMaxFailTime(uploadVideoConfig.aliveMaxFailTime);
                                bDVideoUploader.setTcpOpenTimeOutMilliSec(uploadVideoConfig.openTimeOut);
                                bDVideoUploader.setResponseTimeOut(C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_uploader_response_time_out", true));
                                bDVideoUploader.setEnableExternDNS(uploadVideoConfig.enableExternDNS);
                                BDUploadResolver.setEnableTTNetDNS(uploadVideoConfig.enableTTNetDNS);
                                UploadSettingConfig uploadSettingConfig = uploadAuthKeyConfig.uploadSettingConfig;
                                if (uploadSettingConfig != null) {
                                    BDUploadResolver.setDNSType(uploadSettingConfig.dnsVersion, uploadSettingConfig.dnsMainType, uploadSettingConfig.dnsBackType, uploadSettingConfig.dnsBackupUsedDelayTime, uploadSettingConfig.dnsExpiredTime);
                                    HTTPDNS.setDNSServerHost(uploadSettingConfig.dnsOwnServer, uploadSettingConfig.dnsGoogleServer);
                                }
                                C2208411Bbz c2208411Bbz2 = new C2208411Bbz();
                                c2208411Bbz2.LIZ(uploadVideoConfig);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(c2208411Bbz2.LIZLLL());
                                sbLIZ.append(C0BZ9.LIZ());
                                bDVideoUploader.setServerParameter(C2188811AlT.LIZIZ(sbLIZ));
                                bDVideoUploader.setEnableHttps(uploadVideoConfig.enableHttps);
                                c2208411Bbz.LIZ(uploadVideoConfig);
                            }
                            C0CHQ.LIZ().getApplicationService();
                            boolean zLJFF = C19221910Hx.LJFF();
                            bDVideoUploader.setOpenBoe(zLJFF);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("BDVideoUploader enableBoe:");
                            sbLIZ2.append(zLJFF);
                            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                            bDVideoUploader.setServerParameter(c2208411Bbz.LIZLLL());
                        }

                        @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
                        public final void LIZLLL(String str2) {
                            this.LIZ.setBusinessTag(str2);
                        }

                        @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
                        public final void LJ(final InterfaceC2208111BbV interfaceC2208111BbV) {
                            this.LIZ.setListener(new BDVideoUploaderListener() { // from class: X.1BbR
                                @Override // com.ss.bduploader.BDVideoUploaderListener
                                public final String getStringFromExtern(int i) {
                                    interfaceC2208111BbV.LIZIZ();
                                    return null;
                                }

                                @Override // com.ss.bduploader.BDVideoUploaderListener
                                public final void onUploadVideoStage(int i, long j) {
                                    interfaceC2208111BbV.LIZJ();
                                }

                                @Override // com.ss.bduploader.BDVideoUploaderListener
                                public final int videoUploadCheckNetState(int i, int i2) {
                                    return interfaceC2208111BbV.LJ();
                                }

                                @Override // com.ss.bduploader.BDVideoUploaderListener
                                public final void onLog(int i, int i2, String str2) {
                                    interfaceC2208111BbV.LIZ();
                                }

                                @Override // com.ss.bduploader.BDVideoUploaderListener
                                public final void onNotify(int i, long j, BDVideoInfo bDVideoInfo) {
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
                                    interfaceC2208111BbV2.LIZLLL(i, j, new AbstractVideoUploader.VideoUploadInfo(str4, str2, j2, str3));
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
                    };
                    r1.LIZLLL("audio_sami");
                    r1.LJ(new InterfaceC2208111BbV() { // from class: X.11da
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

                        @Override // X.InterfaceC2208111BbV
                        public final void LIZLLL(int i, long j, AbstractVideoUploader.VideoUploadInfo videoUploadInfo) {
                            r1.LIZIZ();
                            if (i == 0) {
                                String str2 = videoUploadInfo.mVideoId;
                                r1.LIZ();
                                InterfaceC1364105Vn<C19543811dE> interfaceC1364105Vn = c23260099m;
                                C19543811dE c19543811dE = new C19543811dE();
                                c19543811dE.LIZ = str2;
                                c19543811dE.LIZIZ = null;
                                C189200o6.m2constructorimpl(c19543811dE);
                                interfaceC1364105Vn.resumeWith(c19543811dE);
                                return;
                            }
                            r1.LIZJ();
                            if (i != 2) {
                                return;
                            }
                            r1.LIZ();
                            InterfaceC1364105Vn<C19543811dE> interfaceC1364105Vn2 = c23260099m;
                            C19543811dE c19543811dE2 = new C19543811dE();
                            c19543811dE2.LIZIZ = videoUploadInfo;
                            C189200o6.m2constructorimpl(c19543811dE2);
                            interfaceC1364105Vn2.resumeWith(c19543811dE2);
                        }
                    });
                    r1.LJFF(str);
                    r1.LJII();
                } else {
                    C19543811dE c19543811dE = new C19543811dE();
                    C189200o6.m2constructorimpl(c19543811dE);
                    c23260099m.resumeWith(c19543811dE);
                }
                Object objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(c19541511cr);
                }
                return objLIZ;
            }
        };
    }
}
