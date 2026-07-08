package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C9X, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C9X extends Message.Builder<C1C9V, C1C9X> {
    public Double LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C9V build() {
        Double d = this.LIZLLL;
        if (d != null) {
            return new C1C9V(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(d, "duration");
        throw null;
    }
}
