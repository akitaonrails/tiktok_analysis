package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CBN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CBN extends Message.Builder<C1CBL, C1CBN> {
    public String LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CBL build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C1CBL(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "link_mic_id", this.LJ, "rtc_view_id");
        throw null;
    }
}
