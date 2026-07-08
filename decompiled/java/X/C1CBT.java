package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CBT, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CBT extends Message.Builder<C1CBR, C1CBT> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CBR build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C1CBR(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "message_method");
        throw null;
    }
}
