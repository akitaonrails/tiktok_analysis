package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1D9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251361D9y extends Message.Builder<C2251371D9z, C2251361D9y> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2251371D9z build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C2251371D9z(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "signal_name", this.LJ, "signal_value");
        throw null;
    }
}
