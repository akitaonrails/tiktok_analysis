package X;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: X.137Y, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C137Y<K, V> extends AnonymousClass1376<K, V, C137V<K, V>, C137Y<K, V>> {
    public final ReferenceQueue<K> LLIZLLLIL;
    public final ReferenceQueue<V> LLJ;

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
        LIZIZ(this.LLJ);
    }

    public C137Y(AnonymousClass1375 anonymousClass1375, int i) {
        super(anonymousClass1375, i);
        this.LLIZLLLIL = new ReferenceQueue<>();
        this.LLJ = new ReferenceQueue<>();
    }
}
