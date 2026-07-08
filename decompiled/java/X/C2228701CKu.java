package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228701CKu extends Message.Builder<C2228681CKs, C2228701CKu> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228681CKs build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C2228681CKs(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "link_mic_id", this.LJ, "message");
        throw null;
    }
}
