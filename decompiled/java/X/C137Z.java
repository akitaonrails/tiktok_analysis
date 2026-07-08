package X;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: X.137Z, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C137Z<K, V> extends AnonymousClass1376<K, V, C199584137e<K, V>, C137Z<K, V>> {
    public final ReferenceQueue<K> LLIZLLLIL;

    @Override // X.AnonymousClass1376
    public final AnonymousClass1376 LJIIJ() {
        return this;
    }

    @Override // X.AnonymousClass1376
    public final void LJ() {
        while (this.LLIZLLLIL.poll() != null) {
        }
    }

    @Override // X.AnonymousClass1376
    public final void LJFF() {
        LIZ(this.LLIZLLLIL);
    }

    public C137Z(AnonymousClass1375 anonymousClass1375, int i) {
        super(anonymousClass1375, i);
        this.LLIZLLLIL = new ReferenceQueue<>();
    }
}
