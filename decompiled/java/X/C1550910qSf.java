package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.0qSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550910qSf extends AbstractC1552240qUo<Pair<InterfaceC1550870qSb, UpdatePackage>, Pair<InterfaceC1550870qSb, UpdatePackage>> {
    public C1551530qTf LJI;
    public C1550930qSh LJII;

    @Override // X.AbstractC1552240qUo
    public final void LIZIZ(Object... objArr) {
        this.LJI = (C1551530qTf) objArr[0];
        Object obj = objArr[1];
        if (obj instanceof C1550930qSh) {
            this.LJII = (C1550930qSh) obj;
        }
    }

    @Override // X.AbstractC1552240qUo
    public final Object LIZJ(InterfaceC1552320qUw<Pair<InterfaceC1550870qSb, UpdatePackage>> interfaceC1552320qUw, Pair<InterfaceC1550870qSb, UpdatePackage> pair) throws IOException {
        boolean z;
        boolean z2;
        String str;
        C1550930qSh c1550930qSh;
        Pair<InterfaceC1550870qSb, UpdatePackage> pair2 = pair;
        InterfaceC1550870qSb interfaceC1550870qSb = (InterfaceC1550870qSb) pair2.first;
        interfaceC1550870qSb.position(0L);
        UpdatePackage updatePackage = (UpdatePackage) pair2.second;
        if (updatePackage.getUpdateWithPatch()) {
            C1550730qSN c1550730qSN = C1550730qSN.LIZ;
            String accessKey = updatePackage.getAccessKey();
            String channel = updatePackage.getChannel();
            c1550730qSN.getClass();
            if (C1550730qSN.LIZLLL(accessKey, channel) && (c1550930qSh = this.LJII) != null && !c1550930qSh.LIZLLL && c1550930qSh.LIZIZ() == null) {
                throw new C1550950qSj("Parallel decompress failed, skip  patchupdate", new Throwable("Parallel decompress failed, skip patch update"));
            }
        }
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
        sbLIZ.append("start decompress zstd file, channel:");
        C1553130qWF.LIZ("gecko-debug-tagDecompressZstd", C2188811AlT.LIZIZ(sbLIZ), ((UpdatePackage) pair2.second).getChannel());
        C0VSJ c0vsj = new C0VSJ(interfaceC1550870qSb.LIZIZ().getParentFile(), "res.zst.tmp");
        C0X9F.LJ(c0vsj);
        InterfaceC1550870qSb interfaceC1550870qSbLIZ = C2221908nB.LIZ(this.LJI, c0vsj, c0vsj.length());
        try {
            try {
                C1550860qSa.LIZ(interfaceC1550870qSb, interfaceC1550870qSbLIZ);
                interfaceC1550870qSb.LIZIZ().delete();
                interfaceC1550870qSbLIZ.position(0L);
                try {
                    C08IP.LIZ(new C1550880qSc(interfaceC1550870qSbLIZ), updatePackage.getPackage().getDecompressMd5());
                    try {
                        Object objProceed = interfaceC1552320qUw.proceed(new Pair<>(interfaceC1550870qSbLIZ, updatePackage));
                        interfaceC1550870qSbLIZ.release();
                        return objProceed;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        interfaceC1550870qSbLIZ.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    interfaceC1550870qSbLIZ.LIZIZ().delete();
                    throw new C1550940qSi(th2.getMessage(), th2);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                interfaceC1550870qSbLIZ.LIZIZ().delete();
                throw new C1550830qSX(e.getMessage(), e);
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            interfaceC1550870qSb.LIZIZ().delete();
            throw th3;
        }
    }
}
