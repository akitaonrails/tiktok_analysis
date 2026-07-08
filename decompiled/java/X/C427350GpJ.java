package X;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.social.thought.view.SocialThoughtBaseBubbleBackgroundView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GpJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427350GpJ extends SocialThoughtBaseBubbleBackgroundView {
    public C427370GpL LLJILJILJ;
    public float LLJILLL;
    public View.OnClickListener LLJJ;

    private final boolean getHasLikeArea() {
        return this.LLJILLL > 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.social.thought.view.SocialThoughtBaseBubbleBackgroundView
    public final void LJII() {
        float density = getDensity();
        this.LLJILLL = 0.0f;
        C427370GpL c427370GpL = this.LLJILJILJ;
        if (c427370GpL == null || c427370GpL.getVisibility() == 8) {
            return;
        }
        c427370GpL.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(32.0f * density), 1073741824));
        this.LLJILLL = c427370GpL.getMeasuredWidth() / density;
    }

    @Override // com.ss.android.ugc.aweme.social.thought.view.SocialThoughtBaseBubbleBackgroundView
    public float getExtraInsetRight() {
        return getHasLikeArea() ? 8.0f : 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.social.thought.view.SocialThoughtBaseBubbleBackgroundView
    public float getExtraInsetTop() {
        return getHasLikeArea() ? 16.0f : 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.social.thought.view.SocialThoughtBaseBubbleBackgroundView
    public float getExtraOverflowTop() {
        return getHasLikeArea() ? 16.0f : 0.0f;
    }

    public C427350GpJ(Context context) {
        super(context, null, 0);
    }

    @Override // com.ss.android.ugc.aweme.social.thought.view.SocialThoughtBaseBubbleBackgroundView
    public final boolean LJFF(View view) {
        return Intrinsics.LJFF(view.getTag(), "thought_like_area");
    }

    public final void setOnLikeAreaClickListener(View.OnClickListener onClickListener) {
        boolean z;
        this.LLJJ = onClickListener;
        C427370GpL c427370GpL = this.LLJILJILJ;
        if (c427370GpL != null) {
            C786410Ut5.ib(c427370GpL, onClickListener);
            if (onClickListener != null) {
                z = true;
            } else {
                z = false;
            }
            c427370GpL.setClickable(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.social.thought.view.SocialThoughtBaseBubbleBackgroundView
    public final void LIZLLL(Path path, RectF rectF) {
        if (!getHasLikeArea()) {
            return;
        }
        float f = this.LLJILLL;
        float f2 = rectF.right + 8.0f;
        float f3 = rectF.top - 16.0f;
        RectF rectF2 = new RectF(f2 - f, f3, f2, 32.0f + f3);
        Path path2 = new Path();
        path2.addRoundRect(rectF2, 16.0f, 16.0f, Path.Direction.CW);
        path.op(path2, Path.Op.UNION);
    }

    @Override // com.ss.android.ugc.aweme.social.thought.view.SocialThoughtBaseBubbleBackgroundView
    public final void LJI(int i, int i2) {
        C427370GpL c427370GpL;
        if (getHasLikeArea() && (c427370GpL = this.LLJILJILJ) != null && c427370GpL.getVisibility() != 8) {
            float density = getDensity();
            float effectiveInsetTop = (getEffectiveInsetTop() * density) + getShadowOutsetTopPx() + (getExtraOverflowTop() * density);
            int iLIZIZ = C814420VxA.LIZIZ((((i2 - i) - (getBodyContentInsetRightDp() * density)) - getShadowOutsetRightPx()) + (8.0f * density));
            int iLIZIZ2 = C814420VxA.LIZIZ(effectiveInsetTop - (density * 16.0f));
            c427370GpL.layout(iLIZIZ - c427370GpL.getMeasuredWidth(), iLIZIZ2, iLIZIZ, c427370GpL.getMeasuredHeight() + iLIZIZ2);
        }
    }

    public final void LJIIIIZZ(int i, List list) {
        Path path;
        int i2 = 8;
        if (!list.isEmpty() && i > 0) {
            boolean z = true;
            int i3 = 0;
            if (this.LLJILJILJ == null) {
                setClipChildren(false);
                setClipToPadding(false);
                C427370GpL c427370GpL = new C427370GpL(getContext());
                c427370GpL.setTag("thought_like_area");
                int iLIZIZ = C814420VxA.LIZIZ(8 * getDensity());
                c427370GpL.setPadding(iLIZIZ, 0, iLIZIZ, 0);
                View.OnClickListener onClickListener = this.LLJJ;
                if (onClickListener != null) {
                    C786410Ut5.ib(c427370GpL, onClickListener);
                    c427370GpL.setClickable(true);
                }
                addView(c427370GpL, new FrameLayout.LayoutParams(-2, -2));
                this.LLJILJILJ = c427370GpL;
            }
            C427370GpL c427370GpL2 = this.LLJILJILJ;
            if (c427370GpL2 != null) {
                int visibility = c427370GpL2.getVisibility();
                c427370GpL2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c427370GpL2);
                int iMin = Math.min(list.size(), Math.min(3, i));
                if (i <= 3) {
                    z = false;
                }
                int i4 = 0;
                for (Object obj : (ArrayList) c427370GpL2.LLILZIL) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        C418930Gbj c418930Gbj = (C418930Gbj) obj;
                        if (i4 < iMin) {
                            int visibility2 = c418930Gbj.getVisibility();
                            c418930Gbj.setVisibility(0);
                            C1602160rnK.LIZIZ(visibility2, 0, c418930Gbj);
                            String str = (String) ListProtector.get(list, i4);
                            int measuredWidth = c418930Gbj.LLJJIII;
                            if (measuredWidth <= 0) {
                                measuredWidth = c418930Gbj.getMeasuredWidth();
                            }
                            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                            c1331670kl3LJIIIZ.LJIIIIZZ = measuredWidth;
                            c1331670kl3LJIIIZ.LJIIIZ = measuredWidth;
                            c1331670kl3LJIIIZ.LJJIIZI(c418930Gbj.LLJJIJI);
                            c1331670kl3LJIIIZ.LJJ(c418930Gbj);
                            C786410Ut5.h3(c1331670kl3LJIIIZ);
                        } else {
                            int visibility3 = c418930Gbj.getVisibility();
                            c418930Gbj.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility3, 8, c418930Gbj);
                        }
                        i4 = i5;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                FrameLayout frameLayout = c427370GpL2.LLILZLL;
                if (z) {
                    i2 = 0;
                }
                C786410Ut5.LJZ(i2, frameLayout);
                if (!z) {
                    iMin--;
                }
                for (Object obj2 : (ArrayList) c427370GpL2.LLILZIL) {
                    int i6 = i3 + 1;
                    if (i3 >= 0) {
                        C418930Gbj c418930Gbj2 = (C418930Gbj) obj2;
                        if (i3 < iMin) {
                            path = c427370GpL2.LL;
                        } else {
                            path = null;
                        }
                        c418930Gbj2.setBoundaryPath(path);
                        i3 = i6;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            requestLayout();
            invalidate();
            LIZ();
            return;
        }
        C427370GpL c427370GpL3 = this.LLJILJILJ;
        if (c427370GpL3 != null) {
            int visibility4 = c427370GpL3.getVisibility();
            c427370GpL3.setVisibility(8);
            C1602160rnK.LIZIZ(visibility4, 8, c427370GpL3);
        }
        this.LLJILLL = 0.0f;
        requestLayout();
        invalidate();
        LIZ();
    }
}
