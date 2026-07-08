package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C65, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C65 extends Message.Builder<C1C63, C1C65> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C63 build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1C63(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "invitee_uid");
        throw null;
    }
}
