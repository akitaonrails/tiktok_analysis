package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CgU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236681CgU extends Message.Builder<C2236661CgS, C2236681CgU> {
    public String LIZLLL;
    public Boolean LJ;
    public C2236691CgV LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236661CgS build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new C2236661CgS(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJ, "is_accept", this.LJFF, "biz_params");
        throw null;
    }
}
