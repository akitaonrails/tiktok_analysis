package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227311CFl extends Message.Builder<C2227291CFj, C2227311CFl> {
    public Long LIZLLL;
    public C2232021CXo LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2227291CFj build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C2227291CFj(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "group_channel_id", this.LJ, "joiner");
        throw null;
    }
}
