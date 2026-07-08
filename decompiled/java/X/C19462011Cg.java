package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.11Cg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19462011Cg implements C11DN<Object, InterfaceC874803bO> {
    public final Function1<InterfaceC874803bO, Unit> LIZ;
    public final Function2<InterfaceC874803bO, Throwable, Unit> LIZIZ;
    public final Function2<InterfaceC874803bO, List<Object>, Unit> LIZJ;

    @Override // X.C11DN
    public final Function2<InterfaceC874803bO, Throwable, Unit> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.C11DN
    public final Function2<InterfaceC874803bO, List<? extends Object>, Unit> LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.C11DN
    public final Function1<InterfaceC874803bO, Unit> LIZJ() {
        return this.LIZ;
    }

    public C19462011Cg(Function1 function1, Function2 function2, Function2 function22) {
        this.LIZ = function1;
        this.LIZIZ = function2;
        this.LIZJ = function22;
    }
}
