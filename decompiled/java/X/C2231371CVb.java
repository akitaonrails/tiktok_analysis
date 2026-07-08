package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231371CVb extends Message.Builder<C1CVZ, C2231371CVb> {
    public C2231581CVw LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CVZ build() {
        C2231581CVw c2231581CVw = this.LIZLLL;
        if (c2231581CVw != null) {
            return new C1CVZ(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2231581CVw, "core_properties");
        throw null;
    }
}
