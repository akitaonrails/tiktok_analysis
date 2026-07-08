package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;

/* JADX INFO: renamed from: X.0Pji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C653200Pji implements InterfaceC653170Pjf {
    public final RecyclerView LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    @Override // X.InterfaceC653170Pjf
    public boolean LIZIZ() {
        RecyclerView recyclerView;
        AbstractC21673619ry adapter = this.LIZ.getAdapter();
        if (adapter == null) {
            return false;
        }
        Integer numValueOf = Integer.valueOf(adapter.getItemCount());
        if (numValueOf.intValue() <= 1) {
            return false;
        }
        numValueOf.intValue();
        RecyclerView recyclerView2 = this.LIZ;
        return ((recyclerView2 == null || recyclerView2.canScrollHorizontally(this.LIZJ)) && ((recyclerView = this.LIZ) == null || recyclerView.canScrollHorizontally(this.LIZIZ))) ? false : true;
    }

    public C653200Pji(RecyclerView recyclerView) {
        int i;
        this.LIZ = recyclerView;
        if (C426750GoL.LIZLLL(recyclerView.getContext())) {
            i = -1;
        } else {
            i = 1;
        }
        this.LIZIZ = i;
        this.LIZJ = C426750GoL.LIZLLL(recyclerView.getContext()) ? 1 : -1;
    }

    @Override // X.InterfaceC653170Pjf
    public final InterfaceC652740Piy LIZ(Collection<? extends InterfaceC652740Piy> collection) {
        AbstractC21673619ry adapter = this.LIZ.getAdapter();
        if (adapter != null) {
            Integer numValueOf = Integer.valueOf(adapter.getItemCount());
            if (numValueOf.intValue() > 1) {
                InterfaceC652740Piy interfaceC652740Piy = null;
                if (1 != 0) {
                    int iIntValue = numValueOf.intValue() - 1;
                    RecyclerView recyclerView = this.LIZ;
                    if (recyclerView != null && !recyclerView.canScrollHorizontally(this.LIZJ)) {
                        for (InterfaceC652740Piy interfaceC652740Piy2 : collection) {
                            if (interfaceC652740Piy2.getPosition() == 0) {
                                interfaceC652740Piy = interfaceC652740Piy2;
                            }
                        }
                    }
                    RecyclerView recyclerView2 = this.LIZ;
                    if (recyclerView2 != null && !recyclerView2.canScrollHorizontally(this.LIZIZ) && interfaceC652740Piy == null) {
                        for (InterfaceC652740Piy interfaceC652740Piy3 : collection) {
                            if (interfaceC652740Piy3.getPosition() == iIntValue) {
                                interfaceC652740Piy = interfaceC652740Piy3;
                            }
                        }
                    }
                    return interfaceC652740Piy;
                }
            }
        }
        throw new IllegalStateException("Cannot find edges when itemCount is less than 2");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    @Override // X.InterfaceC653170Pjf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC653010PjP LIZJ(java.util.Collection<? extends X.AbstractC653010PjP> r8) {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r7.LIZ
            X.19ry r0 = r0.getAdapter()
            if (r0 == 0) goto L92
            int r0 = r0.getItemCount()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r1 = r2.intValue()
            r0 = 1
            if (r1 <= r0) goto L92
            r6 = 0
            if (r0 == 0) goto L92
            int r5 = r2.intValue()
            int r5 = r5 - r0
            androidx.recyclerview.widget.RecyclerView r1 = r7.LIZ
            if (r1 == 0) goto L53
            int r0 = r7.LIZJ
            boolean r0 = r1.canScrollHorizontally(r0)
            if (r0 != 0) goto L53
            r0 = 1
        L2c:
            r4 = 32
            if (r0 == 0) goto L55
            java.util.Iterator r2 = r8.iterator()
            r3 = r6
        L35:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r1 = r2.next()
            X.0PjP r1 = (X.AbstractC653010PjP) r1
            int r0 = r1.LIZIZ()
            if (r0 != 0) goto L49
            r3 = r1
            goto L35
        L49:
            int r0 = r1.LIZ
            if (r0 == r4) goto L35
            r1.LIZ = r4
            r1.LIZLLL()
            goto L35
        L53:
            r0 = 0
            goto L2c
        L55:
            r3 = r6
        L56:
            androidx.recyclerview.widget.RecyclerView r1 = r7.LIZ
            if (r1 == 0) goto L86
            int r0 = r7.LIZIZ
            boolean r0 = r1.canScrollHorizontally(r0)
            if (r0 != 0) goto L86
            if (r3 != 0) goto L88
            java.util.Iterator r2 = r8.iterator()
        L68:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r1 = r2.next()
            X.0PjP r1 = (X.AbstractC653010PjP) r1
            int r0 = r1.LIZIZ()
            if (r0 != r5) goto L7c
            r3 = r1
            goto L68
        L7c:
            int r0 = r1.LIZ
            if (r0 == r4) goto L68
            r1.LIZ = r4
            r1.LIZLLL()
            goto L68
        L86:
            if (r3 == 0) goto L91
        L88:
            int r1 = r3.LIZ
            r0 = 16
            if (r1 == r0) goto L91
            r3.LIZ = r0
            return r3
        L91:
            return r6
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot find edges when itemCount is less than 2"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C653200Pji.LIZJ(java.util.Collection):X.0PjP");
    }
}
