package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1CyE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247681CyE {
    public static final InterfaceC2247691CyF LIZ() {
        return (InterfaceC2247691CyF) C1706490uVb.LIZ(InterfaceC2247691CyF.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(InterfaceC2247691CyF interfaceC2247691CyF, Function1<? super C2247671CyD, C2247671CyD> function1) {
        C2247671CyD c2247671CyD = (C2247671CyD) LIZ().LJJIFFI().getValue();
        if (c2247671CyD != null) {
            C2247671CyD c2247671CyDInvoke = function1.invoke(c2247671CyD);
            EnumC0297008h enumC0297008h = c2247671CyD.LIZ;
            EnumC0297008h enumC0297008h2 = c2247671CyDInvoke.LIZ;
            if (enumC0297008h != enumC0297008h2) {
                interfaceC2247691CyF.LJIJJ(enumC0297008h2);
            }
            C00CL c00cl = c2247671CyD.LIZJ;
            C00CL c00cl2 = c2247671CyDInvoke.LIZJ;
            if (c00cl != c00cl2) {
                interfaceC2247691CyF.LJJIJIL(c00cl2);
            }
        }
    }
}
