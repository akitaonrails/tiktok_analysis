package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0Qcg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674320Qcg {
    public final C20632315oP LIZ;
    public final C19U1 LIZIZ;
    public final InterfaceC674400Qco LIZJ;
    public EnumC674310Qcf LJFF;
    public boolean LJI;
    public boolean LIZLLL = true;
    public int LJ = -1;
    public boolean[] LJII = new boolean[0];
    public final C689740R3s LJIIIIZZ = new C689740R3s(this, 1);
    public final C674340Qci LJIIIZ = new InterfaceC1584740rLE() { // from class: X.0Qci
        @Override // X.InterfaceC1586460rO0
        public final void Yn(C19U0 c19u0) {
        }

        @Override // X.InterfaceC1586460rO0
        public final void ih(C19U0 c19u0) {
        }

        @Override // X.InterfaceC1586460rO0
        public final void Oq(C19U0 c19u0) {
            C674320Qcg c674320Qcg = this.LL;
            if (c674320Qcg.LJFF == null) {
                c674320Qcg.LJFF = EnumC674310Qcf.SWITCH_TAB;
                if (c19u0.LJ != c674320Qcg.LJ) {
                    c674320Qcg.LIZJ(true);
                }
                C674320Qcg c674320Qcg2 = this.LL;
                c674320Qcg2.LIZIZ(c19u0.LJ, c674320Qcg2.LJFF);
            }
        }
    };

    public final void LIZ() {
        AbstractC21673619ry adapter = this.LIZ.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        this.LJ = this.LIZIZ.getSelectedTabPosition();
        boolean[] zArr = new boolean[itemCount];
        for (int i = 0; i < itemCount; i++) {
            zArr[i] = false;
        }
        this.LJII = zArr;
        this.LIZIZ.addOnTabSelectedListener((InterfaceC1584740rLE) this.LJIIIZ);
        this.LIZ.LIZIZ(this.LJIIIIZZ);
    }

    public final void LIZJ(boolean z) {
        ViewGroup viewGroup;
        if (this.LJI != z) {
            this.LJI = z;
            boolean z2 = !z;
            this.LIZIZ.setEnabled(z2);
            View childAt = this.LIZIZ.getChildAt(0);
            if ((childAt instanceof ViewGroup) && (viewGroup = (ViewGroup) childAt) != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt2 = viewGroup.getChildAt(i);
                    if (childAt2 != null) {
                        childAt2.setEnabled(z2);
                        childAt2.setClickable(z2);
                    }
                }
            }
        }
    }

    public final void LIZIZ(int i, EnumC674310Qcf enumC674310Qcf) {
        String reason;
        if (i >= 0 && i < this.LJII.length) {
            boolean[] zArr = this.LJII;
            if (!zArr[i] && enumC674310Qcf != null) {
                zArr[i] = true;
                this.LIZJ.LIZ(i, enumC674310Qcf);
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchMiddlePageExposureHelper handlePageExpose failure, position: ");
        sbLIZ.append(i);
        sbLIZ.append(", reason: ");
        if (enumC674310Qcf != null) {
            reason = enumC674310Qcf.getReason();
        } else {
            reason = null;
        }
        sbLIZ.append(reason);
        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Qci] */
    public C674320Qcg(C20632315oP c20632315oP, C19U1 c19u1, InterfaceC674400Qco interfaceC674400Qco) {
        this.LIZ = c20632315oP;
        this.LIZIZ = c19u1;
        this.LIZJ = interfaceC674400Qco;
    }
}
