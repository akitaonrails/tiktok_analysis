package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.setting.performance.publish.SingleNodeRetryBlockConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nL2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430860nL2 extends AbstractC1434490nQt {
    public C1431070nLN LLILZLL;
    public C2221281Bwk LLIZ;
    public C1434970nRf LLIZLLLIL;
    public C1434960nRe LLJ;
    public boolean LLJI;

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.AUTH_KEY;
    }

    public final void LJIILJJIL(Throwable th) {
        C1431070nLN c1431070nLN;
        boolean z;
        C1431070nLN c1431070nLN2;
        int iLJI = C1431420nLw.LJI(11, th);
        if (!C289410BVz.LIZ() ? !(this.LLJI || (c1431070nLN = this.LLILZLL) == null || c1431070nLN.LIZJ >= C1430640nKg.LIZ()) : !(this.LLJI || (c1431070nLN2 = this.LLILZLL) == null || c1431070nLN2.LIZJ >= C1430640nKg.LIZ() || !(!C13LP.LJJJJ(Integer.valueOf(iLJI), ((SingleNodeRetryBlockConfig) C0C2V.LIZIZ.getValue()).ak)))) {
            z = true;
        } else {
            z = false;
        }
        C1431070nLN c1431070nLN3 = null;
        if (z) {
            this.LLJI = true;
            C1431070nLN c1431070nLN4 = this.LLILZLL;
            if (c1431070nLN4 != null) {
                c1431070nLN3 = c1431070nLN4;
            }
            C1431070nLN.LIZ(c1431070nLN3);
            return;
        }
        C1443030nef.LJII().LJIIJJI(9);
        if (((Set) C115300cB.LIZIZ.getValue()).contains(Integer.valueOf(iLJI))) {
            C1434970nRf c1434970nRf = this.LLIZLLLIL;
            if (c1434970nRf == null) {
                c1434970nRf = null;
            }
            if (c1434970nRf.LIZ.publishType == 0) {
                C1402780mbk c1402780mbk = C1402780mbk.LIZ;
                C1434960nRe c1434960nRe = this.LLJ;
                if (c1434960nRe == null) {
                    c1434960nRe = null;
                }
                VideoPublishEditModel videoPublishEditModel = c1434960nRe.LIZ;
                Integer numValueOf = Integer.valueOf(iLJI);
                c1402780mbk.getClass();
                C1402780mbk.LIZ(videoPublishEditModel, "/aweme/v1/upload/authkey", numValueOf);
            }
        }
        C1431070nLN c1431070nLN5 = this.LLILZLL;
        if (c1431070nLN5 != null) {
            c1431070nLN3 = c1431070nLN5;
        }
        c1431070nLN3.LIZLLL(iLJI, new C1434650nR9(th));
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        Integer numValueOf;
        List<SingleImageData> imageList;
        Integer numValueOf2;
        List<SingleImageData> imageList2;
        Object next;
        boolean zLJI = MethodIDManager.LJI(137767);
        C0CH0.LIZ(2);
        this.LLILZLL = c1431070nLN;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (next2 instanceof C1434960nRe) {
                if (next2 != null) {
                    C1434960nRe c1434960nRe = (C1434960nRe) next2;
                    this.LLJ = c1434960nRe;
                    boolean z = true;
                    if (!C1428470nHB.LJJZZI(c1434960nRe.LIZ)) {
                        Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (next == null || (next instanceof C2221281Bwk)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        this.LLIZ = (C2221281Bwk) next;
                    }
                    Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Object next3 = it4.next();
                        if (next3 instanceof C1404570med) {
                            if (next3 != null) {
                                Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        break;
                                    }
                                    Object next4 = it5.next();
                                    if (next4 instanceof C1434970nRf) {
                                        if (next4 != null) {
                                            this.LLIZLLLIL = (C1434970nRf) next4;
                                            C1434960nRe c1434960nRe2 = this.LLJ;
                                            if (c1434960nRe2 == null) {
                                                c1434960nRe2 = null;
                                            }
                                            if (C1428470nHB.LJJZZI(c1434960nRe2.LIZ)) {
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("authKeyTask start task creationId = ");
                                                C1434960nRe c1434960nRe3 = this.LLJ;
                                                if (c1434960nRe3 == null) {
                                                    c1434960nRe3 = null;
                                                }
                                                sbLIZ.append(c1434960nRe3.LIZ.getCreationId());
                                                sbLIZ.append(" image size = ");
                                                C1434960nRe c1434960nRe4 = this.LLJ;
                                                if (c1434960nRe4 == null) {
                                                    c1434960nRe4 = null;
                                                }
                                                ImageAlbumData imageAlbumData = c1434960nRe4.LIZ.getImageAlbumData();
                                                if (imageAlbumData != null && (imageList2 = imageAlbumData.getImageList()) != null) {
                                                    numValueOf2 = Integer.valueOf(imageList2.size());
                                                } else {
                                                    numValueOf2 = null;
                                                }
                                                sbLIZ.append(numValueOf2);
                                                C1450070nq1.LJI(C2188811AlT.LIZIZ(sbLIZ));
                                            }
                                            C1431730nMR c1431730nMRLJJIIZI = C0CHQ.LIZ().getPublishService().LJJIIZI();
                                            new AwS601S0100000_22(this, 910);
                                            c1431730nMRLJJIIZI.getClass();
                                            C1436930nUp.LIZ();
                                            C1434960nRe c1434960nRe5 = this.LLJ;
                                            if (c1434960nRe5 == null) {
                                                c1434960nRe5 = null;
                                            }
                                            final VideoPublishEditModel videoPublishEditModel = c1434960nRe5.LIZ;
                                            if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("authKeyTask start  refreshUploadAuthKeyConfig  creationId = ");
                                                sbLIZ2.append(videoPublishEditModel.getCreationId());
                                                sbLIZ2.append("  imagesize = ");
                                                ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
                                                if (imageAlbumData2 != null && (imageList = imageAlbumData2.getImageList()) != null) {
                                                    numValueOf = Integer.valueOf(imageList.size());
                                                } else {
                                                    numValueOf = null;
                                                }
                                                sbLIZ2.append(numValueOf);
                                                C1450070nq1.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                                            }
                                            C1444700nhM c1444700nhMLJJIJIIJIL = C0CHQ.LIZ().getPublishService().LJJIJIIJIL();
                                            if (videoPublishEditModel.getTtStoryUploadModel() == null) {
                                                z = false;
                                            }
                                            ListenableFuture<VideoCreation> listenableFutureLIZIZ = c1444700nhMLJJIJIIJIL.LIZIZ(null, z);
                                            C11U6<VideoCreation> c11u6 = new C11U6<VideoCreation>() { // from class: X.0nL4
                                                @Override // X.C11U6
                                                public final void onFailure(Throwable th) {
                                                    C2221281Bwk c2221281Bwk = this.LIZ.LLIZ;
                                                    if (c2221281Bwk != null) {
                                                        c2221281Bwk.cancelUpload();
                                                    }
                                                }

                                                @Override // X.C11U6
                                                public final /* bridge */ /* synthetic */ void onSuccess(VideoCreation videoCreation) {
                                                }
                                            };
                                            EnumC2272608vM enumC2272608vM = EnumC2272608vM.LL;
                                            listenableFutureLIZIZ.LJIIJJI(new C135Q(listenableFutureLIZIZ, c11u6), enumC2272608vM);
                                            listenableFutureLIZIZ.LJIIJJI(new C135Q(listenableFutureLIZIZ, new C11U6<VideoCreation>() { // from class: X.0nL3
                                                @Override // X.C11U6
                                                public final void onFailure(Throwable th) {
                                                    Integer numValueOf3;
                                                    List<SingleImageData> imageList3;
                                                    if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                        sbLIZ3.append("authKeyTask start  refreshUploadAuthKeyConfig  failed errorMessage = ");
                                                        sbLIZ3.append(th.getMessage());
                                                        sbLIZ3.append(" creationId = ");
                                                        sbLIZ3.append(videoPublishEditModel.getCreationId());
                                                        sbLIZ3.append("  imagesize = ");
                                                        ImageAlbumData imageAlbumData3 = videoPublishEditModel.getImageAlbumData();
                                                        if (imageAlbumData3 != null && (imageList3 = imageAlbumData3.getImageList()) != null) {
                                                            numValueOf3 = Integer.valueOf(imageList3.size());
                                                        } else {
                                                            numValueOf3 = null;
                                                        }
                                                        sbLIZ3.append(numValueOf3);
                                                        C1450070nq1.LJI(C2188811AlT.LIZIZ(sbLIZ3));
                                                    }
                                                    this.LJIILJJIL(th);
                                                }

                                                @Override // X.C11U6
                                                public final void onSuccess(VideoCreation videoCreation) {
                                                    Integer numValueOf3;
                                                    List<SingleImageData> imageList3;
                                                    Integer numValueOf4;
                                                    List<SingleImageData> imageList4;
                                                    VideoCreation videoCreation2 = videoCreation;
                                                    C1431070nLN c1431070nLN2 = null;
                                                    if (videoCreation2 == null) {
                                                        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                            sbLIZ3.append("authKeyTask start  refreshUploadAuthKeyConfig  failed result = null creationId = ");
                                                            sbLIZ3.append(videoPublishEditModel.getCreationId());
                                                            sbLIZ3.append("  imagesize = ");
                                                            ImageAlbumData imageAlbumData3 = videoPublishEditModel.getImageAlbumData();
                                                            if (imageAlbumData3 != null && (imageList4 = imageAlbumData3.getImageList()) != null) {
                                                                numValueOf4 = Integer.valueOf(imageList4.size());
                                                            } else {
                                                                numValueOf4 = null;
                                                            }
                                                            sbLIZ3.append(numValueOf4);
                                                            C1450070nq1.LJI(C2188811AlT.LIZIZ(sbLIZ3));
                                                        }
                                                        this.LJIILJJIL(new C1434330nQd(null, null, 3, null));
                                                        return;
                                                    }
                                                    if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                        sbLIZ4.append("authKeyTask start  refreshUploadAuthKeyConfig  success creationId = ");
                                                        sbLIZ4.append(videoPublishEditModel.getCreationId());
                                                        sbLIZ4.append("  imagesize = ");
                                                        ImageAlbumData imageAlbumData4 = videoPublishEditModel.getImageAlbumData();
                                                        if (imageAlbumData4 != null && (imageList3 = imageAlbumData4.getImageList()) != null) {
                                                            numValueOf3 = Integer.valueOf(imageList3.size());
                                                        } else {
                                                            numValueOf3 = null;
                                                        }
                                                        sbLIZ4.append(numValueOf3);
                                                        C1450070nq1.LJI(C2188811AlT.LIZIZ(sbLIZ4));
                                                    }
                                                    C1430860nL2 c1430860nL2 = this;
                                                    C1431070nLN c1431070nLN3 = c1430860nL2.LLILZLL;
                                                    if (c1431070nLN3 != null && c1431070nLN3.LIZJ != C1430640nKg.LIZ() && C0C64.LJIILLIIL().LJIIIZ(31744, "mock_authkey_error_until_retry_max", true, false)) {
                                                        c1430860nL2.LJIILJJIL(new C1434330nQd(null, null, 3, null));
                                                        return;
                                                    }
                                                    C1431070nLN c1431070nLN4 = c1430860nL2.LLILZLL;
                                                    if (c1431070nLN4 != null) {
                                                        c1431070nLN2 = c1431070nLN4;
                                                    }
                                                    c1431070nLN2.LJ(new C1404770mex(videoCreation2), false);
                                                }
                                            }), enumC2272608vM);
                                            if (zLJI) {
                                                MethodIDManager.LJ();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                }
                                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                    throw nullPointerException;
                                }
                                throw nullPointerException;
                            }
                        }
                    }
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                    if (zLJI) {
                        MethodIDManager.LJ();
                        throw nullPointerException2;
                    }
                    throw nullPointerException2;
                }
            }
        }
        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
        if (zLJI) {
            MethodIDManager.LJ();
            throw nullPointerException3;
        }
        throw nullPointerException3;
    }
}
