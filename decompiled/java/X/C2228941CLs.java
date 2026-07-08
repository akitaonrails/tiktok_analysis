package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CLs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228941CLs extends Message.Builder<C2228921CLq, C2228941CLs> {
    public C1CMV LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228921CLq build() {
        C1CMV c1cmv = this.LIZLLL;
        if (c1cmv != null) {
            return new C2228921CLq(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cmv, "ret");
        throw null;
    }
}
