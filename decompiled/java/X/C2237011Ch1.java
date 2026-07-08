package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Ch1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237011Ch1 extends Message.Builder<C2236991Cgz, C2237011Ch1> {
    public C2236961Cgw LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236991Cgz build() {
        C2236961Cgw c2236961Cgw = this.LIZLLL;
        if (c2236961Cgw != null) {
            return new C2236991Cgz(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2236961Cgw, "log_info");
        throw null;
    }
}
