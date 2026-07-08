package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CgI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236561CgI extends Message.Builder<C2236541CgG, C2236561CgI> {
    public Long LIZLLL;
    public Boolean LJ;
    public EnumC2231991CXl LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236541CgG build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null) {
            return new C2236541CgG(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "effective_seconds", this.LJ, "notice_confirmed", this.LJFF, "permit_type");
        throw null;
    }
}
