package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CLd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228791CLd extends Message.Builder<C2228771CLb, C2228791CLd> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228771CLb build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C2228771CLb(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "stream_id");
        throw null;
    }
}
