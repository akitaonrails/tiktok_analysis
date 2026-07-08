package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1D0S, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1D0S extends Message.Builder<C1D0R, C1D0S> {
    public Boolean LIZLLL;
    public Boolean LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1D0R build() {
        return new C1D0R(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
