package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CJf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228291CJf extends Message.Builder<C2228271CJd, C2228291CJf> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228271CJd build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C2228271CJd(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "parent", this.LJ, "child");
        throw null;
    }
}
