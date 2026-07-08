package X;

import android.util.Pair;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0qSW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550820qSW extends AbstractC1552240qUo<UpdatePackage, Pair<InterfaceC1550870qSb, UpdatePackage>> {
    @Override // X.AbstractC1552240qUo
    public final Object LIZJ(InterfaceC1552320qUw<Pair<InterfaceC1550870qSb, UpdatePackage>> interfaceC1552320qUw, UpdatePackage updatePackage) {
        UpdatePackage updatePackage2 = updatePackage;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start decompress for ak:");
        sbLIZ.append(updatePackage2.getAccessKey());
        sbLIZ.append(" channel:");
        sbLIZ.append(updatePackage2.getChannel());
        sbLIZ.append(" version:");
        sbLIZ.append(updatePackage2.getVersion());
        C1553130qWF.LIZ("gecko-debug-tag-PreDeCompress", C2188811AlT.LIZIZ(sbLIZ));
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        c1551940qUK.LIZIZ();
        GeckoGlobalConfig geckoGlobalConfig = c1551940qUK.LIZLLL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(geckoGlobalConfig.getRootDirectory().getAbsolutePath());
        String str = File.separator;
        sbLIZ2.append(str);
        sbLIZ2.append(updatePackage2.getAccessKey());
        sbLIZ2.append(str);
        sbLIZ2.append(updatePackage2.getChannel());
        sbLIZ2.append(str);
        sbLIZ2.append(updatePackage2.getVersion());
        sbLIZ2.append("--compress");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(str);
        sbLIZ3.append("res.zst");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        InterfaceC1550870qSb interfaceC1550870qSb = null;
        try {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("compressed file path: ");
            sbLIZ4.append(strLIZIZ2);
            C1553130qWF.LIZ("gecko-debug-tag-PreDeCompress", C2188811AlT.LIZIZ(sbLIZ4));
            C0VSJ c0vsj = new C0VSJ(strLIZIZ2);
            if (c0vsj.exists()) {
                InterfaceC1550870qSb interfaceC1550870qSbLIZIZ = C2221908nB.LIZIZ(c0vsj, c0vsj.length());
                Object objProceed = interfaceC1552320qUw.proceed(new Pair<>(interfaceC1550870qSbLIZIZ, updatePackage2));
                interfaceC1550870qSbLIZIZ.release();
                return objProceed;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("resource file not found: ");
            sbLIZ5.append(strLIZIZ2);
            C1553130qWF.LIZLLL("gecko-debug-tag-PreDeCompress", C2188811AlT.LIZIZ(sbLIZ5));
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("Resource file not found: ");
            sbLIZ6.append(strLIZIZ2);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ6);
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("Resource file not found: ");
            sbLIZ7.append(strLIZIZ2);
            throw new C1550830qSX(strLIZIZ3, new Throwable(C2188811AlT.LIZIZ(sbLIZ7)));
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("channel:");
                sbLIZ8.append(updatePackage2.getChannel());
                sbLIZ8.append(" zstd decompress failed: delete file and record");
                C1553130qWF.LIZLLL("gecko-debug-tag-PreDeCompress", C2188811AlT.LIZIZ(sbLIZ8));
                C0X9F.LJFF(new C0VSJ(strLIZIZ));
                C1550730qSN c1550730qSN = C1550730qSN.LIZ;
                String accessKey = updatePackage2.getAccessKey();
                List listSingletonList = Collections.singletonList(updatePackage2.getChannel());
                c1550730qSN.getClass();
                C1550730qSN.LIZ(accessKey, listSingletonList);
                throw new C1550830qSX(th.getMessage(), th);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (0 != 0) {
                    interfaceC1550870qSb.release();
                }
                throw th2;
            }
        }
    }
}
