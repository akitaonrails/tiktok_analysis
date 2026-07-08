package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DBp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251791DBp extends Message.Builder<C2251781DBo, C2251791DBp> {
    public Integer LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2251781DBo build() {
        return new C2251781DBo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
