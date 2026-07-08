package X;

import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.wavepublish.experiment.EnableParallelPublishSchedulerV2Exp;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;

/* JADX INFO: renamed from: X.0nS1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435190nS1 implements InterfaceC1433580nPQ {
    public final C1433530nPL LIZ;
    public final String LIZIZ;
    public final C1430790nKv LIZJ;
    public final InterfaceC1434300nQa LIZLLL;
    public volatile C1D80 LJFF;
    public final C1434970nRf LJII;
    public final C1434960nRe LJIIIIZZ;
    public AbstractC1433570nPP LJIIIZ;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(541));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1135));

    @Override // X.InterfaceC1433580nPQ
    public final void LJI() {
    }

    @Override // X.InterfaceC1433580nPQ
    public final boolean LJIILLIIL() {
        return false;
    }

    @Override // X.InterfaceC1433580nPQ
    public final boolean LJIJ() {
        return false;
    }

    @Override // X.InterfaceC1433580nPQ
    public final void reStart() {
        C1D80 c1d80 = this.LJFF;
        if (c1d80 == null) {
            c1d80 = null;
        }
        c1d80.LJII();
    }

    @Override // X.InterfaceC1433580nPQ
    public final void LJIILL(C1433230nOr c1433230nOr) {
        if (this.LJFF != null) {
            C1D80 c1d80 = this.LJFF;
            if (c1d80 == null) {
                c1d80 = null;
            }
            c1d80.LIZIZ(c1433230nOr);
        }
    }

    @Override // X.InterfaceC1433580nPQ
    public final void LJIIZILJ(AbstractC1433570nPP abstractC1433570nPP) {
        boolean z;
        boolean z2;
        boolean z3;
        String videoPath;
        String str;
        String parallelUploadOutputFile;
        C1D82 c1d82;
        C1D82 c1d822;
        boolean z4;
        boolean z5;
        boolean z6;
        List listLJIIJJI;
        String str2;
        String str3;
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        this.LJIIIZ = abstractC1433570nPP;
        DMMediaModel dMMediaModel = this.LJIIIIZZ.LIZ.creativeModel.dmMediaModel;
        C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
        InterfaceC1435230nS5 interfaceC1435230nS5LIZ = c912070ZqH.LJIILLIIL().LJII().LIZ(this.LJII.LIZ.creationId);
        DMMediaModel dMMediaModel2 = this.LJIIIIZZ.LIZ.creativeModel.dmMediaModel;
        if (dMMediaModel2 != null && dMMediaModel2.type == 3) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1435230nS5LIZ.LJIILJJIL(z);
        if (dMMediaModel != null) {
            z2 = dMMediaModel.isSynthesised;
        } else {
            z2 = false;
        }
        interfaceC1435230nS5LIZ.LIZLLL(z2);
        interfaceC1435230nS5LIZ.LJI(EnumC1446110njd.VIDEO);
        interfaceC1435230nS5LIZ.LJIIL();
        if (dMMediaModel != null) {
            z3 = dMMediaModel.isSynthesised;
        } else {
            z3 = false;
        }
        EditPreviewInfo previewInfo = this.LJIIIIZZ.LIZ.getPreviewInfo();
        if (previewInfo != null && (videoList = previewInfo.getVideoList()) != null && (editVideoSegment = (EditVideoSegment) C13LP.LJJJLL(videoList)) != null) {
            videoPath = editVideoSegment.getVideoPath();
        } else {
            videoPath = null;
        }
        if (dMMediaModel != null) {
            str = dMMediaModel.synthesisedFile;
            if (str != null && str.length() != 0) {
                videoPath = str;
            }
        } else {
            str = null;
        }
        if (videoPath != null) {
            long fileSize = c912070ZqH.LJ().getFileSize(videoPath);
            InterfaceC1435230nS5 interfaceC1435230nS5LIZ2 = c912070ZqH.LJIILLIIL().LJII().LIZ(this.LJII.LIZ.creationId);
            interfaceC1435230nS5LIZ2.LJIJI(fileSize);
            if (VEUtils.getVideoFileInfo(videoPath) != null) {
                interfaceC1435230nS5LIZ2.LJIIIIZZ(r0.duration);
            }
            if (dMMediaModel != null && dMMediaModel.isSynthesised) {
                interfaceC1435230nS5LIZ2.LJIILIIL(fileSize);
            }
        }
        boolean z7 = C278160AvG.LIZIZ;
        if (C297810Blr.LIZ()) {
            parallelUploadOutputFile = this.LJIIIIZZ.LIZ.getOutputFile();
        } else {
            parallelUploadOutputFile = this.LJIIIIZZ.LIZ.getParallelUploadOutputFile();
        }
        String outputFile = this.LJIIIIZZ.LIZ.getOutputFile();
        if (z7) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (parallelUploadOutputFile == null) {
                str2 = "";
            } else {
                str2 = parallelUploadOutputFile;
            }
            sbLIZ.append(new C0VSJ(str2).getParent());
            String str4 = File.separator;
            sbLIZ.append(str4);
            sbLIZ.append(hashCode());
            sbLIZ.append('_');
            if (parallelUploadOutputFile == null) {
                parallelUploadOutputFile = "";
            }
            sbLIZ.append(new C0VSJ(parallelUploadOutputFile).getName());
            parallelUploadOutputFile = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            if (outputFile == null) {
                str3 = "";
            } else {
                str3 = outputFile;
            }
            sbLIZ2.append(new C0VSJ(str3).getParent());
            sbLIZ2.append(str4);
            sbLIZ2.append(hashCode());
            sbLIZ2.append('_');
            if (outputFile == null) {
                outputFile = "";
            }
            sbLIZ2.append(new C0VSJ(outputFile).getName());
            outputFile = C2188811AlT.LIZIZ(sbLIZ2);
        }
        C1D82 c1d823 = new C1D82(AFwS210S0000000_22.get$arr$(546), EnumC1434770nRL.AUTH_KEY);
        C1D82 c1d824 = new C1D82(new AwS566S0100000_22(this, 1128), EnumC1434770nRL.WAIT_UPLOAD_PARAM);
        ICreativeSocialBridgeService iCreativeSocialBridgeService = (ICreativeSocialBridgeService) this.LJ.getValue();
        if (iCreativeSocialBridgeService != null) {
            C2221281Bwk c2221281BwkLJJIJIL = iCreativeSocialBridgeService.LJJIJIL(parallelUploadOutputFile, this.LIZIZ);
            ArrayList arrayList = new ArrayList();
            if (C283380B8u.LIZIZ) {
                if (dMMediaModel != null && dMMediaModel.isFromMainPost) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && !z3) {
                    C1D82 c1d825 = new C1D82(AFwS210S0000000_22.get$arr$(542), EnumC1434770nRL.COMPILE);
                    c1d825.LJIIJ = C1433780nPk.LIZ;
                    listLJIIJJI = C1697810uHb.LJIIJJI(c1d825, new C1D82(AFwS210S0000000_22.get$arr$(543), EnumC1434770nRL.COVER_EXTRACT));
                } else {
                    C1D82 c1d826 = new C1D82(AFwS210S0000000_22.get$arr$(542), EnumC1434770nRL.COMPILE);
                    c1d826.LJIIJ = C1433780nPk.LIZ;
                    listLJIIJJI = C1697810uHb.LJIIJJI(c1d826, new C1D82(AFwS210S0000000_22.get$arr$(544), EnumC1434770nRL.COVER_EXTRACT));
                }
                arrayList.addAll(listLJIIJJI);
                arrayList.add(c1d823);
                arrayList.add(c1d824);
            } else {
                if (dMMediaModel != null && dMMediaModel.isFromMainPost && !z3) {
                    c1d82 = new C1D82(AFwS210S0000000_22.get$arr$(545), EnumC1434770nRL.COVER_EXTRACT);
                } else {
                    c1d82 = null;
                }
                C1D82 c1d827 = new C1D82(AFwS210S0000000_22.get$arr$(542), EnumC1434770nRL.COMPILE);
                c1d827.LJIIJ = C1433780nPk.LIZ;
                if (c1d82 == null) {
                    c1d822 = c1d827;
                } else {
                    c1d822 = c1d82;
                }
                arrayList.add(c1d822);
                arrayList.add(c1d823);
                arrayList.add(c1d824);
                if (c1d82 != null) {
                    c1d827.LIZ(c1d82);
                }
            }
            C1D82[] c1d82Arr = (C1D82[]) arrayList.toArray(new C1D82[0]);
            C1D82[] c1d82Arr2 = (C1D82[]) Arrays.copyOf(c1d82Arr, c1d82Arr.length);
            C1440550naf c1440550naf = new C1440550naf("DMVideoWavePublisher", (C1D82[]) Arrays.copyOf(c1d82Arr2, c1d82Arr2.length));
            c1440550naf.LIZIZ = this.LIZ.LIZIZ;
            ArrayList arrayList2 = (ArrayList) c1440550naf.LIZLLL;
            arrayList2.add(this.LJII);
            arrayList2.add(this.LJIIIIZZ);
            arrayList2.add(this.LJI.getValue());
            arrayList2.add(new C1404570med(this.LIZ.LIZIZ));
            arrayList2.add(c2221281BwkLJJIJIL);
            List<String> listLIZ = C0DJF.LIZ(this.LJIIIIZZ.LIZ.creativeModel.initialModel.dmCameraModel.sessionID);
            String str5 = this.LJII.LIZ.creationId;
            EnumC1993607rS enumC1993607rS = EnumC1993607rS.VIDEO;
            if (dMMediaModel != null) {
                z4 = dMMediaModel.isSynthesised;
            } else {
                z4 = false;
            }
            VideoPublishEditModel videoPublishEditModel = this.LJIIIIZZ.LIZ;
            if (!z3) {
                str = outputFile;
            }
            DMMediaModel dMMediaModel3 = videoPublishEditModel.creativeModel.dmMediaModel;
            if (dMMediaModel3 != null && dMMediaModel3.type == 3) {
                z5 = true;
            } else {
                z5 = false;
            }
            String str6 = str;
            C1D80 c1d80 = null;
            arrayList2.add(new C1435240nS6(enumC1993607rS, str5, null, new C1435260nS8(z4, str6, c2221281BwkLJJIJIL, parallelUploadOutputFile, videoPublishEditModel, z5, listLIZ), null, Integer.valueOf(videoPublishEditModel.getUploadScene()), 20));
            arrayList2.add(this.LIZJ);
            arrayList2.add(this.LIZLLL);
            c1440550naf.LJFF = EnableParallelPublishSchedulerV2Exp.LIZ().enable;
            c1440550naf.LJ = C1435270nS9.LIZ();
            this.LIZLLL.LJFF();
            c1440550naf.LJII = new C1435280nSA(C1434840nRS.LIZLLL(this.LIZ));
            this.LIZLLL.LJFF();
            c1440550naf.LJIIIIZZ = new C1435280nSA(C1434840nRS.LJ());
            this.LIZLLL.LJFF();
            c1440550naf.LJIIIZ = new C1435280nSA(C1434840nRS.LIZJ());
            this.LJFF = c1440550naf.LIZ();
            C1D82 c1d828 = new C1D82(AFwS210S0000000_22.get$arr$(547), EnumC1434770nRL.DM_VIDEO_UPLOAD_EVENT);
            c1d828.LIZ(c1d823);
            c1d828.LIZ(c1d824);
            C1D80 c1d802 = this.LJFF;
            if (c1d802 == null) {
                c1d802 = null;
            }
            C1D80 c1d803 = this.LJFF;
            if (c1d803 == null) {
                c1d803 = null;
            }
            String str7 = c1d803.LJIIJ;
            C1D80 c1d804 = this.LJFF;
            if (c1d804 == null) {
                c1d804 = null;
            }
            String str8 = c1d804.LJIIJ;
            AbstractC1433570nPP abstractC1433570nPP2 = this.LJIIIZ;
            if (abstractC1433570nPP2 == null) {
                abstractC1433570nPP2 = null;
            }
            C1435180nS0 c1435180nS0 = new C1435180nS0(str8, abstractC1433570nPP2);
            this.LIZLLL.LJFF();
            c1d802.LIZ(new C2280661EOq(str7, c1435180nS0, C1434840nRS.LIZIZ()));
            C1D80 c1d805 = this.LJFF;
            if (c1d805 == null) {
                c1d805 = null;
            }
            AbstractC1433570nPP abstractC1433570nPP3 = this.LJIIIZ;
            if (abstractC1433570nPP3 == null) {
                abstractC1433570nPP3 = null;
            }
            C1435210nS3 c1435210nS3 = new C1435210nS3(abstractC1433570nPP3, this.LJII.LIZ.creationId);
            this.LIZLLL.LJFF();
            c1d805.LIZ(new C2280661EOq(null, c1435210nS3, C1434840nRS.LIZIZ()));
            ICreativeSocialBridgeService iCreativeSocialBridgeService2 = (ICreativeSocialBridgeService) this.LJ.getValue();
            if (iCreativeSocialBridgeService2 != null) {
                C1D80 c1d806 = this.LJFF;
                if (c1d806 == null) {
                    c1d806 = null;
                }
                c1d806.LIZ(iCreativeSocialBridgeService2.LJFF(C1434870nRV.LIZ(true, false, false, false, false, 30), this.LIZLLL, "DMVideoWavePublisher", new AwS636S0100000_22(this, 71)));
            }
            ((C1405220mfg) this.LJI.getValue()).LIZLLL(EnumC1404590mef.DM_VIDEO);
            C1D80 c1d807 = this.LJFF;
            if (c1d807 != null) {
                c1d80 = c1d807;
            }
            c1d80.LJII();
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public C1435190nS1(C1433530nPL c1433530nPL, String str, C1430790nKv c1430790nKv, C1434310nQb c1434310nQb) {
        this.LIZ = c1433530nPL;
        this.LIZIZ = str;
        this.LIZJ = c1430790nKv;
        this.LIZLLL = c1434310nQb;
        this.LJII = new C1434970nRf(c1433530nPL.LIZ);
        this.LJIIIIZZ = new C1434960nRe((VideoPublishEditModel) c1433530nPL.LIZ.editModel);
    }
}
