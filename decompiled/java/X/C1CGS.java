package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CGS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CGS extends Message.Builder<C1CGQ, C1CGS> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CGQ build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C1CGQ(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "biz_session_id");
        throw null;
    }
}
