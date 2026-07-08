package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CfH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235931CfH extends Message.Builder<C2235911CfF, C2235931CfH> {
    public String LIZLLL;
    public C2232021CXo LJ;
    public Long LJFF;
    public C2236031CfR LJI;
    public String LJII;
    public List<C1C4J> LJIIIIZZ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2235911CfF build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null) {
            return new C2235911CfF(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJ, "target", this.LJFF, "group_channel_id", this.LJI, "biz_param", this.LJII, "source");
        throw null;
    }
}
