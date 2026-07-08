package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.0qSZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550850qSZ extends AbstractC1552240qUo<Pair<InterfaceC1550870qSb, UpdatePackage>, Pair<UpdatePackage, Long>> {
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:36:0x0104
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LIZLLL(X.C0VSJ r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1550850qSZ.LIZLLL(X.0VSJ):void");
    }

    @Override // X.AbstractC1552240qUo
    public final Object LIZJ(InterfaceC1552320qUw<Pair<UpdatePackage, Long>> interfaceC1552320qUw, Pair<InterfaceC1550870qSb, UpdatePackage> pair) throws Throwable {
        boolean z;
        boolean z2;
        String str;
        Pair<InterfaceC1550870qSb, UpdatePackage> pair2 = pair;
        UpdatePackage updatePackage = (UpdatePackage) pair2.second;
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
        sbLIZ.append("start active channel:");
        C1553130qWF.LIZ("gecko-debug-tagRenameChannel", C2188811AlT.LIZIZ(sbLIZ), ((UpdatePackage) pair2.second).getChannel());
        long version = updatePackage.getVersion();
        File parentFile = ((InterfaceC1550870qSb) pair2.first).LIZIZ().getParentFile();
        if (updatePackage.isSingleFile()) {
            parentFile = parentFile.getParentFile();
        }
        File parentFile2 = parentFile.getParentFile();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(version);
        sbLIZ2.append("");
        C0VSJ c0vsj = new C0VSJ(parentFile2, C2188811AlT.LIZIZ(sbLIZ2));
        if (C0X9F.LJ(c0vsj)) {
            boolean zRenameTo = parentFile.renameTo(c0vsj);
            if (z) {
                c0vsj.setLastModified(c0vsj.lastModified() + 1);
            }
            if (zRenameTo) {
                try {
                    LIZLLL(c0vsj);
                    return interfaceC1552320qUw.proceed(new Pair<>(updatePackage, Long.valueOf(version)));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C0X9F.LJFF(c0vsj);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("check file broken failed: ");
                    sbLIZ3.append(e.getMessage());
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("rename failed:");
            sbLIZ4.append(parentFile.getAbsolutePath());
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4));
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("delete old dir failed:");
        sbLIZ5.append(c0vsj.getAbsolutePath());
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ5));
    }
}
