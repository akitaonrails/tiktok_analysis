package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Zgn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906190Zgn extends Message.Builder<C906290Zgx, C906190Zgn> {
    public String LIZLLL;
    public EnumC906630ZhV LJ;
    public EnumC906560ZhO LJFF;
    public C906380Zh6 LJI;
    public EnumC906310Zgz LJII;
    public C906450ZhD LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C906290Zgx build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null) {
            return new C906290Zgx(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "block_id", this.LJ, "reply_type", this.LJFF, "type", this.LJI, "content", this.LJII, "action");
        throw null;
    }
}
