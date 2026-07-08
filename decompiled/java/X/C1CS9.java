package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CS9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CS9 extends Message.Builder<C1CS7, C1CS9> {
    public C2232721Ca6 LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CS7 build() {
        C2232721Ca6 c2232721Ca6 = this.LIZLLL;
        if (c2232721Ca6 != null) {
            return new C1CS7(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232721Ca6, "ret");
        throw null;
    }
}
