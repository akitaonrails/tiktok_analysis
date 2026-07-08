package X;

import android.graphics.Canvas;

/* JADX INFO: renamed from: X.0Ea6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366960Ea6 implements InterfaceC369260Edo {
    public final C444890HcV LIZ;
    public final float LIZIZ;

    public C366960Ea6() {
        C444890HcV c444890HcV = new C444890HcV();
        this.LIZ = c444890HcV;
        c444890HcV.setColor(-1);
        c444890HcV.setAlpha(128);
        c444890HcV.LIZ(C297330Bl5.LIZIZ() ? 71 : 91);
        this.LIZIZ = (c444890HcV.ascent() + c444890HcV.descent()) / 2;
    }

    @Override // X.InterfaceC369260Edo
    public final void LIZ(Canvas canvas, int i, float f, float f2, float f3) {
        String strValueOf;
        String strValueOf2;
        if (i % 2 == 0) {
            int i2 = (int) f3;
            int iLIZIZ = C814420VxA.LIZIZ((f3 - i2) / 0.033333335f);
            if (iLIZIZ == 0) {
                int i3 = i2 / 60;
                int i4 = i2 % 60;
                if (i3 < 10) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('0');
                    sbLIZ.append(i3);
                    strValueOf = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strValueOf = String.valueOf(i3);
                }
                if (i4 < 10) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('0');
                    sbLIZ2.append(i4);
                    strValueOf2 = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    strValueOf2 = String.valueOf(i4);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strValueOf);
                sbLIZ3.append(':');
                sbLIZ3.append(strValueOf2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                canvas.drawText(strLIZIZ, f - (this.LIZ.measureText(strLIZIZ) / 2), f2 - this.LIZIZ, this.LIZ);
                return;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(iLIZIZ);
            sbLIZ4.append('f');
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
            canvas.drawText(strLIZIZ2, f - (this.LIZ.measureText(strLIZIZ2) / 2), f2 - this.LIZIZ, this.LIZ);
        }
    }
}
