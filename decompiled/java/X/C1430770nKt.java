package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.setting.performance.publish.SingleNodeRetryBlockConfig;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430770nKt extends AbstractC1434490nQt {
    public C1434960nRe LLILZLL;
    public C1434970nRf LLIZ;
    public VideoCreation LLIZLLLIL;
    public SynthetiseResult LLJ;
    public InterfaceC1434170nQN LLJI;
    public boolean LLJIJIL;
    public C1431070nLN LLJILJIL;
    public C1430790nKv LLJILJILJ;

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.CREATE_AWEME;
    }

    public static String LJIILLIIL(String str) {
        boolean z;
        Object c098200Yq;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        if (C2471909mP.LJJIIZI(str)) {
            try {
                c098200Yq = UriProtector.parse(str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            return C09N5.LIZ(C786410Ut5.M3(C1BWL.LIZ()), (Uri) obj);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse LJIILJJIL(java.util.Map<java.lang.String, java.lang.String> r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1430770nKt.LJIILJJIL(java.util.Map):com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse");
    }

    public final CreateBaseAwemeResponse LJIILL(Map<String, String> map) {
        List<SingleImageData> imageList;
        Integer numValueOf;
        List<SingleImageData> imageList2;
        C1431070nLN c1431070nLN = this.LLJILJIL;
        Integer numValueOf2 = null;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        c1431070nLN.LIZIZ(new C1404990mfJ("CreateAwemeTask", "PublishDurationMonitor CreateAweme start"), EnumC2251001D8o.OUTER);
        try {
            C1434960nRe c1434960nRe = this.LLILZLL;
            if (c1434960nRe == null) {
                c1434960nRe = null;
            }
            if (C1428470nHB.LJJZZI(c1434960nRe.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CreateAwemeTask start image createAweme realStart creationId = ");
                C1434960nRe c1434960nRe2 = this.LLILZLL;
                if (c1434960nRe2 == null) {
                    c1434960nRe2 = null;
                }
                sbLIZ.append(c1434960nRe2.LIZ.getCreationId());
                sbLIZ.append(" image size = ");
                C1434960nRe c1434960nRe3 = this.LLILZLL;
                if (c1434960nRe3 == null) {
                    c1434960nRe3 = null;
                }
                ImageAlbumData imageAlbumData = c1434960nRe3.LIZ.getImageAlbumData();
                if (imageAlbumData != null && (imageList2 = imageAlbumData.getImageList()) != null) {
                    numValueOf = Integer.valueOf(imageList2.size());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                C1450070nq1.LJI(C2188811AlT.LIZIZ(sbLIZ));
            }
            return LJIILJJIL(map);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C1434960nRe c1434960nRe4 = this.LLILZLL;
            if (c1434960nRe4 == null) {
                c1434960nRe4 = null;
            }
            if (C1428470nHB.LJJZZI(c1434960nRe4.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("CreateAwemeTask start image createAweme realStart failed restart e = ");
                sbLIZ2.append(e.getMessage());
                sbLIZ2.append(" creationId = ");
                C1434960nRe c1434960nRe5 = this.LLILZLL;
                if (c1434960nRe5 == null) {
                    c1434960nRe5 = null;
                }
                sbLIZ2.append(c1434960nRe5.LIZ.getCreationId());
                sbLIZ2.append(" image size = ");
                C1434960nRe c1434960nRe6 = this.LLILZLL;
                if (c1434960nRe6 == null) {
                    c1434960nRe6 = null;
                }
                ImageAlbumData imageAlbumData2 = c1434960nRe6.LIZ.getImageAlbumData();
                if (imageAlbumData2 != null && (imageList = imageAlbumData2.getImageList()) != null) {
                    numValueOf2 = Integer.valueOf(imageList.size());
                }
                sbLIZ2.append(numValueOf2);
                C1450070nq1.LJI(C2188811AlT.LIZIZ(sbLIZ2));
            }
            return LJIILJJIL(map);
        }
    }

    public final void LJIJ(CreateBaseAwemeResponse createBaseAwemeResponse) {
        String str;
        String aid;
        Integer numValueOf;
        List<SingleImageData> imageList;
        C1431070nLN c1431070nLN = this.LLJILJIL;
        C1434970nRf c1434970nRf = null;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create aweme success, logid: ");
        BaseResponse.ServerTimeExtra serverTimeExtra = createBaseAwemeResponse.extra;
        if (serverTimeExtra != null) {
            str = serverTimeExtra.logid;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", video id(video arch): ");
        VideoCreation videoCreation = this.LLIZLLLIL;
        if (videoCreation == null) {
            videoCreation = null;
        }
        sbLIZ.append(videoCreation.getMaterialId());
        sbLIZ.append(", aweme id(creation platform): ");
        Aweme aweme = ((CreateAwemeResponse) createBaseAwemeResponse).aweme;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        c1431070nLN.LIZIZ(new C1404990mfJ("CreateAwemeTask", C2188811AlT.LIZIZ(sbLIZ)), EnumC2251001D8o.OUTER);
        C1434960nRe c1434960nRe = this.LLILZLL;
        if (c1434960nRe == null) {
            c1434960nRe = null;
        }
        if (C1428470nHB.LJJZZI(c1434960nRe.LIZ)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("CreateAwemeTask start image createAweme realStart success creationId = ");
            C1434960nRe c1434960nRe2 = this.LLILZLL;
            if (c1434960nRe2 == null) {
                c1434960nRe2 = null;
            }
            sbLIZ2.append(c1434960nRe2.LIZ.getCreationId());
            sbLIZ2.append(" image size = ");
            C1434960nRe c1434960nRe3 = this.LLILZLL;
            if (c1434960nRe3 == null) {
                c1434960nRe3 = null;
            }
            ImageAlbumData imageAlbumData = c1434960nRe3.LIZ.getImageAlbumData();
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                numValueOf = Integer.valueOf(imageList.size());
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            C1450070nq1.LJI(C2188811AlT.LIZIZ(sbLIZ2));
        }
        VideoCreation videoCreation2 = this.LLIZLLLIL;
        if (videoCreation2 == null) {
            videoCreation2 = null;
        }
        createBaseAwemeResponse.materialId = videoCreation2.getMaterialId();
        C1431070nLN c1431070nLN2 = this.LLJILJIL;
        if (c1431070nLN2 == null) {
            c1431070nLN2 = null;
        }
        c1431070nLN2.LJ(createBaseAwemeResponse, false);
        C1434960nRe c1434960nRe4 = this.LLILZLL;
        if (c1434960nRe4 == null) {
            c1434960nRe4 = null;
        }
        if (C1435600nSg.LJII(c1434960nRe4.LIZ)) {
            C1434960nRe c1434960nRe5 = this.LLILZLL;
            if (c1434960nRe5 == null) {
                c1434960nRe5 = null;
            }
            VideoPublishEditModel videoPublishEditModel = c1434960nRe5.LIZ;
            C1434970nRf c1434970nRf2 = this.LLIZ;
            if (c1434970nRf2 != null) {
                c1434970nRf = c1434970nRf2;
            }
            C1435600nSg.LJIIIIZZ(videoPublishEditModel, c1434970nRf.LIZ.LIZJ(), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x05cc  */
    /* JADX WARN: Type inference failed for: r0v283, types: [com.ss.android.ugc.aweme.publish.model.VideoCreation] */
    /* JADX WARN: Type inference failed for: r0v284 */
    /* JADX WARN: Type inference failed for: r0v299 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // X.AbstractC1434490nQt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C1404610meh r20, X.C1431070nLN r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1430770nKt.LJII(X.0meh, X.0nLN):void");
    }

    public final void LJIIZILJ(C1431180nLY c1431180nLY, boolean z) {
        int iLJI;
        C1431070nLN c1431070nLN;
        C1431070nLN c1431070nLN2;
        if (c1431180nLY.getCause() instanceof C1430810nKx) {
            iLJI = 100104;
        } else if (c1431180nLY.getCause() instanceof C1430800nKw) {
            iLJI = 706704;
        } else {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (C036E.LIZ.LIZIZ()) {
                iLJI = C1431420nLw.LJI(5555, c1431180nLY.getCause());
            } else {
                iLJI = -2;
            }
        }
        if (!C289410BVz.LIZ() ? !(this.LLJIJIL || (c1431070nLN = this.LLJILJIL) == null || c1431070nLN.LIZJ >= C1430640nKg.LIZ()) : !(this.LLJIJIL || (c1431070nLN2 = this.LLJILJIL) == null || c1431070nLN2.LIZJ >= C1430640nKg.LIZ() || !(!C13LP.LJJJJ(Integer.valueOf(iLJI), ((SingleNodeRetryBlockConfig) C0C2V.LIZIZ.getValue()).ca)))) {
            if (z) {
                C0Z6N.LIZ(new AwS566S0100000_22(this, 1119));
                return;
            }
        }
        C1431070nLN c1431070nLN3 = null;
        if (((Set) C115200cA.LIZIZ.getValue()).contains(Integer.valueOf(iLJI))) {
            C1402780mbk c1402780mbk = C1402780mbk.LIZ;
            C1434960nRe c1434960nRe = this.LLILZLL;
            if (c1434960nRe == null) {
                c1434960nRe = null;
            }
            VideoPublishEditModel videoPublishEditModel = c1434960nRe.LIZ;
            Integer numValueOf = Integer.valueOf(iLJI);
            c1402780mbk.getClass();
            C1402780mbk.LIZ(videoPublishEditModel, "/aweme/v1/create/aweme/", numValueOf);
        }
        C1431070nLN c1431070nLN4 = this.LLJILJIL;
        if (c1431070nLN4 != null) {
            c1431070nLN3 = c1431070nLN4;
        }
        c1431070nLN3.LIZLLL(iLJI, c1431180nLY);
    }
}
