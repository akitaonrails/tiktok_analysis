package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.tasm.LynxView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z8V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C1884370z8V extends C21578619ce {
    public C21578619ce LL;
    public int LLILLJJLI;
    public int LLILLL;
    public Function1<? super MotionEvent, Unit> LLILZ;
    public Function1<? super Boolean, Unit> LLILZIL;
    public View LLILZLL;
    public boolean LLIZ;

    public int LIZJ() {
        if (this.LLILLJJLI <= 0) {
            this.LLILLJJLI = (getChildAt(0).getMeasuredHeight() - getMeasuredHeight()) + getPaddingTop();
        }
        return this.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1354050lL9 LIZ(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                InterfaceC1354050lL9 interfaceC1354050lL9LIZ = LIZ(viewGroup.getChildAt(i));
                if (interfaceC1354050lL9LIZ != null) {
                    return interfaceC1354050lL9LIZ;
                }
            }
        }
        if (view instanceof InterfaceC1354050lL9) {
            return (InterfaceC1354050lL9) view;
        }
        return null;
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZIZ(View view) {
        if (view instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
            return (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ = LIZIZ(viewGroup.getChildAt(childCount));
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ != null) {
                    return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ;
                }
            }
            return null;
        }
        return null;
    }

    public final void LIZLLL(boolean z) {
        C21578619ce c21578619ce;
        View viewFindViewById;
        LynxView lynxView;
        if ((!this.LLIZ || z) && (c21578619ce = this.LL) != null && (viewFindViewById = c21578619ce.findViewById(R.id.ohv)) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ = LIZIZ(viewFindViewById);
            Object kitView = null;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ != null) {
                kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ.getKitView();
            }
            if ((kitView instanceof C1537710q7N) && (lynxView = (LynxView) kitView) != null) {
                View viewFindViewByName = lynxView.findViewByName("partnership_nested_scroll_view");
                this.LLILZLL = viewFindViewByName;
                if (viewFindViewByName != null) {
                    viewFindViewByName.setOverScrollMode(2);
                }
            }
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ == null) {
                this.LLILZLL = viewFindViewById.findViewWithTag(Integer.valueOf(R.id.yv8));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("childScrollView =");
            sbLIZ.append(this.LLILZLL);
            C20441214yg.LIZIZ("GameShortCusScrollView", C2188811AlT.LIZIZ(sbLIZ));
            this.LLIZ = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 3
            java.lang.Integer[] r4 = new java.lang.Integer[r0]
            r3 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r4[r3] = r0
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r4[r1] = r0
            r2 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r4[r2] = r0
            java.util.List r1 = X.C1697810uHb.LJIIJJI(r4)
            r0 = 0
            if (r6 == 0) goto L27
            int r0 = r6.getAction()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L27:
            boolean r0 = X.C13LP.LJJJJ(r0, r1)
            if (r0 == 0) goto L4d
            if (r6 == 0) goto L5d
            kotlin.jvm.functions.Function1<? super android.view.MotionEvent, kotlin.Unit> r0 = r5.LLILZ
            if (r0 == 0) goto L36
            r0.invoke(r6)
        L36:
            int r0 = r6.getAction()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L5d
            int r0 = r1.intValue()
            if (r0 != 0) goto L50
            r5.LIZLLL(r3)
            r6.getY()
            goto L5d
        L4d:
            if (r6 == 0) goto L5d
            goto L36
        L50:
            int r0 = r1.intValue()
            if (r0 != r2) goto L5a
            r6.getY()
            goto L5d
        L5a:
            r1.intValue()
        L5d:
            boolean r3 = super.dispatchTouchEvent(r6)     // Catch: java.lang.IllegalArgumentException -> L62
            return r3
        L62:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1884370z8V.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setClickActionListener(Function1<? super MotionEvent, Unit> function1) {
        this.LLILZ = function1;
    }

    public final void setCurChildNestScrollView(C21578619ce c21578619ce) {
        this.LL = c21578619ce;
        this.LLIZ = false;
        this.LLILZLL = null;
    }

    public final void setScrolledTopListener(Function1<? super Boolean, Unit> function1) {
        this.LLILZIL = function1;
    }

    public C1884370z8V(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C21578619ce, android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewGroup viewGroup;
        if (z) {
            Object objLIZ = LIZ(this.LL);
            if (objLIZ == null) {
                objLIZ = this.LL;
            }
            if (objLIZ instanceof RecyclerView) {
                ((RecyclerView) objLIZ).fling((int) f, (int) f2);
                return true;
            }
            if (objLIZ instanceof C21578619ce) {
                ((C21578619ce) objLIZ).fling((int) f2);
                return true;
            }
            if (!(objLIZ instanceof ViewGroup) || (viewGroup = (ViewGroup) objLIZ) == null) {
                return true;
            }
            viewGroup.onNestedFling((View) objLIZ, f, f2, false);
            return true;
        }
        return super.dispatchNestedFling(f, f2, z);
    }

    @Override // X.C21578619ce, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        boolean z;
        Function1<? super Boolean, Unit> function1;
        super.onScrollChanged(i, i2, i3, i4);
        boolean z2 = true;
        if (this.LLILLL >= LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        if (i2 < LIZJ()) {
            z2 = false;
        }
        if (z2 != z && (function1 = this.LLILZIL) != null) {
            function1.invoke(Boolean.valueOf(z2));
        }
        this.LLILLL = i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScrollChanged scrollRange=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" maxScrollDistance =");
        sbLIZ.append(LIZJ());
        C20441214yg.LIZIZ("GameShortCusScrollView", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C21578619ce, X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        super.onNestedPreScroll(view, i, i2, iArr, i3);
        if (iArr[1] < i2 && this.LLILLL < LIZJ() && canScrollVertically(i2)) {
            iArr[1] = i2;
            scrollBy(0, i2);
        }
    }
}
