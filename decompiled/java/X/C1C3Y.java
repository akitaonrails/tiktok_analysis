package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C3Y, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C3Y extends Message.Builder<C1C3W, C1C3Y> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C3W build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1C3W(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "runnable");
        throw null;
    }
}
