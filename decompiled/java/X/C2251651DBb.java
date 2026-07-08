package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DBb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251651DBb extends Message.Builder<C2251641DBa, C2251651DBb> {
    public Double LIZLLL;
    public Double LJ;
    public Double LJFF;
    public Double LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2251641DBa build() {
        return new C2251641DBa(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
