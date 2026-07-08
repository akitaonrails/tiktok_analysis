package X;

import android.graphics.RectF;

/* JADX INFO: renamed from: X.0Qml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC680570Qml {
    public final EnumC680530Qmh LIZ;
    public final EnumC680530Qmh LIZIZ;
    public final C680610Qmp LIZJ;

    public abstract void LIZ(float f, float f2, float f3, RectF rectF, float f4);

    public AbstractC680570Qml(EnumC680530Qmh enumC680530Qmh, EnumC680530Qmh enumC680530Qmh2) {
        this.LIZ = enumC680530Qmh;
        this.LIZIZ = enumC680530Qmh2;
        this.LIZJ = new C680610Qmp(enumC680530Qmh, enumC680530Qmh2);
    }

    public void LIZIZ(float f, float f2, RectF rectF, float f3) {
        C680610Qmp c680610Qmp = this.LIZJ;
        EnumC680530Qmh enumC680530Qmh = c680610Qmp.LIZ;
        EnumC680530Qmh enumC680530Qmh2 = c680610Qmp.LIZIZ;
        if (enumC680530Qmh != null) {
            enumC680530Qmh.adjustCoordinate(f, f2, rectF, f3, 1.0f);
        }
        if (enumC680530Qmh2 != null) {
            enumC680530Qmh2.adjustCoordinate(f, f2, rectF, f3, 1.0f);
        }
    }
}
