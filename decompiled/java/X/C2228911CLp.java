package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228911CLp extends Message.Builder<C2228891CLn, C2228911CLp> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228891CLn build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C2228891CLn(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "config_id");
        throw null;
    }
}
