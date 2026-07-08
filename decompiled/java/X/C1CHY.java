package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CHY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CHY extends Message.Builder<C1CHW, C1CHY> {
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CHW build() {
        Long l = this.LJFF;
        if (l != null) {
            return new C1CHW(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "layout_layer");
        throw null;
    }
}
