package X;

import android.content.Context;
import android.graphics.Region;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.drawerlayout.widget.DrawerLayout$DrawerListener;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ifa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C472280Ifa extends FrameLayout implements InterfaceC472320Ife {
    public int LL;
    public final C472290Ifb LLILLJJLI;
    public C21586319dt LLILLL;
    public InterfaceC472300Ifc LLILZ;

    public boolean getCasterShow() {
        return this.LLILLJJLI.LJIJJLI;
    }

    public List<DrawerLayout$DrawerListener> getDrawerListeners() {
        try {
            Field declaredField = C21586319dt.class.getDeclaredField("mListeners");
            declaredField.setAccessible(true);
            return (List) declaredField.get(this.LLILLL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public boolean getIsClearScreen() {
        return this.LLILLJJLI.LJIIL;
    }

    public boolean getIsKeyboardOpen() {
        return this.LLILLJJLI.LJIILIIL;
    }

    public boolean getSkylightOpen() {
        return this.LLILLJJLI.LJIILJJIL;
    }

    public InterfaceC472300Ifc getTouchEventInterceptor() {
        return this.LLILZ;
    }

    public final View LIZ(int i) {
        int absoluteGravity;
        C21586319dt c21586319dt = this.LLILLL;
        if (c21586319dt == null) {
            return null;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i, c21586319dt.getLayoutDirection()) & 7;
        int childCount = this.LLILLL.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.LLILLL.getChildAt(i2);
            if (this.LLILLL == null) {
                absoluteGravity = 0;
            } else {
                absoluteGravity = Gravity.getAbsoluteGravity(((DrawerLayout$LayoutParams) childAt.getLayoutParams()).gravity, this.LLILLL.getLayoutDirection());
            }
            if ((absoluteGravity & 7) == absoluteGravity2) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean LIZIZ(int i) {
        if (this.LLILLL != null && getContext() != null && getContext().getApplicationInfo() != null && this.LLILLL.getDrawerLockMode(i) == 0 && LIZ(i) != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        int childCount;
        if (view instanceof InterfaceC472340Ifg) {
            childCount = getChildCount();
            if (childCount >= 2) {
                childCount = 1;
            }
        } else {
            childCount = -1;
        }
        super.addView(view, childCount);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (this.LL == 1) {
            return true;
        }
        return super.gatherTransparentRegion(region);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        InterfaceC472300Ifc interfaceC472300Ifc = this.LLILZ;
        if (interfaceC472300Ifc != null && interfaceC472300Ifc.LJJJLZIJ()) {
            if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).St() && getSkylightOpen() && this.LLILZ.LJJJJ(motionEvent)) {
                return true;
            }
            if (this.LLILLJJLI.LIZ() && this.LLILZ.LJJJJ(motionEvent)) {
                return true;
            }
        }
        C472290Ifb c472290Ifb = this.LLILLJJLI;
        c472290Ifb.getClass();
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            c472290Ifb.LIZLLL = x;
            c472290Ifb.LJ = y;
            return false;
        }
        if (actionMasked == 2) {
            float f = x - c472290Ifb.LIZLLL;
            float f2 = y - c472290Ifb.LJ;
            if (!c472290Ifb.LIZJ ? f < 0.0f : f > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (Math.abs(f) > c472290Ifb.LJFF * 2 && Math.abs(f) > Math.abs(f2) && c472290Ifb.LIZJ(f) && z && c472290Ifb.LIZIZ(motionEvent) && !c472290Ifb.LJIIZILJ && Math.abs(f) > ((double) Math.abs(f2)) * Math.sqrt(3.0d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C472280Ifa.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        try {
            super.restoreHierarchyState(sparseArray);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            JSONObject jSONObject = new JSONObject();
            C0K04.LJFF("error_msg", e.toString(), jSONObject);
            C1CC2.LJIIIIZZ("ttlive_xg_restore_dump", 1, jSONObject);
        }
    }

    public void setCasterShow(boolean z) {
        this.LLILLJJLI.LJIJJLI = z;
    }

    public void setContinueLike(boolean z) {
        this.LLILLJJLI.LJIJ = z;
    }

    public void setDisableInBottomTab(boolean z) {
        this.LLILLJJLI.LJIJJ = z;
    }

    public void setDragDebugTools(boolean z) {
        this.LLILLJJLI.LJIIZILJ = z;
    }

    public void setDragInterceptor(InterfaceC472330Iff interfaceC472330Iff) {
        this.LLILLJJLI.LJIL = interfaceC472330Iff;
    }

    public void setDrawerEnable(boolean z) {
        this.LLILLJJLI.LJIILLIIL = z;
    }

    public void setDrawerLayout(C21586319dt c21586319dt) {
        this.LLILLL = c21586319dt;
    }

    public void setGetCurTabPage(InterfaceC2453409jQ<String> interfaceC2453409jQ) {
        this.LLILLJJLI.LJJII = interfaceC2453409jQ;
    }

    public void setIsEndCardShowing(boolean z) {
        this.LLILLJJLI.LJJIFFI = z;
    }

    public void setKeyboardOpen(boolean z) {
        this.LLILLJJLI.LJIILIIL = z;
    }

    public void setPadNewLandscape(boolean z) {
        this.LLILLJJLI.LJIILL = z;
    }

    public void setPageContainer(int i) {
        this.LL = i;
    }

    public void setSkylightOpen(boolean z) {
        this.LLILLJJLI.LJIILJJIL = z;
    }

    public void setSmoothClearScreen(boolean z) {
        this.LLILLJJLI.LJIJI = z;
    }

    public void setTopTabPosision(int i) {
        this.LLILLJJLI.LJJ = i;
    }

    public void setTouchEventInterceptor(InterfaceC472300Ifc interfaceC472300Ifc) {
        this.LLILZ = interfaceC472300Ifc;
    }

    public void setVariantCardShowing(boolean z) {
        this.LLILLJJLI.LJJIII = z;
    }

    public C472280Ifa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = -1;
        this.LLILLJJLI = new C472290Ifb(context, this);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        int childCount;
        if (view instanceof InterfaceC472340Ifg) {
            childCount = getChildCount();
            if (childCount >= 2) {
                childCount = 1;
            }
        } else {
            childCount = -1;
        }
        addView(view, childCount, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if ((view instanceof InterfaceC472340Ifg) && getChildCount() >= 2) {
            i = 1;
        }
        super.addView(view, i);
    }
}
