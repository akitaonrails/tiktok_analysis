package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CD7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CD7 extends Message.Builder<C1CD5, C1CD7> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CD5 build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1CD5(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "content_type");
        throw null;
    }
}
