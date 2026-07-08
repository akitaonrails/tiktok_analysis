package X;

import com.squareup.wire.Message;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241891Cot extends Message.Builder<C2241911Cov, C2241891Cot> {
    public C2243521CrW LIZLLL;
    public List<C2244321Cso> LJ = C1516540pZE.LJIIIIZZ();
    public C2243941CsC LJFF;
    public C2242211CpP LJI;
    public ByteString LJII;
    public C1CH0 LJIIIIZZ;
    public C2241571CoN LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2241911Cov build() {
        return new C2241911Cov(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
    }
}
