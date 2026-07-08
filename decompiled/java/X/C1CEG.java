package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CEG, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CEG extends Message.Builder<C1CEF, C1CEG> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CEF build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1CEF(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "mic_position");
        throw null;
    }
}
