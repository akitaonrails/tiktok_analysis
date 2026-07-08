package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0pZG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516560pZG extends Message.Builder<C1516580pZI, C1516560pZG> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1516580pZI build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C1516580pZI(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "key", this.LJ, "value");
        throw null;
    }
}
