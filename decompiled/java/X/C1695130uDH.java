package X;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uDH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695130uDH extends TextPaint {
    public C1695150uDJ LIZ;
    public C1693510uAf LIZIZ;
    public int LIZJ;
    public C1693340uAO LIZLLL;
    public C1685910tyP LJ;
    public AbstractC1668700tWe LJFF;
    public C13YZ LJI;
    public C1680770tq7 LJII;
    public AbstractC1695860uES LJIIIIZZ;

    public final InterfaceC1695240uDS LIZ() {
        C1695150uDJ c1695150uDJ = this.LIZ;
        if (c1695150uDJ != null) {
            return c1695150uDJ;
        }
        C1695150uDJ c1695150uDJ2 = new C1695150uDJ(this);
        this.LIZ = c1695150uDJ2;
        return c1695150uDJ2;
    }

    public C1695130uDH(float f) {
        super(1);
        ((TextPaint) this).density = f;
        this.LIZIZ = C1693510uAf.LIZIZ;
        InterfaceC1675870tiD.LLILL.getClass();
        this.LIZJ = C1668240tVu.LIZIZ;
        this.LIZLLL = C1693340uAO.LIZLLL;
    }

    public final void LIZIZ(int i) {
        if (i == this.LIZJ) {
            return;
        }
        LIZ().LJIIJ(i);
        this.LIZJ = i;
    }

    public final void LIZLLL(long j) {
        C1685910tyP c1685910tyP = this.LJ;
        if ((c1685910tyP == null || !C1685910tyP.LJ(c1685910tyP.LIZ, j)) && j != 16) {
            this.LJ = new C1685910tyP(j);
            setColor(C1685850tyJ.LJIIIZ(j));
            this.LJI = null;
            this.LJFF = null;
            this.LJII = null;
            setShader(null);
        }
    }

    public final void LJ(AbstractC1695860uES abstractC1695860uES) {
        if (abstractC1695860uES != null && !Intrinsics.LJFF(this.LJIIIIZZ, abstractC1695860uES)) {
            this.LJIIIIZZ = abstractC1695860uES;
            if (Intrinsics.LJFF(abstractC1695860uES, C1695700uEC.LIZ)) {
                setStyle(Paint.Style.FILL);
                return;
            }
            if (!(abstractC1695860uES instanceof C1695210uDP)) {
                return;
            }
            LIZ().LJFF(1);
            C1695210uDP c1695210uDP = (C1695210uDP) abstractC1695860uES;
            LIZ().LJI(c1695210uDP.LIZ);
            LIZ().LJIIIIZZ(c1695210uDP.LIZIZ);
            LIZ().LJII(c1695210uDP.LIZLLL);
            LIZ().LIZLLL(c1695210uDP.LIZJ);
            LIZ().LJ(c1695210uDP.LJ);
        }
    }

    public final void LJFF(C1693340uAO c1693340uAO) {
        if (c1693340uAO != null && !Intrinsics.LJFF(this.LIZLLL, c1693340uAO)) {
            this.LIZLLL = c1693340uAO;
            if (Intrinsics.LJFF(c1693340uAO, C1693340uAO.LIZLLL)) {
                clearShadowLayer();
                return;
            }
            C1693340uAO c1693340uAO2 = this.LIZLLL;
            float f = c1693340uAO2.LIZJ;
            if (f == 0.0f) {
                f = Float.MIN_VALUE;
            }
            setShadowLayer(f, Float.intBitsToFloat((int) (c1693340uAO2.LIZIZ >> 32)), Float.intBitsToFloat((int) (this.LIZLLL.LIZIZ & 4294967295L)), C1685850tyJ.LJIIIZ(this.LIZLLL.LIZ));
        }
    }

    public final void LJI(C1693510uAf c1693510uAf) {
        if (c1693510uAf != null && !Intrinsics.LJFF(this.LIZIZ, c1693510uAf)) {
            this.LIZIZ = c1693510uAf;
            setUnderlineText(c1693510uAf.LIZ(C1693510uAf.LIZJ));
            setStrikeThruText(this.LIZIZ.LIZ(C1693510uAf.LIZLLL));
        }
    }

    public final void LIZJ(AbstractC1668700tWe abstractC1668700tWe, long j, float f) {
        Shader shader;
        C1680770tq7 c1680770tq7;
        if (abstractC1668700tWe == null) {
            this.LJI = null;
            this.LJFF = null;
            this.LJII = null;
            setShader(null);
            return;
        }
        if (abstractC1668700tWe instanceof C1680950tqP) {
            LIZLLL(C1683270tu9.LIZ(f, ((C1680950tqP) abstractC1668700tWe).LIZIZ));
            return;
        }
        if (!(abstractC1668700tWe instanceof AbstractC1682800ttO)) {
            return;
        }
        if ((!Intrinsics.LJFF(this.LJFF, abstractC1668700tWe) || (c1680770tq7 = this.LJII) == null || !C1680770tq7.LIZ(c1680770tq7.LIZ, j)) && j != 9205357640488583168L) {
            this.LJFF = abstractC1668700tWe;
            this.LJII = new C1680770tq7(j);
            this.LJI = C20028913Yh.LJ(new C1695300uDY(abstractC1668700tWe, j));
        }
        InterfaceC1695240uDS interfaceC1695240uDSLIZ = LIZ();
        C13YZ c13yz = this.LJI;
        if (c13yz != null) {
            shader = (Shader) c13yz.getValue();
        } else {
            shader = null;
        }
        ((C1695150uDJ) interfaceC1695240uDSLIZ).LJIILL(shader);
        this.LJ = null;
        C418510Gb3.LIZ(this, f);
    }
}
