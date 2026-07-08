package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CAA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CAA extends Message.Builder<C1CA9, C1CAA> {
    public C1CA6 LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CA9 build() {
        return new C1CA9(this.LIZLLL, buildUnknownFields());
    }
}
