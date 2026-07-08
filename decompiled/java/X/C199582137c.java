package X;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: X.137c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199582137c<K, V> extends AnonymousClass1376<K, V, C137W<K, V>, C199582137c<K, V>> {
    public final ReferenceQueue<V> LLIZLLLIL;

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
        LIZIZ(this.LLIZLLLIL);
    }

    public C199582137c(AnonymousClass1375 anonymousClass1375, int i) {
        super(anonymousClass1375, i);
        this.LLIZLLLIL = new ReferenceQueue<>();
    }
}
