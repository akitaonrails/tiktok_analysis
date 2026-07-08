package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225791C9p extends Message.Builder<C2225771C9n, C2225791C9p> {
    public C2225731C9j LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2225771C9n build() {
        C2225731C9j c2225731C9j = this.LIZLLL;
        if (c2225731C9j != null && this.LJ != null) {
            return new C2225771C9n(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2225731C9j, "task", this.LJ, "callback");
        throw null;
    }
}
