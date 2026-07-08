package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Csa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244181Csa extends Message.Builder<C2244101CsS, C2244181Csa> {
    public String LIZLLL;
    public EnumC2244241Csg LJ;
    public C2244091CsR LJFF;
    public String LJI;
    public C2244321Cso LJII;
    public C2244161CsY LJIIIIZZ;
    public List<C2244141CsW> LJIIIZ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2244101CsS build() {
        return new C2244101CsS(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
    }
}
