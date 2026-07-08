package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CCe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226461CCe extends Message.Builder<C2226441CCc, C2226461CCe> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2226441CCc build() {
        return new C2226441CCc(this.LIZLLL, buildUnknownFields());
    }
}
