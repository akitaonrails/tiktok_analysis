package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadSettingConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.bduploader.BDNetworkRouter;
import com.ss.bduploader.BDNetworkRouterListener;
import com.ss.bduploader.BDNetworkSpeedTest;
import com.ss.bduploader.BDNetworkSpeedTestListener;
import com.ss.bduploader.BDUploadResolver;
import com.ss.bduploader.net.HTTPDNS;

/* JADX INFO: renamed from: X.1D1C, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1D1C implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<C2190271Anp> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.1BbI, X.1BbP] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.1Bc0] */
    public static final void subscribe$0(C1D1C c1d1c, C09AJ c09aj) {
        C1C7U.LIZ("BDUploadNetworkRouter$StateMachine@4327.startAction$1$createStartProbeObservable$1");
        AbstractC2208051BbP abstractC2208051BbP = ((C2208461Bc4) c1d1c.l0).LIZJ;
        if (abstractC2208051BbP != null) {
            C2208461Bc4.LIZJ("restart speedProbe, may close anr");
            abstractC2208051BbP.LIZ();
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C0CHQ.LIZ().getPublishService().LJJIJIIJI().getClass();
        ?? r4 = new AbstractC2208051BbP() { // from class: X.1BbI
            public BDNetworkRouter LIZ;

            @Override // X.AbstractC2208051BbP
            public final void LIZ() {
                BDNetworkRouter bDNetworkRouter = this.LIZ;
                if (bDNetworkRouter == null) {
                    bDNetworkRouter = null;
                }
                bDNetworkRouter.close();
            }

            @Override // X.AbstractC2208051BbP
            public final void LIZIZ() {
                BDNetworkRouter bDNetworkRouter = this.LIZ;
                if (bDNetworkRouter == null) {
                    bDNetworkRouter = null;
                }
                bDNetworkRouter.stop();
            }

            public final void LJ() {
                BDNetworkRouter bDNetworkRouter = this.LIZ;
                if (bDNetworkRouter == null) {
                    bDNetworkRouter = null;
                }
                bDNetworkRouter.start();
            }

            static {
                C1462550oA9.LIZ();
            }

            public final void LIZJ(final C2208421Bc0 c2208421Bc0) {
                BDNetworkRouter bDNetworkRouter = this.LIZ;
                if (bDNetworkRouter == null) {
                    bDNetworkRouter = null;
                }
                bDNetworkRouter.setListener(new BDNetworkRouterListener() { // from class: X.1BbJ
                    @Override // com.ss.bduploader.BDNetworkRouterListener
                    public final int networkRouteCheckNetState(int i, int i2) {
                        return c2208421Bc0.LIZ();
                    }

                    @Override // com.ss.bduploader.BDNetworkRouterListener
                    public final void onRouteContext(int i, int i2, String str) {
                        if (i != 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    getClass();
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("BDPublishNetworkRouter : ");
                                    sbLIZ.append("error vidContextType onSpeedVidContext");
                                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("BDPublishNetworkRouter : ");
                                    sbLIZ2.append("error vidContextType onSpeedVidContext");
                                    C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                                    return;
                                }
                                InterfaceC2208011BbL interfaceC2208011BbL = c2208421Bc0;
                                if (str == null) {
                                    str = "";
                                }
                                interfaceC2208011BbL.onRouteContext(3, i2, str);
                                return;
                            }
                            InterfaceC2208011BbL interfaceC2208011BbL2 = c2208421Bc0;
                            if (str == null) {
                                str = "";
                            }
                            interfaceC2208011BbL2.onRouteContext(1, i2, str);
                            return;
                        }
                        InterfaceC2208011BbL interfaceC2208011BbL3 = c2208421Bc0;
                        if (str == null) {
                            str = "";
                        }
                        interfaceC2208011BbL3.onRouteContext(5, i2, str);
                    }
                });
            }

            public final void LIZLLL(UploadAuthKeyConfig uploadAuthKeyConfig) {
                UploadVideoConfig uploadVideoConfig = uploadAuthKeyConfig.videoConfig;
                if (uploadVideoConfig != null) {
                    STSAuthConfig sTSAuthConfig = uploadVideoConfig.authorizationV2;
                    if (sTSAuthConfig != null) {
                        BDNetworkRouter bDNetworkRouter = new BDNetworkRouter(0);
                        this.LIZ = bDNetworkRouter;
                        bDNetworkRouter.setTopAccessKey(sTSAuthConfig.accessKeyId);
                        BDNetworkRouter bDNetworkRouter2 = this.LIZ;
                        BDNetworkRouter bDNetworkRouter3 = null;
                        if (bDNetworkRouter2 == null) {
                            bDNetworkRouter2 = null;
                        }
                        bDNetworkRouter2.setTopSecretKey(sTSAuthConfig.secretAccessKey);
                        BDNetworkRouter bDNetworkRouter4 = this.LIZ;
                        if (bDNetworkRouter4 == null) {
                            bDNetworkRouter4 = null;
                        }
                        bDNetworkRouter4.setTopSessionToken(sTSAuthConfig.sessionToken);
                        BDNetworkRouter bDNetworkRouter5 = this.LIZ;
                        if (bDNetworkRouter5 == null) {
                            bDNetworkRouter5 = null;
                        }
                        bDNetworkRouter5.setSpaceName(sTSAuthConfig.spaceName);
                        BDNetworkRouter bDNetworkRouter6 = this.LIZ;
                        if (bDNetworkRouter6 == null) {
                            bDNetworkRouter6 = null;
                        }
                        bDNetworkRouter6.setMaxFailTime(uploadVideoConfig.maxFailTime);
                        BDNetworkRouter bDNetworkRouter7 = this.LIZ;
                        if (bDNetworkRouter7 == null) {
                            bDNetworkRouter7 = null;
                        }
                        bDNetworkRouter7.setUploadDomain(uploadVideoConfig.videoHostName);
                        BDNetworkRouter bDNetworkRouter8 = this.LIZ;
                        if (bDNetworkRouter8 == null) {
                            bDNetworkRouter8 = null;
                        }
                        bDNetworkRouter8.setRWTimeout(uploadVideoConfig.sliceTimeout);
                        BDNetworkRouter bDNetworkRouter9 = this.LIZ;
                        if (bDNetworkRouter9 == null) {
                            bDNetworkRouter9 = null;
                        }
                        bDNetworkRouter9.setFileRetryCount(uploadVideoConfig.fileRetryCount);
                        BDNetworkRouter bDNetworkRouter10 = this.LIZ;
                        if (bDNetworkRouter10 == null) {
                            bDNetworkRouter10 = null;
                        }
                        bDNetworkRouter10.setTcpOpenTimeOutMilliSec(uploadVideoConfig.openTimeOut);
                        BDNetworkRouter bDNetworkRouter11 = this.LIZ;
                        if (bDNetworkRouter11 == null) {
                            bDNetworkRouter11 = null;
                        }
                        bDNetworkRouter11.setEnableExternDNS(uploadVideoConfig.enableExternDNS);
                        BDUploadResolver.setEnableTTNetDNS(uploadVideoConfig.enableTTNetDNS);
                        UploadSettingConfig uploadSettingConfig = uploadAuthKeyConfig.uploadSettingConfig;
                        if (uploadSettingConfig != null) {
                            BDUploadResolver.setDNSType(uploadSettingConfig.dnsVersion, uploadSettingConfig.dnsMainType, uploadSettingConfig.dnsBackType, uploadSettingConfig.dnsBackupUsedDelayTime, uploadSettingConfig.dnsExpiredTime);
                            HTTPDNS.setDNSServerHost(uploadSettingConfig.dnsOwnServer, uploadSettingConfig.dnsGoogleServer);
                        }
                        BDNetworkRouter bDNetworkRouter12 = this.LIZ;
                        if (bDNetworkRouter12 == null) {
                            bDNetworkRouter12 = null;
                        }
                        C2208411Bbz c2208411Bbz = new C2208411Bbz();
                        c2208411Bbz.LIZ(uploadVideoConfig);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c2208411Bbz.LIZLLL());
                        sbLIZ.append(C0BZ9.LIZ());
                        bDNetworkRouter12.setServerParameter(C2188811AlT.LIZIZ(sbLIZ));
                        BDNetworkRouter bDNetworkRouter13 = this.LIZ;
                        if (bDNetworkRouter13 == null) {
                            bDNetworkRouter13 = null;
                        }
                        bDNetworkRouter13.setEnableHttps(uploadVideoConfig.enableHttps);
                        int i = uploadVideoConfig.mainNetworkType;
                        C1462550oA9.LIZIZ(i);
                        int i2 = uploadVideoConfig.backupNetworkType;
                        C1462550oA9.LIZIZ(i2);
                        BDNetworkRouter bDNetworkRouter14 = this.LIZ;
                        if (bDNetworkRouter14 == null) {
                            bDNetworkRouter14 = null;
                        }
                        bDNetworkRouter14.setNetworkType(403, i);
                        BDNetworkRouter bDNetworkRouter15 = this.LIZ;
                        if (bDNetworkRouter15 == null) {
                            bDNetworkRouter15 = null;
                        }
                        bDNetworkRouter15.setNetworkType(404, i2);
                        if (uploadVideoConfig.enableQuic == 1) {
                            BDNetworkRouter bDNetworkRouter16 = this.LIZ;
                            if (bDNetworkRouter16 != null) {
                                bDNetworkRouter3 = bDNetworkRouter16;
                            }
                            bDNetworkRouter3.setDataTransportProtocol(2);
                            return;
                        }
                        BDNetworkRouter bDNetworkRouter17 = this.LIZ;
                        if (bDNetworkRouter17 != null) {
                            bDNetworkRouter3 = bDNetworkRouter17;
                        }
                        bDNetworkRouter3.setDataTransportProtocol(0);
                        return;
                    }
                    throw new IllegalArgumentException("upload video authorization2 config is null");
                }
                throw new IllegalArgumentException("upload video config is null");
            }
        };
        r4.LIZLLL((UploadAuthKeyConfig) c1d1c.l1);
        final C2208461Bc4 c2208461Bc4 = (C2208461Bc4) c1d1c.l0;
        final UploadAuthKeyConfig uploadAuthKeyConfig = (UploadAuthKeyConfig) c1d1c.l1;
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        r4.LIZJ(new InterfaceC2208011BbL() { // from class: X.1Bc0
            @Override // X.InterfaceC2208011BbL
            public final int LIZ() {
                UploadVideoConfig uploadVideoConfig = uploadAuthKeyConfig.videoConfig;
                if (uploadVideoConfig != null) {
                    return C1404960mfG.LIZ(uploadVideoConfig, "BDUploadSpeedProbe");
                }
                throw new IllegalArgumentException("upload video config is null");
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0015  */
            @Override // X.InterfaceC2208011BbL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onRouteContext(int r11, int r12, java.lang.String r13) {
                /*
                    r10 = this;
                    r4 = 0
                    r0 = 1
                    r6 = r13
                    if (r11 == 0) goto L4b
                    if (r11 == r0) goto L4b
                    r3 = 0
                    r0 = 2
                    if (r11 == r0) goto L26
                    r0 = 3
                    if (r11 == r0) goto L26
                    r2 = 0
                    r0 = 4
                    if (r11 != r0) goto L27
                    r1 = 1
                L13:
                    if (r3 != 0) goto L4b
                    if (r1 != 0) goto L38
                    if (r4 != 0) goto L38
                    if (r2 == 0) goto L2d
                    X.09AJ<X.1Anp> r1 = r1
                    X.1Bc2 r0 = new X.1Bc2
                    r0.<init>()
                    r1.tryOnError(r0)
                    return
                L26:
                    r2 = 1
                L27:
                    r1 = 0
                    r0 = 5
                    if (r11 != r0) goto L13
                    r4 = 1
                    goto L13
                L2d:
                    X.1Bc4 r0 = r4
                    r0.getClass()
                    java.lang.String r0 = "error vidContextType onSpeedVidContext"
                    X.C2208461Bc4.LIZJ(r0)
                    return
                L38:
                    X.09AJ<X.1Anp> r0 = r1
                    X.1Anp r1 = new X.1Anp
                    long r2 = (long) r12
                    r9 = 0
                    long r4 = r2
                    long r7 = java.lang.System.currentTimeMillis()
                    r1.<init>(r2, r4, r6, r7, r9)
                    r0.onNext(r1)
                    return
                L4b:
                    X.09AJ<X.1Anp> r0 = r1
                    X.1Anp r1 = new X.1Anp
                    long r2 = (long) r12
                    r9 = 1
                    long r4 = r2
                    long r7 = java.lang.System.currentTimeMillis()
                    r1.<init>(r2, r4, r6, r7, r9)
                    r0.onNext(r1)
                    X.09AJ<X.1Anp> r0 = r1
                    r0.onComplete()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2208421Bc0.onRouteContext(int, int, java.lang.String):void");
            }
        });
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 524288, "upload_speed_probe_size", true);
        int iLJIJ2 = C0C64.LJIILLIIL().LJIJ(31744, 1, "upload_speed_probe_retry_count", true);
        int iLIZ = C1456370o0B.LIZ();
        SettingsManager.LIZLLL().getClass();
        int iLJ = SettingsManager.LJ("tool_upload_speed_probe_single_host_total_timeout_s", 0);
        C2208461Bc4 c2208461Bc42 = (C2208461Bc4) c1d1c.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startSpeedTest size:");
        sbLIZ.append(iLJIJ);
        sbLIZ.append(" retryCount:");
        sbLIZ.append(iLJIJ2);
        sbLIZ.append(" mode:");
        sbLIZ.append(iLIZ);
        sbLIZ.append(" singleHostTotalTimeout:");
        sbLIZ.append(iLJ);
        C2188811AlT.LIZIZ(sbLIZ);
        c2208461Bc42.getClass();
        r4.LJ();
        ((C2208461Bc4) c1d1c.l0).LIZJ = r4;
        C1C7U.LIZIZ("BDUploadNetworkRouter$StateMachine@4327.startAction$1$createStartProbeObservable$1");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.1BbH, X.1BbQ] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.1Bc1] */
    public static final void subscribe$1(C1D1C c1d1c, C09AJ c09aj) {
        C1C7U.LIZ("BDUploadSpeedProbe$StateMachine@6f08.startAction$1$createStartProbeObservable$1");
        AbstractC2208061BbQ abstractC2208061BbQ = ((C2208451Bc3) c1d1c.l0).LIZJ;
        if (abstractC2208061BbQ != null) {
            C2208451Bc3.LIZJ("restart speedProbe, may close anr");
            abstractC2208061BbQ.LIZ();
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C0CHQ.LIZ().getPublishService().LJJIJIIJI().getClass();
        ?? r4 = new AbstractC2208061BbQ() { // from class: X.1BbH
            public BDNetworkSpeedTest LIZ;

            @Override // X.AbstractC2208061BbQ
            public final void LIZ() {
                BDNetworkSpeedTest bDNetworkSpeedTest = this.LIZ;
                if (bDNetworkSpeedTest == null) {
                    bDNetworkSpeedTest = null;
                }
                bDNetworkSpeedTest.close();
            }

            @Override // X.AbstractC2208061BbQ
            public final void LIZIZ() {
                BDNetworkSpeedTest bDNetworkSpeedTest = this.LIZ;
                if (bDNetworkSpeedTest == null) {
                    bDNetworkSpeedTest = null;
                }
                bDNetworkSpeedTest.stop();
            }

            public final void LJ() {
                BDNetworkSpeedTest bDNetworkSpeedTest = this.LIZ;
                if (bDNetworkSpeedTest == null) {
                    bDNetworkSpeedTest = null;
                }
                bDNetworkSpeedTest.start();
            }

            static {
                C1462550oA9.LIZ();
            }

            public final void LIZJ(final C2208431Bc1 c2208431Bc1) {
                BDNetworkSpeedTest bDNetworkSpeedTest = this.LIZ;
                if (bDNetworkSpeedTest == null) {
                    bDNetworkSpeedTest = null;
                }
                bDNetworkSpeedTest.setListener(new BDNetworkSpeedTestListener() { // from class: X.1BbK
                    @Override // com.ss.bduploader.BDNetworkSpeedTestListener
                    public final int speedTestCheckNetState(int i, int i2) {
                        return c2208431Bc1.LIZ();
                    }

                    @Override // com.ss.bduploader.BDNetworkSpeedTestListener
                    public final void onSpeedTestContext(int i, int i2, String str) {
                        if (i != 0) {
                            if (i == 1) {
                                InterfaceC2208021BbM interfaceC2208021BbM = c2208431Bc1;
                                if (str == null) {
                                    str = "";
                                }
                                interfaceC2208021BbM.onSpeedTestContext(2, i2, str);
                                return;
                            }
                            return;
                        }
                        InterfaceC2208021BbM interfaceC2208021BbM2 = c2208431Bc1;
                        if (str == null) {
                            str = "";
                        }
                        interfaceC2208021BbM2.onSpeedTestContext(0, i2, str);
                    }
                });
            }

            public final void LIZLLL(UploadAuthKeyConfig uploadAuthKeyConfig) {
                UploadVideoConfig uploadVideoConfig = uploadAuthKeyConfig.videoConfig;
                if (uploadVideoConfig != null) {
                    STSAuthConfig sTSAuthConfig = uploadVideoConfig.authorizationV2;
                    if (sTSAuthConfig != null) {
                        BDNetworkSpeedTest bDNetworkSpeedTest = new BDNetworkSpeedTest();
                        this.LIZ = bDNetworkSpeedTest;
                        bDNetworkSpeedTest.setIntelligentSpeedTestInfo(C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_smart_upload_test", true), C0C64.LJIILLIIL().LJJ(31744, "intelligent_model_url", "https://sf16-va.tiktokcdn.com/obj/eden-va2/1ubzeh7nuhfps/smart_speed_test.zip", true));
                        BDNetworkSpeedTest bDNetworkSpeedTest2 = this.LIZ;
                        BDNetworkSpeedTest bDNetworkSpeedTest3 = null;
                        if (bDNetworkSpeedTest2 == null) {
                            bDNetworkSpeedTest2 = null;
                        }
                        bDNetworkSpeedTest2.setIntelligentProtocolInfo(C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_smart_upload_protocol", true), C0C64.LJIILLIIL().LJJ(31744, "smart_protocol_model_url", "https://sf16-va.tiktokcdn.com/obj/eden-va2/1ubzeh7nuhfps/smart_speed_test.zip", true));
                        BDNetworkSpeedTest bDNetworkSpeedTest4 = this.LIZ;
                        if (bDNetworkSpeedTest4 == null) {
                            bDNetworkSpeedTest4 = null;
                        }
                        bDNetworkSpeedTest4.setTopAccessKey(sTSAuthConfig.accessKeyId);
                        BDNetworkSpeedTest bDNetworkSpeedTest5 = this.LIZ;
                        if (bDNetworkSpeedTest5 == null) {
                            bDNetworkSpeedTest5 = null;
                        }
                        bDNetworkSpeedTest5.setTopSecretKey(sTSAuthConfig.secretAccessKey);
                        BDNetworkSpeedTest bDNetworkSpeedTest6 = this.LIZ;
                        if (bDNetworkSpeedTest6 == null) {
                            bDNetworkSpeedTest6 = null;
                        }
                        bDNetworkSpeedTest6.setTopSessionToken(sTSAuthConfig.sessionToken);
                        BDNetworkSpeedTest bDNetworkSpeedTest7 = this.LIZ;
                        if (bDNetworkSpeedTest7 == null) {
                            bDNetworkSpeedTest7 = null;
                        }
                        bDNetworkSpeedTest7.setSpaceName(sTSAuthConfig.spaceName);
                        BDNetworkSpeedTest bDNetworkSpeedTest8 = this.LIZ;
                        if (bDNetworkSpeedTest8 == null) {
                            bDNetworkSpeedTest8 = null;
                        }
                        bDNetworkSpeedTest8.setMaxFailTime(uploadVideoConfig.maxFailTime);
                        BDNetworkSpeedTest bDNetworkSpeedTest9 = this.LIZ;
                        if (bDNetworkSpeedTest9 == null) {
                            bDNetworkSpeedTest9 = null;
                        }
                        bDNetworkSpeedTest9.setUploadDomain(uploadVideoConfig.videoHostName);
                        BDNetworkSpeedTest bDNetworkSpeedTest10 = this.LIZ;
                        if (bDNetworkSpeedTest10 == null) {
                            bDNetworkSpeedTest10 = null;
                        }
                        bDNetworkSpeedTest10.setRWTimeout(uploadVideoConfig.sliceTimeout);
                        BDNetworkSpeedTest bDNetworkSpeedTest11 = this.LIZ;
                        if (bDNetworkSpeedTest11 == null) {
                            bDNetworkSpeedTest11 = null;
                        }
                        bDNetworkSpeedTest11.setFileRetryCount(uploadVideoConfig.fileRetryCount);
                        BDNetworkSpeedTest bDNetworkSpeedTest12 = this.LIZ;
                        if (bDNetworkSpeedTest12 == null) {
                            bDNetworkSpeedTest12 = null;
                        }
                        bDNetworkSpeedTest12.setTcpOpenTimeOutMilliSec(uploadVideoConfig.openTimeOut);
                        BDNetworkSpeedTest bDNetworkSpeedTest13 = this.LIZ;
                        if (bDNetworkSpeedTest13 == null) {
                            bDNetworkSpeedTest13 = null;
                        }
                        bDNetworkSpeedTest13.setEnableExternDNS(uploadVideoConfig.enableExternDNS);
                        BDNetworkSpeedTest bDNetworkSpeedTest14 = this.LIZ;
                        if (bDNetworkSpeedTest14 == null) {
                            bDNetworkSpeedTest14 = null;
                        }
                        bDNetworkSpeedTest14.setThreadModelVersion(((Number) C0AS0.LIZ.getValue()).intValue());
                        BDUploadResolver.setEnableTTNetDNS(uploadVideoConfig.enableTTNetDNS);
                        UploadSettingConfig uploadSettingConfig = uploadAuthKeyConfig.uploadSettingConfig;
                        if (uploadSettingConfig != null) {
                            BDUploadResolver.setDNSType(uploadSettingConfig.dnsVersion, uploadSettingConfig.dnsMainType, uploadSettingConfig.dnsBackType, uploadSettingConfig.dnsBackupUsedDelayTime, uploadSettingConfig.dnsExpiredTime);
                            HTTPDNS.setDNSServerHost(uploadSettingConfig.dnsOwnServer, uploadSettingConfig.dnsGoogleServer);
                        }
                        BDNetworkSpeedTest bDNetworkSpeedTest15 = this.LIZ;
                        if (bDNetworkSpeedTest15 == null) {
                            bDNetworkSpeedTest15 = null;
                        }
                        C2208411Bbz c2208411Bbz = new C2208411Bbz();
                        c2208411Bbz.LIZ(uploadVideoConfig);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c2208411Bbz.LIZLLL());
                        sbLIZ.append(C0BZ9.LIZ());
                        bDNetworkSpeedTest15.setServerParameter(C2188811AlT.LIZIZ(sbLIZ));
                        BDNetworkSpeedTest bDNetworkSpeedTest16 = this.LIZ;
                        if (bDNetworkSpeedTest16 == null) {
                            bDNetworkSpeedTest16 = null;
                        }
                        bDNetworkSpeedTest16.setEnableHttps(uploadVideoConfig.enableHttps);
                        int i = uploadVideoConfig.mainNetworkType;
                        C1462550oA9.LIZIZ(i);
                        int i2 = uploadVideoConfig.backupNetworkType;
                        C1462550oA9.LIZIZ(i2);
                        BDNetworkSpeedTest bDNetworkSpeedTest17 = this.LIZ;
                        if (bDNetworkSpeedTest17 == null) {
                            bDNetworkSpeedTest17 = null;
                        }
                        bDNetworkSpeedTest17.setNetworkType(403, i);
                        BDNetworkSpeedTest bDNetworkSpeedTest18 = this.LIZ;
                        if (bDNetworkSpeedTest18 == null) {
                            bDNetworkSpeedTest18 = null;
                        }
                        bDNetworkSpeedTest18.setNetworkType(404, i2);
                        if (uploadVideoConfig.enableQuic == 1) {
                            BDNetworkSpeedTest bDNetworkSpeedTest19 = this.LIZ;
                            if (bDNetworkSpeedTest19 != null) {
                                bDNetworkSpeedTest3 = bDNetworkSpeedTest19;
                            }
                            bDNetworkSpeedTest3.setDataTransportProtocol(2);
                            return;
                        }
                        BDNetworkSpeedTest bDNetworkSpeedTest20 = this.LIZ;
                        if (bDNetworkSpeedTest20 != null) {
                            bDNetworkSpeedTest3 = bDNetworkSpeedTest20;
                        }
                        bDNetworkSpeedTest3.setDataTransportProtocol(0);
                        return;
                    }
                    throw new IllegalArgumentException("upload video authorization2 config is null");
                }
                throw new IllegalArgumentException("upload video config is null");
            }
        };
        r4.LIZLLL((UploadAuthKeyConfig) c1d1c.l1);
        final C2208451Bc3 c2208451Bc3 = (C2208451Bc3) c1d1c.l0;
        final UploadAuthKeyConfig uploadAuthKeyConfig = (UploadAuthKeyConfig) c1d1c.l1;
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        r4.LIZJ(new InterfaceC2208021BbM() { // from class: X.1Bc1
            @Override // X.InterfaceC2208021BbM
            public final int LIZ() {
                UploadVideoConfig uploadVideoConfig = uploadAuthKeyConfig.videoConfig;
                if (uploadVideoConfig != null) {
                    return C1404960mfG.LIZ(uploadVideoConfig, "BDUploadSpeedProbe");
                }
                throw new IllegalArgumentException("upload video config is null");
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0015  */
            @Override // X.InterfaceC2208021BbM
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSpeedTestContext(int r11, int r12, java.lang.String r13) {
                /*
                    r10 = this;
                    r4 = 0
                    r0 = 1
                    r6 = r13
                    if (r11 == 0) goto L4b
                    if (r11 == r0) goto L4b
                    r3 = 0
                    r0 = 2
                    if (r11 == r0) goto L26
                    r0 = 3
                    if (r11 == r0) goto L26
                    r2 = 0
                    r0 = 4
                    if (r11 != r0) goto L27
                    r1 = 1
                L13:
                    if (r3 != 0) goto L4b
                    if (r1 != 0) goto L38
                    if (r4 != 0) goto L38
                    if (r2 == 0) goto L2d
                    X.09AJ<X.1Anp> r1 = r1
                    X.1Bc2 r0 = new X.1Bc2
                    r0.<init>()
                    r1.tryOnError(r0)
                    return
                L26:
                    r2 = 1
                L27:
                    r1 = 0
                    r0 = 5
                    if (r11 != r0) goto L13
                    r4 = 1
                    goto L13
                L2d:
                    X.1Bc3 r0 = r4
                    r0.getClass()
                    java.lang.String r0 = "error vidContextType onSpeedVidContext"
                    X.C2208451Bc3.LIZJ(r0)
                    return
                L38:
                    X.09AJ<X.1Anp> r0 = r1
                    X.1Anp r1 = new X.1Anp
                    long r2 = (long) r12
                    r9 = 0
                    long r4 = r2
                    long r7 = java.lang.System.currentTimeMillis()
                    r1.<init>(r2, r4, r6, r7, r9)
                    r0.onNext(r1)
                    return
                L4b:
                    X.09AJ<X.1Anp> r0 = r1
                    X.1Anp r1 = new X.1Anp
                    long r2 = (long) r12
                    r9 = 1
                    long r4 = r2
                    long r7 = java.lang.System.currentTimeMillis()
                    r1.<init>(r2, r4, r6, r7, r9)
                    r0.onNext(r1)
                    X.09AJ<X.1Anp> r0 = r1
                    r0.onComplete()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2208431Bc1.onSpeedTestContext(int, int, java.lang.String):void");
            }
        });
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 524288, "upload_speed_probe_size", true);
        int iLJIJ2 = C0C64.LJIILLIIL().LJIJ(31744, 1, "upload_speed_probe_retry_count", true);
        int iLIZ = C1456370o0B.LIZ();
        SettingsManager.LIZLLL().getClass();
        int iLJ = SettingsManager.LJ("tool_upload_speed_probe_single_host_total_timeout_s", 0);
        C2208451Bc3 c2208451Bc32 = (C2208451Bc3) c1d1c.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startSpeedTest size:");
        sbLIZ.append(iLJIJ);
        sbLIZ.append(" retryCount:");
        sbLIZ.append(iLJIJ2);
        sbLIZ.append(" mode:");
        sbLIZ.append(iLIZ);
        sbLIZ.append(" singleHostTotalTimeout:");
        sbLIZ.append(iLJ);
        C2188811AlT.LIZIZ(sbLIZ);
        c2208451Bc32.getClass();
        r4.LJ();
        ((C2208451Bc3) c1d1c.l0).LIZJ = r4;
        C1C7U.LIZIZ("BDUploadSpeedProbe$StateMachine@6f08.startAction$1$createStartProbeObservable$1");
    }

    public C1D1C(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
