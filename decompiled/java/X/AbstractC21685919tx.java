package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.layout.core.PowerLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19tx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21685919tx extends AbstractC21686119tz {
    public int LJI;
    public C21687319uB LJIIIIZZ;
    public int LJIIIZ;
    public final Rect LJII = new Rect();
    public final float LJIIJ = Float.NaN;

    @Override // X.AbstractC21686119tz
    public boolean LJIIL() {
        return this instanceof AbstractC21688019uI;
    }

    public abstract void LJIJI(C21673319rv c21673319rv, C21673919s1 c21673919s1, C21686319u1 c21686319u1, C21687819uG c21687819uG, InterfaceC21686919u7 interfaceC21686919u7);

    public void LJIL(InterfaceC21686919u7 interfaceC21686919u7) {
    }

    @Override // X.AbstractC21686119tz
    public final int LJI() {
        return this.LJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21686119tz
    public final void LJ(InterfaceC21686919u7 interfaceC21686919u7) {
        C21687319uB c21687319uB = this.LJIIIIZZ;
        if (c21687319uB != null) {
            ((RecyclerView.LayoutManager) interfaceC21686919u7).removeView(c21687319uB);
            this.LJIIIIZZ = null;
        }
        LJIL(interfaceC21686919u7);
    }

    @Override // X.AbstractC21686119tz
    public final void LJIILL(int i) {
        this.LJI = i;
    }

    public static void LJIJJ(C21687819uG c21687819uG, View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        boolean z = true;
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            c21687819uG.LIZJ = true;
        }
        if (!c21687819uG.LIZLLL && !view.isFocusable()) {
            z = false;
        }
        c21687819uG.LIZLLL = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21686119tz
    public void LJIILJJIL(C21673319rv c21673319rv, C21673919s1 c21673919s1, InterfaceC21686919u7 interfaceC21686919u7) {
        C21687319uB c21687319uB;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareLayout() on ");
        sbLIZ.append(getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LJIIIZ == 0 && (c21687319uB = this.LJIIIIZZ) != null) {
            ((RecyclerView.LayoutManager) interfaceC21686919u7).removeView(c21687319uB);
            this.LJIIIIZZ = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIJ(X.InterfaceC21686919u7 r4, boolean r5, boolean r6) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.bytedance.ies.powerlist.layout.core.PowerLayoutManager
            if (r0 == 0) goto L2f
            com.bytedance.ies.powerlist.layout.core.PowerLayoutManager r4 = (com.bytedance.ies.powerlist.layout.core.PowerLayoutManager) r4
            X.19uC r0 = r4.LLJJI
            X.19uA r0 = (X.C21687219uA) r0
            java.util.List<X.19tz> r2 = r0.LIZIZ
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            int r1 = r2.indexOf(r3)
            r0 = -1
            if (r1 == r0) goto L2f
            if (r6 == 0) goto L34
            int r1 = r1 + (-1)
        L19:
            if (r1 < 0) goto L2f
            int r0 = r2.size()
            if (r1 >= r0) goto L2f
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r1)
            X.19tz r1 = (X.AbstractC21686119tz) r1
            if (r1 == 0) goto L2f
            boolean r0 = r1.LJIIL()
            if (r0 == 0) goto L30
        L2f:
            r1 = 0
        L30:
            r0 = 0
            if (r1 != r3) goto L37
            return r0
        L34:
            int r1 = r1 + 1
            goto L19
        L37:
            if (r5 == 0) goto L3c
            int r0 = r3.LIZLLL
            return r0
        L3c:
            int r0 = r3.LIZIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21685919tx.LJIJ(X.19u7, boolean, boolean):int");
    }

    @Override // X.AbstractC21686119tz
    public final void LJIILIIL(C21673319rv c21673319rv, C21673919s1 c21673919s1, C21686319u1 c21686319u1, C21687819uG c21687819uG, InterfaceC21686919u7 interfaceC21686919u7) {
        LJIJI(c21673319rv, c21673919s1, c21686319u1, c21687819uG, interfaceC21686919u7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21686119tz
    public void LJFF(C21673319rv c21673319rv, C21673919s1 c21673919s1, int i, int i2, int i3, InterfaceC21686919u7 interfaceC21686919u7) throws Throwable {
        boolean z;
        boolean zIntersects;
        C21687319uB c21687319uB;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finalizeLayout() on ");
        sbLIZ.append(getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LJIIIZ == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C21687319uB c21687319uB2 = this.LJIIIIZZ;
            if (c21687319uB2 != null) {
                ((RecyclerView.LayoutManager) interfaceC21686919u7).removeView(c21687319uB2);
                this.LJIIIIZZ = null;
                return;
            }
            return;
        }
        if (i3 != Integer.MAX_VALUE && i3 != Integer.MIN_VALUE && (c21687319uB = this.LJIIIIZZ) != null) {
            this.LJII.union(c21687319uB.getLeft(), getTop(), getRight(), getBottom());
        }
        if (!this.LJII.isEmpty() && i3 != Integer.MAX_VALUE && i3 != Integer.MIN_VALUE) {
            if (interfaceC21686919u7.getOrientation() == 1) {
                this.LJII.offset(0, -i3);
            } else {
                this.LJII.offset(-i3, 0);
            }
        }
        PowerLayoutManager powerLayoutManager = (PowerLayoutManager) interfaceC21686919u7;
        int iLJIJ = powerLayoutManager.LJIJ();
        int iLJIIZILJ = powerLayoutManager.LJIIZILJ();
        if (powerLayoutManager.getOrientation() == 1) {
            zIntersects = this.LJII.intersects(0, (-iLJIIZILJ) / 4, iLJIJ, iLJIIZILJ + (iLJIIZILJ / 4));
        } else {
            zIntersects = this.LJII.intersects((-iLJIJ) / 4, 0, iLJIJ + (iLJIJ / 4), iLJIIZILJ);
        }
        if (zIntersects) {
            if (this.LJIIIIZZ == null) {
                View viewLJIILLIIL = powerLayoutManager.LJIILLIIL();
                this.LJIIIIZZ = (C21687319uB) viewLJIILLIIL;
                powerLayoutManager.showView(viewLJIILLIIL);
                powerLayoutManager.addView(viewLJIILLIIL, 0);
                C21685619tu c21685619tu = powerLayoutManager.LLIZ;
                c21685619tu.getClass();
                try {
                    c21685619tu.LIZ();
                    if (!c21685619tu.LJFF.contains(viewLJIILLIIL)) {
                        Object[] objArr = c21685619tu.LJII;
                        objArr[0] = viewLJIILLIIL;
                        C2204961BRm.a0(c21685619tu.LIZIZ, c21685619tu.LIZ, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtWRf5Sn8defrWuQXD+mhYCWsgzO2RCbsZl919sqD4Ru3tVkh", null));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (interfaceC21686919u7.getOrientation() == 1) {
                this.LJII.left = interfaceC21686919u7.getPaddingLeft();
                this.LJII.right = ((PowerLayoutManager) interfaceC21686919u7).LJIJ() - interfaceC21686919u7.getPaddingRight();
            } else {
                this.LJII.top = interfaceC21686919u7.getPaddingTop();
                this.LJII.bottom = ((PowerLayoutManager) interfaceC21686919u7).LJIIZILJ() - interfaceC21686919u7.getPaddingBottom();
            }
            C21687319uB c21687319uB3 = this.LJIIIIZZ;
            c21687319uB3.measure(View.MeasureSpec.makeMeasureSpec(this.LJII.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.LJII.height(), 1073741824));
            Rect rect = this.LJII;
            c21687319uB3.layout(rect.left, rect.top, rect.right, rect.bottom);
            c21687319uB3.setBackgroundColor(this.LJIIIZ);
            this.LJII.setEmpty();
            return;
        }
        C21687319uB c21687319uB4 = this.LJIIIIZZ;
        if (c21687319uB4 != null) {
            powerLayoutManager.removeView(c21687319uB4);
            this.LJIIIIZZ = null;
        }
        this.LJII.setEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIJJLI(View view, int i, int i2, int i3, int i4, InterfaceC21686919u7 interfaceC21686919u7) {
        RecyclerView.LayoutManager layoutManager = (RecyclerView.LayoutManager) interfaceC21686919u7;
        layoutManager.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        layoutManager.layoutDecorated(view, i + marginLayoutParams.leftMargin, i2 + marginLayoutParams.topMargin, i3 - marginLayoutParams.rightMargin, i4 - marginLayoutParams.bottomMargin);
        if (this.LJIIIZ != 0) {
            this.LJII.union(i - this.LIZIZ, i2 - this.LIZLLL, i3 + this.LIZJ, i4 + this.LJ);
        }
    }
}
