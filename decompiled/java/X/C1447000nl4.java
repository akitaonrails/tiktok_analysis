package X;

import java.util.ArrayList;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nl4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447000nl4 {
    public static final EnumC1446970nl1 LIZ(Function1<? super C1446990nl3, Unit> function1) {
        C1446990nl3 c1446990nl3 = new C1446990nl3();
        function1.invoke(c1446990nl3);
        C1447010nl5 c1447010nl5 = new C1447010nl5();
        for (InterfaceC1447060nlA interfaceC1447060nlA : (ArrayList) c1446990nl3.LIZ) {
            if (interfaceC1447060nlA instanceof InterfaceC1447050nl9) {
                c1447010nl5.LIZ.put(interfaceC1447060nlA.getName(), (InterfaceC1447050nl9) interfaceC1447060nlA);
            }
        }
        return c1447010nl5.LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0nl7] */
    public static C1447030nl7 LIZIZ(final Function0 function0) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCSafetyLabelInfoProvider_");
        sbLIZ.append(UUID.randomUUID());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        return new InterfaceC1447050nl9(strLIZIZ, function0) { // from class: X.0nl7
            public final String LIZ;
            public final /* synthetic */ Function0<EnumC1446970nl1> LIZIZ;

            @Override // X.InterfaceC1447040nl8
            public final EnumC1446970nl1 LIZ() {
                return this.LIZIZ.invoke();
            }

            @Override // X.InterfaceC1447060nlA
            public final String getName() {
                return this.LIZ;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZIZ = function0;
                this.LIZ = strLIZIZ;
            }
        };
    }
}
