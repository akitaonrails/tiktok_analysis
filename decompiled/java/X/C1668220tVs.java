package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0tVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668220tVs extends AbstractC20085213iM {
    public final C05P0 LLJ;
    public final long LLJI;
    public final long LLJIJIL;
    public final C05P0 LLJILJIL;
    public boolean LLJILJILJ;
    public float LLJILLL;
    public final C05P0 LLJJ;

    private final boolean getShowStaticImage() {
        return ((Boolean) this.LLJJ.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m63getBackgroundColor0d7_KjU() {
        return ((C1685910tyP) this.LLJILJIL.getValue()).LIZ;
    }

    public final EnumC1088820eRM getGearType() {
        return (EnumC1088820eRM) this.LLJ.getValue();
    }

    /* JADX INFO: renamed from: setBackgroundColor-8_81llA, reason: not valid java name */
    public final void m64setBackgroundColor8_81llA(long j) {
        ((C13FE) this.LLJILJIL).setValue(new C1685910tyP(j));
    }

    public final void setGear(EnumC1088820eRM enumC1088820eRM) {
        float f;
        this.LLJILJILJ = false;
        if (getGearType() != enumC1088820eRM) {
            setShowStaticImage(true);
            setGearType(enumC1088820eRM);
            if (getGearType() == EnumC1088820eRM.HIGH) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.LLJILLL = f;
        }
    }

    public final void setGearType(EnumC1088820eRM enumC1088820eRM) {
        ((C13FE) this.LLJ).setValue(enumC1088820eRM);
    }

    public final void setGearWithAnimation(EnumC1088820eRM enumC1088820eRM) {
        float f;
        this.LLJILJILJ = true;
        if (getGearType() != enumC1088820eRM) {
            setShowStaticImage(true);
            setGearType(enumC1088820eRM);
            if (getGearType() == EnumC1088820eRM.HIGH) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.LLJILLL = f;
        }
    }

    public final void setShowStaticImage(boolean z) {
        ((C13FE) this.LLJJ).setValue(Boolean.valueOf(z));
    }

    public C1668220tVs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJ = C20028913Yh.LJI(EnumC1088820eRM.LOW);
        this.LLJI = C1685850tyJ.LIZJ(224, 206, 248, 122);
        this.LLJIJIL = C1685850tyJ.LIZJ(221, 245, 253, 36);
        this.LLJILJIL = C20028913Yh.LJI(new C1685910tyP(C1685910tyP.LJIIIZ));
        this.LLJJ = C20028913Yh.LJI(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01d4  */
    @Override // X.AbstractC20085213iM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.InterfaceC1680500tpg r24, int r25) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1668220tVs.LIZ(X.0tpg, int):void");
    }
}
