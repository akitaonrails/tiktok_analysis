package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.14bp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20299514bp extends FrameLayout {
    public float LL;
    public float LLILLJJLI;
    public InterfaceC20299614bq LLILLL;
    public final C1317550kOH LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public InterfaceC20294814b4 LLIZLLLIL;
    public View LLJ;

    public C20299514bp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZIZ() {
        C21610619ho c21610619ho;
        this.LLILZIL = 0;
        this.LLILZLL = false;
        this.LLIZ = false;
        View view = this.LLJ;
        if (view != null && (view instanceof C21610619ho) && (c21610619ho = (C21610619ho) view) != null) {
            c21610619ho.setOnChildScrollUpCallback(this.LLIZLLLIL);
        }
        this.LLJ = null;
        this.LLIZLLLIL = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1317550kOH c1317550kOH = this.LLILZ;
        return c1317550kOH.LIZIZ | c1317550kOH.LIZ;
    }

    public static boolean LIZ(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof RecyclerView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && LIZ((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        InterfaceC20299614bq interfaceC20299614bq;
        super.onInterceptTouchEvent(motionEvent);
        InterfaceC20299614bq interfaceC20299614bq2 = this.LLILLL;
        if (interfaceC20299614bq2 != null && interfaceC20299614bq2.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        if (z && (interfaceC20299614bq = this.LLILLL) != null && interfaceC20299614bq.LIZLLL() && motionEvent.getPointerCount() == 2) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x = motionEvent.getX() - this.LL;
                    float y = motionEvent.getY() - this.LLILLJJLI;
                    if (Math.abs(y) > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) && Math.abs(y) > Math.abs(x)) {
                        if (y < 0.0f) {
                            InterfaceC20299614bq interfaceC20299614bq3 = this.LLILLL;
                            if (interfaceC20299614bq3 == null || !interfaceC20299614bq3.LIZLLL()) {
                                return false;
                            }
                            InterfaceC20299614bq interfaceC20299614bq4 = this.LLILLL;
                            if (interfaceC20299614bq4 != null) {
                                interfaceC20299614bq4.LIZ();
                            }
                            return true;
                        }
                        InterfaceC20299614bq interfaceC20299614bq5 = this.LLILLL;
                        if (interfaceC20299614bq5 == null || !interfaceC20299614bq5.LIZIZ()) {
                            return false;
                        }
                        InterfaceC20299614bq interfaceC20299614bq6 = this.LLILLL;
                        if (interfaceC20299614bq6 != null) {
                            interfaceC20299614bq6.LJ();
                        }
                        return true;
                    }
                }
            } else {
                InterfaceC20299614bq interfaceC20299614bq7 = this.LLILLL;
                if (interfaceC20299614bq7 != null && interfaceC20299614bq7.LIZLLL()) {
                    float x2 = motionEvent.getX() - this.LL;
                    float y2 = motionEvent.getY() - this.LLILLJJLI;
                    if (Math.abs(x2) < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) && Math.abs(y2) < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) {
                        InterfaceC20299614bq interfaceC20299614bq8 = this.LLILLL;
                        if (interfaceC20299614bq8 != null) {
                            interfaceC20299614bq8.LJFF();
                        }
                        return true;
                    }
                }
            }
        } else {
            this.LL = motionEvent.getX();
            this.LLILLJJLI = motionEvent.getY();
            System.currentTimeMillis();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.LLILZ.LIZIZ(0);
        LIZIZ();
    }

    public final void setListener(InterfaceC20299614bq interfaceC20299614bq) {
        this.LLILLL = interfaceC20299614bq;
    }

    public C20299514bp(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLILZ = new C1317550kOH();
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LLJJJ.getValue());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.LLILZ.LIZ(i, 0);
        LIZIZ();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        System.currentTimeMillis();
        boolean zLIZ = LIZ(this);
        System.currentTimeMillis();
        if (z && zLIZ) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3 = this.LLILZIL + i2;
        this.LLILZIL = i3;
        if (this.LLILZLL && Math.abs(i3) > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) && !this.LLIZ) {
            this.LLIZ = true;
            InterfaceC20299614bq interfaceC20299614bq = this.LLILLL;
            if (interfaceC20299614bq != null) {
                interfaceC20299614bq.LJ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNestedScroll(android.view.View r3, int r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            if (r5 >= 0) goto L2b
            if (r7 == 0) goto L2b
            boolean r0 = r2.LLILZLL
            if (r0 != 0) goto L2b
            X.14bq r0 = r2.LLILLL
            if (r0 == 0) goto L2f
            boolean r1 = r0.LIZIZ()
            r0 = 1
            if (r1 != r0) goto L2f
        L13:
            r2.LLILZLL = r0
            if (r0 == 0) goto L2b
            boolean r0 = r3 instanceof X.C21610619ho
            if (r0 == 0) goto L2b
            r2.LLJ = r3
            r1 = r3
            X.19ho r1 = (X.C21610619ho) r1
            X.14b4 r0 = r1.getOnChildScrollUpCallback()
            r2.LLIZLLLIL = r0
            X.14br r0 = new X.InterfaceC20294814b4() { // from class: X.14br
                static {
                    /*
                        X.14br r0 = new X.14br
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.14br) X.14br.LIZ X.14br
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C20299714br.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C20299714br.<init>():void");
                }

                @Override // X.InterfaceC20294814b4
                public final boolean LIZ() {
                    /*
                        r1 = this;
                        r0 = 1
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C20299714br.LIZ():boolean");
                }
            }
            r1.setOnChildScrollUpCallback(r0)
        L2b:
            super.onNestedScroll(r3, r4, r5, r6, r7)
            return
        L2f:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20299514bp.onNestedScroll(android.view.View, int, int, int, int):void");
    }
}
