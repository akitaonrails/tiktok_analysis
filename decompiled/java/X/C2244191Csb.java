package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Csb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244191Csb extends Message.Builder<C2244091CsR, C2244191Csb> {
    public String LIZLLL;
    public List<String> LJ = C1516540pZE.LJIIIIZZ();
    public String LJFF;
    public C2244161CsY LJI;
    public String LJII;
    public EnumC2244051CsN LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2244091CsR build() {
        return new C2244091CsR(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
