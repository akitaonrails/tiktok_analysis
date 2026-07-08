package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0scm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1634060scm<V, RESP> extends C11T3<Unit, V, Unit, RESP> implements InterfaceC1634070scn<V, RESP> {
    public abstract C11NZ<RESP> LJ();

    @Override // X.InterfaceC1634070scn
    public final C11NZ<RESP> request() {
        return request(Unit.LIZ);
    }

    @Override // X.C11T3, X.C11T4
    public final /* bridge */ /* synthetic */ Unit convertKeyActual(Unit unit) {
        return Unit.LIZ;
    }

    @Override // X.C11T3
    public final C11NZ requestActual(Unit unit) {
        return LJ();
    }
}
