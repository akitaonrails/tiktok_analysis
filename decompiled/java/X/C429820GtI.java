package X;

import Y.ACListenerS45S0400000_6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.WesternProduct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0GtI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429820GtI extends LinearLayout {
    public String LL;
    public String LLILLJJLI;

    public final String getPageName() {
        return this.LLILLJJLI;
    }

    public final String getSourceModule() {
        return this.LL;
    }

    public final void setPageName(String str) {
        this.LLILLJJLI = str;
    }

    public final void setSourceModule(String str) {
        this.LL = str;
    }

    public C429820GtI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public final void LIZ(List<WesternProduct> list, Aweme aweme, View.OnClickListener onClickListener) {
        SmartImageView smartImageView;
        List listLL = C13LP.LL(list, 2);
        int i = 0;
        for (Object obj : listLL) {
            int i2 = i + 1;
            if (i >= 0) {
                WesternProduct westernProduct = (WesternProduct) obj;
                View childAt = getChildAt(i);
                if (!(childAt instanceof SmartImageView) || (smartImageView = (SmartImageView) childAt) == null) {
                    smartImageView = new SmartImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)));
                    layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                    C786410Ut5.G6(smartImageView, layoutParams);
                    C1331750klB c1331750klB = new C1331750klB();
                    c1331750klB.LJ = C418440Gaw.LIZIZ(4);
                    smartImageView.setCircleOptions(new C1331730kl9(c1331750klB));
                    addView(smartImageView);
                }
                C786410Ut5.LLFF(0, smartImageView);
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                Object objLJJJJZI = C13LP.LJJJJZI(westernProduct.images);
                c1326790kdB.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(objLJJJJZI);
                c1331670kl3LIZLLL.LJJIJL(getContext());
                c1331670kl3LIZLLL.LIZLLL("ec_trending_product_image");
                smartImageView.LIZ(c1331670kl3LIZLLL.LIZJ());
                C786410Ut5.Q8(smartImageView, new ACListenerS45S0400000_6(onClickListener, westernProduct, aweme, this, 0));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (getChildCount() > listLL.size()) {
            int childCount = getChildCount();
            for (int size = listLL.size(); size < childCount; size++) {
                C786410Ut5.LJLLLLLL(8, getChildAt(size));
            }
        }
    }
}
