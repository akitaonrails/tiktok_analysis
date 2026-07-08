package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oLQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469540oLQ extends C1469530oLP<InterfaceC989230bqj<Float>> implements InterfaceC989230bqj<Float> {
    @Override // X.InterfaceC989230bqj
    public final void accept(Float f) {
        for (Object obj : (CopyOnWriteArrayList) this.LL) {
            if (obj != null) {
                ((InterfaceC989230bqj) obj).accept(f);
            }
        }
    }
}
