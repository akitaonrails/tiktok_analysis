package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CBK, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CBK extends Message.Builder<C1CBI, C1CBK> {
    public String LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CBI build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C1CBI(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "link_mic_id", this.LJ, "rtc_view");
        throw null;
    }
}
