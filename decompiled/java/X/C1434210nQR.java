package X;

import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nQR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434210nQR extends AbstractC1434490nQt {
    public C1431070nLN LLILZLL;
    public UploadAuthKeyConfig LLIZ;
    public C1434960nRe LLIZLLLIL;
    public C1434970nRf LLJ;
    public AbstractC1434250nQV LLJI;
    public InterfaceC1434410nQl LLJIJIL;
    public C1434590nR3 LLJILJIL;
    public String LLJILJILJ = "";
    public int LLJILLL;
    public volatile boolean LLJJ;

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.UPLOAD;
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final boolean LIZLLL(Object obj) {
        super.LIZLLL(obj);
        if (!this.LLJJ) {
            this.LLJJ = true;
            C1431070nLN c1431070nLN = this.LLILZLL;
            if (c1431070nLN != null) {
                c1431070nLN.LIZIZ(new C1404990mfJ("PcsCourseVideoUploadTask", "UploadVideoTask pause"), EnumC2251001D8o.OUTER);
            }
            AbstractC1434250nQV abstractC1434250nQV = this.LLJI;
            if (abstractC1434250nQV != null) {
                abstractC1434250nQV.LJFF();
            }
            C1431070nLN c1431070nLN2 = this.LLILZLL;
            if (c1431070nLN2 != null) {
                c1431070nLN2.LIZIZ(C1431170nLX.LIZ, EnumC2251001D8o.OUTER);
            }
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final void LJ(Object obj) {
        super.LJ(obj);
        if (this.LLJJ) {
            C1431070nLN c1431070nLN = this.LLILZLL;
            if (c1431070nLN != null) {
                c1431070nLN.LIZIZ(new C1404990mfJ("PcsCourseVideoUploadTask", "UploadVideoTask resume"), EnumC2251001D8o.OUTER);
            }
            AbstractC1434250nQV abstractC1434250nQV = this.LLJI;
            if (abstractC1434250nQV != null) {
                abstractC1434250nQV.LJI();
            }
            C1431070nLN c1431070nLN2 = this.LLILZLL;
            if (c1431070nLN2 != null) {
                c1431070nLN2.LIZIZ(C1431160nLW.LIZ, EnumC2251001D8o.OUTER);
            }
            this.LLJJ = false;
        }
    }

    public final void LJIILJJIL(C1434330nQd c1434330nQd) {
        int iLJII = C1431420nLw.LJII(c1434330nQd);
        C1444650nhH.LIZ.getClass();
        C1444650nhH.LIZLLL(iLJII);
        C1431070nLN c1431070nLN = this.LLILZLL;
        if (c1431070nLN != null) {
            c1431070nLN.LIZLLL(iLJII, c1434330nQd);
        }
        C0CNO.LIZ(C15O7.LJI, new AwS566S0100000_22(this, 1004));
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final boolean LIZIZ(AbstractC1404540mea abstractC1404540mea, InterfaceC1434410nQl interfaceC1434410nQl) {
        super.LIZIZ(abstractC1404540mea, interfaceC1434410nQl);
        this.LLJIJIL = interfaceC1434410nQl;
        return true;
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        Object next;
        VideoPublishEditModel videoPublishEditModel;
        Object next2;
        UploadAuthKeyConfig uploadAuthKeyConfig;
        Object next3;
        Object next4;
        final UploadVideoConfig uploadVideoConfig;
        VideoPublishEditModel videoPublishEditModel2;
        AbstractC1434250nQV abstractC1434250nQV;
        Object next5;
        Object next6;
        CreativeModel creativeModel;
        CommonMobParamModel commonMobParamModel;
        this.LLILZLL = c1431070nLN;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next == null || (next instanceof C1434960nRe)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1434960nRe c1434960nRe = (C1434960nRe) next;
        this.LLIZLLLIL = c1434960nRe;
        if (c1434960nRe != null) {
            videoPublishEditModel = c1434960nRe.LIZ;
        } else {
            videoPublishEditModel = null;
        }
        Iterator<Object> it3 = c1404610meh.LIZ.iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (next2 instanceof C1434470nQr) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        boolean z = next2 instanceof C1434470nQr;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (commonMobParamModel = creativeModel.commonMobModel) != null) {
            commonMobParamModel.isReCreateAuthkey = false;
        }
        Iterator<Object> it4 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next7 = it4.next();
            if (next7 instanceof C1404770mex) {
                if (next7 != null) {
                    VideoCreation videoCreation = ((C1404770mex) next7).LIZ;
                    if (videoCreation instanceof UploadAuthKeyConfig) {
                        uploadAuthKeyConfig = (UploadAuthKeyConfig) videoCreation;
                    } else {
                        uploadAuthKeyConfig = null;
                    }
                    this.LLIZ = uploadAuthKeyConfig;
                    Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            next3 = it5.next();
                            if (next3 == null || (next3 instanceof C1434970nRf)) {
                                break;
                            }
                        } else {
                            next3 = null;
                            break;
                        }
                    }
                    this.LLJ = (C1434970nRf) next3;
                    Iterator<Object> it6 = c1404610meh.LIZ.iterator();
                    while (it6.hasNext() && (next6 = it6.next()) != null && !(next6 instanceof C1404570med)) {
                    }
                    Iterator<Object> it7 = c1404610meh.LIZ.iterator();
                    while (it7.hasNext() && (next5 = it7.next()) != null && !(next5 instanceof C1404740meu)) {
                    }
                    Iterator<Object> it8 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next4 = it8.next();
                            if (next4 instanceof C1434590nR3) {
                                break;
                            }
                        } else {
                            next4 = null;
                            break;
                        }
                    }
                    if (!(next4 instanceof C1434590nR3)) {
                        next4 = null;
                    }
                    this.LLJILJIL = (C1434590nR3) next4;
                    C1434960nRe c1434960nRe2 = this.LLIZLLLIL;
                    if (c1434960nRe2 != null && (videoPublishEditModel2 = c1434960nRe2.LIZ) != null) {
                        C571720Mba.LIZ(videoPublishEditModel2, "PcsCourseVideoUploadTask");
                        float videoCoverStartTm = videoPublishEditModel2.getVideoCoverStartTm();
                        String creationId = videoPublishEditModel2.getCreationId();
                        if (videoPublishEditModel2.getUploadSpeedInfo() == null) {
                            new UploadSpeedInfo(-6L, "", -6L, -6L, -1);
                        }
                        LJIIIZ().LIZ();
                        AbstractC1434250nQV abstractC1434250nQVLIZ = C1434320nQc.LIZ();
                        this.LLJI = abstractC1434250nQVLIZ;
                        UploadAuthKeyConfig uploadAuthKeyConfig2 = this.LLIZ;
                        if (uploadAuthKeyConfig2 != null) {
                            abstractC1434250nQVLIZ.LJJIFFI(uploadAuthKeyConfig2, C2097608Jq.LJ());
                        }
                        AbstractC1434250nQV abstractC1434250nQV2 = this.LLJI;
                        if (abstractC1434250nQV2 != null) {
                            abstractC1434250nQV2.LJIILLIIL(false);
                        }
                        AbstractC1434250nQV abstractC1434250nQV3 = this.LLJI;
                        if (abstractC1434250nQV3 != null) {
                            abstractC1434250nQV3.LJIJI(C1428470nHB.LJIIJJI(videoPublishEditModel2));
                        }
                        if (((Boolean) C287460BOm.LIZ.getValue()).booleanValue() && (abstractC1434250nQV = this.LLJI) != null) {
                            abstractC1434250nQV.LJII("publish_course");
                        }
                        AbstractC1434250nQV abstractC1434250nQV4 = this.LLJI;
                        if (abstractC1434250nQV4 != null) {
                            abstractC1434250nQV4.LJIJJLI(C0A2I.LIZ());
                        }
                        AbstractC1434250nQV abstractC1434250nQV5 = this.LLJI;
                        if (abstractC1434250nQV5 != null) {
                            abstractC1434250nQV5.LJIILJJIL(videoCoverStartTm);
                        }
                        AbstractC1434250nQV abstractC1434250nQV6 = this.LLJI;
                        if (abstractC1434250nQV6 != null) {
                            abstractC1434250nQV6.LJJI(creationId);
                        }
                    }
                    UploadAuthKeyConfig uploadAuthKeyConfig3 = this.LLIZ;
                    if (uploadAuthKeyConfig3 != null) {
                        uploadVideoConfig = uploadAuthKeyConfig3.videoConfig;
                    } else {
                        uploadVideoConfig = null;
                    }
                    AbstractC1434250nQV abstractC1434250nQV7 = this.LLJI;
                    if (abstractC1434250nQV7 != null) {
                        abstractC1434250nQV7.LJIIL(new InterfaceC2208121BbW() { // from class: X.0nQT
                            @Override // X.InterfaceC2208121BbW
                            public final String getStringFromExtern(int i) {
                                return null;
                            }

                            @Override // X.InterfaceC2208121BbW
                            public final void LIZ(int i) {
                                C1431070nLN c1431070nLN2 = this.LIZ.LLILZLL;
                                if (c1431070nLN2 == null) {
                                    return;
                                }
                                c1431070nLN2.LIZIZ(new C1405130mfX(i), EnumC2251001D8o.OUTER);
                            }

                            @Override // X.InterfaceC2208121BbW
                            public final int LIZIZ(int i) {
                                UploadVideoConfig uploadVideoConfig2;
                                String str;
                                PublishModel publishModel;
                                VideoPublishEditModel videoPublishEditModel3;
                                boolean zLIZJ = C0Z6N.LIZJ();
                                if (uploadVideoConfig == null) {
                                    Pair[] pairArr = new Pair[3];
                                    C1434960nRe c1434960nRe3 = this.LIZ.LLIZLLLIL;
                                    Integer numValueOf = null;
                                    if (c1434960nRe3 != null && (videoPublishEditModel3 = c1434960nRe3.LIZ) != null) {
                                        str = videoPublishEditModel3.mShootWay;
                                    } else {
                                        str = null;
                                    }
                                    pairArr[0] = new Pair("shoot_way", str);
                                    C1434970nRf c1434970nRf = this.LIZ.LLJ;
                                    if (c1434970nRf != null && (publishModel = c1434970nRf.LIZ) != null) {
                                        numValueOf = Integer.valueOf(publishModel.publishType);
                                    }
                                    pairArr[1] = new Pair("pre_publish_type", String.valueOf(numValueOf));
                                    pairArr[2] = new Pair("network_available", String.valueOf(zLIZJ));
                                    Npth.reportBizException("publisher", new Throwable("no_authkey_when_upload_check_net"), "no_authkey_when_upload_check_net", C2097608Jq.LJIIIIZZ(pairArr));
                                    return -1;
                                }
                                C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                                String strLJIILIIL = this.LIZ.LJIILIIL();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("[CheckNetState]scene=");
                                sbLIZ.append(i);
                                sbLIZ.append(", net=");
                                sbLIZ.append(zLIZJ);
                                c1437510nVlLJJLIIIJ.LIZ(strLJIILIIL, C2188811AlT.LIZIZ(sbLIZ));
                                if (i == 0 && (uploadVideoConfig2 = uploadVideoConfig) != null) {
                                    return C1404960mfG.LIZ(uploadVideoConfig2, "ConcurrentUpload");
                                }
                                if (zLIZJ) {
                                    return 1;
                                }
                                if (((Number) C0BW0.LIZ.getValue()).intValue() == 0) {
                                    return 0;
                                }
                                if (C0Z6N.LIZIZ(new AwS566S0100000_22(this.LIZ, 1005), true)) {
                                    return 2;
                                }
                                return 1;
                            }

                            @Override // X.InterfaceC2208121BbW
                            public final void LIZJ(int i, long j, C1431630nMH c1431630nMH) {
                                VideoPublishEditModel videoPublishEditModel3;
                                String outputFile;
                                long length;
                                C1431070nLN c1431070nLN2;
                                C1434210nQR c1434210nQR = this.LIZ;
                                C1434960nRe c1434960nRe3 = c1434210nQR.LLIZLLLIL;
                                if (c1434960nRe3 != null) {
                                    videoPublishEditModel3 = c1434960nRe3.LIZ;
                                } else {
                                    videoPublishEditModel3 = null;
                                }
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i != 4) {
                                                if (i == 5 && (c1431070nLN2 = c1434210nQR.LLILZLL) != null) {
                                                    EnumC1431770nMV enumC1431770nMV = c1431630nMH.LJIIIZ;
                                                    long j2 = c1431630nMH.LJIIJ;
                                                    int i2 = c1434210nQR.LLJILLL + 1;
                                                    c1434210nQR.LLJILLL = i2;
                                                    c1431070nLN2.LIZIZ(new C1434370nQh(enumC1431770nMV, j2, i2), EnumC2251001D8o.OUTER);
                                                    return;
                                                }
                                                return;
                                            }
                                            c1431630nMH.LJFF = -39993L;
                                            InterfaceC1434410nQl interfaceC1434410nQl = c1434210nQR.LLJIJIL;
                                            if (interfaceC1434410nQl == null) {
                                                C1431070nLN c1431070nLN3 = c1434210nQR.LLILZLL;
                                                if (c1431070nLN3 != null) {
                                                    c1431070nLN3.LIZIZ(new C1434350nQf("PcsCourseVideoUploadTask"), EnumC2251001D8o.OUTER);
                                                }
                                            } else {
                                                interfaceC1434410nQl.LIZ(new C1434330nQd(c1431630nMH, null, 2, null));
                                            }
                                            C0CNO.LIZ(C15O7.LJI, new AwS566S0100000_22(c1434210nQR, 1004));
                                            return;
                                        }
                                        C1431070nLN c1431070nLN4 = c1434210nQR.LLILZLL;
                                        if (c1431070nLN4 != null) {
                                            c1431070nLN4.LIZIZ(new C1411860mqO(j / 100.0f), EnumC2251001D8o.OUTER);
                                        }
                                        try {
                                            C0CHQ.LIZ().getPublishService().LJJIIZI().getClass();
                                            C1436930nUp.LIZ();
                                            return;
                                        } catch (C1431430nLx e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            c1434210nQR.LJIILJJIL(new C1434330nQd(C1431470nM1.LIZ(-88888888), e));
                                            return;
                                        }
                                    }
                                    c1434210nQR.LJIILJJIL(new C1434330nQd(c1431630nMH, null, 2, null));
                                    return;
                                }
                                if (videoPublishEditModel3 == null || (outputFile = videoPublishEditModel3.getOutputFile()) == null) {
                                    outputFile = "";
                                }
                                C0VSJ c0vsj = new C0VSJ(outputFile);
                                if (c0vsj.exists()) {
                                    length = c0vsj.length();
                                } else {
                                    length = -1;
                                }
                                C1404850mf5 c1404850mf5 = new C1404850mf5(0L, 0L, -1L, -1L, length, 32);
                                C1431070nLN c1431070nLN5 = c1434210nQR.LLILZLL;
                                if (c1431070nLN5 == null) {
                                    return;
                                }
                                c1431070nLN5.LJ(new C1404470meT(C1430270nK5.LIZ(c1431630nMH), c1404850mf5), false);
                            }

                            @Override // X.InterfaceC2208121BbW
                            public final void onLog(int i, int i2, String str) {
                                C1431070nLN c1431070nLN2 = this.LIZ.LLILZLL;
                                if (c1431070nLN2 != null) {
                                    if (str == null) {
                                        str = "";
                                    }
                                    c1431070nLN2.LIZIZ(new C1434360nQg(i, i2, str), EnumC2251001D8o.OUTER);
                                }
                            }
                        });
                    }
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1434580nR2(this, null), 3);
                    try {
                        C1431730nMR c1431730nMRLJJIIZI = C0CHQ.LIZ().getPublishService().LJJIIZI();
                        new AwS601S0100000_22(this, 760);
                        c1431730nMRLJJIIZI.getClass();
                        C1436930nUp.LIZ();
                        return;
                    } catch (C1431430nLx e) {
                        TryCatchGuardChecker.doCheck(e);
                        LJIILJJIL(new C1434330nQd(C1431470nM1.LIZ(e.getErrorCode()), e));
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.AuthKeyResult");
    }
}
