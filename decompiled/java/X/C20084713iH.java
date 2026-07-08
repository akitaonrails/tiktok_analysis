package X;

import Y.ARunnableS130S0100000_30;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS239S0300000_30;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import p2.j1;
import p2.x;
import u4.q0;

/* JADX INFO: renamed from: X.13iH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20084713iH extends ViewGroup implements InterfaceC1318440kPi, InterfaceC20035413aK, InterfaceC20029513Yn, C0TVI {
    public static final AFwS274S0000000_30 LLJJL = AFwS274S0000000_30.get$arr$(291);
    public final C20085913iT LL;
    public final View LLILLJJLI;
    public final InterfaceC20055013dU LLILLL;
    public Function0<Unit> LLILZ;
    public boolean LLILZIL;
    public Function0<Unit> LLILZLL;
    public Function0<Unit> LLIZ;
    public InterfaceC1685750ty9 LLIZLLLIL;
    public Function1<? super InterfaceC1685750ty9, Unit> LLJ;
    public InterfaceC1690500u5o LLJI;
    public Function1<? super InterfaceC1690500u5o, Unit> LLJIJIL;
    public LifecycleOwner LLJILJIL;
    public C128Y LLJILJILJ;
    public final int[] LLJILLL;
    public long LLJJ;
    public C20246014Ju LLJJI;
    public final AwS574S0100000_30 LLJJIII;
    public final AwS574S0100000_30 LLJJIJI;
    public Function1<? super Boolean, Unit> LLJJIJIIJIL;
    public final int[] LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public final C1317550kOH LLJJJJ;
    public boolean LLJJJJJIL;
    public final C20053713dH LLJJJJLIIL;

    @Override // X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // X.InterfaceC20035413aK
    public final void LJIIJ() {
        if (this.LLILLJJLI.getParent() != this) {
            addView(this.LLILLJJLI);
        } else {
            this.LLILZLL.invoke();
        }
    }

    @Override // X.InterfaceC20035413aK
    public final void LJIIJJI() {
        this.LLILZLL.invoke();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViewsInLayout();
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.LLILLJJLI.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1317550kOH c1317550kOH = this.LLJJJJ;
        return c1317550kOH.LIZIZ | c1317550kOH.LIZ;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LLILLJJLI.isNestedScrollingEnabled();
    }

    @Override // X.InterfaceC20035413aK
    public final void onRelease() {
        this.LLIZ.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C20054113dL getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            C1696250uF5.LIZIZ("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.LLILLL.getSnapshotObserver();
    }

    @Override // X.InterfaceC20029513Yn
    public final boolean LJJLIIIJILLIZJL() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJJIII.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().LIZ.LIZJ(this);
    }

    public final InterfaceC1690500u5o getDensity() {
        return this.LLJI;
    }

    public final View getInteropView() {
        return this.LLILLJJLI;
    }

    public final C20053713dH getLayoutNode() {
        return this.LLJJJJLIIL;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.LLJILJIL;
    }

    public final InterfaceC1685750ty9 getModifier() {
        return this.LLIZLLLIL;
    }

    public final Function1<InterfaceC1690500u5o, Unit> getOnDensityChanged$ui_release() {
        return this.LLJIJIL;
    }

    public final Function1<InterfaceC1685750ty9, Unit> getOnModifierChanged$ui_release() {
        return this.LLJ;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.LLJJIJIIJIL;
    }

    public final Function0<Unit> getRelease() {
        return this.LLIZ;
    }

    public final Function0<Unit> getReset() {
        return this.LLILZLL;
    }

    public final C128Y getSavedStateRegistryOwner() {
        return this.LLJILJILJ;
    }

    public final Function0<Unit> getUpdate() {
        return this.LLILZ;
    }

    public final View getView() {
        return this.LLILLJJLI;
    }

    public final C20246014Ju LIZLLL(C20246014Ju c20246014Ju) {
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(-1);
        C20244914Jj c20244914Jj = C20244914Jj.LJ;
        if (c20244914JjLIZ.equals(c20244914Jj) && c20246014Ju.LIZIZ(-9).equals(c20244914Jj) && c20246014Ju.LIZ.LJFF() == null) {
            return c20246014Ju;
        }
        x xVar = this.LLJJJJLIIL.LLJLLIL.LIZIZ;
        if (xVar.LIZLLL()) {
            long jLIZJ = C1680450tpb.LIZJ(C1692940u9k.LJ(xVar));
            int i = (int) (jLIZJ >> 32);
            if (i < 0) {
                i = 0;
            }
            int iLIZJ = C1676820tjk.LIZJ(jLIZJ);
            if (iLIZJ < 0) {
                iLIZJ = 0;
            }
            long jLIZ = C1692940u9k.LIZLLL(xVar).LIZ();
            int i2 = (int) (jLIZ >> 32);
            int i3 = (int) (jLIZ & 4294967295L);
            long jLIZJ2 = C1680450tpb.LIZJ(xVar.LJJJJ((((long) Float.floatToRawIntBits((int) (xVar.LLILLL & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (r2 >> 32)) << 32)));
            int i4 = i2 - ((int) (jLIZJ2 >> 32));
            if (i4 < 0) {
                i4 = 0;
            }
            int iLIZJ2 = i3 - C1676820tjk.LIZJ(jLIZJ2);
            if (iLIZJ2 < 0) {
                iLIZJ2 = 0;
            }
            if (i != 0 || iLIZJ != 0 || i4 != 0 || iLIZJ2 != 0) {
                return c20246014Ju.LIZ.LJIILIIL(i, iLIZJ, i4, iLIZJ2);
            }
        }
        return c20246014Ju;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.LLJJIJIL);
        int[] iArr = this.LLJJIJIL;
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), this.LLJJIJIL[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        Function1<? super Boolean, Unit> function1 = this.LLJJIJIIJIL;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(InterfaceC1690500u5o interfaceC1690500u5o) {
        if (interfaceC1690500u5o != this.LLJI) {
            this.LLJI = interfaceC1690500u5o;
            Function1<? super InterfaceC1690500u5o, Unit> function1 = this.LLJIJIL;
            if (function1 != null) {
                function1.invoke(interfaceC1690500u5o);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.LLJILJIL) {
            this.LLJILJIL = lifecycleOwner;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final void setModifier(InterfaceC1685750ty9 interfaceC1685750ty9) {
        if (interfaceC1685750ty9 != this.LLIZLLLIL) {
            this.LLIZLLLIL = interfaceC1685750ty9;
            Function1<? super InterfaceC1685750ty9, Unit> function1 = this.LLJ;
            if (function1 != null) {
                function1.invoke(interfaceC1685750ty9);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1<? super InterfaceC1690500u5o, Unit> function1) {
        this.LLJIJIL = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1<? super InterfaceC1685750ty9, Unit> function1) {
        this.LLJ = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1<? super Boolean, Unit> function1) {
        this.LLJJIJIIJIL = function1;
    }

    public final void setRelease(Function0<Unit> function0) {
        this.LLIZ = function0;
    }

    public final void setReset(Function0<Unit> function0) {
        this.LLILZLL = function0;
    }

    public final void setSavedStateRegistryOwner(C128Y c128y) {
        if (c128y != this.LLJILJILJ) {
            this.LLJILJILJ = c128y;
            setTag(R.id.view_tree_saved_state_registry_owner, c128y);
        }
    }

    public final void setUpdate(Function0<Unit> function0) {
        this.LLILZ = function0;
        this.LLILZIL = true;
        this.LLJJIII.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (this.LLJJJJJIL) {
            this.LLILLJJLI.postOnAnimation(new ARunnableS130S0100000_30(this.LLJJIJI, 44));
            return null;
        }
        this.LLJJJJLIIL.LJJJIL();
        return null;
    }

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        this.LLJJI = new C20246014Ju(c20246014Ju);
        return LIZLLL(c20246014Ju);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (this.LLJJJJJIL) {
            this.LLILLJJLI.postOnAnimation(new ARunnableS130S0100000_30(this.LLJJIJI, 44));
        } else {
            this.LLJJJJLIIL.LJJJIL();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LLILLJJLI.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (this.LLILLJJLI.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.LLILLJJLI.measure(i, i2);
        setMeasuredDimension(this.LLILLJJLI.getMeasuredWidth(), this.LLILLJJLI.getMeasuredHeight());
        this.LLJJJ = i;
        this.LLJJJIL = i2;
    }

    @Override // X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        this.LLJJJJ.LIZIZ(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C23250099c.LIZLLL(this.LL.LIZLLL(), null, null, new C1703260uQO(this, C1374205Zk.LIZ(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    public static final int LIZIZ(C20084713iH c20084713iH, int i, int i2, int i3) {
        c20084713iH.getClass();
        if (i3 < 0 && i != i2) {
            if (i3 == -2) {
                if (i2 != Integer.MAX_VALUE) {
                    return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
                }
            } else if (i3 == -1 && i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(C13LZ.LJ(i3, i, i2), 1073741824);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C23250099c.LIZLLL(this.LL.LIZLLL(), null, null, new C1703250uQN(z, this, C1374205Zk.LIZ(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.LLJJJJ.LIZ(i, i2);
    }

    public static C20244914Jj LIZJ(C20244914Jj c20244914Jj, int i, int i2, int i3, int i4) {
        int i5 = c20244914Jj.LIZ - i;
        int i6 = 0;
        if (i5 < 0) {
            i5 = 0;
        }
        int i7 = c20244914Jj.LIZIZ - i2;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = c20244914Jj.LIZJ - i3;
        if (i8 < 0) {
            i8 = 0;
        }
        int i9 = c20244914Jj.LIZLLL - i4;
        if (i9 >= 0) {
            i6 = i9;
        }
        return C20244914Jj.LIZIZ(i5, i7, i8, i6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.LLILLJJLI.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        long jLJJJLZIJ;
        if (!isNestedScrollingEnabled()) {
            return;
        }
        C20085913iT c20085913iT = this.LL;
        float f = -1;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * f)) & 4294967295L) | (Float.floatToRawIntBits(i * f) << 32);
        if (i3 == 0) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        C20086013iU c20086013iULJ = c20085913iT.LJ();
        if (c20086013iULJ != null) {
            jLJJJLZIJ = c20086013iULJ.LJJJLZIJ(i4, jFloatToRawIntBits);
        } else {
            jLJJJLZIJ = 0;
        }
        iArr[0] = C1673990tfB.LIZJ(Float.intBitsToFloat((int) (jLJJJLZIJ >> 32)));
        iArr[1] = C1673990tfB.LIZJ(Float.intBitsToFloat((int) (jLJJJLZIJ & 4294967295L)));
    }

    public C20084713iH(Context context, C13Z1 c13z1, int i, C20085913iT c20085913iT, View view, InterfaceC20055013dU interfaceC20055013dU) {
        super(context);
        this.LL = c20085913iT;
        this.LLILLJJLI = view;
        this.LLILLL = interfaceC20055013dU;
        if (c13z1 != null) {
            setTag(R.id.b3h, c13z1);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        final C20084613iG c20084613iG = (C20084613iG) this;
        q0.LJJII(this, new C14JJ() { // from class: X.13iJ
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // X.C14JJ
            public final C20246014Ju LIZJ(C20246014Ju c20246014Ju, List<C14JM> list) {
                return c20084613iG.LIZLLL(c20246014Ju);
            }

            @Override // X.C14JJ
            public final C14JL LIZLLL(C14JM c14jm, C14JL c14jl) {
                x xVar = c20084613iG.LLJJJJLIIL.LLJLLIL.LIZIZ;
                if (xVar.LIZLLL()) {
                    long jLIZJ = C1680450tpb.LIZJ(C1692940u9k.LJ(xVar));
                    int i2 = (int) (jLIZJ >> 32);
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    int iLIZJ = C1676820tjk.LIZJ(jLIZJ);
                    if (iLIZJ < 0) {
                        iLIZJ = 0;
                    }
                    long jLIZ = C1692940u9k.LIZLLL(xVar).LIZ();
                    int i3 = (int) (jLIZ >> 32);
                    int i4 = (int) (jLIZ & 4294967295L);
                    long jLIZJ2 = C1680450tpb.LIZJ(xVar.LJJJJ((((long) Float.floatToRawIntBits((int) (xVar.LLILLL & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (r2 >> 32)) << 32)));
                    int i5 = i3 - ((int) (jLIZJ2 >> 32));
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    int iLIZJ2 = i4 - C1676820tjk.LIZJ(jLIZJ2);
                    if (iLIZJ2 < 0) {
                        iLIZJ2 = 0;
                    }
                    if (i2 != 0 || iLIZJ != 0 || i5 != 0 || iLIZJ2 != 0) {
                        return new C14JL(C20084713iH.LIZJ(c14jl.LIZ, i2, iLIZJ, i5, iLIZJ2), C20084713iH.LIZJ(c14jl.LIZIZ, i2, iLIZJ, i5, iLIZJ2));
                    }
                }
                return c14jl;
            }
        });
        C14K9.LJIJJ(this, this);
        this.LLILZ = AFwS219S0000000_30.get$arr$(296);
        this.LLILZLL = AFwS219S0000000_30.get$arr$(295);
        this.LLIZ = AFwS219S0000000_30.get$arr$(294);
        C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
        this.LLIZLLLIL = c1685760tyA;
        this.LLJI = C1689930u4t.LIZ(1.0f);
        this.LLJILLL = new int[2];
        this.LLJJ = 0L;
        this.LLJJIII = new AwS574S0100000_30(c20084613iG, 359);
        this.LLJJIJI = new AwS574S0100000_30(c20084613iG, 358);
        this.LLJJIJIL = new int[2];
        this.LLJJJ = Integer.MIN_VALUE;
        this.LLJJJIL = Integer.MIN_VALUE;
        this.LLJJJJ = new C1317550kOH();
        final C20053713dH c20053713dH = new C20053713dH(false, 3, 0);
        c20053713dH.LLIZ = true;
        c20053713dH.LLJJ = this;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1689740u4a.LIZIZ(C1686320tz4.LIZ(c1685760tyA, C20085013iK.LIZ, c20085913iT), true, AFwS274S0000000_30.get$arr$(293));
        C1672560tcs c1672560tcs = new C1672560tcs();
        c1672560tcs.LIZIZ = new AwS609S0100000_30(c20084613iG, 193);
        C1672230tcL c1672230tcL = new C1672230tcL();
        C1672230tcL c1672230tcL2 = c1672560tcs.LIZJ;
        if (c1672230tcL2 != null) {
            c1672230tcL2.LL = null;
        }
        c1672560tcs.LIZJ = c1672230tcL;
        c1672230tcL.LL = c1672560tcs;
        setOnRequestDisallowInterceptTouchEvent$ui_release(c1672230tcL);
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1685330txT.LIZ(C1680910tqL.LIZ(C1679660toK.LIZIZ(interfaceC1685750ty9LIZIZ.LIZ(c1672560tcs), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0, 131071), new AwS239S0300000_30(c20084613iG, c20053713dH, c20084613iG, 12)), new AwS396S0200000_30(c20084613iG, c20053713dH, 53));
        c20053713dH.LJ(this.LLIZLLLIL.LIZ(interfaceC1685750ty9LIZ));
        this.LLJ = new AwS396S0200000_30(c20053713dH, interfaceC1685750ty9LIZ, 50);
        c20053713dH.LJIIIZ(this.LLJI);
        this.LLJIJIL = new AwS609S0100000_30(c20053713dH, 264);
        c20053713dH.LLLFFI = new AwS396S0200000_30(c20084613iG, c20053713dH, 51);
        c20053713dH.LLLFZ = new AwS609S0100000_30(c20084613iG, 265);
        c20053713dH.LIZJ(new InterfaceC20053113dB() { // from class: X.13iI
            public final int LJ(int i2) {
                C20084713iH c20084713iH = c20084613iG;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                C20084713iH c20084713iH2 = c20084613iG;
                c20084713iH.measure(iMakeMeasureSpec, C20084713iH.LIZIZ(c20084713iH2, 0, i2, c20084713iH2.getLayoutParams().height));
                return c20084613iG.getMeasuredWidth();
            }

            @Override // X.InterfaceC20053113dB
            public final int LIZ(j1 j1Var, List list, int i2) {
                C20084713iH c20084713iH = c20084613iG;
                c20084713iH.measure(C20084713iH.LIZIZ(c20084713iH, 0, i2, c20084713iH.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return c20084613iG.getMeasuredHeight();
            }

            @Override // X.InterfaceC20053113dB
            public final int LIZIZ(j1 j1Var, List list, int i2) {
                return LJ(i2);
            }

            @Override // X.InterfaceC20053113dB
            public final int LIZJ(j1 j1Var, List list, int i2) {
                C20084713iH c20084713iH = c20084613iG;
                c20084713iH.measure(C20084713iH.LIZIZ(c20084713iH, 0, i2, c20084713iH.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return c20084613iG.getMeasuredHeight();
            }

            @Override // X.InterfaceC20053113dB
            public final int LIZLLL(j1 j1Var, List list, int i2) {
                return LJ(i2);
            }

            @Override // X.InterfaceC20053113dB
            public final InterfaceC1690350u5Z LJFF(InterfaceC1689940u4u interfaceC1689940u4u, List<? extends InterfaceC1673370teB> list, long j) {
                if (c20084613iG.getChildCount() == 0) {
                    return interfaceC1689940u4u.LJLJJL(C1682380tsi.LJIIJ(j), C1682380tsi.LJIIIZ(j), C2097608Jq.LJ(), AFwS274S0000000_30.get$arr$(292));
                }
                if (C1682380tsi.LJIIJ(j) != 0) {
                    c20084613iG.getChildAt(0).setMinimumWidth(C1682380tsi.LJIIJ(j));
                }
                if (C1682380tsi.LJIIIZ(j) != 0) {
                    c20084613iG.getChildAt(0).setMinimumHeight(C1682380tsi.LJIIIZ(j));
                }
                C20084713iH c20084713iH = c20084613iG;
                c20084713iH.measure(C20084713iH.LIZIZ(c20084713iH, C1682380tsi.LJIIJ(j), C1682380tsi.LJIIIIZZ(j), c20084613iG.getLayoutParams().width), C20084713iH.LIZIZ(c20084613iG, C1682380tsi.LJIIIZ(j), C1682380tsi.LJII(j), c20084613iG.getLayoutParams().height));
                return interfaceC1689940u4u.LJLJJL(c20084613iG.getMeasuredWidth(), c20084613iG.getMeasuredHeight(), C2097608Jq.LJ(), new AwS396S0200000_30(c20084613iG, c20053713dH, 52));
            }
        });
        this.LLJJJJLIIL = c20053713dH;
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        int i6;
        if (!isNestedScrollingEnabled()) {
            return;
        }
        C20085913iT c20085913iT = this.LL;
        float f = -1;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * f)) << 32) | (((long) Float.floatToRawIntBits(i2 * f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * f)) << 32) | (((long) Float.floatToRawIntBits(i4 * f)) & 4294967295L);
        if (i5 == 0) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        c20085913iT.LIZIZ(i6, jFloatToRawIntBits, jFloatToRawIntBits2);
    }

    @Override // X.InterfaceC1318440kPi
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (!isNestedScrollingEnabled()) {
            return;
        }
        C20085913iT c20085913iT = this.LL;
        float f = -1;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * f)) << 32) | (((long) Float.floatToRawIntBits(i2 * f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * f)) << 32) | (((long) Float.floatToRawIntBits(i4 * f)) & 4294967295L);
        if (i5 == 0) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        long jLIZIZ = c20085913iT.LIZIZ(i6, jFloatToRawIntBits, jFloatToRawIntBits2);
        iArr[0] = C1673990tfB.LIZJ(Float.intBitsToFloat((int) (jLIZIZ >> 32)));
        iArr[1] = C1673990tfB.LIZJ(Float.intBitsToFloat((int) (jLIZIZ & 4294967295L)));
    }
}
