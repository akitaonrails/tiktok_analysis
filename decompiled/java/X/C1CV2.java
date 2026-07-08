package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CV2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CV2 extends Message.Builder<C1CV0, C1CV2> {
    public C2231691CWh LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CV0 build() {
        C2231691CWh c2231691CWh = this.LIZLLL;
        if (c2231691CWh != null) {
            return new C1CV0(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2231691CWh, "im_model");
        throw null;
    }
}
