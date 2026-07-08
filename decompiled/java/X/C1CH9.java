package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CH9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CH9 extends Message.Builder<C1CH7, C1CH9> {
    public Long LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CH7 build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C1CH7(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "container", this.LJ, "source");
        throw null;
    }
}
