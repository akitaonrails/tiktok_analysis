package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.13xM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20178213xM {
    public static final C20178213xM LIZ = new C20178213xM();
    public static final C20179013xU LIZIZ = new C20179013xU();
    public static final AtomicLong LIZJ = new AtomicLong(0);
    public static final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()).plus(new C1138320fjC("CoverExtractionManager")));

    public static String LIZIZ(C1457070o1J c1457070o1J) {
        StringBuilder sb = new StringBuilder();
        sb.append(c1457070o1J.LIZ.getCreationId());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('_');
        sbLIZ.append(c1457070o1J.LJ);
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append('_');
        sbLIZ2.append(c1457070o1J.LJFF);
        sbLIZ2.append('x');
        sbLIZ2.append(c1457070o1J.LJI);
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append('_');
        sbLIZ3.append(System.currentTimeMillis());
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append('_');
        sbLIZ4.append(LIZJ.incrementAndGet());
        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        return sb.toString();
    }

    public static void LIZJ(C1457070o1J c1457070o1J) {
        CanvasVideoData canvasVideoData;
        VideoPublishEditModel videoPublishEditModel = c1457070o1J.LIZ;
        if (u4.LJJJIL(videoPublishEditModel) || C1428470nHB.LJJLJLI(videoPublishEditModel) || C1428470nHB.LLFZ(videoPublishEditModel) || C1428470nHB.LLF(videoPublishEditModel) || videoPublishEditModel.creativeModel.streaksData.isStreaksPost() || (((canvasVideoData = videoPublishEditModel.getCanvasVideoData()) != null && C1444940nhk.LJIIZILJ(canvasVideoData)) || videoPublishEditModel.getTtStoryUploadModel() != null)) {
            C0MHB c0mhb = C0MHB.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip resolution reduce for story/streak cover, creationId=");
            sbLIZ.append(c1457070o1J.LIZ.getCreationId());
            C201955140j.LIZLLL(c0mhb, "CoverExtractionManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, -1, "studio_cover_extraction_reduce_resolution", true);
        if (c1457070o1J.LJFF == -1 && c1457070o1J.LJI == -1) {
            c1457070o1J.LJFF = iLJIJ;
        }
    }

    public static InterfaceC20175613ww LIZLLL(C1457070o1J c1457070o1J) {
        Object next;
        Iterator it2 = C1697810uHb.LJIIJJI(new C20177213xC(), new C20179313xX(), new C20176713x7(), new C20176213x2()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((InterfaceC20175613ww) next).LIZIZ(c1457070o1J)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC20175613ww c20176213x2 = (InterfaceC20175613ww) next;
        if (c20176213x2 == null) {
            c20176213x2 = new C20176213x2();
        }
        C0MHB c0mhb = C0MHB.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Strategy selected: ");
        sbLIZ.append(c20176213x2.getStrategyName());
        C201955140j.LIZLLL(c0mhb, "CoverExtractionManager", C2188811AlT.LIZIZ(sbLIZ));
        return c20176213x2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bb A[Catch: Exception -> 0x01eb, TryCatch #1 {Exception -> 0x01eb, blocks: (B:42:0x00fa, B:44:0x0108, B:47:0x010e, B:55:0x011b, B:57:0x0121, B:58:0x0123, B:60:0x012b, B:62:0x0139, B:64:0x0145, B:67:0x014b, B:69:0x0153, B:71:0x015e, B:72:0x016e, B:74:0x0172, B:80:0x017c, B:84:0x0183, B:87:0x0189, B:89:0x0191, B:91:0x019d, B:96:0x01a6, B:97:0x01a8, B:99:0x01ac, B:100:0x01ae, B:103:0x01b6, B:113:0x01c8, B:115:0x01cd, B:117:0x01d1, B:119:0x01dc, B:121:0x01e0, B:106:0x01bb, B:109:0x01c1, B:16:0x0040, B:18:0x0048, B:19:0x004b, B:21:0x0089, B:26:0x0093, B:30:0x009a, B:31:0x00b2, B:33:0x00cc, B:38:0x00de, B:39:0x00eb, B:37:0x00d3), top: B:136:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cd A[Catch: Exception -> 0x01eb, TryCatch #1 {Exception -> 0x01eb, blocks: (B:42:0x00fa, B:44:0x0108, B:47:0x010e, B:55:0x011b, B:57:0x0121, B:58:0x0123, B:60:0x012b, B:62:0x0139, B:64:0x0145, B:67:0x014b, B:69:0x0153, B:71:0x015e, B:72:0x016e, B:74:0x0172, B:80:0x017c, B:84:0x0183, B:87:0x0189, B:89:0x0191, B:91:0x019d, B:96:0x01a6, B:97:0x01a8, B:99:0x01ac, B:100:0x01ae, B:103:0x01b6, B:113:0x01c8, B:115:0x01cd, B:117:0x01d1, B:119:0x01dc, B:121:0x01e0, B:106:0x01bb, B:109:0x01c1, B:16:0x0040, B:18:0x0048, B:19:0x004b, B:21:0x0089, B:26:0x0093, B:30:0x009a, B:31:0x00b2, B:33:0x00cc, B:38:0x00de, B:39:0x00eb, B:37:0x00d3), top: B:136:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01dc A[Catch: Exception -> 0x01eb, TryCatch #1 {Exception -> 0x01eb, blocks: (B:42:0x00fa, B:44:0x0108, B:47:0x010e, B:55:0x011b, B:57:0x0121, B:58:0x0123, B:60:0x012b, B:62:0x0139, B:64:0x0145, B:67:0x014b, B:69:0x0153, B:71:0x015e, B:72:0x016e, B:74:0x0172, B:80:0x017c, B:84:0x0183, B:87:0x0189, B:89:0x0191, B:91:0x019d, B:96:0x01a6, B:97:0x01a8, B:99:0x01ac, B:100:0x01ae, B:103:0x01b6, B:113:0x01c8, B:115:0x01cd, B:117:0x01d1, B:119:0x01dc, B:121:0x01e0, B:106:0x01bb, B:109:0x01c1, B:16:0x0040, B:18:0x0048, B:19:0x004b, B:21:0x0089, B:26:0x0093, B:30:0x009a, B:31:0x00b2, B:33:0x00cc, B:38:0x00de, B:39:0x00eb, B:37:0x00d3), top: B:136:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108 A[Catch: Exception -> 0x01eb, TryCatch #1 {Exception -> 0x01eb, blocks: (B:42:0x00fa, B:44:0x0108, B:47:0x010e, B:55:0x011b, B:57:0x0121, B:58:0x0123, B:60:0x012b, B:62:0x0139, B:64:0x0145, B:67:0x014b, B:69:0x0153, B:71:0x015e, B:72:0x016e, B:74:0x0172, B:80:0x017c, B:84:0x0183, B:87:0x0189, B:89:0x0191, B:91:0x019d, B:96:0x01a6, B:97:0x01a8, B:99:0x01ac, B:100:0x01ae, B:103:0x01b6, B:113:0x01c8, B:115:0x01cd, B:117:0x01d1, B:119:0x01dc, B:121:0x01e0, B:106:0x01bb, B:109:0x01c1, B:16:0x0040, B:18:0x0048, B:19:0x004b, B:21:0x0089, B:26:0x0093, B:30:0x009a, B:31:0x00b2, B:33:0x00cc, B:38:0x00de, B:39:0x00eb, B:37:0x00d3), top: B:136:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(final X.C1457070o1J r14, X.InterfaceC1364105Vn<? super X.C20178713xR> r15) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20178213xM.LIZ(X.0o1J, X.05Vn):java.lang.Object");
    }
}
