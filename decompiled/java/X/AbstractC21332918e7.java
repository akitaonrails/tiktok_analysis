package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.yoga.m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18e7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21332918e7 extends ViewGroup implements InterfaceC21332418e2 {
    public m LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public InterfaceC21333118e9 LLILZIL;
    public View LLILZLL;
    public boolean LLIZ;

    private final View[] getChildren() {
        ArrayList arrayList = new ArrayList();
        Iterator<View> it2 = new C09RD(this).iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return (View[]) arrayList.toArray(new View[0]);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C21333218eA();
    }

    @Override // X.InterfaceC21332418e2
    public InterfaceC21333118e9 getMynaDrawChild() {
        InterfaceC21333118e9 interfaceC21333118e9 = this.LLILZIL;
        if (interfaceC21333118e9 != null) {
            return interfaceC21333118e9;
        }
        C20038013ak c20038013ak = new C20038013ak(this);
        this.LLILZIL = c20038013ak;
        return c20038013ak;
    }

    @Override // android.view.ViewGroup
    public final boolean isChildrenDrawingOrderEnabled() {
        return super.isChildrenDrawingOrderEnabled();
    }

    public static boolean LIZLLL(ViewGroup viewGroup) {
        C1168270gVV.LIZ.getClass();
        if (C1168270gVV.LJI()) {
            if (!(!Intrinsics.LJFF(viewGroup.getTag(), Boolean.FALSE))) {
                return false;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if ((viewGroup.getChildAt(i) instanceof ViewGroup) && !(!Intrinsics.LJFF(r1.getTag(), Boolean.FALSE))) {
                    return false;
                }
            }
            return true;
        }
        return viewGroup.getClipChildren();
    }

    public final boolean LIZIZ(MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        View view;
        boolean zLIZJ;
        float rawX;
        float rawY;
        int childDrawingOrder;
        if (!onFilterTouchEventForSecurity(motionEvent)) {
            return false;
        }
        int action = motionEvent.getAction();
        int i = action & 255;
        if (i == 0) {
            this.LLILZLL = null;
            requestDisallowInterceptTouchEvent(false);
            onNestedScrollAccepted(null, null, 0);
        }
        if (i != 0 && this.LLILZLL == null) {
            zOnInterceptTouchEvent = true;
        } else if (!this.LLIZ) {
            zOnInterceptTouchEvent = onInterceptTouchEvent(motionEvent);
            motionEvent.setAction(action);
        } else {
            zOnInterceptTouchEvent = false;
        }
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getSource() == 8194) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (isMotionEventSplittingEnabled() && !z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z && !zOnInterceptTouchEvent && (i == 0 || ((z3 && i == 5) || i == 7))) {
            int actionIndex = motionEvent.getActionIndex();
            int childCount = getChildCount();
            if (childCount != 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    rawX = motionEvent.getRawX(actionIndex);
                    rawY = motionEvent.getRawY(actionIndex);
                } else {
                    rawX = motionEvent.getRawX();
                    rawY = motionEvent.getRawY();
                }
                boolean zIsChildrenDrawingOrderEnabled = super.isChildrenDrawingOrderEnabled();
                View[] children = getChildren();
                int i2 = childCount - 1;
                view = null;
                while (true) {
                    if (-1 < i2) {
                        if (zIsChildrenDrawingOrderEnabled) {
                            childDrawingOrder = getChildDrawingOrder(childCount, i2);
                            if (childDrawingOrder >= childCount) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("getChildDrawingOrder() returned invalid index ");
                                sbLIZ.append(childDrawingOrder);
                                sbLIZ.append(" (child count is ");
                                sbLIZ.append(childCount);
                                sbLIZ.append(')');
                                throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        } else {
                            childDrawingOrder = i2;
                        }
                        View view2 = children[childDrawingOrder];
                        if (LJ(rawX, rawY, view2)) {
                            if (LIZJ(motionEvent, view2, false)) {
                                this.LLILZLL = view2;
                                z4 = true;
                                view = view2;
                                break;
                            }
                            view = view2;
                        }
                        i2--;
                    } else {
                        z4 = false;
                        break;
                    }
                }
                if (view == null) {
                }
            } else {
                z4 = false;
                view = null;
            }
            View view3 = this.LLILZLL;
            if (view3 != null) {
                view = view3;
            }
        } else {
            z4 = false;
            view = null;
        }
        View view4 = this.LLILZLL;
        if (view4 == null) {
            zLIZJ = LIZJ(motionEvent, null, z);
        } else if ((z4 && Intrinsics.LJFF(view4, view)) || LIZJ(motionEvent, view4, zOnInterceptTouchEvent)) {
            zLIZJ = true;
        } else {
            zLIZJ = false;
        }
        if (z || i == 1 || i == 7) {
            this.LLILZLL = null;
            requestDisallowInterceptTouchEvent(false);
            onNestedScrollAccepted(null, null, 0);
        }
        return zLIZJ;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C21333218eA;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        InterfaceC21333118e9 interfaceC21333118e9 = this.LLILZIL;
        if (interfaceC21333118e9 != null && interfaceC21333118e9.LIZ(canvas)) {
            return;
        }
        C1337990kvF.LIZIZ(this, canvas, new AwS433S0200000_32(this, canvas, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!LIZLLL(this) && this.LLILZ && motionEvent != null) {
            try {
                return LIZIZ(motionEvent);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1325860kbg.LIZIZ(th, AFwS223S0000000_32.get$arr$(3), C2097608Jq.LJ());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C21333218eA(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        InterfaceC21333118e9 interfaceC21333118e9 = this.LLILZIL;
        if (interfaceC21333118e9 != null && view != null) {
            interfaceC21333118e9.removeView(view);
        }
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt;
        InterfaceC21333118e9 interfaceC21333118e9 = this.LLILZIL;
        if (interfaceC21333118e9 != null && (childAt = getChildAt(i)) != null) {
            interfaceC21333118e9.removeView(childAt);
        }
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        this.LLIZ = z;
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup
    public void setChildrenDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public final void setDrawChildProxy(InterfaceC21333118e9 interfaceC21333118e9) {
        this.LLILZIL = interfaceC21333118e9;
    }

    public AbstractC21332918e7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        super.addView(view, i);
        InterfaceC21333118e9 interfaceC21333118e9 = this.LLILZIL;
        if (interfaceC21333118e9 != null) {
            interfaceC21333118e9.LJ();
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        InterfaceC21333118e9 interfaceC21333118e9 = this.LLILZIL;
        if (interfaceC21333118e9 != null) {
            return interfaceC21333118e9.getChildDrawingOrder(i, i2);
        }
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        m mVar = this.LL;
        if (mVar != null && mVar.getOwner() == null) {
            C21333518eD.LIZLLL(mVar, i, i2, this.LLILLL);
            setMeasuredDimension(Math.round(mVar.getLayoutWidth()), Math.round(mVar.getLayoutHeight()));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public AbstractC21332918e7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean LIZJ(MotionEvent motionEvent, View view, boolean z) {
        boolean zDispatchTouchEvent;
        boolean zDispatchTouchEvent2;
        int action = motionEvent.getAction();
        if (!z && action != 3) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            if (view == null) {
                zDispatchTouchEvent2 = super.dispatchTouchEvent(motionEventObtain);
            } else {
                motionEventObtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
                zDispatchTouchEvent2 = view.dispatchTouchEvent(motionEventObtain);
            }
            motionEventObtain.recycle();
            return zDispatchTouchEvent2;
        }
        motionEvent.setAction(3);
        if (view != null) {
            zDispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
        } else {
            zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.setAction(action);
        return zDispatchTouchEvent;
    }

    public final boolean LJ(float f, float f2, View view) {
        if (!C1337990kvF.LIZ(view)) {
            return false;
        }
        if ((view instanceof ViewGroup) && !LIZLLL(this)) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt != null && C1337990kvF.LIZ(childAt)) {
                    if (childAt instanceof ViewGroup) {
                        if (C1337990kvF.LJII(f, f2, childAt)) {
                            return true;
                        }
                        if (!LIZLLL((ViewGroup) childAt) && LJ(f, f2, childAt)) {
                            return true;
                        }
                    } else if (C1337990kvF.LJII(f, f2, childAt)) {
                        return true;
                    }
                }
            }
        } else if (C1337990kvF.LJII(f, f2, view)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        m mVar = this.LL;
        if (mVar != null) {
            mVar.setPadding(EnumC1321440kUY.LEFT, i);
            mVar.setPadding(EnumC1321440kUY.TOP, i2);
            mVar.setPadding(EnumC1321440kUY.RIGHT, i3);
            mVar.setPadding(EnumC1321440kUY.BOTTOM, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EnumC21334518eN enumC21334518eN;
        m mVar = this.LL;
        if (mVar != null && mVar.getOwner() == null) {
            C21334418eM width = mVar.getWidth();
            if (!this.LLILLJJLI || width == null || (enumC21334518eN = width.LIZIZ) == EnumC21334518eN.AUTO || enumC21334518eN == EnumC21334518eN.UNDEFINED) {
                C21333518eD.LIZLLL(mVar, View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824), this.LLILLL);
            }
            C21333518eD.LIZ(mVar);
        }
    }
}
