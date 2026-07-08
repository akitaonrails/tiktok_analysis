package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0aBP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925170aBP implements InterfaceC926580aDg {
    public final DataChannel LIZ;

    public C925170aBP(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public static final String LIZIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_LinkEntranceInterceptor_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC926580aDg
    public final boolean LIZ(String str) {
        if (!C925150aBN.LJJIII()) {
            if (C925150aBN.LJJIL(false, false, 3)) {
                String strLJIJI = C497740JfY.LJIJI(2131854217);
                C766270U4b.LJIIJJI(strLJIJI);
                C920390a3h.LIZ(strLJIJI);
                C927960aFu.LIZ("ViewerPermissionOff");
                String strLIZIZ = LIZIZ(35);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onInteractIconClickForApply intercepted by LinkEntranceInterceptor, from: ");
                sbLIZ.append(str);
                C1AZW.LJIIJ(12, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                return true;
            }
            if (!C925150aBN.LJJIIZI() || !C925150aBN.LJJIJIIJI()) {
                return false;
            }
            C766270U4b.LIZLLL(2131844525);
            C927960aFu.LIZ("LinkMicPermissionDisabled");
            String strLIZIZ2 = LIZIZ(43);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onInteractIconClickForApply intercepted by LinkEntranceInterceptor, from: ");
            sbLIZ2.append(str);
            C1AZW.LJIIJ(12, strLIZIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            return true;
        }
        boolean zLJIJ = C925150aBN.LJIJ(this.LIZ);
        if (zLJIJ) {
            String strLIZIZ3 = LIZIZ(52);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onInteractIconClickForApply intercepted by LinkEntranceInterceptor, from: ");
            sbLIZ3.append(str);
            C1AZW.LJIIJ(12, strLIZIZ3, C2188811AlT.LIZIZ(sbLIZ3), null, null);
        }
        return zLJIJ;
    }
}
