package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IDF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDF extends C0DXR {
    public final int $t;
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
            case 4:
                LIZIZ$4(this, rect, view, recyclerView, c21673919s1);
                break;
            case 5:
                LIZIZ$5(this, rect, view, recyclerView, c21673919s1);
                break;
            case 6:
                LIZIZ$6(this, rect, view, recyclerView, c21673919s1);
                break;
            default:
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                break;
        }
    }

    @Override // X.C0DXR
    public final void LIZLLL(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (2 - this.$t != 0) {
            super.LIZLLL(canvas, recyclerView, c21673919s1);
        } else {
            LIZLLL$0(this, canvas, recyclerView, c21673919s1);
        }
    }

    public C0IDF(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZLLL$0(C0IDF c0idf, Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int iIntValue;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Paint paint = new Paint(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, ((ViewOnAttachStateChangeListenerC20604515jv) c0idf.l0).getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -7829368;
        }
        paint.setColor(iIntValue);
        paint.setStyle(Paint.Style.FILL);
        int childCount = recyclerView.getChildCount();
        for (int i = 1; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Integer numValueOf = null;
            if (layoutParams instanceof RecyclerView.LayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            int left = childAt.getLeft();
            if (marginLayoutParams != null) {
                numValueOf = Integer.valueOf(marginLayoutParams.leftMargin);
            }
            float fLIZJ = (left + C1175120ggY.LIZJ(numValueOf)) - C418440Gaw.LIZIZ(12);
            canvas.drawRect(fLIZJ, 0.0f, fLIZJ + C418440Gaw.LIZIZ(Double.valueOf(0.5d)), recyclerView.getMeasuredHeight(), paint);
        }
    }

    public static final void LIZIZ$0(C0IDF c0idf, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            rect.top = 52;
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || layoutManager.getItemCount() - 1 != childAdapterPosition) {
            return;
        }
        rect.bottom = ((((int) (C12ES.LJIIIIZZ((CreatorCaptionEditActivity) c0idf.l0) * 0.44f)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))) * 2) / 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ$1(X.C0IDF r6, android.graphics.Rect r7, android.view.View r8, androidx.recyclerview.widget.RecyclerView r9, X.C21673919s1 r10) {
        /*
            int r5 = r9.getChildAdapterPosition(r8)
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.poi.detail.dishes.PoiDetailRecommendDishesAssem r0 = (com.ss.android.ugc.aweme.poi.detail.dishes.PoiDetailRecommendDishesAssem) r0
            android.content.Context r0 = r0.getContext()
            r4 = 0
            if (r0 == 0) goto L3c
            boolean r1 = X.C426750GoL.LIZLLL(r0)
            r0 = 1
            if (r1 != r0) goto L3c
        L16:
            r3 = 16
            r2 = 12
            if (r0 == 0) goto L3e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r1 = X.C814420VxA.LIZIZ(r0)
            if (r5 != 0) goto L3a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
        L36:
            r7.set(r1, r4, r0, r4)
            return
        L3a:
            r0 = 0
            goto L36
        L3c:
            r0 = 0
            goto L16
        L3e:
            if (r5 != 0) goto L5c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r1 = X.C814420VxA.LIZIZ(r0)
        L4c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r7.set(r1, r4, r0, r4)
            return
        L5c:
            r1 = 0
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IDF.LIZIZ$1(X.0IDF, android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.19s1):void");
    }

    public static final void LIZIZ$2(C0IDF c0idf, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        float fLIZIZ;
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            fLIZIZ = C418440Gaw.LIZIZ(16);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(12);
        }
        rect.set(C814420VxA.LIZIZ(fLIZIZ), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ$3(X.C0IDF r4, android.graphics.Rect r5, android.view.View r6, androidx.recyclerview.widget.RecyclerView r7, X.C21673919s1 r8) {
        /*
            int r3 = r7.getChildAdapterPosition(r6)
            java.lang.Object r0 = r4.l0
            X.15jv r0 = (X.ViewOnAttachStateChangeListenerC20604515jv) r0
            android.content.Context r0 = r0.getContext()
            r2 = 0
            if (r0 == 0) goto L2e
            boolean r0 = X.C426750GoL.LIZLLL(r0)
            r1 = 1
            if (r0 != r1) goto L2e
        L16:
            r0 = 8
            if (r1 == 0) goto L30
            if (r3 == 0) goto L2c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
        L28:
            r5.set(r2, r2, r0, r2)
            return
        L2c:
            r0 = 0
            goto L28
        L2e:
            r1 = 0
            goto L16
        L30:
            if (r3 == 0) goto L42
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
        L3e:
            r5.set(r0, r2, r2, r2)
            return
        L42:
            r0 = 0
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IDF.LIZIZ$3(X.0IDF, android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.19s1):void");
    }

    public static final void LIZIZ$4(C0IDF c0idf, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int iLIZIZ;
        int i;
        int i2;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        if (childAdapterPosition == 0) {
            C1261170ivL.LIZ.getClass();
            if (C1261170ivL.LIZ()) {
                i2 = ((C460140I2q) c0idf.l0).LLILLL;
            } else {
                i2 = ((C460140I2q) c0idf.l0).LLILLJJLI;
            }
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        } else {
            iLIZIZ = 0;
        }
        if (childAdapterPosition == ((C460140I2q) c0idf.l0).LL.getItemCount() - 1) {
            C1261170ivL.LIZ.getClass();
            if (C1261170ivL.LIZ()) {
                i = ((C460140I2q) c0idf.l0).LLILLL;
            } else {
                i = ((C460140I2q) c0idf.l0).LLILLJJLI;
            }
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        }
        if (C426750GoL.LJ((C460140I2q) c0idf.l0)) {
            rect.left = iLIZIZ2;
            rect.right = iLIZIZ;
        } else {
            rect.left = iLIZIZ;
            rect.right = iLIZIZ2;
        }
    }

    public static final void LIZIZ$5(C0IDF c0idf, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && layoutManager.getItemCount() - 1 == childAdapterPosition) {
            rect.bottom = (((int) (C12ES.LJIIIIZZ(((NewCreatorCaptionEditFragment) c0idf.l0).requireContext()) * 0.6f)) * 2) / 3;
        }
    }

    public static final void LIZIZ$6(C0IDF c0idf, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        if (childAdapterPosition == 0) {
            C425240Glu c425240Glu = (C425240Glu) c0idf.l0;
            c425240Glu.getClass();
            if (c425240Glu.getLayoutDirection() == 1) {
                rect.right = ((C425240Glu) c0idf.l0).LLILLJJLI;
            } else {
                rect.left = ((C425240Glu) c0idf.l0).LLILLJJLI;
            }
        }
        if (childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1) {
            C425240Glu c425240Glu2 = (C425240Glu) c0idf.l0;
            c425240Glu2.getClass();
            if (c425240Glu2.getLayoutDirection() == 1) {
                rect.left = ((C425240Glu) c0idf.l0).LLILLL;
                return;
            } else {
                rect.right = ((C425240Glu) c0idf.l0).LLILLL;
                return;
            }
        }
        C425240Glu c425240Glu3 = (C425240Glu) c0idf.l0;
        c425240Glu3.getClass();
        if (c425240Glu3.getLayoutDirection() == 1) {
            rect.left = ((C425240Glu) c0idf.l0).LL;
        } else {
            rect.right = ((C425240Glu) c0idf.l0).LL;
        }
    }
}
