package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.14QP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14QP implements C14QU {
    public final C14QT LIZ;

    @Override // X.C14QU
    public final String LIZ() {
        return "linear-layout";
    }

    public C14QP(C14QT c14qt) {
        this.LIZ = c14qt;
    }

    public final void LIZJ(final int i, final LinearLayout linearLayout, final List list) {
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int marginStart;
        int marginEnd;
        int width = (linearLayout.getWidth() - linearLayout.getPaddingLeft()) - linearLayout.getPaddingRight();
        int height = (linearLayout.getHeight() - linearLayout.getPaddingTop()) - linearLayout.getPaddingBottom();
        if (width > 0 && height > 0) {
            int i4 = 0;
            if (i == 0) {
                Iterator it2 = list.iterator();
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    View view = (View) it2.next();
                    view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    int measuredWidth = view.getMeasuredWidth();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                    } else {
                        marginStart = 0;
                    }
                    int i7 = measuredWidth + marginStart;
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                    } else {
                        marginEnd = 0;
                    }
                    i5 += i7 + marginEnd;
                    if (i5 > width && i6 > 0) {
                        linearLayout.addView((View) ListProtector.get(list, 0));
                        i4 = 0 + 1;
                        break;
                    }
                    i6++;
                }
                while (i4 < i6) {
                    linearLayout.addView((View) ListProtector.get(list, i4));
                    i4++;
                }
                int size = list.size();
                while (i6 < size) {
                    C786410Ut5.LJLLLLLL(8, (View) ListProtector.get(list, i6));
                    linearLayout.addView((View) ListProtector.get(list, i6));
                    i6++;
                }
                return;
            }
            Iterator it3 = list.iterator();
            int i8 = 0;
            int i9 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                View view2 = (View) it3.next();
                view2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = view2.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    i2 = marginLayoutParams2.topMargin;
                } else {
                    i2 = 0;
                }
                int i10 = measuredHeight + i2;
                ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                    i3 = marginLayoutParams.bottomMargin;
                } else {
                    i3 = 0;
                }
                i8 += i10 + i3;
                if (i8 > height && i9 > 0) {
                    linearLayout.addView((View) ListProtector.get(list, 0));
                    i4 = 0 + 1;
                    break;
                }
                i9++;
            }
            while (i4 < i9) {
                linearLayout.addView((View) ListProtector.get(list, i4));
                i4++;
            }
            int size2 = list.size();
            while (i9 < size2) {
                C786410Ut5.LJLLLLLL(8, (View) ListProtector.get(list, i9));
                linearLayout.addView((View) ListProtector.get(list, i9));
                i9++;
            }
            return;
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            linearLayout.addView((View) it4.next());
        }
        C786410Ut5.x3(linearLayout.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0eOx
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C786410Ut5.C3(linearLayout.getViewTreeObserver(), this);
                C786410Ut5.LJJJJJL(linearLayout);
                this.LIZJ(i, linearLayout, list);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    @Override // X.C14QU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LIZIZ(android.content.Context r15, com.ss.android.ugc.aweme.model.ViewObject r16, com.ss.android.ugc.aweme.model.CommonLogParams r17, X.C01BK r18) {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14QP.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.model.ViewObject, com.ss.android.ugc.aweme.model.CommonLogParams, X.01BK):android.view.View");
    }
}
