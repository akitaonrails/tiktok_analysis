package X;

import android.graphics.Rect;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.CenterRange;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.DetectRange;
import com.ss.android.vesdk.VERecorder;
import gro.a;
import java.io.File;
import java.util.Map;
import kotlin.Pair;
import mn3.e0;

/* JADX INFO: renamed from: X.0twd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684810twd implements InterfaceC439810HMl {
    public final Rect LIZ;
    public final e0 LIZIZ;
    public final File LIZJ;
    public boolean LIZLLL;
    public final VERecorder LJ;
    public InterfaceC1684790twb LJFF;
    public final boolean LJI;
    public final DetectRange LJII;
    public final CenterRange LJIIIIZZ;
    public final Map<EnumC1684560twE, C1684870twj> LJIIIZ;
    public boolean LJIIJ;
    public final Rect LJIIJJI;
    public final C1684800twc LJIIL;

    public final void LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finish detect for ");
        C1684860twi c1684860twi = this.LJIIL.LIZ;
        sbLIZ.append(c1684860twi != null ? c1684860twi.LIZ : null);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJFF = null;
        this.LJ.LJIIL().LJIILLIIL(this.LJIIL);
        C1684800twc c1684800twc = this.LJIIL;
        c1684800twc.LIZIZ = c1684800twc.LJ.LIZ;
        c1684800twc.LIZ = null;
    }

    public static void LIZJ(C1684810twd c1684810twd, InterfaceC1684790twb interfaceC1684790twb) {
        C1684540twC c1684540twC = new C1684540twC(0);
        c1684810twd.getClass();
        interfaceC1684790twb.LIZIZ(c1684540twC);
    }

    @Override // X.InterfaceC439810HMl
    public final void LIZ(C1684860twi c1684860twi, InterfaceC1684790twb interfaceC1684790twb) {
        if (!c1684860twi.LIZIZ && this.LJFF != null) {
            LJ();
        }
        C1684800twc c1684800twc = this.LJIIL;
        c1684800twc.LIZ = c1684860twi;
        Rect rect = c1684860twi.LIZJ;
        if (rect != null) {
            c1684800twc.LIZIZ = rect;
        }
        this.LJFF = interfaceC1684790twb;
        this.LJ.LJIIL().LJIILJJIL(this.LJIIL);
    }

    public C1684810twd(Rect rect, e0 e0Var, File file) {
        this.LIZ = rect;
        this.LIZIZ = e0Var;
        this.LIZJ = file;
        VERecorder vERecorderLIZIZ = e0Var.u92().LIZIZ();
        this.LJ = vERecorderLIZIZ;
        this.LJI = C1684820twe.LIZ().checkNeutralExpression;
        this.LJII = C1684820twe.LIZ().distanceRange;
        this.LJIIIIZZ = C1684820twe.LIZ().centerRange;
        this.LJIIIZ = C2097608Jq.LJIIIIZZ(new Pair(EnumC1684560twE.LEFT_DETECTION, new C1684870twj(C1684820twe.LIZ().leftDetectRange)), new Pair(EnumC1684560twE.RIGHT_DETECTION, new C1684870twj(C1684820twe.LIZ().rightDetectRange)), new Pair(EnumC1684560twE.FRONT_DETECTION, new C1684870twj(C1684820twe.LIZ().frontDetectRange)));
        this.LJIIJJI = new Rect(0, 0, 0, 0);
        this.LJIIL = new C1684800twc(this);
        a aVarLJIIL = vERecorderLIZIZ.LJIIL();
        C1DMM c1dmm = new C1DMM(true);
        aVarLJIIL.getClass();
        c1dmm.setAlgorithmType(0);
        c1dmm.setForInit(true);
        aVarLJIIL.LIZ(c1dmm, -1, -1, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(android.graphics.Bitmap r7, android.graphics.Rect r8, X.InterfaceC1364105Vn<? super android.graphics.Bitmap> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C2478509nT
            if (r0 == 0) goto L37
            r5 = r9
            X.09nT r5 = (X.C2478509nT) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L3d
            X.C155000ia.LIZIZ(r1)
        L22:
            return r1
        L23:
            X.C155000ia.LIZIZ(r1)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.09nG r1 = new X.09nG
            r0 = 0
            r1.<init>(r7, r8, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L37:
            X.09nT r5 = new X.09nT
            r5.<init>(r6, r9)
            goto L12
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684810twd.LIZIZ(android.graphics.Bitmap, android.graphics.Rect, X.05Vn):java.lang.Object");
    }

    public static void LIZLLL(C1684810twd c1684810twd, InterfaceC1684790twb interfaceC1684790twb, EnumC439820HMm enumC439820HMm, int i) {
        C1684540twC c1684540twC;
        if ((i & 1) != 0) {
            enumC439820HMm = EnumC439820HMm.ERR_PARAM;
        }
        if ((i & 2) != 0) {
            c1684540twC = new C1684540twC(0);
        } else {
            c1684540twC = null;
        }
        c1684810twd.getClass();
        interfaceC1684790twb.LIZ(enumC439820HMm, c1684540twC);
    }
}
