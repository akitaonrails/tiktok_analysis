package X;

import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;

/* JADX INFO: renamed from: X.0PfM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650500PfM {
    public static final int LIZ(ECSearchEntranceData eCSearchEntranceData) {
        if (eCSearchEntranceData != null) {
            return eCSearchEntranceData.getEntranceValue$search_api_release();
        }
        return C0QXR.DEFAULT.getValue();
    }

    public static final int LIZIZ(C0QER c0qer) {
        ECSearchEntranceData ecSearchEntranceData;
        if (c0qer != null) {
            ecSearchEntranceData = c0qer.getEcSearchEntranceData();
        } else {
            ecSearchEntranceData = null;
        }
        return LIZ(ecSearchEntranceData);
    }

    public static final boolean LIZJ(C0QER c0qer) {
        if (c0qer == null || c0qer.getEcSearchEntranceData() == null) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(ISearchContextAbility iSearchContextAbility) {
        if (((C0PYC) iSearchContextAbility.zJ2().LIZJ()).LL != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(C0QER c0qer) {
        Integer numValueOf;
        if (c0qer.getEcSearchEntranceData() != null) {
            ECSearchEntranceData ecSearchEntranceData = c0qer.getEcSearchEntranceData();
            if (ecSearchEntranceData != null) {
                numValueOf = Integer.valueOf(LIZ(ecSearchEntranceData));
            } else {
                numValueOf = null;
            }
            int value = C0QXR.MALL.getValue();
            if (numValueOf == null || numValueOf.intValue() != value) {
                int value2 = C0QXR.HOMEPAGE_MALL.getValue();
                if (numValueOf == null || numValueOf.intValue() != value2) {
                    int value3 = C0QXR.FROM_HALF_SHOP.getValue();
                    if (numValueOf == null || numValueOf.intValue() != value3) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
