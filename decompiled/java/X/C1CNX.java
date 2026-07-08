package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CNX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CNX extends Message.Builder<C1CNW, C1CNX> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CNW build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C1CNW(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "source");
        throw null;
    }
}
