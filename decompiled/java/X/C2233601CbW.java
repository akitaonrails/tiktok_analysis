package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CbW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233601CbW extends Message.Builder<C2233581CbU, C2233601CbW> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233581CbU build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C2233581CbU(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "layout_id", this.LJ, "layout_key");
        throw null;
    }
}
