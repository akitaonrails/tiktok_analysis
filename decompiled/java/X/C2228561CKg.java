package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228561CKg extends Message.Builder<C2228541CKe, C2228561CKg> {
    public String LIZLLL;
    public Boolean LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228541CKe build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C2228541CKe(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "stream_id", this.LJ, "mute");
        throw null;
    }
}
