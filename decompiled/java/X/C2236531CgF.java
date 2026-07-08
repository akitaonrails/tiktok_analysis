package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CgF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236531CgF extends Message.Builder<C2236511CgD, C2236531CgF> {
    public String LIZLLL;
    public C2232021CXo LJ;
    public EnumC2231981CXk LJFF;
    public Long LJI;
    public String LJII;
    public C2236541CgG LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236511CgD build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null) {
            return new C2236511CgD(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJ, "applier", this.LJFF, "reply_type", this.LJI, "scene_version", this.LJII, "layout_id");
        throw null;
    }
}
