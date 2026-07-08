package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CGP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CGP extends Message.Builder<C1CGO, C1CGP> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CGO build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C1CGO(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "json");
        throw null;
    }
}
