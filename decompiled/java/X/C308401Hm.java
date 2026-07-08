package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;

/* JADX INFO: renamed from: X.01Hm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C308401Hm {
    public static boolean LIZ() {
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        Integer numValueOf = multiGuestDataHolder != null ? Integer.valueOf(multiGuestDataHolder.LJJIFFI) : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isEnableSwitchGiftTarget, linkedGuestNum:");
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("MultiGuestGiftLeafManager", C2188811AlT.LIZIZ(sbLIZ));
        return numValueOf != null && numValueOf.intValue() >= 1;
    }
}
