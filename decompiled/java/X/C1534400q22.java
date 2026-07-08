package X;

import java.io.InputStream;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q22, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534400q22 extends AbstractC1535150q3F<C1534110q1Z, InputStream> {
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
        return "HTTPCache2Stream";
    }

    public C1534400q22() {
        super(C1534110q1Z.class, InputStream.class);
    }

    @Override // X.InterfaceC1535220q3M
    public final EnumC1528510psX LIZJ() {
        return EnumC1528510psX.WAIT_FOR_RESULT;
    }

    @Override // X.AbstractC1535150q3F
    public final void LJFF(AbstractC1534220q1k<C1534110q1Z> abstractC1534220q1k, C1533790q13 c1533790q13, List<? extends Class<?>> list, Function1<? super AbstractC1534220q1k<InputStream>, Unit> function1) {
        InputStream inputStreamLJ;
        C1534000q1O c1534000q1OLJFF = abstractC1534220q1k.LIZLLL.LJFF();
        if (c1534000q1OLJFF != null && (inputStreamLJ = c1534000q1OLJFF.LJ(c1533790q13, false)) != null) {
            function1.invoke(new C1534420q24(inputStreamLJ));
        } else {
            function1.invoke(null);
        }
    }
}
