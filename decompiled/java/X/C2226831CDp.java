package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CDp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226831CDp extends Message.Builder<C2226811CDn, C2226831CDp> {
    public Boolean LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2226811CDn build() {
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            return new C2226811CDn(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "mute");
        throw null;
    }
}
