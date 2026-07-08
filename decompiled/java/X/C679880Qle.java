package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Qle, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679880Qle {
    public final Paint LIZ;
    public final Rect LIZIZ;
    public final C679910Qlh LIZJ;

    public C679880Qle() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.LIZ = paint;
        this.LIZIZ = new Rect();
        this.LIZJ = new C679910Qlh();
    }

    public static void LIZ(Rect rect, View view) {
        SearchMixFeed searchMixFeed;
        C679490Ql1 searchCardUiInfo;
        Object tag = view.getTag(R.id.u7x);
        if ((tag instanceof SearchMixFeed) && (searchMixFeed = (SearchMixFeed) tag) != null && (searchCardUiInfo = searchMixFeed.getSearchCardUiInfo()) != null) {
            C679920Qli c679920Qli = searchCardUiInfo.offsetsRect;
            if (c679920Qli != null) {
                rect.left = c679920Qli.left;
                rect.top = c679920Qli.top;
                rect.right = c679920Qli.right;
                rect.bottom = c679920Qli.bottom;
            }
            C679900Qlg c679900Qlg = searchCardUiInfo.bgInfo;
            if (c679900Qlg != null && c679900Qlg.bgMode == EnumC586020Mye.AREA_CARD) {
                Float f = c679900Qlg.radius;
                if (f == null && c679900Qlg.topLeftRadius == null && c679900Qlg.topRightRadius == null && c679900Qlg.bottomLeftRadius == null && c679900Qlg.bottomRightRadius == null) {
                    C21565319aV.LIZJ(view, Float.valueOf(0.0f), null, null, null, null);
                } else {
                    C21565319aV.LIZJ(view, f, c679900Qlg.topLeftRadius, c679900Qlg.topRightRadius, c679900Qlg.bottomLeftRadius, c679900Qlg.bottomRightRadius);
                }
                Integer num = c679900Qlg.bgColor;
                if (num != null) {
                    view.setBackgroundColor(num.intValue());
                }
            }
        }
    }

    public final void LIZIZ(Canvas canvas, RecyclerView recyclerView) {
        SearchMixFeed searchMixFeed;
        C679490Ql1 searchCardUiInfo;
        C679900Qlg c679900Qlg;
        int iSave;
        C21681919tJ c21681919tJ;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            Object tag = childAt.getTag(R.id.u7x);
            if ((tag instanceof SearchMixFeed) && (searchMixFeed = (SearchMixFeed) tag) != null && (searchCardUiInfo = searchMixFeed.getSearchCardUiInfo()) != null && (c679900Qlg = searchCardUiInfo.bgInfo) != null) {
                EnumC586020Mye enumC586020Mye = c679900Qlg.bgMode;
                if (enumC586020Mye == EnumC586020Mye.AREA_DECORATION) {
                    Paint paint = this.LIZ;
                    Integer num = c679900Qlg.bgColor;
                    if (num != null) {
                        paint.setColor(num.intValue());
                        this.LIZIZ.setEmpty();
                        recyclerView.getDecoratedBoundsWithMargins(childAt, this.LIZIZ);
                        C679910Qlh c679910Qlh = this.LIZJ;
                        c679910Qlh.LIZ.setEmpty();
                        c679910Qlh.LIZIZ = 0.0f;
                        C679890Qlf.LIZ(c679900Qlg.radius, c679900Qlg.topLeftRadius, c679900Qlg.topRightRadius, c679900Qlg.bottomLeftRadius, c679900Qlg.bottomRightRadius, this.LIZIZ, this.LIZJ);
                        Rect rect = this.LIZIZ;
                        iSave = canvas.save();
                        canvas.clipRect(rect);
                        try {
                            C679910Qlh c679910Qlh2 = this.LIZJ;
                            RectF rectF = c679910Qlh2.LIZ;
                            float f = c679910Qlh2.LIZIZ;
                            canvas.drawRoundRect(rectF, f, f, this.LIZ);
                            canvas.restoreToCount(iSave);
                        } finally {
                        }
                    } else {
                        continue;
                    }
                } else if (enumC586020Mye == EnumC586020Mye.AREA_DECORATION_WITH_PARENT_WIDTH) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (!(layoutParams instanceof C21681919tJ) || (c21681919tJ = (C21681919tJ) layoutParams) == null || c21681919tJ.LL <= 0) {
                        Paint paint2 = this.LIZ;
                        Integer num2 = c679900Qlg.bgColor;
                        if (num2 != null) {
                            paint2.setColor(num2.intValue());
                            this.LIZIZ.setEmpty();
                            recyclerView.getDecoratedBoundsWithMargins(childAt, this.LIZIZ);
                            this.LIZIZ.left = recyclerView.getLeft() + recyclerView.getPaddingLeft();
                            this.LIZIZ.right = recyclerView.getRight() - recyclerView.getPaddingRight();
                            C679910Qlh c679910Qlh3 = this.LIZJ;
                            c679910Qlh3.LIZ.setEmpty();
                            c679910Qlh3.LIZIZ = 0.0f;
                            C679890Qlf.LIZ(c679900Qlg.radius, c679900Qlg.topLeftRadius, c679900Qlg.topRightRadius, c679900Qlg.bottomLeftRadius, c679900Qlg.bottomRightRadius, this.LIZIZ, this.LIZJ);
                            Rect rect2 = this.LIZIZ;
                            iSave = canvas.save();
                            canvas.clipRect(rect2);
                            try {
                                C679910Qlh c679910Qlh4 = this.LIZJ;
                                RectF rectF2 = c679910Qlh4.LIZ;
                                float f2 = c679910Qlh4.LIZIZ;
                                canvas.drawRoundRect(rectF2, f2, f2, this.LIZ);
                                canvas.restoreToCount(iSave);
                            } finally {
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
