package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.16G0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16G0 extends ViewGroup implements InterfaceC1318370kPb, InterfaceC1318440kPi {
    public static final String LLJJJ;
    public static final Class<?>[] LLJJJIL;
    public static final ThreadLocal<Map<String, Constructor<C16BC>>> LLJJJJ;
    public static final C14KA LLJJJJJIL;
    public static final C1085640eME LLJJJJLIIL;
    public final List<View> LL;
    public final C20136013qY<View> LLILLJJLI;
    public final List<View> LLILLL;
    public final List<View> LLILZ;
    public Paint LLILZIL;
    public final int[] LLILZLL;
    public final int[] LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final int[] LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public C16G3 LLJILJILJ;
    public boolean LLJILLL;
    public C20246014Ju LLJJ;
    public boolean LLJJI;
    public Drawable LLJJIII;
    public ViewGroup.OnHierarchyChangeListener LLJJIJI;
    public C20750316Ht LLJJIJIIJIL;
    public final C1317550kOH LLJJIJIL;

    public C16G0() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.14KA] */
    static {
        Package r0 = C16G0.class.getPackage();
        LLJJJ = r0 != null ? r0.getName() : null;
        LLJJJJJIL = new Comparator<View>() { // from class: X.14KA
            @Override // java.util.Comparator
            public final int compare(View view, View view2) {
                float fLJIIL = C14K9.LJIIL(view);
                float fLJIIL2 = C14K9.LJIIL(view2);
                if (fLJIIL > fLJIIL2) {
                    return -1;
                }
                if (fLJIIL < fLJIIL2) {
                    return 1;
                }
                return 0;
            }
        };
        LLJJJIL = new Class[]{Context.class, AttributeSet.class};
        LLJJJJ = new ThreadLocal<>();
        LLJJJJLIIL = new C1085640eME(12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect LIZIZ() {
        Rect rect = (Rect) LLJJJJLIIL.LIZIZ();
        return rect == null ? new Rect() : rect;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v16 android.view.View
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final void LJIILL() {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16G0.LJIILL():void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C16G1(-2, -2);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1317550kOH c1317550kOH = this.LLJJIJIL;
        return c1317550kOH.LIZIZ | c1317550kOH.LIZ;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        CoordinatorLayout$SavedState coordinatorLayout$SavedState = new CoordinatorLayout$SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C16BC c16bc = ((C16G1) childAt.getLayoutParams()).LIZ;
            if (id != -1 && c16bc != null && (parcelableOnSaveInstanceState = c16bc.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, parcelableOnSaveInstanceState);
            }
        }
        coordinatorLayout$SavedState.LL = sparseArray;
        return coordinatorLayout$SavedState;
    }

    public final void LJIJJ() {
        if (!getFitsSystemWindows()) {
            C14K9.LJIJJ(this, null);
            return;
        }
        if (this.LLJJIJIIJIL == null) {
            this.LLJJIJIIJIL = new C20750316Ht(this, 0);
        }
        C14K9.LJIJJ(this, this.LLJJIJIIJIL);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.LLJJIII;
        if (drawable == null || !drawable.isStateful() || (!false && !drawable.setState(drawableState))) {
            return;
        }
        invalidate();
    }

    public final List<View> getDependencySortedChildren() {
        LJIILL();
        return Collections.unmodifiableList(this.LL);
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LJIIZILJ(false);
        if (this.LLJILLL) {
            if (this.LLJILJILJ == null) {
                this.LLJILJILJ = new C16G3(this);
            }
            C786410Ut5.y3(getViewTreeObserver(), this.LLJILJILJ);
        }
        if (this.LLJJ == null && getFitsSystemWindows()) {
            C20097313kJ.LIZJ(this);
        }
        this.LLJ = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJIIZILJ(false);
        if (this.LLJILLL && this.LLJILJILJ != null) {
            C786410Ut5.D3(getViewTreeObserver(), this.LLJILJILJ);
        }
        View view = this.LLJILJIL;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.LLJ = false;
    }

    public final C20246014Ju getLastWindowInsets() {
        return this.LLJJ;
    }

    public Drawable getStatusBarBackground() {
        return this.LLJJIII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C16G1 LJIIIZ(View view) {
        C16G1 c16g1 = (C16G1) view.getLayoutParams();
        if (!c16g1.LIZIZ) {
            if (view instanceof C16G4) {
                c16g1.LIZIZ(((C16G4) view).getBehavior());
                c16g1.LIZIZ = true;
            } else {
                Class<?> superclass = view.getClass();
                while (true) {
                    if (superclass == null) {
                        break;
                    }
                    InterfaceC1319520kRS interfaceC1319520kRS = (InterfaceC1319520kRS) superclass.getAnnotation(InterfaceC1319520kRS.class);
                    if (interfaceC1319520kRS == null) {
                        superclass = superclass.getSuperclass();
                    } else {
                        try {
                            c16g1.LIZIZ(interfaceC1319520kRS.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            break;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                c16g1.LIZIZ = true;
                return c16g1;
            }
        }
        return c16g1;
    }

    public static void LJIILLIIL(Rect rect) {
        rect.setEmpty();
        LLJJJJLIIL.LIZ(rect);
    }

    public final void LIZLLL(View view) {
        ArrayList<View> arrayList = this.LLILLJJLI.LIZIZ.get(view);
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                View view2 = (View) ListProtector.get(arrayList, i);
                C16BC c16bc = ((C16G1) view2.getLayoutParams()).LIZ;
                if (c16bc != null) {
                    c16bc.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    public final List<View> LJFF(View view) {
        C20136013qY<View> c20136013qY = this.LLILLJJLI;
        int i = c20136013qY.LIZIZ.LLILLL;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList<View> arrayListLJIIIIZZ = c20136013qY.LIZIZ.LJIIIIZZ(i2);
            if (arrayListLJIIIIZZ != null && arrayListLJIIIIZZ.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c20136013qY.LIZIZ.LJFF(i2));
            }
        }
        ((ArrayList) this.LLILZ).clear();
        if (arrayList != null) {
            ((ArrayList) this.LLILZ).addAll(arrayList);
        }
        return this.LLILZ;
    }

    public final List<View> LJI(View view) {
        ArrayList<View> arrayList = this.LLILLJJLI.LIZIZ.get(view);
        ((ArrayList) this.LLILZ).clear();
        if (arrayList != null) {
            ((ArrayList) this.LLILZ).addAll(arrayList);
        }
        return this.LLILZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(int r26) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16G0.LJIIJJI(int):void");
    }

    public final void LJIIZILJ(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C16BC c16bc = ((C16G1) childAt.getLayoutParams()).LIZ;
            if (c16bc != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    c16bc.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    c16bc.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C16G1) getChildAt(i2).getLayoutParams()).LJIIL = false;
        }
        this.LLJIJIL = null;
        this.LLIZLLLIL = false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C16G1) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C16G1) {
            return new C16G1((C16G1) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C16G1((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C16G1(layoutParams);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C20246014Ju c20246014Ju;
        int iLJFF;
        super.onDraw(canvas);
        if (this.LLJJI && this.LLJJIII != null && (c20246014Ju = this.LLJJ) != null && (iLJFF = c20246014Ju.LJFF()) > 0) {
            this.LLJJIII.setBounds(0, 0, getWidth(), iLJFF);
            this.LLJJIII.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            LJIIZILJ(true);
        }
        boolean zLJIILJJIL = LJIILJJIL(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            LJIIZILJ(true);
        }
        return zLJIILJJIL;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof CoordinatorLayout$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CoordinatorLayout$SavedState coordinatorLayout$SavedState = (CoordinatorLayout$SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout$SavedState.mSuperState);
        SparseArray<Parcelable> sparseArray = coordinatorLayout$SavedState.LL;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C16BC c16bc = LJIIIZ(childAt).LIZ;
            if (id != -1 && c16bc != null && (parcelable2 = sparseArray.get(id)) != null) {
                c16bc.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[PHI: r4
      0x004b: PHI (r4v1 boolean) = (r4v4 boolean), (r4v5 boolean) binds: [B:7:0x001a, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r2 = r13.getActionMasked()
            android.view.View r0 = r12.LLJIJIL
            r3 = 1
            r11 = 0
            if (r0 != 0) goto L4d
            boolean r4 = r12.LJIILJJIL(r13, r3)
            if (r4 == 0) goto L4b
        L10:
            android.view.View r0 = r12.LLJIJIL
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.16G1 r0 = (X.C16G1) r0
            X.16BC r1 = r0.LIZ
            if (r1 == 0) goto L4b
            android.view.View r0 = r12.LLJIJIL
            boolean r1 = r1.onTouchEvent(r12, r0, r13)
        L22:
            android.view.View r0 = r12.LLJIJIL
            if (r0 != 0) goto L34
            boolean r0 = super.onTouchEvent(r13)
            r1 = r1 | r0
        L2b:
            if (r2 == r3) goto L30
            r0 = 3
            if (r2 != r0) goto L33
        L30:
            r12.LJIIZILJ(r11)
        L33:
            return r1
        L34:
            if (r4 == 0) goto L2b
            long r4 = android.os.SystemClock.uptimeMillis()
            r8 = 3
            r9 = 0
            r6 = r4
            r10 = r9
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            super.onTouchEvent(r0)
            if (r0 == 0) goto L2b
            r0.recycle()
            goto L2b
        L4b:
            r1 = 0
            goto L22
        L4d:
            r4 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16G0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.LLIZLLLIL) {
            LJIIZILJ(false);
            this.LLIZLLLIL = true;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        LJIJJ();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.LLJJIJI = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.LLJJIII;
        if (drawable2 != drawable) {
            Drawable drawableMutate = null;
            if (drawable2 != null) {
                this.LLJJIII.setCallback(null);
            }
            if (drawable != null) {
                drawableMutate = drawable.mutate();
            }
            this.LLJJIII = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.LLJJIII.setState(getDrawableState());
                }
                C16G6.LIZIZ(this.LLJJIII, getLayoutDirection());
                Drawable drawable3 = this.LLJJIII;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable3.setVisible(z, false);
                this.LLJJIII.setCallback(this);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawableLIZIZ;
        if (i != 0) {
            drawableLIZIZ = C800330VaR.LIZIZ(getContext(), i);
        } else {
            drawableLIZIZ = null;
        }
        setStatusBarBackground(drawableLIZIZ);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.LLJJIII;
        if (drawable != null && drawable.isVisible() != z) {
            this.LLJJIII.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.LLJJIII) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C16G1(getContext(), attributeSet);
    }

    public C16G0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.blg);
    }

    public static void LJIJ(int i, View view) {
        C16G1 c16g1 = (C16G1) view.getLayoutParams();
        int i2 = c16g1.LJIIIIZZ;
        if (i2 != i) {
            view.offsetLeftAndRight(i - i2);
            c16g1.LJIIIIZZ = i;
        }
    }

    public static void LJIJI(int i, View view) {
        C16G1 c16g1 = (C16G1) view.getLayoutParams();
        int i2 = c16g1.LJIIIZ;
        if (i2 != i) {
            view.offsetTopAndBottom(i - i2);
            c16g1.LJIIIZ = i;
        }
    }

    public final void LJII(Rect rect, View view) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal = C1292460jjo.LIZ;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        C1292460jjo.LIZ(this, view, matrix);
        ThreadLocal<RectF> threadLocal2 = C1292460jjo.LIZIZ;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final void LJIIL(int i, View view) {
        int i2;
        C16G1 c16g1 = (C16G1) view.getLayoutParams();
        View view2 = c16g1.LJIIJ;
        int i3 = 0;
        if (view2 == null) {
            if (c16g1.LJFF != -1) {
                throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            }
            int i4 = c16g1.LJ;
            if (i4 >= 0) {
                C16G1 c16g12 = (C16G1) view.getLayoutParams();
                int i5 = c16g12.LIZJ;
                if (i5 == 0) {
                    i5 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
                int i6 = absoluteGravity & 7;
                int i7 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (i == 1) {
                    i4 = width - i4;
                }
                int[] iArr = this.LLJI;
                if (iArr != null && i4 >= 0 && i4 < iArr.length) {
                    i2 = iArr[i4];
                } else {
                    i2 = 0;
                }
                int i8 = i2 - measuredWidth;
                if (i6 != 1) {
                    if (i6 == 5) {
                        i8 += measuredWidth;
                    }
                } else {
                    i8 += measuredWidth / 2;
                }
                if (i7 != 16) {
                    if (i7 == 80) {
                        i3 = measuredHeight;
                    }
                } else {
                    i3 = 0 + (measuredHeight / 2);
                }
                int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c16g12).leftMargin, Math.min(i8, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c16g12).rightMargin));
                int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c16g12).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c16g12).bottomMargin));
                view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
                return;
            }
            C16G1 c16g13 = (C16G1) view.getLayoutParams();
            Rect rectLIZIZ = LIZIZ();
            rectLIZIZ.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c16g13).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c16g13).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c16g13).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c16g13).bottomMargin);
            if (this.LLJJ != null && getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rectLIZIZ.left += this.LLJJ.LIZLLL();
                rectLIZIZ.top += this.LLJJ.LJFF();
                rectLIZIZ.right -= this.LLJJ.LJ();
                rectLIZIZ.bottom -= this.LLJJ.LIZJ();
            }
            Rect rectLIZIZ2 = LIZIZ();
            int i9 = c16g13.LIZJ;
            if ((i9 & 7) == 0) {
                i9 |= 8388611;
            }
            if ((i9 & 112) == 0) {
                i9 |= 48;
            }
            Gravity.apply(i9, view.getMeasuredWidth(), view.getMeasuredHeight(), rectLIZIZ, rectLIZIZ2, i);
            view.layout(rectLIZIZ2.left, rectLIZIZ2.top, rectLIZIZ2.right, rectLIZIZ2.bottom);
            rectLIZIZ.setEmpty();
            C1085640eME c1085640eME = LLJJJJLIIL;
            c1085640eME.LIZ(rectLIZIZ);
            rectLIZIZ2.setEmpty();
            c1085640eME.LIZ(rectLIZIZ2);
            return;
        }
        Rect rectLIZIZ3 = LIZIZ();
        Rect rectLIZIZ4 = LIZIZ();
        try {
            LJII(rectLIZIZ3, view2);
            C16G1 c16g14 = (C16G1) view.getLayoutParams();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            LJIIIIZZ(i, rectLIZIZ3, rectLIZIZ4, c16g14, measuredWidth2, measuredHeight2);
            LIZJ(c16g14, rectLIZIZ4, measuredWidth2, measuredHeight2);
            view.layout(rectLIZIZ4.left, rectLIZIZ4.top, rectLIZIZ4.right, rectLIZIZ4.bottom);
            rectLIZIZ3.setEmpty();
            C1085640eME c1085640eME2 = LLJJJJLIIL;
            c1085640eME2.LIZ(rectLIZIZ3);
            rectLIZIZ4.setEmpty();
            c1085640eME2.LIZ(rectLIZIZ4);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            rectLIZIZ3.setEmpty();
            C1085640eME c1085640eME3 = LLJJJJLIIL;
            c1085640eME3.LIZ(rectLIZIZ3);
            rectLIZIZ4.setEmpty();
            c1085640eME3.LIZ(rectLIZIZ4);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007f A[EDGE_INSN: B:55:0x007f->B:28:0x007f BREAK  A[LOOP:1: B:12:0x003d->B:23:0x0073], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILJJIL(android.view.MotionEvent r24, int r25) {
        /*
            r23 = this;
            r8 = r24
            int r14 = r8.getActionMasked()
            r9 = r23
            java.util.List<android.view.View> r7 = r9.LLILLL
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r7.clear()
            boolean r3 = r9.isChildrenDrawingOrderEnabled()
            int r2 = r9.getChildCount()
            int r1 = r2 + (-1)
        L19:
            if (r1 < 0) goto L2d
            if (r3 == 0) goto L2b
            int r0 = r9.getChildDrawingOrder(r2, r1)
        L21:
            android.view.View r0 = r9.getChildAt(r0)
            r7.add(r0)
            int r1 = r1 + (-1)
            goto L19
        L2b:
            r0 = r1
            goto L21
        L2d:
            X.14KA r0 = X.C16G0.LLJJJJJIL
            if (r0 == 0) goto L34
            java.util.Collections.sort(r7, r0)
        L34:
            int r6 = r7.size()
            r5 = 0
            r12 = 0
            r4 = 0
            r13 = 0
            r1 = 0
        L3d:
            if (r4 >= r6) goto L7f
            java.lang.Object r10 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r4)
            android.view.View r10 = (android.view.View) r10
            android.view.ViewGroup$LayoutParams r3 = r10.getLayoutParams()
            X.16G1 r3 = (X.C16G1) r3
            X.16BC r0 = r3.LIZ
            r2 = 1
            r11 = r25
            if (r13 != 0) goto L54
            if (r1 == 0) goto L85
        L54:
            if (r14 == 0) goto L83
            if (r0 == 0) goto L73
            if (r12 != 0) goto L6c
            long r15 = android.os.SystemClock.uptimeMillis()
            r19 = 3
            r20 = 0
            r17 = r15
            r21 = r20
            r22 = r5
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r15, r17, r19, r20, r21, r22)
        L6c:
            if (r11 == 0) goto L76
            if (r11 != r2) goto L73
            r0.onTouchEvent(r9, r10, r12)
        L73:
            int r4 = r4 + 1
            goto L3d
        L76:
            r0.onInterceptTouchEvent(r9, r10, r12)
            goto L73
        L7a:
            r2 = 0
            if (r0 == 0) goto La9
            if (r5 != 0) goto La9
        L7f:
            r7.clear()
            return r13
        L83:
            if (r13 != 0) goto L93
        L85:
            if (r0 == 0) goto L93
            if (r11 == 0) goto Lad
            if (r11 != r2) goto L93
            boolean r13 = r0.onTouchEvent(r9, r10, r8)
        L8f:
            if (r13 == 0) goto L93
            r9.LLJIJIL = r10
        L93:
            X.16BC r0 = r3.LIZ
            if (r0 != 0) goto L99
            r3.LJIIL = r5
        L99:
            boolean r1 = r3.LJIIL
            if (r1 != 0) goto L7f
            if (r0 == 0) goto Lab
            boolean r0 = r0.blocksInteractionBelow(r9, r10)
        La3:
            r3.LJIIL = r0
            if (r0 == 0) goto L7a
            if (r1 != 0) goto L7f
        La9:
            r1 = r2
            goto L73
        Lab:
            r0 = 0
            goto La3
        Lad:
            boolean r13 = r0.onInterceptTouchEvent(r9, r10, r8)
            goto L8f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16G0.LJIILJJIL(android.view.MotionEvent, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16G0.onMeasure(int, int):void");
    }

    public void onStopNestedScroll(View view, int i) {
        this.LLJJIJIL.LIZIZ(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C16G1 c16g1 = (C16G1) childAt.getLayoutParams();
            if (c16g1.LIZ(i)) {
                C16BC c16bc = c16g1.LIZ;
                if (c16bc != null) {
                    c16bc.onStopNestedScroll(this, childAt, view, i);
                }
                if (i != 0) {
                    if (i == 1) {
                        c16g1.LJIILJJIL = false;
                    }
                } else {
                    c16g1.LJIILIIL = false;
                }
                c16g1.LJIILL = false;
            }
        }
        this.LLJILJIL = null;
    }

    public C16G0(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.LL = new ArrayList();
        this.LLILLJJLI = new C20136013qY<>();
        this.LLILLL = new ArrayList();
        this.LLILZ = new ArrayList();
        this.LLILZLL = new int[2];
        this.LLIZ = new int[2];
        this.LLJJIJIL = new C1317550kOH();
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout, 0, R.style.a6q);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, R$styleable.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, 0, R.style.a6q);
            } else {
                saveAttributeDataForStyleable(context, R$styleable.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, i, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.LLJI = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.LLJI[i2] = (int) (r1[i2] * f);
            }
        }
        this.LLJJIII = typedArrayObtainStyledAttributes.getDrawable(R$styleable.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        LJIJJ();
        super.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: X.16G2
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewAdded(View view, View view2) {
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.LL.LLJJIJI;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewRemoved(View view, View view2) {
                this.LL.LJIIJJI(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.LL.LLJJIJI;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                }
            }
        });
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public final void LJ(View view, boolean z, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z) {
                LJII(rect, view);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public boolean LJIIJ(int i, int i2, View view) {
        Rect rectLIZIZ = LIZIZ();
        LJII(rectLIZIZ, view);
        try {
            boolean zContains = rectLIZIZ.contains(i, i2);
            LJIILLIIL(rectLIZIZ);
            return zContains;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIILLIIL(rectLIZIZ);
            throw th;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        C16G1 c16g1 = (C16G1) view.getLayoutParams();
        C16BC c16bc = c16g1.LIZ;
        if (c16bc != null) {
            float scrimOpacity = c16bc.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.LLILZIL == null) {
                    this.LLILZIL = new Paint();
                }
                this.LLILZIL.setColor(c16g1.LIZ.getScrimColor(this, view));
                Paint paint = this.LLILZIL;
                int iRound = Math.round(scrimOpacity * 255.0f);
                if (iRound < 0) {
                    iRound = 0;
                } else if (iRound > 255) {
                    iRound = 255;
                }
                paint.setAlpha(iRound);
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.LLILZIL);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        C16BC c16bc;
        int childCount = getChildCount();
        boolean zOnNestedPreFling = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C16G1 c16g1 = (C16G1) childAt.getLayoutParams();
                if (c16g1.LIZ(0) && (c16bc = c16g1.LIZ) != null) {
                    zOnNestedPreFling |= c16bc.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return zOnNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC1318530kPr
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C16BC c16bc = ((C16G1) view.getLayoutParams()).LIZ;
        if (c16bc != null && c16bc.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public final void LIZJ(C16G1 c16g1, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c16g1).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c16g1).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c16g1).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c16g1).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C16BC c16bc;
        int childCount = getChildCount();
        boolean zOnNestedFling = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C16G1 c16g1 = (C16G1) childAt.getLayoutParams();
                if (c16g1.LIZ(0) && (c16bc = c16g1.LIZ) != null) {
                    zOnNestedFling |= c16bc.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (zOnNestedFling) {
            LJIIJJI(1);
        }
        return zOnNestedFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        C16BC c16bc;
        this.LLJJIJIL.LIZ(i, i2);
        this.LLJILJIL = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C16G1 c16g1 = (C16G1) childAt.getLayoutParams();
            if (c16g1.LIZ(i2) && (c16bc = c16g1.LIZ) != null) {
                c16bc.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C16G1 c16g1 = (C16G1) childAt.getLayoutParams();
                C16BC c16bc = c16g1.LIZ;
                if (c16bc != null) {
                    boolean zOnStartNestedScroll = c16bc.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= zOnStartNestedScroll;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            c16g1.LJIILJJIL = zOnStartNestedScroll;
                        }
                    } else {
                        c16g1.LJIILIIL = zOnStartNestedScroll;
                    }
                } else if (i2 != 0) {
                    if (i2 == 1) {
                        c16g1.LJIILJJIL = false;
                    }
                } else {
                    c16g1.LJIILIIL = false;
                }
            }
        }
        return z;
    }

    public final void LJIILIIL(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C16BC c16bc;
        int layoutDirection = getLayoutDirection();
        int size = ((ArrayList) this.LL).size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) ListProtector.get(this.LL, i5);
            if (view.getVisibility() != 8 && ((c16bc = ((C16G1) view.getLayoutParams()).LIZ) == null || !c16bc.onLayoutChild(this, view, layoutDirection))) {
                LJIIL(layoutDirection, view);
            }
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        C16BC c16bc;
        int childCount = getChildCount();
        boolean z = false;
        int iMin = 0;
        int iMin2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C16G1 c16g1 = (C16G1) childAt.getLayoutParams();
                if (c16g1.LIZ(i3) && (c16bc = c16g1.LIZ) != null) {
                    int[] iArr2 = this.LLILZLL;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    c16bc.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.LLILZLL;
                    if (i > 0) {
                        iMin = Math.max(iMin, iArr3[0]);
                    } else {
                        iMin = Math.min(iMin, iArr3[0]);
                    }
                    int[] iArr4 = this.LLILZLL;
                    if (i2 > 0) {
                        iMin2 = Math.max(iMin2, iArr4[1]);
                    } else {
                        iMin2 = Math.min(iMin2, iArr4[1]);
                    }
                    z = true;
                }
            }
        }
        iArr[0] = iMin;
        iArr[1] = iMin2;
        if (z) {
            LJIIJJI(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    public static void LJIIIIZZ(int i, Rect rect, Rect rect2, C16G1 c16g1, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = c16g1.LIZJ;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c16g1.LIZLLL;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            if (i8 != 5) {
                iWidth = rect.left;
            } else {
                iWidth = rect.right;
            }
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            if (i9 != 80) {
                iHeight = rect.top;
            } else {
                iHeight = rect.bottom;
            }
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 != 1) {
            if (i6 != 5) {
                iWidth -= i2;
            }
        } else {
            iWidth -= i2 / 2;
        }
        if (i7 != 16) {
            if (i7 != 80) {
                iHeight -= i3;
            }
        } else {
            iHeight -= i3 / 2;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.LLIZ);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C16BC c16bc;
        int childCount = getChildCount();
        boolean z = false;
        int iMin = 0;
        int iMin2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C16G1 c16g1 = (C16G1) childAt.getLayoutParams();
                if (c16g1.LIZ(i5) && (c16bc = c16g1.LIZ) != null) {
                    int[] iArr2 = this.LLILZLL;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    c16bc.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.LLILZLL;
                    if (i3 > 0) {
                        iMin = Math.max(iMin, iArr3[0]);
                    } else {
                        iMin = Math.min(iMin, iArr3[0]);
                    }
                    if (i4 > 0) {
                        iMin2 = Math.max(iMin2, this.LLILZLL[1]);
                    } else {
                        iMin2 = Math.min(iMin2, this.LLILZLL[1]);
                    }
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMin;
        iArr[1] = iArr[1] + iMin2;
        if (z) {
            LJIIJJI(1);
        }
    }
}
