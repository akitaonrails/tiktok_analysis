package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CaY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233001CaY extends Message.Builder<C2232981CaW, C2233001CaY> {
    public C2232021CXo LIZLLL;
    public C2232021CXo LJ;
    public C2232021CXo LJFF;
    public Boolean LJI;
    public Long LJII;
    public String LJIIIIZZ;
    public Boolean LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2232981CaW build() {
        C2232021CXo c2232021CXo = this.LIZLLL;
        if (c2232021CXo != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null) {
            return new C2232981CaW(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232021CXo, "applier", this.LJ, "permiter", this.LJFF, "operator_p", this.LJI, "is_agree", this.LJII, "scene_version", this.LJIIIIZZ, "layout_id", this.LJIIIZ, "is_moderator_handle");
        throw null;
    }
}
