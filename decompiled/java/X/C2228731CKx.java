package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CKx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228731CKx extends Message.Builder<C2228711CKv, C2228731CKx> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228711CKv build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C2228711CKv(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "cdid", this.LJ, "config");
        throw null;
    }
}
