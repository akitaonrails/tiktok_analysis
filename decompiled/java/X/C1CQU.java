package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CQU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQU extends Message.Builder<C1CQS, C1CQU> {
    public String LIZLLL;
    public String LJ;
    public Long LJFF;
    public Long LJI;
    public String LJII;
    public String LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CQS build() {
        String str = this.LIZLLL;
        if (str != null && this.LJFF != null && this.LJI != null) {
            return new C1CQS(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "state_name", this.LJFF, "version", this.LJI, "min_app_version");
        throw null;
    }
}
