package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CHS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CHS extends Message.Builder<C1CHQ, C1CHS> {
    public List<C2232021CXo> LIZLLL = C1516540pZE.LJIIIIZZ();
    public C2232021CXo LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CHQ build() {
        C2232021CXo c2232021CXo = this.LJ;
        if (c2232021CXo != null && this.LJFF != null) {
            return new C1CHQ(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232021CXo, "operator_user", this.LJFF, "group_channel_id");
        throw null;
    }
}
