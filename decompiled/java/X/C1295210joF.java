package X;

import android.graphics.Color;

/* JADX INFO: renamed from: X.0joF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295210joF implements InterfaceC1294590jnF {
    public final InterfaceC1294590jnF LIZ;
    public final C1295250joJ LIZIZ;
    public final C1295230joH LIZJ;
    public final C1295230joH LIZLLL;
    public final C1295230joH LJ;
    public final C1295230joH LJFF;
    public boolean LJI = true;

    @Override // X.InterfaceC1294590jnF
    public final void LIZJ() {
        this.LJI = true;
        this.LIZ.LIZJ();
    }

    public final void LIZ(C1294440jn0 c1294440jn0) {
        if (!this.LJI) {
            return;
        }
        this.LJI = false;
        double dFloatValue = ((double) this.LIZLLL.LJFF().floatValue()) * 0.017453292519943295d;
        float fFloatValue = this.LJ.LJFF().floatValue();
        float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
        float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
        int iIntValue = this.LIZIZ.LJFF().intValue();
        c1294440jn0.setShadowLayer(this.LJFF.LJFF().floatValue(), fSin, fCos, Color.argb(Math.round(this.LIZJ.LJFF().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
    }

    public final void LIZIZ(final C1295400joY<Float> c1295400joY) {
        if (c1295400joY == null) {
            this.LIZJ.LJIIJ(null);
        } else {
            this.LIZJ.LJIIJ(new C1295400joY<Float>() { // from class: X.0jok
                @Override // X.C1295400joY
                public final Float LIZ(C1295570jop<Float> c1295570jop) {
                    Float f = (Float) c1295400joY.LIZ(c1295570jop);
                    if (f == null) {
                        return null;
                    }
                    return Float.valueOf(f.floatValue() * 2.55f);
                }
            });
        }
    }

    public C1295210joF(InterfaceC1294590jnF interfaceC1294590jnF, AbstractC1295030jnx abstractC1295030jnx, C1295720jp4 c1295720jp4) {
        this.LIZ = interfaceC1294590jnF;
        AbstractC1295190joD<Integer, Integer> abstractC1295190joDLIZ = c1295720jp4.LIZ.LIZ();
        this.LIZIZ = (C1295250joJ) abstractC1295190joDLIZ;
        abstractC1295190joDLIZ.LIZ(this);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ);
        AbstractC1295190joD<Float, Float> abstractC1295190joDLIZ2 = c1295720jp4.LIZIZ.LIZ();
        this.LIZJ = (C1295230joH) abstractC1295190joDLIZ2;
        abstractC1295190joDLIZ2.LIZ(this);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ2);
        AbstractC1295190joD<Float, Float> abstractC1295190joDLIZ3 = c1295720jp4.LIZJ.LIZ();
        this.LIZLLL = (C1295230joH) abstractC1295190joDLIZ3;
        abstractC1295190joDLIZ3.LIZ(this);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ3);
        AbstractC1295190joD<Float, Float> abstractC1295190joDLIZ4 = c1295720jp4.LIZLLL.LIZ();
        this.LJ = (C1295230joH) abstractC1295190joDLIZ4;
        abstractC1295190joDLIZ4.LIZ(this);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ4);
        AbstractC1295190joD<Float, Float> abstractC1295190joDLIZ5 = c1295720jp4.LJ.LIZ();
        this.LJFF = (C1295230joH) abstractC1295190joDLIZ5;
        abstractC1295190joDLIZ5.LIZ(this);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ5);
    }
}
