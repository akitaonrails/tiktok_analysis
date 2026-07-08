package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C6B, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C6B extends Message.Builder<C1C69, C1C6B> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C69 build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1C69(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "b_frame_mode");
        throw null;
    }
}
