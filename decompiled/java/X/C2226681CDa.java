package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226681CDa extends Message.Builder<C1CDY, C2226681CDa> {
    public Boolean LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CDY build() {
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            return new C1CDY(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "enable");
        throw null;
    }
}
