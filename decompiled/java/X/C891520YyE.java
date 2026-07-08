package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YyE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891520YyE extends Message.Builder<C891500YyC, C891520YyE> {
    public C1CE8 LIZLLL;
    public C892000Yz0 LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C891500YyC build() {
        return new C891500YyC(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
