package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CFi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227281CFi extends Message.Builder<C2227261CFg, C2227281CFi> {
    public C2232021CXo LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2227261CFg build() {
        C2232021CXo c2232021CXo = this.LIZLLL;
        if (c2232021CXo != null) {
            return new C2227261CFg(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232021CXo, "joiner");
        throw null;
    }
}
