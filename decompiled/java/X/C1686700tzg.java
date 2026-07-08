package X;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tzg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686700tzg extends AbstractC20085213iM {
    public static final AFwS266S0000000_25 LLJL = AFwS266S0000000_25.get$arr$(507);
    public Function0<Unit> LLJ;
    public C1686720tzi LLJI;
    public String LLJIJIL;
    public final View LLJILJIL;
    public final InterfaceC1686790tzp LLJILJILJ;
    public final WindowManager LLJILLL;
    public final WindowManager.LayoutParams LLJJ;
    public InterfaceC1686820tzs LLJJI;
    public EnumC1671200tag LLJJIII;
    public final C05P0 LLJJIJI;
    public final C05P0 LLJJIJIIJIL;
    public C1680470tpd LLJJIJIL;
    public final C13YZ LLJJJ;
    public final Rect LLJJJIL;
    public final C20029113Yj LLJJJJ;
    public C1686830tzt LLJJJJJIL;
    public final C05P0 LLJJJJLIIL;
    public boolean LLJJL;
    public final int[] LLJJLIIIJLLLLLLLZ;

    public C1686700tzg() {
        throw null;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public final void LJIILJJIL() {
        C1682900ttY c1682900ttYM65getPopupContentSizebOM6tXw;
        C1680470tpd c1680470tpd = this.LLJJIJIL;
        if (c1680470tpd == null || (c1682900ttYM65getPopupContentSizebOM6tXw = m65getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = c1682900ttYM65getPopupContentSizebOM6tXw.LIZ;
        C1680470tpd visibleDisplayBounds = getVisibleDisplayBounds();
        long j2 = (((long) (visibleDisplayBounds.LIZJ - visibleDisplayBounds.LIZ)) << 32) | (((long) (visibleDisplayBounds.LIZLLL - visibleDisplayBounds.LIZIZ)) & 4294967295L);
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = 0L;
        this.LLJJJJ.LIZLLL(this, new C1686710tzh(c238400w2, this, c1680470tpd, j2, j), LLJL);
        WindowManager.LayoutParams layoutParams = this.LLJJ;
        long j3 = c238400w2.element;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = C1676820tjk.LIZJ(j3);
        if (this.LLJI.LJ) {
            this.LLJILJILJ.LIZIZ((int) (j2 >> 32), (int) (4294967295L & j2), this);
        }
        this.LLJILJILJ.LIZJ(this.LLJILLL, this, this.LLJJ);
    }

    public AbstractC20085213iM getSubCompositionView() {
        return this;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    private final Function2<InterfaceC1680500tpg, Integer, Unit> getContent() {
        return (Function2) this.LLJJJJLIIL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1692950u9l getParentLayoutCoordinates() {
        return (InterfaceC1692950u9l) this.LLJJIJIIJIL.getValue();
    }

    private final C1680470tpd getVisibleDisplayBounds() {
        Rect rect = this.LLJJJIL;
        this.LLJILJILJ.LIZ(rect, this.LLJILJIL);
        return new C1680470tpd(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.LLJJJ.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final C1682900ttY m65getPopupContentSizebOM6tXw() {
        return (C1682900ttY) this.LLJJIJI.getValue();
    }

    public final void LJIIL() {
        InterfaceC1692950u9l parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.LIZLLL()) {
            return;
        }
        long jLIZ = parentLayoutCoordinates.LIZ();
        long jLJFF = C1692940u9k.LJFF(parentLayoutCoordinates);
        long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jLJFF >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jLJFF & 4294967295L)))) & 4294967295L);
        int i = (int) (jRound >> 32);
        C1680470tpd c1680470tpd = new C1680470tpd(i, C1676820tjk.LIZJ(jRound), ((int) (jLIZ >> 32)) + i, C1676820tjk.LIZJ(jRound) + ((int) (jLIZ & 4294967295L)));
        if (Intrinsics.LJFF(c1680470tpd, this.LLJJIJIL)) {
            return;
        }
        this.LLJJIJIL = c1680470tpd;
        LJIILJJIL();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0tzt] */
    @Override // X.AbstractC20085213iM, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        super.onAttachedToWindow();
        C20029113Yj c20029113Yj = this.LLJJJJ;
        c20029113Yj.getClass();
        c20029113Yj.LJII = C13YI.LIZLLL(c20029113Yj.LIZLLL);
        if (!this.LLJI.LIZJ || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.LLJJJJJIL == null) {
            final Function0<Unit> function0 = this.LLJ;
            this.LLJJJJJIL = new OnBackInvokedCallback() { // from class: X.0tzt
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    Function0 function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            };
        }
        C1686830tzt c1686830tzt = this.LLJJJJJIL;
        if (!(c1686830tzt instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, c1686830tzt);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        super.onDetachedFromWindow();
        C13Y8 c13y8 = this.LLJJJJ.LJII;
        if (c13y8 != null) {
            c13y8.dispose();
        }
        this.LLJJJJ.LIZIZ();
        if (Build.VERSION.SDK_INT >= 33) {
            C1686830tzt c1686830tzt = this.LLJJJJJIL;
            if ((c1686830tzt instanceof OnBackInvokedCallback) && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher()) != null) {
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(c1686830tzt);
            }
        }
        this.LLJJJJJIL = null;
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.LLJJ;
    }

    public final EnumC1671200tag getParentLayoutDirection() {
        return this.LLJJIII;
    }

    public final InterfaceC1686820tzs getPositionProvider() {
        return this.LLJJI;
    }

    @Override // X.AbstractC20085213iM
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.LLJJL;
    }

    public final String getTestTag() {
        return this.LLJIJIL;
    }

    private final void setContent(Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        ((C13FE) this.LLJJJJLIIL).setValue(function2);
    }

    private final void setParentLayoutCoordinates(InterfaceC1692950u9l interfaceC1692950u9l) {
        ((C13FE) this.LLJJIJIIJIL).setValue(interfaceC1692950u9l);
    }

    public final void LJIILIIL(InterfaceC1692950u9l interfaceC1692950u9l) {
        setParentLayoutCoordinates(interfaceC1692950u9l);
        LJIIL();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.LLJI.LIZJ) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0<Unit> function0 = this.LLJ;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LLJI.LIZLLL) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
                Function0<Unit> function0 = this.LLJ;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
            if (motionEvent.getAction() == 4) {
                Function0<Unit> function02 = this.LLJ;
                if (function02 != null) {
                    function02.invoke();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setParentLayoutDirection(EnumC1671200tag enumC1671200tag) {
        this.LLJJIII = enumC1671200tag;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m66setPopupContentSizefhxjrPA(C1682900ttY c1682900ttY) {
        ((C13FE) this.LLJJIJI).setValue(c1682900ttY);
    }

    public final void setPositionProvider(InterfaceC1686820tzs interfaceC1686820tzs) {
        this.LLJJI = interfaceC1686820tzs;
    }

    public final void setTestTag(String str) {
        this.LLJIJIL = str;
    }

    @Override // X.AbstractC20085213iM
    public final void LIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        interfaceC1680500tpg.LJJIIJZLJL(-857613600);
        getContent().invoke(interfaceC1680500tpg, 0);
        interfaceC1680500tpg.LJ();
    }

    @Override // X.AbstractC20085213iM
    public final void LJI(int i, int i2) {
        if (this.LLJI.LJFF) {
            super.LJI(i, i2);
        } else {
            C1680470tpd visibleDisplayBounds = getVisibleDisplayBounds();
            super.LJI(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.LIZJ - visibleDisplayBounds.LIZ, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.LIZLLL - visibleDisplayBounds.LIZIZ, Integer.MIN_VALUE));
        }
    }

    public final void LJIIJ(C13Z1 c13z1, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        setParentCompositionContext(c13z1);
        setContent(function2);
        this.LLJJL = true;
    }

    public final void LJIIJJI(Function0<Unit> function0, C1686720tzi c1686720tzi, String str, EnumC1671200tag enumC1671200tag) {
        int i;
        this.LLJ = function0;
        this.LLJIJIL = str;
        if (!Intrinsics.LJFF(this.LLJI, c1686720tzi)) {
            if (c1686720tzi.LJFF && !this.LLJI.LJFF) {
                WindowManager.LayoutParams layoutParams = this.LLJJ;
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            this.LLJI = c1686720tzi;
            WindowManager.LayoutParams layoutParams2 = this.LLJJ;
            boolean zLIZJ = C1680580tpo.LIZJ(this.LLJILJIL);
            if (c1686720tzi.LIZIZ) {
                if (zLIZJ) {
                    i = c1686720tzi.LIZ | 8192;
                } else {
                    i = c1686720tzi.LIZ & (-8193);
                }
            } else {
                i = c1686720tzi.LIZ;
            }
            layoutParams2.flags = i;
            this.LLJILJILJ.LIZJ(this.LLJILLL, this, this.LLJJ);
        }
        int i2 = C1678160tlu.LIZ[enumC1671200tag.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            if (i2 != 2) {
                throw new C1954807lC();
            }
        } else {
            i3 = 0;
        }
        super.setLayoutDirection(i3);
    }

    @Override // X.AbstractC20085213iM
    public final void LJFF(int i, int i2, int i3, int i4, boolean z) {
        View childAt;
        super.LJFF(i, i2, i3, i4, z);
        if (this.LLJI.LJFF || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.LLJJ.width = childAt.getMeasuredWidth();
        this.LLJJ.height = childAt.getMeasuredHeight();
        this.LLJILJILJ.LIZJ(this.LLJILLL, this, this.LLJJ);
    }

    public C1686700tzg(Function0 function0, C1686720tzi c1686720tzi, String str, View view, InterfaceC1690500u5o interfaceC1690500u5o, InterfaceC1686820tzs interfaceC1686820tzs, UUID uuid) {
        C1686800tzq c1686800tzq;
        int i;
        if (Build.VERSION.SDK_INT >= 29) {
            c1686800tzq = new C1686800tzq() { // from class: X.0tzj
                @Override // X.C1686800tzq, X.InterfaceC1686790tzp
                public final void LIZIZ(int i2, int i3, View view2) {
                    view2.setSystemGestureExclusionRects(C1697810uHb.LJIILJJIL(new Rect(0, 0, i2, i3)));
                }
            };
        } else {
            c1686800tzq = new C1686800tzq();
        }
        super(view.getContext(), null, 6, 0);
        this.LLJ = function0;
        this.LLJI = c1686720tzi;
        this.LLJIJIL = str;
        this.LLJILJIL = view;
        this.LLJILJILJ = c1686800tzq;
        this.LLJILLL = (WindowManager) C786410Ut5.H2(view.getContext(), "window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        C1686720tzi c1686720tzi2 = this.LLJI;
        boolean zLIZJ = C1680580tpo.LIZJ(view);
        if (c1686720tzi2.LIZIZ) {
            if (zLIZJ) {
                i = c1686720tzi2.LIZ | 8192;
            } else {
                i = c1686720tzi2.LIZ & (-8193);
            }
        } else {
            i = c1686720tzi2.LIZ;
        }
        layoutParams.flags = i;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(2131830515));
        this.LLJJ = layoutParams;
        this.LLJJI = interfaceC1686820tzs;
        this.LLJJIII = EnumC1671200tag.Ltr;
        this.LLJJIJI = C20028913Yh.LJI(null);
        this.LLJJIJIIJIL = C20028913Yh.LJI(null);
        this.LLJJJ = C20028913Yh.LJ(new AwS569S0100000_25(this, 973));
        this.LLJJJIL = new Rect();
        this.LLJJJJ = new C20029113Yj(new AwS604S0100000_25(this, 733));
        setId(R.id.content);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(view));
        setTag(com.zhiliaoapp.musically.R.id.view_tree_saved_state_registry_owner, C1688560u2g.LIZ(view));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Popup:");
        sbLIZ.append(uuid);
        setTag(com.zhiliaoapp.musically.R.id.eob, C2188811AlT.LIZIZ(sbLIZ));
        setClipChildren(false);
        setElevation(interfaceC1690500u5o.LJJJJLL(8));
        setOutlineProvider(new C1698010uHv(3));
        this.LLJJJJLIIL = C20028913Yh.LJI(C1686810tzr.LIZ);
        this.LLJJLIIIJLLLLLLLZ = new int[2];
    }
}
