package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241031CnV extends Message.Builder<C2241041CnW, C2241031CnV> {
    public Long LIZLLL;
    public C0NZT LJ;
    public C2243941CsC LJFF;
    public C1CH0 LJI;
    public C2241571CoN LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2241041CnW build() {
        return new C2241041CnW(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
