package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0qSp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551010qSp extends AbstractC1552240qUo<Pair<UpdatePackage, Long>, Pair<UpdatePackage, Long>> {
    @Override // X.AbstractC1552240qUo
    public final Object LIZJ(InterfaceC1552320qUw<Pair<UpdatePackage, Long>> interfaceC1552320qUw, Pair<UpdatePackage, Long> pair) {
        boolean z;
        boolean z2;
        String str;
        Pair<UpdatePackage, Long> pair2 = pair;
        UpdatePackage updatePackage = (UpdatePackage) pair2.first;
        if (updatePackage.getDecompressFrom() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (updatePackage.getDecompressFrom() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            str = "[Update Line]";
        } else if (z2) {
            str = "[Compress Line]";
        } else {
            str = "[Parallel Line]";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("update success:");
        C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ), ((UpdatePackage) pair2.first).toString());
        try {
            Object objProceed = interfaceC1552320qUw.proceed(pair2);
            if (!z && !z2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("update success, but not from compress line, so pipeline not end, and do nothing");
                C1553130qWF.LIZLLL("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ2));
                return objProceed;
            }
            String accessKey = updatePackage.getAccessKey();
            String channel = updatePackage.getChannel();
            C1551940qUK c1551940qUK = C797990VSb.LIZ;
            c1551940qUK.LIZIZ();
            C1551020qSq.LIZLLL((Long) pair2.second, new C0VSJ(new C0VSJ(c1551940qUK.LIZLLL.getRootDirectory(), accessKey), channel).getAbsolutePath(), true, true);
            C1551330qTL.LIZ.getClass();
            if (C1551330qTL.LJIIIIZZ(accessKey, channel)) {
                C1551780qU4.LJII(4, 50, accessKey, channel);
            }
            C1551350qTN.LIZ.getClass();
            C1551350qTN.LJ(updatePackage);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append("end pipeline");
            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ3));
            return objProceed;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!z && !z2) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str);
                sbLIZ4.append("update success, but not from compress line, so pipeline not end, and do nothing");
                C1553130qWF.LIZLLL("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ4));
                throw th;
            }
            String accessKey2 = updatePackage.getAccessKey();
            String channel2 = updatePackage.getChannel();
            C1551940qUK c1551940qUK2 = C797990VSb.LIZ;
            c1551940qUK2.LIZIZ();
            C1551020qSq.LIZLLL((Long) pair2.second, new C0VSJ(new C0VSJ(c1551940qUK2.LIZLLL.getRootDirectory(), accessKey2), channel2).getAbsolutePath(), true, true);
            C1551330qTL.LIZ.getClass();
            if (C1551330qTL.LJIIIIZZ(accessKey2, channel2)) {
                C1551780qU4.LJII(4, 50, accessKey2, channel2);
            }
            C1551350qTN.LIZ.getClass();
            C1551350qTN.LJ(updatePackage);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(str);
            sbLIZ5.append("end pipeline");
            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ5));
            throw th;
        }
    }
}
