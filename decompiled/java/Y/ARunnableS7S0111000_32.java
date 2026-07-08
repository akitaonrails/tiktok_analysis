package Y;

import X.C1C7U;
import X.C212363188r;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS7S0111000_32 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (((r0 != null ? r0.getLayoutManager() : null) instanceof androidx.recyclerview.widget.LinearLayoutManager) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            r4 = this;
            java.lang.Object r2 = r4.l0
            X.188r r2 = (X.C212363188r) r2
            int r1 = r2.LLIZ
            r0 = -1
            if (r1 == r0) goto L73
            X.15jv r0 = r2.getSpecList()
            r2 = 0
            if (r0 == 0) goto L71
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
        L14:
            boolean r0 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 != 0) goto L2a
            java.lang.Object r0 = r4.l0
            X.188r r0 = (X.C212363188r) r0
            X.15jv r0 = r0.getSpecList()
            if (r0 == 0) goto L6f
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
        L26:
            boolean r0 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L73
        L2a:
            java.lang.Object r0 = r4.l0
            X.188r r0 = (X.C212363188r) r0
            X.15jv r0 = r0.getSpecList()
            if (r0 == 0) goto L6d
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r0.getLayoutManager()
        L38:
            boolean r0 = r3 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 == 0) goto L4b
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            if (r3 == 0) goto L4b
            java.lang.Object r0 = r4.l0
            X.188r r0 = (X.C212363188r) r0
            int r1 = r0.LLIZ
            int r0 = r0.LLIZLLLIL
            r3.scrollToPositionWithOffset(r1, r0)
        L4b:
            java.lang.Object r0 = r4.l0
            X.188r r0 = (X.C212363188r) r0
            X.15jv r0 = r0.getSpecList()
            if (r0 == 0) goto L59
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r0.getLayoutManager()
        L59:
            boolean r0 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L6c
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            if (r2 == 0) goto L6c
            java.lang.Object r0 = r4.l0
            X.188r r0 = (X.C212363188r) r0
            int r1 = r0.LLIZ
            int r0 = r0.LLIZLLLIL
            r2.scrollToPositionWithOffset(r1, r0)
        L6c:
            return
        L6d:
            r3 = r2
            goto L38
        L6f:
            r0 = r2
            goto L26
        L71:
            r0 = r2
            goto L14
        L73:
            boolean r0 = r4.z1
            if (r0 != 0) goto L87
            java.lang.Object r0 = r4.l0
            X.188r r0 = (X.C212363188r) r0
            X.15jv r1 = r0.getSpecList()
            if (r1 == 0) goto L6c
            int r0 = r4.i2
            r1.scrollToPosition(r0)
            return
        L87:
            java.lang.Object r0 = r4.l0
            X.188r r0 = (X.C212363188r) r0
            r0.h0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS7S0111000_32.LIZ$0():void");
    }

    public final void LIZ$1() {
        C212363188r c212363188r = (C212363188r) this.l0;
        if (c212363188r.LLILZ == this.i2) {
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv specList = c212363188r.getSpecList();
        if (specList != null) {
            HandlerHook.viewPost(specList, new ARunnableS7S0111000_32(this.i2, (C212363188r) this.l0, this.z1, 0));
        }
        ViewOnAttachStateChangeListenerC20604515jv specList2 = ((C212363188r) this.l0).getSpecList();
        if (specList2 != null) {
            HandlerHook.viewPost(specList2, new ARunnableS132S0100000_32((C212363188r) this.l0, 97));
        }
        C212363188r c212363188r2 = (C212363188r) this.l0;
        c212363188r2.LLILZ = c212363188r2.LLILLL;
    }

    public static final void run$0(ARunnableS7S0111000_32 aRunnableS7S0111000_32) {
        boolean zLIZ;
        C1C7U.LIZ("SkuItemView@efbb.select$1$1$1");
        try {
            aRunnableS7S0111000_32.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SkuItemView@efbb.select$1$1$1");
    }

    public static final void run$1(ARunnableS7S0111000_32 aRunnableS7S0111000_32) {
        boolean zLIZ;
        C1C7U.LIZ("SkuItemView@efbb.select$1$1");
        try {
            aRunnableS7S0111000_32.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SkuItemView@efbb.select$1$1");
    }

    public ARunnableS7S0111000_32(int i, C212363188r c212363188r, int i2) {
        this.$t = i2;
        this.l0 = c212363188r;
        this.i2 = i;
        this.z1 = false;
    }

    public ARunnableS7S0111000_32(int i, C212363188r c212363188r, boolean z, int i2) {
        this.$t = i2;
        this.l0 = c212363188r;
        this.z1 = z;
        this.i2 = i;
    }
}
