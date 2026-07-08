package X;

import com.bytedance.geckox.model.UpdatePackage;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qU9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551830qU9 {
    public static final ConcurrentHashMap<Long, C1553050qW7> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(UpdatePackage updatePackage, boolean z, boolean z2, String str) {
        int size;
        boolean z3;
        int size2;
        EnumC1552350qUz enumC1552350qUz;
        boolean z4 = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDownloadEnd:");
        sbLIZ.append(updatePackage.getChannel());
        sbLIZ.append(", isSucceed:");
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append(updatePackage.getRequestId());
        C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
        C1553050qW7 c1553050qW7 = LIZ.get(Long.valueOf(updatePackage.getRequestId()));
        if (c1553050qW7 != null) {
            List<UpdatePackage> list = c1553050qW7.LIZ;
            ArrayList arrayList = new ArrayList();
            for (UpdatePackage updatePackage2 : list) {
                UpdatePackage updatePackage3 = updatePackage2;
                if (!Intrinsics.LJFF(updatePackage3.getChannel(), updatePackage.getChannel()) || !Intrinsics.LJFF(updatePackage3.getAccessKey(), updatePackage.getAccessKey())) {
                    arrayList.add(updatePackage2);
                }
            }
            c1553050qW7.LIZ = new ArrayList(arrayList);
            C1551800qU6 c1551800qU6 = c1553050qW7.LIZIZ;
            if (z) {
                c1551800qU6.LJIIZILJ++;
                if (c1551800qU6.LJIJJ == null) {
                    c1551800qU6.LJIJJ = updatePackage.getChannel();
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c1551800qU6.LJIJJ);
                    sbLIZ2.append(',');
                    sbLIZ2.append(updatePackage.getChannel());
                    c1551800qU6.LJIJJ = C2188811AlT.LIZIZ(sbLIZ2);
                }
            } else if (z2) {
                List<UpdatePackage> list2 = c1551800qU6.LJIJI;
                if (list2 != null) {
                    C188800o2.LIZIZ(list2, new AwS582S0100000_3(updatePackage, 154));
                }
            } else {
                c1551800qU6.LJIIIZ = EnumC1552280qUs.DOWNLOAD_FAILED;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(updatePackage.getChannel());
                sbLIZ3.append(": ");
                sbLIZ3.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                String str2 = c1551800qU6.LIZJ;
                if (str2 != null && str2.length() != 0) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(c1551800qU6.LIZJ);
                    sbLIZ4.append(", ");
                    sbLIZ4.append(strLIZIZ);
                    c1551800qU6.LIZJ = C2188811AlT.LIZIZ(sbLIZ4);
                } else {
                    c1551800qU6.LIZJ = strLIZIZ;
                }
            }
            if (c1553050qW7.LIZ.isEmpty()) {
                LIZ.remove(Long.valueOf(updatePackage.getRequestId()));
                c1551800qU6.LJIILIIL.LJIIIIZZ = System.currentTimeMillis();
                List<UpdatePackage> list3 = c1551800qU6.LJIJI;
                if (list3 != null) {
                    size = list3.size();
                } else {
                    size = 0;
                }
                if (size < c1551800qU6.LJIILLIIL) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i = c1551800qU6.LJIIZILJ;
                List<UpdatePackage> list4 = c1551800qU6.LJIJI;
                if (list4 != null) {
                    size2 = list4.size();
                } else {
                    size2 = 0;
                }
                if (i != size2) {
                    z4 = false;
                }
                if (!z3) {
                    if (z4) {
                        enumC1552350qUz = EnumC1552350qUz.CHECK_SUCCEED_NOT_FILTERED_ALL_DOWNLOADED;
                    } else {
                        enumC1552350qUz = EnumC1552350qUz.CHECK_SUCCEED_NOT_FILTERED_PARTIAL_DOWNLOADED;
                    }
                } else if (z4) {
                    enumC1552350qUz = EnumC1552350qUz.CHECK_SUCCEED_FILTERED_ALL_DOWNLOADED;
                } else {
                    enumC1552350qUz = EnumC1552350qUz.CHECK_SUCCEED_FILTERED_PARTIAL_DOWNLOADED;
                }
                c1551800qU6.LIZ = enumC1552350qUz;
                C1551780qU4.LJ(c1551800qU6);
            }
        }
    }
}
