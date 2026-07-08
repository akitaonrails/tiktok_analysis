package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.AwS564S0100000_20;

/* JADX INFO: renamed from: X.0kZQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324460kZQ extends ViewOnAttachStateChangeListenerC20604515jv implements InterfaceC1318370kPb {
    public final C1317550kOH LLILZ;
    public RecyclerView LLILZIL;
    public final Queue<ViewGroup> LLILZLL;
    public final Rect LLIZ;

    @Override // X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    private final RecyclerView getNestedRc() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = this.LLILZIL;
        if (recyclerView2 != null && recyclerView2.isAttachedToWindow() && ((recyclerView = this.LLILZIL) == null || recyclerView.getGlobalVisibleRect(this.LLIZ))) {
            return this.LLILZIL;
        }
        ((LinkedList) this.LLILZLL).clear();
        ((LinkedList) this.LLILZLL).add(this);
        while (!this.LLILZLL.isEmpty()) {
            ViewGroup viewGroup = (ViewGroup) ((LinkedList) this.LLILZLL).poll();
            if (viewGroup != null) {
                for (View view : new C2500209qy(viewGroup, 2)) {
                    if ((view instanceof RecyclerView) && view.getGlobalVisibleRect(this.LLIZ)) {
                        RecyclerView recyclerView3 = (RecyclerView) view;
                        if (recyclerView3.isAttachedToWindow()) {
                            ((LinkedList) this.LLILZLL).clear();
                            return recyclerView3;
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ((LinkedList) this.LLILZLL).add(view);
                    }
                }
            }
        }
        ((LinkedList) this.LLILZLL).clear();
        return null;
    }

    public final boolean LJJI(int i) {
        Object obj = null;
        for (Object obj2 : new C2500209qy(this, 1)) {
            if (obj2 instanceof C1735790vGr) {
                obj = obj2;
            }
        }
        View view = (View) obj;
        if (view == null) {
            return true;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if (iArr[1] + view.getHeight() > iArr2[1] + getHeight() + i) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            this.LLILZIL = getNestedRc();
            ViewParent parent = getParent();
            while (true) {
                if (parent == null) {
                    break;
                }
                if (parent instanceof C481050Itj) {
                    C481050Itj c481050Itj = (C481050Itj) parent;
                    if (c481050Itj != null) {
                        c481050Itj.setGetInnerRecyclerview(new AwS564S0100000_20(this, 14));
                    }
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Boolean boolValueOf;
        if (this.LLILZIL == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInterceptTouchEvent: ");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(' ');
        sbLIZ.append(motionEvent.getRawX());
        sbLIZ.append(' ');
        sbLIZ.append(motionEvent.getRawY());
        sbLIZ.append(' ');
        Rect rect = this.LLIZ;
        if (rect != null) {
            boolValueOf = Boolean.valueOf(rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()));
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLIZ.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public C1324460kZQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        this.LLILZ.LIZIZ(i);
    }

    public C1324460kZQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = new C1317550kOH();
        this.LLILZLL = new LinkedList();
        this.LLIZ = new Rect();
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.LLILZ.LIZ(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, X.InterfaceC20097013kG
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchNestedPreScroll: ");
        sbLIZ.append(i2);
        sbLIZ.append(' ');
        sbLIZ.append(i3);
        sbLIZ.append(' ');
        Integer numValueOf2 = null;
        if (iArr2 != null) {
            numValueOf = Integer.valueOf(iArr2[0]);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(' ');
        if (iArr2 != null) {
            numValueOf2 = Integer.valueOf(iArr2[1]);
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(' ');
        sbLIZ.append(canScrollVertically(1));
        sbLIZ.append(' ');
        sbLIZ.append(LJJI(i2));
        C2188811AlT.LIZIZ(sbLIZ);
        RecyclerView recyclerView = this.LLILZIL;
        if (recyclerView == null) {
            return super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        }
        boolean z = !LJJI(i2);
        if (i2 > 0 && z && i3 == 1) {
            recyclerView.scrollBy(0, i2);
            if (iArr != null) {
                iArr[1] = i2;
            }
            return true;
        }
        return super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @Override // X.InterfaceC1318370kPb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNestedPreScroll(android.view.View r6, int r7, int r8, int[] r9, int r10) {
        /*
            r5 = this;
            r4 = -1
            boolean r3 = r5.canScrollVertically(r4)
            boolean r2 = r5.LJJI(r8)
            androidx.recyclerview.widget.RecyclerView r0 = r5.LLILZIL
            r1 = 0
            if (r0 == 0) goto L29
            boolean r0 = r0.canScrollVertically(r4)
        L12:
            if (r8 <= 0) goto L1d
            if (r2 == 0) goto L27
            r5.scrollBy(r1, r8)
        L19:
            r0 = 1
            r9[r0] = r8
            return
        L1d:
            if (r8 >= 0) goto L27
            if (r3 == 0) goto L27
            if (r0 != 0) goto L27
            r5.scrollBy(r1, r8)
            goto L19
        L27:
            r8 = 0
            goto L19
        L29:
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1324460kZQ.onNestedPreScroll(android.view.View, int, int, int[], int):void");
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i4 != 0) {
            scrollBy(0, i4);
        }
    }
}
