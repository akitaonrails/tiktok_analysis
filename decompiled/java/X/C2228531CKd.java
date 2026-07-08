package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228531CKd extends Message.Builder<C2228511CKb, C2228531CKd> {
    public Boolean LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228511CKb build() {
        Boolean bool = this.LIZLLL;
        if (bool != null && this.LJ != null) {
            return new C2228511CKb(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "audio_occupied", this.LJ, "link_mic_id");
        throw null;
    }
}
