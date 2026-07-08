package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233121Cak extends Message.Builder<C2233101Cai, C2233121Cak> {
    public String LIZLLL;
    public C1CXY LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233101Cai build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new C2233101Cai(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "key", this.LJ, "k_type", this.LJFF, "default_value");
        throw null;
    }
}
