package X;

import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class DialogC1686750tzl extends C19EK {
    public Function0<Unit> LLILZ;
    public C1686740tzk LLILZIL;
    public final View LLILZLL;
    public final C1685350txV LLIZ;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public static final void LJJLJ(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C1685350txV) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof ViewGroup) && (viewGroup2 = (ViewGroup) childAt) != null) {
                LJJLJ(viewGroup2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r0 <= r1) goto L20;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r6 = super.onTouchEvent(r8)
            X.0tzk r0 = r7.LLILZIL
            boolean r0 = r0.LIZIZ
            if (r0 == 0) goto L6a
            X.0txV r5 = r7.LLIZ
            r5.getClass()
            float r1 = r8.getX()
            boolean r0 = java.lang.Float.isInfinite(r1)
            r2 = 0
            if (r0 != 0) goto L6b
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L6b
            float r1 = r8.getY()
            boolean r0 = java.lang.Float.isInfinite(r1)
            if (r0 != 0) goto L6b
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L6b
            android.view.View r1 = r5.getChildAt(r2)
            if (r1 == 0) goto L6b
            int r4 = r5.getLeft()
            int r0 = r1.getLeft()
            int r4 = r4 + r0
            int r3 = r1.getWidth()
            int r3 = r3 + r4
            int r2 = r5.getTop()
            int r0 = r1.getTop()
            int r2 = r2 + r0
            int r1 = r1.getHeight()
            int r1 = r1 + r2
            float r0 = r8.getX()
            int r0 = X.C814420VxA.LIZIZ(r0)
            if (r4 > r0) goto L6b
            if (r0 > r3) goto L6b
            float r0 = r8.getY()
            int r0 = X.C814420VxA.LIZIZ(r0)
            if (r2 > r0) goto L6b
            if (r0 > r1) goto L6b
        L6a:
            return r6
        L6b:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r7.LLILZ
            r0.invoke()
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC1686750tzl.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.LLILZIL.LIZ && keyEvent.isTracking() && !keyEvent.isCanceled() && i == 111) {
            this.LLILZ.invoke();
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final void LJJLJLI(Function0<Unit> function0, C1686740tzk c1686740tzk, EnumC1671200tag enumC1671200tag) {
        int i;
        int i2;
        boolean z;
        int i3;
        this.LLILZ = function0;
        this.LLILZIL = c1686740tzk;
        EnumC1686780tzo enumC1686780tzo = c1686740tzk.LIZJ;
        boolean zLIZJ = C1680580tpo.LIZJ(this.LLILZLL);
        int i4 = C1686770tzn.LIZ[enumC1686780tzo.ordinal()];
        int i5 = 0;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new C1954807lC();
                }
            } else {
                zLIZJ = true;
            }
        } else {
            zLIZJ = false;
        }
        Window window = getWindow();
        if (zLIZJ) {
            i = 8192;
        } else {
            i = -8193;
        }
        window.setFlags(i, 8192);
        C1685350txV c1685350txV = this.LLIZ;
        int i6 = C1680670tpx.LIZ[enumC1671200tag.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                i2 = 1;
            } else {
                throw new C1954807lC();
            }
        } else {
            i2 = 0;
        }
        c1685350txV.setLayoutDirection(i2);
        boolean z2 = c1686740tzk.LJ;
        C1685350txV c1685350txV2 = this.LLIZ;
        boolean z3 = c1686740tzk.LIZLLL;
        if (c1685350txV2.LLJILJILJ && z3 == c1685350txV2.LLJIJIL && z2 == c1685350txV2.LLJILJIL) {
            z = false;
        } else {
            z = true;
        }
        c1685350txV2.LLJIJIL = z3;
        c1685350txV2.LLJILJIL = z2;
        if (z) {
            WindowManager.LayoutParams attributes = c1685350txV2.LLJ.getAttributes();
            if (z3) {
                i3 = -2;
            } else {
                i3 = -1;
            }
            if (i3 != attributes.width || !c1685350txV2.LLJILJILJ) {
                c1685350txV2.LLJ.setLayout(i3, -2);
                c1685350txV2.LLJILJILJ = true;
            }
        }
        setCanceledOnTouchOutside(c1686740tzk.LIZIZ);
        Window window2 = getWindow();
        if (window2 != null) {
            if (!z2) {
                if (Build.VERSION.SDK_INT < 31) {
                    i5 = 16;
                } else {
                    i5 = 48;
                }
            }
            window2.setSoftInputMode(i5);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DialogC1686750tzl(Function0<Unit> function0, C1686740tzk c1686740tzk, View view, EnumC1671200tag enumC1671200tag, InterfaceC1690500u5o interfaceC1690500u5o, UUID uuid) {
        int i;
        ViewGroup viewGroup;
        Context context = view.getContext();
        if (c1686740tzk.LJ) {
            i = R.style.ic;
        } else {
            i = R.style.im;
        }
        super(new ContextThemeWrapper(context, i), 0);
        this.LLILZ = function0;
        this.LLILZIL = c1686740tzk;
        this.LLILZLL = view;
        float f = 8;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(android.R.color.transparent);
            C0DRA.LIZ(window, this.LLILZIL.LJ);
            window.setGravity(17);
            C1685350txV c1685350txV = new C1685350txV(getContext(), window);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Dialog:");
            sbLIZ.append(uuid);
            c1685350txV.setTag(R.id.eob, C2188811AlT.LIZIZ(sbLIZ));
            c1685350txV.setClipChildren(false);
            c1685350txV.setElevation(interfaceC1690500u5o.LJJJJLL(f));
            c1685350txV.setOutlineProvider(new C1698010uHv(2));
            this.LLIZ = c1685350txV;
            View decorView = window.getDecorView();
            if ((decorView instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView) != null) {
                LJJLJ(viewGroup);
            }
            setContentView(c1685350txV);
            ViewTreeLifecycleOwner.set(c1685350txV, ViewTreeLifecycleOwner.get(view));
            ViewTreeViewModelStoreOwner.set(c1685350txV, ViewTreeViewModelStoreOwner.get(view));
            c1685350txV.setTag(R.id.view_tree_saved_state_registry_owner, C1688560u2g.LIZ(view));
            LJJLJLI(this.LLILZ, this.LLILZIL, enumC1671200tag);
            C1247340iZ2.LIZ(this.LLILLL, this, new AwS604S0100000_25(this, 732), 2);
            return;
        }
        "Dialog has no window".toString();
        throw new IllegalStateException("Dialog has no window");
    }
}
