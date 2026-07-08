package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.14c4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20301014c4 {
    public static volatile C20301214c6 LIZ = LIZJ();
    public static final List<InterfaceC20301414c8> LIZIZ = new ArrayList();

    public static String LIZIZ() {
        if (!((Boolean) C268430AfZ.LIZ.getValue()).booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[getStoreRegion]: currentStoreRegionInfo = ");
            sbLIZ.append(LIZ);
            C2344809Gs.LJFF("TikTok_StoreRegion", C2188811AlT.LIZIZ(sbLIZ));
        }
        return LIZ.LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C20301214c6 LIZJ() {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20301014c4.LIZJ():X.14c6");
    }

    public static void LIZ(InterfaceC20301414c8 interfaceC20301414c8) {
        ArrayList arrayList = (ArrayList) LIZIZ;
        if (!arrayList.contains(interfaceC20301414c8)) {
            arrayList.add(interfaceC20301414c8);
        }
    }
}
