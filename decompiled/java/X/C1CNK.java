package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CNK, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CNK extends Message.Builder<C1CNI, C1CNK> {
    public Long LIZLLL;
    public Double LJ;
    public Integer LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CNI build() {
        return new C1CNI(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
