package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C39, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C39 extends Message.Builder<C1C37, C1C39> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C37 build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1C37(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "ret");
        throw null;
    }
}
