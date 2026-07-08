package X;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: X.137f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199585137f<K> extends AnonymousClass1376<K, EnumC199592137m, C199586137g<K>, C199585137f<K>> {
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

    public C199585137f(AnonymousClass1375 anonymousClass1375, int i) {
        super(anonymousClass1375, i);
        this.LLIZLLLIL = new ReferenceQueue<>();
    }
}
