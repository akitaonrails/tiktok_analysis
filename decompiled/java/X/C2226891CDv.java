package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226891CDv extends Message.Builder<C2226871CDt, C2226891CDv> {
    public Integer LIZLLL;
    public String LJ;
    public C2272721DxW LJFF;
    public Boolean LJI;
    public Long LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2226871CDt build() {
        Integer num = this.LIZLLL;
        if (num != null) {
            return new C2226871CDt(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(num, "status_code");
        throw null;
    }
}
