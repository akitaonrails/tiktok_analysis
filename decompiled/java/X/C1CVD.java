package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CVD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CVD extends Message.Builder<C1CVC, C1CVD> {
    public C1CXN LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CVC build() {
        C1CXN c1cxn = this.LIZLLL;
        if (c1cxn != null && this.LJ != null) {
            return new C1CVC(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cxn, "network_quality", this.LJ, "link_mic_id");
        throw null;
    }
}
