package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226661CCy extends Message.Builder<C2226641CCw, C2226661CCy> {
    public String LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2226641CCw build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C2226641CCw(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "layout_key", this.LJ, "callback");
        throw null;
    }
}
