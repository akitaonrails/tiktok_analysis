package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Ca1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232671Ca1 extends Message.Builder<C2232631CZx, C2232671Ca1> {
    public C1CZJ LIZLLL;
    public C1CZJ LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2232631CZx build() {
        C1CZJ c1czj = this.LIZLLL;
        if (c1czj != null && this.LJ != null) {
            return new C2232631CZx(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c1czj, "old_window_info", this.LJ, "new_window_info");
        throw null;
    }
}
