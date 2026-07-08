package X;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.m5;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13iM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20085213iM extends ViewGroup {
    public WeakReference<C13Z1> LL;
    public IBinder LLILLJJLI;
    public InterfaceC20036713aX LLILLL;
    public C13Z1 LLILZ;
    public Function0<Unit> LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;

    public AbstractC20085213iM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public abstract void LIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i);

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void LIZIZ() {
        if (this.LLIZ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot add views to ");
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append("; only Compose content is supported");
        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ() {
        if (this.LLILZ != null || isAttachedToWindow()) {
            LJ();
        } else {
            "createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString();
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void LIZLLL() {
        InterfaceC20036713aX interfaceC20036713aX = this.LLILLL;
        if (interfaceC20036713aX != null) {
            interfaceC20036713aX.dispose();
        }
        this.LLILLL = null;
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20085213iM.LJ():void");
    }

    public final C13Z1 LJIIIIZZ() {
        C13Z1 c13z1;
        C13Z1 c13z12;
        C13Z1 c13z13 = this.LLILZ;
        C13Z1 c13z14 = c13z13;
        if (c13z13 == null) {
            C13Z1 c13z1LIZJ = m5.LIZJ(this);
            if (c13z1LIZJ == null) {
                ViewParent parent = getParent();
                while (parent instanceof View) {
                    c13z1LIZJ = m5.LIZJ((View) parent);
                    parent = parent.getParent();
                    if (c13z1LIZJ != null) {
                        break;
                    }
                }
            }
            if (c13z1LIZJ != null) {
                boolean zLJII = LJII(c13z1LIZJ);
                c13z14 = c13z1LIZJ;
                if (zLJII) {
                    this.LL = new WeakReference<>(c13z1LIZJ);
                    c13z14 = c13z1LIZJ;
                }
            } else {
                WeakReference<C13Z1> weakReference = this.LL;
                if (weakReference != null && (c13z12 = weakReference.get()) != null && LJII(c13z12)) {
                    return c13z12;
                }
                if (!isAttachedToWindow()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Cannot locate windowRecomposer; View ");
                    sbLIZ.append(this);
                    sbLIZ.append(" is not attached to a window");
                    C1696250uF5.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
                Object parent2 = getParent();
                View view = this;
                while (parent2 instanceof View) {
                    View view2 = (View) parent2;
                    if (view2.getId() == 16908290) {
                        break;
                    }
                    view = view2;
                    parent2 = view2.getParent();
                }
                C13Z1 c13z1LIZJ2 = m5.LIZJ(view);
                if (c13z1LIZJ2 == null) {
                    C13Y1 c13y1LIZ = C19504511Sp.LIZ.get().LIZ(view);
                    view.setTag(R.id.b3h, c13y1LIZ);
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1620720sHG(C23250099c.LIZLLL(C817503Hh.LL, C2151808bs.LIZJ("windowRecomposer cleanup", view.getHandler()).LLILZ, null, new C1790860whg(c13y1LIZ, view, null), 2), 0));
                    c13z1 = c13y1LIZ;
                } else {
                    boolean z = c13z1LIZJ2 instanceof C13Y1;
                    c13z1 = c13z1LIZJ2;
                    if (!z) {
                        "root viewTreeParentCompositionContext is not a Recomposer".toString();
                        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                    }
                }
                boolean zLJII2 = LJII(c13z1);
                c13z14 = c13z1;
                c13z14 = c13z1;
                if (zLJII2 && c13z1 != null) {
                    this.LL = new WeakReference<>(c13z1);
                    return c13z1;
                }
            }
        }
        return c13z14;
    }

    public final boolean getHasComposition() {
        return this.LLILLL != null;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.LLIZLLLIL || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            LJ();
        }
    }

    public final boolean getShowLayoutBounds() {
        return this.LLILZLL;
    }

    public static boolean LJII(C13Z1 c13z1) {
        if ((c13z1 instanceof C13Y1) && ((C13Y3) ((C13Y1) c13z1).LJIJI.getValue()).compareTo(C13Y3.ShuttingDown) <= 0) {
            return false;
        }
        return true;
    }

    private final void setParentContext(C13Z1 c13z1) {
        if (this.LLILZ != c13z1) {
            this.LLILZ = c13z1;
            if (c13z1 != null) {
                this.LL = null;
            }
            InterfaceC20036713aX interfaceC20036713aX = this.LLILLL;
            if (interfaceC20036713aX != null) {
                interfaceC20036713aX.dispose();
                this.LLILLL = null;
                if (isAttachedToWindow()) {
                    LJ();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.LLILLJJLI != iBinder) {
            this.LLILLJJLI = iBinder;
            this.LL = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        LIZIZ();
        super.addView(view);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(C13Z1 c13z1) {
        setParentContext(c13z1);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.LLILZLL = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((InterfaceC20055013dU) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.LLIZLLLIL = true;
    }

    public final void setViewCompositionStrategy(InterfaceC20085513iP interfaceC20085513iP) {
        Function0<Unit> function0 = this.LLILZIL;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLILZIL = interfaceC20085513iP.LIZ(this);
    }

    public void LJI(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        LIZIZ();
        super.addView(view, i);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        LJ();
        LJI(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        LIZIZ();
        super.addView(view, layoutParams);
    }

    public AbstractC20085213iM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        InterfaceC20085513iP.LIZ.getClass();
        this.LLILZIL = C20087613ik.LIZIZ.LIZ(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        LIZIZ();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LIZIZ();
        return super.addViewInLayout(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LIZIZ();
        super.addView(view, i, layoutParams);
    }

    public /* synthetic */ AbstractC20085213iM(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        LIZIZ();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public void LJFF(int i, int i2, int i3, int i4, boolean z) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LJFF(i, i2, i3, i4, z);
    }
}
