package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cnr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241251Cnr extends Message.Builder<C2241191Cnl, C2241251Cnr> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public Boolean LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2241191Cnl build() {
        return new C2241191Cnl(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
    }
}
