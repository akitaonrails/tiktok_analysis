package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0Gme, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425700Gme extends C214906198m {
    public final Context LL;
    public final C01GW LLILLJJLI;
    public List<? extends View> LLILLL;

    public C425700Gme(Context context) {
        super(context);
        this.LL = context;
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(609));
        setContentView(C786410Ut5.Sd(R.layout.anp, C786410Ut5.ne(context), null));
        setWidth(-1);
        setHeight(-1);
        setBackgroundDrawable(new BitmapDrawable());
        C786410Ut5.x3(getContentView().getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.07xk
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C786410Ut5.C3(this.LL.getContentView().getViewTreeObserver(), this);
                C425700Gme c425700Gme = this.LL;
                Region regionLJJIIJZLJL = c425700Gme.LJJIIJZLJL(c425700Gme.LLILLL);
                if (regionLJJIIJZLJL != null) {
                    ((C1954207l6) this.LL.LLILLJJLI.getValue()).LL = regionLJJIIJZLJL;
                }
            }
        });
    }

    public final Rect LJJIIJ(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int right = view.getRight() - view.getLeft();
        int bottom = view.getBottom() - view.getTop();
        int iLIZJ = C497820Jfg.LIZJ(this.LL);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2 - iLIZJ, right + i, (i2 + bottom) - iLIZJ);
    }

    public final Region LJJIIJZLJL(List<? extends View> list) {
        if (list != null && !list.isEmpty()) {
            Region region = new Region();
            View contentView = getContentView();
            if (contentView != null) {
                region.op(LJJIIJ(contentView), Region.Op.UNION);
            }
            Iterator<? extends View> it2 = list.iterator();
            while (it2.hasNext()) {
                region.op(LJJIIJ(it2.next()), Region.Op.DIFFERENCE);
            }
            return region;
        }
        return null;
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        C786410Ut5.LLZ((C1390130mHL) getContentView().findViewById(R.id.nnp), 0);
    }
}
