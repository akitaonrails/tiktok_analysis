package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CbZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233631CbZ extends Message.Builder<C2233611CbX, C2233631CbZ> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233611CbX build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C2233611CbX(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "biz_source", this.LJ, "biz_source_id");
        throw null;
    }
}
