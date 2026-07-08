package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.11Ce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19461811Ce implements C11DN<Object, InterfaceC874803bO> {
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

    public C19461811Ce(AwS608S0100000_29 awS608S0100000_29, AwS643S0100000_29 awS643S0100000_29, AwS643S0100000_29 awS643S0100000_292) {
        this.LIZ = awS608S0100000_29;
        this.LIZIZ = awS643S0100000_29;
        this.LIZJ = awS643S0100000_292;
    }
}
