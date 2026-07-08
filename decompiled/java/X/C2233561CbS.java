package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233561CbS extends Message.Builder<C2233531CbP, C2233561CbS> {
    public C2233611CbX LIZLLL;
    public C2233581CbU LJ;
    public List<C2233171Cap> LJFF = C1516540pZE.LJIIIIZZ();
    public List<C1CW4> LJI = C1516540pZE.LJIIIIZZ();
    public Long LJII;
    public Long LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233531CbP build() {
        C2233611CbX c2233611CbX = this.LIZLLL;
        if (c2233611CbX != null && this.LJ != null && this.LJII != null && this.LJIIIIZZ != null) {
            return new C2233531CbP(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2233611CbX, "biz_source", this.LJ, "layout", this.LJII, "version", this.LJIIIIZZ, "group_channel_id");
        throw null;
    }
}
