package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.List;

/* JADX INFO: renamed from: X.0joG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295220joG implements InterfaceC1294510jn7 {
    public final String LIZ;
    public final EnumC1295590jor LIZIZ;
    public final C1295110jo5 LIZJ;
    public final C1295460joe LIZLLL;
    public final C1294640jnK LJ;
    public final C1294640jnK LJFF;
    public final C1295020jnw LJI;
    public final EnumC1295000jnu LJII;
    public final EnumC1295010jnv LJIIIIZZ;
    public final float LJIIIZ;
    public final List<C1295020jnw> LJIIJ;
    public final C1295020jnw LJIIJJI;
    public final boolean LJIIL;

    @Override // X.InterfaceC1294510jn7
    public final InterfaceC1295810jpD LIZ(final C1295950jpR c1295950jpR, C1294720jnS c1294720jnS, final AbstractC1295030jnx abstractC1295030jnx) {
        return new AbstractC1295150jo9(c1295950jpR, abstractC1295030jnx, this) { // from class: X.0joC
            public final String LJIIZILJ;
            public final boolean LJIJ;
            public final C20066713fN<LinearGradient> LJIJI;
            public final C20066713fN<RadialGradient> LJIJJ;
            public final RectF LJIJJLI;
            public final EnumC1295590jor LJIL;
            public final int LJJ;
            public final C1295120jo6 LJJI;
            public final C1295270joL LJJIFFI;
            public final C1295270joL LJJII;
            public C1295300joO LJJIII;

            public final int LJIIIIZZ() {
                int iRound = Math.round(this.LJJIFFI.LIZLLL * this.LJJ);
                int iRound2 = Math.round(this.LJJII.LIZLLL * this.LJJ);
                int iRound3 = Math.round(this.LJJI.LIZLLL * this.LJJ);
                int i = iRound != 0 ? iRound * 527 : 17;
                if (iRound2 != 0) {
                    i = i * 31 * iRound2;
                }
                return iRound3 != 0 ? i * 31 * iRound3 : i;
            }

            @Override // X.InterfaceC1295810jpD
            public final String getName() {
                return this.LJIIZILJ;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final int[] LIZIZ(int[] iArr) {
                C1295300joO c1295300joO = this.LJJIII;
                if (c1295300joO != null) {
                    Integer[] numArr = (Integer[]) c1295300joO.LJFF();
                    int i = 0;
                    if (iArr.length != numArr.length) {
                        iArr = new int[numArr.length];
                        while (i < numArr.length) {
                            iArr[i] = numArr[i].intValue();
                            i++;
                        }
                    } else {
                        while (i < iArr.length) {
                            iArr[i] = numArr[i].intValue();
                            i++;
                        }
                    }
                }
                return iArr;
            }

            @Override // X.AbstractC1295150jo9, X.InterfaceC1295760jp8
            public final void LJII(C1295400joY c1295400joY, Object obj) {
                super.LJII(c1295400joY, obj);
                if (obj == InterfaceC1295080jo2.LJJIJLIJ) {
                    C1295300joO c1295300joO = this.LJJIII;
                    if (c1295300joO != null) {
                        this.LJFF.LJIILL(c1295300joO);
                    }
                    if (c1295400joY == null) {
                        this.LJJIII = null;
                        return;
                    }
                    C1295300joO c1295300joO2 = new C1295300joO(c1295400joY, null);
                    this.LJJIII = c1295300joO2;
                    c1295300joO2.LIZ(this);
                    this.LJFF.LIZIZ(this.LJJIII);
                }
            }

            {
                super(c1295950jpR, abstractC1295030jnx, this.LJII.toPaintCap(), this.LJIIIIZZ.toPaintJoin(), this.LJIIIZ, this.LIZLLL, this.LJI, this.LJIIJ, this.LJIIJJI);
                this.LJIJI = new C20066713fN<>();
                this.LJIJJ = new C20066713fN<>();
                this.LJIJJLI = new RectF();
                this.LJIIZILJ = this.LIZ;
                this.LJIL = this.LIZIZ;
                this.LJIJ = this.LJIIL;
                this.LJJ = (int) (c1295950jpR.LL.LIZIZ() / 32.0f);
                AbstractC1295190joD<C1295620jou, C1295620jou> abstractC1295190joDLIZ = this.LIZJ.LIZ();
                this.LJJI = (C1295120jo6) abstractC1295190joDLIZ;
                abstractC1295190joDLIZ.LIZ(this);
                abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ);
                AbstractC1295190joD<PointF, PointF> abstractC1295190joDLIZ2 = this.LJ.LIZ();
                this.LJJIFFI = (C1295270joL) abstractC1295190joDLIZ2;
                abstractC1295190joDLIZ2.LIZ(this);
                abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ2);
                AbstractC1295190joD<PointF, PointF> abstractC1295190joDLIZ3 = this.LJFF.LIZ();
                this.LJJII = (C1295270joL) abstractC1295190joDLIZ3;
                abstractC1295190joDLIZ3.LIZ(this);
                abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.AbstractC1295150jo9, X.InterfaceC1295800jpC
            public final void LIZ(Canvas canvas, Matrix matrix, int i) {
                RadialGradient radialGradientLJ;
                if (this.LJIJ) {
                    return;
                }
                LJI(this.LJIJJLI, matrix, false);
                if (this.LJIL == EnumC1295590jor.LINEAR) {
                    long jLJIIIIZZ = LJIIIIZZ();
                    radialGradientLJ = this.LJIJI.LJ(jLJIIIIZZ);
                    if (radialGradientLJ == null) {
                        PointF pointFLJFF = this.LJJIFFI.LJFF();
                        PointF pointFLJFF2 = this.LJJII.LJFF();
                        C1295620jou c1295620jouLJFF = LJFF();
                        radialGradientLJ = new LinearGradient(pointFLJFF.x, pointFLJFF.y, pointFLJFF2.x, pointFLJFF2.y, LIZIZ(c1295620jouLJFF.LIZIZ), c1295620jouLJFF.LIZ, Shader.TileMode.CLAMP);
                        this.LJIJI.LJIIIZ(jLJIIIIZZ, radialGradientLJ);
                    }
                } else {
                    long jLJIIIIZZ2 = LJIIIIZZ();
                    radialGradientLJ = this.LJIJJ.LJ(jLJIIIIZZ2);
                    if (radialGradientLJ == null) {
                        PointF pointFLJFF3 = this.LJJIFFI.LJFF();
                        PointF pointFLJFF4 = this.LJJII.LJFF();
                        C1295620jou c1295620jouLJFF2 = LJFF();
                        int[] iArrLIZIZ = LIZIZ(c1295620jouLJFF2.LIZIZ);
                        float[] fArr = c1295620jouLJFF2.LIZ;
                        radialGradientLJ = new RadialGradient(pointFLJFF3.x, pointFLJFF3.y, (float) Math.hypot(pointFLJFF4.x - r6, pointFLJFF4.y - r7), iArrLIZIZ, fArr, Shader.TileMode.CLAMP);
                        this.LJIJJ.LJIIIZ(jLJIIIIZZ2, radialGradientLJ);
                    }
                }
                radialGradientLJ.setLocalMatrix(matrix);
                this.LJIIIIZZ.setShader(radialGradientLJ);
                super.LIZ(canvas, matrix, i);
            }
        };
    }

    public C1295220joG(String str, EnumC1295590jor enumC1295590jor, C1295110jo5 c1295110jo5, C1295460joe c1295460joe, C1294640jnK c1294640jnK, C1294640jnK c1294640jnK2, C1295020jnw c1295020jnw, EnumC1295000jnu enumC1295000jnu, EnumC1295010jnv enumC1295010jnv, float f, List<C1295020jnw> list, C1295020jnw c1295020jnw2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = enumC1295590jor;
        this.LIZJ = c1295110jo5;
        this.LIZLLL = c1295460joe;
        this.LJ = c1294640jnK;
        this.LJFF = c1294640jnK2;
        this.LJI = c1295020jnw;
        this.LJII = enumC1295000jnu;
        this.LJIIIIZZ = enumC1295010jnv;
        this.LJIIIZ = f;
        this.LJIIJ = list;
        this.LJIIJJI = c1295020jnw2;
        this.LJIIL = z;
    }
}
