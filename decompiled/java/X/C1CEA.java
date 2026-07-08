package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CEA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CEA extends Message.Builder<C1CE8, C1CEA> {
    public C1CE6 LIZLLL;
    public C1CE3 LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CE8 build() {
        return new C1CE8(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
