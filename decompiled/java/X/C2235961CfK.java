package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CfK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235961CfK extends Message.Builder<C2235941CfI, C2235961CfK> {
    public String LIZLLL;
    public C2232021CXo LJ;
    public EnumC2231981CXk LJFF;
    public Long LJI;
    public Boolean LJII;
    public C2236001CfO LJIIIIZZ;
    public String LJIIIZ;
    public List<C1C4J> LJIIJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2235941CfI build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null) {
            return new C2235941CfI(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJ, "joiner", this.LJFF, "reply_type", this.LJI, "group_channel_id", this.LJII, "force", this.LJIIIIZZ, "biz_param", this.LJIIIZ, "source");
        throw null;
    }
}
