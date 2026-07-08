package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.zoin.model.ZoinBuildFileInfo;
import java.io.File;
import java.util.List;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: X.09do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2418609do {
    public static long LIZ(File file) {
        if (!file.exists()) {
            C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("File is not exist: ");
            sbLIZ.append(file.getPath());
            c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            return 0L;
        }
        try {
            CRC32 crc32 = new CRC32();
            C0VSP c0vsp = new C0VSP(file);
            try {
                byte[] bArr = new byte[32768];
                while (true) {
                    int i = c0vsp.read(bArr);
                    if (i != -1) {
                        crc32.update(bArr, 0, i);
                    } else {
                        C08PB.LIZ(c0vsp);
                        return crc32.getValue() + file.length();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08PB.LIZ(c0vsp);
                throw th;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2418109dj c2418109djLIZLLL2 = C2418109dj.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Fail to get check num ");
            sbLIZ2.append(file);
            c2418109djLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
            return 0L;
        }
    }

    public static boolean LIZIZ(File file, List<ZoinBuildFileInfo> list) {
        for (ZoinBuildFileInfo zoinBuildFileInfo : list) {
            long jLIZ = LIZ(new C0VSJ(file, zoinBuildFileInfo.name));
            if (jLIZ != zoinBuildFileInfo.checkNumber) {
                C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VerifyError:");
                sbLIZ.append(zoinBuildFileInfo);
                sbLIZ.append(", generated:");
                sbLIZ.append(jLIZ);
                c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
            C2418109dj c2418109djLIZLLL2 = C2418109dj.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("VerifySuccess:");
            sbLIZ2.append(zoinBuildFileInfo);
            c2418109djLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return true;
    }
}
