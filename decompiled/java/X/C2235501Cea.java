package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235501Cea extends Message.Builder<C2235481CeY, C2235501Cea> {
    public String LIZLLL;
    public Boolean LJ;
    public Boolean LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2235481CeY build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new C2235481CeY(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "token", this.LJ, "push_data", this.LJFF, "mix_stream");
        throw null;
    }
}
