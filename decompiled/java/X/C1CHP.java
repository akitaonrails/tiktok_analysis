package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CHP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CHP extends Message.Builder<C1CHN, C1CHP> {
    public List<C2232021CXo> LIZLLL = C1516540pZE.LJIIIIZZ();
    public C2232021CXo LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CHN build() {
        C2232021CXo c2232021CXo = this.LJ;
        if (c2232021CXo != null && this.LJFF != null) {
            return new C1CHN(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232021CXo, "operator_user", this.LJFF, "group_channel_id");
        throw null;
    }
}
