package X;

import Y.ARunnableS100S0200000_31;
import Y.AsS56S0100000_31;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.Map;

/* JADX INFO: renamed from: X.15xx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20691515xx extends C21674119s3 {
    public final C20691715xz LJIILL;
    public final Map<String, String> LJIILLIIL;
    public final boolean LJIIZILJ;
    public View LJIJ;
    public final int LJIJI;
    public View LJIJJ;
    public Integer LJIJJLI;
    public long LJIL;
    public int LJJ;

    @Override // X.C21674119s3, X.AbstractC21674019s2
    public final void LJFF() {
        C03O0 c03o0 = C03O0.LIZ;
        float fCurrentTimeMillis = this.LJIL > 0 ? System.currentTimeMillis() - this.LJIL : -1.0f;
        int i = this.LJJ;
        c03o0.getClass();
        C03O0.LJLJLLL(fCurrentTimeMillis, "OrderSubmitJumpLogisticsSmoothScroller", i);
        this.LJIL = -1L;
        this.LJJ = 0;
        Integer num = this.LJIJJLI;
        if (num == null || num.intValue() != 0) {
            this.LJIILL.addOnScrollListener(new AsS56S0100000_31(this, 15));
            return;
        }
        View view = this.LJIJJ;
        if (view != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS100S0200000_31(view, this, 79), 300L);
        }
    }

    @Override // X.C21674119s3, X.AbstractC21674019s2
    public final void LJ() {
        this.LJIL = System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    @Override // X.C21674119s3, X.AbstractC21674019s2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(android.view.View r9, X.C21673919s1 r10, X.C21675319sF r11) {
        /*
            r8 = this;
            r8.LJIJ = r9
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r8.LIZJ
            if (r5 != 0) goto L7
            return
        L7:
            X.19sx r6 = new X.19sx
            r6.<init>(r5)
            android.view.View r1 = r8.LJIJ
            r4 = 0
            if (r1 == 0) goto L9f
            r0 = 2131381002(0x7f0a4b0a, float:1.8382309E38)
            android.view.View r1 = r1.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L9f
            int r0 = r8.LJIJI
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.findViewHolderForAdapterPosition(r0)
            if (r0 == 0) goto L9f
            android.view.View r7 = r0.itemView
            if (r7 == 0) goto L9f
            boolean r0 = r8.LJIIZILJ
            if (r0 == 0) goto L9b
            r0 = 2131383667(0x7f0a5573, float:1.8387714E38)
        L2f:
            android.view.View r0 = r7.findViewById(r0)
            if (r0 == 0) goto L9f
            r8.LJIJJ = r0
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.getLayoutManager()
            X.19sx r1 = new X.19sx
            r1.<init>(r0)
            android.view.View r0 = r8.LJIJ
            int r3 = r6.LJ(r0)
            int r2 = r1.LJ(r7)
            int r1 = r7.getHeight()
            android.view.View r0 = r8.LJIJJ
            if (r0 == 0) goto L9f
            int r0 = r0.getHeight()
            int r3 = r3 + r2
            int r3 = r3 + r1
            int r0 = r0 / 2
            int r3 = r3 - r0
            boolean r0 = r5.getClipToPadding()
            if (r0 == 0) goto L94
            int r1 = r6.LJIIJ()
            int r0 = r6.LJIIJJI()
            int r0 = r0 / 2
            int r1 = r1 + r0
        L6c:
            int r3 = r3 - r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r8.LJIJJLI = r0
            int r6 = r0.intValue()
        L77:
            r8.LJJ = r6
            android.view.animation.PathInterpolator r3 = new android.view.animation.PathInterpolator
            r2 = 1058306785(0x3f147ae1, float:0.58)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            int r1 = r8.LJIIL(r6)
            if (r1 <= 0) goto L93
            boolean r0 = r5.canScrollVertically()
            if (r0 == 0) goto L93
            r11.LIZIZ(r4, r6, r3, r1)
        L93:
            return
        L94:
            int r0 = r6.LJFF()
            int r1 = r0 / 2
            goto L6c
        L9b:
            r0 = 2131383666(0x7f0a5572, float:1.8387712E38)
            goto L2f
        L9f:
            r6 = 0
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20691515xx.LJI(android.view.View, X.19s1, X.19sF):void");
    }

    public C20691515xx(Context context, C20691715xz c20691715xz, Map<String, String> map, boolean z) {
        int iIntValue;
        Integer numLJIIJJI;
        super(context);
        this.LJIILL = c20691715xz;
        this.LJIILLIIL = map;
        this.LJIIZILJ = z;
        String str = map.get("order_index");
        if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        this.LJIJI = iIntValue;
        this.LJIL = -1L;
        this.LJJ = -1;
    }
}
