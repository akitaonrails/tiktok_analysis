package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241071CnZ extends Message.Builder<C2241091Cnb, C2241071CnZ> {
    public String LIZLLL;
    public Long LJ;
    public List<Long> LJFF = C1516540pZE.LJIIIIZZ();
    public EnumC2241111Cnd LJI;
    public C2243941CsC LJII;
    public C1CH0 LJIIIIZZ;
    public C2241571CoN LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2241091Cnb build() {
        return new C2241091Cnb(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
    }
}
