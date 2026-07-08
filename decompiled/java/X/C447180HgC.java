package X;

import android.graphics.Bitmap;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.slot.IIconSlot;
import java.util.List;

/* JADX INFO: renamed from: X.0HgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447180HgC {
    public final ViewModel LIZ;
    public AnonymousClass0956 LIZIZ;

    public C447180HgC(IIconSlot.SlotViewModel slotViewModel) {
        this.LIZ = slotViewModel;
    }

    public static Object LIZJ(C0HTW c0htw, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        ((AbstractC1321260kUG) C1322200kVm.LIZ().LJI(c0htw.LJ.LIZ(), null)).LIZJ(new AbstractC447090Hg3() { // from class: X.0HgA
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                InterfaceC20236714Gf<Bitmap> interfaceC20236714Gf = c2252611DEt;
                C098200Yq c098200Yq = new C098200Yq(new Exception("fail get bitmap"));
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC20236714Gf.resumeWith(c098200Yq);
            }

            @Override // X.AbstractC447090Hg3
            public final void LJI(Bitmap bitmap) {
                if (bitmap != null) {
                    InterfaceC20236714Gf<Bitmap> interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(bitmap);
                    interfaceC20236714Gf.resumeWith(bitmap);
                } else {
                    InterfaceC20236714Gf<Bitmap> interfaceC20236714Gf2 = c2252611DEt;
                    C098200Yq c098200Yq = new C098200Yq(new Exception("bitmap error"));
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf2.resumeWith(c098200Yq);
                }
            }
        }, C823050WQl.LIZJ());
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final void LIZIZ(List<? extends C0HTW> list, InterfaceC447210HgF interfaceC447210HgF) {
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this.LIZ);
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZIZ = C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C447190HgD(this, list, interfaceC447210HgF, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<? extends X.C0HTW> r9, X.InterfaceC497601wk r10, X.InterfaceC1364105Vn<? super java.util.List<android.graphics.Bitmap>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C447200HgE
            if (r0 == 0) goto L6e
            r7 = r11
            X.0HgE r7 = (X.C447200HgE) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            if (r0 == 0) goto L3e
            if (r0 != r5) goto L75
            X.C155000ia.LIZIZ(r1)
        L22:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r1.next()
            if (r0 != 0) goto L3a
            return r2
        L3a:
            r2.add(r0)
            goto L2d
        L3e:
            X.C155000ia.LIZIZ(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r9.iterator()
        L4a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r3.next()
            X.0HTW r0 = (X.C0HTW) r0
            X.0HgB r2 = new X.0HgB
            r1 = 0
            r2.<init>(r8, r0, r1)
            r0 = 3
            X.099G r0 = X.C23250099c.LIZIZ(r10, r1, r1, r2, r0)
            r4.add(r0)
            goto L4a
        L65:
            r7.LLILLL = r5
            java.lang.Object r1 = X.C1D9F.LIZ(r4, r7)
            if (r1 != r6) goto L22
            return r6
        L6e:
            X.0HgE r7 = new X.0HgE
            r7.<init>(r8, r11)
            goto L12
        L74:
            return r2
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447180HgC.LIZ(java.util.List, X.01wk, X.05Vn):java.lang.Object");
    }
}
