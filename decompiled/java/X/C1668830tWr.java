package X;

import Y.AObjectS69S0000000_16;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0tWr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668830tWr {
    public static final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AObjectS69S0000000_16(4));

    public static final long LIZ(Drawable drawable) {
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            return (((long) Float.floatToRawIntBits(drawable.getIntrinsicWidth())) << 32) | (((long) Float.floatToRawIntBits(drawable.getIntrinsicHeight())) & 4294967295L);
        }
        return 9205357640488583168L;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC1676270tir LIZIZ(android.graphics.drawable.Drawable r3, X.InterfaceC1680500tpg r4) {
        /*
            r0 = 859108326(0x3334f3e6, float:4.213134E-8)
            r4.LJJIIJZLJL(r0)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            boolean r0 = r4.LJJIIJ(r3)
            java.lang.Object r2 = r4.LJJ()
            if (r0 != 0) goto L1f
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L26
        L1f:
            if (r3 != 0) goto L2f
            X.0tWs r2 = new X.AbstractC1676270tir() { // from class: X.0tWs
                static {
                    /*
                        X.0tWs r0 = new X.0tWs
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0tWs) X.0tWs.LLILZLL X.0tWs
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1668840tWs.<clinit>():void");
                }

                @Override // X.AbstractC1676270tir
                public final void LJIIIZ(X.InterfaceC1675870tiD r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1668840tWs.LJIIIZ(X.0tiD):void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1668840tWs.<init>():void");
                }

                @Override // X.AbstractC1676270tir
                public final long LJIIIIZZ() {
                    /*
                        r2 = this;
                        r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1668840tWs.LJIIIIZZ():long");
                }
            }
        L23:
            r4.LJJIJIIJI(r2)
        L26:
            X.0tir r2 = (X.AbstractC1676270tir) r2
            r4.LJ()
            r4.LJ()
            return r2
        L2f:
            boolean r0 = r3 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L44
            X.0tjA r2 = new X.0tjA
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            android.graphics.Bitmap r1 = r3.getBitmap()
            X.0uFx r0 = new X.0uFx
            r0.<init>(r1)
            r2.<init>(r0)
            goto L23
        L44:
            boolean r0 = r3 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L58
            X.0tWq r2 = new X.0tWq
            android.graphics.drawable.ColorDrawable r3 = (android.graphics.drawable.ColorDrawable) r3
            int r0 = r3.getColor()
            long r0 = X.C1685850tyJ.LIZIZ(r0)
            r2.<init>(r0)
            goto L23
        L58:
            X.0txY r2 = new X.0txY
            android.graphics.drawable.Drawable r0 = r3.mutate()
            r2.<init>(r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1668830tWr.LIZIZ(android.graphics.drawable.Drawable, X.0tpg):X.0tir");
    }
}
