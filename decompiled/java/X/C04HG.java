package X;

import Y.ARunnableS101S0100000_1;
import Y.AfS137S0200000_1;
import android.os.Handler;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.BundleAddItemsToCartData;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.BundleAddItemsToCartRequest;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS130S0400000_1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.04HG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04HG extends C11SY {
    public static final C04HG LJI;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(160));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(163));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(161));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(162));

    static {
        new C957203og();
        LJI = new C04HG();
    }

    public C04HG() {
        new HashMap();
    }

    public final C11O8 LJJIJIL(BundleAddItemsToCartRequest bundleAddItemsToCartRequest, final View view, final Function2 function2, final Function1 function1) {
        return C11RS.LJLZ(((C11T3) this.LJ.getValue()).request(bundleAddItemsToCartRequest).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.04HF
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                BundleAddItemsToCartData bundleAddItemsToCartData;
                View view2;
                C04HH c04hh = (C04HH) obj;
                BundleAddItemsToCartData bundleAddItemsToCartData2 = (BundleAddItemsToCartData) c04hh.data;
                if (bundleAddItemsToCartData2 != null && bundleAddItemsToCartData2.exceptionUX != null && (view2 = view) != null) {
                    C786410Ut5.LJJZZIII((Handler) this.LJFF.getValue(), new ARunnableS101S0100000_1(new AwS130S0400000_1((Function1) function1, (Function1<? super C04HH, Boolean>) c04hh, (C04HH) view2, (View) function2, (Function2<? super C04HH, ? super ButtonAction, Boolean>) 12), 38));
                }
                if (!c04hh.isCodeOK() && ((bundleAddItemsToCartData = (BundleAddItemsToCartData) c04hh.data) == null || bundleAddItemsToCartData.exceptionUX == null)) {
                    C1019103yf.LIZ(EnumC1014603xw.ERR11, new RuntimeException("add cart bundle fail. code!=0 && exceptionUX == null"), null);
                    C04HG c04hg = this;
                    View view3 = view;
                    c04hg.getClass();
                    if (view3 != null) {
                        C786410Ut5.LJJZZIII((Handler) c04hg.LJFF.getValue(), new ARunnableS101S0100000_1(new AwS545S0100000_1(view3, 1533), 38));
                    }
                }
                return c04hh;
            }
        }).LJJIJIIJI(new AfS137S0200000_1(view, this, 9)).LJJIJIL(new C09JN() { // from class: X.00NS
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("CartRepository@3cbd.addToCartBundle$source$3");
                C1C7U.LIZIZ("CartRepository@3cbd.addToCartBundle$source$3");
            }
        })).LJLLLL().LJJJLZIJ(C1701940uOG.LIZIZ());
    }
}
