package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DBe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251681DBe extends Message.Builder<C2251671DBd, C2251681DBe> {
    public Integer LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public Integer LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2251671DBd build() {
        return new C2251671DBd(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
