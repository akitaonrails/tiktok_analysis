package X;

import Y.AfS198S0100000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11T3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11T3<K, V, REQ, RESP> implements C11T4<K, V, REQ, RESP> {
    public final C01GW dataSource$delegate = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1131));

    @Override // X.C11T4
    public abstract K convertKeyActual(REQ req);

    @Override // X.C11T4
    public abstract V convertValActual(REQ req, RESP resp);

    public abstract C11NZ<RESP> requestActual(REQ req);

    public final InterfaceC19505211Sw<K, V> getDataSource$model_release() {
        return (InterfaceC19505211Sw) this.dataSource$delegate.getValue();
    }

    @Override // X.C11T4
    public final C11NZ<RESP> request(REQ req) {
        return requestActual(req).LJJIJIIJIL(new AfS198S0100000_29(new AwS395S0200000_29(this, (C11T4<int, V, REQ, RESP>) req, 117), 71));
    }
}
