package Y;

import X.C09JN;
import X.C1085270eLd;
import X.C1091220eVE;
import X.C1091240eVG;
import X.C1C7U;
import X.C201600q6;
import android.graphics.Bitmap;
import android.view.View;

/* JADX INFO: loaded from: classes18.dex */
public class AfS4S0211000_17 implements C09JN {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS4S0211000_17 afS4S0211000_17, Object obj) {
        C1C7U.LIZ("LiveBroadcastBillboardHelper@8377.requestUpdateAndRefresh$2");
        ((C1085270eLd) afS4S0211000_17.l0).LJIIJ = false;
        if (afS4S0211000_17.z2) {
            ((C1085270eLd) afS4S0211000_17.l0).LJFF((C201600q6) afS4S0211000_17.l1, afS4S0211000_17.i3);
        }
        C1085270eLd c1085270eLd = (C1085270eLd) afS4S0211000_17.l0;
        C201600q6 c201600q6 = c1085270eLd.LJIIJJI;
        c1085270eLd.LJIIJJI = null;
        if (c201600q6 != null) {
            c1085270eLd.LJII(c201600q6, true, 1);
        }
        C1C7U.LIZIZ("LiveBroadcastBillboardHelper@8377.requestUpdateAndRefresh$2");
    }

    public static final void accept$1(AfS4S0211000_17 afS4S0211000_17, Object obj) {
        C1C7U.LIZ("LiveBroadcastBillboardHelper@8377.requestUpdateAndRefresh$3");
        C1085270eLd c1085270eLd = (C1085270eLd) afS4S0211000_17.l0;
        c1085270eLd.LJIIJ = false;
        int i = afS4S0211000_17.i3;
        if (i > 0) {
            ((C1085270eLd) afS4S0211000_17.l0).LJII((C201600q6) afS4S0211000_17.l1, afS4S0211000_17.z2, i - 1);
        } else {
            C201600q6 c201600q6 = c1085270eLd.LJIIJJI;
            c1085270eLd.LJIIJJI = null;
            if (c201600q6 != null) {
                c1085270eLd.LJII(c201600q6, true, 1);
            }
        }
        C1C7U.LIZIZ("LiveBroadcastBillboardHelper@8377.requestUpdateAndRefresh$3");
    }

    public static final void accept$2(AfS4S0211000_17 afS4S0211000_17, Object obj) {
        C1C7U.LIZ("NinePatchUtil@39c.loadNinePatchDrawable$5");
        C1091240eVG c1091240eVG = C1091220eVE.LIZ;
        C1091220eVE.LIZ((Bitmap) obj, (View) afS4S0211000_17.l0, afS4S0211000_17.z2, afS4S0211000_17.i3, (Runnable) afS4S0211000_17.l1);
        C1C7U.LIZIZ("NinePatchUtil@39c.loadNinePatchDrawable$5");
    }

    public static final void accept$3(AfS4S0211000_17 afS4S0211000_17, Object obj) {
        C1C7U.LIZ("NinePatchUtil@39c.loadNinePatchFromAsset$2");
        C1091240eVG c1091240eVG = C1091220eVE.LIZ;
        C1091220eVE.LIZ((Bitmap) obj, (View) afS4S0211000_17.l0, afS4S0211000_17.z2, afS4S0211000_17.i3, (Runnable) afS4S0211000_17.l1);
        C1C7U.LIZIZ("NinePatchUtil@39c.loadNinePatchFromAsset$2");
    }

    public AfS4S0211000_17(View view, boolean z, Runnable runnable, int i) {
        this.$t = i;
        this.l0 = view;
        this.z2 = z;
        this.i3 = 0;
        this.l1 = runnable;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS4S0211000_17(int r2, X.C201600q6 r3, X.C1085270eLd r4, boolean r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.i3 = r2
            r0.l0 = r4
            r0.l1 = r3
            r0.z2 = r5
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.i3 = r2
            r0.z2 = r5
            r0.l0 = r4
            r0.l1 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS4S0211000_17.<init>(int, X.00q6, X.0eLd, boolean, int):void");
    }

    public AfS4S0211000_17(View view, boolean z, int i, Runnable runnable, int i2) {
        this.$t = i2;
        this.l0 = view;
        this.z2 = z;
        this.i3 = i;
        this.l1 = runnable;
    }
}
