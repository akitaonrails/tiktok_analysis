package X;

import android.graphics.Paint;
import android.graphics.Rect;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.19Qr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21537919Qr implements InterfaceC1080590eE5 {
    public int[] LL;
    public float[] LLILLJJLI;
    public InterfaceC21538219Qu LLILZLL;
    public final Paint LLILLL = new Paint(1);
    public int LLILZ = 0;
    public final Rect LLILZIL = new Rect();
    public int LLIZ = 255;

    @Override // X.InterfaceC1080590eE5
    public final int[] getGradientColors() {
        throw null;
    }

    @Override // X.InterfaceC1080590eE5
    public final float[] getGradientPositions() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r13 = this;
            android.graphics.Rect r0 = r13.LLILZIL
            int r0 = r0.width()
            if (r0 <= 0) goto L63
            android.graphics.Rect r0 = r13.LLILZIL
            int r0 = r0.height()
            if (r0 <= 0) goto L63
            X.19Qu r0 = r13.LLILZLL
            r12 = 1
            r7 = 0
            if (r0 == 0) goto Laa
            boolean r0 = r0.LIZIZ()
            if (r0 == 0) goto Laa
            r11 = 1
        L1d:
            int r10 = r13.LLILZ
            r9 = 13
            r8 = 11
            r2 = 9
            r1 = 7
            r0 = 3
            r6 = 8
            r5 = 10
            r4 = 6
            r3 = 2
            if (r11 == 0) goto L92
            if (r10 == r12) goto La8
            if (r10 == r0) goto L3d
            if (r10 == r1) goto La3
            if (r10 == r2) goto L9e
            if (r10 == r8) goto La6
            if (r10 != r9) goto La1
        L3b:
            r7 = 8
        L3d:
            android.graphics.Rect r0 = r13.LLILZIL
            int r2 = r0.width()
            android.graphics.Rect r0 = r13.LLILZIL
            int r1 = r0.height()
            int[] r0 = r13.LL
            if (r0 == 0) goto Lad
            if (r7 != 0) goto L64
            float r4 = (float) r2
            r2 = 0
            r3 = 0
            r5 = 0
        L53:
            android.graphics.Paint r0 = r13.LLILLL
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            int[] r6 = r13.LL
            float[] r7 = r13.LLILLJJLI
            android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.CLAMP
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.setShader(r1)
        L63:
            return
        L64:
            if (r7 != r3) goto L6b
            float r2 = (float) r2
            r3 = 0
            r4 = 0
        L69:
            r5 = 0
            goto L53
        L6b:
            r0 = 4
            if (r7 != r0) goto L73
            float r5 = (float) r1
            r2 = 0
            r3 = 0
        L71:
            r4 = 0
            goto L53
        L73:
            r0 = 5
            if (r7 != r0) goto L7a
            float r3 = (float) r1
            r2 = 0
            r4 = 0
            goto L69
        L7a:
            if (r7 != r4) goto L81
            float r4 = (float) r2
            float r5 = (float) r1
            r2 = 0
            r3 = 0
            goto L53
        L81:
            if (r7 != r6) goto L88
            float r3 = (float) r1
            float r4 = (float) r2
            r2 = 0
            r5 = 0
            goto L53
        L88:
            if (r7 != r5) goto L8e
            float r2 = (float) r2
            float r5 = (float) r1
            r3 = 0
            goto L71
        L8e:
            float r2 = (float) r2
            float r3 = (float) r1
            r4 = 0
            goto L69
        L92:
            if (r10 == r12) goto L3d
            if (r10 == r0) goto La8
            if (r10 == r1) goto La6
            if (r10 == r2) goto L3b
            if (r10 == r8) goto La3
            if (r10 != r9) goto La1
        L9e:
            r7 = 12
            goto L3d
        La1:
            r7 = r10
            goto L3d
        La3:
            r7 = 10
            goto L3d
        La6:
            r7 = 6
            goto L3d
        La8:
            r7 = 2
            goto L3d
        Laa:
            r11 = 0
            goto L1d
        Lad:
            android.graphics.Paint r1 = r13.LLILLL
            r0 = 0
            r1.setShader(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21537919Qr.LIZ():void");
    }

    @Override // X.InterfaceC1080590eE5
    public final void LJLILLLLZI(float[] fArr, int[] iArr) {
        if (iArr != null && fArr != null && iArr.length != fArr.length) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Gradient colors and positions should be of the same length, colors' length is ");
            sbLIZ.append(iArr.length);
            sbLIZ.append(", positions' length is ");
            sbLIZ.append(fArr.length);
            sbLIZ.append(e3.d);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LL = iArr;
        this.LLILLJJLI = fArr;
        LIZ();
        InterfaceC21538219Qu interfaceC21538219Qu = this.LLILZLL;
        if (interfaceC21538219Qu != null) {
            interfaceC21538219Qu.invalidate();
        }
    }
}
