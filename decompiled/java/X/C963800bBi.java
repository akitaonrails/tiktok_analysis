package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS250S0000000_15;

/* JADX INFO: renamed from: X.0bBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963800bBi extends FrameLayout implements C0UUV {
    public final C0UUV LL;
    public Rect LLILLJJLI;

    @Override // X.C0UUV
    public final boolean LIZ() {
        return this.LL.LIZ();
    }

    public final C957020b0m getExternalLinkMicWindowView() {
        View next;
        Iterator<View> it2 = new C09RD(this).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next instanceof C957020b0m) {
                break;
            }
        }
        if (next instanceof C957020b0m) {
            return (C957020b0m) next;
        }
        return null;
    }

    public final Rect getOriginRect() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Rect rect = this.LLILLJJLI;
        if (rect != null) {
            return rect;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return null;
        }
        int i = marginLayoutParams.leftMargin;
        int i2 = marginLayoutParams.topMargin;
        return new Rect(i, i2, marginLayoutParams.width + i, marginLayoutParams.height + i2);
    }

    public final Rect getRenderViewFrame() {
        List listLJJII = C09RB.LJJII(C09RB.LJIIIZ(new C09RD(this), AFwS250S0000000_15.get$arr$(9)));
        if (!(!listLJJII.isEmpty())) {
            return null;
        }
        View view = (View) ListProtector.get(listLJJII, 0);
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public C963800bBi(C0UUV c0uuv, Context context) {
        super(context, null, 0);
        this.LL = c0uuv;
    }
}
