package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CVP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CVP extends Message.Builder<C1CVN, C1CVP> {
    public C1CVQ LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CVN build() {
        C1CVQ c1cvq = this.LIZLLL;
        if (c1cvq != null) {
            return new C1CVN(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cvq, "layout_context");
        throw null;
    }
}
