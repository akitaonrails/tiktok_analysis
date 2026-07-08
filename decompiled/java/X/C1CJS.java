package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CJS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJS extends Message.Builder<C1CJR, C1CJS> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CJR build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1CJR(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "avatar_id");
        throw null;
    }
}
