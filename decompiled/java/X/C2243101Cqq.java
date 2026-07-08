package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Cqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243101Cqq extends Message.Builder<C2243041Cqk, C2243101Cqq> {
    public C2243061Cqm LIZLLL;
    public List<C2244101CsS> LJ = C1516540pZE.LJIIIIZZ();
    public C2244321Cso LJFF;
    public C2243941CsC LJI;
    public C1CH0 LJII;
    public C2241571CoN LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2243041Cqk build() {
        return new C2243041Cqk(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
