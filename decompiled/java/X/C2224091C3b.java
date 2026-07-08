package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C3b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224091C3b extends Message.Builder<C1C3Z, C2224091C3b> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C3Z build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1C3Z(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "runnable");
        throw null;
    }
}
