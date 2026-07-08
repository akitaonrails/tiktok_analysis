package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Typeface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0jqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296520jqM extends C09AY implements Function1<InterfaceC1675870tiD, Unit> {
    public final /* synthetic */ C1294720jnS LL;
    public final /* synthetic */ InterfaceC1671600tbK LLILLJJLI;
    public final /* synthetic */ InterfaceC1668050tVb LLILLL;
    public final /* synthetic */ Matrix LLILZ;
    public final /* synthetic */ C1295950jpR LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ EnumC1295970jpT LLIZ;
    public final /* synthetic */ EnumC1296010jpX LLIZLLLIL;
    public final /* synthetic */ Map<String, Typeface> LLJ;
    public final /* synthetic */ C1296540jqO LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;
    public final /* synthetic */ Function0<Float> LLJJ;
    public final /* synthetic */ C05P0<C1296540jqO> LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1296520jqM(C1294720jnS c1294720jnS, InterfaceC1671600tbK interfaceC1671600tbK, InterfaceC1668050tVb interfaceC1668050tVb, Matrix matrix, C1295950jpR c1295950jpR, boolean z, EnumC1295970jpT enumC1295970jpT, EnumC1296010jpX enumC1296010jpX, Map<String, ? extends Typeface> map, C1296540jqO c1296540jqO, boolean z2, boolean z3, boolean z4, boolean z5, Function0<Float> function0, C05P0<C1296540jqO> c05p0) {
        super(1);
        this.LL = c1294720jnS;
        this.LLILLJJLI = interfaceC1671600tbK;
        this.LLILLL = interfaceC1668050tVb;
        this.LLILZ = matrix;
        this.LLILZIL = c1295950jpR;
        this.LLILZLL = z;
        this.LLIZ = enumC1295970jpT;
        this.LLIZLLLIL = enumC1296010jpX;
        this.LLJ = map;
        this.LLJI = c1296540jqO;
        this.LLJIJIL = z2;
        this.LLJILJIL = z3;
        this.LLJILJILJ = z4;
        this.LLJILLL = z5;
        this.LLJJ = function0;
        this.LLJJI = c05p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1675870tiD interfaceC1675870tiD) {
        boolean z;
        InterfaceC1675870tiD interfaceC1675870tiD2 = interfaceC1675870tiD;
        C1294720jnS c1294720jnS = this.LL;
        InterfaceC1671600tbK interfaceC1671600tbK = this.LLILLJJLI;
        InterfaceC1668050tVb interfaceC1668050tVb = this.LLILLL;
        Matrix matrix = this.LLILZ;
        C1295950jpR c1295950jpR = this.LLILZIL;
        boolean z2 = this.LLILZLL;
        EnumC1295970jpT enumC1295970jpT = this.LLIZ;
        EnumC1296010jpX enumC1296010jpX = this.LLIZLLLIL;
        Map<String, Typeface> map = this.LLJ;
        C1296540jqO c1296540jqO = this.LLJI;
        boolean z3 = this.LLJIJIL;
        boolean z4 = this.LLJILJIL;
        boolean z5 = this.LLJILJILJ;
        boolean z6 = this.LLJILLL;
        Function0<Float> function0 = this.LLJJ;
        C05P0<C1296540jqO> c05p0 = this.LLJJI;
        InterfaceC1686290tz1 interfaceC1686290tz1LIZ = interfaceC1675870tiD2.LJLJI().LIZ();
        long jLIZ = C1671580tbI.LIZ(c1294720jnS.LJIIIZ.width(), c1294720jnS.LJIIIZ.height());
        long jLIZ2 = C1296570jqR.LIZ(C814420VxA.LIZIZ(C1680770tq7.LIZLLL(interfaceC1675870tiD2.LIZIZ())), C814420VxA.LIZIZ(C1680770tq7.LIZIZ(interfaceC1675870tiD2.LIZIZ())));
        long jLIZ3 = interfaceC1671600tbK.LIZ(jLIZ, interfaceC1675870tiD2.LIZIZ());
        float fLIZLLL = C1680770tq7.LIZLLL(jLIZ);
        int i = C1296550jqP.LIZ;
        int i2 = (int) (jLIZ3 >> 32);
        int i3 = (int) (4294967295L & jLIZ3);
        long jLIZ4 = interfaceC1668050tVb.LIZ(C1296570jqR.LIZ((int) (fLIZLLL * Float.intBitsToFloat(i2)), (int) (C1680770tq7.LIZIZ(jLIZ) * Float.intBitsToFloat(i3))), jLIZ2, interfaceC1675870tiD2.getLayoutDirection());
        matrix.reset();
        matrix.preTranslate((int) (jLIZ4 >> 32), C1676820tjk.LIZJ(jLIZ4));
        matrix.preScale(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        if (c1295950jpR.LLJJI != z2) {
            c1295950jpR.LLJJI = z2;
            if (c1295950jpR.LL != null) {
                c1295950jpR.LIZJ();
            }
        }
        c1295950jpR.LLJJJJJIL = enumC1295970jpT;
        c1295950jpR.LJ();
        c1295950jpR.LLLFF = enumC1296010jpX;
        c1295950jpR.LJIILL(c1294720jnS);
        if (map != c1295950jpR.LLJILJIL) {
            c1295950jpR.LLJILJIL = map;
            c1295950jpR.invalidateSelf();
        }
        if (c1296540jqO != c05p0.getValue()) {
            if (c05p0.getValue() == null && c1296540jqO == null) {
                c05p0.setValue(c1296540jqO);
            } else {
                throw null;
            }
        }
        if (c1295950jpR.LLJJJIL != z3) {
            c1295950jpR.LLJJJIL = z3;
            C1294740jnU c1294740jnU = c1295950jpR.LLJJIJIIJIL;
            if (c1294740jnU != null) {
                c1294740jnU.LJIIZILJ(z3);
            }
        }
        c1295950jpR.LLJJJJ = z4;
        c1295950jpR.LLJJIII = z5;
        if (z6 != c1295950jpR.LLJJIJI) {
            c1295950jpR.LLJJIJI = z6;
            C1294740jnU c1294740jnU2 = c1295950jpR.LLJJIJIIJIL;
            if (c1294740jnU2 != null) {
                c1294740jnU2.LJJIJL = z6;
            }
            c1295950jpR.invalidateSelf();
        }
        c1295950jpR.LJJIII(function0.invoke().floatValue());
        c1295950jpR.setBounds(0, 0, c1294720jnS.LJIIIZ.width(), c1294720jnS.LJIIIZ.height());
        Canvas canvas = C1296530jqN.LIZ;
        Canvas canvas2 = ((C1696880uG6) interfaceC1686290tz1LIZ).LIZ;
        C1294740jnU c1294740jnU3 = c1295950jpR.LLJJIJIIJIL;
        C1294720jnS c1294720jnS2 = c1295950jpR.LL;
        if (c1294740jnU3 != null && c1294720jnS2 != null) {
            if (c1295950jpR.LLLFF == EnumC1296010jpX.ENABLED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    try {
                        c1295950jpR.LLLFZ.acquire();
                        if (c1295950jpR.LJJIIJZLJL()) {
                            c1295950jpR.LJJIII(c1295950jpR.LLILLJJLI.LJFF());
                        }
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        if (z) {
                            c1295950jpR.LLLFZ.release();
                            if (c1294740jnU3.LJJIJIL != c1295950jpR.LLILLJJLI.LJFF()) {
                            }
                        }
                        return Unit.LIZ;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (z) {
                        c1295950jpR.LLLFZ.release();
                        if (c1294740jnU3.LJJIJIL != c1295950jpR.LLILLJJLI.LJFF()) {
                            C1295950jpR.LLLIIIIL.execute(c1295950jpR.LLLI);
                        }
                    }
                    throw th;
                }
            }
            if (c1295950jpR.LLJJJJLIIL) {
                canvas2.save();
                canvas2.concat(matrix);
                c1295950jpR.LJIIL(canvas2, c1294740jnU3);
                canvas2.restore();
            } else {
                c1294740jnU3.LIZ(canvas2, matrix, c1295950jpR.LLJJIJIL);
            }
            c1295950jpR.LLLIIII = false;
            if (z) {
                c1295950jpR.LLLFZ.release();
                if (c1294740jnU3.LJJIJIL != c1295950jpR.LLILLJJLI.LJFF()) {
                    C1295950jpR.LLLIIIIL.execute(c1295950jpR.LLLI);
                }
            }
        }
        return Unit.LIZ;
    }
}
