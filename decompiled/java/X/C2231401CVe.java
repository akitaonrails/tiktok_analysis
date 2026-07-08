package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231401CVe extends Message.Builder<C2231381CVc, C2231401CVe> {
    public C2231851CWx LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2231381CVc build() {
        C2231851CWx c2231851CWx = this.LIZLLL;
        if (c2231851CWx != null) {
            return new C2231381CVc(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2231851CWx, "link_state_change_context");
        throw null;
    }
}
