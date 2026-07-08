package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.11T4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public interface C11T4<K, V, REQ, RESP> extends InterfaceC1305030k45<Pair<? extends K, ? extends V>> {
    K convertKeyActual(REQ req);

    V convertValActual(REQ req, RESP resp);

    C11NZ<RESP> request(REQ req);
}
