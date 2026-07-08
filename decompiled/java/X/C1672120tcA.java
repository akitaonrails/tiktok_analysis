package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS311S0000000_25;

/* JADX INFO: renamed from: X.0tcA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672120tcA {
    public final AbstractC1676640tjS LIZ;
    public final AbstractC1676650tjT LIZIZ;
    public final C05ZL LIZJ;
    public final InterfaceC1671880tbm LIZLLL;

    public C1672120tcA(AbstractC1676640tjS abstractC1676640tjS, AbstractC1676650tjT abstractC1676650tjT) {
        final AFwS311S0000000_25 aFwS311S0000000_25 = AFwS311S0000000_25.get$arr$(36);
        final boolean z = true;
        InterfaceC1671880tbm interfaceC1671880tbm = new InterfaceC1671880tbm(aFwS311S0000000_25, z) { // from class: X.0tc9
            public final boolean LIZ;
            public final Function2<C1682900ttY, C1682900ttY, InterfaceC1675680thu<C1682900ttY>> LIZIZ;

            @Override // X.InterfaceC1671880tbm
            public final boolean LIZ() {
                return this.LIZ;
            }

            {
                this.LIZ = z;
                this.LIZIZ = aFwS311S0000000_25;
            }

            @Override // X.InterfaceC1671880tbm
            public final InterfaceC1675680thu<C1682900ttY> LIZIZ(long j, long j2) {
                return this.LIZIZ.invoke(new C1682900ttY(j), new C1682900ttY(j2));
            }
        };
        this.LIZ = abstractC1676640tjS;
        this.LIZIZ = abstractC1676650tjT;
        this.LIZJ = C1691250u71.LIZ(0.0f);
        this.LIZLLL = interfaceC1671880tbm;
    }
}
