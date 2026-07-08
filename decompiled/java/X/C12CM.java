package X;

import android.graphics.Bitmap;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12CM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.PrimaryColorExtractor$extractPrimaryColor$2", f = "PrimaryColorExtractor.kt", l = {}, m = "invokeSuspend")
public final class C12CM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ C12CL LLILLJJLI;
    public final /* synthetic */ C12CP LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12CM(Bitmap bitmap, C12CP c12cp, C12CL c12cl, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = c12cl;
        this.LLILLL = c12cp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12CM(this.LL, this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PrimaryColorExtractor@38c0.extractPrimaryColor$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmap = this.LL;
        Integer numLJJIIJ = null;
        if (bitmap != null) {
            C12CL c12cl = this.LLILLJJLI;
            C12CP c12cp = this.LLILLL;
            if (!bitmap.isRecycled()) {
                try {
                    if (!C0SKM.LJFF() && !C0SKM.LIZJ()) {
                        if (C0SKP.LIZIZ()) {
                            C2439109h7 c2439109h7 = new C2439109h7(bitmap, null);
                            int i = C12CO.LIZ[c12cp.ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    throw new C1954807lC();
                                }
                                c2439109h7.LIZJ(bitmap.getHeight() - ((int) (bitmap.getHeight() * C0SKP.LIZ().validHeightPercentage)));
                            } else {
                                c2439109h7.LIZ((int) (bitmap.getHeight() * C0SKP.LIZ().validHeightPercentage));
                            }
                            C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(c2439109h7);
                            c12cl.LIZ(c204674156yLIZ);
                            numLJJIIJ = C13LQ.LJJIIJ(C0SKP.LIZ().selectColorIndex, c204674156yLIZ.LIZ());
                        } else {
                            C2439109h7 c2439109h72 = new C2439109h7(bitmap, null);
                            int i2 = C12CO.LIZ[c12cp.ordinal()];
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new C1954807lC();
                                }
                                c2439109h72.LIZJ(bitmap.getHeight() - ((int) (((double) bitmap.getHeight()) * 0.1d)));
                            } else {
                                c2439109h72.LIZ((int) (((double) bitmap.getHeight()) * 0.1d));
                            }
                            C204674156y c204674156yLIZ2 = FlyMainColor.LIZ.LIZ(c2439109h72);
                            c12cl.LIZ(c204674156yLIZ2);
                            numLJJIIJ = c204674156yLIZ2.LIZIZ();
                        }
                    } else {
                        C2439109h7 c2439109h73 = new C2439109h7(bitmap, null);
                        int i3 = C12CO.LIZ[c12cp.ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                throw new C1954807lC();
                            }
                            c2439109h73.LIZJ(bitmap.getHeight() - ((int) (bitmap.getHeight() * C0SKM.LJIIIIZZ().colorConfig.validHeightPercentage)));
                        } else {
                            c2439109h73.LIZ((int) (bitmap.getHeight() * C0SKM.LJIIIIZZ().colorConfig.validHeightPercentage));
                        }
                        C204674156y c204674156yLIZ3 = FlyMainColor.LIZ.LIZ(c2439109h73);
                        c12cl.LIZ(c204674156yLIZ3);
                        numLJJIIJ = C13LQ.LJJIIJ(C0SKM.LJIIIIZZ().colorConfig.selectColorIndex, c204674156yLIZ3.LIZ());
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        C1C7U.LIZIZ("PrimaryColorExtractor@38c0.extractPrimaryColor$2");
        return numLJJIIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
