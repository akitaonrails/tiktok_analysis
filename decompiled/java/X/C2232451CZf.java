package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232451CZf extends Message.Builder<C2232401CZa, C2232451CZf> {
    public C1CXS LIZLLL;
    public C2232861CaK LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2232401CZa build() {
        C1CXS c1cxs = this.LIZLLL;
        if (c1cxs != null && this.LJ != null) {
            return new C2232401CZa(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cxs, "state", this.LJ, "rtc_state");
        throw null;
    }
}
