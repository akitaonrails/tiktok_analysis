package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0vQ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741480vQ2 {
    public static final C1741480vQ2 LIZ = new C1741480vQ2();

    public static C1740600vOc LIZ(C18PU c18pu, Fragment fragment, int i, BcmParams bcmParams) {
        String str;
        try {
            if (fragment != null) {
                switch (C18PT.LIZ[c18pu.ordinal()]) {
                    case 1:
                    case 2:
                        str = EnumC1741460vQ0.VSA_LARGE_CARD.getCCode() + '.' + EnumC1741490vQ3.VSA_LARGE_CARD_PRODUCT.getDCode() + "_i" + i;
                        break;
                    case 3:
                        str = EnumC1741460vQ0.VSA_LARGE_CARD.getCCode() + '.' + EnumC1741490vQ3.VSA_LARGE_CARD_BUTTON.getDCode();
                        break;
                    case 4:
                    case 5:
                        str = EnumC1741460vQ0.VSA_LARGE_CARD.getCCode() + '.' + EnumC1741490vQ3.DEFAULT.getDCode();
                        break;
                    case 6:
                        str = EnumC1741460vQ0.VSA_LARGE_CARD.getCCode() + '.' + EnumC1741490vQ3.VSA_LARGE_CARD_CLOSE.getDCode() + "_i" + i;
                        break;
                    case 7:
                        str = EnumC1741460vQ0.VSA_SMALL_CARD.getCCode() + '.' + EnumC1741490vQ3.VSA_SMALL_CARD_PRODUCT.getDCode() + "_i" + i;
                        break;
                    case 8:
                        str = EnumC1741460vQ0.VSA_SMALL_CARD.getCCode() + '.' + EnumC1741490vQ3.DEFAULT.getDCode();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        str = EnumC1741450vPz.SHOP_TAB.getCCode() + '.' + EnumC1741490vQ3.VSA_TAB_ICON.getDCode();
                        break;
                    default:
                        throw new C1954807lC();
                }
                C21244318Bt c21244318Bt = new C21244318Bt();
                c21244318Bt.LIZ = str;
                c21244318Bt.LIZIZ = PageFinder.via(fragment);
                c21244318Bt.LIZJ = bcmParams;
                return new C1740600vOc(c21244318Bt, BtmSDK.INSTANCE.createJumpSourceBtmToken(c21244318Bt));
            }
            C1740610vOd c1740610vOd = C1740610vOd.LIZ;
            EnumC1741430vPx enumC1741430vPx = EnumC1741430vPx.VSA_CARD;
            EnumC1741440vPy enumC1741440vPy = EnumC1741440vPy.VSA_CARD_PRODUCT;
            String msg = EnumC683940QsC.FRAGMENT_NULL.getMsg();
            c1740610vOd.getClass();
            C1740610vOd.LIZ(enumC1741430vPx, enumC1741440vPy, msg);
            return null;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
