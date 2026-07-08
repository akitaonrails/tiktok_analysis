package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3LayoutMarginSetting;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0Zxu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C916800Zxu {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZJ() {
        return (int) C497740JfY.LIZIZ(MultiGuestV3LayoutMarginSetting.INSTANCE.getValue());
    }

    public static boolean LIZLLL() {
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        return C927600aFK.LJFF() == EnumC918990a1R.ZOOM_PANEL_FLOAT_GUEST;
    }

    public static boolean LJFF() {
        InterfaceC927510aFB interfaceC927510aFB;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJFF() == EnumC918990a1R.ZOOM_PANEL_FLOAT_GUEST) {
            return false;
        }
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("ZOOM_SERVICE");
        if (!(objLJIIIZ instanceof InterfaceC927510aFB) || (interfaceC927510aFB = (InterfaceC927510aFB) objLJIIIZ) == null || !interfaceC927510aFB.LJIIIIZZ()) {
            C307001Gy.LIZ().getClass();
            if (C927600aFK.LJII() == EnumC918970a1P.FLOATING) {
                return false;
            }
        }
        return true;
    }

    public static EnumC918970a1P LIZ(String str) {
        if (C931790aM5.LIZIZ()) {
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            if (C01ZD.LIZ(7) && C940770aaZ.LIZ().getDataSource().getPanelLayoutType() == 1) {
                return EnumC918970a1P.NORMAL;
            }
        }
        if (Intrinsics.LJFF(str, EnumC918990a1R.GRID_FLOAT.getBusinessType())) {
            return EnumC918970a1P.GRID;
        }
        if (Intrinsics.LJFF(str, EnumC918990a1R.GRID_FIX.getBusinessType())) {
            return EnumC918970a1P.GRID_FIX;
        }
        if (Intrinsics.LJFF(str, EnumC918990a1R.FLOAT_FIX.getBusinessType())) {
            return EnumC918970a1P.FLOATING_FIX;
        }
        if (Intrinsics.LJFF(str, EnumC918990a1R.FLOAT.getBusinessType())) {
            return EnumC918970a1P.FLOATING;
        }
        if (Intrinsics.LJFF(str, EnumC918990a1R.ZOOM_PANEL.getBusinessType())) {
            return EnumC918970a1P.FLOATING_FIX;
        }
        if (!Intrinsics.LJFF(str, EnumC918990a1R.ZOOM_GRID_ANCHOR.getBusinessType()) && !Intrinsics.LJFF(str, EnumC918990a1R.ZOOM_GRID_GUEST.getBusinessType())) {
            if (Intrinsics.LJFF(str, EnumC918990a1R.ZOOM_PANEL_FLOAT_GUEST.getBusinessType())) {
                return EnumC918970a1P.FLOATING;
            }
            if (!Intrinsics.LJFF(str, EnumC918990a1R.ZOOM_GRID_FLOAT_ANCHOR.getBusinessType()) && !Intrinsics.LJFF(str, EnumC918990a1R.ZOOM_GRID_FLOAT_GUEST.getBusinessType())) {
                return EnumC918970a1P.NORMAL;
            }
            return EnumC918970a1P.GRID;
        }
        return EnumC918970a1P.GRID_FIX;
    }

    public static EnumC918990a1R LJI(InterfaceC920220a3Q interfaceC920220a3Q) {
        PosIdentity next;
        boolean z;
        if (interfaceC920220a3Q == null) {
            return EnumC918990a1R.NORMAL;
        }
        Iterator<PosIdentity> it2 = interfaceC920220a3Q.LJIIL().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C930480aJy c930480aJy = C930480aJy.LIZ;
                String str = next.value;
                c930480aJy.getClass();
                if (C930480aJy.LJIJJLI(str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next != null) {
            z = true;
        } else {
            z = false;
        }
        if (!interfaceC920220a3Q.LJIILJJIL()) {
            int iLJII = interfaceC920220a3Q.LJII();
            if (iLJII != 1) {
                if (iLJII != 2) {
                    if (iLJII != 3) {
                        if (iLJII != 4) {
                            return EnumC918990a1R.NORMAL;
                        }
                        return EnumC918990a1R.GRID_FIX;
                    }
                    return EnumC918990a1R.GRID_FLOAT;
                }
                return EnumC918990a1R.FLOAT_FIX;
            }
            return EnumC918990a1R.FLOAT;
        }
        int iLJII2 = interfaceC920220a3Q.LJII();
        if (iLJII2 != 1) {
            if (iLJII2 != 2) {
                if (iLJII2 != 3) {
                    if (iLJII2 != 4) {
                        return EnumC918990a1R.NORMAL;
                    }
                    if (z) {
                        return EnumC918990a1R.ZOOM_GRID_ANCHOR;
                    }
                    return EnumC918990a1R.ZOOM_GRID_GUEST;
                }
                if (z) {
                    return EnumC918990a1R.ZOOM_GRID_FLOAT_ANCHOR;
                }
                return EnumC918990a1R.ZOOM_GRID_FLOAT_GUEST;
            }
            return EnumC918990a1R.ZOOM_PANEL;
        }
        return EnumC918990a1R.ZOOM_PANEL_FLOAT_GUEST;
    }

    public static boolean LIZIZ(String str, boolean z) {
        InterfaceC927510aFB interfaceC927510aFB;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        EnumC918990a1R enumC918990a1RLJFF = C927600aFK.LJFF();
        if (enumC918990a1RLJFF != null && C916500ZxQ.LIZ[enumC918990a1RLJFF.ordinal()] == 1) {
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("ZOOM_SERVICE");
            if (((objLJIIIZ instanceof InterfaceC927510aFB) && (interfaceC927510aFB = (InterfaceC927510aFB) objLJIIIZ) != null && interfaceC927510aFB.LJIJ(str)) || z) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJ(String str, boolean z) {
        InterfaceC927510aFB interfaceC927510aFB;
        if (!z) {
            return true;
        }
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("ZOOM_SERVICE");
        String strLJIILIIL = null;
        if (objLJIIIZ instanceof InterfaceC927510aFB) {
            interfaceC927510aFB = (InterfaceC927510aFB) objLJIIIZ;
        } else {
            interfaceC927510aFB = null;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJFF() != EnumC918990a1R.ZOOM_PANEL_FLOAT_GUEST) {
            return true;
        }
        if (interfaceC927510aFB != null) {
            strLJIILIIL = interfaceC927510aFB.LJIILIIL();
        }
        if (!Intrinsics.LJFF(strLJIILIIL, str)) {
            return true;
        }
        return false;
    }

    public static EnumC918970a1P LJII(Integer num, InterfaceC920220a3Q interfaceC920220a3Q) {
        if (num == null) {
            return EnumC918970a1P.NORMAL;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C01ZD.LIZ(7) && interfaceC920220a3Q.getPanelLayoutType() == 1) {
            return EnumC918970a1P.NORMAL;
        }
        if (num.intValue() == 3) {
            return EnumC918970a1P.GRID;
        }
        if (num.intValue() == 4) {
            return EnumC918970a1P.GRID_FIX;
        }
        if (num.intValue() == 1) {
            return EnumC918970a1P.FLOATING;
        }
        if (num.intValue() == 2) {
            return EnumC918970a1P.FLOATING_FIX;
        }
        return EnumC918970a1P.NORMAL;
    }
}
