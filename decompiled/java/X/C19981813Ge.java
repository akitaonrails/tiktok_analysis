package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13Ge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19981813Ge {
    public static final C19983813Gy LIZ(String str, InterfaceC19983313Gt[] interfaceC19983313GtArr, Function1 function1) {
        if (!a0.LJJJIL(str)) {
            C13GJ c13gj = new C13GJ(str);
            function1.invoke(c13gj);
            return new C19983813Gy(str, C19982513Gl.LIZ, ((ArrayList) c13gj.LIZJ).size(), C13LQ.LJJLL(interfaceC19983313GtArr), c13gj);
        }
        "Blank serial names are prohibited".toString();
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static final C19983813Gy LIZIZ(String str, C13GW c13gw, InterfaceC19983313Gt[] interfaceC19983313GtArr, Function1 function1) {
        if (!a0.LJJJIL(str)) {
            if (!Intrinsics.LJFF(c13gw, C19982513Gl.LIZ)) {
                C13GJ c13gj = new C13GJ(str);
                function1.invoke(c13gj);
                return new C19983813Gy(str, c13gw, ((ArrayList) c13gj.LIZJ).size(), C13LQ.LJJLL(interfaceC19983313GtArr), c13gj);
            }
            "For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString();
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        "Blank serial names are prohibited".toString();
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }
}
