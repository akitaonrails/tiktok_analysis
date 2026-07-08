package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CFo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227341CFo extends Message.Builder<C2227321CFm, C2227341CFo> {
    public Long LIZLLL;
    public C2232021CXo LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2227321CFm build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C2227321CFm(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "group_channel_id", this.LJ, "joiner");
        throw null;
    }
}
