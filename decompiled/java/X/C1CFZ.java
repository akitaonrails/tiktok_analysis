package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CFZ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CFZ extends Message.Builder<C1CFY, C1CFZ> {
    public C2232021CXo LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CFY build() {
        C2232021CXo c2232021CXo = this.LIZLLL;
        if (c2232021CXo != null) {
            return new C1CFY(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232021CXo, "applier");
        throw null;
    }
}
