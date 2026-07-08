package X;

import android.graphics.Typeface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12VC, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12VC extends C09AY implements Function1<C12VB, Unit> {
    public C12VC() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Qn8] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C12VB c12vb) {
        C12VB c12vb2 = c12vb;
        Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 400, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224);
        if (typefaceLIZIZ != null) {
            c12vb2.LJ(new C12VJ(typefaceLIZIZ));
        }
        c12vb2.LIZ(new InterfaceC1609810rzf() { // from class: X.0Qn8
            /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
            @Override // X.InterfaceC1609810rzf
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.graphics.Typeface LIZ(int r11) {
                /*
                    r10 = this;
                    X.12MF r0 = X.C12MF.REGULAR
                    int r0 = r0.getVALUE()
                    if (r11 == r0) goto L31
                    X.12MF r0 = X.C12MF.BOLD
                    int r0 = r0.getVALUE()
                    if (r11 != r0) goto L26
                    r2 = 700(0x2bc, float:9.81E-43)
                L12:
                    r1 = 0
                    r3 = 1099431936(0x41880000, float:17.0)
                    r0 = 1098907648(0x41800000, float:16.0)
                    java.lang.Float r5 = java.lang.Float.valueOf(r0)
                    r7 = 0
                    r8 = 0
                    r9 = 224(0xe0, float:3.14E-43)
                    r4 = r1
                    r6 = r1
                    android.graphics.Typeface r0 = X.C1697580uHE.LIZIZ(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    return r0
                L26:
                    X.12MF r0 = X.C12MF.MEDIUM
                    int r0 = r0.getVALUE()
                    if (r11 != r0) goto L31
                    r2 = 500(0x1f4, float:7.0E-43)
                    goto L12
                L31:
                    r2 = 400(0x190, float:5.6E-43)
                    goto L12
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C680800Qn8.LIZ(int):android.graphics.Typeface");
            }

            @Override // X.InterfaceC1609810rzf
            public final Typeface LIZIZ(String str) {
                int value;
                C12MF c12mf = C12MF.REGULAR;
                if (Intrinsics.LJFF(str, c12mf.getFONT_NAME())) {
                    value = c12mf.getVALUE();
                } else {
                    C12MF c12mf2 = C12MF.BOLD;
                    if (Intrinsics.LJFF(str, c12mf2.getFONT_NAME())) {
                        value = c12mf2.getVALUE();
                    } else {
                        C12MF c12mf3 = C12MF.MEDIUM;
                        if (Intrinsics.LJFF(str, c12mf3.getFONT_NAME())) {
                            value = c12mf3.getVALUE();
                        } else {
                            value = c12mf.getVALUE();
                        }
                    }
                }
                return LIZ(value);
            }
        });
        c12vb2.LIZLLL(new C12V8());
        return Unit.LIZ;
    }
}
