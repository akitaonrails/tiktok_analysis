package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.List;

/* JADX INFO: renamed from: X.0joK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295260joK implements InterfaceC1294510jn7 {
    public final String LIZ;
    public final C1295020jnw LIZIZ;
    public final List<C1295020jnw> LIZJ;
    public final C1295450jod LIZLLL;
    public final C1295460joe LJ;
    public final C1295020jnw LJFF;
    public final EnumC1295000jnu LJI;
    public final EnumC1295010jnv LJII;
    public final float LJIIIIZZ;
    public final boolean LJIIIZ;

    @Override // X.InterfaceC1294510jn7
    public final InterfaceC1295810jpD LIZ(final C1295950jpR c1295950jpR, C1294720jnS c1294720jnS, final AbstractC1295030jnx abstractC1295030jnx) {
        return new AbstractC1295150jo9(c1295950jpR, abstractC1295030jnx, this) { // from class: X.0joE
            public final AbstractC1295030jnx LJIIZILJ;
            public final String LJIJ;
            public final boolean LJIJI;
            public final C1295250joJ LJIJJ;
            public C1295300joO LJIJJLI;

            @Override // X.InterfaceC1295810jpD
            public final String getName() {
                return this.LJIJ;
            }

            @Override // X.AbstractC1295150jo9, X.InterfaceC1295760jp8
            public final void LJII(C1295400joY c1295400joY, Object obj) {
                super.LJII(c1295400joY, obj);
                if (obj == InterfaceC1295080jo2.LIZIZ) {
                    this.LJIJJ.LJIIJ(c1295400joY);
                    return;
                }
                if (obj != InterfaceC1295080jo2.LJJIJL) {
                    return;
                }
                C1295300joO c1295300joO = this.LJIJJLI;
                if (c1295300joO != null) {
                    this.LJIIZILJ.LJIILL(c1295300joO);
                }
                if (c1295400joY == null) {
                    this.LJIJJLI = null;
                    return;
                }
                C1295300joO c1295300joO2 = new C1295300joO(c1295400joY, null);
                this.LJIJJLI = c1295300joO2;
                c1295300joO2.LIZ(this);
                this.LJIIZILJ.LIZIZ(this.LJIJJ);
            }

            {
                Paint.Cap paintCap = this.LJI.toPaintCap();
                Paint.Join paintJoin = this.LJII.toPaintJoin();
                float f = this.LJIIIIZZ;
                C1295460joe c1295460joe = this.LJ;
                C1295020jnw c1295020jnw = this.LJFF;
                List<C1295020jnw> list = this.LIZJ;
                C1295020jnw c1295020jnw2 = this.LIZIZ;
                this.LJIIZILJ = abstractC1295030jnx;
                this.LJIJ = this.LIZ;
                this.LJIJI = this.LJIIIZ;
                AbstractC1295190joD<Integer, Integer> abstractC1295190joDLIZ = this.LIZLLL.LIZ();
                this.LJIJJ = (C1295250joJ) abstractC1295190joDLIZ;
                abstractC1295190joDLIZ.LIZ(this);
                abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1295150jo9, X.InterfaceC1295800jpC
            public final void LIZ(Canvas canvas, Matrix matrix, int i) {
                if (this.LJIJI) {
                    return;
                }
                C1294440jn0 c1294440jn0 = this.LJIIIIZZ;
                C1295250joJ c1295250joJ = this.LJIJJ;
                c1294440jn0.setColor(c1295250joJ.LJIIJJI(c1295250joJ.LIZIZ(), c1295250joJ.LIZLLL()));
                C1295300joO c1295300joO = this.LJIJJLI;
                if (c1295300joO != null) {
                    this.LJIIIIZZ.setColorFilter((ColorFilter) c1295300joO.LJFF());
                }
                super.LIZ(canvas, matrix, i);
            }
        };
    }

    public C1295260joK(String str, C1295020jnw c1295020jnw, List<C1295020jnw> list, C1295450jod c1295450jod, C1295460joe c1295460joe, C1295020jnw c1295020jnw2, EnumC1295000jnu enumC1295000jnu, EnumC1295010jnv enumC1295010jnv, float f, boolean z) {
        this.LIZ = str;
        this.LIZIZ = c1295020jnw;
        this.LIZJ = list;
        this.LIZLLL = c1295450jod;
        this.LJ = c1295460joe;
        this.LJFF = c1295020jnw2;
        this.LJI = enumC1295000jnu;
        this.LJII = enumC1295010jnv;
        this.LJIIIIZZ = f;
        this.LJIIIZ = z;
    }
}
