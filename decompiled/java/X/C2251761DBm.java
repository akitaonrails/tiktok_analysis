package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DBm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251761DBm extends Message.Builder<C2251751DBl, C2251761DBm> {
    public Boolean LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public Boolean LJI;
    public String LJII;
    public Boolean LJIIIIZZ;
    public Long LJIIIZ;
    public Boolean LJIIJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2251751DBl build() {
        return new C2251751DBl(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
    }
}
