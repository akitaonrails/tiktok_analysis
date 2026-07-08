package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335380DCu implements InterfaceC1713010ug7 {
    public final Function0<Unit> LIZ;

    public C335380DCu() {
        this(null);
    }

    @Override // X.InterfaceC1713010ug7
    public final void c3() {
    }

    public C335380DCu(Function0<Unit> function0) {
        this.LIZ = function0;
    }

    @Override // X.InterfaceC1713010ug7
    public final void d3(C0DJX c0djx) {
        Function0<Unit> function0;
        if (c0djx == C0DJX.NEW_BIND && (function0 = this.LIZ) != null) {
            function0.invoke();
        }
    }
}
