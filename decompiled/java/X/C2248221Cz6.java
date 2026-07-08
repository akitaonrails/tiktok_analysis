package X;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Cz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248221Cz6 extends AbstractC2248231Cz7 {
    public final View LJIJJLI;
    public final Function0<Layout> LJIL;
    public InterfaceC2247911Cyb LJJ;
    public int LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;

    @Override // X.AbstractC2248231Cz7
    public final Layout LJIIZILJ() {
        return this.LJIL.invoke();
    }

    @Override // X.AbstractC2248231Cz7
    public final void LJIJJ() {
        C2248181Cz2 c2248181Cz2 = this.LJII;
        if (c2248181Cz2 != null) {
            c2248181Cz2.LIZIZ();
        }
        C2248181Cz2 c2248181Cz22 = this.LJIIIZ;
        if (c2248181Cz22 != null) {
            c2248181Cz22.LIZIZ();
        }
        InterfaceC2247911Cyb interfaceC2247911Cyb = this.LJJ;
        if (interfaceC2247911Cyb != null) {
            interfaceC2247911Cyb.LIZIZ(false);
        }
    }

    @Override // X.AbstractC2248231Cz7
    public final void LJJ() {
        InterfaceC2247911Cyb interfaceC2247911Cyb = this.LJJ;
        if (interfaceC2247911Cyb != null) {
            interfaceC2247911Cyb.LIZIZ(false);
        }
    }

    @Override // X.AbstractC2248231Cz7, X.InterfaceC1859950yV7
    public final void LIZJ() {
        super.LIZJ();
        InterfaceC2247911Cyb interfaceC2247911Cyb = this.LJJ;
        if (interfaceC2247911Cyb != null) {
            interfaceC2247911Cyb.LIZIZ(true);
        }
    }

    @Override // X.AbstractC2248231Cz7
    public final CharSequence LJIJ() {
        CharSequence text;
        Layout layoutLJIIZILJ = LJIIZILJ();
        return (layoutLJIIZILJ == null || (text = layoutLJIIZILJ.getText()) == null) ? "" : text;
    }

    @Override // X.AbstractC2248231Cz7
    public final void LJJIII() {
        InterfaceC2247911Cyb interfaceC2247911Cyb;
        LJIIJ();
        if (!LJJIIZ(LJIIZILJ(), this.LJIIJJI, this.LJIIL) || (interfaceC2247911Cyb = this.LJJ) == null) {
            return;
        }
        interfaceC2247911Cyb.onShow();
    }

    @Override // X.AbstractC2248231Cz7, X.InterfaceC1859950yV7
    public final void LIZ() {
        super.LIZ();
    }

    @Override // X.InterfaceC1859950yV7
    public final void LIZLLL(int i) {
        C2248301CzE c2248301CzE;
        if (i != 0) {
            if (i == 1 && (c2248301CzE = this.LJIJ) != null) {
                c2248301CzE.LIZ = false;
                return;
            }
            return;
        }
        LJIL();
    }

    @Override // X.InterfaceC1859950yV7
    public final void LJ(InterfaceC2247911Cyb interfaceC2247911Cyb) {
        this.LJJ = interfaceC2247911Cyb;
    }

    @Override // X.InterfaceC1859950yV7
    public final void LJFF(int i) {
        this.LJJIIZI = i;
    }

    @Override // X.InterfaceC1859950yV7
    public final void LJIIIIZZ(int i) {
        this.LJJIIZ = i;
    }

    @Override // X.InterfaceC1859950yV7
    public final void LJIILJJIL(int[] iArr) {
        View rootView;
        Window window;
        Activity activityLIZ = C1388190mED.LIZ(this.LJIJJLI.getContext());
        if (activityLIZ == null || (window = activityLIZ.getWindow()) == null || (rootView = window.getDecorView()) == null) {
            rootView = this.LJIJJLI.getRootView();
        }
        int measuredWidth = ((this.LJJI + this.LJJIII) / 2) - (rootView.getMeasuredWidth() / 2);
        int i = this.LJJIFFI;
        if (i != this.LJJIIJ) {
            measuredWidth = 0;
        }
        iArr[0] = measuredWidth;
        iArr[1] = i;
        iArr[2] = this.LJJIIJZLJL;
    }

    @Override // X.AbstractC2248231Cz7
    public final boolean LJIJJLI(MotionEvent motionEvent) {
        int i;
        int rawY = (int) motionEvent.getRawY();
        int rawX = (int) motionEvent.getRawX();
        int i2 = this.LJJIFFI;
        if (rawY < i2 || rawY > (i = this.LJJIIJZLJL)) {
            return true;
        }
        if (rawY > i2 && rawY < this.LJJII && rawX < this.LJJI) {
            return true;
        }
        if (rawY > this.LJJIIJ && rawY < i && rawX > this.LJJIII) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2248221Cz6(View view, Function0<? extends Layout> function0) {
        super(view);
        this.LJIJJLI = view;
        this.LJIL = function0;
    }

    @Override // X.InterfaceC1859950yV7
    public final void LJIILL(int i, int i2) {
        CharSequence text;
        Layout layoutLJIIZILJ = LJIIZILJ();
        if (layoutLJIIZILJ == null || (text = layoutLJIIZILJ.getText()) == null) {
            return;
        }
        View view = this.LJIJJLI;
        int iLIZIZ = C431170GvT.LIZIZ(layoutLJIIZILJ, i - view.getPaddingLeft(), i2 - view.getPaddingTop());
        if (iLIZIZ < 0) {
            return;
        }
        Pair pairLIZ = C1860150yVR.LIZ(iLIZIZ, null, text.toString());
        this.LJIIJJI = ((Number) pairLIZ.getFirst()).intValue();
        this.LJIIL = ((Number) pairLIZ.getSecond()).intValue();
        LJJII();
        LJIIJ();
        this.LJIILL = true;
    }

    @Override // X.AbstractC2248231Cz7
    public final void LJJIIJZLJL(int i, int i2, boolean z) {
        Layout layoutLJIIZILJ = LJIIZILJ();
        if (layoutLJIIZILJ == null) {
            return;
        }
        this.LJIJJLI.getLocationInWindow(this.LJFF);
        int[] iArr = this.LJFF;
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        View view = this.LJIJJLI;
        int iLIZIZ = C431170GvT.LIZIZ(layoutLJIIZILJ, i3 - view.getPaddingLeft(), i4 - view.getPaddingTop());
        if (iLIZIZ < 0) {
            return;
        }
        if (z) {
            this.LJIIJJI = iLIZIZ;
        } else {
            this.LJIIL = iLIZIZ;
        }
        if (this.LJIIJJI > this.LJIIL) {
            this.LJII.LIZ();
            this.LJIIIZ.LIZ();
            int i5 = this.LJIIJJI;
            this.LJIIJJI = this.LJIIL;
            this.LJIIL = i5;
        }
    }

    public final boolean LJJIIZ(Layout layout, int i, int i2) {
        this.LJIJJLI.getGlobalVisibleRect(this.LJI);
        int lineForOffset = layout.getLineForOffset(i);
        int lineForOffset2 = layout.getLineForOffset(i2);
        int paddingTop = this.LJFF[1] + this.LJIJJLI.getPaddingTop() + layout.getLineTop(lineForOffset);
        int paddingTop2 = this.LJFF[1] + this.LJIJJLI.getPaddingTop() + layout.getLineBottom(lineForOffset2);
        Rect rect = this.LJI;
        if (paddingTop2 > rect.top && paddingTop < rect.bottom - this.LJJIIZ) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC2248231Cz7
    public final void LJJI(Layout layout, int i, C2248181Cz2 c2248181Cz2, boolean z) {
        int lineEnd;
        float primaryHorizontal;
        int i2;
        this.LJIJJLI.getGlobalVisibleRect(this.LJI);
        int lineForOffset = layout.getLineForOffset(i);
        boolean z2 = false;
        try {
            try {
                primaryHorizontal = layout.getPrimaryHorizontal(i);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (z) {
                    lineEnd = layout.getLineStart(lineForOffset);
                } else {
                    lineEnd = layout.getLineEnd(lineForOffset);
                }
                primaryHorizontal = layout.getPrimaryHorizontal(lineEnd);
            }
            i2 = (int) primaryHorizontal;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            i2 = 0;
        }
        this.LJIJJLI.getLocationInWindow(this.LJFF);
        int paddingLeft = this.LJFF[0] + this.LJIJJLI.getPaddingLeft() + i2;
        int paddingTop = this.LJFF[1] + this.LJIJJLI.getPaddingTop() + layout.getLineTop(lineForOffset);
        int paddingTop2 = this.LJFF[1] + this.LJIJJLI.getPaddingTop() + layout.getLineBottom(lineForOffset);
        int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
        if (z) {
            this.LJJI = paddingLeft;
            this.LJJIFFI = paddingTop;
            this.LJJII = paddingTop2;
        } else {
            this.LJJIII = paddingLeft;
            this.LJJIIJ = paddingTop;
            this.LJJIIJZLJL = paddingTop2;
        }
        Rect rect = this.LJI;
        if (paddingTop < rect.top || paddingTop2 > rect.bottom || this.LJFF[1] == 0 || paddingTop2 >= Resources.getSystem().getDisplayMetrics().heightPixels - this.LJJIIZ || paddingTop <= this.LJJIIZI) {
            z2 = true;
        }
        c2248181Cz2.setOutArea(z2);
        c2248181Cz2.LIZJ(this.LJIJJLI, paddingLeft, paddingTop, lineBottom);
    }
}
