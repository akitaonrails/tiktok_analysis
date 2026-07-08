package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cf5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235811Cf5 extends Message.Builder<C2235791Cf3, C2235811Cf5> {
    public String LIZLLL;
    public C2232021CXo LJ;
    public Long LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2235791Cf3 build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C2235791Cf3(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJ, "target", this.LJFF, "group_channel_id", this.LJI, "source");
        throw null;
    }
}
