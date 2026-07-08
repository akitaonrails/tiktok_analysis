package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0yV6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859940yV6 implements InterfaceC2248331CzH {
    public final /* synthetic */ RunnableC1843540y4e LIZ;
    public final /* synthetic */ RecyclerView LIZIZ;
    public final /* synthetic */ InterfaceC1860040yVG LIZJ;

    public C1859940yV6(RunnableC1843540y4e runnableC1843540y4e, RecyclerView recyclerView, InterfaceC1860040yVG interfaceC1860040yVG) {
        this.LIZ = runnableC1843540y4e;
        this.LIZIZ = recyclerView;
        this.LIZJ = interfaceC1860040yVG;
    }

    @Override // X.InterfaceC2248331CzH
    public final void LIZ(int i, int i2, int i3, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        View viewLIZIZ;
        if (this.LIZ == null) {
            return;
        }
        if (i2 > i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        RecyclerView recyclerView = this.LIZIZ;
        int[] iArr = C1859930yV5.LIZIZ;
        recyclerView.getLocationInWindow(iArr);
        if (!z) {
            this.LIZ.LIZJ();
            return;
        }
        View viewLJJZZI = this.LIZJ.LJJZZI();
        int[] iArr2 = C1859930yV5.LIZ;
        viewLJJZZI.getLocationOnScreen(iArr2);
        int i4 = iArr2[1];
        int i5 = iArr[1];
        if (i4 - i5 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (((i5 + this.LIZIZ.getHeight()) - iArr2[1]) - this.LIZJ.LJJZZI().getHeight() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && z4) {
            RunnableC1843540y4e runnableC1843540y4e = this.LIZ;
            if (runnableC1843540y4e.LLILLJJLI) {
                runnableC1843540y4e.LIZJ();
                return;
            }
            return;
        }
        if (!z2 && i2 - iArr[1] >= 200) {
            this.LIZ.LIZJ();
            return;
        }
        int height = this.LIZIZ.getHeight();
        if (z2 && (iArr[1] + height) - i2 >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120))) {
            this.LIZ.LIZJ();
            return;
        }
        int height2 = iArr2[1] + this.LIZJ.LJJZZI().getHeight();
        if (z2) {
            RunnableC1843540y4e runnableC1843540y4e2 = this.LIZ;
            if (runnableC1843540y4e2.LLILLJJLI && runnableC1843540y4e2.LLILZ) {
                int i6 = iArr[1];
                if (height2 < height + i6 && i6 <= height2) {
                    runnableC1843540y4e2.LIZJ();
                    return;
                }
            }
        } else {
            RunnableC1843540y4e runnableC1843540y4e3 = this.LIZ;
            if (runnableC1843540y4e3.LLILLJJLI && !runnableC1843540y4e3.LLILZ && z3) {
                runnableC1843540y4e3.LIZJ();
                return;
            }
        }
        if (i2 == i3 && this.LIZ.LLILLJJLI) {
            return;
        }
        if (z2) {
            RunnableC1843540y4e runnableC1843540y4e4 = this.LIZ;
            if ((!runnableC1843540y4e4.LLILZ || !runnableC1843540y4e4.LLILLJJLI) && (viewLIZIZ = C1859930yV5.LIZIZ(this.LIZJ.LJJZZI())) != null) {
                RecyclerView recyclerView2 = this.LIZIZ;
                RunnableC1843540y4e runnableC1843540y4e5 = this.LIZ;
                InterfaceC1860040yVG interfaceC1860040yVG = this.LIZJ;
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                viewLIZIZ.getLocationOnScreen(iArr3);
                recyclerView2.getLocationOnScreen(iArr4);
                int height3 = (iArr4[1] + recyclerView2.getHeight()) - (iArr3[1] + viewLIZIZ.getHeight());
                if (height3 < 0) {
                    runnableC1843540y4e5.LIZIZ(height3, true, new AwS571S0100000_27(interfaceC1860040yVG, 1100));
                    return;
                } else {
                    runnableC1843540y4e5.LIZJ();
                    return;
                }
            }
            return;
        }
        RunnableC1843540y4e runnableC1843540y4e6 = this.LIZ;
        if (!runnableC1843540y4e6.LLILZ && runnableC1843540y4e6.LLILLJJLI) {
            return;
        }
        if (!z3) {
            if (C1859930yV5.LIZIZ(this.LIZJ.LJJZZI()) == null) {
                return;
            }
            this.LIZ.LIZIZ(iArr2[1], false, new AwS571S0100000_27(this.LIZJ, 1101));
            return;
        }
        runnableC1843540y4e6.LIZJ();
    }
}
