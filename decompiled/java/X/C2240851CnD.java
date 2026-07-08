package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240851CnD extends Message.Builder<C2240841CnC, C2240851CnD> {
    public List<C2240741Cn2> LIZLLL = C1516540pZE.LJIIIIZZ();
    public EnumC2240801Cn8 LJ;
    public String LJFF;
    public C2242211CpP LJI;
    public C2243941CsC LJII;
    public C1CH0 LJIIIIZZ;
    public C2241571CoN LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2240841CnC build() {
        return new C2240841CnC(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
    }
}
