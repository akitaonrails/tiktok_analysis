package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CL9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CL9 extends Message.Builder<C1CL7, C1CL9> {
    public String LIZLLL;
    public C1CLA LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CL7 build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C1CL7(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "stream_id", this.LJ, "config");
        throw null;
    }
}
