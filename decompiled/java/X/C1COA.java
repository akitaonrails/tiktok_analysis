package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1COA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1COA extends Message.Builder<C1CO9, C1COA> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CO9 build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C1CO9(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "content_link_mic_id");
        throw null;
    }
}
