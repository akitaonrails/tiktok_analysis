package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CST, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CST extends Message.Builder<C1CSU, C1CST> {
    public Integer LIZLLL;
    public C2226941CEa LJ;
    public C2226941CEa LJFF;
    public String LJI;
    public C1517970pbX LJII;
    public C2223151Bzl LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CSU build() {
        Integer num = this.LIZLLL;
        if (num != null) {
            return new C1CSU(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(num, "status_code");
        throw null;
    }
}
