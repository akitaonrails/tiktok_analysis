package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226631CCv extends Message.Builder<C2226621CCu, C2226631CCv> {
    public Boolean LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2226621CCu build() {
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            return new C2226621CCu(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "enable_multi_guest_moderator");
        throw null;
    }
}
