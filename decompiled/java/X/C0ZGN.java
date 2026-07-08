package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0ZGN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZGN extends Message.Builder<C0ZGR, C0ZGN> {
    public EnumC2244491Ct5 LIZLLL;
    public String LJ;
    public Long LJFF;
    public Long LJI;
    public C2243521CrW LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C0ZGR build() {
        return new C0ZGR(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
