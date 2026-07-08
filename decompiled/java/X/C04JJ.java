package X;

import Y.ARunnableS70S0200000_1;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuHeaderReusedAssem;
import java.util.List;

/* JADX INFO: renamed from: X.04JJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JJ implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public C04JJ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(C04JJ c04jj, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int width;
        int width2;
        TuxTextView tuxTextView = ((SkuHeaderReusedAssem) c04jj.l0).LLL;
        if (tuxTextView != null) {
            tuxTextView.removeOnLayoutChangeListener(c04jj);
        }
        SkuHeaderReusedAssem skuHeaderReusedAssem = (SkuHeaderReusedAssem) c04jj.l0;
        TuxTextView tuxTextView2 = skuHeaderReusedAssem.LLL;
        if (tuxTextView2 != null) {
            int iLJ = skuHeaderReusedAssem.up().LJ();
            SkuHeaderReusedAssem skuHeaderReusedAssem2 = (SkuHeaderReusedAssem) c04jj.l0;
            LinearLayout linearLayout = skuHeaderReusedAssem2.LLJZIJLIL;
            int iLIZIZ = 0;
            if (linearLayout != null) {
                width = linearLayout.getWidth();
            } else {
                width = 0;
            }
            TuxTextView tuxTextView3 = skuHeaderReusedAssem2.LLLF;
            if (tuxTextView3 != null) {
                width2 = tuxTextView3.getWidth();
            } else {
                width2 = 0;
            }
            TuxIconView tuxIconView = skuHeaderReusedAssem2.LLLFF;
            if (tuxIconView != null && tuxIconView.getVisibility() == 0) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
            }
            tuxTextView2.setMaxWidth(Math.max(iLJ, ((width - width2) - iLIZIZ) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))));
        }
    }

    public static final void onLayoutChange$1(C04JJ c04jj, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        C420330Gdz specScrollBarFromXml = ((C04FA) c04jj.l0).getSpecScrollBarFromXml();
        if (((C04FA) c04jj.l0).getNeedScrollBar()) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        C786410Ut5.LJLLLLLL(i9, specScrollBarFromXml);
        C04FA c04fa = (C04FA) c04jj.l0;
        c04fa.i0(c04fa.getSpecListFromXml());
        if (((C04FA) c04jj.l0).getSpecScrollBarFromXml().getVisibility() == 0) {
            ((C04FA) c04jj.l0).getSpecListFromXml().removeOnLayoutChangeListener(c04jj);
        }
    }

    public static final void onLayoutChange$2(C04JJ c04jj, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c04jj);
        TextView headerTitleTextView = ((C958503ot) c04jj.l0).getHeaderTitleTextView();
        if (headerTitleTextView != null) {
            C1071804Hc.LIZIZ(headerTitleTextView);
            C1071804Hc.LIZ(headerTitleTextView);
            ((C958503ot) c04jj.l0).getClass();
            C958503ot.LIZJ(headerTitleTextView);
            if (headerTitleTextView.getLayout() == null && headerTitleTextView.getWidth() > 0) {
                ((C958503ot) c04jj.l0).getClass();
                C958503ot.LIZIZ(headerTitleTextView);
            }
            if (headerTitleTextView.getLayout() == null) {
                headerTitleTextView.requestLayout();
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(headerTitleTextView, new ARunnableS70S0200000_1(headerTitleTextView, (C958503ot) c04jj.l0, 24));
            }
        }
    }

    public static final void onLayoutChange$3(C04JJ c04jj, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C04HS) c04jj.l0).removeOnLayoutChangeListener(c04jj);
        C04HS c04hs = (C04HS) c04jj.l0;
        if (c04hs.LLJJ) {
            List<C042Y> list = c04hs.LL;
            List<C042Y> list2 = null;
            if (list != null && list.size() == 1) {
                List<C042Y> list3 = ((C04HS) c04jj.l0).LL;
                if (list3 != null) {
                    list2 = list3;
                }
                C042Y c042y = (C042Y) ListProtector.get(list2, 0);
                if (c042y != null) {
                    C04HS c04hs2 = (C04HS) c04jj.l0;
                    c04hs2.LLILLJJLI = c042y;
                    c04hs2.LIZIZ();
                    C04HS c04hs3 = (C04HS) c04jj.l0;
                    InterfaceC1072204Hg interfaceC1072204Hg = c04hs3.LLILZIL;
                    if (interfaceC1072204Hg != null) {
                        interfaceC1072204Hg.LIZ(c04hs3.LLILZ, c04hs3.LLILLJJLI);
                    }
                    ((C04HS) c04jj.l0).LIZLLL();
                }
            }
        }
    }
}
