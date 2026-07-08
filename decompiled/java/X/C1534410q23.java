package X;

import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q23, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534410q23 extends AbstractC1535150q3F<C1534110q1Z, File> {
    @Override // X.InterfaceC1535220q3M
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1535220q3M
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.InterfaceC1535220q3M
    public final String getName() {
        return "HTTPCache2File";
    }

    public C1534410q23() {
        super(C1534110q1Z.class, File.class);
    }

    @Override // X.InterfaceC1535220q3M
    public final EnumC1528510psX LIZJ() {
        return EnumC1528510psX.WAIT_FOR_RESULT;
    }

    @Override // X.AbstractC1535150q3F
    public final void LJFF(AbstractC1534220q1k<C1534110q1Z> abstractC1534220q1k, C1533790q13 c1533790q13, List<? extends Class<?>> list, Function1<? super AbstractC1534220q1k<File>, Unit> function1) {
        File file;
        C1534110q1Z c1534110q1Z = abstractC1534220q1k.LIZLLL;
        C1528490psV c1528490psV = null;
        if (c1534110q1Z.LIZ() && (file = c1534110q1Z.LIZJ) != null) {
            c1528490psV = new C1528490psV(file);
        }
        function1.invoke(c1528490psV);
    }
}
