package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CAD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CAD extends Message.Builder<C1CAB, C1CAD> {
    public C1CA6 LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CAB build() {
        return new C1CAB(this.LIZLLL, buildUnknownFields());
    }
}
