package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssemV2;
import com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnBoardingGridAssem;
import com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingAssem;

/* JADX INFO: renamed from: X.0IDH, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDH extends C0DXR {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, rect, view, recyclerView, c21673919s1);
                break;
            case 1:
                LIZIZ$1(this, rect, view, recyclerView, c21673919s1);
                break;
            case 2:
                LIZIZ$2(this, rect, view, recyclerView, c21673919s1);
                break;
            case 3:
                LIZIZ$3(this, rect, view, recyclerView, c21673919s1);
                break;
            default:
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                break;
        }
    }

    @Override // X.C0DXR
    public final void LIZLLL(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        switch (this.$t) {
            case 4:
                LIZLLL$0(this, canvas, recyclerView, c21673919s1);
                break;
            case 5:
                LIZLLL$1(this, canvas, recyclerView, c21673919s1);
                break;
            default:
                super.LIZLLL(canvas, recyclerView, c21673919s1);
                break;
        }
    }

    public C0IDH(TakoOnboardingAssem takoOnboardingAssem, int i) {
        this.$t = i;
        this.l0 = takoOnboardingAssem;
        TakoOnBoardingGridAssem.LLJLIL.getClass();
        this.i1 = TakoOnBoardingGridAssem.LLJLLIL;
    }

    public C0IDH(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }

    public static final void LIZLLL$0(C0IDH c0idh, Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int i = c0idh.i1;
        canvas.drawLine(0.0f, i / 2, 200.0f, i / 2, (Paint) c0idh.l0);
    }

    public static final void LIZLLL$1(C0IDH c0idh, Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int i;
        int right;
        int childCount = recyclerView.getChildCount();
        int i2 = 0;
        if (C426750GoL.LIZLLL(((DialogC971200bNe) c0idh.l0).getContext())) {
            while (i2 < childCount) {
                View childAt = recyclerView.getChildAt(i2);
                if (((int) (childAt.getRight() + childAt.getTranslationX())) < c0idh.i1) {
                    right = (((int) (childAt.getRight() + childAt.getTranslationX())) * 255) / c0idh.i1;
                } else {
                    right = 255;
                }
                C786410Ut5.T4(childAt, right / 255.0f);
                i2++;
            }
            return;
        }
        while (i2 < childCount) {
            View childAt2 = recyclerView.getChildAt(i2);
            int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - ((int) (childAt2.getLeft() + childAt2.getTranslationX()));
            int i3 = c0idh.i1;
            if (width < i3) {
                i = (width * 255) / i3;
            } else {
                i = 255;
            }
            C786410Ut5.T4(childAt2, i / 255.0f);
            i2++;
        }
    }

    public static final void LIZIZ$0(C0IDH c0idh, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        boolean z;
        int iLIZIZ;
        int iLIZIZ2;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ3 = c21673919s1.LIZIZ();
        Context context = ((PoiDetailFoodHeaderAssem) c0idh.l0).getContext();
        if (context != null && C426750GoL.LIZLLL(context)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            if (childAdapterPosition == 0) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ2 = 0;
            }
            rect.set(iLIZIZ4, 0, iLIZIZ2, 0);
        } else {
            if (childAdapterPosition == 0) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ = 0;
            }
            rect.set(iLIZIZ, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0);
        }
        if (childAdapterPosition == iLIZIZ3 - 1) {
            Context context2 = ((PoiDetailFoodHeaderAssem) c0idh.l0).getContext();
            if (context2 != null && C426750GoL.LIZLLL(context2)) {
                rect.left = c0idh.i1;
            } else {
                rect.right = c0idh.i1;
            }
        }
    }

    public static final void LIZIZ$1(C0IDH c0idh, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        boolean z;
        int iLIZIZ;
        int iLIZIZ2;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ3 = c21673919s1.LIZIZ();
        Context context = ((PoiDetailTravelHeaderAssem) c0idh.l0).getContext();
        if (context != null && C426750GoL.LIZLLL(context)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            if (childAdapterPosition == 0) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ2 = 0;
            }
            rect.set(iLIZIZ4, 0, iLIZIZ2, 0);
        } else {
            if (childAdapterPosition == 0) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ = 0;
            }
            rect.set(iLIZIZ, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0);
        }
        if (childAdapterPosition == iLIZIZ3 - 1) {
            Context context2 = ((PoiDetailTravelHeaderAssem) c0idh.l0).getContext();
            if (context2 != null && C426750GoL.LIZLLL(context2)) {
                rect.left = c0idh.i1;
            } else {
                rect.right = c0idh.i1;
            }
        }
    }

    public static final void LIZIZ$2(C0IDH c0idh, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        boolean z;
        int iLIZIZ;
        int iLIZIZ2;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ3 = c21673919s1.LIZIZ();
        Context context = ((PoiDetailTravelHeaderAssemV2) c0idh.l0).getContext();
        if (context != null && C426750GoL.LIZLLL(context)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            if (childAdapterPosition == 0) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ2 = 0;
            }
            rect.set(iLIZIZ4, 0, iLIZIZ2, 0);
        } else {
            if (childAdapterPosition == 0) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ = 0;
            }
            rect.set(iLIZIZ, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0);
        }
        if (childAdapterPosition == iLIZIZ3 - 1) {
            Context context2 = ((PoiDetailTravelHeaderAssemV2) c0idh.l0).getContext();
            if (context2 != null && C426750GoL.LIZLLL(context2)) {
                rect.left = c0idh.i1;
            } else {
                rect.right = c0idh.i1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ$3(X.C0IDH r4, android.graphics.Rect r5, android.view.View r6, androidx.recyclerview.widget.RecyclerView r7, X.C21673919s1 r8) {
        /*
            int r3 = r7.getChildAdapterPosition(r6)
            int r2 = r3 % 2
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingAssem r0 = (com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingAssem) r0
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L3c
            boolean r1 = X.C426750GoL.LIZLLL(r0)
            r0 = 1
            if (r1 != r0) goto L3c
        L17:
            r1 = 2
            if (r0 != 0) goto L2e
            if (r2 != 0) goto L28
            int r0 = r4.i1
            int r0 = r0 / r1
            r5.right = r0
        L21:
            if (r3 < r1) goto L27
            int r0 = r4.i1
            r5.top = r0
        L27:
            return
        L28:
            int r0 = r4.i1
            int r0 = r0 / r1
            r5.left = r0
            goto L21
        L2e:
            if (r2 != 0) goto L36
            int r0 = r4.i1
            int r0 = r0 / r1
            r5.left = r0
            goto L21
        L36:
            int r0 = r4.i1
            int r0 = r0 / r1
            r5.right = r0
            goto L21
        L3c:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IDH.LIZIZ$3(X.0IDH, android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.19s1):void");
    }
}
