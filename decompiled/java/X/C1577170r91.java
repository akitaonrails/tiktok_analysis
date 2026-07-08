package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0r91, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577170r91 extends Message.Builder<C1577150r8z, C1577170r91> {
    public Long LIZLLL;
    public C1577080r8s LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1577150r8z build() {
        return new C1577150r8z(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
