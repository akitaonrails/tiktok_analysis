package X;

import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19Ow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21533219Ow extends ConstraintLayout {
    public final ArrayList<C21533419Oy> LL;
    public ValueAnimator LLILLJJLI;
    public float LLILLL;
    public InterfaceC21533519Oz LLILZ;
    public final C21533319Ox LLILZIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLILLJJLI;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    public static ArrayList e0(View view) {
        ViewGroup viewGroup;
        int childCount;
        if (view instanceof C19M8) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        if ((view instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) view).getChildCount()) >= 0) {
            int i = 0;
            while (true) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof C19M8) {
                    arrayList2.add(childAt);
                } else if (childAt instanceof ViewGroup) {
                    arrayList2.addAll(e0(childAt));
                }
                if (i == childCount) {
                    break;
                }
                i++;
            }
        }
        return arrayList2;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.LLILZIL.LJIIIIZZ) {
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ValueAnimator valueAnimator = this.LLILLJJLI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LLILZ.LIZIZ(this.LLILLL, canvas);
        }
    }

    public final void setSkeletonColor1(int i) {
        this.LLILZIL.LIZLLL = i;
    }

    public final void setSkeletonRender(InterfaceC21533519Oz interfaceC21533519Oz) {
        this.LLILZ = interfaceC21533519Oz;
        if (getWidth() > 0 && getHeight() > 0) {
            this.LLILZ.LIZ(this.LLILZIL, this.LL, getWidth(), getHeight());
        }
    }

    public final void setWhetherToDrawChildren(boolean z) {
        this.LLILZIL.LJIIIIZZ = z;
    }

    public C21533219Ow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (Intrinsics.LJFF(view, this)) {
            if (i == 0) {
                ValueAnimator valueAnimator = this.LLILLJJLI;
                if (valueAnimator != null) {
                    valueAnimator.start();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.LLILLJJLI;
            if (valueAnimator2 == null) {
                return;
            }
            valueAnimator2.end();
        }
    }

    public C21533219Ow(Context context, AttributeSet attributeSet, int i) {
        InterfaceC21533519Oz interfaceC21533519Oz;
        super(context, attributeSet, i);
        this.LL = new ArrayList<>();
        this.LLILZ = new InterfaceC21533519Oz() { // from class: X.19P2
            public final Paint LIZ;
            public final ArrayList<Pair<Integer, Path>> LIZIZ;

            {
                Paint paint = new Paint(1);
                paint.setStyle(Paint.Style.FILL);
                this.LIZ = paint;
                this.LIZIZ = new ArrayList<>();
            }

            @Override // X.InterfaceC21533519Oz
            public final void LIZIZ(float f, Canvas canvas) {
                for (Pair<Integer, Path> pair : this.LIZIZ) {
                    Paint paint = this.LIZ;
                    int iIntValue = pair.getFirst().intValue();
                    paint.setColor(Color.argb(C814420VxA.LIZIZ(Color.alpha(iIntValue) * Math.abs(f)), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
                    canvas.drawPath(pair.getSecond(), this.LIZ);
                }
            }

            @Override // X.InterfaceC21533519Oz
            public final void LIZ(C21533319Ox c21533319Ox, List<C21533419Oy> list, int i2, int i3) {
                this.LIZIZ.clear();
                for (C21533419Oy c21533419Oy : (ArrayList) list) {
                    RectF rectF = new RectF(c21533419Oy.LJIIIZ, c21533419Oy.LJIIJ, c21533419Oy.LJIIJJI, c21533419Oy.LJIIL);
                    Path path = new Path();
                    path.addRoundRect(rectF, c21533419Oy.LIZIZ, c21533419Oy.LIZJ, Path.Direction.CW);
                    this.LIZIZ.add(new Pair<>(Integer.valueOf(c21533419Oy.LIZLLL), path));
                }
            }
        };
        C21533319Ox c21533319Ox = new C21533319Ox();
        this.LLILZIL = c21533319Ox;
        setWillNotDraw(false);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.commerce_SkeletonViewGroup);
            c21533319Ox.LIZLLL = typedArrayObtainStyledAttributes.getColor(R$styleable.commerce_SkeletonViewGroup_commerce_skeleton_color1, -3355444);
            c21533319Ox.LJ = typedArrayObtainStyledAttributes.getColor(R$styleable.commerce_SkeletonViewGroup_commerce_skeleton_color2, -7829368);
            typedArrayObtainStyledAttributes.getColor(R$styleable.commerce_SkeletonViewGroup_commerce_skeleton_color3, -3355444);
            c21533319Ox.LJFF = typedArrayObtainStyledAttributes.getInt(R$styleable.commerce_SkeletonViewGroup_commerce_skeleton_animation_duration, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            c21533319Ox.LJI = typedArrayObtainStyledAttributes.getInt(R$styleable.commerce_SkeletonViewGroup_commerce_skeleton_animation_direction, 0);
            c21533319Ox.LJII = typedArrayObtainStyledAttributes.getInt(R$styleable.commerce_SkeletonViewGroup_commerce_skeleton_animation_type, 0);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.commerce_SkeletonViewGroup_commerce_skeleton_radius, 0);
            c21533319Ox.LIZ = dimensionPixelSize;
            c21533319Ox.LIZIZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.commerce_SkeletonViewGroup_commerce_skeleton_radius_x, dimensionPixelSize);
            c21533319Ox.LIZJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.commerce_SkeletonViewGroup_commerce_skeleton_radius_y, c21533319Ox.LIZ);
            c21533319Ox.LJIIIIZZ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.commerce_SkeletonViewGroup_commerce_skeleton_draw_children, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (c21533319Ox.LJII == 1) {
            interfaceC21533519Oz = new InterfaceC21533519Oz() { // from class: X.19P1
                public Canvas LIZJ;
                public Canvas LIZLLL;
                public Bitmap LJ;
                public Bitmap LJFF;
                public int LJII;
                public final Paint LIZ = new Paint(1);
                public final Paint LIZIZ = new Paint(1);
                public C21533319Ox LJI = new C21533319Ox();

                @Override // X.InterfaceC21533519Oz
                public final void LIZIZ(float f, Canvas canvas) {
                    Bitmap bitmap = this.LJFF;
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    }
                    float[] fArr = new float[4];
                    int i2 = this.LJI.LJI;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            float f2 = this.LJII;
                            float f3 = f2 * f;
                            fArr[0] = f3;
                            fArr[1] = 0.0f;
                            fArr[2] = f3 + f2;
                            fArr[3] = 0.0f;
                        }
                    } else {
                        float f4 = this.LJII;
                        float f5 = f4 * f;
                        fArr[0] = f5;
                        fArr[1] = 0.0f;
                        fArr[2] = f5 + f4;
                        fArr[3] = 0.0f;
                    }
                    Paint paint = this.LIZ;
                    float f6 = fArr[0];
                    float f7 = fArr[1];
                    float f8 = fArr[2];
                    float f9 = fArr[3];
                    C21533319Ox c21533319Ox2 = this.LJI;
                    int i3 = c21533319Ox2.LIZLLL;
                    paint.setShader(new LinearGradient(f6, f7, f8, f9, new int[]{i3, c21533319Ox2.LJ, i3}, new float[]{0.0f, 0.4f, 0.7f}, Shader.TileMode.CLAMP));
                    Bitmap bitmap2 = this.LJ;
                    if (bitmap2 != null) {
                        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.LIZ);
                    }
                }

                @Override // X.InterfaceC21533519Oz
                public final void LIZ(C21533319Ox c21533319Ox2, List<C21533419Oy> list, int i2, int i3) {
                    this.LJI = c21533319Ox2;
                    this.LJII = i2;
                    this.LIZIZ.setStyle(Paint.Style.FILL);
                    this.LIZ.setStyle(Paint.Style.FILL);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    this.LIZLLL = new Canvas(bitmapCreateBitmap);
                    this.LJFF = bitmapCreateBitmap;
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i2, i3, Bitmap.Config.ALPHA_8);
                    this.LIZJ = new Canvas(bitmapCreateBitmap2);
                    this.LJ = bitmapCreateBitmap2;
                    for (C21533419Oy c21533419Oy : (ArrayList) list) {
                        RectF rectF = new RectF(c21533419Oy.LJIIIZ, c21533419Oy.LJIIJ, c21533419Oy.LJIIJJI, c21533419Oy.LJIIL);
                        this.LIZIZ.setColor(c21533419Oy.LIZLLL);
                        Canvas canvas = this.LIZLLL;
                        if (canvas != null) {
                            canvas.drawRoundRect(rectF, c21533419Oy.LIZIZ, c21533419Oy.LIZJ, this.LIZIZ);
                        }
                        Canvas canvas2 = this.LIZJ;
                        if (canvas2 != null) {
                            canvas2.drawRoundRect(rectF, c21533419Oy.LIZIZ, c21533419Oy.LIZJ, this.LIZIZ);
                        }
                    }
                }
            };
        } else {
            interfaceC21533519Oz = new InterfaceC21533519Oz() { // from class: X.19P2
                public final Paint LIZ;
                public final ArrayList<Pair<Integer, Path>> LIZIZ;

                {
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.FILL);
                    this.LIZ = paint;
                    this.LIZIZ = new ArrayList<>();
                }

                @Override // X.InterfaceC21533519Oz
                public final void LIZIZ(float f, Canvas canvas) {
                    for (Pair<Integer, Path> pair : this.LIZIZ) {
                        Paint paint = this.LIZ;
                        int iIntValue = pair.getFirst().intValue();
                        paint.setColor(Color.argb(C814420VxA.LIZIZ(Color.alpha(iIntValue) * Math.abs(f)), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
                        canvas.drawPath(pair.getSecond(), this.LIZ);
                    }
                }

                @Override // X.InterfaceC21533519Oz
                public final void LIZ(C21533319Ox c21533319Ox2, List<C21533419Oy> list, int i2, int i3) {
                    this.LIZIZ.clear();
                    for (C21533419Oy c21533419Oy : (ArrayList) list) {
                        RectF rectF = new RectF(c21533419Oy.LJIIIZ, c21533419Oy.LJIIJ, c21533419Oy.LJIIJJI, c21533419Oy.LJIIL);
                        Path path = new Path();
                        path.addRoundRect(rectF, c21533419Oy.LIZIZ, c21533419Oy.LIZJ, Path.Direction.CW);
                        this.LIZIZ.add(new Pair<>(Integer.valueOf(c21533419Oy.LIZLLL), path));
                    }
                }
            };
        }
        this.LLILZ = interfaceC21533519Oz;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getWidth() > 0 && getHeight() > 0) {
            this.LL.clear();
            for (C19M8 c19m8 : e0(this)) {
                C21533419Oy skeletonElement = c19m8.getSkeletonElement();
                C21533319Ox c21533319Ox = this.LLILZIL;
                if (skeletonElement.LIZLLL == -3355444) {
                    skeletonElement.LIZLLL = c21533319Ox.LIZLLL;
                }
                if (skeletonElement.LJ == -7829368) {
                    skeletonElement.LJ = c21533319Ox.LJ;
                }
                if (skeletonElement.LIZ == 0) {
                    skeletonElement.LIZ = c21533319Ox.LIZ;
                }
                if (skeletonElement.LIZIZ == 0) {
                    skeletonElement.LIZIZ = c21533319Ox.LIZIZ;
                }
                if (skeletonElement.LIZJ == 0) {
                    skeletonElement.LIZJ = c21533319Ox.LIZJ;
                }
                float left = c19m8.getLeft();
                float top = c19m8.getTop();
                Object parent = c19m8.getParent();
                if (parent instanceof View) {
                    View view = (View) parent;
                    while (view != null && !(view instanceof C21533219Ow)) {
                        left += view.getLeft();
                        top += view.getTop();
                        Object parent2 = view.getParent();
                        if (parent2 instanceof View) {
                            view = (View) parent2;
                        }
                    }
                }
                skeletonElement.LJIIIZ = left;
                skeletonElement.LJIIJ = top;
                skeletonElement.LJIIJJI = left + c19m8.getMeasuredWidth();
                skeletonElement.LJIIL = top + c19m8.getMeasuredHeight();
                this.LL.add(skeletonElement);
            }
            if (!this.LL.isEmpty()) {
                int i5 = this.LLILZIL.LJI;
                float f = 1.0f;
                float f2 = -1.0f;
                if (i5 != 0) {
                    if (i5 != 1) {
                        f = 0.0f;
                        f2 = 0.0f;
                    }
                } else {
                    f2 = 1.0f;
                    f = -1.0f;
                }
                ValueAnimator valueAnimator = this.LLILLJJLI;
                if (valueAnimator != null) {
                    valueAnimator.end();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
                valueAnimatorOfFloat.setDuration(this.LLILZIL.LJFF);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setRepeatMode(1);
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 68));
                valueAnimatorOfFloat.start();
                this.LLILLJJLI = valueAnimatorOfFloat;
            }
            this.LLILZ.LIZ(this.LLILZIL, this.LL, getWidth(), getHeight());
        }
    }
}
