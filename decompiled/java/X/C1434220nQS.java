package X;

import android.text.TextUtils;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nQS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434220nQS {
    public final C1431550nM9 LIZ;
    public AbstractC1434250nQV LIZIZ;
    public C1434460nQq LIZJ;

    public C1434220nQS(InterfaceC1434300nQa interfaceC1434300nQa, C1431070nLN c1431070nLN, C1431550nM9 c1431550nM9) {
        this.LIZ = c1431550nM9;
        interfaceC1434300nQa.LJIIIIZZ().getClass();
        new C1404950mfF();
        this.LIZJ = new C1434460nQq(c1431070nLN, C1404950mfF.LIZJ());
    }

    public final void LIZIZ(C1434960nRe c1434960nRe, VideoCreation videoCreation, InterfaceC1434300nQa interfaceC1434300nQa, C1431560nMA c1431560nMA) {
        boolean z;
        AbstractC1434250nQV abstractC1434250nQV;
        AbstractC1434250nQV abstractC1434250nQV2;
        AbstractC1434250nQV abstractC1434250nQV3;
        AbstractC1434250nQV abstractC1434250nQV4;
        STSAuthConfig sTSAuthConfig;
        String str;
        VideoPublishEditModel videoPublishEditModel = c1434960nRe.LIZ;
        C571720Mba.LIZ(videoPublishEditModel, "UploadVideoHelper");
        UploadAuthKeyConfig uploadAuthKeyConfig = (UploadAuthKeyConfig) videoCreation;
        UploadVideoConfig uploadVideoConfig = uploadAuthKeyConfig.videoConfig;
        if (uploadVideoConfig != null && (sTSAuthConfig = uploadVideoConfig.livephotoAuthorization2) != null && (str = sTSAuthConfig.accessKeyId) != null && C123100dR.LIZ(str) && (videoPublishEditModel.isCurrentAutoCutMode() || !videoPublishEditModel.isLivePhotoEdit() || !C295850Bih.LIZ() || videoPublishEditModel.getTtStoryUploadModel() == null || !C1428470nHB.LJJZZI(videoPublishEditModel))) {
            uploadVideoConfig.authorizationV2 = uploadVideoConfig.livephotoAuthorization2;
        }
        float videoCoverStartTm = videoPublishEditModel.getVideoCoverStartTm();
        String creationId = videoPublishEditModel.getCreationId();
        UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel.getUploadSpeedInfo();
        if (uploadSpeedInfo == null) {
            uploadSpeedInfo = new UploadSpeedInfo(-6L, "", -6L, -6L, -1);
        }
        if (videoPublishEditModel.isPrivate == 1) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1434300nQa.LIZ();
        AbstractC1434250nQV abstractC1434250nQVLIZ = C1434320nQc.LIZ();
        this.LIZIZ = abstractC1434250nQVLIZ;
        abstractC1434250nQVLIZ.LJJIFFI(uploadAuthKeyConfig, C2097608Jq.LJ());
        AbstractC1434250nQV abstractC1434250nQV5 = this.LIZIZ;
        if (abstractC1434250nQV5 != null) {
            abstractC1434250nQV5.LJIJI(C1428470nHB.LJIIJJI(videoPublishEditModel));
        }
        if (((Boolean) C287460BOm.LIZ.getValue()).booleanValue() && (abstractC1434250nQV4 = this.LIZIZ) != null) {
            abstractC1434250nQV4.LJII("publish_livephoto");
        }
        if (z && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_private_video_encryption", true, false) && (abstractC1434250nQV3 = this.LIZIZ) != null) {
            abstractC1434250nQV3.LJIIZILJ();
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "tool_upload_retry_state_switch", true, false) && (abstractC1434250nQV2 = this.LIZIZ) != null) {
            abstractC1434250nQV2.LJIJ();
        }
        String probeContext = uploadSpeedInfo.getProbeContext();
        C1431550nM9 c1431550nM9 = this.LIZ;
        if (!TextUtils.isEmpty(probeContext) && c1431550nM9 != null) {
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 800, "upload_speed_test_threshold", true);
            uploadSpeedInfo.getSpeed();
            InterfaceC1434290nQZ interfaceC1434290nQZ = c1431560nMA.LJ;
            if (interfaceC1434290nQZ != null) {
                interfaceC1434290nQZ.LJII();
            }
            AbstractC1434250nQV abstractC1434250nQV6 = this.LIZIZ;
            if (abstractC1434250nQV6 != null) {
                abstractC1434250nQV6.LJIIIIZZ(probeContext);
            }
            AbstractC1434250nQV abstractC1434250nQV7 = this.LIZIZ;
            if (abstractC1434250nQV7 != null) {
                abstractC1434250nQV7.LJJ((int) uploadSpeedInfo.getSpeed());
            }
            if (iLJIJ > 0 && (abstractC1434250nQV = this.LIZIZ) != null) {
                abstractC1434250nQV.LJIL(iLJIJ);
            }
            if (C0CHQ.LIZ().getPublishService().LJJIJIIJI().LIZ().LIZJ()) {
                uploadSpeedInfo.setProbeContext("");
            }
        }
        AbstractC1434250nQV abstractC1434250nQV8 = this.LIZIZ;
        if (abstractC1434250nQV8 != null) {
            abstractC1434250nQV8.LJIJJLI(C0A2I.LIZ());
        }
        AbstractC1434250nQV abstractC1434250nQV9 = this.LIZIZ;
        if (abstractC1434250nQV9 != null) {
            abstractC1434250nQV9.LJIILJJIL(videoCoverStartTm);
        }
        AbstractC1434250nQV abstractC1434250nQV10 = this.LIZIZ;
        if (abstractC1434250nQV10 != null) {
            abstractC1434250nQV10.LJJI(creationId);
        }
    }

    public final AbstractC1434250nQV LIZ(final C1434960nRe c1434960nRe, VideoCreation videoCreation, InterfaceC1434300nQa interfaceC1434300nQa, int i, boolean z, final C1431560nMA c1431560nMA, AFwS261S0000000_22 aFwS261S0000000_22) {
        final UploadVideoConfig uploadVideoConfig;
        String str;
        AbstractC1434250nQV abstractC1434250nQV;
        String str2;
        UploadAuthKeyConfig uploadAuthKeyConfig;
        String str3 = null;
        try {
            LIZIZ(c1434960nRe, videoCreation, interfaceC1434300nQa, c1431560nMA);
            final C1431550nM9 c1431550nM9 = this.LIZ;
            final AbstractC1434250nQV abstractC1434250nQV2 = this.LIZIZ;
            final VideoPublishEditModel videoPublishEditModel = c1434960nRe.LIZ;
            if ((videoCreation instanceof UploadAuthKeyConfig) && (uploadAuthKeyConfig = (UploadAuthKeyConfig) videoCreation) != null) {
                uploadVideoConfig = uploadAuthKeyConfig.videoConfig;
            } else {
                uploadVideoConfig = null;
            }
            if (c1431550nM9 != null && abstractC1434250nQV2 != null) {
                abstractC1434250nQV2.LJIIL(new InterfaceC2208121BbW() { // from class: X.0nQU
                    @Override // X.InterfaceC2208121BbW
                    public final void LIZ(int i2) {
                        C1431560nMA c1431560nMA2 = c1431560nMA;
                        C1405130mfX c1405130mfX = new C1405130mfX(i2);
                        InterfaceC1434290nQZ interfaceC1434290nQZ = c1431560nMA2.LJ;
                        if (interfaceC1434290nQZ != null) {
                            interfaceC1434290nQZ.LIZJ(c1405130mfX);
                        }
                    }

                    @Override // X.InterfaceC2208121BbW
                    public final int LIZIZ(int i2) {
                        boolean zLIZJ = C0Z6N.LIZJ();
                        if (uploadVideoConfig == null) {
                            Npth.reportBizException("publisher", new Throwable("no_authkey_when_upload_check_net"), "no_authkey_when_upload_check_net", C2097608Jq.LJIIIIZZ(new Pair("shoot_way", c1434960nRe.LIZ.mShootWay), new Pair("network_available", String.valueOf(zLIZJ))));
                            return -1;
                        }
                        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[CheckNetState]scene=");
                        sbLIZ.append(i2);
                        sbLIZ.append(", net=");
                        sbLIZ.append(zLIZJ);
                        c1437510nVlLJJLIIIJ.LIZ("UploadVideoHelper", C2188811AlT.LIZIZ(sbLIZ));
                        if (i2 == 0) {
                            return C1404960mfG.LIZ(uploadVideoConfig, "ConcurrentUpload");
                        }
                        if (zLIZJ) {
                            return 1;
                        }
                        if (((Number) C0BW0.LIZ.getValue()).intValue() == 0) {
                            return 0;
                        }
                        if (C0Z6N.LIZIZ(new AwS566S0100000_22(abstractC1434250nQV2, 1124), true)) {
                            return 2;
                        }
                        return 1;
                    }

                    @Override // X.InterfaceC2208121BbW
                    public final String getStringFromExtern(int i2) {
                        if (i2 == 2 || i2 == 3) {
                            return null;
                        }
                        C1433120nOg c1433120nOg = C1433120nOg.LIZ;
                        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                        c1433120nOg.getClass();
                        String strLIZ = C1433120nOg.LIZ(videoPublishEditModel2, null);
                        videoPublishEditModel.setMetadataMap(null);
                        return strLIZ;
                    }

                    @Override // X.InterfaceC2208121BbW
                    public final void LIZJ(int i2, long j, C1431630nMH c1431630nMH) {
                        C1434460nQq c1434460nQq = this.LIZ.LIZJ;
                        if (c1434460nQq != null) {
                            c1434460nQq.LIZJ(i2, j, c1431630nMH);
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 == 5) {
                                            C1450070nq1.LIZLLL("Debug-F ResumeUploadFromDisk upload retry");
                                            InterfaceC1434290nQZ interfaceC1434290nQZ = c1431560nMA.LJ;
                                            if (interfaceC1434290nQZ != null) {
                                                interfaceC1434290nQZ.LIZ();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    C1450070nq1.LIZLLL("Debug-F ResumeUploadFromDisk upload cancel");
                                    C1431560nMA c1431560nMA2 = c1431560nMA;
                                    AbstractC1434250nQV abstractC1434250nQV3 = abstractC1434250nQV2;
                                    InterfaceC1434290nQZ interfaceC1434290nQZ2 = c1431560nMA2.LJ;
                                    if (interfaceC1434290nQZ2 != null) {
                                        interfaceC1434290nQZ2.LJ(abstractC1434250nQV3, c1431630nMH);
                                    }
                                    c1431560nMA2.LIZ(false);
                                    return;
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Debug-F ResumeUploadFromDisk progress=");
                                sbLIZ.append(j);
                                C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                                C1431560nMA c1431560nMA3 = c1431560nMA;
                                C1431550nM9 c1431550nM92 = c1431550nM9;
                                float f = j;
                                InterfaceC1434290nQZ interfaceC1434290nQZ3 = c1431560nMA3.LJ;
                                if (interfaceC1434290nQZ3 == null) {
                                    return;
                                }
                                interfaceC1434290nQZ3.LJFF(c1431550nM92, f);
                                return;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Debug-F ResumeUploadFromDisk  upload failed info = ");
                            sbLIZ2.append(c1431630nMH);
                            sbLIZ2.append("  messge =  ");
                            sbLIZ2.append(c1431630nMH.LJI);
                            C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                            C1434330nQd c1434330nQd = new C1434330nQd(c1431630nMH, null, 2, null);
                            C1431420nLw.LJFF(c1434330nQd);
                            C1431560nMA c1431560nMA4 = c1431560nMA;
                            InterfaceC1434290nQZ interfaceC1434290nQZ4 = c1431560nMA4.LJ;
                            if (interfaceC1434290nQZ4 != null) {
                                interfaceC1434290nQZ4.LJIIIIZZ(c1434330nQd);
                            }
                            c1431560nMA4.LIZ(false);
                            return;
                        }
                        C1450070nq1.LIZLLL("Debug-F ResumeUploadFromDisk  upload completed");
                        C1431560nMA c1431560nMA5 = c1431560nMA;
                        C1431550nM9 c1431550nM93 = c1431550nM9;
                        InterfaceC1434290nQZ interfaceC1434290nQZ5 = c1431560nMA5.LJ;
                        if (interfaceC1434290nQZ5 != null) {
                            interfaceC1434290nQZ5.LJIIIZ(c1431550nM93, c1431630nMH);
                        }
                        c1431560nMA5.LIZ(true);
                    }

                    @Override // X.InterfaceC2208121BbW
                    public final void onLog(int i2, int i3, String str4) {
                        InterfaceC1434290nQZ interfaceC1434290nQZ = c1431560nMA.LJ;
                        if (interfaceC1434290nQZ != null) {
                            interfaceC1434290nQZ.LIZIZ();
                        }
                    }
                });
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("begin  upload livephoto start path = ");
            C1431550nM9 c1431550nM92 = this.LIZ;
            if (c1431550nM92 != null) {
                str = c1431550nM92.LIZ;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            AbstractC1434250nQV abstractC1434250nQV3 = this.LIZIZ;
            if (abstractC1434250nQV3 != null) {
                C1431550nM9 c1431550nM93 = this.LIZ;
                if (c1431550nM93 == null || (str2 = c1431550nM93.LIZ) == null) {
                    str2 = "";
                }
                abstractC1434250nQV3.LJIILIIL(str2);
            }
            AbstractC1434250nQV abstractC1434250nQV4 = this.LIZIZ;
            if (abstractC1434250nQV4 != null) {
                abstractC1434250nQV4.LJIIIZ("");
            }
            if (i > 0 && this.LIZ != null) {
                InterfaceC1434290nQZ interfaceC1434290nQZ = c1431560nMA.LJ;
                if (interfaceC1434290nQZ != null) {
                    interfaceC1434290nQZ.LJI();
                }
                AbstractC1434250nQV abstractC1434250nQV5 = this.LIZIZ;
                if (abstractC1434250nQV5 != null) {
                    abstractC1434250nQV5.LJIILL(i);
                }
                if (z && (abstractC1434250nQV = this.LIZIZ) != null) {
                    abstractC1434250nQV.LIZ();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("begin start upload livephoto error e = ");
            sbLIZ2.append(e.getMessage());
            sbLIZ2.append("  path = ");
            C1431550nM9 c1431550nM94 = this.LIZ;
            if (c1431550nM94 != null) {
                str3 = c1431550nM94.LIZ;
            }
            sbLIZ2.append(str3);
            C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
            new C1434330nQd(C1431470nM1.LIZ(-39997), e);
            aFwS261S0000000_22.getClass();
        }
        return this.LIZIZ;
    }
}
