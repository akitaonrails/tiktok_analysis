package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0mOM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394480mOM {
    public static final EnumC1412640mre LIZ(AnchorCommonStruct anchorCommonStruct) {
        EnumC1394470mOL enumC1394470mOLLJ;
        if (anchorCommonStruct != null && (enumC1394470mOLLJ = C1394440mOI.LJ(anchorCommonStruct)) != null) {
            return LIZIZ(enumC1394470mOLLJ);
        }
        return null;
    }

    public static final EnumC1412640mre LIZIZ(EnumC1394470mOL enumC1394470mOL) {
        switch (C1394460mOK.LIZ[enumC1394470mOL.ordinal()]) {
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
                return null;
        }
    }
}
