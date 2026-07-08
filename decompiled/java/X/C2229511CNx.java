package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CNx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229511CNx extends Message.Builder<C2229501CNw, C2229511CNx> {
    public C2229461CNs LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229501CNw build() {
        C2229461CNs c2229461CNs = this.LIZLLL;
        if (c2229461CNs != null) {
            return new C2229501CNw(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2229461CNs, "im_model");
        throw null;
    }
}
