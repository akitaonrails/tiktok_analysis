package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.0qSe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550900qSe extends AbstractC1552240qUo<Pair<InterfaceC1550870qSb, UpdatePackage>, Pair<InterfaceC1550870qSb, UpdatePackage>> {
    @Override // X.AbstractC1552240qUo
    public final Object LIZJ(InterfaceC1552320qUw<Pair<InterfaceC1550870qSb, UpdatePackage>> interfaceC1552320qUw, Pair<InterfaceC1550870qSb, UpdatePackage> pair) {
        Pair<InterfaceC1550870qSb, UpdatePackage> pair2 = pair;
        C1553130qWF.LIZ("gecko-debug-tagUnZip", "start unzip, channel:", ((UpdatePackage) pair2.second).getChannel());
        InterfaceC1550870qSb interfaceC1550870qSb = (InterfaceC1550870qSb) pair2.first;
        UpdatePackage updatePackage = (UpdatePackage) pair2.second;
        File parentFile = interfaceC1550870qSb.LIZIZ().getParentFile();
        try {
            LIZLLL(0, parentFile, updatePackage, interfaceC1550870qSb, null);
            C0VSJ c0vsj = new C0VSJ(parentFile, "res");
            C0X9F.LJ(c0vsj);
            if (new C0VSJ(parentFile, updatePackage.getChannel()).renameTo(c0vsj)) {
                interfaceC1550870qSb.LIZIZ().delete();
                return interfaceC1552320qUw.proceed(pair2);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("rename file failed:");
            sbLIZ.append(parentFile.getAbsolutePath());
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(C786410Ut5.j4("unzip failed, channel:%s, pkg id:%d, msg:%s", new Object[]{updatePackage.getChannel(), Long.valueOf(updatePackage.getPackage().getId()), e.getMessage()}), e);
        }
    }

    public static void LIZLLL(int i, File file, UpdatePackage updatePackage, InterfaceC1550870qSb interfaceC1550870qSb, C1550890qSd c1550890qSd) {
        C0VSJ c0vsj = new C0VSJ(file, updatePackage.getChannel());
        if (c0vsj.exists()) {
            C0X9F.LJ(c0vsj);
        }
        if (i < 2) {
            try {
                interfaceC1550870qSb.position(0L);
                C1550860qSa.LIZJ(new C1550880qSc(interfaceC1550870qSb), file.getAbsolutePath(), updatePackage.getChannel(), i);
                interfaceC1550870qSb.LIZJ();
                return;
            } catch (C1550890qSd e) {
                TryCatchGuardChecker.doCheck(e);
                LIZLLL(i + 1, file, updatePackage, interfaceC1550870qSb, e);
                return;
            }
        }
        C0X9F.LJ(file);
        throw c1550890qSd;
    }
}
