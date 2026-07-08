package X;

import android.util.Pair;
import com.bytedance.geckox.AppSettingsManager;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.utils.BsPatch;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.0qSk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550960qSk extends AbstractC1552240qUo<Pair<InterfaceC1550870qSb, UpdatePackage>, Pair<InterfaceC1550870qSb, UpdatePackage>> {
    public C1551530qTf LJI;
    public C1550930qSh LJII;

    public static File LIZLLL(UpdatePackage updatePackage) {
        int packageType = updatePackage.getPackageType();
        String accessKey = updatePackage.getAccessKey();
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        c1551940qUK.LIZIZ();
        File rootDirectory = c1551940qUK.LIZLLL.getRootDirectory();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(accessKey);
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append(updatePackage.getChannel());
        C0VSJ c0vsj = new C0VSJ(rootDirectory, C2188811AlT.LIZIZ(sbLIZ));
        if (packageType != 0) {
            if (packageType != 1) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("unknown file type: ");
                sbLIZ2.append(packageType);
                C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            }
            C1550730qSN c1550730qSN = C1550730qSN.LIZ;
            String channel = updatePackage.getChannel();
            c1550730qSN.getClass();
            if (C1550730qSN.LIZLLL(accessKey, channel)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(updatePackage.getLocalVersion());
                sbLIZ3.append("--compress");
                sbLIZ3.append(str);
                sbLIZ3.append("res.zst");
                return new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ3));
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(updatePackage.getLocalVersion());
            sbLIZ4.append(str);
            sbLIZ4.append("res");
            C0VSJ c0vsj2 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ4));
            File[] fileArrListFiles = c0vsj2.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                return fileArrListFiles[0];
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("can not found old full single file,:");
            sbLIZ5.append(c0vsj2.getAbsolutePath());
            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ5));
            return null;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(updatePackage.getLocalVersion());
        sbLIZ6.append(str);
        sbLIZ6.append("res.zip");
        return new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ6));
    }

    @Override // X.AbstractC1552240qUo
    public final void LIZIZ(Object... objArr) {
        this.LJI = (C1551530qTf) objArr[0];
        this.LJII = (C1550930qSh) objArr[1];
    }

    @Override // X.AbstractC1552240qUo
    public final Object LIZJ(InterfaceC1552320qUw<Pair<InterfaceC1550870qSb, UpdatePackage>> interfaceC1552320qUw, Pair<InterfaceC1550870qSb, UpdatePackage> pair) throws Throwable {
        C0VSJ c0vsj;
        Pair<InterfaceC1550870qSb, UpdatePackage> pair2 = pair;
        UpdatePackage updatePackage = (UpdatePackage) pair2.second;
        String accessKey = updatePackage.getAccessKey();
        String channel = updatePackage.getChannel();
        if (this.LJII != null) {
            C1553130qWF.LIZ("gecko-debug-tag", "check decompress state before merge patch");
            this.LJII.LIZ((UpdatePackage) pair2.second);
        }
        C1553130qWF.LIZ("gecko-debug-tag", "start merge patch, channel:", accessKey, channel);
        InterfaceC1550870qSb interfaceC1550870qSb = (InterfaceC1550870qSb) pair2.first;
        File fileLIZIZ = interfaceC1550870qSb.LIZIZ();
        interfaceC1550870qSb.LIZJ();
        interfaceC1550870qSb.release();
        File fileLIZLLL = LIZLLL(updatePackage);
        if (fileLIZLLL != null) {
            int packageType = updatePackage.getPackageType();
            if (packageType != 0) {
                if (packageType == 1) {
                    c0vsj = new C0VSJ(fileLIZIZ.getParentFile(), C1551570qTj.LIZLLL(updatePackage, (String) ListProtector.get(updatePackage.getFullPackage().getUrlList(), 0)));
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unknown file type: ");
                    sbLIZ.append(packageType);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                c0vsj = new C0VSJ(fileLIZIZ.getParentFile(), "res.zip");
            }
            C0X9F.LJ(c0vsj);
            String absolutePath = fileLIZIZ.getParentFile().getParentFile().getAbsolutePath();
            try {
                if (AppSettingsManager.LIZIZ()) {
                    try {
                        try {
                            BsPatch.LIZ(fileLIZLLL, fileLIZIZ, c0vsj.getParentFile(), c0vsj.getName());
                            C0X9F.LJ(fileLIZIZ);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("merge patch failed, channel：");
                            sbLIZ2.append(updatePackage.getChannel());
                            sbLIZ2.append(", pkg id:");
                            sbLIZ2.append(updatePackage.getPatch().getId());
                            sbLIZ2.append(", caused by:");
                            sbLIZ2.append(e.getMessage());
                            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), e);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C0X9F.LJ(fileLIZIZ);
                        throw th;
                    }
                } else {
                    try {
                        try {
                            if (!C0X9L.LIZIZ(absolutePath)) {
                                C1553130qWF.LIZ("gecko-debug-tag", "merge patch lock,channel:", absolutePath);
                                BsPatch.LIZ(fileLIZLLL, fileLIZIZ, c0vsj.getParentFile(), c0vsj.getName());
                                C0X9L.LIZLLL(absolutePath);
                                C1553130qWF.LIZ("gecko-debug-tag", "merge patch unlock,channel:", absolutePath);
                                C0X9F.LJ(fileLIZIZ);
                            } else {
                                throw new RuntimeException("read lock timeout");
                            }
                        } catch (Exception e2) {
                            e = e2;
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("merge patch failed, channel：");
                            sbLIZ3.append(updatePackage.getChannel());
                            sbLIZ3.append(", pkg id:");
                            sbLIZ3.append(updatePackage.getPatch().getId());
                            sbLIZ3.append(", caused by:");
                            sbLIZ3.append(e.getMessage());
                            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3), e);
                        }
                    } catch (Exception e3) {
                        e = e3;
                    } catch (Throwable th2) {
                        th = th2;
                        TryCatchGuardChecker.doCheck(th);
                        if (0 == 0) {
                            C0X9L.LIZLLL(absolutePath);
                        }
                        C1553130qWF.LIZ("gecko-debug-tag", "merge patch unlock,channel:", absolutePath);
                        C0X9F.LJ(fileLIZIZ);
                        throw th;
                    }
                }
                InterfaceC1550870qSb interfaceC1550870qSbLIZ = C2221908nB.LIZ(this.LJI, c0vsj, c0vsj.length());
                interfaceC1550870qSbLIZ.position(0L);
                try {
                    C08IP.LIZ(new C1550880qSc(interfaceC1550870qSbLIZ), updatePackage.getFullPackage().getMd5());
                    try {
                        Object objProceed = interfaceC1552320qUw.proceed(new Pair<>(interfaceC1550870qSbLIZ, updatePackage));
                        interfaceC1550870qSbLIZ.release();
                        return objProceed;
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        interfaceC1550870qSbLIZ.release();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("check md5 failed, channel:");
                    sbLIZ4.append(updatePackage.getChannel());
                    sbLIZ4.append(", pkg id:");
                    sbLIZ4.append(updatePackage.getFullPackage().getId());
                    sbLIZ4.append(", caused by:");
                    sbLIZ4.append(th4.getMessage());
                    throw new C1550940qSi(C2188811AlT.LIZIZ(sbLIZ4), th4);
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } else {
            throw new RuntimeException("get old file is null");
        }
    }
}
