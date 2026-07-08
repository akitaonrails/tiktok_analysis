package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03uB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C991303uB {
    public static WeakReference<Activity> LIZIZ;
    public static long LIZJ;
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(296));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(297));

    public static void LIZIZ(C214820195e c214820195e, int i, SkuPanelBaseWidget skuPanelBaseWidget) {
        c214820195e.LIZJ(i, skuPanelBaseWidget, (C991403uC) LIZLLL.getValue());
    }

    public static void LIZJ(Activity activity, ProductPackStruct productPackStruct, Integer num) {
        Activity activity2;
        boolean z;
        int i;
        List<SaleProp> list;
        int iIntValue;
        String str;
        if (activity == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        WeakReference<Activity> weakReference = LIZIZ;
        if (weakReference != null) {
            activity2 = weakReference.get();
        } else {
            activity2 = null;
        }
        if (Intrinsics.LJFF(activity, activity2)) {
            if (jCurrentTimeMillis - LIZJ < 60000) {
                return;
            }
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("duration", Long.valueOf(jCurrentTimeMillis - LIZJ));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            pairArr[1] = new Pair("click_from", Integer.valueOf(iIntValue));
            if (productPackStruct == null || (str = productPackStruct.productId) == null) {
                str = "";
            }
            pairArr[2] = new Pair("product_id", str);
            C1018703yb.LJ("sku_preload_to_use_duration_timeout", C2097608Jq.LJIIIIZZ(pairArr));
        }
        LIZIZ = new WeakReference<>(activity);
        LIZJ = jCurrentTimeMillis;
        C940303lx c940303lx = (C940303lx) LIZ.getValue();
        if (productPackStruct != null && productPackStruct.LJII()) {
            z = true;
        } else {
            z = false;
        }
        C03XI[] c03xiArr = new C03XI[6];
        c03xiArr[0] = C03XH.LIZ(R.layout.az1, 1);
        c03xiArr[1] = C03XH.LIZ(R.layout.axu, 1);
        if (z) {
            i = R.layout.axt;
        } else {
            i = R.layout.az2;
        }
        c03xiArr[2] = C03XH.LIZ(i, 1);
        c03xiArr[3] = C03XH.LIZ(R.layout.axs, 1);
        c03xiArr[4] = C03XH.LIZ(R.layout.axq, 1);
        c03xiArr[5] = C03XH.LIZ(R.layout.ayy, 1);
        List<C03XI> listLJIILJJIL = C1697810uHb.LJIILJJIL(c03xiArr);
        if (!z) {
            listLJIILJJIL.add(C03XH.LIZ(R.layout.axp, 1));
        }
        if (productPackStruct != null && (list = productPackStruct.saleProps) != null) {
            for (SaleProp saleProp : list) {
                List<SalePropValue> list2 = saleProp.salePropValueList;
                if (list2 != null) {
                    int size = list2.size();
                    if (Intrinsics.LJFF(saleProp.hasImage, Boolean.TRUE)) {
                        if (!z) {
                            if (size > 10) {
                                size = 10;
                            }
                            listLJIILJJIL.add(C03XH.LIZ(R.layout.ayv, size));
                        }
                    } else if (Intrinsics.LJFF(saleProp.hasImage, Boolean.FALSE)) {
                        listLJIILJJIL.add(C03XH.LIZ(R.layout.azj, size));
                    }
                }
            }
        }
        c940303lx.LIZ(activity, listLJIILJJIL, null);
    }

    public static View LIZ(Context context, int i, ViewGroup viewGroup, boolean z) {
        Activity activity;
        if (LIZIZ != null) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            WeakReference<Activity> weakReference = LIZIZ;
            if (weakReference != null) {
                activity = weakReference.get();
            } else {
                activity = null;
            }
            if (Intrinsics.LJFF(activityLIZ, activity)) {
                LIZIZ = null;
            }
        }
        return ((C940303lx) LIZ.getValue()).inflate(context, i, viewGroup, z);
    }
}
