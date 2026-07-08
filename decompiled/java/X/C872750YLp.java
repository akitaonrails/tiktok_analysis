package X;

import com.bytedance.im.core.proto.ReferenceInfo;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872750YLp extends Message.Builder<ReferenceInfo, C872750YLp> {
    public Long LIZLLL;
    public String LJ;
    public Long LJFF;
    public C0YUT LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public Long LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ReferenceInfo build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new ReferenceInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "referenced_message_id", this.LJ, "hint", this.LJFF, "ref_message_type", this.LJI, "referenced_message_status");
        throw null;
    }
}
