package X;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gbn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418970Gbn extends C1091700eW0 {
    public Path LLILLL;
    public Path LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public Path LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public Paint LLJJJIL;
    public Paint LLJJJJ;
    public Paint LLJJJJJIL;
    public Paint LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public final RectF LLJL;
    public final RectF LLJLIL;
    public final RectF LLJLILLLLZIIL;
    public final RectF LLJLL;
    public final RectF LLJLLIL;
    public float LLJLLL;
    public float LLJZ;
    public float LLJZIJLIL;
    public float LLL;
    public final Rect LLLF;
    public final Rect LLLFF;
    public final Rect LLLFFI;
    public Rect LLLFZ;
    public int LLLI;
    public int LLLII;
    public Rect LLLIIII;
    public Rect LLLIIIIL;
    public final PointF LLLIIIL;
    public final PointF LLLIIL;

    public static /* synthetic */ void getArrowSize$annotations() {
    }

    public final float getAh() {
        return this.LLJZIJLIL;
    }

    public final PointF getArrowMiddlePointPosition() {
        return this.LLLIIL;
    }

    public final float getAx() {
        return this.LLJLLL;
    }

    public final float getAy() {
        return this.LLJZ;
    }

    public final float getCh() {
        return this.LLL;
    }

    public final RectF getContentPosition() {
        return this.LLJLLIL;
    }

    public final Rect getFinalInsets() {
        return this.LLLFFI;
    }

    public final Rect getMaxInsets() {
        return this.LLLFF;
    }

    public final Rect getMinInsets() {
        return this.LLLF;
    }

    public final Rect getWindowVisibleRect() {
        return this.LLLFZ;
    }

    public C418970Gbn(Context context) {
        int dimensionPixelSize;
        super(context);
        this.LLILZIL = -1.0f;
        this.LLILZLL = -1.0f;
        this.LLIZ = -1.0f;
        this.LLIZLLLIL = -1.0f;
        this.LLJJJ = 66;
        this.LLJL = new RectF();
        this.LLJLIL = new RectF();
        this.LLJLILLLLZIIL = new RectF();
        this.LLJLL = new RectF();
        this.LLJLLIL = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        this.LLLF = rect2;
        Rect rect3 = new Rect();
        this.LLLFF = rect3;
        this.LLLFFI = new Rect();
        this.LLLIIIL = new PointF();
        this.LLLIIL = new PointF();
        Paint paint = new Paint(1);
        this.LLJJJIL = paint;
        paint.setColor(C20736316Cj.LIZIZ(R.attr.exo, getContext()));
        Paint paint2 = new Paint(1);
        this.LLJJJJ = paint2;
        paint2.setColor(C20736316Cj.LIZIZ(R.attr.eyv, getContext()));
        Paint paint3 = new Paint(1);
        this.LLJJJJJIL = paint3;
        paint3.setColor(C20736316Cj.LIZIZ(R.attr.eyv, getContext()));
        setWillNotDraw(false);
        this.LLILLL = new Path();
        this.LLILZ = new Path();
        this.LLJ = new Path();
        this.LLJI = getContext().getResources().getDimensionPixelSize(R.dimen.an6);
        this.LLJJ = getContext().getResources().getDimensionPixelSize(R.dimen.an4);
        this.LLJJI = getContext().getResources().getDimensionPixelSize(R.dimen.an5);
        if (this.LLJJJ == 116) {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.amz);
        } else {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.an0);
        }
        this.LLJJIII = dimensionPixelSize;
        this.LLJJIJI = getContext().getResources().getDimensionPixelSize(R.dimen.an1);
        this.LLJJIJIIJIL = getContext().getResources().getDimensionPixelSize(R.dimen.an2);
        this.LLJJIJIL = getContext().getResources().getDimensionPixelSize(R.dimen.f616an3);
        getContext().getResources().getDimension(R.dimen.b06);
        getContext().getResources().getDimension(R.dimen.b08);
        this.LLJJL = getContext().getResources().getDimensionPixelSize(R.dimen.b0j);
        this.LLJJLIIIJLLLLLLLZ = getContext().getResources().getDimensionPixelSize(R.dimen.b0i);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.b0e);
        rect2.set(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        int i = this.LLJJLIIIJLLLLLLLZ;
        rect.left = i;
        int i2 = this.LLJJL;
        int i3 = i - i2;
        rect.top = i3;
        rect.right = i;
        int i4 = i2 + i;
        rect.bottom = i4;
        int i5 = rect2.left;
        rect3.left = i >= i5 ? i : i5;
        int i6 = rect2.top;
        rect3.top = i3 < i6 ? i6 : i3;
        int i7 = rect2.right;
        rect3.right = i >= i7 ? i : i7;
        int i8 = rect2.bottom;
        rect3.bottom = i4 < i8 ? i8 : i4;
        if (i > 0) {
            Paint paint4 = new Paint(1);
            paint4.setColor(C20736316Cj.LIZIZ(R.attr.cc_, getContext()));
            paint4.setMaskFilter(new BlurMaskFilter(this.LLJJLIIIJLLLLLLLZ, BlurMaskFilter.Blur.NORMAL));
            this.LLJJJJLIIL = paint4;
        }
        setLayerType(1, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            "TooltipOutlineLayout can host only one direct child".toString();
            throw new IllegalStateException("TooltipOutlineLayout can host only one direct child");
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Paint paint;
        if (this.LLJJJJLIIL != null) {
            canvas.save();
            Rect rect = this.LLLFFI;
            canvas.translate(rect.left, rect.top + this.LLJJL);
            Path path = this.LLILLL;
            if (path != null) {
                path.setFillType(Path.FillType.WINDING);
            }
            Path path2 = this.LLILLL;
            if (path2 == null || (paint = this.LLJJJJLIIL) == null) {
                return;
            }
            canvas.drawPath(path2, paint);
            canvas.restore();
        }
        super.draw(canvas);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        Rect rect = this.LLLFFI;
        canvas.translate(rect.left, rect.top);
        Path path = this.LLILLL;
        if (path != null) {
            path.setFillType(Path.FillType.WINDING);
            Paint paint = this.LLJJJIL;
            if (paint != null) {
                canvas.drawPath(path, paint);
                canvas.restore();
            }
        }
        canvas.save();
        Path path2 = this.LLILZ;
        if (path2 != null) {
            int[] iArr = {C20736316Cj.LIZIZ(R.attr.eyv, getContext()), C20736316Cj.LIZIZ(R.attr.ez3, getContext()), C20736316Cj.LIZIZ(R.attr.ez9, getContext()), C20736316Cj.LIZIZ(R.attr.ez_, getContext())};
            float[] fArr = {0.0f, 0.6f, 0.8f, 1.0f};
            Paint paint2 = this.LLJJJJ;
            if (paint2 != null) {
                paint2.setShader(new LinearGradient(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, iArr, fArr, Shader.TileMode.CLAMP));
            }
            Paint paint3 = this.LLJJJJ;
            if (paint3 != null) {
                canvas.drawPath(path2, paint3);
                canvas.restore();
            }
        }
        canvas.save();
        Path path3 = this.LLJ;
        if (path3 != null) {
            path3.setFillType(Path.FillType.WINDING);
            Paint paint4 = this.LLJJJJJIL;
            if (paint4 != null) {
                canvas.drawPath(path3, paint4);
                canvas.restore();
            }
        }
    }

    public final void setAh(float f) {
        this.LLJZIJLIL = f;
    }

    public final void setAnchorBounds(Rect rect) {
        this.LLLIIIIL = rect;
    }

    public final void setArrowSize(int i) {
        this.LLJJJ = i;
    }

    public final void setAx(float f) {
        this.LLJLLL = f;
    }

    public final void setAy(float f) {
        this.LLJZ = f;
    }

    public final void setBottomPadding(int i) {
        this.LLJILLL = i;
        requestLayout();
    }

    public final void setCh(float f) {
        this.LLL = f;
    }

    public final void setLeftPadding(int i) {
        this.LLJIJIL = i;
        requestLayout();
    }

    public final void setMaxWidth(int i) {
        this.LLLII = i;
        requestLayout();
    }

    public final void setMinWidth(int i) {
        this.LLLI = i;
        requestLayout();
    }

    public final void setRightPadding(int i) {
        this.LLJILJILJ = i;
        requestLayout();
    }

    public final void setSuggestedInsets(Rect rect) {
        this.LLLIIII = rect;
    }

    public final void setTopPadding(int i) {
        this.LLJILJIL = i;
        requestLayout();
    }

    public final void setWindowVisibleRect(Rect rect) {
        this.LLLFZ = rect;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            "TooltipOutlineLayout can host only one direct child".toString();
            throw new IllegalStateException("TooltipOutlineLayout can host only one direct child");
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i10 = this.LLJI * 2;
        int i11 = this.LLJILJIL + this.LLJILLL;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.LLJJIII;
        int i13 = i10 + i12;
        Rect rect = this.LLLIIII;
        if (rect != null) {
            if (rect.left == -1) {
                i3 = this.LLLF.left;
            } else {
                i3 = rect.left;
            }
        } else {
            i3 = -1;
        }
        int i14 = size - i3;
        if (rect != null) {
            if (rect.right == -1) {
                i4 = this.LLLF.right;
            } else {
                i4 = rect.right;
            }
        } else {
            i4 = -1;
        }
        int i15 = this.LLJIJIL + this.LLJILJILJ;
        int i16 = (i14 - i4) - i15;
        int i17 = this.LLLII - i15;
        if (i16 > i17) {
            i16 = i17;
        }
        if (i16 <= 0) {
            i16 = 0;
        }
        if (rect != null) {
            if (rect.top == -1) {
                i5 = this.LLLF.top;
            } else {
                i5 = rect.top;
            }
        } else {
            i5 = -1;
        }
        int i18 = size2 - i5;
        if (rect != null) {
            if (rect.bottom == -1) {
                rect = this.LLLF;
            }
            i6 = rect.bottom;
        } else {
            i6 = -1;
        }
        int i19 = ((i18 - i6) - i11) - i12;
        if (i19 <= 0) {
            i19 = 0;
        }
        View childAt = getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        childAt.measure(FrameLayout.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE), 0, layoutParams.width), FrameLayout.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(i19, Integer.MIN_VALUE), 0, layoutParams.height));
        if (layoutParams.width == -1 && childAt.getMeasuredWidth() < (i9 = this.LLLI - (this.LLJIJIL + this.LLJILJILJ))) {
            childAt.measure(FrameLayout.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), 0, layoutParams.width), FrameLayout.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(i19, Integer.MIN_VALUE), 0, layoutParams.height));
        }
        int measuredWidth = childAt.getMeasuredWidth() + this.LLJIJIL + this.LLJILJILJ;
        int i20 = this.LLLI;
        if (measuredWidth < i20) {
            measuredWidth = i20;
        }
        int measuredHeight = childAt.getMeasuredHeight() + this.LLJILJIL + this.LLJILLL + this.LLJJIII;
        if (i13 < measuredHeight) {
            i13 = measuredHeight;
        }
        PointF pointF = this.LLLIIIL;
        pointF.x = 0.0f;
        pointF.y = 0.0f;
        Rect rect2 = this.LLLIIII;
        Rect rect3 = this.LLLIIIIL;
        Rect rect4 = this.LLLFZ;
        if (rect2 != null && rect3 != null && rect4 != null) {
            if (rect2.left == -1 && rect2.right == -1) {
                int iWidth = rect3.left - ((measuredWidth - rect3.width()) / 2);
                int i21 = rect4.left;
                int i22 = iWidth - i21;
                Rect rect5 = this.LLLF;
                int i23 = i21 + rect5.left;
                if (i22 <= i23) {
                    i8 = i23 + measuredWidth;
                    iWidth = i23;
                } else {
                    i8 = iWidth + measuredWidth;
                    int i24 = rect4.right - rect5.right;
                    if (i8 >= i24) {
                        iWidth = i24 - measuredWidth;
                        i8 = i24;
                    }
                }
                PointF pointF2 = this.LLLIIIL;
                int i25 = this.LLJI;
                float f = this.LLJJ / 2.0f;
                pointF2.x = C419990GdR.LIZ((rect3.right + rect3.left) / 2.0f, (iWidth + i25) + f, (i8 - i25) - f) - ((i8 + iWidth) / 2.0f);
                Rect rect6 = this.LLLFFI;
                int i26 = iWidth - rect4.left;
                Rect rect7 = this.LLLFF;
                int i27 = rect7.left;
                if (i26 > i27) {
                    i26 = i27;
                }
                rect6.left = i26;
                int i28 = rect4.right - i8;
                int i29 = rect7.right;
                if (i28 > i29) {
                    i28 = i29;
                }
                rect6.right = i28;
                int i30 = rect2.top;
                if (i30 != -1) {
                    rect6.top = i30;
                    int i31 = rect3.bottom;
                    int i32 = this.LLLF.bottom;
                    int i33 = i31 + i13 + i32;
                    int i34 = rect4.bottom;
                    if (i33 > i34) {
                        rect6.bottom = i32;
                    } else {
                        int i35 = i34 - i31;
                        int iHeight = rect4.height() - this.LLLFFI.top;
                        if (i35 > iHeight) {
                            i35 = iHeight;
                        }
                        int i36 = i35 - i13;
                        int i37 = this.LLLFF.bottom;
                        if (i36 > i37) {
                            i36 = i37;
                        }
                        rect6.bottom = i36;
                    }
                } else {
                    rect6.bottom = rect2.bottom;
                    int i38 = rect3.top;
                    int i39 = this.LLLF.top;
                    int i40 = (i38 - i13) - i39;
                    int i41 = rect4.top;
                    if (i40 < i41) {
                        rect6.top = i39;
                    } else {
                        int i42 = i38 - i41;
                        int iHeight2 = rect4.height() - this.LLLFFI.bottom;
                        if (i42 > iHeight2) {
                            i42 = iHeight2;
                        }
                        int i43 = i42 - i13;
                        int i44 = this.LLLFF.top;
                        if (i43 > i44) {
                            i43 = i44;
                        }
                        rect6.top = i43;
                    }
                }
            } else {
                int iHeight3 = rect3.top - ((i13 - rect3.height()) / 2);
                int i45 = rect4.top;
                int i46 = iHeight3 - i45;
                Rect rect8 = this.LLLF;
                int i47 = i45 + rect8.top;
                if (i46 <= i47) {
                    i7 = i47 + i13;
                    iHeight3 = i47;
                } else {
                    i7 = iHeight3 + i13;
                    int i48 = rect4.bottom - rect8.bottom;
                    if (i7 >= i48) {
                        iHeight3 = i48 - i13;
                        i7 = i48;
                    }
                }
                PointF pointF3 = this.LLLIIIL;
                int i49 = this.LLJI;
                float f2 = this.LLJJ / 2.0f;
                pointF3.y = C419990GdR.LIZ((rect3.bottom + rect3.top) / 2.0f, (iHeight3 + i49) + f2, (i7 - i49) - f2) - ((i7 + iHeight3) / 2.0f);
                Rect rect9 = this.LLLFFI;
                int i50 = iHeight3 - rect4.top;
                Rect rect10 = this.LLLFF;
                int i51 = rect10.top;
                if (i50 > i51) {
                    i50 = i51;
                }
                rect9.top = i50;
                int i52 = rect4.bottom - i7;
                int i53 = rect10.bottom;
                if (i52 > i53) {
                    i52 = i53;
                }
                rect9.bottom = i52;
                int i54 = rect2.left;
                if (i54 != -1) {
                    rect9.left = i54;
                    int i55 = rect3.right;
                    int i56 = this.LLLF.right;
                    int i57 = i55 + measuredWidth + i56;
                    int i58 = rect4.right;
                    if (i57 > i58) {
                        rect9.right = i56;
                    } else {
                        int i59 = i58 - i55;
                        int iWidth2 = rect4.width() - this.LLLFFI.left;
                        if (i59 > iWidth2) {
                            i59 = iWidth2;
                        }
                        int i60 = i59 - measuredWidth;
                        int i61 = this.LLLFF.right;
                        if (i60 > i61) {
                            i60 = i61;
                        }
                        rect9.right = i60;
                    }
                } else {
                    rect9.right = rect2.right;
                    int i62 = rect3.left;
                    int i63 = this.LLLF.left;
                    int i64 = (i62 - measuredWidth) - i63;
                    int i65 = rect4.left;
                    if (i64 < i65) {
                        rect9.left = i63;
                    } else {
                        int i66 = i62 - i65;
                        int iWidth3 = rect4.width() - this.LLLFFI.right;
                        if (i66 > iWidth3) {
                            i66 = iWidth3;
                        }
                        int i67 = i66 - measuredWidth;
                        int i68 = this.LLLFF.left;
                        if (i67 > i68) {
                            i67 = i68;
                        }
                        rect9.left = i67;
                    }
                }
            }
        }
        Rect rect11 = this.LLLFFI;
        setMeasuredDimension(measuredWidth + rect11.left + rect11.right, i13 + rect11.top + rect11.bottom);
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Rect rect12 = this.LLLFFI;
        int i69 = (measuredWidth2 - rect12.left) - rect12.right;
        int i70 = (measuredHeight2 - rect12.top) - rect12.bottom;
        Path path = this.LLILLL;
        if (path != null) {
            path.reset();
        }
        Path path2 = this.LLILZ;
        if (path2 != null) {
            path2.reset();
        }
        Path path3 = this.LLJ;
        if (path3 != null) {
            path3.reset();
        }
        float f3 = this.LLJI;
        LIZ(0.0f, 0.0f, this.LLJL);
        float f4 = (i70 - this.LLJJIII) - this.LLJI;
        LIZ(0.0f, r6 - (r4 * 2), this.LLJLIL);
        int i71 = this.LLJI;
        float f5 = i69 - i71;
        float f6 = i70 - this.LLJJIII;
        int i72 = i71 * 2;
        LIZ(i69 - i72, r10 - i72, this.LLJLILLLLZIIL);
        float f7 = i69;
        float f8 = this.LLJI;
        LIZ(i69 - (r0 * 2), 0.0f, this.LLJLL);
        Path path4 = this.LLILLL;
        if (path4 != null) {
            path4.moveTo(f3, 0.0f);
        }
        Path path5 = this.LLILLL;
        if (path5 != null) {
            path5.arcTo(this.LLJL, 270.0f, -90.0f);
        }
        Path path6 = this.LLILLL;
        if (path6 != null) {
            path6.lineTo(0.0f, f4);
        }
        Path path7 = this.LLILLL;
        if (path7 != null) {
            path7.arcTo(this.LLJLIL, 270.0f - 90, -90.0f);
        }
        Path path8 = this.LLILLL;
        if (path8 != null) {
            path8.lineTo(f5, f6);
        }
        Path path9 = this.LLILLL;
        if (path9 != null) {
            path9.arcTo(this.LLJLILLLLZIIL, 270.0f - 180, -90.0f);
        }
        Path path10 = this.LLILLL;
        if (path10 != null) {
            path10.lineTo(f7, f8);
        }
        Path path11 = this.LLILLL;
        if (path11 != null) {
            path11.arcTo(this.LLJLL, 270.0f - 270, -90.0f);
        }
        Path path12 = this.LLILLL;
        if (path12 != null) {
            path12.lineTo(f3, 0.0f);
        }
        Path path13 = this.LLILLL;
        if (path13 != null) {
            path13.close();
        }
        int i73 = this.LLJJ;
        float f9 = this.LLLIIIL.x;
        Rect rect13 = this.LLLFFI;
        float f10 = rect13.top;
        float f11 = f6 + f10;
        float f12 = rect13.left;
        float f13 = ((i69 - i73) / 2.0f) + f9 + f12;
        float f14 = f10 + this.LLJJIII + f11;
        PointF pointF4 = this.LLLIIL;
        pointF4.x = f13;
        pointF4.y = f14;
        float f15 = ((i69 + i73) / 2.0f) + f9 + f12;
        float f16 = f13 - ((r3 - i73) / 2.0f);
        float f18 = this.LLJJI;
        float f19 = f14 - f18;
        float f20 = f18 + f16;
        Path path14 = this.LLILZ;
        if (path14 != null) {
            path14.moveTo(f13, f11);
        }
        Path path15 = this.LLILZ;
        if (path15 != null) {
            path15.lineTo(f13, f14);
        }
        Path path16 = this.LLILZ;
        if (path16 != null) {
            path16.lineTo(f15, f14);
        }
        Path path17 = this.LLILZ;
        if (path17 != null) {
            path17.lineTo(f15, f11);
        }
        Path path18 = this.LLILZ;
        if (path18 != null) {
            path18.lineTo(f13, f11);
        }
        Path path19 = this.LLILZ;
        if (path19 != null) {
            path19.close();
        }
        this.LLILZIL = f13;
        this.LLILZLL = f14;
        this.LLIZ = f13;
        this.LLIZLLLIL = ((f14 - this.LLJJIJI) - this.LLJJIJIIJIL) - this.LLJJIJIL;
        Rect rect14 = this.LLLIIIIL;
        if (rect14 != null) {
            float fWidth = rect14.left + (rect14.width() / 2.0f);
            this.LLJLLL = fWidth;
            float f21 = rect14.top;
            this.LLJZ = f21;
            float f22 = this.LLJJIII;
            this.LLJZIJLIL = f22;
            float f23 = i70;
            this.LLL = f23;
            RectF rectF = this.LLJLLIL;
            rectF.left = fWidth - (f13 - 0.0f);
            rectF.right = fWidth + (f7 - f13);
            float f24 = f21 - f22;
            rectF.top = f24 - f23;
            rectF.bottom = f24;
        }
        RectF rectF2 = new RectF(f16, f19, f20, f14);
        Path path20 = this.LLJ;
        if (path20 != null) {
            path20.moveTo(f13, f11);
        }
        Path path21 = this.LLJ;
        if (path21 != null) {
            path21.addArc(rectF2, 0.0f, 360.0f);
        }
        Path path22 = this.LLJ;
        if (path22 != null) {
            path22.close();
        }
        setPivotX(this.LLLIIL.x);
        setPivotY(this.LLLIIL.y);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            "TooltipOutlineLayout can host only one direct child".toString();
            throw new IllegalStateException("TooltipOutlineLayout can host only one direct child");
        }
    }

    public final void LIZ(float f, float f2, RectF rectF) {
        float f3 = this.LLJI * 2;
        rectF.set(f, f2, f3 + f, f3 + f2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            "TooltipOutlineLayout can host only one direct child".toString();
            throw new IllegalStateException("TooltipOutlineLayout can host only one direct child");
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect = this.LLLFFI;
        int i5 = rect.left + this.LLJIJIL;
        int i6 = rect.top + this.LLJILJIL;
        int i7 = ((i3 - rect.right) - this.LLJILJILJ) - i5;
        int i8 = (((i4 - rect.bottom) - this.LLJILLL) - this.LLJJIII) - i6;
        if (i7 > 0 && i8 > 0) {
            View childAt = getChildAt(0);
            int measuredWidth = childAt.getMeasuredWidth();
            if (measuredWidth >= i7) {
                i7 = measuredWidth;
            }
            int measuredWidth2 = i5 + ((i7 - childAt.getMeasuredWidth()) / 2);
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight >= i8) {
                i8 = measuredHeight;
            }
            int measuredHeight2 = i6 + ((i8 - childAt.getMeasuredHeight()) / 2);
            childAt.layout(measuredWidth2, measuredHeight2, childAt.getMeasuredWidth() + measuredWidth2, childAt.getMeasuredHeight() + measuredHeight2);
        }
    }
}
