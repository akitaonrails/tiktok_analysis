package X;

import com.ss.android.ugc.effectmanager.common.model.ExtendedUrlModel;
import com.ss.android.ugc.effectmanager.common.model.FetchModelType;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13Px, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20007113Px {
    public final C20006313Pp LIZ;
    public final C13NB LIZIZ;
    public ModelInfo LIZJ;
    public FetchModelType LIZLLL;
    public String LJ = "";

    public final C13N5 LIZ(final ModelInfo modelInfo) {
        C19996513Lv c19996513Lv = new C19996513Lv();
        c19996513Lv.LIZIZ = this.LIZIZ;
        c19996513Lv.LIZ = new C13M6() { // from class: X.13Pr
            @Override // X.C13M6
            public final String LIZ(C20008713Qn c20008713Qn, long j, C13N3 c13n3) throws C13NG {
                String str;
                String uri;
                String uri2;
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VerifySignature download algorithm model with signature: ");
                sbLIZ.append(modelInfo);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZ("AlgorithmDownloader", strLIZIZ);
                String strLIZ = C20006413Pq.LIZ(modelInfo);
                Regex regex = C13SG.LJJ;
                String strLIZJ = C13SJ.LIZJ(strLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                C13M9 c13m9LIZ = new C13M9(this.LIZ.LIZ).LIZ(strLIZJ);
                String uri3 = null;
                if (c13m9LIZ != null) {
                    str = c13m9LIZ.LIZ;
                } else {
                    str = null;
                }
                sbLIZ2.append(str);
                sbLIZ2.append(".zip");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                if (strLIZIZ2 == null || strLIZIZ2.length() == 0) {
                    return null;
                }
                C13SB.LJIIZILJ(strLIZIZ2);
                String strLIZJ2 = C20012413Ry.LIZJ(c20008713Qn, C13SB.LJIILJJIL(strLIZIZ2, false), 0L, null);
                ExtendedUrlModel signature_file_url = modelInfo.getSignature_file_url();
                if (signature_file_url != null) {
                    uri = signature_file_url.getUri();
                } else {
                    uri = null;
                }
                if (!Intrinsics.LJFF(strLIZJ2, uri)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("VerifySignature download algorithm model with signature: ");
                    sbLIZ3.append(modelInfo);
                    sbLIZ3.append(", md5 not match, expect: ");
                    ExtendedUrlModel signature_file_url2 = modelInfo.getSignature_file_url();
                    if (signature_file_url2 != null) {
                        uri2 = signature_file_url2.getUri();
                    } else {
                        uri2 = null;
                    }
                    sbLIZ3.append(uri2);
                    sbLIZ3.append(", actual: ");
                    sbLIZ3.append(strLIZJ2);
                    C13SS.LIZIZ("AlgorithmDownloader", C2188811AlT.LIZIZ(sbLIZ3), null);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("VerifySignature download algorithm model with signature: ");
                    sbLIZ4.append(modelInfo);
                    sbLIZ4.append(", md5 not match, expect: ");
                    ExtendedUrlModel signature_file_url3 = modelInfo.getSignature_file_url();
                    if (signature_file_url3 != null) {
                        uri3 = signature_file_url3.getUri();
                    }
                    sbLIZ4.append(uri3);
                    sbLIZ4.append(", actual: ");
                    sbLIZ4.append(strLIZJ2);
                    throw new C13NG(C2188811AlT.LIZIZ(sbLIZ4));
                }
                return strLIZIZ2;
            }
        };
        final C20006313Pp c20006313Pp = this.LIZ;
        c19996513Lv.LIZLLL = new C13ND(c20006313Pp, modelInfo) { // from class: X.13Ps
            public final C20006313Pp LIZ;
            public final ModelInfo LIZIZ;

            {
                this.LIZ = c20006313Pp;
                this.LIZIZ = modelInfo;
            }

            @Override // X.C13ND
            public final boolean LIZ(String str, boolean z) {
                Object next;
                C20008813Qo c20008813QoLJIIJJI;
                String strLIZ = C20006413Pq.LIZ(this.LIZIZ);
                Regex regex = C13SG.LJJ;
                String strLIZJ = C13SJ.LIZJ(strLIZ);
                String str2 = this.LIZ.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZJ);
                sbLIZ.append("_unzip");
                String absolutePath = new C0VSJ(str2, C2188811AlT.LIZIZ(sbLIZ)).getAbsolutePath();
                C13SB.LJIIZILJ(absolutePath);
                C13SB.LJIJJ(str, absolutePath);
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "ep_need_verify_effect_package", true, false)) {
                    if (C847190XLh.LIZ(absolutePath) != 0) {
                        C13SS c13ss = C13SS.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("VerifySignature verify algorithm model failed, modelInfo: ");
                        sbLIZ2.append(this.LIZIZ);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        c13ss.getClass();
                        C13SS.LIZ("algorithmUnZipper", strLIZIZ);
                        C13SB.LJIIZILJ(str);
                        C13SB.LJIIZILJ(absolutePath);
                        return false;
                    }
                    C13SS c13ss2 = C13SS.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("VerifySignature verify algorithm model success, modelInfo: ");
                    sbLIZ3.append(this.LIZIZ);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                    c13ss2.getClass();
                    C13SS.LIZ("algorithmUnZipper", strLIZIZ2);
                }
                List listLJIILL = C13SB.LJIILL(absolutePath);
                if (listLJIILL != null) {
                    Iterator it2 = listLJIILL.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (!u.LJIIZILJ(((C20012513Rz) next).LIZ, ".json", false)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C20012513Rz c20012513Rz = (C20012513Rz) next;
                    if (c20012513Rz == null || (c20008813QoLJIIJJI = C13SB.LJIIJJI(c20012513Rz.LIZIZ)) == null) {
                        return false;
                    }
                    Pair<String, Boolean> pairLJIIIZ = this.LIZ.LJIIIZ(strLIZJ, c20008813QoLJIIJJI, this.LIZIZ.getMD5(), 0L, this.LIZIZ.getName(), null);
                    C13SB.LJIIZILJ(str);
                    C13SB.LJIIZILJ(absolutePath);
                    return pairLJIIIZ.getSecond().booleanValue();
                }
                return false;
            }
        };
        c19996513Lv.LIZJ = EnumC356380Dy8.ALGORITHM;
        return c19996513Lv.LIZ();
    }

    public C20007113Px(C20006313Pp c20006313Pp, C13SQ c13sq) {
        this.LIZ = c20006313Pp;
        this.LIZIZ = c13sq;
    }
}
