package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CD1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CD1 extends Message.Builder<C2226671CCz, C1CD1> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2226671CCz build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C2226671CCz(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "layout_key");
        throw null;
    }
}
