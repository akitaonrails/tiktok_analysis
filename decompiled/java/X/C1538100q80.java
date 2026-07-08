package X;

import java.io.File;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q80, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1538100q80 extends C09AY implements Function1<C1532310pyf, C1289590jfB<String>> {
    public C1538100q80(C1537920q7i c1537920q7i) {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final C1289590jfB<String> invoke(C1532310pyf c1532310pyf) {
        Type type;
        C1532310pyf c1532310pyf2 = c1532310pyf;
        AbstractC1532350pyj<?> abstractC1532350pyjLJII = c1532310pyf2.LJII();
        if (abstractC1532350pyjLJII != null && (type = abstractC1532350pyjLJII.LIZ) != 0) {
            if (type instanceof File) {
                return C1289590jfB.LIZIZ(((File) type).getAbsolutePath());
            }
            return C1289590jfB.LIZ(new Exception("response data is not ByteArray"));
        }
        return C1289590jfB.LIZ(new Exception(c1532310pyf2.LIZJ.LIZJ()));
    }
}
