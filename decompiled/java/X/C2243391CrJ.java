package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243391CrJ extends Message.Builder<C2243301CrA, C2243391CrJ> {
    public C2243361CrG LIZLLL;
    public C2243331CrD LJ;
    public C2244101CsS LJFF;
    public List<C2243341CrE> LJI = C1516540pZE.LJIIIIZZ();
    public C2244321Cso LJII;
    public C1CH0 LJIIIIZZ;
    public C2241571CoN LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2243301CrA build() {
        return new C2243301CrA(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
    }
}
