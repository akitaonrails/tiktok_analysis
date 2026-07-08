package X;

import Y.ARunnableS117S0100000_17;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManagerKotlin;
import com.bytedance.android.livesdk.model.Gift;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0fad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133010fad {
    public final synchronized GiftManagerKotlin LJ() {
        GiftManagerKotlin giftManagerKotlin;
        giftManagerKotlin = GiftManagerKotlin.sInst;
        if (giftManagerKotlin == null) {
            giftManagerKotlin = new GiftManagerKotlin();
        }
        GiftManagerKotlin.sInst = giftManagerKotlin;
        C1133100fam.LIZ.getClass();
        if (C1133100fam.LIZ().getExitClearGiftCache()) {
            C1289620jfE.LIZJ(new ARunnableS117S0100000_17(giftManagerKotlin, 89));
        }
        return giftManagerKotlin;
    }

    public static void LIZ(Collection collection) {
        if (collection == null) {
            return;
        }
        InterfaceC1133710fbl.LIZ.getClass();
        long jLJI = ((C1133940fc8) C1120710fGn.LIZ()).LJI();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            Gift gift = (Gift) it2.next();
            if (gift != null && gift.id == jLJI) {
                it2.remove();
            }
        }
    }

    public static void LIZIZ(Collection collection) {
        if (collection == null) {
            return;
        }
        LIZLLL(collection);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            Gift gift = (Gift) it2.next();
            if (gift != null && !gift.forLinkMic) {
                it2.remove();
            }
        }
    }

    public static void LIZJ(Collection collection) {
        if (collection == null) {
            return;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            Gift gift = (Gift) it2.next();
            if (gift != null && !gift.isDisplayedOnPanel) {
                it2.remove();
            }
        }
    }

    public static void LIZLLL(Collection collection) {
        int i;
        if (collection == null) {
            return;
        }
        Iterator it2 = collection.iterator();
        boolean zLJJIJIIJIL = C1128450fTH.LJJIJIIJIL();
        while (it2.hasNext()) {
            Gift gift = (Gift) it2.next();
            if (gift != null && ((i = gift.giftSubType) == 3 || i == 4)) {
                if (zLJJIJIIJIL) {
                    it2.remove();
                }
            }
        }
    }
}
