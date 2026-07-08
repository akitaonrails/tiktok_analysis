package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0ZfV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905390ZfV extends Message.Builder<C905410ZfX, C905390ZfV> {
    public Boolean LIZLLL;
    public Boolean LJ;
    public Boolean LJFF;
    public Boolean LJI;
    public Boolean LJII;
    public Boolean LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C905410ZfX build() {
        return new C905410ZfX(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
