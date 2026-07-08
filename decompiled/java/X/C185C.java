package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.UserRightItem;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.UserRightView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.PinCardRefactorSettings;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.185C, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C185C {
    public final C0HAO LIZ;
    public final C212274185g LIZIZ;
    public C185J<?, ?> LIZJ;
    public C0HAI LIZLLL;
    public AnonymousClass1861 LJ;

    public final boolean LIZ() {
        return this.LIZJ.LJFF();
    }

    public final void LIZJ() {
        this.LIZJ.LJIIIZ(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.185g] */
    public C185C(final C18L9 c18l9) {
        C0HAO c0hao = new C0HAO(c18l9);
        this.LIZ = c0hao;
        this.LIZIZ = new C185D<C18L9>(c18l9) { // from class: X.185g
        };
        this.LIZJ = c0hao;
    }

    public final boolean LIZIZ(UserRightView userRightView, SellingView sellingView) {
        List list;
        List<UserRightItem> list2;
        int i;
        this.LIZJ = this.LIZ;
        if (sellingView == null || (list = sellingView.sellingItems) == null) {
            list = C13BV.INSTANCE;
        }
        if (userRightView != null) {
            list2 = userRightView.userRightItems;
        } else {
            list2 = null;
        }
        if (list2 != null && !list2.isEmpty()) {
            AnonymousClass1861 anonymousClass1861 = this.LJ;
            boolean z = false;
            if (anonymousClass1861 != null) {
                C212274185g c212274185g = this.LIZIZ;
                c212274185g.LJ = anonymousClass1861;
                if (anonymousClass1861.LJIIJ()) {
                    C18L9 c18l9 = (C18L9) c212274185g.LIZ;
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
                    c18l9.LLIZ = iLIZIZ;
                    c18l9.LLILZLL = iLIZIZ2;
                    C18L9 c18l92 = (C18L9) c212274185g.LIZ;
                    C384050F3z c384050F3z = new C384050F3z();
                    if (C0A0F.LIZ()) {
                        i = R.attr.a1j;
                    } else {
                        i = R.attr.fy;
                    }
                    c384050F3z.LIZIZ = Integer.valueOf(i);
                    c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                    c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(1));
                    c18l92.LIZ(c384050F3z.LIZ(c212274185g.LIZJ), 1);
                } else {
                    C18L9 c18l93 = (C18L9) c212274185g.LIZ;
                    c18l93.LLIZ = 0;
                    c18l93.LLILZLL = 0;
                    c18l93.LIZ(null, 0);
                    ((C18L9) c212274185g.LIZ).setChildHorizontalMargin(anonymousClass1861.LJII());
                }
            }
            C212274185g c212274185g2 = this.LIZIZ;
            c212274185g2.getClass();
            if (!PinCardRefactorSettings.LIZ().sellingPointEnable) {
                c212274185g2.LJIIIZ(false);
            } else {
                c212274185g2.LJI = true;
                ((LinkedHashMap) c212274185g2.LJFF).clear();
                c212274185g2.LIZLLL.clear();
                C786410Ut5.LJJJJI((ViewGroup) c212274185g2.LIZ);
                for (UserRightItem userRightItem : list2) {
                    String str = userRightItem.showText;
                    if (str != null) {
                        c212274185g2.LIZLLL.add(userRightItem);
                        ((ViewGroup) c212274185g2.LIZ).addView(C0HAH.LIZ(c212274185g2.LIZJ, str, c212274185g2.LJ, null), new ViewGroup.MarginLayoutParams(-2, c212274185g2.LJ.getItemHeight()));
                    }
                }
                if (((ViewGroup) c212274185g2.LIZ).getChildCount() > 0) {
                    z = true;
                }
                c212274185g2.LJIIIZ(z);
            }
        }
        if (LJFF()) {
            this.LIZJ = this.LIZIZ;
            return true;
        }
        C0HAI c0hai = this.LIZLLL;
        if (c0hai != null) {
            this.LIZ.LJIILIIL(c0hai);
        }
        this.LIZ.LJIIL(new C0HAQ(list));
        return this.LIZ.LJFF();
    }
}
