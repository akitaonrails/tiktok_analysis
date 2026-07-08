package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DCX, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCX extends Message.Builder<C1DCW, C1DCX> {
    public Boolean LIZLLL;
    public Boolean LJ;
    public Boolean LJFF;
    public Boolean LJI;
    public Boolean LJII;
    public Boolean LJIIIIZZ;
    public Boolean LJIIIZ;
    public Long LJIIJ;
    public Long LJIIJJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1DCW build() {
        return new C1DCW(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
    }
}
