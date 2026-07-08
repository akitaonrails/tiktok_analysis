package X;

import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.algorithm.VEFaceDetectCropResult;

/* JADX INFO: renamed from: X.0nVq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437560nVq extends AbstractC1434490nQt {
    public C1431070nLN LLILZLL;
    public C1435240nS6 LLIZ;

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.AI_GROUP_SHOT_FACE_HANDLE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0050  */
    @Override // X.AbstractC1434490nQt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C1404610meh r8, X.C1431070nLN r9) {
        /*
            r7 = this;
            r7.LLILZLL = r9
            java.util.List<java.lang.Object> r0 = r8.LIZ
            java.util.Iterator r2 = r0.iterator()
        L8:
            boolean r0 = r2.hasNext()
            r6 = 0
            if (r0 == 0) goto L4e
            java.lang.Object r1 = r2.next()
            if (r1 == 0) goto L19
            boolean r0 = r1 instanceof X.C1435240nS6
            if (r0 == 0) goto L8
        L19:
            X.0nS6 r1 = (X.C1435240nS6) r1
            r7.LLIZ = r1
            if (r1 == 0) goto L4a
            X.0YVK r0 = r1.LIZJ
            if (r0 == 0) goto L4a
            java.lang.String r5 = r0.LIZ
        L25:
            X.0nSG r0 = r1.LJ
            if (r0 == 0) goto L2b
            java.lang.String r6 = r0.LIZ
        L2b:
            r1 = 0
            if (r5 == 0) goto L48
            int r0 = r5.length()
            if (r0 == 0) goto L48
            r0 = 0
        L35:
            r2 = 10013(0x271d, float:1.4031E-41)
            if (r0 == 0) goto L50
            X.0nUP r1 = new X.0nUP
            java.lang.String r0 = "compiled path is null"
            r1.<init>(r0)
            X.0nLN r0 = r7.LLILZLL
            if (r0 == 0) goto L47
            r0.LIZLLL(r2, r1)
        L47:
            return
        L48:
            r0 = 1
            goto L35
        L4a:
            r5 = r6
            if (r1 == 0) goto L2b
            goto L25
        L4e:
            r1 = r6
            goto L19
        L50:
            if (r6 == 0) goto L88
            int r0 = r6.length()
            if (r0 == 0) goto L88
            X.13Pg r0 = X.C13Q5.LIZ()
            com.ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder r0 = r0.LIZLLL()
            java.lang.String r4 = "skin_quant"
            boolean r0 = r0.isResourceAvailable(r4)
            if (r0 == 0) goto L6c
            r7.LJIILJJIL(r5, r6)
            return
        L6c:
            com.ss.android.ugc.effectmanager.DownloadableModelSupport r3 = com.ss.android.ugc.effectmanager.DownloadableModelSupport.getInstance()
            java.lang.String[] r2 = new java.lang.String[r1]
            java.util.List r1 = java.util.Collections.singletonList(r4)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r4, r1)
            java.util.Map r1 = X.C2097908Jt.LIZJ(r0)
            X.0nVr r0 = new X.0nVr
            r0.<init>()
            r3.fetchResourcesByRequirementsAndModelNames(r2, r1, r0)
            return
        L88:
            X.0nUP r1 = new X.0nUP
            java.lang.String r0 = "smashPath path is null"
            r1.<init>(r0)
            X.0nLN r0 = r7.LLILZLL
            if (r0 == 0) goto L96
            r0.LIZLLL(r2, r1)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1437560nVq.LJII(X.0meh, X.0nLN):void");
    }

    public final void LJIILJJIL(String str, String str2) {
        String str3;
        C0HLZ c0hlz = new C0HLZ();
        c0hlz.picturePath = str;
        boolean z = true;
        c0hlz.LIZ = true;
        c0hlz.LIZIZ = null;
        c0hlz.LIZJ = str2;
        c0hlz.LIZLLL = null;
        VEFaceDetectCropResult vEFaceDetectCropResultScanPicture = VEUtils.scanPicture(c0hlz);
        if (vEFaceDetectCropResultScanPicture == null || vEFaceDetectCropResultScanPicture.retCode != 0) {
            z = false;
        }
        if (z) {
            if (vEFaceDetectCropResultScanPicture.getSkinTone() < 0) {
                C1436670nUP c1436670nUP = new C1436670nUP("skin tone detect fail");
                C1431070nLN c1431070nLN = this.LLILZLL;
                if (c1431070nLN != null) {
                    c1431070nLN.LIZLLL(10013, c1436670nUP);
                    return;
                }
                return;
            }
            C1431070nLN c1431070nLN2 = this.LLILZLL;
            if (c1431070nLN2 != null) {
                c1431070nLN2.LIZIZ(new C1435300nSC(vEFaceDetectCropResultScanPicture.getSkinTone(), vEFaceDetectCropResultScanPicture.getBoyProb()), EnumC2251001D8o.OUTER);
            }
            C1431070nLN c1431070nLN3 = this.LLILZLL;
            if (c1431070nLN3 != null) {
                c1431070nLN3.LJ(this.LLIZ, false);
                return;
            }
            return;
        }
        if (vEFaceDetectCropResultScanPicture == null || (str3 = vEFaceDetectCropResultScanPicture.reason) == null) {
            str3 = "face crop fail";
        }
        C1436670nUP c1436670nUP2 = new C1436670nUP(str3);
        C1431070nLN c1431070nLN4 = this.LLILZLL;
        if (c1431070nLN4 != null) {
            c1431070nLN4.LIZLLL(10013, c1436670nUP2);
        }
    }
}
