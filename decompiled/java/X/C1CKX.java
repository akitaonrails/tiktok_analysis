package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CKX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CKX extends Message.Builder<C1CKV, C1CKX> {
    public Long LIZLLL;
    public String LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CKV build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null) {
            return new C1CKV(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "uid", this.LJ, "link_mic_id", this.LJFF, "leave_reason");
        throw null;
    }
}
