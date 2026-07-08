package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.p;
import com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0mOI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394440mOI {
    public static final boolean LIZ(C1394490mON c1394490mON) {
        if (C298890Bnb.LIZ()) {
            if (c1394490mON == null || !u.LJJIIJZLJL(c1394490mON.LIZ, "autocut", false)) {
                return false;
            }
        } else if (!Intrinsics.LJFF(c1394490mON, C1394490mON.LJ) && !Intrinsics.LJFF(c1394490mON, C1394490mON.LJFF) && !Intrinsics.LJFF(c1394490mON, C1394490mON.LJI) && !Intrinsics.LJFF(c1394490mON, C1394490mON.LJII) && !Intrinsics.LJFF(c1394490mON, C1394490mON.LJIIIIZZ) && !Intrinsics.LJFF(c1394490mON, C1394490mON.LJIIIZ)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(C1394490mON c1394490mON) {
        if (C298890Bnb.LIZ()) {
            if (c1394490mON == null || !u.LJJIIJZLJL(c1394490mON.LIZ, "mv", false)) {
                return false;
            }
        } else if (!Intrinsics.LJFF(c1394490mON, C1394490mON.LIZIZ) && !Intrinsics.LJFF(c1394490mON, C1394490mON.LIZJ) && !Intrinsics.LJFF(c1394490mON, C1394490mON.LIZLLL)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(int i) {
        if (i != EnumC1430380nKG.ANCHOR_AUTO_CUT.getTYPE() && i != EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE() && i != EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE() && i != EnumC1430380nKG.MV_TEMPLATE.getTYPE() && i != EnumC1430380nKG.ANCHOR_AIGT_TEMPLATE.getTYPE() && i != EnumC1430380nKG.ANCHOR_SGT_TEMPLATE.getTYPE() && i != EnumC1430380nKG.ANCHOR_TT_CC_TEMPLATE.getTYPE()) {
            return false;
        }
        return true;
    }

    public static final C1394490mON LIZLLL(AnchorCommonStruct anchorCommonStruct) {
        if (C289520BWk.LIZ()) {
            Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IAnchorBusinessOutBridgeService.class, false, false, false, 14, null);
            if (objPluggableSpi$default != null) {
                String str = (String) ListProtector.get(((IAnchorBusinessOutBridgeService) objPluggableSpi$default).LIZ(anchorCommonStruct, "dispatch_type"), 0);
                if (str == null) {
                    return null;
                }
                return new C1394490mON(str);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (anchorCommonStruct == null) {
            return null;
        }
        try {
            new p();
            String strLJIL = p.LIZJ(anchorCommonStruct.getExtra()).LJIILIIL().LJJIIZ("dispatch_type").LJIL();
            if (strLJIL != null) {
                return new C1394490mON(strLJIL);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    public static final EnumC1394470mOL LJ(AnchorCommonStruct anchorCommonStruct) {
        String strSubType;
        if (anchorCommonStruct != null) {
            strSubType = anchorCommonStruct.subType();
        } else {
            strSubType = null;
        }
        return LJII(strSubType);
    }

    public static final EnumC1430380nKG LJFF(EnumC1394470mOL enumC1394470mOL) {
        if (enumC1394470mOL != null) {
            int i = C1394450mOJ.LIZ[enumC1394470mOL.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                if (i != 4) {
                    if (i != 7) {
                        if (i != 8) {
                            if (i == 9) {
                                return EnumC1430380nKG.ANCHOR_SGT_TEMPLATE;
                            }
                            return null;
                        }
                        return EnumC1430380nKG.ANCHOR_AIGT_TEMPLATE;
                    }
                    return EnumC1430380nKG.ANCHOR_TT_CC_TEMPLATE;
                }
                return EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE;
            }
            return EnumC1430380nKG.ANCHOR_UGC_TEMPLATE;
        }
        return null;
    }

    public static final EnumC1430380nKG LJI(EnumC1412640mre enumC1412640mre) {
        if (enumC1412640mre != null) {
            int i = C1394450mOJ.LIZIZ[enumC1412640mre.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return EnumC1430380nKG.ANCHOR_SGT_TEMPLATE;
                            }
                            return null;
                        }
                        return EnumC1430380nKG.ANCHOR_AIGT_TEMPLATE;
                    }
                    return EnumC1430380nKG.ANCHOR_TT_CC_TEMPLATE;
                }
                return EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE;
            }
            return EnumC1430380nKG.ANCHOR_UGC_TEMPLATE;
        }
        return null;
    }

    public static final EnumC1394470mOL LJII(String str) {
        for (EnumC1394470mOL enumC1394470mOL : EnumC1394470mOL.values()) {
            if (Intrinsics.LJFF(enumC1394470mOL.getValue(), str)) {
                return enumC1394470mOL;
            }
        }
        return null;
    }

    public static final EnumC1412640mre LJIIIIZZ(EnumC1394470mOL enumC1394470mOL) {
        if (enumC1394470mOL == null) {
            return null;
        }
        switch (C1394450mOJ.LIZ[enumC1394470mOL.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return EnumC1412640mre.UGC_TEMPLATE;
            case 4:
                return EnumC1412640mre.PUGC_TEMPLATE;
            case 5:
                return EnumC1412640mre.ALGORITHM_TEMPLATE;
            case 6:
                return EnumC1412640mre.MV_TEMPLATE;
            case 7:
                return EnumC1412640mre.CUT_SAME;
            case 8:
                return EnumC1412640mre.AIGT;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC1412640mre.SGT;
            default:
                throw new C1954807lC();
        }
    }
}
