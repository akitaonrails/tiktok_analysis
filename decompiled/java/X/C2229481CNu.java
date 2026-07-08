package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229481CNu extends Message.Builder<C2229461CNs, C2229481CNu> {
    public C2232021CXo LIZLLL;
    public Long LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229461CNs build() {
        C2232021CXo c2232021CXo = this.LIZLLL;
        if (c2232021CXo != null && this.LJ != null && this.LJFF != null) {
            return new C2229461CNs(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232021CXo, "operator_user", this.LJ, "group_channel_id", this.LJFF, "leave_source");
        throw null;
    }
}
