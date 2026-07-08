package X;

import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ljb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369210ljb {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC1369700lkO LIZ(BaseSharePackage baseSharePackage) {
        Integer num;
        Object objLJ = null;
        if (baseSharePackage != null) {
            objLJ = baseSharePackage.LJ("im_position_in_long_press");
        }
        if ((objLJ instanceof Integer) && (num = (Integer) objLJ) != null) {
            int iIntValue = num.intValue();
            InterfaceC1370520lli.LJL.getClass();
            EnumC1369700lkO enumC1369700lkO = C1369690lkN.LIZIZ.get(Integer.valueOf(iIntValue));
            if (enumC1369700lkO != null) {
                return enumC1369700lkO;
            }
        }
        return EnumC1369700lkO.BOTTOM;
    }

    public static EnumC1369700lkO LIZIZ(BaseSharePackage baseSharePackage) {
        Integer num;
        Object objLJ = null;
        if (baseSharePackage != null) {
            objLJ = baseSharePackage.LJ("im_position_in_share");
        }
        if ((objLJ instanceof Integer) && (num = (Integer) objLJ) != null) {
            int iIntValue = num.intValue();
            InterfaceC1370520lli.LJL.getClass();
            EnumC1369700lkO enumC1369700lkO = C1369690lkN.LIZIZ.get(Integer.valueOf(iIntValue));
            if (enumC1369700lkO != null) {
                return enumC1369700lkO;
            }
        }
        return EnumC1369700lkO.TOP;
    }

    public static final int LIZLLL(String str) {
        if (Intrinsics.LJFF(str, "long_press")) {
            return EnumC992940bwi.IM_SHARE_UNDO_STYLE_AVATAR.ordinal();
        }
        return EnumC992940bwi.IM_SHARE_UNDO_STYLE_NONE.ordinal();
    }

    public static EnumC1369720lkQ LIZJ(BaseSharePackage baseSharePackage, String str) {
        int iOrdinal;
        Integer num;
        Integer num2;
        Object objLJ = null;
        if (str != null) {
            if (Intrinsics.LJFF(str, "long_press")) {
                if (baseSharePackage != null) {
                    objLJ = baseSharePackage.LJ("im_orientation_in_long_press");
                }
                if ((objLJ instanceof Integer) && (num2 = (Integer) objLJ) != null) {
                    iOrdinal = num2.intValue();
                } else {
                    iOrdinal = EnumC1369720lkQ.VERTICAL.ordinal();
                }
            } else if (Intrinsics.LJFF(str, "share_panel")) {
                if (baseSharePackage != null) {
                    objLJ = baseSharePackage.LJ("im_orientation_in_share");
                }
                if ((objLJ instanceof Integer) && (num = (Integer) objLJ) != null) {
                    iOrdinal = num.intValue();
                } else {
                    iOrdinal = EnumC1369720lkQ.HORIZONTAL.ordinal();
                }
            } else {
                iOrdinal = EnumC1369720lkQ.HORIZONTAL.ordinal();
            }
            Integer numValueOf = Integer.valueOf(iOrdinal);
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                InterfaceC1370520lli.LJL.getClass();
                EnumC1369720lkQ enumC1369720lkQ = C1369690lkN.LIZJ.get(Integer.valueOf(iIntValue));
                if (enumC1369720lkQ != null) {
                    return enumC1369720lkQ;
                }
            }
        }
        return EnumC1369720lkQ.HORIZONTAL;
    }

    public static boolean LJ(SharePackage sharePackage, String str) {
        InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
        if (interfaceC1370110ll3 != null && interfaceC1370110ll3.LIZLLL(sharePackage) && LIZJ(sharePackage, str) == EnumC1369720lkQ.HORIZONTAL && LIZLLL(str) > 0) {
            return true;
        }
        return false;
    }
}
