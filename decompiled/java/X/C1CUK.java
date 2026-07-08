package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CUK, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CUK extends Message.Builder<C1CUI, C1CUK> {
    public C1CUL LIZLLL;
    public C1CUQ LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CUI build() {
        C1CUL c1cul = this.LIZLLL;
        if (c1cul != null && this.LJ != null) {
            return new C1CUI(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cul, "anchor_new_layout", this.LJ, "anchor_new_fix_mic_num");
        throw null;
    }
}
