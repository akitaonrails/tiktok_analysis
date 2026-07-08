package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228971CLv extends Message.Builder<C2228951CLt, C2228971CLv> {
    public C1CMV LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228951CLt build() {
        C1CMV c1cmv = this.LIZLLL;
        if (c1cmv != null) {
            return new C2228951CLt(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cmv, "error");
        throw null;
    }
}
