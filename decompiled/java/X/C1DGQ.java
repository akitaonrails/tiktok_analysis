package X;

import java.lang.Enum;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DGQ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DGQ<KEY extends Enum<KEY>> {
    public final C1DGK<KEY> LIZ;
    public final boolean LIZIZ;
    public final Function1<C1DHB, InterfaceC2252981DGe<KEY>> LIZJ;
    public final Function1<C1DGZ<KEY>, Unit> LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1DGQ(C1DGK<KEY> c1dgk, boolean z, Function1<? super C1DHB, ? extends InterfaceC2252981DGe<KEY>> function1, Function1<? super C1DGZ<KEY>, Unit> function12) {
        this.LIZ = c1dgk;
        this.LIZIZ = z;
        this.LIZJ = function1;
        this.LIZLLL = function12;
    }
}
