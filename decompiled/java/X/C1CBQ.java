package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CBQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CBQ extends Message.Builder<C1CBO, C1CBQ> {
    public String LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CBO build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C1CBO(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "message_method", this.LJ, "message_handler");
        throw null;
    }
}
